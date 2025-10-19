package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\k0.smali */
public abstract class k0 extends k4.j implements P, InterfaceC0501d0 {

    /* renamed from: d, reason: collision with root package name */
    public t0 f7070d;

    @Override // f4.P
    public final void a() {
        t0 t0VarI = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t0.f7098a;
            Object obj = atomicReferenceFieldUpdater.get(t0VarI);
            if (obj instanceof k0) {
                if (obj != this) {
                    return;
                }
                S s4 = E.f7015j;
                while (!atomicReferenceFieldUpdater.compareAndSet(t0VarI, obj, s4)) {
                    if (atomicReferenceFieldUpdater.get(t0VarI) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0501d0) || ((InterfaceC0501d0) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k4.j.f8390a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof k4.p) {
                    k4.j jVar = ((k4.p) obj2).f8405a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                k4.j jVar2 = (k4.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = k4.j.f8392c;
                k4.p pVar = (k4.p) atomicReferenceFieldUpdater3.get(jVar2);
                if (pVar == null) {
                    pVar = new k4.p(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.e();
                return;
            }
        }
    }

    @Override // f4.InterfaceC0501d0
    public final w0 c() {
        return null;
    }

    public InterfaceC0506g0 getParent() {
        return i();
    }

    public final t0 i() {
        t0 t0Var = this.f7070d;
        if (t0Var != null) {
            return t0Var;
        }
        kotlin.jvm.internal.i.i("job");
        throw null;
    }

    @Override // f4.InterfaceC0501d0
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // k4.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + E.m(this) + "[job@" + E.m(i()) + ']';
    }
}
