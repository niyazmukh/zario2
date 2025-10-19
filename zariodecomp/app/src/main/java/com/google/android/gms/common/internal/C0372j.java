package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;
import h1.C0590c;
import i1.AbstractC0596a;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\j.1.smali */
public final class C0372j extends AbstractC0596a {
    public static final Parcelable.Creator<C0372j> CREATOR = new c1.s(13);

    /* renamed from: s, reason: collision with root package name */
    public static final Scope[] f5713s = new Scope[0];

    /* renamed from: t, reason: collision with root package name */
    public static final C0590c[] f5714t = new C0590c[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f5715a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5717c;

    /* renamed from: d, reason: collision with root package name */
    public String f5718d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f5719e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f5720f;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f5721k;

    /* renamed from: l, reason: collision with root package name */
    public Account f5722l;

    /* renamed from: m, reason: collision with root package name */
    public C0590c[] f5723m;

    /* renamed from: n, reason: collision with root package name */
    public C0590c[] f5724n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5725o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5726p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5727q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5728r;

    public C0372j(int i, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0590c[] c0590cArr, C0590c[] c0590cArr2, boolean z4, int i7, boolean z5, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f5713s : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C0590c[] c0590cArr3 = f5714t;
        C0590c[] c0590cArr4 = c0590cArr == null ? c0590cArr3 : c0590cArr;
        c0590cArr3 = c0590cArr2 != null ? c0590cArr2 : c0590cArr3;
        this.f5715a = i;
        this.f5716b = i5;
        this.f5717c = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f5718d = "com.google.android.gms";
        } else {
            this.f5718d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC0363a.f5696a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0375m q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0375m ? (InterfaceC0375m) iInterfaceQueryLocalInterface : new Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (q5 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Q q6 = (Q) q5;
                            Parcel parcelZzB = q6.zzB(2, q6.zza());
                            Account account3 = (Account) zzc.zzb(parcelZzB, Account.CREATOR);
                            parcelZzB.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f5719e = iBinder;
            account2 = account;
        }
        this.f5722l = account2;
        this.f5720f = scopeArr2;
        this.f5721k = bundle2;
        this.f5723m = c0590cArr4;
        this.f5724n = c0590cArr3;
        this.f5725o = z4;
        this.f5726p = i7;
        this.f5727q = z5;
        this.f5728r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c1.s.a(this, parcel, i);
    }
}
