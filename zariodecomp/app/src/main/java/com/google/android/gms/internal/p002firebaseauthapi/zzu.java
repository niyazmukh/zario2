package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzu.smali */
public final class zzu {
    public static int zza(int i, int i5) {
        String strZza;
        if (i >= 0 && i < i5) {
            return i;
        }
        if (i < 0) {
            strZza = zzac.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(a.g(i5, "negative size: "));
            }
            strZza = zzac.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i5) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(zzb(i, i5, "index"));
        }
        return i;
    }

    private static String zzb(int i, int i5, String str) {
        if (i < 0) {
            return zzac.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return zzac.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(a.g(i5, "negative size: "));
    }

    public static int zza(int i, int i5, String str) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(zzb(i, i5, str));
        }
        return i;
    }

    public static <T> T zza(T t4) {
        t4.getClass();
        return t4;
    }

    public static void zza(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(zzp.zza(obj));
        }
    }

    public static void zza(int i, int i5, int i6) {
        String strZzb;
        if (i < 0 || i5 < i || i5 > i6) {
            if (i < 0 || i > i6) {
                strZzb = zzb(i, i6, "start index");
            } else if (i5 >= 0 && i5 <= i6) {
                strZzb = zzac.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i));
            } else {
                strZzb = zzb(i5, i6, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
