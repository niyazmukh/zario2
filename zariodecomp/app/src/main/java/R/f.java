package r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r.1\f.smali */
public final class f extends p1.b {
    @Override // p1.b
    public final void L(g gVar, g gVar2) {
        gVar.f9556b = gVar2;
    }

    @Override // p1.b
    public final void M(g gVar, Thread thread) {
        gVar.f9555a = thread;
    }

    @Override // p1.b
    public final boolean h(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9562b != dVar) {
                    return false;
                }
                hVar.f9562b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p1.b
    public final boolean i(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f9561a != obj) {
                    return false;
                }
                hVar.f9561a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p1.b
    public final boolean j(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9563c != gVar) {
                    return false;
                }
                hVar.f9563c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
