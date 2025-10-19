package E2;

import C.d;
import com.google.protobuf.AbstractC0388a;
import java.io.Serializable;
import r0.C0856a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\b.1.smali */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1429d;

    public /* synthetic */ b(Object obj, int i, Object obj2, int i5) {
        this.f1426a = i5;
        this.f1428c = obj;
        this.f1427b = i;
        this.f1429d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1426a) {
            case 0:
                AbstractC0101c abstractC0101c = (AbstractC0101c) ((d) this.f1428c).f1048d;
                String simpleName = abstractC0101c.getClass().getSimpleName();
                Integer numValueOf = Integer.valueOf(System.identityHashCode(abstractC0101c));
                int i = this.f1427b;
                Integer numValueOf2 = Integer.valueOf(i);
                AbstractC0388a abstractC0388a = (AbstractC0388a) this.f1429d;
                p1.b.p(1, simpleName, "(%x) Stream received (%s): %s", numValueOf, numValueOf2, abstractC0388a);
                if (i != 1) {
                    abstractC0101c.f(abstractC0388a);
                    break;
                } else {
                    abstractC0101c.e(abstractC0388a);
                    break;
                }
            default:
                ((C0856a) this.f1428c).f9565b.f(this.f1427b, (Serializable) this.f1429d);
                break;
        }
    }
}
