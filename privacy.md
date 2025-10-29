# Zario — Privacy Declaration

Last updated: 2025-10-29

This document explains what information the Zario app may collect, why it's collected, how it is used, and how you can exercise your privacy choices. This is a short, developer-friendly summary and not a substitute for full legal privacy policies required in some jurisdictions.

## 1. App owner / contact

Zario (app package: `com.niyaz.zario`)
For privacy questions or data requests, contact: nmukhame@campus.haifa.ac.il.

## 2. Data types the app may collect

- Account / identity
  - Firebase Authentication account id, email address. Used to identify your account and secure access.

- User content
  - Data you explicitly store in the app (usage records). Stored in your Firestore project.

- Local storage
  - The app may store local data using Room (SQLite) and Android DataStore (preferences). This data stays on the device unless you sync or upload it to Firestore.

## 3. Third-party services and data processors

- Firebase (Google): Authentication, Firestore, and other Firebase services as configured by the developer. Firebase processes data on behalf of the app owner; see Google's privacy and processing terms.
- Google Play: distribution and crash reporting aggregation; the Play Console consumes uploaded deobfuscation files (mapping and native symbol zips) to show readable crash stacks.

## 4. Purpose and legal basis

Data is collected and used to:
- Provide and secure app features (authentication, data sync, user preferences).
- Store user data you create inside the app (Firestore).
- Diagnose, fix crashes and improve app stability and performance.
- Optional analytics or troubleshooting tools if enabled by the developer.

## 5. Data retention and deletion

- User content stored in Firestore is retained according to the app owner's backend retention policy. Contact the app owner to request deletion or export of your data.
- Local data (Room, DataStore) remains on your device until you delete the app or the data within the app.

## 6. Security

The app uses standard Android platform protections and TLS (for Firebase/Firestore) for network transfers. The developer keeps build-time debug symbols private; only aggregated crash reports without symbol resolution are available to Google unless the developer uploads symbol files to the Play Console for deobfuscation.

## 7. Your choices and rights

- Sign-out / account deletion: If you use Firebase Authentication, sign out from the app. To remove account data from backend (Firestore), contact the app owner/maintainer.
- Local controls: You can clear app data or uninstall the app to remove local data.
- Privacy rights (access, portability, deletion): Submit a request to the contact email above; provide account identifiers to help process your request.

## 8. Changes to this declaration

This file may be updated when app features or backend processing changes. Check the `Last updated` date at the top.

---
Disclaimer: This is a short-form privacy summary prepared for developer convenience. It is not legal advice, nor a legal declaration.