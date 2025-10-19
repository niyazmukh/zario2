package s3;

import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\E.smali */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f9710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9713d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9714e;

    public E(String packageName, int i, int i5, int i6, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        this.f9710a = packageName;
        this.f9711b = i;
        this.f9712c = i5;
        this.f9713d = i6;
        this.f9714e = linkedHashMap;
    }

    public final double a() {
        int i = this.f9711b;
        if (i > 0) {
            return this.f9712c / i;
        }
        return 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e5 = (E) obj;
        return kotlin.jvm.internal.i.a(this.f9710a, e5.f9710a) && this.f9711b == e5.f9711b && this.f9712c == e5.f9712c && this.f9713d == e5.f9713d && this.f9714e.equals(e5.f9714e);
    }

    public final int hashCode() {
        return this.f9714e.hashCode() + B.a.c(this.f9713d, B.a.c(this.f9712c, B.a.c(this.f9711b, this.f9710a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "PackageDropStats(packageName=" + this.f9710a + ", totalEvents=" + this.f9711b + ", droppedEvents=" + this.f9712c + ", emittedEvents=" + this.f9713d + ", dropReasons=" + this.f9714e + ")";
    }
}
