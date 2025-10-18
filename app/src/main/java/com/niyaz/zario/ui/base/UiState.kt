package com.niyaz.zario.ui.base

/**
 * Base sealed class representing the state of a UI screen.
 * Reduces cognitive load by consolidating multiple boolean flags into a single state representation.
 * 
 * Usage:
 * ```
 * sealed class MyScreenState : UiState() {
 *     data object Loading : MyScreenState()
 *     data class Content(val data: MyData) : MyScreenState()
 *     data class Error(val message: String) : MyScreenState()
 * }
 * ```
 */
sealed class UiState {
    /**
     * Loading state - initial data fetch or refresh operation in progress.
     * UI should show progress indicator and disable interactions.
     */
    data object Loading : UiState()
    
    /**
     * Empty state - no data available to display.
     * UI should show empty state illustration with appropriate messaging.
     * 
     * @param message User-facing message explaining why content is empty
     * @param action Optional action to resolve the empty state (e.g., "Grant Permission", "Retry")
     */
    data class Empty(
        val message: String,
        val action: EmptyAction? = null
    ) : UiState()
    
    /**
     * Content state - data successfully loaded and ready to display.
     * UI should show the main content view.
     * 
     * Generic type T allows each screen to define its own content data structure.
     */
    data class Content<T>(val data: T) : UiState()
    
    /**
     * Error state - operation failed with recoverable error.
     * UI should show error message with retry option.
     * 
     * @param message User-facing error description
     * @param throwable Optional exception for logging/debugging
     */
    data class Error(
        val message: String,
        val throwable: Throwable? = null
    ) : UiState()
}

/**
 * Represents an action that can resolve an empty state.
 */
data class EmptyAction(
    val label: String,
    val action: () -> Unit
)
