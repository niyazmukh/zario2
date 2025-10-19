package e2;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\h.smali */
public final class C0460h implements InterfaceC0462j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6879c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC0461i f6880a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f6881b;

    /* JADX WARN: Multi-variable type inference failed */
    public static C0460h b(InterfaceC0461i interfaceC0461i) {
        if (interfaceC0461i instanceof C0460h) {
            return (C0460h) interfaceC0461i;
        }
        C0460h c0460h = new C0460h();
        c0460h.f6881b = f6879c;
        c0460h.f6880a = interfaceC0461i;
        return c0460h;
    }

    @Override // e2.InterfaceC0462j
    public final Object a() {
        Object objA = this.f6881b;
        Object obj = f6879c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f6881b;
                    if (objA == obj) {
                        objA = this.f6880a.a();
                        Object obj2 = this.f6881b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f6881b = objA;
                        this.f6880a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
