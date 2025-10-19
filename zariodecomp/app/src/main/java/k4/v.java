package k4;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\v.smali */
public final class v implements O3.g {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8411a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f8412b;

    /* renamed from: c, reason: collision with root package name */
    public final w f8413c;

    public v(Integer num, ThreadLocal threadLocal) {
        this.f8411a = num;
        this.f8412b = threadLocal;
        this.f8413c = new w(threadLocal);
    }

    public final void a(Object obj) {
        this.f8412b.set(obj);
    }

    public final Object b(O3.i iVar) {
        ThreadLocal threadLocal = this.f8412b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f8411a);
        return obj;
    }

    @Override // O3.i
    public final Object fold(Object obj, X3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // O3.i
    public final O3.g get(O3.h hVar) {
        if (this.f8413c.equals(hVar)) {
            return this;
        }
        return null;
    }

    @Override // O3.g
    public final O3.h getKey() {
        return this.f8413c;
    }

    @Override // O3.i
    public final O3.i minusKey(O3.h hVar) {
        return this.f8413c.equals(hVar) ? O3.j.f2661a : this;
    }

    @Override // O3.i
    public final O3.i plus(O3.i iVar) {
        return S0.f.U(this, iVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f8411a + ", threadLocal = " + this.f8412b + ')';
    }
}
