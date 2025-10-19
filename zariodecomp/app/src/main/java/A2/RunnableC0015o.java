package A2;

import a.AbstractC0183a;
import android.util.SparseArray;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.niyaz.zario.ui.splash.SplashFragment;
import java.util.Iterator;

/* renamed from: A2.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\o.1.smali */
public final /* synthetic */ class RunnableC0015o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223c;

    public /* synthetic */ RunnableC0015o(Object obj, int i, int i5) {
        this.f221a = i5;
        this.f223c = obj;
        this.f222b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f221a) {
            case 0:
                r rVar = (r) this.f223c;
                SparseArray sparseArray = rVar.f240j;
                int i = this.f222b;
                g0 g0Var = (g0) sparseArray.get(i);
                AbstractC0183a.N(g0Var != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
                Iterator it = rVar.h.r(i).iterator();
                while (true) {
                    s2.d dVar = (s2.d) it;
                    boolean zHasNext = ((Iterator) dVar.f9680b).hasNext();
                    S0.f fVar = rVar.f233a;
                    if (!zHasNext) {
                        fVar.H().e(g0Var);
                        sparseArray.remove(i);
                        rVar.f241k.remove(g0Var.f193a);
                        break;
                    } else {
                        fVar.H().m((B2.h) dVar.next());
                    }
                }
            case 1:
                ((C.b) this.f223c).g(this.f222b);
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f223c;
                View view = (View) sideSheetBehavior.f6103p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f222b, false);
                    break;
                }
                break;
            default:
                SplashFragment splashFragment = (SplashFragment) this.f223c;
                if (splashFragment.w()) {
                    S0.f.z(splashFragment).h(this.f222b, null);
                    break;
                }
                break;
        }
    }
}
