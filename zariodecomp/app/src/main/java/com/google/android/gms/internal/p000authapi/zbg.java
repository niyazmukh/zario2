package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import b1.C0259a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbg.smali */
final class zbg extends zbm {
    final /* synthetic */ C0259a zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(zbl zblVar, o oVar, C0259a c0259a) {
        super(oVar);
        this.zba = c0259a;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zba(Context context, zbt zbtVar) {
        zbtVar.zbd(new zbf(this), this.zba);
    }
}
