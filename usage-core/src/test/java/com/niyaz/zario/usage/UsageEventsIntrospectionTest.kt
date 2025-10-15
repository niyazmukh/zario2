package com.niyaz.zario.usage

import android.app.usage.UsageEvents
import org.junit.Test

class UsageEventsIntrospectionTest {

    @Test
    fun dumpUsageEventConstants() {
        val constants = UsageEvents.Event::class.java.fields
            .filter { java.lang.reflect.Modifier.isStatic(it.modifiers) }
            .mapNotNull { field ->
                val name = field.name
                val value = runCatching { field.getInt(null) }.getOrNull()
                if (value == null) null else name to value
            }
            .sortedBy { it.second }
        constants.forEach { (name, value) ->
            println("UsageEvents.Event.$name = $value")
        }
    }
}