package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0464l;
import e2.C0466n;
import e2.InterfaceC0468p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bf.smali */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f6296a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j5, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6298c = bnVar;
        this.f6296a = j5;
        this.f6297b = taskCompletionSource2;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        if (bn.k(this.f6298c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6298c;
            InterfaceC0468p interfaceC0468p = (InterfaceC0468p) bnVar.f6318a.f6877n;
            Bundle bundleB = bn.b(bnVar, this.f6296a, 0);
            bl blVar = new bl(this.f6298c, this.f6297b);
            C0466n c0466n = (C0466n) interfaceC0468p;
            c0466n.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0466n.f6859b);
            int i = AbstractC0464l.f6882a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            c0466n.a(2, parcelObtain);
        } catch (RemoteException e5) {
            this.f6298c.f6319b.a(e5, "warmUpIntegrityToken(%s)", Long.valueOf(this.f6296a));
            this.f6297b.trySetException(new StandardIntegrityException(-100, e5));
        }
    }
}
