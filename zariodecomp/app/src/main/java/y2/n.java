package y2;

import B3.C0063m1;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\n.smali */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f11122c;

    public /* synthetic */ n(o oVar, w wVar, int i) {
        this.f11120a = i;
        this.f11121b = oVar;
        this.f11122c = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i5;
        boolean z4;
        switch (this.f11120a) {
            case 0:
                C3.x xVar = this.f11121b.f11128f;
                xVar.getClass();
                w wVar = this.f11122c;
                v vVar = wVar.f11151a;
                HashMap map = (HashMap) xVar.f1261c;
                h hVar = (h) map.get(vVar);
                if (hVar != null) {
                    ArrayList arrayList = hVar.f11096a;
                    arrayList.remove(wVar);
                    if (arrayList.isEmpty()) {
                        i = wVar.a() ? 1 : 2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((w) it.next()).a()) {
                                }
                            } else if (wVar.a()) {
                                i = 3;
                            }
                        }
                        i = 4;
                    }
                    int iC = t.h.c(i);
                    X2.o oVar = (X2.o) xVar.f1260b;
                    if (iC == 0) {
                        map.remove(vVar);
                        oVar.m(vVar, true);
                        break;
                    } else if (iC == 1) {
                        map.remove(vVar);
                        oVar.m(vVar, false);
                        break;
                    } else if (iC == 2) {
                        oVar.b("stopListeningToRemoteStore");
                        x xVar2 = (x) ((HashMap) oVar.f3849c).get(vVar);
                        AbstractC0183a.N(xVar2 != null, "Trying to stop listening to a query not found", new Object[0]);
                        int i6 = xVar2.f11158b;
                        List list = (List) ((HashMap) oVar.f3850d).get(Integer.valueOf(i6));
                        list.remove(vVar);
                        if (list.isEmpty()) {
                            ((C0063m1) oVar.f3848b).l(i6);
                            break;
                        }
                    }
                }
                break;
            default:
                C3.x xVar3 = this.f11121b.f11128f;
                xVar3.getClass();
                w wVar2 = this.f11122c;
                v vVar2 = wVar2.f11151a;
                HashMap map2 = (HashMap) xVar3.f1261c;
                h hVar2 = (h) map2.get(vVar2);
                if (hVar2 == null) {
                    hVar2 = new h();
                    map2.put(vVar2, hVar2);
                    i5 = wVar2.a() ? 1 : 2;
                } else {
                    Iterator it2 = hVar2.f11096a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((w) it2.next()).a()) {
                            }
                        } else if (wVar2.a()) {
                            i5 = 3;
                        }
                    }
                    i5 = 4;
                }
                hVar2.f11096a.add(wVar2);
                int i7 = xVar3.f1259a;
                wVar2.f11155e = i7;
                C1051D c1051d = wVar2.f11156f;
                if (c1051d == null || wVar2.f11154d || !wVar2.d(c1051d, i7)) {
                    z4 = false;
                } else {
                    wVar2.c(wVar2.f11156f);
                    z4 = true;
                }
                AbstractC0183a.N(!z4, "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
                C1051D c1051d2 = hVar2.f11097b;
                if (c1051d2 != null && wVar2.b(c1051d2)) {
                    xVar3.c();
                }
                int iC2 = t.h.c(i5);
                X2.o oVar2 = (X2.o) xVar3.f1260b;
                if (iC2 == 0) {
                    oVar2.e(vVar2, true);
                    break;
                } else if (iC2 == 1) {
                    oVar2.e(vVar2, false);
                    break;
                } else if (iC2 == 2) {
                    oVar2.b("listenToRemoteStore");
                    AbstractC0183a.N(((HashMap) oVar2.f3849c).containsKey(vVar2), "This is the first listen to query: %s", vVar2);
                    ((C0063m1) oVar2.f3848b).e(((A2.r) oVar2.f3847a).a(vVar2.g()));
                    break;
                }
                break;
        }
    }
}
