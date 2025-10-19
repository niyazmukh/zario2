package E2;

import A2.C0004d;
import A2.C0009i;
import A2.C0020u;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.C0908O;
import y2.C1050C;
import y2.C1051D;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\u.smali */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public int f1501b;

    /* renamed from: c, reason: collision with root package name */
    public C0009i f1502c;

    /* renamed from: e, reason: collision with root package name */
    public final F2.f f1504e;

    /* renamed from: f, reason: collision with root package name */
    public final C0004d f1505f;

    /* renamed from: a, reason: collision with root package name */
    public int f1500a = 1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1503d = true;

    public u(F2.f fVar, C0004d c0004d) {
        this.f1504e = fVar;
        this.f1505f = c0004d;
    }

    public final void a(String str) {
        String strL = B.a.l("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (!this.f1503d) {
            p1.b.p(1, "OnlineStateTracker", "%s", strL);
        } else {
            p1.b.p(2, "OnlineStateTracker", "%s", strL);
            this.f1503d = false;
        }
    }

    public final void b(int i) {
        boolean z4;
        S0.c cVar;
        if (i != this.f1500a) {
            this.f1500a = i;
            X2.o oVarE = ((y2.t) ((C0908O) this.f1505f.f177b).f9909a).e();
            oVarE.b("handleOnlineStateChange");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((HashMap) oVarE.f3849c).entrySet().iterator();
            while (true) {
                z4 = false;
                if (!it.hasNext()) {
                    break;
                }
                C1050C c1050c = ((y2.x) ((Map.Entry) it.next()).getValue()).f11159c;
                if (c1050c.f11065c && i == 3) {
                    c1050c.f11065c = false;
                    cVar = c1050c.a(new C0020u(c1050c.f11066d, new h1.i(25), c1050c.f11069g, false, 5), null, false);
                } else {
                    cVar = new S0.c(13, (Object) null, Collections.emptyList());
                }
                AbstractC0183a.N(((List) cVar.f2848c).isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
                C1051D c1051d = (C1051D) cVar.f2847b;
                if (c1051d != null) {
                    arrayList.add(c1051d);
                }
            }
            ((C3.x) oVarE.f3857m).b(arrayList);
            C3.x xVar = (C3.x) oVarE.f3857m;
            xVar.f1259a = i;
            Iterator it2 = ((HashMap) xVar.f1261c).values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((y2.h) it2.next()).f11096a.iterator();
                while (it3.hasNext()) {
                    y2.w wVar = (y2.w) it3.next();
                    wVar.f11155e = i;
                    C1051D c1051d2 = wVar.f11156f;
                    if (c1051d2 != null && !wVar.f11154d && wVar.d(c1051d2, i)) {
                        wVar.c(wVar.f11156f);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                xVar.c();
            }
        }
    }

    public final void c(int i) {
        C0009i c0009i = this.f1502c;
        if (c0009i != null) {
            c0009i.w();
            this.f1502c = null;
        }
        this.f1501b = 0;
        if (i == 2) {
            this.f1503d = false;
        }
        b(i);
    }
}
