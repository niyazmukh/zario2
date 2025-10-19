package com.google.android.gms.fido.u2f.api.common;

import S0.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import v1.Y;
import w1.c;
import w1.h;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\fido\u2f\api\common\SignRequestParams.smali */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new Y(17);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5781a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f5782b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f5783c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5784d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5785e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5786f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5787k;

    public SignRequestParams(Integer num, Double d5, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        this.f5781a = num;
        this.f5782b = d5;
        this.f5783c = uri;
        this.f5784d = bArr;
        C.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f5785e = arrayList;
        this.f5786f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            C.a("registered key has null appId and no request appId is provided", (hVar.f10911b == null && uri == null) ? false : true);
            String str2 = hVar.f10911b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        C.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f5787k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (C.i(this.f5781a, signRequestParams.f5781a) && C.i(this.f5782b, signRequestParams.f5782b) && C.i(this.f5783c, signRequestParams.f5783c) && Arrays.equals(this.f5784d, signRequestParams.f5784d)) {
            ArrayList arrayList = this.f5785e;
            ArrayList arrayList2 = signRequestParams.f5785e;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && C.i(this.f5786f, signRequestParams.f5786f) && C.i(this.f5787k, signRequestParams.f5787k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.f5784d));
        return Arrays.hashCode(new Object[]{this.f5781a, this.f5783c, this.f5782b, this.f5785e, this.f5786f, this.f5787k, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.j0(parcel, 2, this.f5781a);
        f.h0(parcel, 3, this.f5782b);
        f.m0(parcel, 4, this.f5783c, i, false);
        f.g0(parcel, 5, this.f5784d, false);
        f.r0(parcel, 6, this.f5785e, false);
        f.m0(parcel, 7, this.f5786f, i, false);
        f.n0(parcel, 8, this.f5787k, false);
        f.w0(iV0, parcel);
    }
}
