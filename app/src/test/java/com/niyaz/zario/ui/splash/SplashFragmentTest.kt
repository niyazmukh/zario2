package com.niyaz.zario.ui.splash

import org.junit.Assert.assertTrue
import org.junit.Test

class SplashFragmentTest {
    @Test
    fun `does not reference requireContext to avoid detached fragment crashes`() {
        val resourceName = "${SplashFragment::class.java.name.replace('.', '/')}.class"
        val bytes = SplashFragment::class.java.classLoader
            ?.getResourceAsStream(resourceName)
            ?.readBytes()
            ?: error("Could not read class bytes for $resourceName")

        val classText = bytes.toString(Charsets.ISO_8859_1)
        assertTrue(
            "SplashFragment must not call requireContext() from background work; use applicationContext instead",
            !classText.contains("requireContext")
        )
    }
}

