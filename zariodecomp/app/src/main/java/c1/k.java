package c1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\k.smali */
public final class k extends AbstractC0596a {
    public static final Parcelable.Creator<k> CREATOR = new D0.k(29);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f5432a;

    public k(PendingIntent pendingIntent) {
        this.f5432a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return C.i(this.f5432a, ((k) obj).f5432a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5432a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5432a, i, false);
        S0.f.w0(iV0, parcel);
    }
}
