package j1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.base.zaf;
import h1.C0590c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j1.1\c.smali */
public final class c extends AbstractC0373k {

    /* renamed from: a, reason: collision with root package name */
    public final u f8039a;

    public c(Context context, Looper looper, C0370h c0370h, u uVar, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        super(context, looper, 270, c0370h, interfaceC0345g, interfaceC0355q);
        this.f8039a = uVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C0625a ? (C0625a) iInterfaceQueryLocalInterface : new C0625a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final C0590c[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f8039a.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
