package com.google.android.gms.auth.api.signin;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f1.C0494d;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\signin\SignInAccount.smali */
public class SignInAccount extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C0494d(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f5516a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f5517b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5518c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5517b = googleSignInAccount;
        C.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5516a = str;
        C.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f5518c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 4, this.f5516a, false);
        f.m0(parcel, 7, this.f5517b, i, false);
        f.n0(parcel, 8, this.f5518c, false);
        f.w0(iV0, parcel);
    }
}
