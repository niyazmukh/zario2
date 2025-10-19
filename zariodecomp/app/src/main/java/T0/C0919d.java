package t0;

import A2.RunnableC0012l;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\d.1.smali */
public final class C0919d {
    public static final V0.b h = new V0.b();

    /* renamed from: a, reason: collision with root package name */
    public final h1.i f9965a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f9966b;

    /* renamed from: e, reason: collision with root package name */
    public List f9969e;

    /* renamed from: g, reason: collision with root package name */
    public int f9971g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f9968d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f9970f = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public final V0.b f9967c = h;

    public C0919d(h1.i iVar, S0.c cVar) {
        this.f9965a = iVar;
        this.f9966b = cVar;
    }

    public final void a(RunnableC0012l runnableC0012l) throws Exception {
        Iterator it = this.f9968d.iterator();
        while (it.hasNext()) {
            ((C0897D) it.next()).f9895a.getClass();
        }
        if (runnableC0012l != null) {
            runnableC0012l.run();
        }
    }

    public final void b(List list, RunnableC0012l runnableC0012l) throws Exception {
        int i = this.f9971g + 1;
        this.f9971g = i;
        List list2 = this.f9969e;
        if (list == list2) {
            if (runnableC0012l != null) {
                runnableC0012l.run();
                return;
            }
            return;
        }
        h1.i iVar = this.f9965a;
        if (list == null) {
            int size = list2.size();
            this.f9969e = null;
            this.f9970f = Collections.emptyList();
            iVar.A(0, size);
            a(runnableC0012l);
            return;
        }
        if (list2 != null) {
            ((ExecutorService) this.f9966b.f2847b).execute(new RunnableC0918c(this, list2, list, i, runnableC0012l));
            return;
        }
        this.f9969e = list;
        this.f9970f = Collections.unmodifiableList(list);
        iVar.z(0, list.size());
        a(runnableC0012l);
    }
}
