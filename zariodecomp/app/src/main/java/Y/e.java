package y;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y.1\e.smali */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f11040a;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f11040a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f11040a.p(0);
        return true;
    }
}
