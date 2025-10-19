package L3;

import d4.e;
import f4.p0;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\q.smali */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2349b;

    public /* synthetic */ q(Object obj, int i) {
        this.f2348a = i;
        this.f2349b = obj;
    }

    @Override // d4.e
    public final Iterator iterator() {
        switch (this.f2348a) {
            case 0:
                return ((Collection) this.f2349b).iterator();
            case 1:
                return new d4.c(this);
            case 2:
                p0 p0Var = (p0) this.f2349b;
                d4.f fVar = new d4.f();
                fVar.c = p0Var.create(fVar, fVar);
                return fVar;
            default:
                return (Iterator) this.f2349b;
        }
    }
}
