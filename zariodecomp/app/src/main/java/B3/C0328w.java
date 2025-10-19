package b3;

import java.util.ArrayList;

/* renamed from: b3.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\w.1.smali */
public final class C0328w {

    /* renamed from: a, reason: collision with root package name */
    public final Y2.b f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5323b;

    public C0328w(Y2.b history, ArrayList arrayList) {
        kotlin.jvm.internal.i.e(history, "history");
        this.f5322a = history;
        this.f5323b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0328w)) {
            return false;
        }
        C0328w c0328w = (C0328w) obj;
        return kotlin.jvm.internal.i.a(this.f5322a, c0328w.f5322a) && this.f5323b.equals(c0328w.f5323b);
    }

    public final int hashCode() {
        return this.f5323b.hashCode() + (this.f5322a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteCycle(history=" + this.f5322a + ", hourly=" + this.f5323b + ")";
    }
}
