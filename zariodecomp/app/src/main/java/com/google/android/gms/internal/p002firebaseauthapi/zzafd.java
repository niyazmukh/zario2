package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Locale;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafd.smali */
public final class zzafd {
    public static String zza() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        zza(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            zza(sb, locale2);
        }
        return sb.toString();
    }

    private static void zza(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
