package t0;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\b.1.smali */
public abstract class AbstractC0917b {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f9951b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9950a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Q1.l f9952c = new Q1.l(5);

    public static int c(d0 d0Var, c0.f fVar, View view, View view2, AbstractC0910Q abstractC0910Q, boolean z4) {
        if (abstractC0910Q.v() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(AbstractC0910Q.F(view) - AbstractC0910Q.F(view2)) + 1;
        }
        return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
    }

    public static int d(d0 d0Var, c0.f fVar, View view, View view2, AbstractC0910Q abstractC0910Q, boolean z4, boolean z5) {
        if (abstractC0910Q.v() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z5 ? Math.max(0, (d0Var.b() - Math.max(AbstractC0910Q.F(view), AbstractC0910Q.F(view2))) - 1) : Math.max(0, Math.min(AbstractC0910Q.F(view), AbstractC0910Q.F(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(fVar.b(view2) - fVar.e(view)) / (Math.abs(AbstractC0910Q.F(view) - AbstractC0910Q.F(view2)) + 1))) + (fVar.k() - fVar.e(view)));
        }
        return iMax;
    }

    public static int e(d0 d0Var, c0.f fVar, View view, View view2, AbstractC0910Q abstractC0910Q, boolean z4) {
        if (abstractC0910Q.v() == 0 || d0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return d0Var.b();
        }
        return (int) (((fVar.b(view2) - fVar.e(view)) / (Math.abs(AbstractC0910Q.F(view) - AbstractC0910Q.F(view2)) + 1)) * d0Var.b());
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);
}
