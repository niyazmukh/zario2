package p2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import i1.InterfaceC0597b;
import java.util.ArrayList;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\z.smali */
public final class z implements InterfaceC0597b {
    public static final Parcelable.Creator<z> CREATOR = new b(6);

    /* renamed from: a, reason: collision with root package name */
    public e f9382a;

    /* renamed from: b, reason: collision with root package name */
    public y f9383b;

    /* renamed from: c, reason: collision with root package name */
    public H f9384c;

    public z(e eVar) {
        C.f(eVar);
        this.f9382a = eVar;
        ArrayList arrayList = eVar.f9332e;
        this.f9383b = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(((c) arrayList.get(i)).f9327l)) {
                this.f9383b = new y(((c) arrayList.get(i)).f9321b, ((c) arrayList.get(i)).f9327l, eVar.f9337n);
            }
        }
        if (this.f9383b == null) {
            this.f9383b = new y(eVar.f9337n);
        }
        this.f9384c = eVar.f9338o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f9382a, i, false);
        S0.f.m0(parcel, 2, this.f9383b, i, false);
        S0.f.m0(parcel, 3, this.f9384c, i, false);
        S0.f.w0(iV0, parcel);
    }
}
