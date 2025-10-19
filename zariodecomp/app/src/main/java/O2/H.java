package o2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\H.smali */
public final class H extends AbstractC0799c {
    public static final Parcelable.Creator<H> CREATOR = new g1.m(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f9181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9182b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9183c;

    /* renamed from: d, reason: collision with root package name */
    public final zzajb f9184d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9185e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9186f;

    /* renamed from: k, reason: collision with root package name */
    public final String f9187k;

    public H(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.f9181a = zzac.zzb(str);
        this.f9182b = str2;
        this.f9183c = str3;
        this.f9184d = zzajbVar;
        this.f9185e = str4;
        this.f9186f = str5;
        this.f9187k = str6;
    }

    public static H e(zzajb zzajbVar) {
        com.google.android.gms.common.internal.C.g(zzajbVar, "Must specify a non-null webSignInCredential");
        return new H(null, null, null, zzajbVar, null, null, null);
    }

    @Override // o2.AbstractC0799c
    public final String c() {
        return this.f9181a;
    }

    public final AbstractC0799c d() {
        return new H(this.f9181a, this.f9182b, this.f9183c, this.f9184d, this.f9185e, this.f9186f, this.f9187k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9181a, false);
        S0.f.n0(parcel, 2, this.f9182b, false);
        S0.f.n0(parcel, 3, this.f9183c, false);
        S0.f.m0(parcel, 4, this.f9184d, i, false);
        S0.f.n0(parcel, 5, this.f9185e, false);
        S0.f.n0(parcel, 6, this.f9186f, false);
        S0.f.n0(parcel, 7, this.f9187k, false);
        S0.f.w0(iV0, parcel);
    }
}
