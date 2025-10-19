package k3;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC0907N;
import t0.d0;
import t0.g0;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\c.smali */
public final class C0662c extends AbstractC0907N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8309b;

    public /* synthetic */ C0662c(int i, int i5) {
        this.f8308a = i5;
        this.f8309b = i;
    }

    @Override // t0.AbstractC0907N
    public final void a(Rect outRect, View view, RecyclerView parent, d0 state) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        switch (this.f8308a) {
            case 0:
                kotlin.jvm.internal.i.e(outRect, "outRect");
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(parent, "parent");
                kotlin.jvm.internal.i.e(state, "state");
                g0 g0VarI = RecyclerView.I(view);
                int iF = -1;
                if (g0VarI != null && (recyclerView = g0VarI.f10019r) != null) {
                    iF = recyclerView.F(g0VarI);
                }
                int i = this.f8309b;
                if (iF == 0) {
                    outRect.left = i;
                }
                outRect.right = i;
                break;
            case 1:
                kotlin.jvm.internal.i.e(outRect, "outRect");
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(parent, "parent");
                kotlin.jvm.internal.i.e(state, "state");
                g0 g0VarI2 = RecyclerView.I(view);
                int iF2 = -1;
                if (g0VarI2 != null && (recyclerView2 = g0VarI2.f10019r) != null) {
                    iF2 = recyclerView2.F(g0VarI2);
                }
                if (iF2 > 0) {
                    outRect.top = this.f8309b;
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.i.e(outRect, "outRect");
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(parent, "parent");
                kotlin.jvm.internal.i.e(state, "state");
                g0 g0VarI3 = RecyclerView.I(view);
                int iF3 = -1;
                if (g0VarI3 != null && (recyclerView3 = g0VarI3.f10019r) != null) {
                    iF3 = recyclerView3.F(g0VarI3);
                }
                if (iF3 > 0) {
                    outRect.top = this.f8309b;
                    break;
                }
                break;
        }
    }
}
