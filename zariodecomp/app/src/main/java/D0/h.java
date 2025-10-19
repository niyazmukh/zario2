package D0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\h.smali */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f1311c;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i, int i5) {
        this.f1311c = swipeRefreshLayout;
        this.f1309a = i;
        this.f1310b = i5;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f2, Transformation transformation) {
        this.f1311c.f4806D.setAlpha((int) (((this.f1310b - r0) * f2) + this.f1309a));
    }
}
