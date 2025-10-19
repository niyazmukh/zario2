package k4;

import f4.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\c.smali */
public final class c implements C {

    /* renamed from: a, reason: collision with root package name */
    public final O3.i f8374a;

    public c(O3.i iVar) {
        this.f8374a = iVar;
    }

    @Override // f4.C
    public final O3.i e() {
        return this.f8374a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f8374a + ')';
    }
}
