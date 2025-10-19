package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzcn.smali */
final class zzcn {
    static final String zza;
    static final Comparator zzb;

    static {
        Comparator comparator;
        String strConcat = zzcn.class.getName().concat("$UnsafeComparator");
        zza = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzcm.INSTANCE;
        }
        zzb = comparator;
    }
}
