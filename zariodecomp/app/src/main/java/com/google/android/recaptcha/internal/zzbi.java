package com.google.android.recaptcha.internal;

import S0.f;
import f4.B0;
import f4.C;
import f4.C0495a0;
import f4.E;
import f4.N;
import java.util.concurrent.Executors;
import k4.c;
import k4.n;
import m4.d;
import m4.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbi.smali */
public final class zzbi {
    private final C zza;
    private final C zzb;
    private final C zzc;
    private final C zzd;

    public zzbi() {
        B0 b0D = E.d();
        e eVar = N.f7027a;
        this.zza = new c(f.U(b0D, n.f8401a));
        c cVarB = E.b(new C0495a0(Executors.newSingleThreadExecutor()));
        E.t(cVarB, null, null, new zzbh(null), 3);
        this.zzb = cVarB;
        this.zzc = E.b(d.f8928c);
        c cVarB2 = E.b(new C0495a0(Executors.newSingleThreadExecutor()));
        E.t(cVarB2, null, null, new zzbg(null), 3);
        this.zzd = cVarB2;
    }

    public final C zza() {
        return this.zzc;
    }

    public final C zzb() {
        return this.zza;
    }

    public final C zzc() {
        return this.zzd;
    }

    public final C zzd() {
        return this.zzb;
    }
}
