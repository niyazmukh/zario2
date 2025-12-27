package com.niyaz.zario.usage

import android.app.usage.UsageEvents
import android.app.usage.UsageStatsManager
import android.os.Build
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import java.lang.reflect.Field
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.UPSIDE_DOWN_CAKE])
class UsageEventLoaderTest {

    @Test
    fun `load returns sorted events and keeps metadata`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.app",
                    taskRootPackage = "com.example.launcher",
                    taskRootClass = "com.example.launcher.MainActivity",
                    instanceId = 42
                ),
                createEvent(
                    timestamp = 500L,
                    type = UsageEventType.MOVE_TO_BACKGROUND,
                    packageName = "com.example.app"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(),
            telemetry = UsageIngestionTelemetry.NO_OP
        )
        val results = loader.load(0L, 4_000L)

        assertEquals(listOf(500L, 1_000L), results.map(UsageEvent::timestampMs))
        val foregroundEvent = results.first { it.timestampMs == 1_000L }
        assertEquals("com.example.app", foregroundEvent.packageName)
        assertEquals(UsageEventType.MOVE_TO_FOREGROUND, foregroundEvent.type)
        assertEquals(42, foregroundEvent.instanceId)
        assertEquals("com.example.launcher", foregroundEvent.taskRootPackageName)
        assertEquals("com.example.launcher.MainActivity", foregroundEvent.taskRootClassName)
    }

    @Test
    fun `load drops events from suppressed task roots`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.app",
                    taskRootPackage = "com.android.systemui",
                    taskRootClass = "com.android.systemui.StatusBar"
                ),
                createEvent(
                    timestamp = 2_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.other"
                )
            )
        }

        val config = UsageAggregationConfig(
            suppressedTaskRootPackages = setOf("com.android.systemui"),
            suppressedTaskRootClassNames = setOf("com.android.systemui.StatusBar")
        )

        val loader = UsageEventLoader(
            usageStatsManager,
            config,
            telemetry = UsageIngestionTelemetry.NO_OP
        )
        val results = loader.load(0L, 4_000L)

        assertEquals(listOf(2_000L), results.map(UsageEvent::timestampMs))
        assertEquals("com.example.other", results.single().packageName)
    }

    @Test
    fun `load uses filtered query on api 34`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        val queries = mutableListOf<Any>()
        val fakeQuery: Any = mockk(relaxed = true)
        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(enableFilteredEventQuery = true),
            sdkIntProvider = { 34 },
            filteredQueryInvoker = { _, query ->
                queries += query
                usageEventsOf(
                    createEvent(
                        timestamp = 1_000L,
                        type = UsageEventType.MOVE_TO_FOREGROUND,
                        packageName = "com.example.app"
                    )
                )
            },
            filteredQueryFactory = { _, _ -> fakeQuery },
            telemetry = UsageIngestionTelemetry.NO_OP
        )

        val results = loader.load(0L, 2_000L)

        assertEquals(1, results.size)
        assertEquals(1, queries.size)
        verify(exactly = 0) { usageStatsManager.queryEvents(any<Long>(), any()) }
    }

    @Test
    @Config(sdk = [Build.VERSION_CODES.Q])
    fun `load uses legacy query before api 34`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        every { usageStatsManager.queryEvents(any<Long>(), any<Long>()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.app"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(enableFilteredEventQuery = true),
            sdkIntProvider = { Build.VERSION_CODES.Q },
            filteredQueryInvoker = { _, _ -> error("filteredQueryInvoker should not run before API 34") },
            filteredQueryFactory = { _, _ -> error("filteredQueryFactory should not run before API 34") },
            telemetry = UsageIngestionTelemetry.NO_OP
        )

        val results = loader.load(0L, 2_000L)
        assertEquals(1, results.size)
        verify(exactly = 1) { usageStatsManager.queryEvents(any<Long>(), any<Long>()) }
    }

    @Test
    fun `load drops navigation packages when no task root available`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        val telemetry = RecordingTelemetry()
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.android.launcher3",
                    taskRootPackage = null,
                    taskRootClass = null
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(
                navigationPackages = setOf("com.android.launcher3")
            ),
            telemetry = telemetry
        )

        val results = loader.load(0L, 2_000L)
        assertEquals(emptyList<Long>(), results.map(UsageEvent::timestampMs))
        val navDrops = telemetry.lastResult?.navigationPackageDrops
        assertEquals(1, navDrops?.get("com.android.launcher3"))
        val dropReasons = telemetry.lastResult?.droppedEvents?.map { it.dropReason } ?: emptyList()
        assertEquals(true, dropReasons.contains(UsageIngestionTelemetry.DropReason.NAVIGATION_PACKAGE))
    }

    @Test
    fun `load keeps event when navigation class reported but task root equals app`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        val telemetry = RecordingTelemetry()
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.app",
                    taskRootPackage = "com.example.app",
                    taskRootClass = "com.android.launcher3.Launcher"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(
                navigationActivityClassNames = setOf("com.android.launcher3.Launcher")
            ),
            telemetry = telemetry
        )

        val results = loader.load(0L, 2_000L)
        assertEquals(1, results.size)
        assertEquals("com.example.app", results.single().packageName)
        // No drops expected in this scenario
        val navDrops = telemetry.lastResult?.navigationPackageDrops?.values?.sum() ?: 0
        assertEquals(0, navDrops)
    }

    @Test
    fun `load drops event when navigation class and root is navigation package different from app`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        val telemetry = RecordingTelemetry()
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.example.app",
                    taskRootPackage = "com.android.systemui",
                    taskRootClass = "com.android.systemui.recents.RecentsActivity"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(
                navigationActivityClassNames = setOf("com.android.systemui.recents.RecentsActivity"),
                suppressedTaskRootPackages = setOf("com.android.systemui"),
                navigationPackages = setOf("com.android.systemui")
            ),
            telemetry = telemetry
        )

        val results = loader.load(0L, 2_000L)
        assertEquals(0, results.size)
        val navDrops = telemetry.lastResult?.navigationPackageDrops?.values?.sum() ?: 0
        assertEquals(1, navDrops)
    }

    @Test
    fun `load reattributes navigation host events to task root`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 1_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.android.launcher3",
                    taskRootPackage = "com.example.realapp",
                    taskRootClass = "com.example.realapp.MainActivity"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(
                navigationPackages = setOf("com.android.launcher3"),
                suppressedTaskRootPackages = setOf("com.android.launcher3")
            ),
            telemetry = UsageIngestionTelemetry.NO_OP
        )

        val results = loader.load(0L, 2_000L)
        assertEquals(1, results.size)
        assertEquals("com.example.realapp", results.single().packageName)
    }

    @Test
    fun `load reattributes google quicksearch host events to task root`() {
        val usageStatsManager: UsageStatsManager = mockk(relaxed = true)
        every { usageStatsManager.queryEvents(any<Long>(), any()) } answers {
            usageEventsOf(
                createEvent(
                    timestamp = 2_000L,
                    type = UsageEventType.MOVE_TO_FOREGROUND,
                    packageName = "com.google.android.googlequicksearchbox",
                    taskRootPackage = "com.android.chrome",
                    taskRootClass = "com.google.android.apps.chrome.Main"
                )
            )
        }

        val loader = UsageEventLoader(
            usageStatsManager,
            UsageAggregationConfig(
                hostPackagesForAttribution = setOf("com.google.android.googlequicksearchbox")
            ),
            telemetry = UsageIngestionTelemetry.NO_OP
        )

        val results = loader.load(0L, 3_000L)

        assertEquals(1, results.size)
        assertEquals("com.android.chrome", results.single().packageName)
    }

    private fun usageEventsOf(vararg events: UsageEvents.Event): UsageEvents {
        val queue = events.map(::duplicateEvent).toMutableList()
        return mockk(relaxed = true) {
            every { hasNextEvent() } answers { queue.isNotEmpty() }
            every { getNextEvent(any()) } answers {
                val target = firstArg<UsageEvents.Event>()
                val next = queue.removeFirst()
                copyEvent(next, target)
                true
            }
        }
    }

    private fun createEvent(
        timestamp: Long,
        type: UsageEventType,
        packageName: String?,
        taskRootPackage: String? = null,
        taskRootClass: String? = null,
        instanceId: Int? = null
    ): UsageEvents.Event {
        val event = UsageEvents.Event()
        setField(event, "mEventType", type.rawValue)
        setField(event, "mTimeStamp", timestamp)
        setField(event, "mPackage", packageName)
        setField(event, "mTaskRootPackage", taskRootPackage, "mTaskRootPackageName")
        setField(event, "mTaskRootClass", taskRootClass, "mTaskRootClassName")
        setField(event, "mInstanceId", instanceId)
        return event
    }

    private fun setField(event: UsageEvents.Event, name: String, value: Any?, vararg altNames: String) {
        if (value == null) return
        val field = findField(name, *altNames)
        when (field.type) {
            Int::class.javaPrimitiveType -> field.setInt(event, (value as Number).toInt())
            Long::class.javaPrimitiveType -> field.setLong(event, (value as Number).toLong())
            Boolean::class.javaPrimitiveType -> field.setBoolean(event, value as Boolean)
            else -> field.set(event, value)
        }
    }

    private fun findField(name: String, vararg altNames: String): Field {
        val candidates = listOf(name) + altNames
        val eventClass = UsageEvents.Event::class.java
        for (candidate in candidates) {
            val field = runCatching { eventClass.getDeclaredField(candidate) }.getOrNull()
            if (field != null) {
                field.isAccessible = true
                return field
            }
        }
        throw NoSuchFieldException(candidates.joinToString(", "))
    }

    private fun copyEvent(source: UsageEvents.Event, target: UsageEvents.Event) {
        EVENT_FIELDS.forEach { field ->
            when (field.type) {
                Int::class.javaPrimitiveType -> field.setInt(target, field.getInt(source))
                Long::class.javaPrimitiveType -> field.setLong(target, field.getLong(source))
                Boolean::class.javaPrimitiveType -> field.setBoolean(target, field.getBoolean(source))
                else -> field.set(target, field.get(source))
            }
        }
    }

    private fun duplicateEvent(source: UsageEvents.Event): UsageEvents.Event = UsageEvents.Event().also {
        copyEvent(source, it)
    }

    companion object {
        private val EVENT_FIELDS: List<Field> = UsageEvents.Event::class.java.declaredFields
            .onEach { it.isAccessible = true }
            .toList()
    }

    private class RecordingTelemetry : UsageIngestionTelemetry {
        var lastResult: UsageIngestionTelemetry.Result? = null
        override fun onIngestionResult(result: UsageIngestionTelemetry.Result) {
            lastResult = result
        }

        override fun onNavigationSanitization(stats: UsageIngestionTelemetry.NavigationSanitization) = Unit
    }
}
