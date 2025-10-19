package U0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\b.smali */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f3269a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f3269a;
        synchronized (this) {
            switch (i) {
            }
            return this;
        }
    }
}
