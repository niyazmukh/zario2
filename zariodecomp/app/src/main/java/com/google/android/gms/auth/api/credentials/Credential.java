package com.google.android.gms.auth.api.credentials;

import D0.k;
import S0.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\credentials\Credential.smali */
public class Credential extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new k(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f5452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5453b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f5454c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5455d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5457f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5458k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5459l;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        Boolean boolValueOf;
        C.g(str, "credential identifier cannot be null");
        String strTrim = str.trim();
        C.e(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                boolValueOf = Boolean.FALSE;
            } else {
                Uri uri2 = Uri.parse(str4);
                if (!uri2.isAbsolute() || !uri2.isHierarchical() || TextUtils.isEmpty(uri2.getScheme()) || TextUtils.isEmpty(uri2.getAuthority())) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean z4 = true;
                    if (!"http".equalsIgnoreCase(uri2.getScheme()) && !"https".equalsIgnoreCase(uri2.getScheme())) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            if (!boolValueOf.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f5453b = str2;
        this.f5454c = uri;
        this.f5455d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f5452a = strTrim;
        this.f5456e = str3;
        this.f5457f = str4;
        this.f5458k = str5;
        this.f5459l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f5452a, credential.f5452a) && TextUtils.equals(this.f5453b, credential.f5453b) && C.i(this.f5454c, credential.f5454c) && TextUtils.equals(this.f5456e, credential.f5456e) && TextUtils.equals(this.f5457f, credential.f5457f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5452a, this.f5453b, this.f5454c, this.f5456e, this.f5457f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.n0(parcel, 1, this.f5452a, false);
        f.n0(parcel, 2, this.f5453b, false);
        f.m0(parcel, 3, this.f5454c, i, false);
        f.r0(parcel, 4, this.f5455d, false);
        f.n0(parcel, 5, this.f5456e, false);
        f.n0(parcel, 6, this.f5457f, false);
        f.n0(parcel, 9, this.f5458k, false);
        f.n0(parcel, 10, this.f5459l, false);
        f.w0(iV0, parcel);
    }
}
