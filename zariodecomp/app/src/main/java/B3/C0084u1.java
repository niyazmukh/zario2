package B3;

import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1088l;
import z3.EnumC1087k;

/* renamed from: B3.u1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\u1.1.smali */
public final class C0084u1 implements z3.L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1098w f990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0093x1 f991b;

    public C0084u1(C0093x1 c0093x1, AbstractC1098w abstractC1098w) {
        this.f991b = c0093x1;
        this.f990a = abstractC1098w;
    }

    @Override // z3.L
    public final void a(C1088l c1088l) {
        z3.K c0090w1;
        C0093x1 c0093x1 = this.f991b;
        c0093x1.getClass();
        EnumC1087k enumC1087k = c1088l.f11361a;
        if (enumC1087k == EnumC1087k.f11345e) {
            return;
        }
        EnumC1087k enumC1087k2 = EnumC1087k.f11343c;
        EnumC1087k enumC1087k3 = EnumC1087k.f11344d;
        AbstractC1080d abstractC1080d = c0093x1.f1020f;
        if (enumC1087k == enumC1087k2 || enumC1087k == enumC1087k3) {
            abstractC1080d.q();
        }
        if (c0093x1.h == enumC1087k2) {
            if (enumC1087k == EnumC1087k.f11341a) {
                return;
            }
            if (enumC1087k == enumC1087k3) {
                c0093x1.e();
                return;
            }
        }
        int iOrdinal = enumC1087k.ordinal();
        if (iOrdinal != 0) {
            AbstractC1098w abstractC1098w = this.f990a;
            if (iOrdinal == 1) {
                c0090w1 = new C0090w1(z3.I.b(abstractC1098w, null), 0);
            } else if (iOrdinal == 2) {
                c0090w1 = new C0090w1(z3.I.a(c1088l.f11362b), 0);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC1087k);
                }
                c0090w1 = new C0076r1(c0093x1, abstractC1098w);
            }
        } else {
            c0090w1 = new C0090w1(z3.I.f11245e, 0);
        }
        c0093x1.h = enumC1087k;
        abstractC1080d.r(enumC1087k, c0090w1);
    }
}
