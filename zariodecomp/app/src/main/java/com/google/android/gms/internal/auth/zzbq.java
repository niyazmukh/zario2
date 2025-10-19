package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.o;
import e1.C0448a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbq.smali */
final class zzbq extends zzbi {
    final /* synthetic */ C0448a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, o oVar, C0448a c0448a) {
        super(oVar);
        this.zza = c0448a;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
