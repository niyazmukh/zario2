# Zario — Digital Wellbeing Research App

Zario is a modern Android application created at the University of Haifa to explore digital wellbeing interventions. It observes real-world smartphone behaviour, helps participants define intentional usage goals, and nudges them with timely interventions when attention drifts.

---

## 🧭 Overview
- **Research-driven**: Purpose-built for academic studies around behavioural change and responsible technology use.
- **Participant-first**: Surfaces actionable insights and gentle prompts without overwhelming the user.
- **Privacy aware**: Collects only the metrics required for evaluation cycles under approved research protocols.

The pipeline and research methodology are described in detail in [`docs/screen_time_tracking_pipeline.md`](docs/screen_time_tracking_pipeline.md).

---

## ✨ Feature Highlights
- **Usage intelligence** – Collect fine-grained usage events via Android’s UsageStats APIs.
- **Goal planning** – Allow participants to configure daily targets and focus apps.
- **Adaptive interventions** – Trigger notifications and in-app guidance when 80 % of a target is reached.
- **Progress dashboards** – Summaries for current and historical evaluation cycles.
- **Secure onboarding** – Authentication flow with validation rules and stored session metadata.

---

## 🧩 Architecture & Design
- **Tech stack**: Kotlin, Gradle Kotlin DSL, AndroidX, Material Design 3.
- **Architecture pattern**: MVVM with reactive state flows.
- **Dependency injection**: Hilt for application, worker, and ViewModel graphs.
- **Persistence**: Room for structured data, DataStore Preferences for lightweight key–value storage.
- **Background work**: WorkManager orchestrates long-running monitoring and intervention scheduling.
- **Navigation**: Jetpack Navigation Component powers a multi-module flow with deep links.

Key layers:
1. **Data** (`data/`, `repository/`) – Handles app usage queries, evaluation history storage, and session state.
2. **Domain & presentation** (`ui/`, `viewmodels/`) – Exposes stateful flows consumed by fragments.
3. **Workers** (`worker/`) – Schedule periodic monitoring and notification dispatch.
4. **Utilities** (`utils/`) – Centralised helpers for usage stats, calendar logic, and notifications.

---

## �️ Prerequisites
- Android Studio Hedgehog (2023.1.1) or newer
- Android SDK Platform 34 with build tools 34.0.0+
- Kotlin 2.0.21+
- Java 11 (toolchain is configured for JVM 11)

---

## 🚀 Quickstart
1. **Clone the repository**
   ```bash
   git clone https://github.com/niyazmukh/zario2.git
   cd zario2
   ```

2. **Open in Android Studio**
   - Select *File → Open…*
   - Choose the project root and allow Gradle sync to finish.

3. **Set up Firebase** (required for authentication flows)
   - Create a Firebase project and enable *Email/Password* authentication.
   - Download `google-services.json` and place it under `app/`.

4. **Run the app**
   - Connect a device or launch an emulator with API 29+.
   - Click ▶️ in Android Studio, or build from the command line:
     ```bash
     ./gradlew assembleDebug
     ```

5. **(Optional) Generate release-ready artefacts**
   - Use `./gradlew bundleRelease` or `assembleRelease` once your signing and distribution setup is configured.

---

## 🧪 Quality & Testing
- **Unit tests**
  ```bash
  ./gradlew test
  ```
- **Instrumented tests** (requires connected device/emulator)
  ```bash
  ./gradlew connectedAndroidTest
  ```
- **Static analysis** – Android Lint and Kotlin compiler warnings run automatically as part of the Gradle build. Use `./gradlew lint` for a dedicated report.

Test coverage currently focuses on repository logic and ViewModel state; contributions that expand scenario coverage are welcome.

---

## 📁 Project Layout
```
app/
├── build.gradle.kts
├── src/
│   ├── main/
│   │   ├── java/com/niyaz/zario/
│   │   │   ├── data/                # Room entities, DAO definitions, usage data mappers
│   │   │   ├── di/                  # Hilt modules and qualifiers
│   │   │   ├── repository/          # Business logic and data orchestration
│   │   │   ├── ui/                  # Fragments, adapters, ViewModels, navigation graph
│   │   │   ├── utils/               # Helpers for notifications, calendar maths, usage stats
│   │   │   └── worker/              # WorkManager tasks for monitoring & scheduling
│   │   └── res/                     # Material components, layouts, themes, menus
└── baselineprofile/                 # Baseline profiles for performance
```

Additional documentation lives in the `docs/` directory.

---

## 🏛️ Research Context
- **Developer**: Niyaz Mukhametzyanov
- **Institution**: University of Haifa
- **Focus areas**:
  - Evaluating the effectiveness of digital wellbeing interventions
  - Analysing smartphone usage trends during controlled studies
  - Exploring long-term behavioural change mechanisms
  - Measuring participant engagement with supportive tooling

Ethical approval and participant consent requirements are honoured through institutional review processes.

---

## 📄 License
Licensed under the MIT License. See [`LICENSE`](LICENSE) for details.

---

## � Contact & Collaboration
For collaboration or research inquiries:
- **Email**: nmukhame@campus.haifa.ac.il

This repository supports an active research effort—please reach out before proposing major changes so we can align with study timelines.

---

*Developed for academic research at the University of Haifa. Together, let’s promote healthier relationships with our devices.*