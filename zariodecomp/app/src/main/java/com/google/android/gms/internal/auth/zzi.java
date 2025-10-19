package com.google.android.gms.internal.auth;

import X0.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;
import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzi.smali */
final class zzi extends AbstractC0373k {
    public zzi(Context context, Looper looper, C0370h c0370h, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        super(context, looper, 224, c0370h, interfaceC0345g, interfaceC0355q);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final C0590c[] getApiFeatures() {
        return new C0590c[]{d.f3716c, d.f3715b, d.f3714a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
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
