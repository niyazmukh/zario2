package z2;

import t.h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z2.1\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f11220a;

    /* renamed from: b, reason: collision with root package name */
    public final C1071b f11221b;

    /* renamed from: c, reason: collision with root package name */
    public final C1071b f11222c;

    public c() {
        e eVar = new e();
        eVar.f11226b = 0;
        eVar.f11225a = new byte[1024];
        this.f11220a = eVar;
        this.f11221b = new C1071b(this, 0);
        this.f11222c = new C1071b(this, 1);
    }

    public final C1071b a(int i) {
        return h.a(i, 2) ? this.f11222c : this.f11221b;
    }
}
