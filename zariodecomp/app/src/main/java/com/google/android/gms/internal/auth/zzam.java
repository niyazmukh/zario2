package com.google.android.gms.internal.auth;

import Y0.d;
import Y0.e;
import Y0.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;
import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzam.smali */
public final class zzam extends AbstractC0373k {
    public zzam(Context context, Looper looper, C0370h c0370h, m mVar, n nVar) {
        super(context, looper, 120, c0370h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = e.a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final C0590c[] getApiFeatures() {
        return new C0590c[]{X0.d.f3717d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
