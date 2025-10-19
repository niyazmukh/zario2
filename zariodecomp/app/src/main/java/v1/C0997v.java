package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: v1.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\v.1.smali */
public final class C0997v extends AbstractC0596a {
    public static final Parcelable.Creator<C0997v> CREATOR = new Y(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f10648a;

    public C0997v(String str) {
        com.google.android.gms.common.internal.C.f(str);
        this.f10648a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0997v) {
            return this.f10648a.equals(((C0997v) obj).f10648a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10648a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 2, this.f10648a, false);
        S0.f.w0(iV0, parcel);
    }
}
