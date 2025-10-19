package com.google.android.gms.common.api.internal;

import B3.RunnableC0040f;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0368f;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0588a;
import h1.C0590c;
import h1.C0591d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import z1.C1066a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\D.smali */
public final class D implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f5553b;

    /* renamed from: c, reason: collision with root package name */
    public final C0339a f5554c;

    /* renamed from: d, reason: collision with root package name */
    public final C0362z f5555d;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final N f5558j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5559k;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0346h f5563o;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f5552a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5556e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5557f = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5560l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public C0588a f5561m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f5562n = 0;

    public D(C0346h c0346h, com.google.android.gms.common.api.l lVar) {
        this.f5563o = c0346h;
        com.google.android.gms.common.api.g gVarZab = lVar.zab(c0346h.f5638n.getLooper(), this);
        this.f5553b = gVarZab;
        this.f5554c = lVar.getApiKey();
        this.f5555d = new C0362z();
        this.i = lVar.zaa();
        if (!gVarZab.requiresSignIn()) {
            this.f5558j = null;
        } else {
            this.f5558j = lVar.zac(c0346h.f5631e, c0346h.f5638n);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0355q
    public final void a(C0588a c0588a) {
        p(c0588a, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0345g
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        C0346h c0346h = this.f5563o;
        if (looperMyLooper == c0346h.f5638n.getLooper()) {
            i(i);
        } else {
            c0346h.f5638n.post(new RunnableC0040f(this, i, 6));
        }
    }

    public final void c(C0588a c0588a) {
        HashSet hashSet = this.f5556e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.C.i(c0588a, C0588a.f7619e)) {
                this.f5553b.getEndpointPackageName();
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0345g
    public final void d() {
        Looper looperMyLooper = Looper.myLooper();
        C0346h c0346h = this.f5563o;
        if (looperMyLooper == c0346h.f5638n.getLooper()) {
            h();
        } else {
            c0346h.f5638n.post(new B3.N(this, 22));
        }
    }

    public final void e(Status status) {
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z4) {
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5552a.iterator();
        while (it.hasNext()) {
            W w4 = (W) it.next();
            if (!z4 || w4.f5604a == 2) {
                if (status != null) {
                    w4.a(status);
                } else {
                    w4.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f5552a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W w4 = (W) arrayList.get(i);
            if (!this.f5553b.isConnected()) {
                return;
            }
            if (k(w4)) {
                linkedList.remove(w4);
            }
        }
    }

    public final void h() {
        C0346h c0346h = this.f5563o;
        com.google.android.gms.common.internal.C.c(c0346h.f5638n);
        this.f5561m = null;
        c(C0588a.f7619e);
        if (this.f5559k) {
            zau zauVar = c0346h.f5638n;
            C0339a c0339a = this.f5554c;
            zauVar.removeMessages(11, c0339a);
            c0346h.f5638n.removeMessages(9, c0339a);
            this.f5559k = false;
        }
        Iterator it = this.f5557f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i) {
        C0346h c0346h = this.f5563o;
        com.google.android.gms.common.internal.C.c(c0346h.f5638n);
        this.f5561m = null;
        this.f5559k = true;
        String lastDisconnectMessage = this.f5553b.getLastDisconnectMessage();
        C0362z c0362z = this.f5555d;
        c0362z.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        c0362z.a(new Status(20, sb.toString(), null, null), true);
        zau zauVar = c0346h.f5638n;
        C0339a c0339a = this.f5554c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c0339a), 5000L);
        zau zauVar2 = c0346h.f5638n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c0339a), 120000L);
        ((SparseIntArray) c0346h.f5633g.f2847b).clear();
        Iterator it = this.f5557f.values().iterator();
        if (it.hasNext()) {
            B.a.p(it.next());
            throw null;
        }
    }

    public final void j() {
        C0346h c0346h = this.f5563o;
        zau zauVar = c0346h.f5638n;
        C0339a c0339a = this.f5554c;
        zauVar.removeMessages(12, c0339a);
        zau zauVar2 = c0346h.f5638n;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c0339a), c0346h.f5627a);
    }

    public final boolean k(W w4) {
        C0590c c0590c;
        if (!(w4 instanceof J)) {
            com.google.android.gms.common.api.g gVar = this.f5553b;
            w4.d(this.f5555d, gVar.requiresSignIn());
            try {
                w4.c(this);
            } catch (DeadObjectException unused) {
                b(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        J j5 = (J) w4;
        C0590c[] c0590cArrG = j5.g(this);
        if (c0590cArrG == null || c0590cArrG.length == 0) {
            c0590c = null;
        } else {
            C0590c[] availableFeatures = this.f5553b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C0590c[0];
            }
            q.b bVar = new q.b(availableFeatures.length);
            for (C0590c c0590c2 : availableFeatures) {
                bVar.put(c0590c2.f7627a, Long.valueOf(c0590c2.c()));
            }
            int length = c0590cArrG.length;
            for (int i = 0; i < length; i++) {
                c0590c = c0590cArrG[i];
                Long l4 = (Long) bVar.getOrDefault(c0590c.f7627a, null);
                if (l4 == null || l4.longValue() < c0590c.c()) {
                    break;
                }
            }
            c0590c = null;
        }
        if (c0590c == null) {
            com.google.android.gms.common.api.g gVar2 = this.f5553b;
            w4.d(this.f5555d, gVar2.requiresSignIn());
            try {
                w4.c(this);
            } catch (DeadObjectException unused2) {
                b(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f5553b.getClass().getName() + " could not execute call because it requires feature (" + c0590c.f7627a + ", " + c0590c.c() + ").");
        if (!this.f5563o.f5639o || !j5.f(this)) {
            j5.b(new com.google.android.gms.common.api.w(c0590c));
            return true;
        }
        E e5 = new E(this.f5554c, c0590c);
        int iIndexOf = this.f5560l.indexOf(e5);
        if (iIndexOf >= 0) {
            E e6 = (E) this.f5560l.get(iIndexOf);
            this.f5563o.f5638n.removeMessages(15, e6);
            zau zauVar = this.f5563o.f5638n;
            Message messageObtain = Message.obtain(zauVar, 15, e6);
            this.f5563o.getClass();
            zauVar.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.f5560l.add(e5);
            zau zauVar2 = this.f5563o.f5638n;
            Message messageObtain2 = Message.obtain(zauVar2, 15, e5);
            this.f5563o.getClass();
            zauVar2.sendMessageDelayed(messageObtain2, 5000L);
            zau zauVar3 = this.f5563o.f5638n;
            Message messageObtain3 = Message.obtain(zauVar3, 16, e5);
            this.f5563o.getClass();
            zauVar3.sendMessageDelayed(messageObtain3, 120000L);
            C0588a c0588a = new C0588a(2, null);
            if (!l(c0588a)) {
                this.f5563o.d(c0588a, this.i);
            }
        }
        return false;
    }

    public final boolean l(C0588a c0588a) {
        synchronized (C0346h.f5625r) {
            try {
                C0346h c0346h = this.f5563o;
                if (c0346h.f5635k == null || !c0346h.f5636l.contains(this.f5554c)) {
                    return false;
                }
                A a5 = this.f5563o.f5635k;
                int i = this.i;
                a5.getClass();
                X x3 = new X(c0588a, i);
                AtomicReference atomicReference = a5.f5543b;
                while (true) {
                    if (!atomicReference.compareAndSet(null, x3)) {
                        if (atomicReference.get() != null && atomicReference.get() != null) {
                            break;
                        }
                    } else {
                        a5.f5544c.post(new Y(0, a5, x3));
                        break;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(boolean z4) {
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        com.google.android.gms.common.api.g gVar = this.f5553b;
        if (gVar.isConnected() && this.f5557f.size() == 0) {
            C0362z c0362z = this.f5555d;
            if (((Map) c0362z.f5647a).isEmpty() && ((Map) c0362z.f5648b).isEmpty()) {
                gVar.disconnect("Timing out service connection.");
                return true;
            }
            if (z4) {
                j();
            }
        }
        return false;
    }

    public final void n() {
        C0346h c0346h = this.f5563o;
        com.google.android.gms.common.internal.C.c(c0346h.f5638n);
        com.google.android.gms.common.api.g gVar = this.f5553b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            S0.c cVar = c0346h.f5633g;
            Context context = c0346h.f5631e;
            cVar.getClass();
            com.google.android.gms.common.internal.C.f(context);
            int iC = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                SparseIntArray sparseIntArray = (SparseIntArray) cVar.f2847b;
                int i = sparseIntArray.get(minApkVersion, -1);
                if (i != -1) {
                    iC = i;
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i5);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (iC == -1) {
                        iC = ((C0591d) cVar.f2848c).c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iC);
                }
            }
            if (iC != 0) {
                C0588a c0588a = new C0588a(iC, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + c0588a.toString());
                p(c0588a, null);
                return;
            }
            F f2 = new F(c0346h, gVar, this.f5554c);
            if (gVar.requiresSignIn()) {
                N n5 = this.f5558j;
                com.google.android.gms.common.internal.C.f(n5);
                C1066a c1066a = n5.f5594f;
                if (c1066a != null) {
                    c1066a.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(n5));
                C0370h c0370h = n5.f5593e;
                c0370h.f5706g = numValueOf;
                Handler handler = n5.f5590b;
                n5.f5594f = (C1066a) n5.f5591c.buildClient(n5.f5589a, handler.getLooper(), c0370h, (Object) c0370h.f5705f, (com.google.android.gms.common.api.m) n5, (com.google.android.gms.common.api.n) n5);
                n5.i = f2;
                Set set = n5.f5592d;
                if (set == null || set.isEmpty()) {
                    handler.post(new B3.N(n5, 24));
                } else {
                    C1066a c1066a2 = n5.f5594f;
                    c1066a2.getClass();
                    c1066a2.connect(new com.google.android.gms.common.internal.r((AbstractC0368f) c1066a2));
                }
            }
            try {
                gVar.connect(f2);
            } catch (SecurityException e5) {
                p(new C0588a(10), e5);
            }
        } catch (IllegalStateException e6) {
            p(new C0588a(10), e6);
        }
    }

    public final void o(W w4) {
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        boolean zIsConnected = this.f5553b.isConnected();
        LinkedList linkedList = this.f5552a;
        if (zIsConnected) {
            if (k(w4)) {
                j();
                return;
            } else {
                linkedList.add(w4);
                return;
            }
        }
        linkedList.add(w4);
        C0588a c0588a = this.f5561m;
        if (c0588a == null || c0588a.f7621b == 0 || c0588a.f7622c == null) {
            n();
        } else {
            p(c0588a, null);
        }
    }

    public final void p(C0588a c0588a, RuntimeException runtimeException) {
        C1066a c1066a;
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        N n5 = this.f5558j;
        if (n5 != null && (c1066a = n5.f5594f) != null) {
            c1066a.disconnect();
        }
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        this.f5561m = null;
        ((SparseIntArray) this.f5563o.f5633g.f2847b).clear();
        c(c0588a);
        if ((this.f5553b instanceof j1.c) && c0588a.f7621b != 24) {
            C0346h c0346h = this.f5563o;
            c0346h.f5628b = true;
            zau zauVar = c0346h.f5638n;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (c0588a.f7621b == 4) {
            e(C0346h.f5624q);
            return;
        }
        if (this.f5552a.isEmpty()) {
            this.f5561m = c0588a;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f5563o.f5639o) {
            e(C0346h.e(this.f5554c, c0588a));
            return;
        }
        f(C0346h.e(this.f5554c, c0588a), null, true);
        if (this.f5552a.isEmpty() || l(c0588a) || this.f5563o.d(c0588a, this.i)) {
            return;
        }
        if (c0588a.f7621b == 18) {
            this.f5559k = true;
        }
        if (!this.f5559k) {
            e(C0346h.e(this.f5554c, c0588a));
            return;
        }
        zau zauVar2 = this.f5563o.f5638n;
        Message messageObtain = Message.obtain(zauVar2, 9, this.f5554c);
        this.f5563o.getClass();
        zauVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    public final void q() {
        com.google.android.gms.common.internal.C.c(this.f5563o.f5638n);
        Status status = C0346h.f5623p;
        e(status);
        this.f5555d.a(status, false);
        for (AbstractC0352n abstractC0352n : (AbstractC0352n[]) this.f5557f.keySet().toArray(new AbstractC0352n[0])) {
            o(new V(4, new TaskCompletionSource()));
        }
        c(new C0588a(4));
        com.google.android.gms.common.api.g gVar = this.f5553b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new h1.i(this, 13));
        }
    }
}
