package k0;

import kotlin.jvm.internal.i;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k0.1\e.smali */
public final class C0655e extends AbstractC0653c {
    public /* synthetic */ C0655e(int i) {
        this(C0651a.f8292b);
    }

    @Override // k0.AbstractC0653c
    public final Object a(InterfaceC0652b key) {
        i.e(key, "key");
        return this.f8293a.get(key);
    }

    public final void b(InterfaceC0652b key, Object obj) {
        i.e(key, "key");
        this.f8293a.put(key, obj);
    }

    public C0655e(AbstractC0653c initialExtras) {
        i.e(initialExtras, "initialExtras");
        this.f8293a.putAll(initialExtras.f8293a);
    }
}
