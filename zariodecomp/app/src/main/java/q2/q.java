package q2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q2.1\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9500a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f9501b;

    public q(Class cls, Class cls2) {
        this.f9500a = cls;
        this.f9501b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f9501b.equals(qVar.f9501b)) {
            return this.f9500a.equals(qVar.f9500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9500a.hashCode() + (this.f9501b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f9501b;
        Class cls2 = this.f9500a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
