package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.C;
import e1.C0448a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbt.smali */
public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        C.f(oVar);
        return ((G) oVar).f5573b.doWrite((l) new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, C0448a c0448a) {
        C.f(oVar);
        C.f(c0448a);
        return ((G) oVar).f5573b.doWrite((l) new zzbq(this, oVar, c0448a));
    }
}
