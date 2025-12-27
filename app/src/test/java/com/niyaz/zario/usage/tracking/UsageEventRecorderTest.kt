package com.niyaz.zario.usage.tracking

import com.niyaz.zario.usage.ingest.UsageEventBus
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.ScreenStateEvent
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import com.niyaz.zario.usage.storage.UsageRawEventDao
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class UsageEventRecorderTest {

    @Test
    fun `publish buffers events and flushes after debounce window`() = runTest {
        val dao = mockk<UsageRawEventDao>(relaxed = true)
        val bus = UsageEventBus(this)
        val recorder = UsageEventRecorder(bus, dao, this)

        val events = (0 until 3).map { index ->
            screenEvent(epoch = index * 1000L)
        }

        events.forEach { recorder.publish(it) }

        runCurrent()
        coVerify(exactly = 0) { dao.insertAll(any()) }

        advanceTimeBy(750L)
        advanceUntilIdle()

        coVerify(exactly = 1) {
            dao.insertAll(match { it.size == events.size })
        }
    }

    @Test
    fun `publish flushes immediately when buffer threshold reached`() = runTest {
        val dao = mockk<UsageRawEventDao>(relaxed = true)
        val bus = UsageEventBus(this)
        val recorder = UsageEventRecorder(bus, dao, this)

        val events = (0 until 25).map { index ->
            screenEvent(epoch = index * 100L)
        }

        events.forEach { recorder.publish(it) }

        advanceUntilIdle()

        coVerify(exactly = 1) {
            dao.insertAll(match { it.size == events.size })
        }
    }

    private fun screenEvent(epoch: Long): TrackedEvent.ScreenState =
        TrackedEvent.ScreenState(
            epochMillis = epoch,
            confidence = EventConfidence.HIGH,
            state = ScreenStateEvent.SCREEN_ON
        )
}
