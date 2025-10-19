package z0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z0.1\e.smali */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f11181a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f11182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, Throwable th) {
        super(th);
        B.a.r(i, "callbackName");
        this.f11181a = i;
        this.f11182b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f11182b;
    }
}
