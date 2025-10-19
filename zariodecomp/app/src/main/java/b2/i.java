package B2;

import A2.C0002b;
import java.util.Comparator;
import java.util.Map;
import y2.C1050C;
import y2.C1057f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B2\i.smali */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f317b;

    public /* synthetic */ i(Comparator comparator, int i) {
        this.f316a = i;
        this.f317b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f316a) {
            case 0:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                int iCompare = ((G1.d) this.f317b).compare(lVar, lVar2);
                return iCompare == 0 ? lVar.f322a.compareTo(lVar2.f322a) : iCompare;
            case 1:
                C1057f c1057f = (C1057f) obj;
                C1057f c1057f2 = (C1057f) obj2;
                int iCompare2 = Integer.compare(C1050C.b(c1057f), C1050C.b(c1057f2));
                return iCompare2 != 0 ? iCompare2 : ((G1.d) this.f317b).compare(c1057f.f11092b, c1057f2.f11092b);
            default:
                return ((C0002b) this.f317b).compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
        }
    }
}
