package com.google.android.gms.common.api;

import N2.AbstractC0156x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h1.C0588a;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\Status.smali */
public final class Status extends AbstractC0596a implements s, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5536b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f5537c;

    /* renamed from: d, reason: collision with root package name */
    public final C0588a f5538d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f5530e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f5531f = new Status(14, null, null, null);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f5532k = new Status(8, null, null, null);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f5533l = new Status(15, null, null, null);

    /* renamed from: m, reason: collision with root package name */
    public static final Status f5534m = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new c1.s(5);

    public Status(int i, String str, PendingIntent pendingIntent, C0588a c0588a) {
        this.f5535a = i;
        this.f5536b = str;
        this.f5537c = pendingIntent;
        this.f5538d = c0588a;
    }

    public final boolean c() {
        return this.f5535a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5535a == status.f5535a && C.i(this.f5536b, status.f5536b) && C.i(this.f5537c, status.f5537c) && C.i(this.f5538d, status.f5538d);
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5535a), this.f5536b, this.f5537c, this.f5538d});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        String strN = this.f5536b;
        if (strN == null) {
            strN = AbstractC0156x.N(this.f5535a);
        }
        lVar.c(strN, "statusCode");
        lVar.c(this.f5537c, "resolution");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5535a);
        S0.f.n0(parcel, 2, this.f5536b, false);
        S0.f.m0(parcel, 3, this.f5537c, i, false);
        S0.f.m0(parcel, 4, this.f5538d, i, false);
        S0.f.w0(iV0, parcel);
    }
}
