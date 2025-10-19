package b;

import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\p.smali */
public final class p extends kotlin.jvm.internal.j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f4925a = i;
        this.f4926b = xVar;
    }

    @Override // X3.a
    public final Object invoke() {
        Object objPrevious;
        switch (this.f4925a) {
            case 0:
                this.f4926b.b();
                break;
            case 1:
                x xVar = this.f4926b;
                L3.e eVar = xVar.f4943b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((n) objPrevious).f4920a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                xVar.f4944c = null;
                break;
            default:
                this.f4926b.b();
                break;
        }
        return K3.k.f2288a;
    }
}
