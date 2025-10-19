package Z;

import X3.p;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z\k.smali */
public final class k extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f3937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Set set, O3.d dVar) {
        super(2, dVar);
        this.f3937b = set;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        k kVar = new k(this.f3937b, dVar);
        kVar.f3936a = obj;
        return kVar;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((a0.b) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        AbstractC0183a.m0(obj);
        Set setKeySet = ((a0.b) this.f3936a).a().keySet();
        ArrayList arrayList = new ArrayList(L3.l.a0(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a0.d) it.next()).f4022a);
        }
        LinkedHashSet linkedHashSet = l.f3938a;
        boolean z4 = true;
        Set set = this.f3937b;
        if (set != linkedHashSet) {
            if (set == null || !set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z4 = false;
            } else {
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }
}
