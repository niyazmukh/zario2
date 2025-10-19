package b;

import java.util.ListIterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\o.smali */
public final class o extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f4923a = i;
        this.f4924b = xVar;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f4923a) {
            case 0:
                C0245b backEvent = (C0245b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                x xVar = this.f4924b;
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
                xVar.f4944c = (n) objPrevious;
                break;
            default:
                C0245b backEvent2 = (C0245b) obj;
                kotlin.jvm.internal.i.e(backEvent2, "backEvent");
                L3.e eVar2 = this.f4924b.f4943b;
                ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious2 = listIterator2.previous();
                        if (((n) objPrevious2).f4920a) {
                        }
                    } else {
                        objPrevious2 = null;
                    }
                }
                break;
        }
        return K3.k.f2288a;
    }
}
