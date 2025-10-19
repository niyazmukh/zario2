package com.google.android.gms.internal.common;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzr.smali */
public final class zzr {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static int zzb(int i, int i5, String str) {
        String strZza;
        if (i >= 0 && i < i5) {
            return i;
        }
        if (i < 0) {
            strZza = zzx.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i5 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
                sb.append("negative size: ");
                sb.append(i5);
                throw new IllegalArgumentException(sb.toString());
            }
            strZza = zzx.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzc(int i, int i5, String str) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(zze(i, i5, "index"));
        }
        return i;
    }

    public static void zzd(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? zze(i, i6, "start index") : (i5 < 0 || i5 > i6) ? zze(i5, i6, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    private static String zze(int i, int i5, String str) {
        if (i < 0) {
            return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }
}
