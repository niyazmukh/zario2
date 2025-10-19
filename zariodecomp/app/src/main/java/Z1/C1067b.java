package z1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import i1.AbstractC0596a;
import v1.Y;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z1.1\b.smali */
public final class C1067b extends AbstractC0596a implements s {
    public static final Parcelable.Creator<C1067b> CREATOR = new Y(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f11204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11205b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f11206c;

    public C1067b(int i, int i5, Intent intent) {
        this.f11204a = i;
        this.f11205b = i5;
        this.f11206c = intent;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f11205b == 0 ? Status.f5530e : Status.f5534m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f11204a);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f11205b);
        S0.f.m0(parcel, 3, this.f11206c, i, false);
        S0.f.w0(iV0, parcel);
    }
}
