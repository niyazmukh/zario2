package h2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7671b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7672c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f7670a = obj;
        this.f7671b = obj2;
        this.f7672c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f7670a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f7671b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f7672c);
        return new IllegalArgumentException(sb.toString());
    }
}
