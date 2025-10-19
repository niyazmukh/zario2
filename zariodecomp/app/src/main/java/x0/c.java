package X0;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X0\c.smali */
public final class c extends AbstractC0596a {
    public static final Parcelable.Creator<c> CREATOR = new k(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3713b;

    public c(int i, ArrayList arrayList) {
        this.f3712a = i;
        C.f(arrayList);
        this.f3713b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f3712a);
        f.r0(parcel, 2, this.f3713b, false);
        f.w0(iV0, parcel);
    }
}
