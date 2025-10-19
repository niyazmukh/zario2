package q2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\m.smali */
public final class m implements H2.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9493c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f9494a = f9493c;

    /* renamed from: b, reason: collision with root package name */
    public volatile H2.b f9495b;

    public m(H2.b bVar) {
        this.f9495b = bVar;
    }

    @Override // H2.b
    public final Object get() {
        Object obj = this.f9494a;
        Object obj2 = f9493c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f9494a;
                    if (obj == obj2) {
                        obj = this.f9495b.get();
                        this.f9494a = obj;
                        this.f9495b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
