package com.google.android.gms.internal.auth;

import Z0.c;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC0342d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbj.smali */
abstract class zzbj extends AbstractC0342d {
    public zzbj(o oVar) {
        super(c.f3944a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0342d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0343e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzbj) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
