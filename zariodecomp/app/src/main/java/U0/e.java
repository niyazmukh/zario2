package U0;

import a.AbstractC0183a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\e.smali */
public final class e extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3277b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3278c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3279d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3280e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3276a = atomicReferenceFieldUpdater;
        this.f3277b = atomicReferenceFieldUpdater2;
        this.f3278c = atomicReferenceFieldUpdater3;
        this.f3279d = atomicReferenceFieldUpdater4;
        this.f3280e = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0183a
    public final void a0(h hVar, h hVar2) {
        this.f3277b.lazySet(hVar, hVar2);
    }

    @Override // a.AbstractC0183a
    public final void b0(h hVar, Thread thread) {
        this.f3276a.lazySet(hVar, thread);
    }

    @Override // a.AbstractC0183a
    public final boolean n(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3279d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // a.AbstractC0183a
    public final boolean o(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3280e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // a.AbstractC0183a
    public final boolean p(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3278c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
