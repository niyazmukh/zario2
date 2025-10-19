package M;

import android.view.WindowInsetsAnimation;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\g0.smali */
public final class g0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2390e;

    public g0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2390e = windowInsetsAnimation;
    }

    @Override // M.h0
    public final long a() {
        return this.f2390e.getDurationMillis();
    }

    @Override // M.h0
    public final float b() {
        return this.f2390e.getInterpolatedFraction();
    }

    @Override // M.h0
    public final int c() {
        return this.f2390e.getTypeMask();
    }

    @Override // M.h0
    public final void d(float f2) {
        this.f2390e.setFraction(f2);
    }
}
