package z3;

/* renamed from: z3.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\l.1.smali */
public final class C1088l {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1087k f11361a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f11362b;

    public C1088l(EnumC1087k enumC1087k, k0 k0Var) {
        this.f11361a = enumC1087k;
        S0.f.l(k0Var, "status is null");
        this.f11362b = k0Var;
    }

    public static C1088l a(EnumC1087k enumC1087k) {
        S0.f.g("state is TRANSIENT_ERROR. Use forError() instead", enumC1087k != EnumC1087k.f11343c);
        return new C1088l(enumC1087k, k0.f11348e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1088l)) {
            return false;
        }
        C1088l c1088l = (C1088l) obj;
        return this.f11361a.equals(c1088l.f11361a) && this.f11362b.equals(c1088l.f11362b);
    }

    public final int hashCode() {
        return this.f11362b.hashCode() ^ this.f11361a.hashCode();
    }

    public final String toString() {
        k0 k0Var = this.f11362b;
        boolean zE = k0Var.e();
        EnumC1087k enumC1087k = this.f11361a;
        if (zE) {
            return enumC1087k.toString();
        }
        return enumC1087k + "(" + k0Var + ")";
    }
}
