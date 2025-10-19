package com.google.android.gms.auth.api.identity;

import D0.k;
import S0.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\identity\AuthorizationRequest.smali */
public class AuthorizationRequest extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new k(18);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5475b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5477d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f5478e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5479f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5480k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5481l;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z4, boolean z5, Account account, String str2, String str3, boolean z6) {
        boolean z7 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z7 = true;
        }
        C.a("requestedScopes cannot be null or empty", z7);
        this.f5474a = arrayList;
        this.f5475b = str;
        this.f5476c = z4;
        this.f5477d = z5;
        this.f5478e = account;
        this.f5479f = str2;
        this.f5480k = str3;
        this.f5481l = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f5474a;
        return arrayList.size() == authorizationRequest.f5474a.size() && arrayList.containsAll(authorizationRequest.f5474a) && this.f5476c == authorizationRequest.f5476c && this.f5481l == authorizationRequest.f5481l && this.f5477d == authorizationRequest.f5477d && C.i(this.f5475b, authorizationRequest.f5475b) && C.i(this.f5478e, authorizationRequest.f5478e) && C.i(this.f5479f, authorizationRequest.f5479f) && C.i(this.f5480k, authorizationRequest.f5480k);
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f5476c);
        Boolean boolValueOf2 = Boolean.valueOf(this.f5481l);
        Boolean boolValueOf3 = Boolean.valueOf(this.f5477d);
        return Arrays.hashCode(new Object[]{this.f5474a, this.f5475b, boolValueOf, boolValueOf2, boolValueOf3, this.f5478e, this.f5479f, this.f5480k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.r0(parcel, 1, this.f5474a, false);
        f.n0(parcel, 2, this.f5475b, false);
        f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5476c ? 1 : 0);
        f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5477d ? 1 : 0);
        f.m0(parcel, 5, this.f5478e, i, false);
        f.n0(parcel, 6, this.f5479f, false);
        f.n0(parcel, 7, this.f5480k, false);
        f.u0(parcel, 8, 4);
        parcel.writeInt(this.f5481l ? 1 : 0);
        f.w0(iV0, parcel);
    }
}
