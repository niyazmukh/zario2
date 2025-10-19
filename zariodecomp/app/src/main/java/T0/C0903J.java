package t0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\J.smali */
public final class C0903J extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((Z) ((Observable) this).mObservers.get(size)).f9944a;
            recyclerView.i(null);
            recyclerView.f4745i0.f9977f = true;
            recyclerView.U(true);
            if (!recyclerView.f4737d.y()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Z z4 = (Z) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = z4.f9944a;
            recyclerView.i(null);
            A2.T t4 = recyclerView.f4737d;
            t4.getClass();
            if (i != i5) {
                ArrayList arrayList = (ArrayList) t4.f136d;
                arrayList.add(t4.A(null, 8, i, i5));
                t4.f135c |= 8;
                if (arrayList.size() == 1) {
                    z4.a();
                }
            }
        }
    }

    public final void d(int i, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Z z4 = (Z) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = z4.f9944a;
            recyclerView.i(null);
            A2.T t4 = recyclerView.f4737d;
            if (i5 < 1) {
                t4.getClass();
            } else {
                ArrayList arrayList = (ArrayList) t4.f136d;
                arrayList.add(t4.A(null, 4, i, i5));
                t4.f135c |= 4;
                if (arrayList.size() == 1) {
                    z4.a();
                }
            }
        }
    }

    public final void e(int i, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Z z4 = (Z) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = z4.f9944a;
            recyclerView.i(null);
            A2.T t4 = recyclerView.f4737d;
            if (i5 < 1) {
                t4.getClass();
            } else {
                ArrayList arrayList = (ArrayList) t4.f136d;
                arrayList.add(t4.A(null, 1, i, i5));
                t4.f135c |= 1;
                if (arrayList.size() == 1) {
                    z4.a();
                }
            }
        }
    }

    public final void f(int i, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Z z4 = (Z) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = z4.f9944a;
            recyclerView.i(null);
            A2.T t4 = recyclerView.f4737d;
            if (i5 < 1) {
                t4.getClass();
            } else {
                ArrayList arrayList = (ArrayList) t4.f136d;
                arrayList.add(t4.A(null, 2, i, i5));
                t4.f135c |= 2;
                if (arrayList.size() == 1) {
                    z4.a();
                }
            }
        }
    }
}
