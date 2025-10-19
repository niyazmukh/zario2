package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\c.smali */
public final class c extends AbstractC0596a {
    public static final Parcelable.Creator<c> CREATOR = new D0.k(25);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5411a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5412b;

    public c(String str, boolean z4) {
        if (z4) {
            C.f(str);
        }
        this.f5411a = z4;
        this.f5412b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5411a == cVar.f5411a && C.i(this.f5412b, cVar.f5412b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5411a), this.f5412b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5411a ? 1 : 0);
        S0.f.n0(parcel, 2, this.f5412b, false);
        S0.f.w0(iV0, parcel);
    }
}
