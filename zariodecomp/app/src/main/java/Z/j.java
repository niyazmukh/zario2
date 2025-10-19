package Z;

import L3.x;
import V2.o;
import V2.p;
import X3.q;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z\j.smali */
public final class j extends Q3.j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3933a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3934b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i5, O3.d dVar) {
        super(i, dVar);
        this.f3933a = i5;
    }

    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f3933a) {
            case 0:
                j jVar = new j(3, 0, (O3.d) obj3);
                jVar.f3934b = (Y.e) obj;
                jVar.f3935c = (a0.b) obj2;
                return jVar.invokeSuspend(K3.k.f2288a);
            default:
                j jVar2 = new j(3, 1, (O3.d) obj3);
                jVar2.f3934b = (String) obj;
                jVar2.f3935c = (p) obj2;
                return jVar2.invokeSuspend(K3.k.f2288a);
        }
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3933a) {
            case 0:
                P3.a aVar = P3.a.f2678a;
                AbstractC0183a.m0(obj);
                Y.e eVar = (Y.e) this.f3934b;
                a0.b bVar = (a0.b) this.f3935c;
                Set setKeySet = bVar.a().keySet();
                ArrayList arrayList = new ArrayList(L3.l.a0(setKeySet));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a0.d) it.next()).f4022a);
                }
                Map<String, ?> all = eVar.a.getAll();
                kotlin.jvm.internal.i.d(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.a0(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = L3.j.z0((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        a0.b bVar2 = new a0.b(new LinkedHashMap(bVar.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String name = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                bVar2.f(r1.d.i(name), value2);
                            } else if (value2 instanceof Float) {
                                kotlin.jvm.internal.i.e(name, "name");
                                bVar2.f(new a0.d(name), value2);
                            } else if (value2 instanceof Integer) {
                                bVar2.f(r1.d.E(name), value2);
                            } else if (value2 instanceof Long) {
                                bVar2.f(r1.d.M(name), value2);
                            } else if (value2 instanceof String) {
                                bVar2.f(r1.d.V(name), value2);
                            } else if (value2 instanceof Set) {
                                a0.d dVarW = r1.d.W(name);
                                kotlin.jvm.internal.i.c(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                                bVar2.f(dVarW, (Set) value2);
                            }
                        }
                        return new a0.b(new LinkedHashMap(bVar2.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = eVar.b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
            default:
                P3.a aVar2 = P3.a.f2678a;
                AbstractC0183a.m0(obj);
                String str = (String) this.f3934b;
                o oVar = ((p) this.f3935c).f3462b;
                return new K3.i(str, oVar != null ? oVar.f3453b : null, oVar != null ? oVar.f3452a : null);
        }
    }
}
