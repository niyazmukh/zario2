package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\E.smali */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0215s f4419b = new C0215s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4420a;

    public E(C0209l c0209l) {
        AbstractC0220x.a(c0209l, "output");
        this.f4420a = c0209l;
        c0209l.f4524b = this;
    }

    public void a(int i, boolean z4) {
        ((C0209l) this.f4420a).b1(i, z4);
    }

    public void b(int i, C0204g c0204g) {
        ((C0209l) this.f4420a).c1(i, c0204g);
    }

    public void c(int i, double d5) {
        C0209l c0209l = (C0209l) this.f4420a;
        c0209l.getClass();
        c0209l.g1(i, Double.doubleToRawLongBits(d5));
    }

    public void d(int i, int i5) {
        ((C0209l) this.f4420a).i1(i, i5);
    }

    public void e(int i, int i5) {
        ((C0209l) this.f4420a).e1(i, i5);
    }

    public void f(int i, long j5) {
        ((C0209l) this.f4420a).g1(i, j5);
    }

    public void g(int i, float f2) {
        C0209l c0209l = (C0209l) this.f4420a;
        c0209l.getClass();
        c0209l.e1(i, Float.floatToRawIntBits(f2));
    }

    public void h(int i, Object obj, V v4) {
        C0209l c0209l = (C0209l) this.f4420a;
        c0209l.m1(i, 3);
        v4.f((AbstractC0198a) obj, c0209l.f4524b);
        c0209l.m1(i, 4);
    }

    public void i(int i, int i5) {
        ((C0209l) this.f4420a).i1(i, i5);
    }

    public void j(int i, long j5) {
        ((C0209l) this.f4420a).p1(i, j5);
    }

    public void k(int i, Object obj, V v4) {
        C0209l c0209l = (C0209l) this.f4420a;
        AbstractC0198a abstractC0198a = (AbstractC0198a) obj;
        c0209l.m1(i, 2);
        c0209l.o1(abstractC0198a.a(v4));
        v4.f(abstractC0198a, c0209l.f4524b);
    }

    public void l(int i, int i5) {
        ((C0209l) this.f4420a).e1(i, i5);
    }

    public void m(int i, long j5) {
        ((C0209l) this.f4420a).g1(i, j5);
    }

    public void n(int i, int i5) {
        C0209l c0209l = (C0209l) this.f4420a;
        c0209l.n1(i, (i5 >> 31) ^ (i5 << 1));
    }

    public void o(int i, long j5) {
        C0209l c0209l = (C0209l) this.f4420a;
        c0209l.p1(i, (j5 >> 63) ^ (j5 << 1));
    }

    public void p(int i, int i5) {
        ((C0209l) this.f4420a).n1(i, i5);
    }

    public void q(int i, long j5) {
        ((C0209l) this.f4420a).p1(i, j5);
    }

    public E() {
        S s4 = S.f4448c;
        Object obj = f4419b;
        try {
            obj = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        K[] kArr = {C0215s.f4559b, obj};
        D d5 = new D();
        d5.f4418a = kArr;
        Charset charset = AbstractC0220x.f4563a;
        this.f4420a = d5;
    }
}
