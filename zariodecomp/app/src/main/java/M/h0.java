package M;

import android.view.animation.Interpolator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\h0.smali */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2391a;

    /* renamed from: b, reason: collision with root package name */
    public float f2392b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2393c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2394d;

    public h0(int i, Interpolator interpolator, long j5) {
        this.f2391a = i;
        this.f2393c = interpolator;
        this.f2394d = j5;
    }

    public long a() {
        return this.f2394d;
    }

    public float b() {
        Interpolator interpolator = this.f2393c;
        return interpolator != null ? interpolator.getInterpolation(this.f2392b) : this.f2392b;
    }

    public int c() {
        return this.f2391a;
    }

    public void d(float f2) {
        this.f2392b = f2;
    }
}
