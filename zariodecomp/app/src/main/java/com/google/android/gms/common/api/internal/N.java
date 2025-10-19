package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC0368f;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.internal.base.zac;
import g1.C0573b;
import h1.C0588a;
import java.util.Set;
import y1.AbstractC1047b;
import z1.AbstractBinderC1068c;
import z1.C1066a;
import z1.C1069d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\N.smali */
public final class N extends AbstractBinderC1068c implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: j, reason: collision with root package name */
    public static final Y0.g f5588j = AbstractC1047b.f11049a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5589a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5590b;

    /* renamed from: c, reason: collision with root package name */
    public final Y0.g f5591c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5592d;

    /* renamed from: e, reason: collision with root package name */
    public final C0370h f5593e;

    /* renamed from: f, reason: collision with root package name */
    public C1066a f5594f;
    public F i;

    public N(Context context, Handler handler, C0370h c0370h) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f5589a = context;
        this.f5590b = handler;
        this.f5593e = c0370h;
        this.f5592d = c0370h.f5700a;
        this.f5591c = f5588j;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0355q
    public final void a(C0588a c0588a) {
        this.i.e(c0588a);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0345g
    public final void b(int i) {
        this.f5594f.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0345g
    public final void d() {
        C1066a c1066a = this.f5594f;
        c1066a.getClass();
        try {
            c1066a.f11201b.getClass();
            Account account = new Account(AbstractC0368f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = AbstractC0368f.DEFAULT_ACCOUNT.equals(account.name) ? C0573b.a(c1066a.getContext()).b() : null;
            Integer num = c1066a.f11203d;
            com.google.android.gms.common.internal.C.f(num);
            com.google.android.gms.common.internal.y yVar = new com.google.android.gms.common.internal.y(2, account, num.intValue(), googleSignInAccountB);
            C1069d c1069d = (C1069d) c1066a.getService();
            z1.f fVar = new z1.f(1, yVar);
            Parcel parcelZaa = c1069d.zaa();
            zac.zad(parcelZaa, fVar);
            zac.zae(parcelZaa, this);
            c1069d.zac(12, parcelZaa);
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f5590b.post(new Y(2, this, new z1.g(1, new C0588a(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }
}
