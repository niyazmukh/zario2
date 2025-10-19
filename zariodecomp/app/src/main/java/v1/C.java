package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\C.smali */
public final class C extends AbstractC0596a {
    public static final Parcelable.Creator<C> CREATOR = new O(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f10567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10569c;

    public C(String str, String str2, String str3) {
        com.google.android.gms.common.internal.C.f(str);
        this.f10567a = str;
        com.google.android.gms.common.internal.C.f(str2);
        this.f10568b = str2;
        this.f10569c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return com.google.android.gms.common.internal.C.i(this.f10567a, c5.f10567a) && com.google.android.gms.common.internal.C.i(this.f10568b, c5.f10568b) && com.google.android.gms.common.internal.C.i(this.f10569c, c5.f10569c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10567a, this.f10568b, this.f10569c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 2, this.f10567a, false);
        S0.f.n0(parcel, 3, this.f10568b, false);
        S0.f.n0(parcel, 4, this.f10569c, false);
        S0.f.w0(iV0, parcel);
    }
}
