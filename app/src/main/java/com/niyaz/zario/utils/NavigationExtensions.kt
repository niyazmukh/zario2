package com.niyaz.zario.utils

import android.util.Log
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions

/**
 * Navigation safety extensions to prevent IllegalStateException crashes.
 * 
 * Common crash scenario:
 * - User taps button twice quickly
 * - First tap navigates away, destroying the fragment
 * - Second tap tries to navigate on destroyed NavController
 * - Result: "IllegalStateException: NavController not available"
 * 
 * This extension checks NavController state before navigation.
 */

/**
 * Safely navigate using action ID, catching any IllegalStateException.
 * 
 * @param actionId Navigation action resource ID
 * @param navOptions Optional navigation options
 * @return true if navigation succeeded, false if NavController unavailable
 */
fun NavController.navigateSafely(
    @IdRes actionId: Int,
    navOptions: NavOptions? = null
): Boolean {
    return try {
        // Check if current destination is valid before navigating
        if (currentDestination?.getAction(actionId) != null) {
            navigate(actionId, null, navOptions)
            true
        } else {
            Log.w("NavigationExtensions", "Navigation action $actionId not found in current destination")
            false
        }
    } catch (e: IllegalStateException) {
        Log.e("NavigationExtensions", "Navigation failed: NavController not available", e)
        false
    } catch (e: Exception) {
        Log.e("NavigationExtensions", "Unexpected navigation error", e)
        false
    }
}

/**
 * Safely navigate using NavDirections, catching any IllegalStateException.
 * 
 * @param directions Navigation directions (typically from generated Safe Args)
 * @param navOptions Optional navigation options
 * @return true if navigation succeeded, false if NavController unavailable
 */
fun NavController.navigateSafely(
    directions: NavDirections,
    navOptions: NavOptions? = null
): Boolean {
    return try {
        // Check if current destination is valid before navigating
        if (currentDestination != null) {
            navigate(directions, navOptions)
            true
        } else {
            Log.w("NavigationExtensions", "Navigation failed: No current destination")
            false
        }
    } catch (e: IllegalStateException) {
        Log.e("NavigationExtensions", "Navigation failed: NavController not available", e)
        false
    } catch (e: Exception) {
        Log.e("NavigationExtensions", "Unexpected navigation error", e)
        false
    }
}

/**
 * Safely navigate up (back), catching any IllegalStateException.
 * 
 * @return true if navigation succeeded, false if NavController unavailable
 */
fun NavController.navigateUpSafely(): Boolean {
    return try {
        navigateUp()
    } catch (e: IllegalStateException) {
        Log.e("NavigationExtensions", "Navigate up failed: NavController not available", e)
        false
    } catch (e: Exception) {
        Log.e("NavigationExtensions", "Unexpected navigate up error", e)
        false
    }
}

/**
 * Safely pop back stack to destination, catching any IllegalStateException.
 * 
 * @param destinationId Destination to pop back to
 * @param inclusive Whether to also pop the destination
 * @return true if navigation succeeded, false if NavController unavailable
 */
fun NavController.popBackStackSafely(
    @IdRes destinationId: Int,
    inclusive: Boolean = false
): Boolean {
    return try {
        popBackStack(destinationId, inclusive)
    } catch (e: IllegalStateException) {
        Log.e("NavigationExtensions", "Pop back stack failed: NavController not available", e)
        false
    } catch (e: Exception) {
        Log.e("NavigationExtensions", "Unexpected pop back stack error", e)
        false
    }
}
