package com.niyaz.zario.usage

fun interface UsageEventSource {
    fun load(startMillis: Long, endMillis: Long): List<UsageEvent>
}
