package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\T.smali */
public final class T extends AbstractC0596a {
    public static final Parcelable.Creator<T> CREATOR = new O(6);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f10592a;

    public T(byte[][] bArr) {
        com.google.android.gms.common.internal.C.b(bArr != null);
        com.google.android.gms.common.internal.C.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            com.google.android.gms.common.internal.C.b(i == 0 || bArr[i] != null);
            int i5 = i + 1;
            com.google.android.gms.common.internal.C.b(bArr[i5] != null);
            int length = bArr[i5].length;
            com.google.android.gms.common.internal.C.b(length == 32 || length == 64);
            i += 2;
        }
        this.f10592a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return Arrays.deepEquals(this.f10592a, ((T) obj).f10592a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f10592a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        byte[][] bArr = this.f10592a;
        if (bArr != null) {
            int iV02 = S0.f.v0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            S0.f.w0(iV02, parcel);
        }
        S0.f.w0(iV0, parcel);
    }
}
