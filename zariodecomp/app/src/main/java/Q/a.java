package Q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2680a;

    /* renamed from: b, reason: collision with root package name */
    public int f2681b;

    /* renamed from: c, reason: collision with root package name */
    public float f2682c;

    /* renamed from: d, reason: collision with root package name */
    public float f2683d;

    /* renamed from: e, reason: collision with root package name */
    public long f2684e;

    /* renamed from: f, reason: collision with root package name */
    public long f2685f;

    /* renamed from: g, reason: collision with root package name */
    public long f2686g;
    public float h;
    public int i;

    public final float a(long j5) {
        if (j5 < this.f2684e) {
            return 0.0f;
        }
        long j6 = this.f2686g;
        if (j6 < 0 || j5 < j6) {
            return g.b((j5 - r0) / this.f2680a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b((j5 - j6) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
