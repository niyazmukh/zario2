package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: v1.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\z.1.smali */
public final class C1000z extends AbstractC0596a {
    public static final Parcelable.Creator<C1000z> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final E f10669a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10670b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10671c;

    static {
        zzbc.zzk(zzh.zza, zzh.zzb);
        CREATOR = new O(9);
    }

    public C1000z(String str, byte[] bArr, ArrayList arrayList) {
        com.google.android.gms.common.internal.C.f(str);
        try {
            this.f10669a = E.b(str);
            com.google.android.gms.common.internal.C.f(bArr);
            this.f10670b = bArr;
            this.f10671c = arrayList;
        } catch (D e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1000z)) {
            return false;
        }
        C1000z c1000z = (C1000z) obj;
        if (!this.f10669a.equals(c1000z.f10669a) || !Arrays.equals(this.f10670b, c1000z.f10670b)) {
            return false;
        }
        ArrayList arrayList = this.f10671c;
        ArrayList arrayList2 = c1000z.f10671c;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10669a, Integer.valueOf(Arrays.hashCode(this.f10670b)), this.f10671c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        this.f10669a.getClass();
        S0.f.n0(parcel, 2, "public-key", false);
        S0.f.g0(parcel, 3, this.f10670b, false);
        S0.f.r0(parcel, 4, this.f10671c, false);
        S0.f.w0(iV0, parcel);
    }
}
