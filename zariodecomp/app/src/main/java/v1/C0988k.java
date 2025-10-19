package v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import java.util.Arrays;

/* renamed from: v1.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\k.1.smali */
public final class C0988k extends AbstractC0989l {
    public static final Parcelable.Creator<C0988k> CREATOR = new Y(0);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0996u f10633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10635c;

    public C0988k(int i, String str, int i5) {
        try {
            this.f10633a = EnumC0996u.b(i);
            this.f10634b = str;
            this.f10635c = i5;
        } catch (C0995t e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0988k)) {
            return false;
        }
        C0988k c0988k = (C0988k) obj;
        return com.google.android.gms.common.internal.C.i(this.f10633a, c0988k.f10633a) && com.google.android.gms.common.internal.C.i(this.f10634b, c0988k.f10634b) && com.google.android.gms.common.internal.C.i(Integer.valueOf(this.f10635c), Integer.valueOf(c0988k.f10635c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10633a, this.f10634b, Integer.valueOf(this.f10635c)});
    }

    public final String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzamVarZza.zza("errorCode", this.f10633a.f10647a);
        String str = this.f10634b;
        if (str != null) {
            zzamVarZza.zzb("errorMessage", str);
        }
        return zzamVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        int i5 = this.f10633a.f10647a;
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(i5);
        S0.f.n0(parcel, 3, this.f10634b, false);
        S0.f.u0(parcel, 4, 4);
        parcel.writeInt(this.f10635c);
        S0.f.w0(iV0, parcel);
    }
}
