package com.google.android.gms.internal.fido;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\fido\zzas.smali */
final class zzas {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.l("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
