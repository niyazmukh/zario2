package Q3;

import f4.A;
import f4.C0516n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\c.smali */
public abstract class c extends a {
    private final O3.i _context;
    private transient O3.d intercepted;

    public c(O3.d dVar, O3.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // O3.d
    public O3.i getContext() {
        O3.i iVar = this._context;
        kotlin.jvm.internal.i.b(iVar);
        return iVar;
    }

    public final O3.d intercepted() {
        O3.d fVar = this.intercepted;
        if (fVar == null) {
            A a5 = (O3.f) getContext().get(O3.e.f2660a);
            fVar = a5 != null ? new k4.f(a5, this) : this;
            this.intercepted = fVar;
        }
        return fVar;
    }

    @Override // Q3.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O3.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            O3.g gVar = getContext().get(O3.e.f2660a);
            kotlin.jvm.internal.i.b(gVar);
            k4.f fVar = (k4.f) dVar;
            do {
                atomicReferenceFieldUpdater = k4.f.f8377l;
            } while (atomicReferenceFieldUpdater.get(fVar) == k4.a.f8367c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0516n c0516n = obj instanceof C0516n ? (C0516n) obj : null;
            if (c0516n != null) {
                c0516n.o();
            }
        }
        this.intercepted = b.f2810a;
    }

    public c(O3.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
