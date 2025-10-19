package B3;

import A2.C0009i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z3.AbstractC1098w;
import z3.C1091o;

/* renamed from: B3.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\u.1.smali */
public final class C0082u extends H {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f984c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082u(U0 u02, C1091o c1091o) {
        super(c1091o, 0);
        this.f985d = u02;
    }

    @Override // B3.H
    public final void c() {
        List list;
        switch (this.f984c) {
            case 0:
                C0009i c0009i = (C0009i) this.f985d;
                J3.b.c();
                try {
                    J3.c cVar = ((C0088w) c0009i.f206d).f1000b;
                    J3.b.a();
                    J3.b.f2098a.getClass();
                    if (((z3.k0) c0009i.f205c) == null) {
                        try {
                            ((AbstractC1098w) c0009i.f204b).j();
                        } catch (Throwable th) {
                            z3.k0 k0VarG = z3.k0.f11349f.f(th).g("Failed to call onReady.");
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
            case 1:
                ((U0) this.f985d).h();
                return;
            default:
                O o5 = (O) this.f985d;
                o5.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (o5) {
                        try {
                            if (o5.f499c.isEmpty()) {
                                o5.f499c = null;
                                o5.f498b = true;
                                return;
                            } else {
                                list = o5.f499c;
                                o5.f499c = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082u(U0 u02, O o5) {
        super(u02.f558c, 0);
        this.f985d = o5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082u(C0009i c0009i) {
        super(((C0088w) c0009i.f206d).f1004f, 0);
        this.f985d = c0009i;
    }
}
