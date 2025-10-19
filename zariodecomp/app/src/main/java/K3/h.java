package K3;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\h.smali */
public final class h implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public X3.a f2281a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2282b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2283c;

    public h(X3.a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f2281a = initializer;
        this.f2282b = j.f2287a;
        this.f2283c = this;
    }

    @Override // K3.c
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f2282b;
        j jVar = j.f2287a;
        if (obj != jVar) {
            return obj;
        }
        synchronized (this.f2283c) {
            objInvoke = this.f2282b;
            if (objInvoke == jVar) {
                X3.a aVar = this.f2281a;
                kotlin.jvm.internal.i.b(aVar);
                objInvoke = aVar.invoke();
                this.f2282b = objInvoke;
                this.f2281a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f2282b != j.f2287a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
