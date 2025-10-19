package w1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w1.1\g.smali */
public final class g extends AbstractC0596a {
    public static final Parcelable.Creator<g> CREATOR = new Y(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f10906a;

    /* renamed from: b, reason: collision with root package name */
    public final f f10907b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10908c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10909d;

    public g(int i, String str, byte[] bArr, String str2) {
        this.f10906a = i;
        try {
            this.f10907b = f.b(str);
            this.f10908c = bArr;
            this.f10909d = str2;
        } catch (e e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Arrays.equals(this.f10908c, gVar.f10908c) || this.f10907b != gVar.f10907b) {
            return false;
        }
        String str = gVar.f10909d;
        String str2 = this.f10909d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f10908c) + 31) * 31) + this.f10907b.hashCode();
        String str = this.f10909d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10906a);
        S0.f.n0(parcel, 2, this.f10907b.f10905a, false);
        S0.f.g0(parcel, 3, this.f10908c, false);
        S0.f.n0(parcel, 4, this.f10909d, false);
        S0.f.w0(iV0, parcel);
    }
}
