package k4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\e.smali */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient O3.i f8376a;

    public e(O3.i iVar) {
        this.f8376a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f8376a.toString();
    }
}
