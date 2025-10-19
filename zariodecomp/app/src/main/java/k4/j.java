package k4;

import f4.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\j.smali */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8390a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8391b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8392c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(j jVar, int i) {
        while (true) {
            j jVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8391b;
            if (jVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    jVarE = (j) obj;
                    if (!jVarE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarE);
                }
            }
            if (jVarE instanceof h) {
                return (((h) jVarE).f8389d & i) == 0 && jVarE.d(jVar, i);
            }
            atomicReferenceFieldUpdater.set(jVar, jVarE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8390a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(jVarE, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(jVarE) != this) {
                    break;
                }
            }
            jVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((k4.p) r6).f8405a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k4.j e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = k4.j.f8391b
            java.lang.Object r1 = r0.get(r9)
            k4.j r1 = (k4.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = k4.j.f8390a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof k4.p
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            k4.p r6 = (k4.p) r6
            k4.j r6 = r6.f8405a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            k4.j r3 = (k4.j) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.i.c(r6, r4)
            r4 = r6
            k4.j r4 = (k4.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.j.e():k4.j");
    }

    public final void f(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8391b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f8390a.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (h()) {
                jVar.e();
                return;
            }
            return;
        }
    }

    public final j g() {
        j jVar;
        Object obj = f8390a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (jVar = pVar.f8405a) != null) {
            return jVar;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean h() {
        return f8390a.get(this) instanceof p;
    }

    public String toString() {
        return new i(this, E.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + E.m(this);
    }
}
