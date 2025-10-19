package t0;

import A2.C0009i;
import B3.C0043g;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: t0.M, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\M.smali */
public abstract class AbstractC0906M {

    /* renamed from: a, reason: collision with root package name */
    public C0901H f9903a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f9904b;

    /* renamed from: c, reason: collision with root package name */
    public long f9905c;

    /* renamed from: d, reason: collision with root package name */
    public long f9906d;

    /* renamed from: e, reason: collision with root package name */
    public long f9907e;

    /* renamed from: f, reason: collision with root package name */
    public long f9908f;

    public static void b(g0 g0Var) {
        RecyclerView recyclerView;
        int i = g0Var.f10011j;
        if (g0Var.g() || (i & 4) != 0 || (recyclerView = g0Var.f10019r) == null) {
            return;
        }
        recyclerView.F(g0Var);
    }

    public abstract boolean a(g0 g0Var, g0 g0Var2, M.q qVar, M.q qVar2);

    public final void c(g0 g0Var) {
        C0901H c0901h = this.f9903a;
        if (c0901h != null) {
            boolean z4 = true;
            g0Var.o(true);
            if (g0Var.h != null && g0Var.i == null) {
                g0Var.h = null;
            }
            g0Var.i = null;
            if ((g0Var.f10011j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0901h.f9900a;
            recyclerView.c0();
            C0009i c0009i = recyclerView.f4739e;
            K2.c cVar = (K2.c) c0009i.f204b;
            RecyclerView recyclerView2 = (RecyclerView) cVar.b;
            View view = g0Var.f10004a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0009i.j0(view);
            } else {
                C0043g c0043g = (C0043g) c0009i.f205c;
                if (c0043g.d(iIndexOfChild)) {
                    c0043g.f(iIndexOfChild);
                    c0009i.j0(view);
                    cVar.u(iIndexOfChild);
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                g0 g0VarI = RecyclerView.I(view);
                X x3 = recyclerView.f4733b;
                x3.j(g0VarI);
                x3.g(g0VarI);
            }
            recyclerView.d0(!z4);
            if (z4 || !g0Var.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(g0 g0Var);

    public abstract void e();

    public abstract boolean f();
}
