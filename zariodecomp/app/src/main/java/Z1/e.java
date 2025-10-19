package z1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import i1.AbstractC0596a;
import java.util.ArrayList;
import v1.Y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\e.smali */
public final class e extends AbstractC0596a implements s {
    public static final Parcelable.Creator<e> CREATOR = new Y(19);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11207a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11208b;

    public e(String str, ArrayList arrayList) {
        this.f11207a = arrayList;
        this.f11208b = str;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f11208b != null ? Status.f5530e : Status.f5534m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.p0(parcel, 1, this.f11207a);
        S0.f.n0(parcel, 2, this.f11208b, false);
        S0.f.w0(iV0, parcel);
    }
}
