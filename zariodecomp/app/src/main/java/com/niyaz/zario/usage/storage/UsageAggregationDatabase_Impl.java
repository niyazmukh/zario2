package com.niyaz.zario.usage.storage;

import A2.C0009i;
import K0.p;
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
import v3.InterfaceC1003a;
import v3.c;
import y0.C1042a;
import y0.InterfaceC1044c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\usage\storage\UsageAggregationDatabase_Impl.smali */
public final class UsageAggregationDatabase_Impl extends UsageAggregationDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile C0009i f6757m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0009i f6758n;

    @Override // u0.x
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "usage_sessions", "usage_raw_events");
    }

    @Override // u0.x
    public final InterfaceC1044c e(C0968i c0968i) {
        return c0968i.f10411c.b(new C1042a(c0968i.f10409a, c0968i.f10410b, new C0954B(c0968i, new p(this), "5a776336a89e5c3df48329d01ff77a6b", "8312eeedbaa6bbd7ebed9441df8ac094"), false, false));
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
        map.put(c.class, Collections.emptyList());
        map.put(InterfaceC1003a.class, Collections.emptyList());
        return map;
    }

    @Override // com.niyaz.zario.usage.storage.UsageAggregationDatabase
    public final InterfaceC1003a q() {
        C0009i c0009i;
        if (this.f6758n != null) {
            return this.f6758n;
        }
        synchronized (this) {
            try {
                if (this.f6758n == null) {
                    this.f6758n = new C0009i(this, 20);
                }
                c0009i = this.f6758n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0009i;
    }

    @Override // com.niyaz.zario.usage.storage.UsageAggregationDatabase
    public final c r() {
        C0009i c0009i;
        if (this.f6757m != null) {
            return this.f6757m;
        }
        synchronized (this) {
            try {
                if (this.f6757m == null) {
                    this.f6757m = new C0009i(this, 21);
                }
                c0009i = this.f6757m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0009i;
    }
}
