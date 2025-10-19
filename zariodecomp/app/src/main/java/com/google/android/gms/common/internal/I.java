package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import h1.C0588a;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\I.smali */
public final class I extends A {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f5672g;
    public final /* synthetic */ AbstractC0368f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0368f abstractC0368f, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0368f, i, bundle);
        Objects.requireNonNull(abstractC0368f);
        this.h = abstractC0368f;
        this.f5672g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean a() throws RemoteException {
        IBinder iBinder = this.f5672g;
        try {
            C.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0368f abstractC0368f = this.h;
            if (!abstractC0368f.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC0368f.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = abstractC0368f.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(abstractC0368f.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC0368f.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            abstractC0368f.zzn(null);
            InterfaceC0364b interfaceC0364bZzk = abstractC0368f.zzk();
            abstractC0368f.getConnectionHint();
            if (interfaceC0364bZzk == null) {
                return true;
            }
            ((InterfaceC0345g) ((r) abstractC0368f.zzk()).f5746a).d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.A
    public final void b(C0588a c0588a) {
        AbstractC0368f abstractC0368f = this.h;
        if (abstractC0368f.zzl() != null) {
            ((InterfaceC0355q) ((r) abstractC0368f.zzl()).f5746a).a(c0588a);
        }
        abstractC0368f.onConnectionFailed(c0588a);
    }
}
