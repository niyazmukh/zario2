package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\l.smali */
public final class l implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.j f2289a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2290b;

    /* JADX WARN: Type inference failed for: r0v1, types: [X3.a, java.lang.Object, kotlin.jvm.internal.j] */
    @Override // K3.c
    public final Object getValue() {
        if (this.f2290b == j.f2287a) {
            ?? r02 = this.f2289a;
            kotlin.jvm.internal.i.b(r02);
            this.f2290b = r02.invoke();
            this.f2289a = null;
        }
        return this.f2290b;
    }

    public final String toString() {
        return this.f2290b != j.f2287a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
