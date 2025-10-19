package com.google.android.gms.auth.api.credentials;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\credentials\IdToken.smali */
public final class IdToken extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new k(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f5472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5473b;

    public IdToken(String str, String str2) {
        C.a("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        C.a("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.f5472a = str;
        this.f5473b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C.i(this.f5472a, idToken.f5472a) && C.i(this.f5473b, idToken.f5473b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 1, this.f5472a, false);
        f.n0(parcel, 2, this.f5473b, false);
        f.w0(iV0, parcel);
    }
}
