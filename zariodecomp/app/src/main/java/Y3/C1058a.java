package y3;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y3.1\a.smali */
public final class C1058a implements InterfaceC1060c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11162c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1060c f11163a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11164b;

    public static InterfaceC1060c a(InterfaceC1060c interfaceC1060c) {
        if (interfaceC1060c instanceof C1058a) {
            return interfaceC1060c;
        }
        C1058a c1058a = new C1058a();
        c1058a.f11164b = f11162c;
        c1058a.f11163a = interfaceC1060c;
        return c1058a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.f11164b;
        Object obj2 = f11162c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f11164b;
                    if (obj == obj2) {
                        obj = this.f11163a.get();
                        Object obj3 = this.f11164b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f11164b = obj;
                        this.f11163a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
