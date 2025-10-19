package com.google.android.gms.internal.p000authapi;

import Z0.b;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0342d;
import com.google.android.gms.common.api.o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbm.smali */
abstract class zbm extends AbstractC0342d {
    public zbm(o oVar) {
        super(b.f3942a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0342d
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0343e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zbm) obj);
    }

    public abstract void zba(Context context, zbt zbtVar);
}
