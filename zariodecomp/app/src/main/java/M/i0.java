package M;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\i0.smali */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f2396a;

    public i0(int i, Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2396a = new g0(e0.i(i, interpolator, j5));
        } else {
            this.f2396a = new d0(i, interpolator, j5);
        }
    }
}
