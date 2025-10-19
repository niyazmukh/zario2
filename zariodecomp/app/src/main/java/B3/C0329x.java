package b3;

/* renamed from: b3.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\x.1.smali */
public final class C0329x {

    /* renamed from: a, reason: collision with root package name */
    public final V2.n f5324a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5325b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5326c;

    public C0329x(V2.n nVar, Integer num, Integer num2) {
        this.f5324a = nVar;
        this.f5325b = num;
        this.f5326c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0329x)) {
            return false;
        }
        C0329x c0329x = (C0329x) obj;
        return kotlin.jvm.internal.i.a(this.f5324a, c0329x.f5324a) && kotlin.jvm.internal.i.a(this.f5325b, c0329x.f5325b) && kotlin.jvm.internal.i.a(this.f5326c, c0329x.f5326c);
    }

    public final int hashCode() {
        V2.n nVar = this.f5324a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Integer num = this.f5325b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5326c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteUserState(plan=" + this.f5324a + ", goalSuccessStreak=" + this.f5325b + ", pointsBalance=" + this.f5326c + ")";
    }
}
