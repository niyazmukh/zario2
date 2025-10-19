package U0;

import a.AbstractC0183a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\g.smali */
public final class g extends AbstractC0183a {
    @Override // a.AbstractC0183a
    public final void a0(h hVar, h hVar2) {
        hVar.f3285b = hVar2;
    }

    @Override // a.AbstractC0183a
    public final void b0(h hVar, Thread thread) {
        hVar.f3284a = thread;
    }

    @Override // a.AbstractC0183a
    public final boolean n(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3291b != dVar) {
                    return false;
                }
                iVar.f3291b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0183a
    public final boolean o(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f3290a != obj) {
                    return false;
                }
                iVar.f3290a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0183a
    public final boolean p(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3292c != hVar) {
                    return false;
                }
                iVar.f3292c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
