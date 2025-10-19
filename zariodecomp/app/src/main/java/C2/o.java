package C2;

import N2.C;
import N2.E;
import N2.m0;
import N2.n0;
import com.google.protobuf.A0;
import com.google.protobuf.B0;
import p1.b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\o.smali */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1105a = new o();

    @Override // C2.q
    public final n0 a(n0 n0Var, n0 n0Var2) {
        return n0Var2;
    }

    @Override // C2.q
    public final n0 b(n0 n0Var, l2.o oVar) {
        m0 m0VarT = n0.T();
        m0VarT.j("server_timestamp");
        n0 n0Var2 = (n0) m0VarT.b();
        m0 m0VarT2 = n0.T();
        A0 a0A = B0.A();
        long j5 = oVar.f8792a;
        a0A.d();
        B0.v((B0) a0A.f6410b, j5);
        a0A.d();
        B0.w((B0) a0A.f6410b, oVar.f8793b);
        m0VarT2.d();
        n0.v((n0) m0VarT2.f6410b, (B0) a0A.b());
        n0 n0Var3 = (n0) m0VarT2.b();
        C cB = E.B();
        cB.f(n0Var2, "__type__");
        cB.f(n0Var3, "__local_write_time__");
        if (b.A(n0Var)) {
            n0Var = b.u(n0Var);
        }
        if (n0Var != null) {
            cB.f(n0Var, "__previous_value__");
        }
        m0 m0VarT3 = n0.T();
        m0VarT3.h(cB);
        return (n0) m0VarT3.b();
    }

    @Override // C2.q
    public final n0 c(n0 n0Var) {
        return null;
    }
}
