package com.google.android.gms.internal.auth;

import Z0.c;
import Z0.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzbe.smali */
public final class zzbe extends AbstractC0373k {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C0370h c0370h, d dVar, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        super(context, looper, 16, c0370h, interfaceC0345g, interfaceC0355q);
        this.zze = dVar == null ? new Bundle() : new Bundle(dVar.f3946a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        C0370h clientSettings = getClientSettings();
        clientSettings.getClass();
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        if (clientSettings.f5702c.get(c.f3944a) == null) {
            return !clientSettings.f5700a.isEmpty();
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
