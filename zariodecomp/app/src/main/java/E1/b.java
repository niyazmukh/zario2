package e1;

import S0.f;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.s;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e1.1\b.smali */
public final class b extends AbstractC0596a {
    public static final Parcelable.Creator<b> CREATOR = new s(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f6847a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f6848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6849c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6851e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6852f;

    public b(int i, int i5, PendingIntent pendingIntent, int i6, Bundle bundle, byte[] bArr) {
        this.f6851e = i;
        this.f6847a = i5;
        this.f6849c = i6;
        this.f6852f = bundle;
        this.f6850d = bArr;
        this.f6848b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f6847a);
        f.m0(parcel, 2, this.f6848b, i, false);
        f.u0(parcel, 3, 4);
        parcel.writeInt(this.f6849c);
        f.f0(parcel, 4, this.f6852f, false);
        f.g0(parcel, 5, this.f6850d, false);
        f.u0(parcel, 1000, 4);
        parcel.writeInt(this.f6851e);
        f.w0(iV0, parcel);
    }
}
