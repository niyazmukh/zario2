package E2;

import A2.RunnableC0012l;
import B3.C0043g;
import C.d;
import com.google.protobuf.AbstractC0388a;
import z3.AbstractC1081e;
import z3.AbstractC1098w;
import z3.a0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\m.smali */
public final class m extends AbstractC1098w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1081e[] f1472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1473c;

    public m(q qVar, d dVar, AbstractC1081e[] abstractC1081eArr) {
        this.f1473c = qVar;
        this.f1471a = dVar;
        this.f1472b = abstractC1081eArr;
    }

    @Override // z3.AbstractC1098w
    public final void g(k0 k0Var, a0 a0Var) {
        try {
            d dVar = this.f1471a;
            dVar.getClass();
            ((C0043g) dVar.f1047c).h(new RunnableC0012l(4, dVar, k0Var));
        } catch (Throwable th) {
            this.f1473c.f1482a.c(th);
        }
    }

    @Override // z3.AbstractC1098w
    public final void h(a0 a0Var) {
        try {
            d dVar = this.f1471a;
            ((C0043g) dVar.f1047c).h(new RunnableC0012l(3, dVar, a0Var));
        } catch (Throwable th) {
            this.f1473c.f1482a.c(th);
        }
    }

    @Override // z3.AbstractC1098w
    public final void i(AbstractC0388a abstractC0388a) {
        try {
            d dVar = this.f1471a;
            int i = dVar.f1046b + 1;
            ((C0043g) dVar.f1047c).h(new b(dVar, i, abstractC0388a, 0));
            dVar.f1046b = i;
            this.f1472b[0].c(1);
        } catch (Throwable th) {
            this.f1473c.f1482a.c(th);
        }
    }

    @Override // z3.AbstractC1098w
    public final void j() {
    }
}
