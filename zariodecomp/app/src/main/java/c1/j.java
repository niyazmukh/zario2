package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\j.smali */
public final class j extends AbstractC0596a {
    public static final Parcelable.Creator<j> CREATOR = new D0.k(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f5426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5428c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5429d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5431f;

    public j(String str, String str2, String str3, String str4, boolean z4, int i) {
        C.f(str);
        this.f5426a = str;
        this.f5427b = str2;
        this.f5428c = str3;
        this.f5429d = str4;
        this.f5430e = z4;
        this.f5431f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C.i(this.f5426a, jVar.f5426a) && C.i(this.f5429d, jVar.f5429d) && C.i(this.f5427b, jVar.f5427b) && C.i(Boolean.valueOf(this.f5430e), Boolean.valueOf(jVar.f5430e)) && this.f5431f == jVar.f5431f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5426a, this.f5427b, this.f5429d, Boolean.valueOf(this.f5430e), Integer.valueOf(this.f5431f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f5426a, false);
        S0.f.n0(parcel, 2, this.f5427b, false);
        S0.f.n0(parcel, 3, this.f5428c, false);
        S0.f.n0(parcel, 4, this.f5429d, false);
        S0.f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5430e ? 1 : 0);
        S0.f.u0(parcel, 6, 4);
        parcel.writeInt(this.f5431f);
        S0.f.w0(iV0, parcel);
    }
}
