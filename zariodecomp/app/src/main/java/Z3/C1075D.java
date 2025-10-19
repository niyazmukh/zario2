package z3;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: z3.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\D.smali */
public final class C1075D {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f11233d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f11234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11235b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11236c;

    public C1075D(String str, String str2, long j5) {
        S0.f.l(str, "typeName");
        S0.f.g("empty type", !str.isEmpty());
        this.f11234a = str;
        this.f11235b = str2;
        this.f11236c = j5;
    }

    public static C1075D a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new C1075D(simpleName, str, f11233d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11234a + "<" + this.f11236c + ">");
        String str = this.f11235b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
