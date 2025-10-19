package f4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\Y.smali */
public abstract class Y extends A {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7041f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f7042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7043d;

    /* renamed from: e, reason: collision with root package name */
    public L3.h f7044e;

    public final void o(boolean z4) {
        long j5 = this.f7042c - (z4 ? 4294967296L : 1L);
        this.f7042c = j5;
        if (j5 <= 0 && this.f7043d) {
            shutdown();
        }
    }

    public final void p(L l4) {
        L3.h hVar = this.f7044e;
        if (hVar == null) {
            hVar = new L3.h();
            this.f7044e = hVar;
        }
        hVar.addLast(l4);
    }

    public abstract Thread q();

    public final void r(boolean z4) {
        this.f7042c = (z4 ? 4294967296L : 1L) + this.f7042c;
        if (z4) {
            return;
        }
        this.f7043d = true;
    }

    public final boolean s() {
        return this.f7042c >= 4294967296L;
    }

    public abstract void shutdown();

    public abstract long t();

    public final boolean u() {
        L3.h hVar = this.f7044e;
        if (hVar == null) {
            return false;
        }
        L l4 = (L) (hVar.isEmpty() ? null : hVar.removeFirst());
        if (l4 == null) {
            return false;
        }
        l4.run();
        return true;
    }

    public void v(long j5, V v4) {
        F.f7017n.A(j5, v4);
    }
}
