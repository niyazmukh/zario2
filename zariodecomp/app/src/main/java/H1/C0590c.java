package h1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.AbstractC0596a;
import java.util.Arrays;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\c.smali */
public final class C0590c extends AbstractC0596a {
    public static final Parcelable.Creator<C0590c> CREATOR = new g1.m(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7628b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7629c;

    public C0590c(String str, long j5) {
        this.f7627a = str;
        this.f7629c = j5;
        this.f7628b = -1;
    }

    public final long c() {
        long j5 = this.f7629c;
        return j5 == -1 ? this.f7628b : j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0590c) {
            C0590c c0590c = (C0590c) obj;
            String str = this.f7627a;
            if (((str != null && str.equals(c0590c.f7627a)) || (str == null && c0590c.f7627a == null)) && c() == c0590c.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7627a, Long.valueOf(c())});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.c(this.f7627a, "name");
        lVar.c(Long.valueOf(c()), "version");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.n0(parcel, 1, this.f7627a, false);
        S0.f.u0(parcel, 2, 4);
        parcel.writeInt(this.f7628b);
        long jC = c();
        S0.f.u0(parcel, 3, 8);
        parcel.writeLong(jC);
        S0.f.w0(iV0, parcel);
    }

    public C0590c(String str, long j5, int i) {
        this.f7627a = str;
        this.f7628b = i;
        this.f7629c = j5;
    }
}
