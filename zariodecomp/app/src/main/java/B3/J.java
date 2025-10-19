package B3;

import A2.C0009i;
import N2.AbstractC0156x;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.common.api.internal.AbstractC0350l;
import h2.C0593b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1078b;
import z3.C1084h;
import z3.C1099x;
import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\J.smali */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f441a;

    /* renamed from: b, reason: collision with root package name */
    public Object f442b;

    /* renamed from: c, reason: collision with root package name */
    public Object f443c;

    /* renamed from: d, reason: collision with root package name */
    public Object f444d;

    public /* synthetic */ J() {
        this.f441a = 6;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C3.m mVar;
        C3.l lVar;
        Socket socketH;
        J j5 = this;
        int i = 3;
        SSLSession session = null;
        Object objCall = null;
        boolean z4 = false;
        switch (j5.f441a) {
            case 0:
                ((U0) j5.f444d).f561f.e((AbstractC1098w) j5.f443c, (z3.a0) j5.f442b);
                return;
            case 1:
                ((O) j5.f444d).f497a.g((z3.k0) j5.f443c, (z3.a0) j5.f442b);
                return;
            case 2:
                Y0 y02 = (Y0) j5.f444d;
                G g3 = y02.f664u;
                E2.s sVar = (E2.s) j5.f443c;
                Executor executor = y02.f654k;
                EnumC1087k enumC1087k = (EnumC1087k) j5.f442b;
                g3.getClass();
                S0.f.l(executor, "executor");
                S0.f.l(enumC1087k, "source");
                F f2 = new F(sVar, executor);
                if (((EnumC1087k) g3.f410a) != enumC1087k) {
                    executor.execute(sVar);
                    return;
                } else {
                    ((ArrayList) g3.f411b).add(f2);
                    return;
                }
            case 3:
                Q0 q02 = (Q0) j5.f444d;
                Y0 y03 = q02.f519e;
                if (q02 != y03.f619A) {
                    return;
                }
                z3.K k5 = (z3.K) j5.f443c;
                y03.f620B = k5;
                y03.f625H.i(k5);
                EnumC1087k enumC1087k2 = EnumC1087k.f11345e;
                EnumC1087k enumC1087k3 = (EnumC1087k) j5.f442b;
                if (enumC1087k3 != enumC1087k2) {
                    q02.f519e.f635R.m(2, "Entering {0} state with picker: {1}", enumC1087k3, k5);
                    q02.f519e.f664u.b(enumC1087k3);
                    return;
                }
                return;
            case 4:
                try {
                    ((CountDownLatch) j5.f443c).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                q4.i iVar = new q4.i(new C3.k());
                try {
                    try {
                        C3.m mVar2 = (C3.m) j5.f444d;
                        C1099x c1099x = mVar2.f1204N;
                        if (c1099x == null) {
                            socketH = mVar2.f1192A.createSocket(mVar2.f1206a.getAddress(), ((C3.m) j5.f444d).f1206a.getPort());
                        } else {
                            InetSocketAddress inetSocketAddress = c1099x.f11403a;
                            if (inetSocketAddress == null) {
                                throw new z3.l0(z3.k0.f11354m.g("Unsupported SocketAddress implementation " + ((C3.m) j5.f444d).f1204N.f11403a.getClass()));
                            }
                            socketH = C3.m.h(mVar2, c1099x.f11404b, inetSocketAddress, c1099x.f11405c, c1099x.f11406d);
                        }
                        C3.m mVar3 = (C3.m) j5.f444d;
                        SSLSocketFactory sSLSocketFactory = mVar3.f1193B;
                        Socket socket = socketH;
                        if (sSLSocketFactory != null) {
                            String host = mVar3.f1207b;
                            URI uriA = AbstractC0056k0.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = C3.s.a(sSLSocketFactory, socketH, host, ((C3.m) j5.f444d).l(), ((C3.m) j5.f444d).f1196E);
                            session = sSLSocketA.getSession();
                            socket = sSLSocketA;
                        }
                        socket.setTcpNoDelay(true);
                        q4.i iVar2 = new q4.i(S0.f.a0(socket));
                        try {
                            ((C3.c) j5.f442b).a(S0.f.Y(socket), socket);
                            C3.m mVar4 = (C3.m) j5.f444d;
                            C1078b c1078b = mVar4.f1224u;
                            c1078b.getClass();
                            S0.e eVar = new S0.e(c1078b);
                            eVar.B(AbstractC1080d.f11299a, socket.getRemoteSocketAddress());
                            eVar.B(AbstractC1080d.f11300b, socket.getLocalSocketAddress());
                            eVar.B(AbstractC1080d.f11301c, session);
                            eVar.B(i2.f844a, session == null ? z3.h0.f11316a : z3.h0.f11317b);
                            mVar4.f1224u = eVar.a();
                            C3.m mVar5 = (C3.m) j5.f444d;
                            mVar5.f1212g.getClass();
                            mVar5.f1223t = new C3.l(mVar5, new E3.h(iVar2));
                            synchronized (((C3.m) j5.f444d).f1214k) {
                                try {
                                    ((C3.m) j5.f444d).getClass();
                                    if (session != null) {
                                        C3.m mVar6 = (C3.m) j5.f444d;
                                        new C1084h(session);
                                        mVar6.getClass();
                                    }
                                } finally {
                                }
                            }
                            return;
                        } catch (z3.l0 e5) {
                            e = e5;
                            iVar = iVar2;
                            ((C3.m) j5.f444d).s(0, E3.a.INTERNAL_ERROR, e.f11363a);
                            mVar = (C3.m) j5.f444d;
                            mVar.f1212g.getClass();
                            lVar = new C3.l(mVar, new E3.h(iVar));
                            mVar.f1223t = lVar;
                            return;
                        } catch (Exception e6) {
                            e = e6;
                            iVar = iVar2;
                            ((C3.m) j5.f444d).p(e);
                            mVar = (C3.m) j5.f444d;
                            mVar.f1212g.getClass();
                            lVar = new C3.l(mVar, new E3.h(iVar));
                            mVar.f1223t = lVar;
                            return;
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            C3.m mVar7 = (C3.m) j5.f444d;
                            mVar7.f1212g.getClass();
                            mVar7.f1223t = new C3.l(mVar7, new E3.h(iVar));
                            throw th;
                        }
                    } catch (z3.l0 e7) {
                        e = e7;
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 5:
                I3.s sVar2 = (I3.s) j5.f444d;
                sVar2.l = Long.valueOf(sVar2.i.c());
                for (I3.k kVar : ((HashMap) ((I3.s) j5.f444d).f.f1957b).values()) {
                    S0.l lVar2 = kVar.f1952c;
                    ((AtomicLong) lVar2.f2867b).set(0L);
                    ((AtomicLong) lVar2.f2868c).set(0L);
                    S0.l lVar3 = kVar.f1951b;
                    kVar.f1951b = kVar.f1952c;
                    kVar.f1952c = lVar3;
                }
                I3.n nVar = (I3.n) j5.f443c;
                AbstractC1080d abstractC1080d = (AbstractC1080d) j5.f442b;
                h2.c cVar = h2.e.f7669b;
                C0593b c0593b = new C0593b();
                AbstractC0156x.h(4, "initialCapacity");
                c0593b.f7662d = new Object[4];
                c0593b.f7661c = 0;
                if (nVar.f1965e != null) {
                    c0593b.d(new I3.m(nVar, abstractC1080d, 1));
                }
                if (nVar.f1966f != null) {
                    c0593b.d(new I3.m(nVar, abstractC1080d, 0));
                }
                c0593b.f7660b = true;
                h2.c cVarListIterator = h2.e.l(c0593b.f7661c, (Object[]) c0593b.f7662d).listIterator(0);
                while (cVarListIterator.hasNext()) {
                    I3.m mVar8 = (I3.m) cVarListIterator.next();
                    I3.s sVar3 = (I3.s) j5.f444d;
                    I3.l lVar4 = sVar3.f;
                    long jLongValue = sVar3.l.longValue();
                    switch (mVar8.f1958a) {
                        case 0:
                            I3.n nVar2 = mVar8.f1959b;
                            ArrayList arrayListH = I3.s.h(lVar4, ((Integer) nVar2.f1966f.f2875d).intValue());
                            int size = arrayListH.size();
                            S0.n nVar3 = nVar2.f1966f;
                            if (size >= ((Integer) nVar3.f2874c).intValue() && arrayListH.size() != 0) {
                                Iterator it = arrayListH.iterator();
                                while (it.hasNext()) {
                                    I3.k kVar2 = (I3.k) it.next();
                                    if (lVar4.a() >= nVar2.f1964d.intValue()) {
                                        break;
                                    } else if (kVar2.c() >= ((Integer) nVar3.f2875d).intValue()) {
                                        if (((AtomicLong) kVar2.f1952c.f2868c).get() / kVar2.c() > ((Integer) nVar3.f2872a).intValue() / 100.0d) {
                                            mVar8.f1960c.m(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", kVar2, Double.valueOf(((AtomicLong) kVar2.f1952c.f2868c).get() / kVar2.c()));
                                            if (new Random().nextInt(100) < ((Integer) nVar3.f2873b).intValue()) {
                                                kVar2.b(jLongValue);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            I3.n nVar4 = mVar8.f1959b;
                            ArrayList arrayListH2 = I3.s.h(lVar4, ((Integer) nVar4.f1965e.f2861d).intValue());
                            int size2 = arrayListH2.size();
                            S0.i iVar3 = nVar4.f1965e;
                            if (size2 >= ((Integer) iVar3.f2860c).intValue() && arrayListH2.size() != 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = arrayListH2.iterator();
                                while (it2.hasNext()) {
                                    I3.k kVar3 = (I3.k) it2.next();
                                    arrayList.add(Double.valueOf(((AtomicLong) kVar3.f1952c.f2867b).get() / kVar3.c()));
                                }
                                Iterator it3 = arrayList.iterator();
                                double d5 = 0.0d;
                                double dDoubleValue = 0.0d;
                                while (it3.hasNext()) {
                                    dDoubleValue = ((Double) it3.next()).doubleValue() + dDoubleValue;
                                }
                                double size3 = dDoubleValue / arrayList.size();
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    double dDoubleValue2 = ((Double) it4.next()).doubleValue() - size3;
                                    d5 = (dDoubleValue2 * dDoubleValue2) + d5;
                                }
                                double dSqrt = Math.sqrt(d5 / arrayList.size());
                                double dIntValue = size3 - ((((Integer) iVar3.f2858a).intValue() / 1000.0f) * dSqrt);
                                Iterator it5 = arrayListH2.iterator();
                                while (it5.hasNext()) {
                                    I3.k kVar4 = (I3.k) it5.next();
                                    if (lVar4.a() >= nVar4.f1964d.intValue()) {
                                        break;
                                    } else {
                                        I3.n nVar5 = nVar4;
                                        I3.l lVar5 = lVar4;
                                        if (((AtomicLong) kVar4.f1952c.f2867b).get() / kVar4.c() < dIntValue) {
                                            mVar8.f1960c.m(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", kVar4, Double.valueOf(((AtomicLong) kVar4.f1952c.f2867b).get() / kVar4.c()), Double.valueOf(size3), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                                            if (new Random().nextInt(100) < ((Integer) iVar3.f2859b).intValue()) {
                                                kVar4.b(jLongValue);
                                            }
                                        }
                                        lVar4 = lVar5;
                                        nVar4 = nVar5;
                                    }
                                }
                                break;
                            }
                            break;
                    }
                    j5 = this;
                }
                I3.s sVar4 = (I3.s) j5.f444d;
                I3.l lVar6 = sVar4.f;
                Long l4 = sVar4.l;
                for (I3.k kVar5 : ((HashMap) lVar6.f1957b).values()) {
                    if (!kVar5.d()) {
                        int i5 = kVar5.f1954e;
                        kVar5.f1954e = i5 == 0 ? 0 : i5 - 1;
                    }
                    if (kVar5.d()) {
                        if (l4.longValue() > Math.min(kVar5.f1950a.f1962b.longValue() * kVar5.f1954e, Math.max(kVar5.f1950a.f1962b.longValue(), kVar5.f1950a.f1963c.longValue())) + kVar5.f1953d.longValue()) {
                            kVar5.e();
                        }
                    }
                }
                return;
            case 6:
                try {
                    objCall = ((J.c) j5.f443c).call();
                } catch (Exception unused2) {
                }
                ((Handler) j5.f444d).post(new A3.a(i, (J.d) j5.f442b, objCall, z4));
                return;
            case 7:
                M.d0.h((View) j5.f443c, (S0.v) j5.f442b);
                ((ValueAnimator) j5.f444d).start();
                return;
            case 8:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) j5.f444d;
                Context context = (Context) j5.f442b;
                Intent intent = (Intent) j5.f443c;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    J0.t.d().a(ConstraintProxyUpdateReceiver.f4856a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    T0.k.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    T0.k.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    T0.k.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    T0.k.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                ((K0.f) j5.f443c).h((K0.l) j5.f442b, (C0009i) j5.f444d);
                return;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                C.d dVar = (C.d) j5.f444d;
                int i6 = dVar.f1046b;
                AbstractC0350l abstractC0350l = (AbstractC0350l) j5.f443c;
                if (i6 > 0) {
                    Bundle bundle = (Bundle) dVar.f1048d;
                    abstractC0350l.onCreate(bundle != null ? bundle.getBundle((String) j5.f442b) : null);
                }
                if (dVar.f1046b >= 2) {
                    abstractC0350l.onStart();
                }
                if (dVar.f1046b >= 3) {
                    abstractC0350l.onResume();
                }
                if (dVar.f1046b >= 4) {
                    abstractC0350l.onStop();
                }
                if (dVar.f1046b >= 5) {
                    abstractC0350l.onDestroy();
                    return;
                }
                return;
            default:
                ((z3.p0) j5.f444d).execute((z3.o0) j5.f443c);
                return;
        }
    }

    public String toString() {
        switch (this.f441a) {
            case 11:
                return ((Runnable) this.f442b).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, int i) {
        this.f441a = i;
        this.f444d = obj;
        this.f443c = obj2;
        this.f442b = obj3;
    }

    public J(C.d dVar, AbstractC0350l abstractC0350l, String str) {
        this.f441a = 10;
        this.f443c = abstractC0350l;
        this.f442b = str;
        Objects.requireNonNull(dVar);
        this.f444d = dVar;
    }

    public J(K0.f processor, K0.l lVar, C0009i c0009i) {
        this.f441a = 9;
        kotlin.jvm.internal.i.e(processor, "processor");
        this.f443c = processor;
        this.f442b = lVar;
        this.f444d = c0009i;
    }

    public J(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f441a = 8;
        this.f443c = intent;
        this.f442b = context;
        this.f444d = pendingResult;
    }

    public J(View view, M.i0 i0Var, S0.v vVar, ValueAnimator valueAnimator) {
        this.f441a = 7;
        this.f443c = view;
        this.f442b = vVar;
        this.f444d = valueAnimator;
    }
}
