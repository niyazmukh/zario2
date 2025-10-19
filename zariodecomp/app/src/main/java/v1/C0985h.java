package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\h.1.smali */
public final class C0985h extends AbstractC0596a {
    public static final Parcelable.Creator<C0985h> CREATOR = new O(25);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10623a;

    public C0985h(boolean z4) {
        this.f10623a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0985h) && this.f10623a == ((C0985h) obj).f10623a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10623a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f10623a ? 1 : 0);
        S0.f.w0(iV0, parcel);
    }
}
