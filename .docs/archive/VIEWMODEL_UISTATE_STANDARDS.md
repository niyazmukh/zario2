# ViewModel & UiState Pattern Standards

## Architecture Decision: State Management Pattern

**Date**: October 15, 2025  
**Status**: Adopted  
**Context**: Need consistent, maintainable state management across all ViewModels

---

## Pattern Overview

All ViewModels in the Zario app follow a standardized state management pattern using Kotlin StateFlow and either:
1. **Sealed class UiState** for screens with distinct states (Loading/Error/Content/Empty)
2. **Data class UiState** for screens with consistent structure but variable data

---

## When to Use Each Pattern

### ✅ Use Sealed Class (Mutually Exclusive States)

**Characteristics**:
- Screen has fundamentally different states
- States are mutually exclusive (can't be Loading AND Content simultaneously)
- Different UI layouts for each state

**Examples**:
- `TargetUiState`: Loading | PermissionRequired | Content | Error
- `EvaluationState`: NotStarted | Preparing | Active | Completed | Error

**Implementation**:
```kotlin
sealed class ScreenUiState {
    data object Loading : ScreenUiState()
    data class Content(val data: MyData) : ScreenUiState()
    data class Error(val message: String) : ScreenUiState()
}

class ScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<ScreenUiState>(ScreenUiState.Loading)
    val uiState: StateFlow<ScreenUiState> = _uiState.asStateFlow()
}
```

**Fragment Rendering**:
```kotlin
private fun renderUiState(state: ScreenUiState) {
    when (state) {
        is ScreenUiState.Loading -> showLoading()
        is ScreenUiState.Content -> showContent(state.data)
        is ScreenUiState.Error -> showError(state.message)
    }
}
```

### ✅ Use Data Class (Single State with Variations)

**Characteristics**:
- Screen structure remains consistent
- Data changes but layout doesn't fundamentally change
- Loading is just a property, not a different state

**Examples**:
- `ProfileUiState`: Always shows profile, but data loads progressively
- `UsageUiState` (History): Chart and list always visible, data updates

**Implementation**:
```kotlin
data class ScreenUiState(
    val isLoading: Boolean = false,
    val data: List<Item> = emptyList(),
    val selectedFilter: String? = null,
    val errorMessage: String? = null
)

class ScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ScreenUiState())
    val uiState: StateFlow<ScreenUiState> = _uiState.asStateFlow()
    
    // Update with .copy()
    _uiState.update { it.copy(isLoading = false, data = newData) }
}
```

---

## Existing ViewModels

| ViewModel | Pattern | UiState Type | Rationale |
|-----------|---------|--------------|-----------|
| **TargetViewModel** | Sealed Class | `TargetUiState` | 4 distinct states: Loading, Permission, Content, Error |
| **InterventionViewModel** | Sealed Class | `EvaluationState` | 5 states: NotStarted, Preparing, Active, Completed, Error |
| **HistoryViewModel** | Data Class | `UsageUiState` | Consistent layout, data varies (chart + list) |
| **ProfileViewModel** | Data Class | `ProfileUiState` | Consistent layout, data loads progressively |

---

## Common Patterns & Best Practices

### 1. StateFlow Initialization
```kotlin
// ✅ Good: Initialize with default state
private val _uiState = MutableStateFlow(ScreenUiState())
val uiState: StateFlow<ScreenUiState> = _uiState.asStateFlow()

// ❌ Bad: Nullable StateFlow
private val _uiState = MutableStateFlow<ScreenUiState?>(null)
```

### 2. State Updates
```kotlin
// ✅ Good: Use .update {} for thread-safety
_uiState.update { currentState ->
    currentState.copy(isLoading = false, data = newData)
}

// ❌ Bad: Direct assignment (race conditions)
_uiState.value = _uiState.value.copy(isLoading = false)
```

### 3. Fragment Observation
```kotlin
// ✅ Good: Use viewLifecycleOwner + repeatOnLifecycle
viewLifecycleOwner.lifecycleScope.launch {
    viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
        viewModel.uiState.collect { state ->
            renderUiState(state)
        }
    }
}

// ❌ Bad: Direct lifecycleScope (leaks)
lifecycleScope.launch {
    viewModel.uiState.collect { state ->
        renderUiState(state)
    }
}
```

### 4. Multiple Flows
```kotlin
// ✅ Good: Launch separate coroutines under repeatOnLifecycle
viewLifecycleOwner.lifecycleScope.launch {
    viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
        launch { viewModel.uiState.collect { /* ... */ } }
        launch { viewModel.events.collect { /* ... */ } }
    }
}
```

### 5. Error Handling
```kotlin
// ✅ Good: Capture errors in state
viewModelScope.launch {
    _uiState.value = ScreenUiState.Loading
    runCatching {
        repository.getData()
    }.onSuccess { data ->
        _uiState.value = ScreenUiState.Content(data)
    }.onFailure { error ->
        _uiState.value = ScreenUiState.Error(error.message ?: "Unknown error")
    }
}
```

---

## Testing Guidelines

### Sealed Class UiState Testing
```kotlin
@Test
fun `loadData success updates state to Content`() = runTest {
    // Given
    val expectedData = MyData(...)
    coEvery { repository.getData() } returns expectedData
    
    // When
    viewModel.loadData()
    
    // Then
    val state = viewModel.uiState.value
    assertTrue(state is ScreenUiState.Content)
    assertEquals(expectedData, (state as ScreenUiState.Content).data)
}
```

### Data Class UiState Testing
```kotlin
@Test
fun `loadData updates isLoading flag correctly`() = runTest {
    // Given
    val testData = listOf(...)
    coEvery { repository.getData() } coAnswers {
        delay(100)
        testData
    }
    
    // When
    viewModel.loadData()
    
    // Then - Check loading
    assertTrue(viewModel.uiState.value.isLoading)
    
    // Then - Check loaded
    advanceUntilIdle()
    assertFalse(viewModel.uiState.value.isLoading)
    assertEquals(testData, viewModel.uiState.value.data)
}
```

---

## Migration Checklist

When refactoring an existing Fragment to use ViewModel + UiState:

- [ ] **1. Analyze State**: Determine if sealed class or data class is appropriate
- [ ] **2. Create UiState**: Define sealed class or data class with all state
- [ ] **3. Create ViewModel**: Move business logic from Fragment to ViewModel
- [ ] **4. Expose StateFlow**: Use private MutableStateFlow + public StateFlow pattern
- [ ] **5. Update Fragment**: Replace manual state management with `renderUiState()`
- [ ] **6. Use viewLifecycleOwner**: Ensure proper lifecycle observation
- [ ] **7. Write Tests**: Test ViewModel logic without Android dependencies
- [ ] **8. Validate**: Test all state transitions manually
- [ ] **9. Remove Dead Code**: Delete old state management code
- [ ] **10. Document**: Update this file if patterns evolve

---

## Anti-Patterns to Avoid

### ❌ Multiple Boolean Flags
```kotlin
// Bad: Cognitive overload, invalid states possible
var isLoading = false
var hasError = false
var isEmpty = false
var hasPermission = false
```

### ❌ LiveData Instead of StateFlow
```kotlin
// Bad: LiveData is Android-specific, harder to test
val uiState: LiveData<ScreenUiState> = _uiState
```

### ❌ Exposing Mutable State
```kotlin
// Bad: External code can modify state directly
val uiState: MutableStateFlow<ScreenUiState> = _uiState
```

### ❌ State in Fragment
```kotlin
// Bad: Business logic in Fragment (hard to test)
private fun loadData() {
    showLoading()
    repository.getData { data ->
        showContent(data)
    }
}
```

---

## Performance Considerations

### State Emission Frequency
- Use `.distinctUntilChanged()` for derived flows
- Use `.update {}` instead of `.value =` to reduce emissions
- Avoid emitting state in tight loops

### State Size
- Keep UiState data classes small (< 10 properties)
- Use separate flows for independent data streams
- Don't store UI configuration in state (colors, dimensions, etc.)

---

## References

- [Kotlin StateFlow Documentation](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-state-flow/)
- [Android Architecture Components](https://developer.android.com/topic/architecture)
- [Jetpack Compose State Guidelines](https://developer.android.com/jetpack/compose/state)

---

**Last Updated**: October 15, 2025  
**Maintainer**: Development Team
