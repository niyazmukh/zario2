package U0;

import k2.InterfaceFutureC0659b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\k.smali */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f3289k;
        }
        if (!i.f3288f.o(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!i.f3288f.o(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean l(InterfaceFutureC0659b interfaceFutureC0659b) {
        c cVar;
        interfaceFutureC0659b.getClass();
        Object obj = this.f3290a;
        if (obj == null) {
            if (interfaceFutureC0659b.isDone()) {
                if (!i.f3288f.o(this, null, i.f(interfaceFutureC0659b))) {
                    return false;
                }
                i.c(this);
            } else {
                f fVar = new f(this, interfaceFutureC0659b);
                if (i.f3288f.o(this, null, fVar)) {
                    try {
                        interfaceFutureC0659b.a(fVar, j.f3293a);
                    } catch (Throwable th) {
                        try {
                            cVar = new c(th);
                        } catch (Throwable unused) {
                            cVar = c.f3270b;
                        }
                        i.f3288f.o(this, fVar, cVar);
                    }
                } else {
                    obj = this.f3290a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        interfaceFutureC0659b.cancel(((a) obj).f3267a);
        return false;
    }
}
