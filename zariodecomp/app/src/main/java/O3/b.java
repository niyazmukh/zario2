package O3;

import X3.p;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O3\b.smali */
public final class b extends kotlin.jvm.internal.j implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2655b = new b(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2656c = new b(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i5) {
        super(i);
        this.f2657a = i5;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f2657a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                i iVarMinusKey = acc2.minusKey(element2.getKey());
                j jVar = j.f2661a;
                if (iVarMinusKey == jVar) {
                    return element2;
                }
                e eVar = e.f2660a;
                f fVar = (f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(element2, iVarMinusKey);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new c(fVar, element2);
                    }
                    cVar = new c(fVar, new c(element2, iVarMinusKey2));
                }
                return cVar;
        }
    }
}
