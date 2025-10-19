package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0464l;
import e2.C0457e;
import e2.C0466n;
import e2.InterfaceC0468p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\bh.smali */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f6304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f6305b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6306c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6307d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f6308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.f6308e = bnVar;
        this.f6304a = bundle;
        this.f6305b = activity;
        this.f6306c = taskCompletionSource2;
        this.f6307d = i;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        if (bn.k(this.f6308e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6308e;
            C0457e c0457e = bnVar.f6318a;
            InterfaceC0468p interfaceC0468p = (InterfaceC0468p) c0457e.f6877n;
            Bundle bundle = this.f6304a;
            as asVarA = bnVar.f6322e.a(this.f6305b, this.f6306c, c0457e);
            C0466n c0466n = (C0466n) interfaceC0468p;
            c0466n.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0466n.f6859b);
            int i = AbstractC0464l.f6882a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            c0466n.a(6, parcelObtain);
        } catch (RemoteException e5) {
            this.f6308e.f6319b.a(e5, "requestAndShowDialog(%s)", Integer.valueOf(this.f6307d));
            this.f6306c.trySetException(new StandardIntegrityException(-100, e5));
        }
    }
}
