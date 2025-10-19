package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.AbstractC0464l;
import e2.AbstractRunnableC0449A;
import e2.C0458f;
import e2.C0471s;
import e2.InterfaceC0473u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\af.smali */
final class af extends AbstractRunnableC0449A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f6241a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f6242b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6243c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f6244d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f6245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l4, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f6245e = ajVar;
        this.f6241a = bArr;
        this.f6242b = l4;
        this.f6243c = taskCompletionSource2;
        this.f6244d = integrityTokenRequest;
    }

    @Override // e2.AbstractRunnableC0449A
    public final void a(Exception exc) {
        if (exc instanceof C0458f) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // e2.AbstractRunnableC0449A
    public final void b() {
        try {
            aj ajVar = this.f6245e;
            InterfaceC0473u interfaceC0473u = (InterfaceC0473u) ajVar.f6255a.f6877n;
            Bundle bundleA = aj.a(ajVar, this.f6241a, this.f6242b, null);
            ai aiVar = new ai(this.f6245e, this.f6243c);
            C0471s c0471s = (C0471s) interfaceC0473u;
            c0471s.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0471s.f6859b);
            int i = AbstractC0464l.f6882a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            c0471s.a(2, parcelObtain);
        } catch (RemoteException e5) {
            this.f6245e.f6256b.a(e5, "requestIntegrityToken(%s)", this.f6244d);
            this.f6243c.trySetException(new IntegrityServiceException(-100, e5));
        }
    }
}
