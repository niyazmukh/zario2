package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0464l;
import e2.AbstractRunnableC0449A;
import e2.C0471s;
import e2.InterfaceC0473u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\ag.smali */
final class ag extends AbstractRunnableC0449A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f6246a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f6247b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6248c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6249d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f6250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f6250e = ajVar;
        this.f6246a = bundle;
        this.f6247b = activity;
        this.f6248c = taskCompletionSource2;
        this.f6249d = i;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        try {
            aj ajVar = this.f6250e;
            InterfaceC0473u interfaceC0473u = (InterfaceC0473u) ajVar.f6255a.f6877n;
            Bundle bundle = this.f6246a;
            as asVarA = ajVar.f6258d.a(this.f6247b, this.f6248c, ajVar.f6255a);
            C0471s c0471s = (C0471s) interfaceC0473u;
            c0471s.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0471s.f6859b);
            int i = AbstractC0464l.f6882a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            c0471s.a(3, parcelObtain);
        } catch (RemoteException e5) {
            this.f6250e.f6256b.a(e5, "requestAndShowDialog(%s)", Integer.valueOf(this.f6249d));
            this.f6248c.trySetException(new IntegrityServiceException(-100, e5));
        }
    }
}
