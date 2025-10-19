package I1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import t0.C0895B;
import t0.C0896C;
import t0.b0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I1\b.smali */
public final class b extends C0895B {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1921q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1922r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Context context, int i) {
        super(context);
        this.f1921q = i;
        this.f1922r = obj;
    }

    @Override // t0.C0895B
    public int b(View view, int i) {
        switch (this.f1921q) {
            case 0:
                ((CarouselLayoutManager) this.f1922r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // t0.C0895B
    public int c(View view, int i) {
        switch (this.f1921q) {
            case 0:
                ((CarouselLayoutManager) this.f1922r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // t0.C0895B
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1921q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            case 2:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t0.C0895B
    public int e(int i) {
        switch (this.f1921q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // t0.C0895B
    public PointF f(int i) {
        switch (this.f1921q) {
            case 0:
                ((CarouselLayoutManager) this.f1922r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // t0.C0895B
    public void h(View view, b0 b0Var) {
        switch (this.f1921q) {
            case 1:
                C0896C c0896c = (C0896C) this.f1922r;
                int[] iArrB = c0896c.b(c0896c.f9889a.getLayoutManager(), view);
                int i = iArrB[0];
                int i5 = iArrB[1];
                int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i5))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f9882j;
                    b0Var.f9953a = i;
                    b0Var.f9954b = i5;
                    b0Var.f9955c = iCeil;
                    b0Var.f9957e = decelerateInterpolator;
                    b0Var.f9958f = true;
                    break;
                }
                break;
            case 2:
                C0896C c0896c2 = (C0896C) this.f1922r;
                RecyclerView recyclerView = c0896c2.f9889a;
                if (recyclerView != null) {
                    int[] iArrB2 = c0896c2.b(recyclerView.getLayoutManager(), view);
                    int i6 = iArrB2[0];
                    int i7 = iArrB2[1];
                    int iCeil2 = (int) Math.ceil(e(Math.max(Math.abs(i6), Math.abs(i7))) / 0.3356d);
                    if (iCeil2 > 0) {
                        DecelerateInterpolator decelerateInterpolator2 = this.f9882j;
                        b0Var.f9953a = i6;
                        b0Var.f9954b = i7;
                        b0Var.f9955c = iCeil2;
                        b0Var.f9957e = decelerateInterpolator2;
                        b0Var.f9958f = true;
                        break;
                    }
                }
                break;
            default:
                super.h(view, b0Var);
                break;
        }
    }
}
