package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.AbstractC0342d;
import com.google.android.gms.common.api.internal.AbstractC0350l;
import com.google.android.gms.common.api.internal.AbstractC0352n;
import com.google.android.gms.common.api.internal.AbstractC0356s;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.AbstractC0360x;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC0354p;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C0339a;
import com.google.android.gms.common.api.internal.C0346h;
import com.google.android.gms.common.api.internal.C0353o;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.InterfaceC0351m;
import com.google.android.gms.common.api.internal.InterfaceC0358u;
import com.google.android.gms.common.api.internal.M;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.internal.AbstractC0368f;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.C0369g;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzg;
import com.google.android.gms.tasks.Task;
import h1.C0591d;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import q.C0826c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\l.smali */
public abstract class l {
    protected final C0346h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0339a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final InterfaceC0358u zaj;

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        C.g(context, "Null context is not permitted.");
        C.g(iVar, "Api must not be null.");
        C.g(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f5651b;
        C0339a c0339a = new C0339a(iVar, eVar, str);
        this.zaf = c0339a;
        this.zai = new G(this);
        C0346h c0346hG = C0346h.g(this.zab);
        this.zaa = c0346hG;
        this.zah = c0346hG.h.getAndIncrement();
        this.zaj = kVar.f5650a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC0351m fragment = AbstractC0350l.getFragment(activity);
            A a5 = (A) fragment.d(A.class, "ConnectionlessLifecycleHelper");
            if (a5 == null) {
                Object obj = C0591d.f7630c;
                a5 = new A(fragment, c0346hG);
            }
            a5.f5546e.add(c0339a);
            c0346hG.b(a5);
        }
        zau zauVar = c0346hG.f5638n;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i, AbstractC0342d abstractC0342d) {
        abstractC0342d.zak();
        C0346h c0346h = this.zaa;
        c0346h.getClass();
        T t4 = new T(i, abstractC0342d);
        zau zauVar = c0346h.f5638n;
        zauVar.sendMessage(zauVar.obtainMessage(4, new M(t4, c0346h.i.get(), this)));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task b(int r18, com.google.android.gms.common.api.internal.AbstractC0359w r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            com.google.android.gms.common.api.internal.h r11 = r0.zaa
            com.google.android.gms.common.api.internal.u r12 = r0.zaj
            r11.getClass()
            int r5 = r1.f5644c
            com.google.android.gms.internal.base.zau r13 = r11.f5638n
            if (r5 == 0) goto L8f
            com.google.android.gms.common.api.internal.a r6 = r17.getApiKey()
            boolean r3 = r11.c()
            r4 = 0
            if (r3 != 0) goto L22
            goto L7d
        L22:
            com.google.android.gms.common.internal.r r3 = com.google.android.gms.common.internal.r.b()
            java.lang.Object r3 = r3.f5746a
            com.google.android.gms.common.internal.s r3 = (com.google.android.gms.common.internal.C0380s) r3
            r7 = 1
            if (r3 == 0) goto L62
            boolean r8 = r3.f5748b
            if (r8 != 0) goto L32
            goto L7d
        L32:
            java.util.concurrent.ConcurrentHashMap r8 = r11.f5634j
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.common.api.internal.D r8 = (com.google.android.gms.common.api.internal.D) r8
            if (r8 == 0) goto L60
            com.google.android.gms.common.api.g r9 = r8.f5553b
            boolean r10 = r9 instanceof com.google.android.gms.common.internal.AbstractC0368f
            if (r10 != 0) goto L43
            goto L7d
        L43:
            com.google.android.gms.common.internal.f r9 = (com.google.android.gms.common.internal.AbstractC0368f) r9
            boolean r10 = r9.hasConnectionInfo()
            if (r10 == 0) goto L60
            boolean r10 = r9.isConnecting()
            if (r10 != 0) goto L60
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.api.internal.K.a(r8, r9, r5)
            if (r3 != 0) goto L58
            goto L7d
        L58:
            int r4 = r8.f5562n
            int r4 = r4 + r7
            r8.f5562n = r4
            boolean r7 = r3.f5709c
            goto L62
        L60:
            boolean r7 = r3.f5749c
        L62:
            com.google.android.gms.common.api.internal.K r14 = new com.google.android.gms.common.api.internal.K
            r3 = 0
            if (r7 == 0) goto L6d
            long r8 = java.lang.System.currentTimeMillis()
            goto L6e
        L6d:
            r8 = r3
        L6e:
            if (r7 == 0) goto L74
            long r3 = android.os.SystemClock.elapsedRealtime()
        L74:
            r15 = r3
            r3 = r14
            r4 = r11
            r7 = r8
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r4 = r14
        L7d:
            if (r4 == 0) goto L8f
            com.google.android.gms.tasks.Task r3 = r2.getTask()
            r13.getClass()
            V0.b r5 = new V0.b
            r6 = 1
            r5.<init>(r13, r6)
            r3.addOnCompleteListener(r5, r4)
        L8f:
            com.google.android.gms.common.api.internal.U r3 = new com.google.android.gms.common.api.internal.U
            r4 = r18
            r3.<init>(r4, r1, r2, r12)
            com.google.android.gms.common.api.internal.M r1 = new com.google.android.gms.common.api.internal.M
            java.util.concurrent.atomic.AtomicInteger r4 = r11.i
            int r4 = r4.get()
            r1.<init>(r3, r4, r0)
            r0 = 4
            android.os.Message r0 = r13.obtainMessage(r0, r1)
            r13.sendMessage(r0)
            com.google.android.gms.tasks.Task r0 = r2.getTask()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.l.b(int, com.google.android.gms.common.api.internal.w):com.google.android.gms.tasks.Task");
    }

    public C0369g createClientSettingsBuilder() {
        C0369g c0369g = new C0369g();
        Set setEmptySet = Collections.emptySet();
        if (c0369g.f5697a == null) {
            c0369g.f5697a = new C0826c(0);
        }
        c0369g.f5697a.addAll(setEmptySet);
        c0369g.f5699c = this.zab.getClass().getName();
        c0369g.f5698b = this.zab.getPackageName();
        return c0369g;
    }

    public Task<Boolean> disconnectService() {
        C0346h c0346h = this.zaa;
        c0346h.getClass();
        B b5 = new B(getApiKey());
        zau zauVar = c0346h.f5638n;
        zauVar.sendMessage(zauVar.obtainMessage(14, b5));
        return b5.f5549b.getTask();
    }

    public <A extends b, T extends AbstractC0342d> T doBestEffortWrite(T t4) {
        a(2, t4);
        return t4;
    }

    public <A extends b, T extends AbstractC0342d> T doRead(T t4) {
        a(0, t4);
        return t4;
    }

    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.r, U extends AbstractC0360x> Task<Void> doRegisterEventListener(T t4, U u2) {
        C.f(t4);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0352n abstractC0352n) {
        return doUnregisterEventListener(abstractC0352n, 0);
    }

    public <A extends b, T extends AbstractC0342d> T doWrite(T t4) {
        a(1, t4);
        return t4;
    }

    public final C0339a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C0353o registerListener(L l4, String str) {
        Looper looper = this.zag;
        C.g(l4, "Listener must not be null");
        C.g(looper, "Looper must not be null");
        C.g(str, "Listener type must not be null");
        C0353o c0353o = new C0353o();
        new zzg(looper);
        c0353o.f5641a = l4;
        C.d(str);
        return c0353o;
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, D d5) {
        C0369g c0369gCreateClientSettingsBuilder = createClientSettingsBuilder();
        C0370h c0370h = new C0370h(c0369gCreateClientSettingsBuilder.f5697a, c0369gCreateClientSettingsBuilder.f5698b, c0369gCreateClientSettingsBuilder.f5699c);
        a aVar = this.zad.f5539a;
        C.f(aVar);
        g gVarBuildClient = aVar.buildClient(this.zab, looper, c0370h, (Object) this.zae, (m) d5, (n) d5);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (gVarBuildClient instanceof AbstractC0368f)) {
            ((AbstractC0368f) gVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(gVarBuildClient instanceof AbstractServiceConnectionC0354p)) {
            return gVarBuildClient;
        }
        B.a.p(gVarBuildClient);
        throw null;
    }

    public final N zac(Context context, Handler handler) {
        C0369g c0369gCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new N(context, handler, new C0370h(c0369gCreateClientSettingsBuilder.f5697a, c0369gCreateClientSettingsBuilder.f5698b, c0369gCreateClientSettingsBuilder.f5699c));
    }

    public <TResult, A extends b> Task<TResult> doBestEffortWrite(AbstractC0359w abstractC0359w) {
        return b(2, abstractC0359w);
    }

    public <TResult, A extends b> Task<TResult> doRead(AbstractC0359w abstractC0359w) {
        return b(0, abstractC0359w);
    }

    public <A extends b> Task<Void> doRegisterEventListener(AbstractC0356s abstractC0356s) {
        C.f(abstractC0356s);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(AbstractC0352n abstractC0352n, int i) {
        C.g(abstractC0352n, "Listener key cannot be null.");
        throw null;
    }

    public <TResult, A extends b> Task<TResult> doWrite(AbstractC0359w abstractC0359w) {
        return b(1, abstractC0359w);
    }
}
