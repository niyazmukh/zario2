package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzad.smali */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    public final zzad zzb(Object obj) {
        zza(obj);
        return this;
    }

    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            zza(it.next());
        }
        return this;
    }

    public final zzah zzd() {
        this.zzc = true;
        return zzah.zzq(this.zza, this.zzb);
    }

    public zzad(int i) {
        super(4);
    }
}
