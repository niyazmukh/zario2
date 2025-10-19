package z1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\a.smali */
public final class C1066a extends AbstractC0373k implements com.google.android.gms.common.api.g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11199e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11200a;

    /* renamed from: b, reason: collision with root package name */
    public final C0370h f11201b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11202c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11203d;

    public C1066a(Context context, Looper looper, C0370h c0370h, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c0370h, mVar, nVar);
        this.f11200a = true;
        this.f11201b = c0370h;
        this.f11202c = bundle;
        this.f11203d = c0370h.f5706g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1069d ? (C1069d) iInterfaceQueryLocalInterface : new C1069d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Bundle getGetServiceRequestExtraArgs() {
        C0370h c0370h = this.f11201b;
        boolean zEquals = getContext().getPackageName().equals(c0370h.f5703d);
        Bundle bundle = this.f11202c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0370h.f5703d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f11200a;
    }
}
