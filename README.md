# Zario - Digital Wellbeing Research App

A modern Android application designed for digital wellbeing research at the University of Haifa. This app helps users monitor and manage their smartphone usage through intelligent interventions and goal-setting features.

## 📱 About

Zario is a research-focused digital wellbeing application that implements behavioral intervention strategies to promote healthier smartphone usage patterns. The app features real-time usage monitoring, personalized goal setting, and intelligent notification systems.

## 🎯 Features

- **Real-time Usage Monitoring**: Track app usage patterns with precision
- **Goal Setting**: Set daily usage targets for specific applications
- **Intelligent Interventions**: Receive timely notifications at 80% usage threshold
- **Progress Tracking**: Monitor usage patterns across evaluation cycles
- **User Authentication**: Secure login and registration system
- **Modern Architecture**: Built with MVVM, Hilt dependency injection, and Room database

## 🏛️ Research Context

**Developer**: Niyaz Mukhametzyanov
**Institution**: University of Haifa  
**Purpose**: Academic research in digital wellbeing and behavioral intervention strategies

This application is developed as part of research initiatives at the University of Haifa, focusing on:
- Digital wellbeing intervention effectiveness
- Smartphone usage pattern analysis
- Behavioral change through technology
- User engagement in digital health applications

## 🛠️ Technical Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Dependency Injection**: Hilt
- **Database**: Room with DataStore preferences
- **Background Processing**: WorkManager
- **Navigation**: Navigation Component
- **UI**: Material Design components
- **Build System**: Gradle with Kotlin DSL

## 📋 Prerequisites

- Android Studio Hedgehog or later
- Android SDK 29+ (API level 29)
- Kotlin 2.0.21+
- Gradle 8.12.0+

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/niyazmukh/zario2.git
   cd zario2
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Open the project directory
   - Sync Gradle files

3. **Configure Firebase** (Required for authentication)
   - Create a Firebase project
   - Download `google-services.json`
   - Place it in the `app/` directory

4. **Build and Run**
   - Connect an Android device or start an emulator
   - Click "Run" in Android Studio

## 📁 Project Structure

```
app/
├── src/main/
│   ├── java/com/niyaz/zario/
│   │   ├── data/           # Data models and database
│   │   ├── di/             # Dependency injection
│   │   ├── repository/     # Data repositories
│   │   ├── ui/             # UI components and ViewModels
│   │   ├── utils/          # Utility classes
│   │   └── worker/         # Background workers
│   └── res/                # Resources (layouts, values, etc.)
```

## 🔧 Configuration

### Required Permissions
- `PACKAGE_USAGE_STATS`: Monitor app usage
- `POST_NOTIFICATIONS`: Send intervention notifications
- `INTERNET`: Authentication and data sync

### Firebase Setup
1. Create a Firebase project
2. Enable Authentication (Email/Password)
3. Download `google-services.json`
4. Add to `app/` directory

## 📊 Research Features

### Usage Monitoring
- Real-time app usage tracking
- Background monitoring via WorkManager
- Usage statistics aggregation

### Intervention System
- 80% usage threshold notifications
- Evaluation cycle management
- Progress tracking across cycles

### Data Collection
- Usage patterns analysis
- Intervention effectiveness metrics
- User engagement tracking

## 🤝 Contributing

This is a research project. For collaboration inquiries, please contact:
- **Developer**: Niyaz Mukhametzyanov
- **Institution**: University of Haifa

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🔬 Research Ethics

This application is designed for academic research purposes. All data collection and user interactions comply with:
- University of Haifa research ethics guidelines
- GDPR compliance for data protection
- Informed consent protocols

## 📞 Contact

For research-related inquiries:
- **email**: nmukhame@campus.haifa.ac.il

---

*This project is developed for academic research purposes at the University of Haifa.* 