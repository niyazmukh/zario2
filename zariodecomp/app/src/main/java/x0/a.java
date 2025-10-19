package X0;

import D0.k;
import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import i1.AbstractC0596a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X0\a.smali */
public final class a extends AbstractC0596a {
    public static final Parcelable.Creator<a> CREATOR = new k(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3704c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3706e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3707f;

    public a(int i, long j5, String str, int i5, int i6, String str2) {
        this.f3702a = i;
        this.f3703b = j5;
        C.f(str);
        this.f3704c = str;
        this.f3705d = i5;
        this.f3706e = i6;
        this.f3707f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f3702a == aVar.f3702a && this.f3703b == aVar.f3703b && C.i(this.f3704c, aVar.f3704c) && this.f3705d == aVar.f3705d && this.f3706e == aVar.f3706e && C.i(this.f3707f, aVar.f3707f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3702a), Long.valueOf(this.f3703b), this.f3704c, Integer.valueOf(this.f3705d), Integer.valueOf(this.f3706e), this.f3707f});
    }

    public final String toString() {
        int i = this.f3705d;
        return "AccountChangeEvent {accountName = " + this.f3704c + ", changeType = " + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED") + ", changeData = " + this.f3707f + ", eventIndex = " + this.f3706e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f3702a);
        f.u0(parcel, 2, 8);
        parcel.writeLong(this.f3703b);
        f.n0(parcel, 3, this.f3704c, false);
        f.u0(parcel, 4, 4);
        parcel.writeInt(this.f3705d);
        f.u0(parcel, 5, 4);
        parcel.writeInt(this.f3706e);
        f.n0(parcel, 6, this.f3707f, false);
        f.w0(iV0, parcel);
    }
}
