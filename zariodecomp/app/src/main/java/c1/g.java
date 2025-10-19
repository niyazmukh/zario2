package c1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c1.1\g.smali */
public final class g extends AbstractC0596a {
    public static final Parcelable.Creator<g> CREATOR = new D0.k(21);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f5424a;

    public g(PendingIntent pendingIntent) {
        C.f(pendingIntent);
        this.f5424a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f5424a, i, false);
        S0.f.w0(iV0, parcel);
    }
}
