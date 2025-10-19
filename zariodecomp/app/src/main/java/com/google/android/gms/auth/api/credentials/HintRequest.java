package com.google.android.gms.auth.api.credentials;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\credentials\HintRequest.smali */
public final class HintRequest extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new k(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f5464a;

    /* renamed from: b, reason: collision with root package name */
    public final CredentialPickerConfig f5465b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5466c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5467d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f5468e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5469f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5470k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5471l;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z4, boolean z5, String[] strArr, boolean z6, String str, String str2) {
        this.f5464a = i;
        C.f(credentialPickerConfig);
        this.f5465b = credentialPickerConfig;
        this.f5466c = z4;
        this.f5467d = z5;
        C.f(strArr);
        this.f5468e = strArr;
        if (i < 2) {
            this.f5469f = true;
            this.f5470k = null;
            this.f5471l = null;
        } else {
            this.f5469f = z6;
            this.f5470k = str;
            this.f5471l = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.m0(parcel, 1, this.f5465b, i, false);
        f.u0(parcel, 2, 4);
        parcel.writeInt(this.f5466c ? 1 : 0);
        f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5467d ? 1 : 0);
        f.o0(parcel, 4, this.f5468e, false);
        f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5469f ? 1 : 0);
        f.n0(parcel, 6, this.f5470k, false);
        f.n0(parcel, 7, this.f5471l, false);
        f.u0(parcel, 1000, 4);
        parcel.writeInt(this.f5464a);
        f.w0(iV0, parcel);
    }
}
