package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\a0.smali */
public final class a0 extends AbstractC0596a {
    public static final Parcelable.Creator<a0> CREATOR = new Y(6);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10602a;

    public a0(ArrayList arrayList) {
        com.google.android.gms.common.internal.C.f(arrayList);
        this.f10602a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        ArrayList arrayList = a0Var.f10602a;
        ArrayList arrayList2 = this.f10602a;
        return arrayList2.containsAll(arrayList) && a0Var.f10602a.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f10602a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.r0(parcel, 1, this.f10602a, false);
        S0.f.w0(iV0, parcel);
    }
}
