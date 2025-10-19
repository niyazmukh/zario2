package v1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\F.smali */
public final class F extends AbstractC0596a {
    public static final Parcelable.Creator<F> CREATOR = new O(14);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10571a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10572b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10573c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10574d;

    public F(byte[] bArr, String str, String str2, String str3) {
        com.google.android.gms.common.internal.C.f(bArr);
        this.f10571a = bArr;
        com.google.android.gms.common.internal.C.f(str);
        this.f10572b = str;
        this.f10573c = str2;
        com.google.android.gms.common.internal.C.f(str3);
        this.f10574d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f2 = (F) obj;
        return Arrays.equals(this.f10571a, f2.f10571a) && com.google.android.gms.common.internal.C.i(this.f10572b, f2.f10572b) && com.google.android.gms.common.internal.C.i(this.f10573c, f2.f10573c) && com.google.android.gms.common.internal.C.i(this.f10574d, f2.f10574d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10571a, this.f10572b, this.f10573c, this.f10574d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.g0(parcel, 2, this.f10571a, false);
        S0.f.n0(parcel, 3, this.f10572b, false);
        S0.f.n0(parcel, 4, this.f10573c, false);
        S0.f.n0(parcel, 5, this.f10574d, false);
        S0.f.w0(iV0, parcel);
    }
}
