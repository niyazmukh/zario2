package S1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\u.smali */
public final class u extends e {

    /* renamed from: g, reason: collision with root package name */
    public int f3023g;
    public int h;
    public boolean i;

    @Override // S1.e
    public final void a() {
        if (this.f3023g == 0) {
            if (this.f2954b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f2955c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
