# 🎨 Zario Visual Style Guide
## Definitive Design System Documentation

**Version:** 1.0  
**Last Updated:** October 15, 2025  
**Philosophy:** Minimalist Clarity with Purposeful Hierarchy

---

## 📐 Core Design Principles

### 1. **No Hardcoded Values - Ever**
- **ALL spacing MUST come from `dimens.xml`** — Never use `16dp`, `24dp`, etc.
- **ALL text MUST come from `strings.xml`** — Never use `android:text="Hello"`
- **ALL business logic constants MUST come from `Constants.kt`** — Never hardcode thresholds, limits, or magic numbers
- **This is non-negotiable and enforced across the entire codebase**

### 2. **Hierarchy Through Typography, Not Color**
- Use Material 3 text appearances to establish visual hierarchy
- Reserve color for semantic meaning (success, error, primary actions)
- Text size + weight create clear information architecture

### 3. **Whitespace as Primary Design Element**
- Generous spacing creates breathing room and focus
- 4dp grid system ensures mathematical consistency
- Never crowd elements—let content breathe

### 4. **Transparent Cards with Stroke Borders**
- Cards are containers, not visual blocks
- `cardBackgroundColor="@android:color/transparent"`
- `strokeColor="?attr/colorOutline"` + `strokeWidth="@dimen/card_stroke_width"`
- Zero elevation (`cardElevation="@dimen/card_elevation"` = 0dp)

### 5. **Center-Aligned Hero Content**
- Titles and subtitles are always `gravity="center"`
- Creates focal point at screen center
- Body content within cards follows natural left alignment

### 6. **Material 3 Native Components**
- Use `?attr/` theme attributes for colors
- Leverage Material Design semantic tokens
- Avoid custom styling unless absolutely necessary

---

## � Value Standardization (CRITICAL)

### **Three Sources of Truth - Use ONLY These**

Zario enforces **strict value standardization** to ensure maintainability and consistency. Every value in the codebase comes from one of three places:

#### 1. **`dimens.xml` — ALL Layout Dimensions**

**Location:** `app/src/main/res/values/dimens.xml`

**Contains:**
- All spacing tokens (xs, sm, md, lg, xl, xxl)
- All component dimensions (button heights, icon sizes, etc.)
- Card properties (elevation, corner radius, stroke width)

**Usage:**
```xml
<!-- ✓ CORRECT -->
<TextView android:layout_marginTop="@dimen/spacing_md" />
<MaterialButton android:layout_height="@dimen/button_height_primary" />

<!-- ❌ WRONG - NEVER DO THIS -->
<TextView android:layout_marginTop="16dp" />
<MaterialButton android:layout_height="56dp" />
```

**Rule:** If you need a dimension that doesn't exist in `dimens.xml`, add it there with a semantic name. Never use inline `dp` values.

---

#### 2. **`strings.xml` — ALL User-Facing Text**

**Location:** `app/src/main/res/values/strings.xml`

**Contains:**
- All button labels, titles, descriptions
- Error messages, validation messages
- Placeholders, hints, content descriptions
- Format strings with placeholders

**Usage:**
```xml
<!-- ✓ CORRECT -->
<TextView android:text="@string/welcome_title" />
<MaterialButton android:text="@string/login_button" />

<!-- ❌ WRONG - NEVER DO THIS -->
<TextView android:text="Welcome to Zario" />
<MaterialButton android:text="Sign in" />
```

**In Kotlin:**
```kotlin
// ✓ CORRECT
binding.tvTitle.text = getString(R.string.welcome_title)
binding.tvUsage.text = getString(R.string.time_format_hours_minutes, hours, minutes)

// ❌ WRONG - NEVER DO THIS
binding.tvTitle.text = "Welcome to Zario"
binding.tvUsage.text = "$hours h $minutes m"
```

**Rule:** Even temporary text must come from `strings.xml`. This ensures localization readiness and consistent copy.

---

#### 3. **`Constants.kt` — ALL Business Logic Values**

**Location:** `app/src/main/java/com/niyaz/zario/Constants.kt`

**Contains:**
- Points and incentives (rewards, penalties, min/max values)
- Time conversions and thresholds
- Worker scheduling intervals
- Analysis windows (days, thresholds)
- Validation constraints (min password length, min birth year)
- Notification IDs and channel IDs

**Usage:**
```kotlin
// ✓ CORRECT
binding.sliderReward.apply {
    valueFrom = Constants.FLEXIBLE_REWARD_MIN.toFloat()
    valueTo = Constants.FLEXIBLE_REWARD_MAX.toFloat()
    value = Constants.FLEXIBLE_REWARD.toFloat()
}

val minPasswordLength = Constants.MIN_PASSWORD_LENGTH
val analysisWindow = Constants.USAGE_ANALYSIS_DAYS

// ❌ WRONG - NEVER DO THIS
binding.sliderReward.apply {
    valueFrom = 0f
    valueTo = 10f
    value = 5f
}

val minPasswordLength = 8
val analysisWindow = 7
```

**Rule:** Any number that affects business logic, behavior, or configuration MUST be in `Constants.kt`. This includes thresholds, limits, defaults, and magic numbers.

---

### **Why This Matters**

#### **Single Source of Truth**
- Change a value once, it updates everywhere
- No hunting through codebase for hardcoded values
- Prevents inconsistencies and bugs

#### **Maintainability**
```kotlin
// Bad: Value scattered across 15 files
if (password.length < 8) { ... }  // In 15 different places

// Good: One source
if (password.length < Constants.MIN_PASSWORD_LENGTH) { ... }
// Change once in Constants.kt, all 15 places update
```

#### **Localization Ready**
```xml
<!-- Supports all languages automatically -->
<string name="welcome_title">Welcome to Zario</string>
<string name="welcome_title" translatable="true">Bienvenido a Zario</string>
```

#### **Type Safety**
```kotlin
// Compiler catches errors
binding.tvTitle.text = getString(R.string.welcom_title)  // Compile error
binding.tvTitle.text = "Welcom to Zario"  // Typo ships to production
```

---

### **Decision Tree: Where Does This Value Go?**

```
Is it a dimension (dp, sp)?
├─ Yes → dimens.xml
│   ├─ Spacing? → Use existing spacing_xs/sm/md/lg/xl/xxl
│   ├─ Component size? → Use existing or add semantic name
│   └─ Unique value? → Add with descriptive name
│
Is it text shown to users?
├─ Yes → strings.xml
│   ├─ Button label? → [action]_button (e.g., login_button)
│   ├─ Error message? → error_[context] (e.g., error_empty_email)
│   ├─ Screen title? → [screen]_title (e.g., welcome_title)
│   └─ Format string? → Use placeholders (%1$s, %1$d)
│
Is it a number that affects behavior?
├─ Yes → Constants.kt
│   ├─ Points/rewards? → FLEXIBLE_REWARD, FLEXIBLE_PENALTY, etc.
│   ├─ Time threshold? → MIN_USAGE_THRESHOLD_MS, etc.
│   ├─ Validation rule? → MIN_PASSWORD_LENGTH, MIN_BIRTH_YEAR
│   └─ Configuration? → USAGE_ANALYSIS_DAYS, MAX_WORKER_RETRIES
│
Is it a color?
└─ Use Material 3 theme attributes (?attr/colorPrimary)
   or semantic colors (@color/evaluation_success)
```

---

### **Enforcement Rules**

#### **Code Review Checklist:**
- [ ] No hardcoded `dp` or `sp` values (use `@dimen/`)
- [ ] No hardcoded strings (use `@string/` or `getString()`)
- [ ] No magic numbers in business logic (use `Constants`)
- [ ] New dimensions added to `dimens.xml` with semantic names
- [ ] New strings added to `strings.xml` with descriptive keys
- [ ] New constants added to `Constants.kt` with SCREAMING_SNAKE_CASE

#### **Common Violations:**

```xml
<!-- ❌ VIOLATIONS -->
<TextView 
    android:layout_marginTop="16dp"           ← Hardcoded dimension
    android:text="Welcome"                    ← Hardcoded string
    android:textSize="18sp" />                ← Hardcoded size

<!-- ✓ CORRECT -->
<TextView 
    android:layout_marginTop="@dimen/spacing_md"
    android:text="@string/welcome_title"
    android:textAppearance="?attr/textAppearanceHeadlineMedium" />
```

```kotlin
// ❌ VIOLATIONS
if (points > 10000) { ... }           // Magic number
val penalty = 20                       // Hardcoded value
binding.tvError.text = "Invalid"      // Hardcoded string

// ✓ CORRECT
if (points > Constants.MAX_POINTS) { ... }
val penalty = Constants.FLEXIBLE_PENALTY
binding.tvError.text = getString(R.string.error_invalid_input)
```

---

### **File Organization Standards**

#### **`dimens.xml` Structure:**
```xml
<!-- Spacing tokens (4dp grid) -->
<dimen name="spacing_xs">4dp</dimen>
<dimen name="spacing_sm">8dp</dimen>
<!-- ... -->

<!-- Component dimensions -->
<dimen name="button_height_primary">56dp</dimen>
<dimen name="icon_size_standard">48dp</dimen>
<!-- ... -->
```

#### **`strings.xml` Naming Conventions:**
```xml
<!-- Screens: [screen]_title, [screen]_subtitle -->
<string name="login_title">Sign in</string>
<string name="signup_subtitle">Create account</string>

<!-- Buttons: [action]_button -->
<string name="continue_button">Continue</string>

<!-- Errors: error_[context] -->
<string name="error_empty_email">Email is required</string>

<!-- Formats: [type]_format -->
<string name="time_format_hours_minutes">%1$dh %2$dm</string>
```

#### **`Constants.kt` Grouping:**
```kotlin
object Constants {
    // Logging tags
    const val LOG_TAG_EVALUATION_REPOSITORY = "EvaluationRepository"
    
    // Notification channels
    const val NOTIFICATION_CHANNEL_ID_EVALUATION_ALERTS = "zario_evaluation_alerts"
    
    // Time conversions
    const val MILLISECONDS_PER_SECOND = 1_000L
    
    // Points & incentives
    const val FLEXIBLE_REWARD = 5
    const val FLEXIBLE_REWARD_MIN = 0
    const val FLEXIBLE_REWARD_MAX = 10
    
    // Validation
    const val MIN_PASSWORD_LENGTH = 8
}
```

---

### **Migration: Converting Hardcoded Values**

If you find hardcoded values, migrate them immediately:

#### **Step 1: Identify the Value Type**
```xml
<!-- Found this violation -->
<TextView 
    android:layout_marginTop="24dp"
    android:text="Settings" />
```

#### **Step 2: Find or Create Resource**
```xml
<!-- Check if dimens.xml has it -->
<dimen name="spacing_lg">24dp</dimen>  ✓ Exists

<!-- Check if strings.xml has it -->
<string name="settings_title">Settings</string>  ✓ Add if missing
```

#### **Step 3: Replace**
```xml
<!-- Fixed version -->
<TextView 
    android:layout_marginTop="@dimen/spacing_lg"
    android:text="@string/settings_title" />
```

---

## �🎨 Visual Component Architecture

### **Screen Anatomy Pattern**

Every screen follows this consistent structure:

```
┌─────────────────────────────────┐
│  spacing_lg (24dp) padding      │
│  ┌───────────────────────────┐  │
│  │  spacing_xxl (48dp)       │  │ ← Top margin
│  │                           │  │
│  │  [TITLE - HeadlineMedium] │  │ ← Center-aligned
│  │  spacing_sm (8dp) gap     │  │
│  │  [Subtitle - BodyLarge]   │  │ ← Center-aligned, muted
│  │                           │  │
│  │  spacing_xxl (48dp)       │  │
│  │                           │  │
│  │  [PRIMARY CONTENT CARD]   │  │ ← Transparent w/ stroke
│  │  spacing_md (16dp) gap    │  │
│  │  [SECONDARY CONTENT]      │  │
│  │                           │  │
│  │  spacing_xl (32dp)        │  │
│  │                           │  │
│  │  [PRIMARY ACTION BUTTON]  │  │ ← Full width, 56dp height
│  │  spacing_lg (24dp)        │  │ ← Bottom margin
│  └───────────────────────────┘  │
└─────────────────────────────────┘
```

---

## 📏 Spacing System (4dp Grid)

### **CRITICAL: Use Existing Tokens from `dimens.xml`**

Zario has a **complete, standardized spacing system** already defined in `dimens.xml`. These tokens are used **consistently across the entire codebase**. 

**NEVER create new spacing values. ALWAYS use existing tokens.**

### **The ONLY Spacing Tokens (from `dimens.xml`)**

```xml
<!-- Source: app/src/main/res/values/dimens.xml -->

<!-- MICRO SPACING -->
<dimen name="spacing_xs">4dp</dimen>    <!-- Text line gaps, icon padding -->
<dimen name="spacing_sm">8dp</dimen>    <!-- Title-to-subtitle, tight gaps -->

<!-- STANDARD SPACING -->
<dimen name="spacing_md">16dp</dimen>   <!-- Card padding, form field gaps, content spacing -->
<dimen name="spacing_lg">24dp</dimen>   <!-- Screen edge padding, section gaps -->

<!-- MACRO SPACING -->
<dimen name="spacing_xl">32dp</dimen>   <!-- Major section breaks, button-to-content -->
<dimen name="spacing_xxl">48dp</dimen>  <!-- Title top margin, hero spacing -->
```

### **Spacing Usage Rules**

| Context | Token | Example |
|---------|-------|---------|
| Screen edge padding | `spacing_lg` | All root ConstraintLayouts |
| Title top margin | `spacing_xxl` | First element in screen |
| Title → Subtitle | `spacing_sm` | Hierarchical text pairs |
| Subtitle → Content | `spacing_xxl` | Hero → body transition |
| Card internal padding | `spacing_md` | MaterialCardView padding |
| Sequential cards | `spacing_md` | Card → Card vertical gap |
| Content → Button | `spacing_xl` | Major call-to-action separation |
| Button bottom margin | `spacing_lg` | Last element padding |

### **❌ NEVER DO THIS:**
```xml
<!-- WRONG: Hardcoded values -->
<TextView
    android:layout_marginTop="16dp"  ❌
    android:padding="20dp" />        ❌

<!-- RIGHT: Semantic tokens -->
<TextView
    android:layout_marginTop="@dimen/spacing_md"  ✓
    android:padding="@dimen/spacing_lg" />         ✓
```

---

## 🎭 Typography System

### **Material 3 Text Appearances (ONLY)**

```xml
<!-- TITLES (Center-aligned) -->
android:textAppearance="?attr/textAppearanceHeadlineMedium"
android:textColor="?attr/colorOnSurface"
android:gravity="center"

<!-- SUBTITLES (Center-aligned) -->
android:textAppearance="?attr/textAppearanceBodyLarge"
android:textColor="?attr/colorOnSurfaceVariant"
android:gravity="center"

<!-- CARD SECTION HEADERS -->
android:textAppearance="?attr/textAppearanceTitleMedium"
android:textColor="?attr/colorOnSurface"

<!-- BODY TEXT / DESCRIPTIONS -->
android:textAppearance="?attr/textAppearanceBodyMedium"
android:textColor="?attr/colorOnSurfaceVariant"

<!-- SMALL HELPER TEXT -->
android:textAppearance="?attr/textAppearanceBodySmall"
android:textColor="?attr/colorOnSurfaceVariant"

<!-- PRIMARY DATA DISPLAY -->
android:textAppearance="?attr/textAppearanceTitleLarge"
android:textColor="?attr/colorOnSurface" | "?attr/colorPrimary"

<!-- BUTTON LABELS (inside cards) -->
android:textAppearance="?attr/textAppearanceLabelLarge"
android:textColor="?attr/colorPrimary"
```

### **Typography Hierarchy Example**

```xml
<!-- Screen Title -->
<TextView
    android:textAppearance="?attr/textAppearanceHeadlineMedium"
    android:textColor="?attr/colorOnSurface"
    android:gravity="center"
    android:text="Welcome to Zario" />

<!-- Screen Subtitle -->
<TextView
    android:textAppearance="?attr/textAppearanceBodyLarge"
    android:textColor="?attr/colorOnSurfaceVariant"
    android:gravity="center"
    android:text="Sign in" />

<!-- Card Title -->
<TextView
    android:textAppearance="?attr/textAppearanceTitleMedium"
    android:textColor="?attr/colorOnSurface"
    android:text="Notifications" />

<!-- Card Description -->
<TextView
    android:textAppearance="?attr/textAppearanceBodySmall"
    android:textColor="?attr/colorOnSurfaceVariant"
    android:text="Receive daily reminders..." />
```

---

## 🎴 Card System

### **Standard Transparent Card Pattern**

```xml
<com.google.android.material.card.MaterialCardView
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_xxl"
    app:cardCornerRadius="@dimen/card_corner_radius"
    app:cardElevation="@dimen/card_elevation"
    app:cardBackgroundColor="@android:color/transparent"
    app:strokeColor="?attr/colorOutline"
    app:strokeWidth="@dimen/card_stroke_width"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="@dimen/spacing_md">
        
        <!-- Card content here -->
        
    </LinearLayout>
</com.google.android.material.card.MaterialCardView>
```

### **Card Constants**
```xml
<dimen name="card_corner_radius">4dp</dimen>    <!-- Subtle rounding -->
<dimen name="card_elevation">0dp</dimen>        <!-- Flat design -->
<dimen name="card_stroke_width">1dp</dimen>     <!-- Hairline border -->
```

### **Interactive Cards (Permissions Pattern)**
```xml
<!-- Add these for clickable cards -->
android:clickable="true"
android:focusable="true"
android:foreground="?attr/selectableItemBackground"
```

### **Card Content Structure**

```xml
<!-- Horizontal layout for action cards -->
<LinearLayout
    android:orientation="horizontal"
    android:gravity="center_vertical"
    android:padding="@dimen/spacing_md">

    <!-- Left: Information (weighted) -->
    <LinearLayout
        android:layout_width="0dp"
        android:layout_weight="1"
        android:orientation="vertical">
        
        <TextView
            android:textAppearance="?attr/textAppearanceTitleMedium"
            android:text="Title" />
        
        <TextView
            android:layout_marginTop="@dimen/spacing_xs"
            android:textAppearance="?attr/textAppearanceBodySmall"
            android:text="Description" />
    </LinearLayout>

    <!-- Right: Action/Status -->
    <TextView
        android:layout_width="wrap_content"
        android:textAppearance="?attr/textAppearanceLabelLarge"
        android:textColor="?attr/colorPrimary"
        android:text="Grant" />
</LinearLayout>
```

---

## 🔘 Button System

### **Primary Action Button (Full Width)**

```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/btn_continue"
    android:layout_width="0dp"
    android:layout_height="@dimen/button_height_primary"
    android:layout_marginTop="@dimen/spacing_xl"
    android:layout_marginBottom="@dimen/spacing_lg"
    android:text="Continue"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent" />
```

### **Button Dimensions**
```xml
<dimen name="button_height_primary">56dp</dimen>      <!-- Full CTAs -->
<dimen name="button_height_secondary">52dp</dimen>    <!-- Secondary actions -->
<dimen name="button_height_small">36dp</dimen>        <!-- Compact/inline -->
<dimen name="button_width_small">80dp</dimen>         <!-- Fixed-width labels -->
```

### **Button States**

```kotlin
// Loading state
binding.btnContinue.isEnabled = false
binding.btnContinue.text = getString(R.string.auth_signing_in)

// Active state
binding.btnContinue.isEnabled = true
binding.btnContinue.text = getString(R.string.flexstakes_continue_button)
```

### **Button Positioning**

- Always constrain to parent `Start` and `End` (full width)
- Use `spacing_xl` top margin from content above
- Use `spacing_lg` bottom margin (last element)
- Can also constrain to `layout_constraintBottom_toBottomOf="parent"` in ScrollView

---

## 🎨 Color System

### **Semantic Color Usage**

```xml
<!-- SURFACE COLORS (Text on backgrounds) -->
?attr/colorOnSurface           <!-- Primary text -->
?attr/colorOnSurfaceVariant    <!-- Secondary/muted text -->

<!-- PRIMARY BRAND COLOR -->
?attr/colorPrimary             <!-- Buttons, links, accents, data highlights -->
?attr/colorOnPrimary           <!-- Text on primary surfaces -->

<!-- BORDERS & DIVIDERS -->
?attr/colorOutline             <!-- Card strokes, dividers -->

<!-- STATE COLORS (Evaluation) -->
@color/evaluation_success      <!-- Green: #2E7D32 - Goals met -->
@color/evaluation_exceeded     <!-- Red: #D32F2F - Goals exceeded -->
@color/evaluation_on_track     <!-- Light green: #4CAF50 -->
@color/evaluation_over_goal    <!-- Orange: #FF9800 -->

<!-- NEUTRAL COLORS -->
@color/white                   <!-- #FFFFFFFF -->
@color/black                   <!-- #FF000000 -->
```

### **Color Rules**

| Element Type | Color Token | Usage |
|--------------|-------------|-------|
| Screen titles | `colorOnSurface` | Primary hierarchy |
| Subtitles | `colorOnSurfaceVariant` | Secondary hierarchy |
| Body text | `colorOnSurfaceVariant` | Descriptions, helpers |
| Primary actions | `colorPrimary` | Buttons, links |
| Success states | `evaluation_success` | Goals achieved |
| Warning states | `evaluation_exceeded` | Goals exceeded |
| Card borders | `colorOutline` | Subtle separation |
| Slider tracks (inactive) | `@color/white` | Neutral background |

### **❌ AVOID:**
- Using primary color for all text
- Creating custom colors without semantic meaning
- Hardcoded hex colors in layouts

---

## 📝 Form Input System

### **Standard Text Input Pattern**

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/til_email"
    style="@style/Widget.Material3.TextInputLayout.OutlinedBox"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_md"
    android:hint="@string/email_hint"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/et_email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:maxLines="1" />
</com.google.android.material.textfield.TextInputLayout>
```

### **Password Input with Toggle**

```xml
<com.google.android.material.textfield.TextInputLayout
    style="@style/Widget.Material3.TextInputLayout.OutlinedBox"
    app:endIconMode="password_toggle">
    
    <com.google.android.material.textfield.TextInputEditText
        android:inputType="textPassword"
        android:maxLines="1" />
</com.google.android.material.textfield.TextInputLayout>
```

### **Dropdown Menu Input**

```xml
<com.google.android.material.textfield.TextInputLayout
    style="@style/Widget.Material3.TextInputLayout.OutlinedBox.ExposedDropdownMenu"
    android:hint="@string/gender_hint">
    
    <AutoCompleteTextView
        android:id="@+id/et_gender"
        android:inputType="none"
        android:maxLines="1" />
</com.google.android.material.textfield.TextInputLayout>
```

### **Form Spacing**
- First input: `spacing_xxl` from subtitle
- Between inputs: `spacing_md`
- Input to button: `spacing_xl`

---

## 🎚️ Slider System (FlexStakes Pattern)

### **Slider with Labels Pattern**

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_md"
    android:orientation="horizontal"
    android:gravity="center_vertical">

    <!-- Min Label -->
    <TextView
        android:id="@+id/tv_reward_min_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?attr/textAppearanceBodyMedium"
        android:textColor="?attr/colorOnSurfaceVariant"
        android:minWidth="@dimen/slider_label_min_width"
        android:gravity="center"
        android:text="0" />

    <!-- Slider (weighted) -->
    <com.google.android.material.slider.Slider
        android:id="@+id/slider_reward"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:layout_marginHorizontal="@dimen/spacing_md"
        app:thumbColor="@color/evaluation_success"
        app:trackColorActive="@color/evaluation_success"
        app:trackColorInactive="@color/white" />

    <!-- Max Label -->
    <TextView
        android:id="@+id/tv_reward_max_label"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?attr/textAppearanceBodyMedium"
        android:textColor="?attr/colorOnSurfaceVariant"
        android:minWidth="@dimen/slider_label_min_width"
        android:gravity="center"
        android:text="10" />
</LinearLayout>

<!-- Value Display -->
<TextView
    android:id="@+id/tv_reward_value"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_sm"
    android:textAppearance="?attr/textAppearanceTitleMedium"
    android:gravity="center"
    android:text="5 points" />
```

### **RTL Slider for Reversed Scale**

```xml
<!-- For penalty slider (40 → 10, right to left) -->
<com.google.android.material.slider.Slider
    android:layoutDirection="rtl"
    app:thumbColor="@color/evaluation_exceeded"
    app:trackColorActive="@color/evaluation_exceeded"
    app:trackColorInactive="@color/white" />
```

### **Slider Configuration (Programmatic)**

```kotlin
// Set from Constants for maintainability
binding.sliderReward.apply {
    valueFrom = Constants.FLEXIBLE_REWARD_MIN.toFloat()
    valueTo = Constants.FLEXIBLE_REWARD_MAX.toFloat()
    stepSize = 1f
    value = Constants.FLEXIBLE_REWARD.toFloat()
}

// Update labels from Constants
binding.tvRewardMinLabel.text = Constants.FLEXIBLE_REWARD_MIN.toString()
binding.tvRewardMaxLabel.text = Constants.FLEXIBLE_REWARD_MAX.toString()
```

---

## 📊 Data Display Patterns

### **Large Metric Display**

```xml
<!-- Inside circular progress indicator -->
<TextView
    android:id="@+id/tv_current_usage"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:gravity="center"
    android:textAppearance="?attr/textAppearanceTitleLarge"
    android:textColor="?attr/colorOnSurface"
    android:text="2h 30m" />
```

### **Stats Card Pattern**

```xml
<LinearLayout
    android:orientation="vertical"
    android:padding="@dimen/spacing_md">

    <!-- Primary Stat -->
    <TextView
        android:textAppearance="?attr/textAppearanceTitleLarge"
        android:textColor="?attr/colorPrimary"
        android:text="Goal: 2h 00m" />

    <!-- Secondary Stat -->
    <TextView
        android:layout_marginTop="@dimen/spacing_md"
        android:textAppearance="?attr/textAppearanceTitleLarge"
        android:textColor="?attr/colorOnSurfaceVariant"
        android:text="Time remaining: 15m" />

    <!-- Tertiary Info -->
    <TextView
        android:layout_marginTop="@dimen/spacing_md"
        android:textAppearance="?attr/textAppearanceTitleLarge"
        android:textColor="?attr/colorOnSurfaceVariant"
        android:text="Total points: 125" />
</LinearLayout>
```

---

## 🔄 Progress Indicators

### **Circular Progress (Large)**

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:id="@+id/progress_indicator"
    android:layout_width="@dimen/progress_indicator_size"
    android:layout_height="@dimen/progress_indicator_size"
    app:indicatorSize="@dimen/progress_indicator_size"
    app:trackThickness="@dimen/progress_track_thickness"
    app:indicatorColor="?attr/colorPrimary"
    app:trackColor="?attr/colorSurfaceVariant" />
```

### **Progress Dimensions**
```xml
<dimen name="progress_indicator_size">200dp</dimen>
<dimen name="progress_track_thickness">8dp</dimen>
```

### **Small Loading Spinner**

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:layout_width="@dimen/icon_size_standard"
    android:layout_height="@dimen/icon_size_standard"
    android:indeterminate="true" />
```

---

## 🔗 Navigation Links

### **Text Link Pattern (Auth Screens)**

```xml
<LinearLayout
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_lg"
    android:layout_marginBottom="@dimen/spacing_lg"
    android:gravity="center_vertical"
    android:orientation="horizontal">

    <!-- Question text -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Don\'t have an account?"
        android:textAppearance="?attr/textAppearanceBodyMedium"
        android:textColor="?attr/colorOnSurfaceVariant" />

    <!-- Action link -->
    <TextView
        android:id="@+id/tv_signup_link"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="@dimen/spacing_xs"
        android:background="?attr/selectableItemBackgroundBorderless"
        android:padding="@dimen/spacing_sm"
        android:text="Sign up"
        android:textAppearance="?attr/textAppearanceBodyMedium"
        android:textColor="?attr/colorPrimary"
        android:textStyle="bold" />
</LinearLayout>
```

---

## 🖼️ Icon System

### **Icon Dimensions**
```xml
<dimen name="icon_size_standard">48dp</dimen>     <!-- Touch target -->
<dimen name="icon_size_small">36dp</dimen>        <!-- Compact contexts -->
<dimen name="menu_button_size">48dp</dimen>       <!-- Menu/hamburger -->
```

### **Icon Button Pattern**

```xml
<ImageButton
    android:id="@+id/btn_menu"
    android:layout_width="@dimen/menu_button_size"
    android:layout_height="@dimen/menu_button_size"
    android:background="?attr/selectableItemBackgroundBorderless"
    android:contentDescription="@string/menu_button_content_description"
    android:scaleType="center"
    android:src="@drawable/ic_more_vert" />
```

---

## 📱 Layout Structure

### **ScrollView Container Pattern**

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="@dimen/spacing_lg">
        
        <!-- Content here -->
        
    </androidx.constraintlayout.widget.ConstraintLayout>
</ScrollView>
```

### **Why ScrollView + ConstraintLayout?**
- Handles keyboards pushing content up
- Allows dynamic content heights
- Ensures button accessibility on small screens
- Maintains consistent padding

---

## 🎯 Fragment Implementation Checklist

### **Every Fragment MUST Have:**

```kotlin
// ✓ View binding lifecycle management
private var _binding: FragmentXxxBinding? = null
private val binding get() = _binding!!

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}

// ✓ Proper coroutine scope usage
viewLifecycleOwner.lifecycleScope.launch {
    viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
        // Collect flows here
    }
}

// ✓ Loading states for buttons
private fun setLoadingState(isLoading: Boolean) {
    binding.btnContinue.isEnabled = !isLoading
    binding.btnContinue.text = if (isLoading) {
        getString(R.string.loading_text)
    } else {
        getString(R.string.button_text)
    }
}
```

### **Every Layout MUST Have:**

1. `ScrollView` wrapper with `android:fillViewport="true"`
2. `ConstraintLayout` with `android:padding="@dimen/spacing_lg"`
3. Title with `spacing_xxl` top margin
4. Subtitle with `spacing_sm` below title
5. Content with `spacing_xxl` below subtitle
6. Primary button with `spacing_xl` above and `spacing_lg` below

---

## 📋 Component Quick Reference

### **Screen Title + Subtitle**
```xml
<TextView
    android:id="@+id/tv_title"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_xxl"
    android:gravity="center"
    android:textAppearance="?attr/textAppearanceHeadlineMedium"
    android:textColor="?attr/colorOnSurface"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />

<TextView
    android:id="@+id/tv_subtitle"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_sm"
    android:gravity="center"
    android:textAppearance="?attr/textAppearanceBodyLarge"
    android:textColor="?attr/colorOnSurfaceVariant"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/tv_title" />
```

### **Full-Width Primary Button**
```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/btn_continue"
    android:layout_width="0dp"
    android:layout_height="@dimen/button_height_primary"
    android:layout_marginTop="@dimen/spacing_xl"
    android:layout_marginBottom="@dimen/spacing_lg"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent" />
```

### **Transparent Card**
```xml
<com.google.android.material.card.MaterialCardView
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_marginTop="@dimen/spacing_xxl"
    app:cardCornerRadius="@dimen/card_corner_radius"
    app:cardElevation="@dimen/card_elevation"
    app:cardBackgroundColor="@android:color/transparent"
    app:strokeColor="?attr/colorOutline"
    app:strokeWidth="@dimen/card_stroke_width"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent">
    
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="@dimen/spacing_md">
        <!-- Content -->
    </LinearLayout>
</com.google.android.material.card.MaterialCardView>
```

---

## 🚫 Anti-Patterns to AVOID

### **CRITICAL VIOLATIONS (Code Review Failures)**

These violations will fail code review and must be fixed before merging:

#### ❌ **Violation 1: Hardcoded Dimensions**
```xml
<!-- WRONG: Hardcoded dp values -->
<TextView 
    android:layout_marginTop="16dp"
    android:padding="24dp"
    android:textSize="18sp" />

<!-- RIGHT: Use dimens.xml tokens -->
<TextView 
    android:layout_marginTop="@dimen/spacing_md"
    android:padding="@dimen/spacing_lg"
    android:textAppearance="?attr/textAppearanceHeadlineMedium" />
```

#### ❌ **Violation 2: Hardcoded Strings**
```xml
<!-- WRONG: Hardcoded text -->
<TextView android:text="Welcome to Zario" />
<MaterialButton android:text="Sign in" />

<!-- RIGHT: Use strings.xml -->
<TextView android:text="@string/welcome_title" />
<MaterialButton android:text="@string/login_button" />
```

```kotlin
// WRONG: Hardcoded strings in code
binding.tvError.text = "Email is required"
binding.tvTitle.text = "Settings"

// RIGHT: Use getString()
binding.tvError.text = getString(R.string.error_empty_email)
binding.tvTitle.text = getString(R.string.settings_title)
```

#### ❌ **Violation 3: Magic Numbers in Business Logic**
```kotlin
// WRONG: Hardcoded constants
if (password.length < 8) { ... }
val reward = 5
val penalty = 20
slider.valueTo = 10f

// RIGHT: Use Constants.kt
if (password.length < Constants.MIN_PASSWORD_LENGTH) { ... }
val reward = Constants.FLEXIBLE_REWARD
val penalty = Constants.FLEXIBLE_PENALTY
slider.valueTo = Constants.FLEXIBLE_REWARD_MAX.toFloat()
```

#### ❌ **Violation 4: Custom Colors Without Semantic Meaning**
```xml
<!-- WRONG: Hardcoded hex colors -->
<TextView android:textColor="#000000" />
<View android:background="#FF6200EE" />

<!-- RIGHT: Use theme attributes or semantic colors -->
<TextView android:textColor="?attr/colorOnSurface" />
<View android:background="?attr/colorPrimary" />
```

#### ❌ **Violation 5: Creating New Spacing Values**
```xml
<!-- WRONG: Custom spacing not in dimens.xml -->
<dimen name="my_custom_spacing">20dp</dimen>

<!-- RIGHT: Use existing spacing_* tokens -->
<!-- If 20dp is needed, use spacing_lg (24dp) or spacing_md (16dp) -->
<!-- The 4dp grid system covers all use cases -->
```

#### ❌ **Violation 6: Left-Aligned Screen Titles**
```xml
<!-- WRONG: Titles should be centered -->
<TextView
    android:gravity="start"
    android:text="@string/welcome_title" />

<!-- RIGHT: Center-align hero content -->
<TextView
    android:gravity="center"
    android:text="@string/welcome_title" />
```

#### ❌ **Violation 7: Elevated/Filled Cards**
```xml
<!-- WRONG: Material Design 2 style -->
<MaterialCardView
    app:cardElevation="4dp"
    app:cardBackgroundColor="@color/purple_500" />

<!-- RIGHT: Zario transparent card style -->
<MaterialCardView
    app:cardElevation="@dimen/card_elevation"
    app:cardBackgroundColor="@android:color/transparent"
    app:strokeColor="?attr/colorOutline"
    app:strokeWidth="@dimen/card_stroke_width" />
```

#### ❌ **Violation 8: Arbitrary Spacing Values**
```xml
<!-- WRONG: Non-standard spacing -->
<View android:layout_marginTop="14dp" />
<View android:layout_marginTop="20dp" />
<View android:layout_marginTop="28dp" />

<!-- RIGHT: Use closest semantic token from 4dp grid -->
<View android:layout_marginTop="@dimen/spacing_md" />   <!-- 16dp -->
<View android:layout_marginTop="@dimen/spacing_lg" />   <!-- 24dp -->
<View android:layout_marginTop="@dimen/spacing_xl" />   <!-- 32dp -->
```

---

### **Enforcement Checklist**

Before submitting any code, verify:

- [ ] **No hardcoded `dp`, `sp`, or `px` values** — All dimensions from `dimens.xml`
- [ ] **No hardcoded strings in XML** — All text from `strings.xml`
- [ ] **No hardcoded strings in Kotlin** — All use `getString(R.string.*)`
- [ ] **No magic numbers** — All business logic values from `Constants.kt`
- [ ] **No custom colors** — Use `?attr/` theme attributes or semantic `@color/`
- [ ] **Screen titles centered** — `android:gravity="center"`
- [ ] **Cards are transparent** — `cardBackgroundColor="@android:color/transparent"`
- [ ] **Spacing uses existing tokens** — No new `spacing_*` dimensions created

<!-- RIGHT -->
<TextView android:textColor="?attr/colorOnSurface" />
```

❌ Create filled/elevated cards
```xml
<!-- WRONG -->
<MaterialCardView
    app:cardElevation="4dp"
    app:cardBackgroundColor="@color/purple_500" />

<!-- RIGHT -->
<MaterialCardView
    app:cardElevation="@dimen/card_elevation"
    app:cardBackgroundColor="@android:color/transparent"
    app:strokeColor="?attr/colorOutline"
    app:strokeWidth="@dimen/card_stroke_width" />
```

❌ Left-align screen titles
```xml
<!-- WRONG -->
<TextView
    android:gravity="start"
    android:text="Welcome" />

<!-- RIGHT -->
<TextView
    android:gravity="center"
    android:text="Welcome" />
```

❌ Use arbitrary spacing values
```xml
<!-- WRONG -->
<View android:layout_marginTop="14dp" />

<!-- RIGHT - Use closest semantic token -->
<View android:layout_marginTop="@dimen/spacing_md" />
```

---

## 🎓 Design Decision Rationale

### **Why Transparent Cards?**
- Reduces visual weight
- Creates cohesive, unified surface
- Focuses attention on content, not containers
- Aligns with Material 3 surface tinting principles

### **Why Center-Aligned Titles?**
- Creates clear focal point
- Emphasizes screen purpose immediately
- Reduces left-to-right eye scanning
- Establishes calm, balanced hierarchy

### **Why Zero Elevation?**
- Aligns with Material 3 flat design
- Reduces visual noise
- Stroke borders provide sufficient separation
- Creates modern, minimalist aesthetic

### **Why 4dp Grid System?**
- Mathematical consistency
- Predictable visual rhythm
- Easy mental math (4, 8, 16, 24, 32, 48)
- Aligns with Material Design specifications

### **Why Generous Whitespace?**
- Reduces cognitive load
- Improves readability
- Creates breathing room
- Emphasizes important elements through isolation

---

## 📚 Related Resources

- [Material 3 Design Kit](https://m3.material.io/)
- [Material 3 Typography Scale](https://m3.material.io/styles/typography/type-scale-tokens)
- [Material 3 Color System](https://m3.material.io/styles/color/the-color-system/color-roles)
- [Android Spacing Guidelines](https://material.io/design/layout/spacing-methods.html)

---

## ✅ Pre-Flight Checklist for New Screens

Before submitting any new layout:

- [ ] Uses `ScrollView` + `ConstraintLayout` structure
- [ ] Has `spacing_lg` root padding
- [ ] Title has `spacing_xxl` top margin
- [ ] Title is center-aligned with `HeadlineMedium`
- [ ] Subtitle is center-aligned with `BodyLarge` and muted color
- [ ] All spacing uses semantic tokens (no hardcoded `dp`)
- [ ] All text uses `?attr/textAppearance*` tokens
- [ ] All colors use `?attr/color*` tokens
- [ ] Cards are transparent with stroke borders
- [ ] Cards have zero elevation
- [ ] Primary button is full-width with `button_height_primary`
- [ ] Button has `spacing_xl` top and `spacing_lg` bottom margins
- [ ] No left-aligned hero content (titles/subtitles)
- [ ] Form inputs use `spacing_md` vertical gaps
- [ ] Loading states implemented for async actions

---

## 🎨 Summary: The Zario Look

**Minimalist. Centered. Breathable. Standardized. Semantic.**

### **Core Values:**
- **No hardcoded values** — `dimens.xml` + `strings.xml` + `Constants.kt` only
- **Hierarchy through type, not color** — Material 3 text appearances
- **Transparency over elevation** — Flat cards with stroke borders
- **Generous whitespace over dense layouts** — 4dp grid system
- **Semantic tokens over arbitrary values** — Named, meaningful resources
- **Center-aligned heroes over left-aligned** — Focal point emphasis
- **Purposeful color over decorative color** — Semantic meaning only
- **Existing dimensions over new ones** — Reuse standardized tokens

### **Three Commandments:**
1. **Thou shalt not hardcode dimensions** — Use `@dimen/spacing_*` from `dimens.xml`
2. **Thou shalt not hardcode strings** — Use `@string/*` from `strings.xml`
3. **Thou shalt not hardcode business values** — Use `Constants.*` from `Constants.kt`

---

**Maintained by:** Design System Team  
**Questions?** Reference `LoginFragment.kt`, `SignupFragment.kt`, or `FlexStakesFragment.kt` as canonical examples.

**Resource Files:**
- `app/src/main/res/values/dimens.xml` — All dimensions
- `app/src/main/res/values/strings.xml` — All user-facing text
- `app/src/main/java/com/niyaz/zario/Constants.kt` — All business logic values

---

*"Simplicity is the ultimate sophistication." — Leonardo da Vinci*
