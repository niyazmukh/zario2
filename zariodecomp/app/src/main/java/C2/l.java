package C2;

import N2.m0;
import N2.n0;
import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\l.smali */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public n0 f1099a;

    @Override // C2.q
    public final n0 a(n0 n0Var, n0 n0Var2) {
        return n0Var2;
    }

    @Override // C2.q
    public final n0 b(n0 n0Var, l2.o oVar) {
        long jM;
        n0 n0VarC = c(n0Var);
        if (B2.p.h(n0VarC)) {
            n0 n0Var2 = this.f1099a;
            if (B2.p.h(n0Var2)) {
                long jM2 = n0VarC.M();
                if (B2.p.g(n0Var2)) {
                    jM = (long) n0Var2.K();
                } else {
                    if (!B2.p.h(n0Var2)) {
                        AbstractC0183a.z("Expected 'operand' to be of Number type, but was " + n0Var2.getClass().getCanonicalName(), new Object[0]);
                        throw null;
                    }
                    jM = n0Var2.M();
                }
                long j5 = jM2 + jM;
                if (((jM2 ^ j5) & (jM ^ j5)) < 0) {
                    j5 = j5 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                m0 m0VarT = n0.T();
                m0VarT.d();
                n0.E((n0) m0VarT.f6410b, j5);
                return (n0) m0VarT.b();
            }
        }
        if (B2.p.h(n0VarC)) {
            double d5 = d() + n0VarC.M();
            m0 m0VarT2 = n0.T();
            m0VarT2.g(d5);
            return (n0) m0VarT2.b();
        }
        AbstractC0183a.N(B2.p.g(n0VarC), "Expected NumberValue to be of type DoubleValue, but was ", n0Var.getClass().getCanonicalName());
        double d6 = d() + n0VarC.K();
        m0 m0VarT3 = n0.T();
        m0VarT3.g(d6);
        return (n0) m0VarT3.b();
    }

    @Override // C2.q
    public final n0 c(n0 n0Var) {
        if (B2.p.h(n0Var) || B2.p.g(n0Var)) {
            return n0Var;
        }
        m0 m0VarT = n0.T();
        m0VarT.d();
        n0.E((n0) m0VarT.f6410b, 0L);
        return (n0) m0VarT.b();
    }

    public final double d() {
        n0 n0Var = this.f1099a;
        if (B2.p.g(n0Var)) {
            return n0Var.K();
        }
        if (B2.p.h(n0Var)) {
            return n0Var.M();
        }
        AbstractC0183a.z("Expected 'operand' to be of Number type, but was " + n0Var.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }
}
