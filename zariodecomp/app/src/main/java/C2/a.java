package C2;

import N2.C0138a;
import N2.b;
import N2.m0;
import N2.n0;
import com.google.protobuf.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\a.smali */
public final class a extends c {
    @Override // C2.c
    public final n0 d(n0 n0Var) {
        C0138a c0138aB;
        if (B2.p.f(n0Var)) {
            b bVarG = n0Var.G();
            C c5 = (C) bVarG.j(5);
            if (!c5.f6409a.equals(bVarG)) {
                c5.d();
                C.e(c5.f6410b, bVarG);
            }
            c0138aB = (C0138a) c5;
        } else {
            c0138aB = b.B();
        }
        for (n0 n0Var2 : this.f1077a) {
            int i = 0;
            while (i < ((b) c0138aB.f6410b).A()) {
                if (B2.p.e(((b) c0138aB.f6410b).z(i), n0Var2)) {
                    c0138aB.d();
                    b.x((b) c0138aB.f6410b, i);
                } else {
                    i++;
                }
            }
        }
        m0 m0VarT = n0.T();
        m0VarT.f(c0138aB);
        return (n0) m0VarT.b();
    }
}
