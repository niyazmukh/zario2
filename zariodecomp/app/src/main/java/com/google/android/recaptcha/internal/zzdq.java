package com.google.android.recaptcha.internal;

import X3.a;
import android.app.Application;
import kotlin.jvm.internal.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzdq.smali */
public final class zzdq extends j implements a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // X3.a
    public final Object invoke() throws zzbd {
        int i = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
