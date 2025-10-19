package u3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\e.smali */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long f10493a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10494b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10495c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10496d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC0971a f10497e;

    /* renamed from: f, reason: collision with root package name */
    public final i f10498f;

    public e(long j5, b bVar, String packageName, String str, EnumC0971a state) {
        kotlin.jvm.internal.i.e(packageName, "packageName");
        kotlin.jvm.internal.i.e(state, "state");
        this.f10493a = j5;
        this.f10494b = bVar;
        this.f10495c = packageName;
        this.f10496d = str;
        this.f10497e = state;
        this.f10498f = i.f10508a;
    }

    @Override // u3.h
    public final b a() {
        return this.f10494b;
    }

    @Override // u3.h
    public final i b() {
        return this.f10498f;
    }

    @Override // u3.h
    public final long c() {
        return this.f10493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10493a == eVar.f10493a && this.f10494b == eVar.f10494b && kotlin.jvm.internal.i.a(this.f10495c, eVar.f10495c) && kotlin.jvm.internal.i.a(this.f10496d, eVar.f10496d) && this.f10497e == eVar.f10497e;
    }

    public final int hashCode() {
        return this.f10497e.hashCode() + B.a.f(B.a.f((this.f10494b.hashCode() + (Long.hashCode(this.f10493a) * 31)) * 31, 31, this.f10495c), 31, this.f10496d);
    }

    public final String toString() {
        return "ActivityLifecycle(epochMillis=" + this.f10493a + ", confidence=" + this.f10494b + ", packageName=" + this.f10495c + ", activityClass=" + this.f10496d + ", state=" + this.f10497e + ")";
    }
}
