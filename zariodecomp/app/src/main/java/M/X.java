package M;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\X.smali */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2367a;

    public X(View view) {
        this.f2367a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f2367a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f2367a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j5) {
        View view = (View) this.f2367a.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
    }

    public final void d(Y y4) {
        View view = (View) this.f2367a.get();
        if (view != null) {
            if (y4 != null) {
                view.animate().setListener(new F0.k(y4, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f2367a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
