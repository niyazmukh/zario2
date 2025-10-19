package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzjf.smali */
public final class zzjf {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c5)));
        }
    }

    public static void zzd(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzf(i, i6, "start index") : (i5 < 0 || i5 > i6) ? zzf(i5, i6, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i, int i5, String str) {
        return i < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
    }
}
