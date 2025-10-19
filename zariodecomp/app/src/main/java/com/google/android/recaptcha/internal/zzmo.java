package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzmo.smali */
public final class zzmo {
    static final zzmo zza = new zzmo(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    public zzmo() {
        this.zzd = new HashMap();
    }

    public final zznc zza(zzoi zzoiVar, int i) {
        return (zznc) this.zzd.get(new zzmn(zzoiVar, i));
    }

    public zzmo(boolean z4) {
        this.zzd = Collections.emptyMap();
    }
}
