package c1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\l.smali */
public final class l extends AbstractC0596a {
    public static final Parcelable.Creator<l> CREATOR = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final p f5433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5435c;

    public l(p pVar, String str, int i) {
        C.f(pVar);
        this.f5433a = pVar;
        this.f5434b = str;
        this.f5435c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C.i(this.f5433a, lVar.f5433a) && C.i(this.f5434b, lVar.f5434b) && this.f5435c == lVar.f5435c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5433a, this.f5434b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5433a, i, false);
        S0.f.n0(parcel, 2, this.f5434b, false);
        S0.f.u0(parcel, 3, 4);
        parcel.writeInt(this.f5435c);
        S0.f.w0(iV0, parcel);
    }
}
