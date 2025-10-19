package u3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\f.smali */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final long f10499a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10500b;

    /* renamed from: c, reason: collision with root package name */
    public final c f10501c;

    /* renamed from: d, reason: collision with root package name */
    public final i f10502d;

    public f(long j5, b bVar, c state) {
        kotlin.jvm.internal.i.e(state, "state");
        this.f10499a = j5;
        this.f10500b = bVar;
        this.f10501c = state;
        this.f10502d = i.f10509b;
    }

    @Override // u3.h
    public final b a() {
        return this.f10500b;
    }

    @Override // u3.h
    public final i b() {
        return this.f10502d;
    }

    @Override // u3.h
    public final long c() {
        return this.f10499a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10499a == fVar.f10499a && this.f10500b == fVar.f10500b && this.f10501c == fVar.f10501c;
    }

    public final int hashCode() {
        return this.f10501c.hashCode() + ((this.f10500b.hashCode() + (Long.hashCode(this.f10499a) * 31)) * 31);
    }

    public final String toString() {
        return "ScreenState(epochMillis=" + this.f10499a + ", confidence=" + this.f10500b + ", state=" + this.f10501c + ")";
    }
}
