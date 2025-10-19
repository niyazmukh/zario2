package u;

import java.util.HashSet;
import java.util.Iterator;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\c.smali */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final d f10227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10228c;

    /* renamed from: d, reason: collision with root package name */
    public c f10229d;

    /* renamed from: g, reason: collision with root package name */
    public t.i f10232g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f10226a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f10230e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f10231f = -1;

    public c(d dVar, int i) {
        this.f10227b = dVar;
        this.f10228c = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, -1, false);
    }

    public final boolean b(c cVar, int i, int i5, boolean z4) {
        if (cVar == null) {
            h();
            return true;
        }
        if (!z4 && !g(cVar)) {
            return false;
        }
        this.f10229d = cVar;
        if (cVar.f10226a == null) {
            cVar.f10226a = new HashSet();
        }
        this.f10229d.f10226a.add(this);
        if (i > 0) {
            this.f10230e = i;
        } else {
            this.f10230e = 0;
        }
        this.f10231f = i5;
        return true;
    }

    public final int c() {
        c cVar;
        if (this.f10227b.f10253V == 8) {
            return 0;
        }
        int i = this.f10231f;
        return (i <= -1 || (cVar = this.f10229d) == null || cVar.f10227b.f10253V != 8) ? this.f10230e : i;
    }

    public final c d() {
        int i = this.f10228c;
        int iC = t.h.c(i);
        d dVar = this.f10227b;
        switch (iC) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f10283z;
            case 2:
                return dVar.f10233A;
            case 3:
                return dVar.f10281x;
            case 4:
                return dVar.f10282y;
            default:
                throw new AssertionError(AbstractC0854a.d(i));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f10226a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f10229d != null;
    }

    public final boolean g(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f10228c;
        d dVar = cVar.f10227b;
        int i5 = cVar.f10228c;
        if (i5 == i) {
            return i != 6 || (dVar.f10280w && this.f10227b.f10280w);
        }
        switch (t.h.c(i)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z4 = i5 == 2 || i5 == 4;
                if (dVar instanceof h) {
                    return z4 || i5 == 8;
                }
                return z4;
            case 2:
            case 4:
                boolean z5 = i5 == 3 || i5 == 5;
                if (dVar instanceof h) {
                    return z5 || i5 == 9;
                }
                return z5;
            case 6:
                return (i5 == 6 || i5 == 8 || i5 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0854a.d(i));
        }
    }

    public final void h() {
        HashSet hashSet;
        c cVar = this.f10229d;
        if (cVar != null && (hashSet = cVar.f10226a) != null) {
            hashSet.remove(this);
        }
        this.f10229d = null;
        this.f10230e = 0;
        this.f10231f = -1;
    }

    public final void i() {
        t.i iVar = this.f10232g;
        if (iVar == null) {
            this.f10232g = new t.i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.f10227b.f10254W + ":" + AbstractC0854a.d(this.f10228c);
    }
}
