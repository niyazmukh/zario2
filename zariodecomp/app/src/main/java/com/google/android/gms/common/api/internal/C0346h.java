package com.google.android.gms.common.api.internal;

import N2.j0;
import N2.n0;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0374l;
import com.google.android.gms.common.internal.C0379q;
import com.google.android.gms.common.internal.C0380s;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0588a;
import h1.C0590c;
import h1.C0591d;
import j1.C0626b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o1.AbstractC0794a;
import q.C0826c;
import q.C0830g;

/* renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\h.1.smali */
public final class C0346h implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f5623p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f5624q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f5625r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static C0346h f5626s;

    /* renamed from: a, reason: collision with root package name */
    public long f5627a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5628b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.t f5629c;

    /* renamed from: d, reason: collision with root package name */
    public C0626b f5630d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5631e;

    /* renamed from: f, reason: collision with root package name */
    public final C0591d f5632f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.c f5633g;
    public final AtomicInteger h;
    public final AtomicInteger i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5634j;

    /* renamed from: k, reason: collision with root package name */
    public A f5635k;

    /* renamed from: l, reason: collision with root package name */
    public final C0826c f5636l;

    /* renamed from: m, reason: collision with root package name */
    public final C0826c f5637m;

    /* renamed from: n, reason: collision with root package name */
    public final zau f5638n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f5639o;

    public C0346h(Context context, Looper looper) {
        C0591d c0591d = C0591d.f7631d;
        this.f5627a = 10000L;
        this.f5628b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.f5634j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5635k = null;
        this.f5636l = new C0826c(0);
        this.f5637m = new C0826c(0);
        this.f5639o = true;
        this.f5631e = context;
        zau zauVar = new zau(looper, this);
        this.f5638n = zauVar;
        this.f5632f = c0591d;
        this.f5633g = new S0.c(8);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0794a.f9160e == null) {
            AbstractC0794a.f9160e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0794a.f9160e.booleanValue()) {
            this.f5639o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f5625r) {
            try {
                C0346h c0346h = f5626s;
                if (c0346h != null) {
                    c0346h.i.incrementAndGet();
                    zau zauVar = c0346h.f5638n;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0339a c0339a, C0588a c0588a) {
        return new Status(17, "API: " + c0339a.f5611b.f5541c + " is not available on this device. Connection failed with: " + String.valueOf(c0588a), c0588a.f7622c, c0588a);
    }

    public static C0346h g(Context context) {
        C0346h c0346h;
        HandlerThread handlerThread;
        synchronized (f5625r) {
            if (f5626s == null) {
                synchronized (AbstractC0374l.f5729a) {
                    try {
                        handlerThread = AbstractC0374l.f5731c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0374l.f5731c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0374l.f5731c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C0591d.f7630c;
                f5626s = new C0346h(applicationContext, looper);
            }
            c0346h = f5626s;
        }
        return c0346h;
    }

    public final void b(A a5) {
        synchronized (f5625r) {
            try {
                if (this.f5635k != a5) {
                    this.f5635k = a5;
                    this.f5636l.clear();
                }
                this.f5636l.addAll(a5.f5546e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f5628b) {
            return false;
        }
        C0380s c0380s = (C0380s) com.google.android.gms.common.internal.r.b().f5746a;
        if (c0380s != null && !c0380s.f5748b) {
            return false;
        }
        int i = ((SparseIntArray) this.f5633g.f2847b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean d(C0588a c0588a, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        C0591d c0591d = this.f5632f;
        Context context = this.f5631e;
        c0591d.getClass();
        synchronized (p1.b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = p1.b.f9312a;
            if (context2 == null || (bool = p1.b.f9313b) == null || context2 != applicationContext) {
                p1.b.f9313b = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                p1.b.f9313b = Boolean.valueOf(zIsInstantApp);
                p1.b.f9312a = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i5 = c0588a.f7621b;
        if (i5 == 0 || (activity = c0588a.f7622c) == null) {
            Intent intentA = c0591d.a(context, i5, null);
            activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i6 = c0588a.f7621b;
        int i7 = GoogleApiActivity.f5526b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        c0591d.g(context, i6, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    public final D f(com.google.android.gms.common.api.l lVar) {
        C0339a apiKey = lVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f5634j;
        D d5 = (D) concurrentHashMap.get(apiKey);
        if (d5 == null) {
            d5 = new D(this, lVar);
            concurrentHashMap.put(apiKey, d5);
        }
        if (d5.f5553b.requiresSignIn()) {
            this.f5637m.add(apiKey);
        }
        d5.n();
        return d5;
    }

    public final void h(C0588a c0588a, int i) {
        if (d(c0588a, i)) {
            return;
        }
        zau zauVar = this.f5638n;
        zauVar.sendMessage(zauVar.obtainMessage(5, i, 0, c0588a));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        D d5;
        boolean z4;
        C0590c[] c0590cArrG;
        int i = message.what;
        zau zauVar = this.f5638n;
        ConcurrentHashMap concurrentHashMap = this.f5634j;
        com.google.android.gms.common.internal.u uVar = com.google.android.gms.common.internal.u.f5754a;
        int i5 = 17;
        switch (i) {
            case 1:
                this.f5627a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (C0339a) it.next()), this.f5627a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (D d6 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.C.c(d6.f5563o.f5638n);
                    d6.f5561m = null;
                    d6.n();
                }
                return true;
            case 4:
            case 8:
            case 13:
                M m5 = (M) message.obj;
                D dF = (D) concurrentHashMap.get(m5.f5587c.getApiKey());
                if (dF == null) {
                    dF = f(m5.f5587c);
                }
                boolean zRequiresSignIn = dF.f5553b.requiresSignIn();
                W w4 = m5.f5585a;
                if (!zRequiresSignIn || this.i.get() == m5.f5586b) {
                    dF.o(w4);
                    return true;
                }
                w4.a(f5623p);
                dF.q();
                return true;
            case 5:
                int i6 = message.arg1;
                C0588a c0588a = (C0588a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d5 = (D) it2.next();
                        if (d5.i == i6) {
                        }
                    } else {
                        d5 = null;
                    }
                }
                if (d5 == null) {
                    Log.wtf("GoogleApiManager", B.a.n("Could not find API instance ", i6, " while trying to fail enqueued calls.").toString(), new Exception());
                    return true;
                }
                int i7 = c0588a.f7621b;
                if (i7 != 13) {
                    d5.e(e(d5.f5554c, c0588a));
                    return true;
                }
                this.f5632f.getClass();
                int i8 = h1.h.f7638e;
                StringBuilder sbO = B.a.o("Error resolution was canceled by the user, original error message: ", C0588a.c(i7), ": ");
                sbO.append(c0588a.f7623d);
                d5.e(new Status(17, sbO.toString(), null, null));
                return true;
            case 6:
                Context context = this.f5631e;
                if (!(context.getApplicationContext() instanceof Application)) {
                    return true;
                }
                ComponentCallbacks2C0341c.b((Application) context.getApplicationContext());
                ComponentCallbacks2C0341c componentCallbacks2C0341c = ComponentCallbacks2C0341c.f5618e;
                componentCallbacks2C0341c.a(new C(this));
                AtomicBoolean atomicBoolean = componentCallbacks2C0341c.f5620b;
                boolean z5 = atomicBoolean.get();
                AtomicBoolean atomicBoolean2 = componentCallbacks2C0341c.f5619a;
                if (z5) {
                    z4 = atomicBoolean2.get();
                } else {
                    Boolean boolValueOf = AbstractC0794a.f9162g;
                    if (boolValueOf == null) {
                        boolValueOf = Boolean.valueOf(Process.isIsolated());
                        AbstractC0794a.f9162g = boolValueOf;
                    }
                    if (boolValueOf.booleanValue()) {
                        z4 = true;
                    } else {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                        z4 = atomicBoolean2.get();
                    }
                }
                if (z4) {
                    return true;
                }
                this.f5627a = 300000L;
                return true;
            case 7:
                f((com.google.android.gms.common.api.l) message.obj);
                return true;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d7 = (D) concurrentHashMap.get(message.obj);
                com.google.android.gms.common.internal.C.c(d7.f5563o.f5638n);
                if (!d7.f5559k) {
                    return true;
                }
                d7.n();
                return true;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                C0826c c0826c = this.f5637m;
                Iterator it3 = c0826c.iterator();
                while (true) {
                    C0830g c0830g = (C0830g) it3;
                    if (!c0830g.hasNext()) {
                        c0826c.clear();
                        return true;
                    }
                    D d8 = (D) concurrentHashMap.remove((C0339a) c0830g.next());
                    if (d8 != null) {
                        d8.q();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                D d9 = (D) concurrentHashMap.get(message.obj);
                C0346h c0346h = d9.f5563o;
                com.google.android.gms.common.internal.C.c(c0346h.f5638n);
                boolean z6 = d9.f5559k;
                if (!z6) {
                    return true;
                }
                if (z6) {
                    C0346h c0346h2 = d9.f5563o;
                    zau zauVar2 = c0346h2.f5638n;
                    C0339a c0339a = d9.f5554c;
                    zauVar2.removeMessages(11, c0339a);
                    c0346h2.f5638n.removeMessages(9, c0339a);
                    d9.f5559k = false;
                }
                d9.e(c0346h.f5632f.c(c0346h.f5631e, h1.e.f7632a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                d9.f5553b.disconnect("Timing out connection while resuming.");
                return true;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                ((D) concurrentHashMap.get(message.obj)).m(true);
                return true;
            case 14:
                B b5 = (B) message.obj;
                C0339a c0339a2 = b5.f5548a;
                boolean zContainsKey = concurrentHashMap.containsKey(c0339a2);
                TaskCompletionSource taskCompletionSource = b5.f5549b;
                if (zContainsKey) {
                    taskCompletionSource.setResult(Boolean.valueOf(((D) concurrentHashMap.get(c0339a2)).m(false)));
                    return true;
                }
                taskCompletionSource.setResult(Boolean.FALSE);
                return true;
            case 15:
                E e5 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e5.f5564a)) {
                    return true;
                }
                D d10 = (D) concurrentHashMap.get(e5.f5564a);
                if (!d10.f5560l.contains(e5) || d10.f5559k) {
                    return true;
                }
                if (d10.f5553b.isConnected()) {
                    d10.g();
                    return true;
                }
                d10.n();
                return true;
            case 16:
                E e6 = (E) message.obj;
                if (!concurrentHashMap.containsKey(e6.f5564a)) {
                    return true;
                }
                D d11 = (D) concurrentHashMap.get(e6.f5564a);
                if (!d11.f5560l.remove(e6)) {
                    return true;
                }
                C0346h c0346h3 = d11.f5563o;
                c0346h3.f5638n.removeMessages(15, e6);
                c0346h3.f5638n.removeMessages(16, e6);
                LinkedList linkedList = d11.f5552a;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    C0590c c0590c = e6.f5565b;
                    if (!zHasNext) {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            W w5 = (W) arrayList.get(i9);
                            linkedList.remove(w5);
                            w5.b(new com.google.android.gms.common.api.w(c0590c));
                        }
                        return true;
                    }
                    W w6 = (W) it4.next();
                    if ((w6 instanceof J) && (c0590cArrG = ((J) w6).g(d11)) != null) {
                        int length = c0590cArrG.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            if (!com.google.android.gms.common.internal.C.i(c0590cArrG[i10], c0590c)) {
                                i10++;
                            } else if (i10 >= 0) {
                                arrayList.add(w6);
                            }
                        }
                    }
                }
                break;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                com.google.android.gms.common.internal.t tVar = this.f5629c;
                if (tVar == null) {
                    return true;
                }
                if (tVar.f5752a > 0 || c()) {
                    if (this.f5630d == null) {
                        this.f5630d = new C0626b(this.f5631e, null, C0626b.f8038a, uVar, com.google.android.gms.common.api.k.f5649c);
                    }
                    C0626b c0626b = this.f5630d;
                    c0626b.getClass();
                    F1.h hVarA = AbstractC0359w.a();
                    hVarA.f1684e = new C0590c[]{zaf.zaa};
                    hVarA.f1682c = false;
                    hVarA.f1683d = new h1.i(tVar, i5);
                    c0626b.doBestEffortWrite(hVarA.a());
                }
                this.f5629c = null;
                return true;
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                L l4 = (L) message.obj;
                long j5 = l4.f5583c;
                C0379q c0379q = l4.f5581a;
                int i11 = l4.f5582b;
                if (j5 == 0) {
                    com.google.android.gms.common.internal.t tVar2 = new com.google.android.gms.common.internal.t(i11, Arrays.asList(c0379q));
                    if (this.f5630d == null) {
                        this.f5630d = new C0626b(this.f5631e, null, C0626b.f8038a, uVar, com.google.android.gms.common.api.k.f5649c);
                    }
                    C0626b c0626b2 = this.f5630d;
                    c0626b2.getClass();
                    F1.h hVarA2 = AbstractC0359w.a();
                    hVarA2.f1684e = new C0590c[]{zaf.zaa};
                    hVarA2.f1682c = false;
                    hVarA2.f1683d = new h1.i(tVar2, i5);
                    c0626b2.doBestEffortWrite(hVarA2.a());
                    return true;
                }
                com.google.android.gms.common.internal.t tVar3 = this.f5629c;
                if (tVar3 != null) {
                    List list = tVar3.f5753b;
                    if (tVar3.f5752a != i11 || (list != null && list.size() >= l4.f5584d)) {
                        zauVar.removeMessages(17);
                        com.google.android.gms.common.internal.t tVar4 = this.f5629c;
                        if (tVar4 != null) {
                            if (tVar4.f5752a > 0 || c()) {
                                if (this.f5630d == null) {
                                    this.f5630d = new C0626b(this.f5631e, null, C0626b.f8038a, uVar, com.google.android.gms.common.api.k.f5649c);
                                }
                                C0626b c0626b3 = this.f5630d;
                                c0626b3.getClass();
                                F1.h hVarA3 = AbstractC0359w.a();
                                hVarA3.f1684e = new C0590c[]{zaf.zaa};
                                hVarA3.f1682c = false;
                                hVarA3.f1683d = new h1.i(tVar4, i5);
                                c0626b3.doBestEffortWrite(hVarA3.a());
                            }
                            this.f5629c = null;
                        }
                    } else {
                        com.google.android.gms.common.internal.t tVar5 = this.f5629c;
                        if (tVar5.f5753b == null) {
                            tVar5.f5753b = new ArrayList();
                        }
                        tVar5.f5753b.add(c0379q);
                    }
                }
                if (this.f5629c != null) {
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c0379q);
                this.f5629c = new com.google.android.gms.common.internal.t(i11, arrayList2);
                zauVar.sendMessageDelayed(zauVar.obtainMessage(17), l4.f5583c);
                return true;
            case 19:
                this.f5628b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
