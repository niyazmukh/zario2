package com.niyaz.zario.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import com.niyaz.zario.Constants
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.userSessionDataStore
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.firebase.FirestoreUserGateway
import com.niyaz.zario.firebase.RemoteSyncScheduler
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import io.mockk.coVerify
import io.mockk.verify
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Unit tests for UserSessionRepository flex stakes functionality.
 * 
 * Critical test: Verifies that setFlexibleStakes() updates in-memory state
 * immediately to prevent stale reads by SplashFragment navigation logic.
 * 
 * Bug Context: Users were incorrectly redirected to FlexStakesFragment after
 * clicking notifications because the in-memory StateFlow was not updated when
 * stakes were set, even though DataStore was written correctly.
 */
@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(RobolectricTestRunner::class)
class UserSessionRepositoryFlexStakesTest {

    private val testDispatcher = StandardTestDispatcher()
    private val testScope = TestScope(testDispatcher)
    
    private lateinit var mockContext: Context
    private lateinit var repository: UserSessionRepository
    private lateinit var userGateway: FirestoreUserGateway
    private lateinit var dataStore: DataStore<Preferences>
    private lateinit var applicationScope: CoroutineScope
    private lateinit var remoteSyncDao: RemoteSyncDao
    private lateinit var remoteSyncScheduler: RemoteSyncScheduler

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        mockkStatic("com.niyaz.zario.data.DataStoreExtensionsKt")
        mockContext = mockk(relaxed = true)
        dataStore = InMemoryPreferenceDataStore()
        runBlocking { dataStore.edit { it.clear() } }
        every { mockContext.userSessionDataStore } returns dataStore
        userGateway = mockk(relaxed = true)
        remoteSyncDao = mockk(relaxed = true)
        remoteSyncScheduler = mockk(relaxed = true)
        applicationScope = CoroutineScope(testDispatcher + SupervisorJob())
        repository = UserSessionRepository(
            context = mockContext,
            applicationScope = applicationScope,
            userGateway = userGateway,
            remoteSyncDao = remoteSyncDao,
            remoteSyncScheduler = remoteSyncScheduler
        )
    }

    @After
    fun tearDown() {
        runBlocking {
            dataStore.edit { prefs ->
                prefs.clear()
            }
        }

        applicationScope.cancel()
        testScope.cancel()
        Dispatchers.resetMain()
        unmockkStatic("com.niyaz.zario.data.DataStoreExtensionsKt")
    }

    @Test
    fun `logout clears stored session and remote sync backlog`() = testScope.runTest {
        val user = User(
            email = "test@example.com",
            id = "user-123",
            yearOfBirth = "1990",
            gender = "Other",
            condition = Condition.CONTROL,
            points = 150,
            hasSetFlexibleStakes = true,
            flexibleReward = 10,
            flexiblePenalty = 10
        )

        repository.setLoggedIn(user)

        repository.logout()

        val snapshot = repository.awaitSession()
        assertFalse(snapshot.isLoggedIn)
        assertNull(snapshot.user)

        verify(exactly = 1) { remoteSyncScheduler.cancel() }
        coVerify(exactly = 1) { remoteSyncDao.clearAll() }
    }

    @Test
    fun `setFlexibleStakes updates in-memory state immediately`() = testScope.runTest {
        // Given: FLEXIBLE user without stakes set
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false,
            flexibleReward = Constants.FLEXIBLE_REWARD,
            flexiblePenalty = Constants.FLEXIBLE_PENALTY
        )
        repository.setLoggedIn(user)
        
        // Verify initial state
        var session = repository.session.value
        assertNotNull(session.user)
        assertFalse(session.user!!.hasSetFlexibleStakes)

        // When: User sets flexible stakes
        val reward = 7
        val penalty = 25
        val success = repository.setFlexibleStakes(reward, penalty)

        // Then: Should succeed
        assertTrue("setFlexibleStakes should return true for FLEXIBLE users", success)

        // Then: In-memory state should be updated IMMEDIATELY (not waiting for Flow)
        session = repository.session.value
        assertNotNull("User should still be logged in", session.user)
        assertTrue(
            "hasSetFlexibleStakes should be TRUE immediately after setFlexibleStakes()",
            session.user!!.hasSetFlexibleStakes
        )
        assertEquals(
            "flexibleReward should match the set value",
            reward,
            session.user!!.flexibleReward
        )
        assertEquals(
            "flexiblePenalty should match the set value",
            penalty,
            session.user!!.flexiblePenalty
        )
    }

    @Test
    fun `setFlexibleStakes persists to DataStore`() = testScope.runTest {
        // Given: FLEXIBLE user
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)

        // When: User sets stakes
        repository.setFlexibleStakes(7, 25)

        // Then: DataStore should be updated (simulate app restart)
        advanceUntilIdle()  // Allow DataStore Flow to emit
        
        val persistedSession = repository.awaitSession()
        assertNotNull(persistedSession.user)
        assertTrue(
            "DataStore should persist hasSetFlexibleStakes=true",
            persistedSession.user!!.hasSetFlexibleStakes
        )
        assertEquals(7, persistedSession.user!!.flexibleReward)
        assertEquals(25, persistedSession.user!!.flexiblePenalty)
    }

    @Test
    fun `setFlexibleStakes rejects non-FLEXIBLE users`() = testScope.runTest {
        // Given: CONTROL user (not FLEXIBLE)
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.CONTROL,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)

        // When: Attempt to set stakes
        val success = repository.setFlexibleStakes(7, 25)

        // Then: Should fail
        assertFalse(
            "setFlexibleStakes should return false for non-FLEXIBLE users",
            success
        )
        
        // Then: State should not be modified
        val session = repository.session.value
        assertFalse(session.user!!.hasSetFlexibleStakes)
        assertEquals(Constants.FLEXIBLE_REWARD, session.user!!.flexibleReward)
        assertEquals(Constants.FLEXIBLE_PENALTY, session.user!!.flexiblePenalty)
    }

    @Test
    fun `setFlexibleStakes enforces min-max bounds`() = testScope.runTest {
        // Given: FLEXIBLE user
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)

        // When: Set out-of-bounds values
        repository.setFlexibleStakes(
            reward = -5,  // Below min (0)
            penalty = 100  // Above max (40)
        )

        // Then: Values should be clamped
        val session = repository.session.value
        assertEquals(
            Constants.FLEXIBLE_REWARD_MIN,
            session.user!!.flexibleReward
        )
        assertEquals(
            Constants.FLEXIBLE_PENALTY_MAX,
            session.user!!.flexiblePenalty
        )
    }

    @Test
    fun `hasSetFlexibleStakes returns correct state`() = testScope.runTest {
        // Given: FLEXIBLE user without stakes
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)

        // Then: Should return false initially
        assertFalse(repository.hasSetFlexibleStakes())

        // When: Stakes are set
        repository.setFlexibleStakes(5, 20)

        // Then: Should return true immediately
        assertTrue(
            "hasSetFlexibleStakes() should return true immediately after setting stakes",
            repository.hasSetFlexibleStakes()
        )
    }

    @Test
    fun `SplashFragment navigation scenario - stakes already set`() = testScope.runTest {
        // Given: FLEXIBLE user completes signup and sets stakes
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)
        repository.setFlexibleStakes(7, 25)

        // Simulate: App comes to foreground (notification click)
        // SplashFragment calls awaitSession() to check navigation
        val session = repository.awaitSession()

        // Then: Should see stakes as set (no redirect to FlexStakes)
        assertTrue(
            "SplashFragment should see hasSetFlexibleStakes=true",
            session.user!!.hasSetFlexibleStakes
        )
        assertEquals(Condition.FLEXIBLE, session.user!!.condition)
        
        // Navigation logic should skip FlexStakesFragment
        // and go to Permissions → Target → Intervention
    }

    @Test
    fun `SplashFragment navigation scenario - stakes not set yet`() = testScope.runTest {
        // Given: FLEXIBLE user just signed up
        val user = User(
            email = "test@example.com",
            id = "test-user-id",
            yearOfBirth = "1990",
            gender = "Male",
            condition = Condition.FLEXIBLE,
            hasSetFlexibleStakes = false
        )
        repository.setLoggedIn(user)

        // Simulate: App opens to SplashFragment
        val session = repository.awaitSession()

        // Then: Should see stakes as NOT set (navigate to FlexStakes)
        assertFalse(
            "SplashFragment should see hasSetFlexibleStakes=false",
            session.user!!.hasSetFlexibleStakes
        )
        
        // Navigation logic should route to FlexStakesFragment
    }
}

private class InMemoryPreferenceDataStore : DataStore<Preferences> {
    private val mutex = Mutex()
    private val state = MutableStateFlow<Preferences>(emptyPreferences())

    override val data: Flow<Preferences> = state

    override suspend fun updateData(transform: suspend (Preferences) -> Preferences): Preferences {
        return mutex.withLock {
            val newPrefs = transform(state.value)
            state.value = newPrefs
            newPrefs
        }
    }
}
