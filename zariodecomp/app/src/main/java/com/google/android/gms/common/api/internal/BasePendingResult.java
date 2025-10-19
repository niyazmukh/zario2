package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.InterfaceC0376n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\BasePendingResult.smali */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.s> extends com.google.android.gms.common.api.q {
    static final ThreadLocal zaa = new Z3.b(1);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private Z mResultGuardian;
    protected final HandlerC0344f zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.t zah;
    private com.google.android.gms.common.api.s zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC0376n zao;
    private volatile Q zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        this.zab = new HandlerC0344f(oVar != null ? ((G) oVar).f5573b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(oVar);
    }

    public static void zal(com.google.android.gms.common.api.s sVar) {
    }

    public final com.google.android.gms.common.api.s a() {
        com.google.android.gms.common.api.s sVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.C.h("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.C.h("Result is not ready.", isReady());
            sVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.C.f(sVar);
        return sVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.p pVar) {
        com.google.android.gms.common.internal.C.a("Callback cannot be null.", pVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pVar.a(this.zak);
                } else {
                    this.zag.add(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R await() throws InterruptedException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        com.google.android.gms.common.internal.C.h("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.C.h("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5531f);
        }
        com.google.android.gms.common.internal.C.h("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.s sVar) {
        this.zaj = sVar;
        this.zak = sVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.t tVar = this.zah;
            if (tVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(tVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.common.api.p) arrayList.get(i)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f5534m));
                }
            } finally {
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult((BasePendingResult<R>) createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z4;
        synchronized (this.zae) {
            z4 = this.zam;
        }
        return z4;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC0376n interfaceC0376n) {
        synchronized (this.zae) {
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.C.h("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.C.h("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.s> com.google.android.gms.common.api.v then(com.google.android.gms.common.api.u uVar) {
        Q q5;
        com.google.android.gms.common.internal.C.h("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.C.h("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.C.h("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.C.h("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new Q(this.zac);
                Q q6 = this.zap;
                synchronized (q6.f5598b) {
                    q5 = new Q(q6.f5599c);
                    q6.f5597a = q5;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q5;
    }

    public final void zak() {
        boolean z4 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z4 = false;
        }
        this.zaq = z4;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(S s4) {
        this.zai.set(s4);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0343e
    public final void setResult(R r5) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r5);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.C.h("Results have already been set", !isReady());
                com.google.android.gms.common.internal.C.h("Result has already been consumed", !this.zal);
                b(r5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar, long j5, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (tVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z4 = true;
                com.google.android.gms.common.internal.C.h("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z4 = false;
                }
                com.google.android.gms.common.internal.C.h("Cannot set callbacks if then() has been called.", z4);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tVar, a());
                } else {
                    this.zah = tVar;
                    HandlerC0344f handlerC0344f = this.zab;
                    handlerC0344f.sendMessageDelayed(handlerC0344f.obtainMessage(2, this), timeUnit.toMillis(j5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R await(long j5, TimeUnit timeUnit) {
        if (j5 > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.C.h("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.C.h("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j5, timeUnit)) {
                forceFailureUnlessReady(Status.f5533l);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5531f);
        }
        com.google.android.gms.common.internal.C.h("Result is not ready.", isReady());
        return (R) a();
    }
}
