package c1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\m.smali */
public final class m extends AbstractC0596a {
    public static final Parcelable.Creator<m> CREATOR = new s(1);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f5436a;

    public m(PendingIntent pendingIntent) {
        C.f(pendingIntent);
        this.f5436a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return C.i(this.f5436a, ((m) obj).f5436a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5436a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5436a, i, false);
        S0.f.w0(iV0, parcel);
    }
}
