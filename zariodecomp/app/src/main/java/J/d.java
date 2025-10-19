package J;

import S0.v;
import java.util.ArrayList;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J\d.smali */
public final class d implements L.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1997b;

    public /* synthetic */ d(Object obj, int i) {
        this.f1996a = i;
        this.f1997b = obj;
    }

    @Override // L.a
    public final void a(Object obj) {
        switch (this.f1996a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((v) this.f1997b).i(eVar);
                return;
            default:
                e eVar2 = (e) obj;
                synchronized (f.f2002c) {
                    try {
                        C0834k c0834k = f.f2003d;
                        ArrayList arrayList = (ArrayList) c0834k.getOrDefault((String) this.f1997b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0834k.remove((String) this.f1997b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((L.a) arrayList.get(i)).a(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
