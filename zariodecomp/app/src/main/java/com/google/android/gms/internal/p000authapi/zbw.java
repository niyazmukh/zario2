package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c1.q;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;
import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbw.smali */
public final class zbw extends AbstractC0373k {
    private final Bundle zba;

    public zbw(Context context, Looper looper, q qVar, C0370h c0370h, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        super(context, looper, 219, c0370h, interfaceC0345g, interfaceC0355q);
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("session_id", qVar.a);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return iInterfaceQueryLocalInterface instanceof zbaa ? (zbaa) iInterfaceQueryLocalInterface : new zbaa(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final C0590c[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
