package s3;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\F.smali */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final long f9715a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9718d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9719e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9720f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f9721g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f9722j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f9723k;

    public F(long j5, long j6, int i, int i5, int i6, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i7, int i8, ArrayList arrayList, LinkedHashMap linkedHashMap3) {
        this.f9715a = j5;
        this.f9716b = j6;
        this.f9717c = i;
        this.f9718d = i5;
        this.f9719e = i6;
        this.f9720f = linkedHashMap;
        this.f9721g = linkedHashMap2;
        this.h = i7;
        this.i = i8;
        this.f9722j = arrayList;
        this.f9723k = linkedHashMap3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f2 = (F) obj;
        return this.f9715a == f2.f9715a && this.f9716b == f2.f9716b && this.f9717c == f2.f9717c && this.f9718d == f2.f9718d && this.f9719e == f2.f9719e && this.f9720f.equals(f2.f9720f) && this.f9721g.equals(f2.f9721g) && this.h == f2.h && this.i == f2.i && this.f9722j.equals(f2.f9722j) && this.f9723k.equals(f2.f9723k);
    }

    public final int hashCode() {
        return this.f9723k.hashCode() + ((this.f9722j.hashCode() + B.a.c(this.i, B.a.c(this.h, (this.f9721g.hashCode() + ((this.f9720f.hashCode() + B.a.c(this.f9719e, B.a.c(this.f9718d, B.a.c(this.f9717c, B.a.e(Long.hashCode(this.f9715a) * 31, 31, this.f9716b), 31), 31), 31)) * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Result(windowStartMs=" + this.f9715a + ", windowEndMs=" + this.f9716b + ", sliceCount=" + this.f9717c + ", totalEventsRead=" + this.f9718d + ", eventsEmitted=" + this.f9719e + ", suppressedTaskRootPackages=" + this.f9720f + ", suppressedTaskRootClassNames=" + this.f9721g + ", nullPackageDrops=" + this.h + ", unknownTypeDrops=" + this.i + ", droppedEvents=" + this.f9722j + ", perPackageStats=" + this.f9723k + ")";
    }
}
