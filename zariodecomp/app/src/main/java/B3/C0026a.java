package B3;

import java.io.IOException;
import z3.AbstractC1083g;
import z3.InterfaceC1085i;

/* renamed from: B3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\a.1.smali */
public final class C0026a implements InterfaceC0047h0 {

    /* renamed from: a, reason: collision with root package name */
    public z3.a0 f702a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f703b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f704c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0034d f706e;

    public C0026a(AbstractC0034d abstractC0034d, z3.a0 a0Var, m2 m2Var) {
        this.f706e = abstractC0034d;
        S0.f.l(a0Var, "headers");
        this.f702a = a0Var;
        this.f704c = m2Var;
    }

    @Override // B3.InterfaceC0047h0
    public final InterfaceC0047h0 a(InterfaceC1085i interfaceC1085i) {
        return this;
    }

    @Override // B3.InterfaceC0047h0
    public final void b(int i) {
    }

    @Override // B3.InterfaceC0047h0
    public final boolean c() {
        return this.f703b;
    }

    @Override // B3.InterfaceC0047h0
    public final void close() {
        this.f703b = true;
        S0.f.q("Lack of request message. GET request is only supported for unary requests", this.f705d != null);
        ((C3.j) this.f706e).f1183o.w(this.f702a, this.f705d);
        this.f705d = null;
        this.f702a = null;
    }

    @Override // B3.InterfaceC0047h0
    public final void d(G3.a aVar) {
        S0.f.q("writePayload should not be called multiple times", this.f705d == null);
        try {
            this.f705d = i2.g.b(aVar);
            m2 m2Var = this.f704c;
            for (AbstractC1083g abstractC1083g : m2Var.f910a) {
                abstractC1083g.i(0);
            }
            byte[] bArr = this.f705d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (AbstractC1083g abstractC1083g2 : m2Var.f910a) {
                abstractC1083g2.j(0, length, length2);
            }
            long length3 = this.f705d.length;
            AbstractC1083g[] abstractC1083gArr = m2Var.f910a;
            for (AbstractC1083g abstractC1083g3 : abstractC1083gArr) {
                abstractC1083g3.k(length3);
            }
            long length4 = this.f705d.length;
            for (AbstractC1083g abstractC1083g4 : abstractC1083gArr) {
                abstractC1083g4.l(length4);
            }
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // B3.InterfaceC0047h0
    public final void flush() {
    }
}
