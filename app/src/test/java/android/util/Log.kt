package android.util

/**
 * Minimal stub of [android.util.Log] for JVM unit tests.
 * Redirects all logs to stdout so code using Log APIs can run without Robolectric.
 */
object Log {
    @JvmStatic
    fun d(tag: String?, msg: String?): Int {
        println("D/$tag: $msg")
        return 0
    }

    @JvmStatic
    fun d(tag: String?, msg: String?, tr: Throwable?): Int {
        println("D/$tag: $msg\n${tr?.stackTraceToString()}")
        return 0
    }

    @JvmStatic
    fun i(tag: String?, msg: String?): Int {
        println("I/$tag: $msg")
        return 0
    }

    @JvmStatic
    fun i(tag: String?, msg: String?, tr: Throwable?): Int {
        println("I/$tag: $msg\n${tr?.stackTraceToString()}")
        return 0
    }

    @JvmStatic
    fun w(tag: String?, msg: String?): Int {
        System.err.println("W/$tag: $msg")
        return 0
    }

    @JvmStatic
    fun w(tag: String?, msg: String?, tr: Throwable?): Int {
        System.err.println("W/$tag: $msg\n${tr?.stackTraceToString()}")
        return 0
    }

    @JvmStatic
    fun e(tag: String?, msg: String?): Int {
        System.err.println("E/$tag: $msg")
        return 0
    }

    @JvmStatic
    fun e(tag: String?, msg: String?, tr: Throwable?): Int {
        System.err.println("E/$tag: $msg\n${tr?.stackTraceToString()}")
        return 0
    }
}
