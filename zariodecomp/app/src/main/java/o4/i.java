package o4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k4.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o4\i.smali */
public final class i extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f9289e;

    public i(long j5, i iVar, int i) {
        super(j5, iVar, i);
        this.f9289e = new AtomicReferenceArray(h.f9288f);
    }

    @Override // k4.s
    public final int g() {
        return h.f9288f;
    }

    @Override // k4.s
    public final void h(int i, O3.i iVar) {
        this.f9289e.set(i, h.f9287e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8408c + ", hashCode=" + hashCode() + ']';
    }
}
