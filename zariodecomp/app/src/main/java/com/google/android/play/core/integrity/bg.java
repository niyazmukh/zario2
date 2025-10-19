package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0464l;
import e2.C0466n;
import e2.InterfaceC0468p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bg.smali */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6299a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f6300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f6301c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6302d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f6303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j5, long j6, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6303e = bnVar;
        this.f6299a = str;
        this.f6300b = j5;
        this.f6301c = j6;
        this.f6302d = taskCompletionSource2;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        if (bn.k(this.f6303e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6303e;
            InterfaceC0468p interfaceC0468p = (InterfaceC0468p) bnVar.f6318a.f6877n;
            Bundle bundleA = bn.a(bnVar, this.f6299a, this.f6300b, this.f6301c, 0);
            bk bkVar = new bk(this.f6303e, this.f6302d, this.f6300b);
            C0466n c0466n = (C0466n) interfaceC0468p;
            c0466n.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0466n.f6859b);
            int i = AbstractC0464l.f6882a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bkVar);
            c0466n.a(3, parcelObtain);
        } catch (RemoteException e5) {
            this.f6303e.f6319b.a(e5, "requestExpressIntegrityToken(%s, %s)", this.f6299a, Long.valueOf(this.f6300b));
            this.f6302d.trySetException(new StandardIntegrityException(-100, e5));
        }
    }
}
