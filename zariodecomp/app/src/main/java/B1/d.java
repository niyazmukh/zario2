package B1;

import android.animation.TimeInterpolator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B1\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f290a;

    /* renamed from: b, reason: collision with root package name */
    public long f291b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f292c;

    /* renamed from: d, reason: collision with root package name */
    public int f293d;

    /* renamed from: e, reason: collision with root package name */
    public int f294e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f292c;
        return timeInterpolator != null ? timeInterpolator : a.f284b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f290a == dVar.f290a && this.f291b == dVar.f291b && this.f293d == dVar.f293d && this.f294e == dVar.f294e) {
            return a().getClass().equals(dVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f290a;
        long j6 = this.f291b;
        return ((((a().getClass().hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31)) * 31) + this.f293d) * 31) + this.f294e;
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f290a + " duration: " + this.f291b + " interpolator: " + a().getClass() + " repeatCount: " + this.f293d + " repeatMode: " + this.f294e + "}\n";
    }
}
