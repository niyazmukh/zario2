package w1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w1.1\c.smali */
public final class c extends AbstractC0596a {
    public static final Parcelable.Creator<c> CREATOR = new Y(11);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1023a f10900a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10902c;

    static {
        new c("unavailable");
        new c("unused");
    }

    public c(String str) {
        this.f10901b = str;
        this.f10900a = EnumC1023a.STRING;
        this.f10902c = null;
    }

    public static EnumC1023a c(int i) throws b {
        for (EnumC1023a enumC1023a : EnumC1023a.values()) {
            if (i == enumC1023a.f10899a) {
                return enumC1023a;
            }
        }
        throw new b(B.a.i("ChannelIdValueType ", i, " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        EnumC1023a enumC1023a = cVar.f10900a;
        EnumC1023a enumC1023a2 = this.f10900a;
        if (!enumC1023a2.equals(enumC1023a)) {
            return false;
        }
        int iOrdinal = enumC1023a2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f10901b.equals(cVar.f10901b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f10902c.equals(cVar.f10902c);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        EnumC1023a enumC1023a = this.f10900a;
        int iHashCode2 = enumC1023a.hashCode() + 31;
        int iOrdinal = enumC1023a.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.f10901b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.f10902c.hashCode();
        }
        return iHashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        int i5 = this.f10900a.f10899a;
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(i5);
        S0.f.n0(parcel, 3, this.f10901b, false);
        S0.f.n0(parcel, 4, this.f10902c, false);
        S0.f.w0(iV0, parcel);
    }

    public c(String str, int i, String str2) {
        try {
            this.f10900a = c(i);
            this.f10901b = str;
            this.f10902c = str2;
        } catch (b e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
