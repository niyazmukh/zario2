package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\H.smali */
public final class H implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f5670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368f f5671b;

    public H(AbstractC0368f abstractC0368f, int i) {
        Objects.requireNonNull(abstractC0368f);
        this.f5671b = abstractC0368f;
        this.f5670a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f5671b.zzf(16);
            return;
        }
        AbstractC0368f abstractC0368f = this.f5671b;
        synchronized (abstractC0368f.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0368f.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0377o)) ? new B(iBinder) : (InterfaceC0377o) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5671b.zzb(0, null, this.f5670a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0368f abstractC0368f = this.f5671b;
        synchronized (abstractC0368f.zzh()) {
            abstractC0368f.zzi(null);
        }
        AbstractC0368f abstractC0368f2 = this.f5671b;
        int i = this.f5670a;
        Handler handler = abstractC0368f2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
