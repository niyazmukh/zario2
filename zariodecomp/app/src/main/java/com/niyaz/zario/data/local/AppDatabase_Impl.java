package com.niyaz.zario.data.local;

import K0.p;
import S0.b;
import S0.e;
import S0.l;
import X2.a;
import X2.c;
import X2.g;
import X2.o;
import java.util.ArrayList;
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

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\data\local\AppDatabase_Impl.smali */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile e f6631m;

    /* renamed from: n, reason: collision with root package name */
    public volatile l f6632n;

    /* renamed from: o, reason: collision with root package name */
    public volatile o f6633o;

    @Override // u0.x
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "evaluation_history", "hourly_app_usage", "pending_cycle_sync", "pending_hourly_sync", "hourly_sync_state");
    }

    @Override // u0.x
    public final InterfaceC1044c e(C0968i c0968i) {
        return c0968i.f10411c.b(new C1042a(c0968i.f10409a, c0968i.f10410b, new C0954B(c0968i, new p(this), "406066dfa62251f0b3b11f0c16cc5391", "8bc811c4925527b8e4d7c2f87b2b5746"), false, false));
    }

    @Override // u0.x
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // u0.x
    public final Set h() {
        return new HashSet();
    }

    @Override // u0.x
    public final Map i() {
        HashMap map = new HashMap();
        map.put(a.class, Collections.emptyList());
        map.put(c.class, Collections.emptyList());
        map.put(g.class, Collections.emptyList());
        return map;
    }

    @Override // com.niyaz.zario.data.local.AppDatabase
    public final a q() {
        e eVar;
        if (this.f6631m != null) {
            return this.f6631m;
        }
        synchronized (this) {
            try {
                if (this.f6631m == null) {
                    e eVar2 = new e();
                    eVar2.f2851a = this;
                    eVar2.f2852b = new b(this, 7);
                    this.f6631m = eVar2;
                }
                eVar = this.f6631m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // com.niyaz.zario.data.local.AppDatabase
    public final c r() {
        l lVar;
        if (this.f6632n != null) {
            return this.f6632n;
        }
        synchronized (this) {
            try {
                if (this.f6632n == null) {
                    this.f6632n = new l(this);
                }
                lVar = this.f6632n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // com.niyaz.zario.data.local.AppDatabase
    public final g s() {
        o oVar;
        if (this.f6633o != null) {
            return this.f6633o;
        }
        synchronized (this) {
            try {
                if (this.f6633o == null) {
                    this.f6633o = new o(this);
                }
                oVar = this.f6633o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }
}
