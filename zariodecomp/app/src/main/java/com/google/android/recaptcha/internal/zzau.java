package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzau.smali */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar = zzav.zzb;
        if (zzavVar != null) {
            return zzavVar;
        }
        zzav zzavVar2 = new zzav((Map) zzav.zzd.invoke(), null);
        zzav.zzc.clear();
        zzav.zzb = zzavVar2;
        return zzavVar2;
    }
}
