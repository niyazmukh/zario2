package E2;

import A2.C0014n;
import A2.RunnableC0012l;
import B3.C0063m1;
import N2.r0;
import N2.t0;
import a.AbstractC0183a;
import com.google.protobuf.C0407k;
import java.util.ArrayDeque;
import java.util.HashSet;
import s2.AbstractC0869c;
import t0.C0908O;
import z3.j0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\w.smali */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0063m1 f1507a;

    public w(C0063m1 c0063m1) {
        this.f1507a = c0063m1;
    }

    public final void a() {
        I i = (I) this.f1507a.i;
        AbstractC0183a.N(i.c(), "Writing handshake requires an opened stream", new Object[0]);
        AbstractC0183a.N(!i.f1422s, "Handshake already completed", new Object[0]);
        r0 r0VarZ = t0.z();
        String str = (String) i.f1421r.f2868c;
        r0VarZ.d();
        t0.v((t0) r0VarZ.f6410b, str);
        i.i((t0) r0VarZ.b());
    }

    public final void b(k0 k0Var) {
        C0063m1 c0063m1 = this.f1507a;
        c0063m1.getClass();
        if (k0Var.e()) {
            AbstractC0183a.N(!c0063m1.j(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        boolean zE = k0Var.e();
        I i = (I) c0063m1.i;
        if (!zE) {
            ArrayDeque arrayDeque = (ArrayDeque) c0063m1.f909k;
            if (!arrayDeque.isEmpty()) {
                boolean z4 = i.f1422s;
                j0 j0Var = k0Var.f11358a;
                if (z4) {
                    AbstractC0183a.N(true ^ k0Var.e(), "Handling write error with status OK.", new Object[0]);
                    HashSet hashSet = C0106i.f1454d;
                    if (C0106i.a((w2.o) w2.o.f10947o.get(j0Var.f11339a, w2.o.UNKNOWN)) && !j0Var.equals(j0.ABORTED)) {
                        C2.i iVar = (C2.i) arrayDeque.poll();
                        i.b();
                        int i5 = iVar.f1087a;
                        X2.o oVarE = ((y2.t) ((C0908O) c0063m1.f903c).f9909a).e();
                        oVarE.b("handleRejectedWrite");
                        A2.r rVar = (A2.r) oVarE.f3847a;
                        AbstractC0869c abstractC0869c = (AbstractC0869c) rVar.f233a.V("Reject batch", new C0014n(rVar, i5));
                        if (!abstractC0869c.isEmpty()) {
                            X2.o.g(k0Var, "Write failed at %s", ((B2.h) abstractC0869c.j()).f315a);
                        }
                        oVarE.h(i5, k0Var);
                        oVarE.l(i5);
                        oVarE.c(abstractC0869c, null);
                        c0063m1.c();
                    }
                } else {
                    AbstractC0183a.N(!k0Var.e(), "Handling write error with status OK.", new Object[0]);
                    HashSet hashSet2 = C0106i.f1454d;
                    if (C0106i.a((w2.o) w2.o.f10947o.get(j0Var.f11339a, w2.o.UNKNOWN))) {
                        p1.b.p(1, "RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", F2.s.h(i.f1423t), k0Var);
                        C0407k c0407k = I.f1420u;
                        c0407k.getClass();
                        i.f1423t = c0407k;
                        A2.r rVar2 = (A2.r) c0063m1.f904d;
                        rVar2.f233a.W("Set stream token", new RunnableC0012l(1, rVar2, c0407k));
                    }
                }
            }
        }
        if (c0063m1.j()) {
            AbstractC0183a.N(c0063m1.j(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            i.g();
        }
    }
}
