package z3;

import A2.C0020u;

/* renamed from: z3.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\v.1.smali */
public abstract class AbstractC1097v extends AbstractC1081e {
    @Override // z3.AbstractC1081e
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // z3.AbstractC1081e
    public void b() {
        f().b();
    }

    @Override // z3.AbstractC1081e
    public final void c(int i) {
        f().c(i);
    }

    @Override // z3.AbstractC1081e
    public final void d(com.google.protobuf.E e5) {
        f().d(e5);
    }

    @Override // z3.AbstractC1081e
    public void e(AbstractC1098w abstractC1098w, a0 a0Var) {
        f().e(abstractC1098w, a0Var);
    }

    public abstract AbstractC1081e f();

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(f(), "delegate");
        return c0020uX.toString();
    }
}
