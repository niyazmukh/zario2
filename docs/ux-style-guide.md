# Zario UX Style & Interaction Guide

**Audience:** future contributors (human or AI) implementing new UI in Zario.  
**Design Principle:** calm, minimalistic productivity support—consistent rhythm, clear hierarchy, and trustworthy tone.

---

## 1. Foundations

- **SSOT:** `res/values/dimens.xml`, `res/values/strings.xml`, `res/values/colors.xml`, and `res/values/themes.xml`.
- **Module Boundary:** Android resource bundle defines presentation tokens. Inputs: resource IDs; outputs: themed UI elements via ViewBinding/DataBinding. Business logic and persistence live elsewhere.
- **Component Stack:** Material 3 (`Theme.Zario`) as the base; reuse its typography, color, and elevation semantics.

### 1.1 Color System

| Token | Usage |
| --- | --- |
| `@color/purple_500` / `?attr/colorPrimary` | Primary CTAs, active states, focus highlights |
| `@color/purple_700` / `?attr/colorPrimaryContainer` | Elevated surfaces, buttons in pressed state |
| `@color/red_200` / `?attr/colorSecondary` | Alerts, secondary emphasis, streak indicators |
| `@color/white` / `@color/black` | Surfaces and text defaults |
| `@color/evaluation_*` | History & evaluation status states only |

**Rules**
- Reference theme attrs when styling views (`?attr/colorPrimary`, `?attr/colorOnSurfaceVariant`) to keep Day/Night compatibility.
- Avoid raw hex codes inside layouts.

### 1.2 Typography

Leverage Material 3 text appearances:

| Context | Appearance |
| --- | --- |
| Screen titles / hero copy | `?attr/textAppearanceHeadlineMedium` (center aligned) |
| Section headers | `?attr/textAppearanceTitleMedium` or `TitleSmall` |
| Body text | `?attr/textAppearanceBodyLarge` (primary), `BodyMedium/Small` (support) |
| Buttons & status labels | `?attr/textAppearanceLabelLarge` |

- Center-align all screen-level titles and section headers; default to start alignment for body and list content.

### 1.3 Spacing & Layout Grid

- 4dp grid from `dimens.xml` (`spacing_xs` … `spacing_xxl`).
- Screen padding: `spacing_lg` on all edges.
- Vertical rhythm: `spacing_xxl` top margin for hero titles; `spacing_md` between stacked inputs/cards; `spacing_xl` before primary CTA; `spacing_lg` bottom padding.
- Component sizes: reuse tokens e.g., `button_height_primary` (56dp), `card_corner_radius`, `card_elevation`.
- All container backgrounds remain transparent; use padding and typography to create hierarchy instead of solid fills.

### 1.4 Strings & Tone

- Strings maintain supportive, action-oriented voice (e.g., “Creating account…”, “We couldn’t detect…”).
- New copy should be concise, instructive, and avoid jargon.
- Validation messages follow existing direct style (“Please enter…”). Reuse keys when semantics match.

---

## 2. Layout Patterns

1. **Onboarding/Forms** (Signup, Permissions)
   - `ScrollView` → `ConstraintLayout` root.
   - Hero title centered, subtitle `spacing_sm` below.
   - `TextInputLayout` stack with `spacing_md` gaps.
   - Primary CTA full-width, `spacing_xl` top margin.
   - Bottom link row via horizontal `LinearLayout`.

2. **Analytics/Data** (History)
   - `ConstraintLayout` root with vertical flow.
   - Date picker header as horizontal `LinearLayout`.
   - Horizontal `RecyclerView` for charts (`history_hourly_chart_height`, `LinearSnapHelper`).
   - Vertical list for detailed entries with custom `ItemDecoration` using `spacing_sm`/`spacing_md`.
   - Empty + loading states are stacked below primary sections.

3. **Cards & Containers**
   - Favor direct layout stacks (plain `LinearLayout`/`ConstraintLayout`) with transparent backgrounds.
   - Only introduce framing elements when necessary for interactivity; if used, keep backgrounds transparent and avoid heavy strokes or shadows.

---

## 3. Components & Interactions

### 3.1 Buttons
- `MaterialButton` full width for primary actions. Height `@dimen/button_height_primary`, text style `LabelLarge`.
- Loading state: update text to progressive message (e.g., `@string/auth_creating_account`), disable button (`isEnabled = false`).
- Secondary status chips: `TextView` with `button_height_small` and `button_width_small`, `?attr/colorPrimary` text.

### 3.2 Text Inputs & Dropdowns
- `TextInputLayout` with `Widget.Material3.TextInputLayout.OutlinedBox` styles.
- Password fields enable `app:endIconMode="password_toggle"`.
- Dropdowns use `OutlinedBox.ExposedDropdownMenu` and `ArrayAdapter` for string arrays.
- Validation hooked via ViewModel flows to `til*.error`.

### 3.3 Lists & Charts
- Vertical history list uses `LinearLayoutManager`. Provide `ItemDecoration` for consistent spacing.
- Horizontal chart: fixed height, `setHasFixedSize(true)`, `LinearSnapHelper` for centered snapping.
- Selection toggles call `viewModel.togglePackageFilter`; adjust stroke width/alpha in adapter using constants (`Constants.CARD_STROKE_WIDTH_*`).

### 3.4 Loading & Empty States
- Combine `CircularProgressIndicator` with contextual copy (`tv_loading`) and hide once data arrives.
- Empty states: vertical `LinearLayout` with title + description from strings; hide list and chart when empty.

### 3.5 Navigation & Back Handling
- CTAs/navigation use `findNavController()` actions defined in navigation graph.
- For custom back behavior (e.g., History), add `OnBackPressedCallback` to pop the stack.
- Always ensure root view is focusable to support keyboard navigation.

---

## 4. Interaction State Model

- ViewModels expose immutable `UiState` data classes.
- Collect flows within `viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED)`.
- Standard auth flow states: `Idle`, `Loading`, `Success`, `Error` (`AuthResult`).
- On success, branch navigation on business rules (e.g., session condition FLEXIBLE → FlexStakes).
- Snackbars present errors (`Snackbar.LENGTH_LONG`). Copy sourced from `strings.xml`.

---

## 5. Accessibility & Inclusivity

- Provide `contentDescription` for interactive icons and loaders (strings already defined: `cd_loading_animation`, `app_usage_card_content_description`, etc.).
- Ensure touch targets ≥48dp (dimens already satisfy: button heights, chips). For text-only chips, add ripple via `android:foreground="?attr/selectableItemBackground"`.
- Maintain color contrast by relying on theme attributes.
- Avoid conveying information by color alone—pair status colors with text labels.

---

## 6. Extending the System (Recipe)

1. Create new fragment layout with `ConstraintLayout` root and screen padding `@dimen/spacing_lg`.
2. Add title/subtitle with `HeadlineMedium` and `BodyLarge`, margin `spacing_xxl` + `spacing_sm`.
3. Stack content modules (forms, cards, lists) using spacing tokens.
4. Bind ViewModel flows via ViewBinding; follow state model for loading/error handling.
5. For new strings, follow naming pattern `feature_context_action` and adopt friendly coaching tone.
6. Reuse existing components before introducing new variants; if new dimension/string unavoidable, document usage.

---

## 7. Decision Record

- **Title:** Maintain Material 3 token-driven UX
- **Decision:** Continue using centralized resource tokens and Material 3 theme for styling consistency.
- **Context:** Existing screens already align to tokens; ensures easy theming updates and minimal cognitive load.
- **Alternatives considered:**
  - Adopt third-party design system (Compose or custom) — high migration cost, risk of divergence.
  - Hard-code per-screen styles — fast initially, but inconsistent and high maintenance.
- **Consequences:** Unified styling, easy theming adjustments, low risk. Rollback by reverting resource changes if needed.
- **Date:** 2025-09-29.

---

## 8. Quality Gates & Checklist

| Gate | Expectation |
| --- | --- |
| **Design Tokens** | All spacing/colors/strings sourced from canonical resources |
| **Layout Consistency** | Screens follow patterns described above |
| **State Handling** | Loading/error/empty states implemented through ViewModel flows |
| **Accessibility** | Descriptive `contentDescription`, adequate touch targets, text contrast |
| **Copy Tone** | Supportive, direct, reusable strings |

**CI Reminder:** lint → unit tests → build → (optional) integration → security scan. Update documentation when introducing new components.

---

## 9. References

- `app/src/main/res/layout/fragment_signup.xml`
- `app/src/main/java/com/niyaz/zario/ui/auth/SignupFragment.kt`
- `app/src/main/res/layout/fragment_permissions.xml`
- `app/src/main/res/layout/fragment_history.xml`
- `app/src/main/java/com/niyaz/zario/ui/history/HistoryFragment.kt`
- `app/src/main/java/com/niyaz/zario/ui/history/HistoryViewModel.kt`
- `core/common/src/main/java/com/niyaz/zario/Constants.kt`
