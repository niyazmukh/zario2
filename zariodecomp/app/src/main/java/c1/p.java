package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\p.smali */
public final class p extends AbstractC0596a {
    public static final Parcelable.Creator<p> CREATOR = new s(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f5446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5447b;

    public p(String str, String str2) {
        C.g(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        C.e(strTrim, "Account identifier cannot be empty");
        this.f5446a = strTrim;
        C.d(str2);
        this.f5447b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return C.i(this.f5446a, pVar.f5446a) && C.i(this.f5447b, pVar.f5447b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5446a, this.f5447b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f5446a, false);
        S0.f.n0(parcel, 2, this.f5447b, false);
        S0.f.w0(iV0, parcel);
    }
}
