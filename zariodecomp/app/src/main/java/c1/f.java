package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\f.smali */
public final class f extends AbstractC0596a {
    public static final Parcelable.Creator<f> CREATOR = new D0.k(20);

    /* renamed from: a, reason: collision with root package name */
    public final e f5417a;

    /* renamed from: b, reason: collision with root package name */
    public final C0335b f5418b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5419c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5421e;

    /* renamed from: f, reason: collision with root package name */
    public final d f5422f;

    /* renamed from: k, reason: collision with root package name */
    public final c f5423k;

    public f(e eVar, C0335b c0335b, String str, boolean z4, int i, d dVar, c cVar) {
        C.f(eVar);
        this.f5417a = eVar;
        C.f(c0335b);
        this.f5418b = c0335b;
        this.f5419c = str;
        this.f5420d = z4;
        this.f5421e = i;
        this.f5422f = dVar == null ? new d(false, null, null) : dVar;
        this.f5423k = cVar == null ? new c(null, false) : cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C.i(this.f5417a, fVar.f5417a) && C.i(this.f5418b, fVar.f5418b) && C.i(this.f5422f, fVar.f5422f) && C.i(this.f5423k, fVar.f5423k) && C.i(this.f5419c, fVar.f5419c) && this.f5420d == fVar.f5420d && this.f5421e == fVar.f5421e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5417a, this.f5418b, this.f5422f, this.f5423k, this.f5419c, Boolean.valueOf(this.f5420d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5417a, i, false);
        S0.f.m0(parcel, 2, this.f5418b, i, false);
        S0.f.n0(parcel, 3, this.f5419c, false);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5420d ? 1 : 0);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5421e);
        S0.f.m0(parcel, 6, this.f5422f, i, false);
        S0.f.m0(parcel, 7, this.f5423k, i, false);
        S0.f.w0(iV0, parcel);
    }
}
