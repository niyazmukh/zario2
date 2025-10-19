package D0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\g.smali */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f1308b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f1307a = i;
        this.f1308b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, Transformation transformation) {
        switch (this.f1307a) {
            case 0:
                this.f1308b.setAnimationProgress(f2);
                break;
            case 1:
                this.f1308b.setAnimationProgress(1.0f - f2);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f1308b;
                swipeRefreshLayout.getClass();
                int iAbs = swipeRefreshLayout.f4804B - Math.abs(swipeRefreshLayout.f4803A);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f4837z + ((int) ((iAbs - r0) * f2))) - swipeRefreshLayout.f4835x.getTop());
                e eVar = swipeRefreshLayout.f4806D;
                float f3 = 1.0f - f2;
                d dVar = eVar.f1299a;
                if (f3 != dVar.f1290p) {
                    dVar.f1290p = f3;
                }
                eVar.invalidateSelf();
                break;
            default:
                this.f1308b.k(f2);
                break;
        }
    }
}
