package androidx.work.impl;

import K0.d;
import K0.p;
import S0.b;
import S0.c;
import S0.e;
import S0.f;
import S0.h;
import S0.i;
import S0.l;
import S0.n;
import S0.t;
import S0.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.C0954B;
import u0.C0968i;
import u0.s;
import y0.C1042a;
import y0.InterfaceC1044c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\WorkDatabase_Impl.smali */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile t f4849m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f4850n;

    /* renamed from: o, reason: collision with root package name */
    public volatile v f4851o;

    /* renamed from: p, reason: collision with root package name */
    public volatile i f4852p;

    /* renamed from: q, reason: collision with root package name */
    public volatile l f4853q;

    /* renamed from: r, reason: collision with root package name */
    public volatile n f4854r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f4855s;

    @Override // u0.x
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // u0.x
    public final InterfaceC1044c e(C0968i c0968i) {
        return c0968i.f10411c.b(new C1042a(c0968i.f10409a, c0968i.f10410b, new C0954B(c0968i, new p(this), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032"), false, false));
    }

    @Override // u0.x
    public final List f(LinkedHashMap linkedHashMap) {
        int i = 14;
        int i5 = 13;
        int i6 = 17;
        int i7 = 18;
        return Arrays.asList(new d(i5, i, 10), new d(11), new d(16, i6, 12), new d(i6, i7, i5), new d(i7, 19, i), new d(15));
    }

    @Override // u0.x
    public final Set h() {
        return new HashSet();
    }

    @Override // u0.x
    public final Map i() {
        HashMap map = new HashMap();
        map.put(t.class, Collections.emptyList());
        map.put(c.class, Collections.emptyList());
        map.put(v.class, Collections.emptyList());
        map.put(i.class, Collections.emptyList());
        map.put(l.class, Collections.emptyList());
        map.put(n.class, Collections.emptyList());
        map.put(e.class, Collections.emptyList());
        map.put(f.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c q() {
        c cVar;
        if (this.f4850n != null) {
            return this.f4850n;
        }
        synchronized (this) {
            try {
                if (this.f4850n == null) {
                    this.f4850n = new c(this);
                }
                cVar = this.f4850n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e r() {
        e eVar;
        if (this.f4855s != null) {
            return this.f4855s;
        }
        synchronized (this) {
            try {
                if (this.f4855s == null) {
                    e eVar2 = new e();
                    eVar2.f2851a = this;
                    eVar2.f2852b = new b(this, 1);
                    this.f4855s = eVar2;
                }
                eVar = this.f4855s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i s() {
        i iVar;
        if (this.f4852p != null) {
            return this.f4852p;
        }
        synchronized (this) {
            try {
                if (this.f4852p == null) {
                    this.f4852p = new i(this);
                }
                iVar = this.f4852p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l t() {
        l lVar;
        if (this.f4853q != null) {
            return this.f4853q;
        }
        synchronized (this) {
            try {
                if (this.f4853q == null) {
                    this.f4853q = new l(this);
                }
                lVar = this.f4853q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n u() {
        n nVar;
        if (this.f4854r != null) {
            return this.f4854r;
        }
        synchronized (this) {
            try {
                if (this.f4854r == null) {
                    n nVar2 = new n();
                    nVar2.f2872a = this;
                    nVar2.f2873b = new b(this, 4);
                    nVar2.f2874c = new h(this, 2);
                    nVar2.f2875d = new h(this, 3);
                    this.f4854r = nVar2;
                }
                nVar = this.f4854r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t v() {
        t tVar;
        if (this.f4849m != null) {
            return this.f4849m;
        }
        synchronized (this) {
            try {
                if (this.f4849m == null) {
                    this.f4849m = new t(this);
                }
                tVar = this.f4849m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v w() {
        v vVar;
        if (this.f4851o != null) {
            return this.f4851o;
        }
        synchronized (this) {
            try {
                if (this.f4851o == null) {
                    this.f4851o = new v(this);
                }
                vVar = this.f4851o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }
}
