package f4;

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\d.1.smali */
public final class C0500d implements InterfaceC0513k {

    /* renamed from: a, reason: collision with root package name */
    public final C0498c[] f7054a;

    public C0500d(C0498c[] c0498cArr) {
        this.f7054a = c0498cArr;
    }

    @Override // f4.InterfaceC0513k
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C0498c c0498c : this.f7054a) {
            P p5 = c0498c.f7051f;
            if (p5 == null) {
                kotlin.jvm.internal.i.i("handle");
                throw null;
            }
            p5.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f7054a + ']';
    }
}
