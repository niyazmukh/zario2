package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\y.smali */
public final class y extends AbstractC0596a {
    public static final Parcelable.Creator<y> CREATOR = new c1.s(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f5762a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f5763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5764c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f5765d;

    public y(int i, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f5762a = i;
        this.f5763b = account;
        this.f5764c = i5;
        this.f5765d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5762a);
        S0.f.m0(parcel, 2, this.f5763b, i, false);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5764c);
        S0.f.m0(parcel, 4, this.f5765d, i, false);
        S0.f.w0(iV0, parcel);
    }
}
