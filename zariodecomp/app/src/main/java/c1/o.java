package c1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;
import v1.C0998x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\o.smali */
public final class o extends AbstractC0596a {
    public static final Parcelable.Creator<o> CREATOR = new s(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f5437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5440d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f5441e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5442f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5443k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5444l;

    /* renamed from: m, reason: collision with root package name */
    public final C0998x f5445m;

    public o(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C0998x c0998x) {
        C.d(str);
        this.f5437a = str;
        this.f5438b = str2;
        this.f5439c = str3;
        this.f5440d = str4;
        this.f5441e = uri;
        this.f5442f = str5;
        this.f5443k = str6;
        this.f5444l = str7;
        this.f5445m = c0998x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C.i(this.f5437a, oVar.f5437a) && C.i(this.f5438b, oVar.f5438b) && C.i(this.f5439c, oVar.f5439c) && C.i(this.f5440d, oVar.f5440d) && C.i(this.f5441e, oVar.f5441e) && C.i(this.f5442f, oVar.f5442f) && C.i(this.f5443k, oVar.f5443k) && C.i(this.f5444l, oVar.f5444l) && C.i(this.f5445m, oVar.f5445m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5437a, this.f5438b, this.f5439c, this.f5440d, this.f5441e, this.f5442f, this.f5443k, this.f5444l, this.f5445m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f5437a, false);
        S0.f.n0(parcel, 2, this.f5438b, false);
        S0.f.n0(parcel, 3, this.f5439c, false);
        S0.f.n0(parcel, 4, this.f5440d, false);
        S0.f.m0(parcel, 5, this.f5441e, i, false);
        S0.f.n0(parcel, 6, this.f5442f, false);
        S0.f.n0(parcel, 7, this.f5443k, false);
        S0.f.n0(parcel, 8, this.f5444l, false);
        S0.f.m0(parcel, 9, this.f5445m, i, false);
        S0.f.w0(iV0, parcel);
    }
}
