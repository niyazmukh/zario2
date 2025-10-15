package com.niyaz.zario.usage.tracking

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.view.Display
import com.niyaz.zario.usage.ingest.model.EventConfidence
import com.niyaz.zario.usage.ingest.model.ScreenStateEvent
import com.niyaz.zario.usage.ingest.model.TrackedEvent
import javax.inject.Inject

class ScreenStateReceiver @Inject constructor(
    private val recorder: UsageEventRecorder
) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action ?: return
        val event = when (action) {
            Intent.ACTION_SCREEN_ON -> ScreenStateEvent.SCREEN_ON
            Intent.ACTION_SCREEN_OFF -> ScreenStateEvent.SCREEN_OFF
            Intent.ACTION_USER_PRESENT -> ScreenStateEvent.USER_PRESENT
            else -> return
        }
        recorder.publish(
            TrackedEvent.ScreenState(
                epochMillis = System.currentTimeMillis(),
                confidence = EventConfidence.HIGH,
                state = event
            )
        )
    }
}