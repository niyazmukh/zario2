package com.google.android.gms.auth.api.signin.internal;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g1.m;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\signin\internal\SignInConfiguration.smali */
public final class SignInConfiguration extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new m(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f5519a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f5520b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C.d(str);
        this.f5519a = str;
        this.f5520b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5519a.equals(signInConfiguration.f5519a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f5520b;
            GoogleSignInOptions googleSignInOptions2 = this.f5520b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 31 * 1;
        String str = this.f5519a;
        int iHashCode = 31 * (i + (str == null ? 0 : str.hashCode()));
        GoogleSignInOptions googleSignInOptions = this.f5520b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 2, this.f5519a, false);
        f.m0(parcel, 5, this.f5520b, i, false);
        f.w0(iV0, parcel);
    }
}
