package t0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\C.smali */
public final class C0896C extends AbstractC0912T {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f9889a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f9890b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f9891c = new j0(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9892d;

    /* renamed from: e, reason: collision with root package name */
    public C0899F f9893e;

    /* renamed from: f, reason: collision with root package name */
    public C0899F f9894f;

    public C0896C(int i) {
        this.f9892d = i;
    }

    public static int c(View view, c0.f fVar) {
        return ((fVar.c(view) / 2) + fVar.e(view)) - ((fVar.l() / 2) + fVar.k());
    }

    public static View e(AbstractC0910Q abstractC0910Q, c0.f fVar) {
        int iV = abstractC0910Q.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (fVar.l() / 2) + fVar.k();
        int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = abstractC0910Q.u(i5);
            int iAbs = Math.abs(((fVar.c(viewU) / 2) + fVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public static View f(AbstractC0910Q abstractC0910Q, c0.f fVar) {
        int iV = abstractC0910Q.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (fVar.l() / 2) + fVar.k();
        int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < iV; i5++) {
            View viewU = abstractC0910Q.u(i5);
            int iAbs = Math.abs(((fVar.c(viewU) / 2) + fVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9889a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        j0 j0Var = this.f9891c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f4748k0;
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
            this.f9889a.setOnFlingListener(null);
        }
        this.f9889a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f9889a.h(j0Var);
            this.f9889a.setOnFlingListener(this);
            this.f9890b = new Scroller(this.f9889a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public final int[] b(AbstractC0910Q abstractC0910Q, View view) {
        switch (this.f9892d) {
            case 0:
                int[] iArr = new int[2];
                if (abstractC0910Q.d()) {
                    c0.f fVarH = h(abstractC0910Q);
                    iArr[0] = ((fVarH.c(view) / 2) + fVarH.e(view)) - ((fVarH.l() / 2) + fVarH.k());
                } else {
                    iArr[0] = 0;
                }
                if (abstractC0910Q.e()) {
                    c0.f fVarJ = j(abstractC0910Q);
                    iArr[1] = ((fVarJ.c(view) / 2) + fVarJ.e(view)) - ((fVarJ.l() / 2) + fVarJ.k());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (abstractC0910Q.d()) {
                    iArr2[0] = c(view, i(abstractC0910Q));
                } else {
                    iArr2[0] = 0;
                }
                if (abstractC0910Q.e()) {
                    iArr2[1] = c(view, k(abstractC0910Q));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public int d(AbstractC0910Q abstractC0910Q, c0.f fVar, int i, int i5) {
        this.f9890b.fling(0, 0, i, i5, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        int[] iArr = {this.f9890b.getFinalX(), this.f9890b.getFinalY()};
        int iV = abstractC0910Q.v();
        float f2 = 1.0f;
        if (iV != 0) {
            View view = null;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i8 = 0; i8 < iV; i8++) {
                View viewU = abstractC0910Q.u(i8);
                int iF = AbstractC0910Q.F(viewU);
                if (iF != -1) {
                    if (iF < i7) {
                        view = viewU;
                        i7 = iF;
                    }
                    if (iF > i6) {
                        view2 = viewU;
                        i6 = iF;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(fVar.b(view), fVar.b(view2)) - Math.min(fVar.e(view), fVar.e(view2));
                if (iMax != 0) {
                    f2 = (iMax * 1.0f) / ((i6 - i7) + 1);
                }
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f2);
    }

    public final View g(AbstractC0910Q abstractC0910Q) {
        switch (this.f9892d) {
            case 0:
                if (abstractC0910Q.e()) {
                    return e(abstractC0910Q, j(abstractC0910Q));
                }
                if (abstractC0910Q.d()) {
                    return e(abstractC0910Q, h(abstractC0910Q));
                }
                return null;
            default:
                if (abstractC0910Q.e()) {
                    return f(abstractC0910Q, k(abstractC0910Q));
                }
                if (abstractC0910Q.d()) {
                    return f(abstractC0910Q, i(abstractC0910Q));
                }
                return null;
        }
    }

    public c0.f h(AbstractC0910Q abstractC0910Q) {
        C0899F c0899f = this.f9894f;
        if (c0899f == null || ((AbstractC0910Q) c0899f.f5354b) != abstractC0910Q) {
            this.f9894f = new C0899F(abstractC0910Q, 0);
        }
        return this.f9894f;
    }

    public c0.f i(AbstractC0910Q abstractC0910Q) {
        C0899F c0899f = this.f9894f;
        if (c0899f == null || ((AbstractC0910Q) c0899f.f5354b) != abstractC0910Q) {
            this.f9894f = new C0899F(abstractC0910Q, 0);
        }
        return this.f9894f;
    }

    public c0.f j(AbstractC0910Q abstractC0910Q) {
        C0899F c0899f = this.f9893e;
        if (c0899f == null || ((AbstractC0910Q) c0899f.f5354b) != abstractC0910Q) {
            this.f9893e = new C0899F(abstractC0910Q, 1);
        }
        return this.f9893e;
    }

    public c0.f k(AbstractC0910Q abstractC0910Q) {
        C0899F c0899f = this.f9893e;
        if (c0899f == null || ((AbstractC0910Q) c0899f.f5354b) != abstractC0910Q) {
            this.f9893e = new C0899F(abstractC0910Q, 1);
        }
        return this.f9893e;
    }

    public final void l() {
        AbstractC0910Q layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f9889a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewG);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.f9889a.b0(i, iArrB[1], false);
    }
}
