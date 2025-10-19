package J0;

import java.util.Set;

/* renamed from: J0.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\e.1.smali */
public final class C0111e {
    public static final C0111e i = new C0111e(1, false, false, false, false, -1, -1, L3.u.f2353a);

    /* renamed from: a, reason: collision with root package name */
    public final int f2036a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2037b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2038c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2039d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2040e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2041f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2042g;
    public final Set h;

    public C0111e(int i5, boolean z4, boolean z5, boolean z6, boolean z7, long j5, long j6, Set contentUriTriggers) {
        B.a.r(i5, "requiredNetworkType");
        kotlin.jvm.internal.i.e(contentUriTriggers, "contentUriTriggers");
        this.f2036a = i5;
        this.f2037b = z4;
        this.f2038c = z5;
        this.f2039d = z6;
        this.f2040e = z7;
        this.f2041f = j5;
        this.f2042g = j6;
        this.h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0111e.class.equals(obj.getClass())) {
            return false;
        }
        C0111e c0111e = (C0111e) obj;
        if (this.f2037b == c0111e.f2037b && this.f2038c == c0111e.f2038c && this.f2039d == c0111e.f2039d && this.f2040e == c0111e.f2040e && this.f2041f == c0111e.f2041f && this.f2042g == c0111e.f2042g && this.f2036a == c0111e.f2036a) {
            return kotlin.jvm.internal.i.a(this.h, c0111e.h);
        }
        return false;
    }

    public final int hashCode() {
        int iC = ((((((((t.h.c(this.f2036a) * 31) + (this.f2037b ? 1 : 0)) * 31) + (this.f2038c ? 1 : 0)) * 31) + (this.f2039d ? 1 : 0)) * 31) + (this.f2040e ? 1 : 0)) * 31;
        long j5 = this.f2041f;
        int i5 = (iC + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2042g;
        return this.h.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + B.a.x(this.f2036a) + ", requiresCharging=" + this.f2037b + ", requiresDeviceIdle=" + this.f2038c + ", requiresBatteryNotLow=" + this.f2039d + ", requiresStorageNotLow=" + this.f2040e + ", contentTriggerUpdateDelayMillis=" + this.f2041f + ", contentTriggerMaxDelayMillis=" + this.f2042g + ", contentUriTriggers=" + this.h + ", }";
    }

    public C0111e(C0111e other) {
        kotlin.jvm.internal.i.e(other, "other");
        this.f2037b = other.f2037b;
        this.f2038c = other.f2038c;
        this.f2036a = other.f2036a;
        this.f2039d = other.f2039d;
        this.f2040e = other.f2040e;
        this.h = other.h;
        this.f2041f = other.f2041f;
        this.f2042g = other.f2042g;
    }
}
