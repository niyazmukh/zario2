# 🎯 Zario Style Quick Reference Card

**Last Updated:** October 15, 2025

---

## ⚠️ CRITICAL: Three Sources of Truth

**NEVER use hardcoded values. ALWAYS use:**

1. **`dimens.xml`** — ALL spacing, dimensions, sizes
2. **`strings.xml`** — ALL user-facing text
3. **`Constants.kt`** — ALL business logic numbers

```xml
<!-- ❌ WRONG -->
<TextView 
    android:layout_marginTop="16dp"
    android:text="Welcome" />

<!-- ✓ RIGHT -->
<TextView 
    android:layout_marginTop="@dimen/spacing_md"
    android:text="@string/welcome_title" />
```

```kotlin
// ❌ WRONG
val reward = 5
if (password.length < 8) { }

// ✓ RIGHT
val reward = Constants.FLEXIBLE_REWARD
if (password.length < Constants.MIN_PASSWORD_LENGTH) { }
```

---

## 🏗️ Screen Structure Template

```xml
<ScrollView android:fillViewport="true">
    <ConstraintLayout android:padding="@dimen/spacing_lg">
        
        <!-- TITLE: spacing_xxl top -->
        <TextView 
            android:textAppearance="?attr/textAppearanceHeadlineMedium"
            android:textColor="?attr/colorOnSurface"
            android:gravity="center"
            android:layout_marginTop="@dimen/spacing_xxl" />
        
        <!-- SUBTITLE: spacing_sm below title -->
        <TextView 
            android:textAppearance="?attr/textAppearanceBodyLarge"
            android:textColor="?attr/colorOnSurfaceVariant"
            android:gravity="center"
            android:layout_marginTop="@dimen/spacing_sm" />
        
        <!-- CONTENT: spacing_xxl below subtitle -->
        <MaterialCardView
            android:layout_marginTop="@dimen/spacing_xxl"
            app:cardBackgroundColor="@android:color/transparent"
            app:strokeColor="?attr/colorOutline"
            app:cardElevation="@dimen/card_elevation">
            
            <LinearLayout android:padding="@dimen/spacing_md">
                <!-- Card content -->
            </LinearLayout>
        </MaterialCardView>
        
        <!-- BUTTON: spacing_xl top, spacing_lg bottom -->
        <MaterialButton
            android:layout_width="0dp"
            android:layout_height="@dimen/button_height_primary"
            android:layout_marginTop="@dimen/spacing_xl"
            android:layout_marginBottom="@dimen/spacing_lg" />
            
    </ConstraintLayout>
</ScrollView>
```

---

## 📏 Spacing Cheat Sheet

| Token | Value | Use Case |
|-------|-------|----------|
| `spacing_xs` | 4dp | Text gaps, icon padding |
| `spacing_sm` | 8dp | Title→Subtitle |
| `spacing_md` | 16dp | Cards, form fields, card padding |
| `spacing_lg` | 24dp | Screen padding, sections |
| `spacing_xl` | 32dp | Content→Button |
| `spacing_xxl` | 48dp | Title top margin, hero spacing |

---

## 🎭 Typography Map

| Element | Appearance | Color |
|---------|-----------|-------|
| Screen title | `HeadlineMedium` | `colorOnSurface` |
| Subtitle | `BodyLarge` | `colorOnSurfaceVariant` |
| Card header | `TitleMedium` | `colorOnSurface` |
| Body text | `BodyMedium` | `colorOnSurfaceVariant` |
| Small text | `BodySmall` | `colorOnSurfaceVariant` |
| Data display | `TitleLarge` | `colorPrimary` or `colorOnSurface` |
| Button label | `LabelLarge` | `colorPrimary` |

**Remember:** Always use `?attr/textAppearance*`

---

## 🎴 Card Attributes

```xml
app:cardCornerRadius="@dimen/card_corner_radius"
app:cardElevation="@dimen/card_elevation"
app:cardBackgroundColor="@android:color/transparent"
app:strokeColor="?attr/colorOutline"
app:strokeWidth="@dimen/card_stroke_width"
```

**For interactive cards, add:**
```xml
android:clickable="true"
android:focusable="true"
android:foreground="?attr/selectableItemBackground"
```

---

## 🎨 Color Tokens

```xml
<!-- Text -->
?attr/colorOnSurface           <!-- Primary text -->
?attr/colorOnSurfaceVariant    <!-- Muted/secondary text -->

<!-- Actions -->
?attr/colorPrimary             <!-- Buttons, links, highlights -->

<!-- State -->
@color/evaluation_success      <!-- Green: Goals met -->
@color/evaluation_exceeded     <!-- Red: Goals exceeded -->

<!-- Borders -->
?attr/colorOutline             <!-- Card strokes -->

<!-- Backgrounds -->
@android:color/transparent     <!-- Card backgrounds -->
@color/white                   <!-- Slider inactive tracks -->
```

---

## 🔘 Button Specs

```xml
<!-- Primary (Full Width) -->
<MaterialButton
    android:layout_width="0dp"
    android:layout_height="@dimen/button_height_primary"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent" />

<!-- Heights -->
button_height_primary: 56dp
button_height_secondary: 52dp
button_height_small: 36dp
```

---

## 📝 Form Input Pattern

```xml
<TextInputLayout
    style="@style/Widget.Material3.TextInputLayout.OutlinedBox"
    android:layout_width="0dp"
    android:layout_marginTop="@dimen/spacing_md">
    
    <TextInputEditText
        android:layout_width="match_parent"
        android:maxLines="1" />
</TextInputLayout>
```

**Spacing:** First input `spacing_xxl` from subtitle, then `spacing_md` between

---

## 🎚️ Slider Pattern

```xml
<LinearLayout android:orientation="horizontal">
    <TextView 
        android:minWidth="@dimen/slider_label_min_width"
        android:gravity="center" />
    
    <Slider
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_marginHorizontal="@dimen/spacing_md"
        app:trackColorInactive="@color/white" />
    
    <TextView 
        android:minWidth="@dimen/slider_label_min_width"
        android:gravity="center" />
</LinearLayout>
```

**For RTL:** Add `android:layoutDirection="rtl"`

---

## ✅ Required Elements Checklist

Every screen MUST have:
- [ ] `ScrollView` with `fillViewport="true"`
- [ ] Root padding: `@dimen/spacing_lg`
- [ ] Center-aligned title + subtitle
- [ ] Title top margin: `@dimen/spacing_xxl`
- [ ] Title→Subtitle gap: `@dimen/spacing_sm`
- [ ] Subtitle→Content gap: `@dimen/spacing_xxl`
- [ ] Content→Button gap: `@dimen/spacing_xl`
- [ ] Button bottom margin: `@dimen/spacing_lg`

**Value Standardization (ENFORCED):**
- [ ] All spacing uses `@dimen/` from `dimens.xml`
- [ ] All text uses `@string/` from `strings.xml`
- [ ] All business values use `Constants.kt`
- [ ] All colors use `?attr/` or semantic `@color/`
- [ ] No hardcoded `dp`, `sp`, or string values
- [ ] No magic numbers in business logic
- [ ] Center-aligned title + subtitle
- [ ] Title top margin: `@dimen/spacing_xxl`
- [ ] Title→Subtitle gap: `@dimen/spacing_sm`
- [ ] Subtitle→Content gap: `@dimen/spacing_xxl`
- [ ] Content→Button gap: `@dimen/spacing_xl`
- [ ] Button bottom margin: `@dimen/spacing_lg`
- [ ] All spacing uses semantic tokens
- [ ] All text uses `?attr/textAppearance*`
- [ ] All colors use `?attr/color*` or semantic colors

---

## 🚫 Never Do This

```xml
❌ android:layout_marginTop="16dp"
✓  android:layout_marginTop="@dimen/spacing_md"

❌ android:text="Welcome to Zario"
✓  android:text="@string/welcome_title"

❌ android:textColor="#000000"
✓  android:textColor="?attr/colorOnSurface"

❌ android:gravity="start" (for titles)
✓  android:gravity="center" (for titles)

❌ app:cardElevation="4dp"
✓  app:cardElevation="@dimen/card_elevation"

❌ app:cardBackgroundColor="@color/purple_500"
✓  app:cardBackgroundColor="@android:color/transparent"
```

```kotlin
❌ binding.tvTitle.text = "Settings"
✓  binding.tvTitle.text = getString(R.string.settings_title)

❌ val reward = 5
✓  val reward = Constants.FLEXIBLE_REWARD

❌ if (password.length < 8) { }
✓  if (password.length < Constants.MIN_PASSWORD_LENGTH) { }
```

---

## 🎯 Golden Rules

1. **Hierarchy through typography, not color**
2. **Whitespace is a design element**
3. **Cards are transparent with strokes**
4. **Center-align all hero content**
5. **Use semantic tokens, never hardcode**
6. **Material 3 native components only**

---

## 📚 Reference Examples

- `fragment_login.xml` — Perfect auth form
- `fragment_signup.xml` — Multi-input pattern
- `fragment_flexstakes.xml` — Card + slider system
- `fragment_permissions.xml` — Interactive card pattern

---

**Full Guide:** See `ZARIO_VISUAL_STYLE_GUIDE.md`
