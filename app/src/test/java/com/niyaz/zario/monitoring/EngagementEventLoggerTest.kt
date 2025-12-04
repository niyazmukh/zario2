package com.niyaz.zario.monitoring

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.niyaz.zario.data.Condition
import com.niyaz.zario.data.User
import com.niyaz.zario.data.UserSession
import com.niyaz.zario.data.local.dao.RemoteSyncDao
import com.niyaz.zario.data.local.entities.AppInteractionSource
import com.niyaz.zario.data.local.entities.NotificationCategory
import com.niyaz.zario.data.local.entities.NotificationEventType
import com.niyaz.zario.firebase.RemoteSyncScheduler
import com.niyaz.zario.repository.UserSessionRepository
import io.mockk.MockKAnnotations
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.just
import io.mockk.runs
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
@OptIn(ExperimentalCoroutinesApi::class)
class EngagementEventLoggerTest {

    @MockK(relaxed = true)
    private lateinit var remoteSyncDao: RemoteSyncDao

    @MockK(relaxed = true)
    private lateinit var remoteSyncScheduler: RemoteSyncScheduler

    @MockK
    private lateinit var userSessionRepository: UserSessionRepository

    private lateinit var applicationContext: Context

    private val testDispatcher = UnconfinedTestDispatcher()
    private lateinit var logger: EngagementEventLogger

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        applicationContext = ApplicationProvider.getApplicationContext()
        val sessionFlow = MutableStateFlow(
            UserSession(
                isLoggedIn = true,
                user = User(
                    email = "tester@example.com",
                    id = "tester-id",
                    yearOfBirth = "1990",
                    gender = "other",
                    condition = Condition.CONTROL
                )
            )
        )
        every { userSessionRepository.session } returns sessionFlow
        every { remoteSyncScheduler.scheduleSync() } just runs
        logger = EngagementEventLogger(
            remoteSyncDao = remoteSyncDao,
            remoteSyncScheduler = remoteSyncScheduler,
            userSessionRepository = userSessionRepository,
            context = applicationContext,
            applicationScope = TestScope(testDispatcher)
        )
    }

    @Test
    fun logAppOpen_enqueuesEntityAndSchedulesSync() = runTest(testDispatcher) {
        logger.logAppOpen(AppInteractionSource.FOREGROUND)
        advanceUntilIdle()
        coVerify {
            remoteSyncDao.insertAppInteraction(match { it.source == AppInteractionSource.FOREGROUND })
        }
        verify { remoteSyncScheduler.scheduleSync() }
    }

    @Test
    fun logNotificationEvent_enqueuesEntityAndSchedulesSync() = runTest(testDispatcher) {
        logger.logNotificationEvent(
            eventType = NotificationEventType.SENT,
            category = NotificationCategory.CYCLE_COMPLETION,
            notificationId = 42,
            channelId = "channel",
            metadata = mapOf("foo" to "bar")
        )
        advanceUntilIdle()
        coVerify {
            remoteSyncDao.insertNotificationEvent(match {
                it.eventType == NotificationEventType.SENT &&
                    it.category == NotificationCategory.CYCLE_COMPLETION &&
                    it.notificationId == 42
            })
        }
        verify { remoteSyncScheduler.scheduleSync() }
    }
}
