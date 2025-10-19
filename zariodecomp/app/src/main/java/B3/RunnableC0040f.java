package B3;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC0910Q;

/* renamed from: B3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\f.1.smali */
public final class RunnableC0040f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f801a;

    /* renamed from: b, reason: collision with root package name */
    public int f802b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f803c;

    public /* synthetic */ RunnableC0040f(Object obj, int i, int i5) {
        this.f801a = i5;
        this.f803c = obj;
        this.f802b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f801a) {
            case 0:
                C3.i iVar = (C3.i) this.f803c;
                try {
                    J3.b.c();
                    try {
                        J3.a aVar = J3.b.f2098a;
                        aVar.getClass();
                        C0051i1 c0051i1 = iVar.f752a;
                        int i = this.f802b;
                        c0051i1.getClass();
                        S0.f.g("numMessages must be > 0", i > 0);
                        if (!c0051i1.e()) {
                            c0051i1.f838q += i;
                            c0051i1.a();
                        }
                        aVar.getClass();
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    iVar.m(th);
                    return;
                }
            case 1:
                ((U0) this.f803c).f561f.c(this.f802b);
                return;
            case 2:
                C.b bVar = (C.b) ((g1.i) this.f803c).f7594b;
                if (bVar != null) {
                    bVar.g(this.f802b);
                    return;
                }
                return;
            case 3:
                ((SystemForegroundService) this.f803c).f4871e.cancel(this.f802b);
                return;
            case 4:
                ((Z1.c) this.f803c).f3992k.x(this.f802b, 4);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f803c;
                int size = arrayList.size();
                int i5 = 0;
                if (this.f802b != 1) {
                    while (i5 < size) {
                        ((c0.g) arrayList.get(i5)).getClass();
                        i5++;
                    }
                    return;
                } else {
                    while (i5 < size) {
                        ((c0.g) arrayList.get(i5)).a();
                        i5++;
                    }
                    return;
                }
            case 6:
                ((com.google.android.gms.common.api.internal.D) this.f803c).i(this.f802b);
                return;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.o) this.f803c).f5980i0;
                if (recyclerView.f4776z) {
                    return;
                }
                AbstractC0910Q abstractC0910Q = recyclerView.f4759q;
                if (abstractC0910Q == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                } else {
                    abstractC0910Q.v0(recyclerView, this.f802b);
                    return;
                }
        }
    }

    public RunnableC0040f(List list, int i, Throwable th) {
        this.f801a = 5;
        r1.d.m(list, "initCallbacks cannot be null");
        this.f803c = new ArrayList(list);
        this.f802b = i;
    }

    public RunnableC0040f(Z1.c cVar) {
        this.f801a = 4;
        this.f803c = cVar;
        this.f802b = -1;
    }
}
