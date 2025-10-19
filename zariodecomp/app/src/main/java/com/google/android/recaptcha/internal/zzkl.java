package com.google.android.recaptcha.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzkl.smali */
final class zzkl {
    public static void zza(boolean z4, String str, long j5, long j6) {
        if (z4) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j5 + ", " + j6 + ")");
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
