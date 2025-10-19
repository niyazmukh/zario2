package G2;

import X2.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\i.smali */
public final /* synthetic */ class i implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1858b;

    public /* synthetic */ i(Object obj, int i) {
        this.f1857a = i;
        this.f1858b = obj;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f1857a) {
            case 0:
                a0.b bVar = (a0.b) obj;
                l lVar = (l) this.f1858b;
                long j5 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        a0.d dVar = (a0.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = lVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar.e(dVar, Collections.unmodifiableSet(hashSet));
                            j5++;
                        } else {
                            bVar.d(dVar);
                        }
                    }
                }
                a0.d dVar2 = l.f1864c;
                if (j5 == 0) {
                    bVar.d(dVar2);
                    return null;
                }
                bVar.e(dVar2, Long.valueOf(j5));
                return null;
            default:
                o oVar = (o) this.f1858b;
                oVar.getClass();
                return S0.f.s(oVar, (O3.d) obj);
        }
    }
}
