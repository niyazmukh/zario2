package com.niyaz.zario.usage.tracking

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ScreenStateTracker @Inject constructor(
    private val receiver: ScreenStateReceiver
) {

    fun register(context: Context) {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_SCREEN_ON)
            addAction(Intent.ACTION_SCREEN_OFF)
            addAction(Intent.ACTION_USER_PRESENT)
        }
        context.registerReceiver(receiver, filter)
    }

    fun unregister(context: Context) {
        runCatching { context.unregisterReceiver(receiver) }
    }
}