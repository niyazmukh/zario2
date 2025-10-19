package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\d.smali */
public final class d extends AbstractC0596a {
    public static final Parcelable.Creator<d> CREATOR = new D0.k(26);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5413a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5415c;

    public d(boolean z4, byte[] bArr, String str) {
        if (z4) {
            C.f(bArr);
            C.f(str);
        }
        this.f5413a = z4;
        this.f5414b = bArr;
        this.f5415c = str;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5413a == dVar.f5413a && Arrays.equals(this.f5414b, dVar.f5414b) && ((str = this.f5415c) == (str2 = dVar.f5415c) || (str != null && str.equals(str2)));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5414b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5413a), this.f5415c}) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5413a ? 1 : 0);
        S0.f.g0(parcel, 2, this.f5414b, false);
        S0.f.n0(parcel, 3, this.f5415c, false);
        S0.f.w0(iV0, parcel);
    }
}
