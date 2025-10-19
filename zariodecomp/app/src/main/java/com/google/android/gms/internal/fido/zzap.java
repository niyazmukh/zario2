package com.google.android.gms.internal.fido;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzap.smali */
public final class zzap {
    public static int zza(int i, int i5, String str) {
        String strZza;
        if (i >= 0 && i < i5) {
            return i;
        }
        if (i < 0) {
            strZza = zzaq.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(a.g(i5, "negative size: "));
            }
            strZza = zzaq.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i5, String str) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(zzf(i, i5, "index"));
        }
        return i;
    }

    public static void zzc(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(zzaq.zza(str, Character.valueOf(c5)));
        }
    }

    public static void zze(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zzf(i, i6, "start index") : (i5 < 0 || i5 > i6) ? zzf(i5, i6, "end index") : zzaq.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    private static String zzf(int i, int i5, String str) {
        if (i < 0) {
            return zzaq.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return zzaq.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(a.g(i5, "negative size: "));
    }
}
