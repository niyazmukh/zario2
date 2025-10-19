package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.AbstractC0596a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\Scope.smali */
public final class Scope extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new c1.s(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f5528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5529b;

    public Scope(int i, String str) {
        C.e(str, "scopeUri must not be null or empty");
        this.f5528a = i;
        this.f5529b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5529b.equals(((Scope) obj).f5529b);
    }

    public final int hashCode() {
        return this.f5529b.hashCode();
    }

    public final String toString() {
        return this.f5529b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5528a);
        S0.f.n0(parcel, 2, this.f5529b, false);
        S0.f.w0(iV0, parcel);
    }
}
