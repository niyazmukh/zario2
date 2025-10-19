package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zznv.smali */
final class zznv {
    public static final List zza(Object obj, long j5) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j5);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j5, zznkVarZzd);
        return zznkVarZzd;
    }
}
