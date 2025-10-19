package com.google.android.gms.internal.p000authapi;

import S0.v;
import Z0.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbo.smali */
public final class zbo extends AbstractC0373k {
    private final a zba;

    public zbo(Context context, Looper looper, C0370h c0370h, a aVar, m mVar, n nVar) {
        super(context, looper, 68, c0370h, mVar, nVar);
        aVar = aVar == null ? a.f3939c : aVar;
        v vVar = new v(6);
        vVar.f2935b = Boolean.FALSE;
        a aVar2 = a.f3939c;
        aVar.getClass();
        vVar.f2935b = Boolean.valueOf(aVar.f3940a);
        vVar.f2936c = aVar.f3941b;
        vVar.f2936c = zbbj.zba();
        this.zba = new a(vVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbt ? (zbt) iInterfaceQueryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Bundle getGetServiceRequestExtraArgs() {
        a aVar = this.zba;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f3940a);
        bundle.putString("log_session_id", aVar.f3941b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final a zba() {
        return this.zba;
    }
}
