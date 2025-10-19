package h4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\l.smali */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7815a;

    public l(Throwable th) {
        this.f7815a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (kotlin.jvm.internal.i.a(this.f7815a, ((l) obj).f7815a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f7815a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // h4.m
    public final String toString() {
        return "Closed(" + this.f7815a + ')';
    }
}
