package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import h1.C0588a;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n1.C0763a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\O.smali */
public final class O extends AbstractC0374l {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5689d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f5690e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzg f5691f;

    /* renamed from: g, reason: collision with root package name */
    public final C0763a f5692g;
    public final long h;
    public final long i;

    public O(Context context, Looper looper) {
        N n5 = new N(this);
        this.f5690e = context.getApplicationContext();
        this.f5691f = new zzg(looper, n5);
        if (C0763a.f8970b == null) {
            synchronized (C0763a.f8969a) {
                try {
                    if (C0763a.f8970b == null) {
                        C0763a c0763a = new C0763a();
                        new ConcurrentHashMap();
                        C0763a.f8970b = c0763a;
                    }
                } finally {
                }
            }
        }
        C0763a c0763a2 = C0763a.f8970b;
        C.f(c0763a2);
        this.f5692g = c0763a2;
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0374l
    public final C0588a a(L l4, H h, String str, Executor executor) {
        HashMap map = this.f5689d;
        synchronized (map) {
            try {
                M m5 = (M) map.get(l4);
                C0588a c0588aA = null;
                if (executor == null) {
                    executor = null;
                }
                if (m5 == null) {
                    m5 = new M(this, l4);
                    m5.f5681a.put(h, h);
                    c0588aA = m5.a(str, executor);
                    map.put(l4, m5);
                } else {
                    this.f5691f.removeMessages(0, l4);
                    if (m5.f5681a.containsKey(h)) {
                        String string = l4.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    m5.f5681a.put(h, h);
                    int i = m5.f5682b;
                    if (i == 1) {
                        h.onServiceConnected(m5.f5686f, m5.f5684d);
                    } else if (i == 2) {
                        c0588aA = m5.a(str, executor);
                    }
                }
                if (m5.f5683c) {
                    return C0588a.f7619e;
                }
                if (c0588aA == null) {
                    c0588aA = new C0588a(-1);
                }
                return c0588aA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
