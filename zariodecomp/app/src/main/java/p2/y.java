package p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.InterfaceC0597b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\y.smali */
public final class y implements InterfaceC0597b {
    public static final Parcelable.Creator<y> CREATOR = new b(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f9379a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9380b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9381c;

    public y(boolean z4) {
        this.f9381c = z4;
        this.f9380b = null;
        this.f9379a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f9379a, false);
        S0.f.n0(parcel, 2, this.f9380b, false);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f9381c ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }

    public y(String str, String str2, boolean z4) {
        C.d(str);
        C.d(str2);
        this.f9379a = str;
        this.f9380b = str2;
        k.d(str2);
        this.f9381c = z4;
    }
}
