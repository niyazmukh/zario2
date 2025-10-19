package f4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\c.1.smali */
public final class C0498c extends k0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7049l = AtomicReferenceFieldUpdater.newUpdater(C0498c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final C0516n f7050e;

    /* renamed from: f, reason: collision with root package name */
    public P f7051f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0502e f7052k;

    public C0498c(C0502e c0502e, C0516n c0516n) {
        this.f7052k = c0502e;
        this.f7050e = c0516n;
    }

    @Override // f4.k0
    public final boolean j() {
        return false;
    }

    @Override // f4.k0
    public final void k(Throwable th) {
        C0516n c0516n = this.f7050e;
        if (th != null) {
            c0516n.getClass();
            h1.i iVarD = c0516n.D(new C0524x(th, false), null);
            if (iVarD != null) {
                c0516n.h(iVarD);
                C0500d c0500d = (C0500d) f7049l.get(this);
                if (c0500d != null) {
                    c0500d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0502e.f7055b;
        C0502e c0502e = this.f7052k;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0502e) == 0) {
            H[] hArr = c0502e.f7056a;
            ArrayList arrayList = new ArrayList(hArr.length);
            for (H h : hArr) {
                arrayList.add(h.getCompleted());
            }
            c0516n.resumeWith(arrayList);
        }
    }
}
