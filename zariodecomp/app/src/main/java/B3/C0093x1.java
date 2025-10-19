package B3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.EnumC1087k;

/* renamed from: B3.x1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\x1.1.smali */
public final class C0093x1 extends z3.M {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1080d f1020f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC1098w f1021g;
    public EnumC1087k h = EnumC1087k.f11344d;

    public C0093x1(AbstractC1080d abstractC1080d) {
        this.f1020f = abstractC1080d;
    }

    @Override // z3.M
    public final z3.k0 a(z3.J j5) {
        Boolean bool;
        List list = j5.f11250a;
        if (list.isEmpty()) {
            z3.k0 k0VarG = z3.k0.f11355n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + j5.f11251b);
            c(k0VarG);
            return k0VarG;
        }
        Object obj = j5.f11252c;
        if ((obj instanceof C0087v1) && (bool = ((C0087v1) obj).f996a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC1098w abstractC1098w = this.f1021g;
        if (abstractC1098w == null) {
            z3.H hD = z3.H.d();
            hD.e(list);
            z3.H hB = hD.b();
            AbstractC1080d abstractC1080d = this.f1020f;
            AbstractC1098w abstractC1098wG = abstractC1080d.g(hB);
            abstractC1098wG.o(new C0084u1(this, abstractC1098wG));
            this.f1021g = abstractC1098wG;
            EnumC1087k enumC1087k = EnumC1087k.f11341a;
            C0090w1 c0090w1 = new C0090w1(z3.I.b(abstractC1098wG, null), 0);
            this.h = enumC1087k;
            abstractC1080d.r(enumC1087k, c0090w1);
            abstractC1098wG.l();
        } else {
            abstractC1098w.p(list);
        }
        return z3.k0.f11348e;
    }

    @Override // z3.M
    public final void c(z3.k0 k0Var) {
        AbstractC1098w abstractC1098w = this.f1021g;
        if (abstractC1098w != null) {
            abstractC1098w.m();
            this.f1021g = null;
        }
        EnumC1087k enumC1087k = EnumC1087k.f11343c;
        C0090w1 c0090w1 = new C0090w1(z3.I.a(k0Var), 0);
        this.h = enumC1087k;
        this.f1020f.r(enumC1087k, c0090w1);
    }

    @Override // z3.M
    public final void e() {
        AbstractC1098w abstractC1098w = this.f1021g;
        if (abstractC1098w != null) {
            abstractC1098w.l();
        }
    }

    @Override // z3.M
    public final void f() {
        AbstractC1098w abstractC1098w = this.f1021g;
        if (abstractC1098w != null) {
            abstractC1098w.m();
        }
    }
}
