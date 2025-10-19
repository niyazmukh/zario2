package kotlin.jvm.internal;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\l.smali */
public class l extends n implements c4.f {
    public l(Class cls, String str, String str2, int i) {
        super(b.NO_RECEIVER, cls, str, str2, i);
    }

    public final void b() {
        ((l) ((c4.f) getReflected())).b();
    }

    @Override // kotlin.jvm.internal.b
    public final c4.b computeReflected() {
        s.f8432a.getClass();
        return this;
    }

    @Override // c4.f
    public Object get(Object obj) {
        b();
        throw null;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
