package f4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f4.i0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\i0.1.smali */
public class C0510i0 extends t0 implements InterfaceC0522v {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0510i0(InterfaceC0506g0 interfaceC0506g0) {
        super(true);
        boolean z4 = true;
        A(interfaceC0506g0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t0.f7099b;
        r rVar = (InterfaceC0519q) atomicReferenceFieldUpdater.get(this);
        r rVar2 = rVar instanceof r ? rVar : null;
        if (rVar2 == null) {
            z4 = false;
            break;
        }
        t0 t0VarI = rVar2.i();
        while (!t0VarI.v()) {
            r rVar3 = (InterfaceC0519q) atomicReferenceFieldUpdater.get(t0VarI);
            r rVar4 = rVar3 instanceof r ? rVar3 : null;
            if (rVar4 == null) {
                z4 = false;
                break;
            }
            t0VarI = rVar4.i();
        }
        this.f7067c = z4;
    }

    @Override // f4.t0
    public final boolean v() {
        return this.f7067c;
    }

    @Override // f4.t0
    public final boolean w() {
        return true;
    }
}
