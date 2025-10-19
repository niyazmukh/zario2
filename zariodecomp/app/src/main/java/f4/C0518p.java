package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.f;

/* renamed from: f4.p, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\p.1.smali */
public final class C0518p extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7088e;

    /* renamed from: f, reason: collision with root package name */
    public final C0516n f7089f;

    public /* synthetic */ C0518p(C0516n c0516n, int i) {
        this.f7088e = i;
        this.f7089f = c0516n;
    }

    @Override // f4.k0
    public final boolean j() {
        switch (this.f7088e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // f4.k0
    public final void k(Throwable th) {
        switch (this.f7088e) {
            case 0:
                t0 t0VarI = i();
                C0516n c0516n = this.f7089f;
                Throwable thQ = c0516n.q(t0VarI);
                if (c0516n.w()) {
                    f fVar = (f) c0516n.f7081d;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f8377l;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        h1.i iVar = k4.a.f8367c;
                        if (kotlin.jvm.internal.i.a(obj, iVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, iVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != iVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0516n.n(thQ);
                if (!c0516n.w()) {
                    c0516n.o();
                    break;
                }
                break;
            default:
                this.f7089f.resumeWith(K3.k.f2288a);
                break;
        }
    }
}
