package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzej.smali */
public final class zzej {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(String str, long j5, int i) {
        this.zza = str;
        this.zzb = j5;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzej)) {
            return false;
        }
        zzej zzejVar = (zzej) obj;
        return i.a(zzejVar.zza, this.zza) && zzejVar.zzb == this.zzb && zzejVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
