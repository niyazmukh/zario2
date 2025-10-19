package B3;

import A2.C0009i;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import z3.AbstractC1098w;

/* renamed from: B3.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\s.1.smali */
public final class C0077s extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f963c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0009i f964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077s(C0009i c0009i, z3.a0 a0Var) {
        super(((C0088w) c0009i.f206d).f1004f, 0);
        this.f964d = c0009i;
        this.f965e = a0Var;
    }

    @Override // B3.H
    public final void c() {
        switch (this.f963c) {
            case 0:
                C0009i c0009i = this.f964d;
                J3.b.c();
                try {
                    J3.c cVar = ((C0088w) c0009i.f206d).f1000b;
                    J3.b.a();
                    J3.b.f2098a.getClass();
                    if (((z3.k0) c0009i.f205c) == null) {
                        try {
                            ((AbstractC1098w) c0009i.f204b).h((z3.a0) this.f965e);
                        } catch (Throwable th) {
                            z3.k0 k0VarG = z3.k0.f11349f.f(th).g("Failed to read headers");
                            c0009i.f205c = k0VarG;
                            ((C0088w) c0009i.f206d).f1006j.h(k0VarG);
                        }
                    }
                    J3.b.f2098a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        J3.b.f2098a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                J3.b.c();
                try {
                    J3.c cVar2 = ((C0088w) this.f964d.f206d).f1000b;
                    J3.b.a();
                    J3.a aVar = J3.b.f2098a;
                    aVar.getClass();
                    e();
                    aVar.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        J3.b.f2098a.getClass();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    public void e() throws IOException {
        C0009i c0009i = this.f964d;
        z3.k0 k0Var = (z3.k0) c0009i.f205c;
        C0088w c0088w = (C0088w) c0009i.f206d;
        g1.i iVar = (g1.i) this.f965e;
        if (k0Var != null) {
            Logger logger = AbstractC0056k0.f858a;
            while (true) {
                InputStream inputStreamU = iVar.u();
                if (inputStreamU == null) {
                    return;
                } else {
                    AbstractC0056k0.b(inputStreamU);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamU2 = iVar.u();
                    if (inputStreamU2 == null) {
                        return;
                    }
                    try {
                        ((AbstractC1098w) c0009i.f204b).i(c0088w.f999a.c(inputStreamU2));
                        inputStreamU2.close();
                    } catch (Throwable th) {
                        AbstractC0056k0.b(inputStreamU2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = AbstractC0056k0.f858a;
                    while (true) {
                        InputStream inputStreamU3 = iVar.u();
                        if (inputStreamU3 == null) {
                            z3.k0 k0VarG = z3.k0.f11349f.f(th2).g("Failed to read message.");
                            c0009i.f205c = k0VarG;
                            c0088w.f1006j.h(k0VarG);
                            return;
                        }
                        AbstractC0056k0.b(inputStreamU3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077s(C0009i c0009i, g1.i iVar) {
        super(((C0088w) c0009i.f206d).f1004f, 0);
        this.f964d = c0009i;
        this.f965e = iVar;
    }
}
