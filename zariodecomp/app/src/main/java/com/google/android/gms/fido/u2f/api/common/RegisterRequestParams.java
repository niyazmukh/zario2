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
import w1.g;
import w1.h;

@Deprecated
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\fido\u2f\api\common\RegisterRequestParams.smali */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new Y(15);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5774a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f5775b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f5776c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5777d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5778e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5779f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5780k;

    public RegisterRequestParams(Integer num, Double d5, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        this.f5774a = num;
        this.f5775b = d5;
        this.f5776c = uri;
        C.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f5777d = arrayList;
        this.f5778e = arrayList2;
        this.f5779f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            C.a("register request has null appId and no request appId is provided", (uri == null && gVar.f10909d == null) ? false : true);
            String str2 = gVar.f10909d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            C.a("registered key has null appId and no request appId is provided", (uri == null && hVar.f10911b == null) ? false : true);
            String str3 = hVar.f10911b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        C.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f5780k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (C.i(this.f5774a, registerRequestParams.f5774a) && C.i(this.f5775b, registerRequestParams.f5775b) && C.i(this.f5776c, registerRequestParams.f5776c) && C.i(this.f5777d, registerRequestParams.f5777d)) {
            ArrayList arrayList = this.f5778e;
            ArrayList arrayList2 = registerRequestParams.f5778e;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && C.i(this.f5779f, registerRequestParams.f5779f) && C.i(this.f5780k, registerRequestParams.f5780k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5774a, this.f5776c, this.f5775b, this.f5777d, this.f5778e, this.f5779f, this.f5780k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.j0(parcel, 2, this.f5774a);
        f.h0(parcel, 3, this.f5775b);
        f.m0(parcel, 4, this.f5776c, i, false);
        f.r0(parcel, 5, this.f5777d, false);
        f.r0(parcel, 6, this.f5778e, false);
        f.m0(parcel, 7, this.f5779f, i, false);
        f.n0(parcel, 8, this.f5780k, false);
        f.w0(iV0, parcel);
    }
}
