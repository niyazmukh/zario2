package h4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\b.smali */
public final /* synthetic */ class b implements X3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7772c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f7770a = i;
        this.f7771b = obj;
        this.f7772c = obj2;
    }

    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f7770a) {
            case 0:
                k4.a.a((X3.l) this.f7771b, this.f7772c, (O3.i) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o4.c.f9273g;
                ((o4.b) this.f7772c).getClass();
                o4.c cVar = (o4.c) this.f7771b;
                atomicReferenceFieldUpdater.set(cVar, null);
                cVar.e(null);
                break;
        }
        return K3.k.f2288a;
    }
}
