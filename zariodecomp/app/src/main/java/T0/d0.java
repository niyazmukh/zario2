package t0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\d0.smali */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f9972a;

    /* renamed from: b, reason: collision with root package name */
    public int f9973b;

    /* renamed from: c, reason: collision with root package name */
    public int f9974c;

    /* renamed from: d, reason: collision with root package name */
    public int f9975d;

    /* renamed from: e, reason: collision with root package name */
    public int f9976e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9977f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9978g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9979j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9980k;

    /* renamed from: l, reason: collision with root package name */
    public int f9981l;

    /* renamed from: m, reason: collision with root package name */
    public long f9982m;

    /* renamed from: n, reason: collision with root package name */
    public int f9983n;

    public final void a(int i) {
        if ((this.f9975d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f9975d));
    }

    public final int b() {
        return this.f9978g ? this.f9973b - this.f9974c : this.f9976e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f9972a + ", mData=null, mItemCount=" + this.f9976e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f9973b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9974c + ", mStructureChanged=" + this.f9977f + ", mInPreLayout=" + this.f9978g + ", mRunSimpleAnimations=" + this.f9979j + ", mRunPredictiveAnimations=" + this.f9980k + '}';
    }
}
