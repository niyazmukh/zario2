package A2;

import B3.C0061m;
import B3.C0063m1;
import B3.C0081t1;
import B3.Z1;
import B3.a2;
import E2.AbstractC0101c;
import E2.C0106i;
import E2.RunnableC0100a;
import N2.j0;
import N2.n0;
import a.AbstractC0183a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.C0242x;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b.ExecutorC0254k;
import b2.C0266e;
import b2.C0272k;
import b3.C0283G;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;
import com.niyaz.zario.databinding.FragmentInterventionBinding;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import f4.C0510i0;
import g0.AbstractActivityC0570w;
import g0.AbstractComponentCallbacksC0567t;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import k2.InterfaceFutureC0659b;
import x2.C1038d;
import y2.C1049B;
import z3.o0;

/* renamed from: A2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\e.1.smali */
public final /* synthetic */ class RunnableC0005e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f185b;

    public /* synthetic */ RunnableC0005e(Object obj, int i) {
        this.f184a = i;
        this.f185b = obj;
    }

    private final void a() {
        c0.p pVar = (c0.p) this.f185b;
        synchronized (pVar.f5382d) {
            try {
                if (pVar.h == null) {
                    return;
                }
                try {
                    J.g gVarC = pVar.c();
                    int i = gVarC.f2008e;
                    if (i == 2) {
                        synchronized (pVar.f5382d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        I.m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        X1.e eVar = pVar.f5381c;
                        Context context = pVar.f5379a;
                        eVar.getClass();
                        Typeface typefaceA = D.g.a(context, new J.g[]{gVarC}, 0);
                        MappedByteBuffer mappedByteBufferS = S0.f.S(pVar.f5379a, gVarC.f2004a);
                        if (mappedByteBufferS == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            I.m.a("EmojiCompat.MetadataRepo.create");
                            S0.i iVar = new S0.i(typefaceA, r1.d.S(mappedByteBufferS));
                            I.m.b();
                            synchronized (pVar.f5382d) {
                                try {
                                    p1.b bVar = pVar.h;
                                    if (bVar != null) {
                                        bVar.F(iVar);
                                    }
                                } finally {
                                }
                            }
                            pVar.b();
                        } finally {
                            I.m.b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (pVar.f5382d) {
                        try {
                            p1.b bVar2 = pVar.h;
                            if (bVar2 != null) {
                                bVar2.E(th2);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        int i5 = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        switch (this.f184a) {
            case 0:
                S0.e eVar = (S0.e) this.f185b;
                C0006f c0006f = (C0006f) eVar.f2852b;
                c0006f.getClass();
                Integer num = (Integer) c0006f.f189b.V("Backfill Indexes", new C0004d(c0006f, z4 ? 1 : 0));
                num.getClass();
                p1.b.p(1, "IndexBackfiller", "Documents written: %s", num);
                ((F2.f) eVar.f2851a).a(F2.e.f1702n, C0006f.f187g, new RunnableC0005e(eVar, i5));
                return;
            case 1:
                C0020u c0020u = (C0020u) this.f185b;
                r rVar = (r) c0020u.f252d;
                c0020u.f250b = true;
                ((F2.f) c0020u.f251c).a(F2.e.f1699k, C0024y.f259d, new RunnableC0005e(c0020u, z5 ? 1 : 0));
                return;
            case 2:
                Boolean[] boolArr = {Boolean.FALSE};
                X x3 = (X) ((K2.c) this.f185b).b;
                x3.z0("SELECT migration_name FROM data_migrations").C(new M(boolArr, z7 ? 1 : 0));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    Cursor cursorH0 = x3.z0("SELECT DISTINCT uid FROM mutation_queues").h0();
                    while (cursorH0.moveToNext()) {
                        try {
                            hashSet.add(cursorH0.getString(0));
                        } catch (Throwable th) {
                            if (cursorH0 != null) {
                                try {
                                    cursorH0.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    cursorH0.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C1038d c1038d = new C1038d((String) it.next());
                        D dF = x3.F(c1038d, x3.E(c1038d));
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((ArrayList) ((T) dF).h()).iterator();
                        while (it2.hasNext()) {
                            hashSet2.addAll(((C2.i) it2.next()).b());
                        }
                        InterfaceC0001a interfaceC0001aD = x3.D(c1038d);
                        InterfaceC0007g interfaceC0007gE = x3.E(c1038d);
                        S0.i iVar = x3.f147e;
                        new C0009i(iVar, dF, interfaceC0001aD, interfaceC0007gE).d0(iVar.h(hashSet2));
                    }
                    x3.y0("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 3:
                C0061m c0061m = (C0061m) this.f185b;
                S0.l lVar = c0061m.f897d;
                if (lVar != null) {
                    o0 o0Var = (o0) lVar.f2867b;
                    if (!o0Var.f11376c && !o0Var.f11375b) {
                        lVar.i();
                    }
                }
                c0061m.f896c = null;
                return;
            case 4:
                ((C0081t1) this.f185b).e();
                return;
            case 5:
                a2 a2Var = ((Z1) this.f185b).f701e;
                a2Var.f738b.a(new B3.N(a2Var, 10));
                return;
            case 6:
                AbstractC0101c abstractC0101c = (AbstractC0101c) ((C.d) this.f185b).f1048d;
                p1.b.p(1, abstractC0101c.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(abstractC0101c)));
                abstractC0101c.h = E2.x.f1510c;
                abstractC0101c.f1444l.a();
                if (abstractC0101c.f1435a == null) {
                    abstractC0101c.f1435a = abstractC0101c.f1440f.a(F2.e.f1697e, AbstractC0101c.f1433p, new RunnableC0100a(abstractC0101c, z8 ? 1 : 0));
                    return;
                }
                return;
            case 7:
                E2.u uVar = (E2.u) this.f185b;
                uVar.f1502c = null;
                AbstractC0183a.N(uVar.f1500a == 1, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
                Locale locale = Locale.ENGLISH;
                uVar.a("Backend didn't respond within 10 seconds\n");
                uVar.b(3);
                return;
            case 8:
                Throwable th3 = (Throwable) this.f185b;
                if (!(th3 instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (26.0.2).", th3);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.0.2) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th3);
                throw outOfMemoryError;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                C0009i c0009i = (C0009i) this.f185b;
                ((F2.f) c0009i.f206d).d();
                if (((ScheduledFuture) c0009i.f205c) != null) {
                    c0009i.W();
                    ((Runnable) c0009i.f204b).run();
                    return;
                }
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                ((CarouselLayoutManager) this.f185b).j0();
                return;
            case 11:
                CoroutineWorker.a((CoroutineWorker) this.f185b);
                return;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                View view = (View) this.f185b;
                ((InputMethodManager) B.l.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 13:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f185b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.f4876d.f3290a instanceof U0.a) {
                    return;
                }
                Object obj = this$0.getInputData().f2051a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                J0.t tVarD = J0.t.d();
                kotlin.jvm.internal.i.d(tVarD, "get()");
                if (str == null || str.length() == 0) {
                    tVarD.b(W0.a.f3690a, "No worker to delegate to.");
                    U0.k future = this$0.f4876d;
                    kotlin.jvm.internal.i.d(future, "future");
                    future.j(new J0.o());
                    return;
                }
                J0.s sVarB = this$0.getWorkerFactory().b(this$0.getApplicationContext(), str, this$0.f4873a);
                this$0.f4877e = sVarB;
                if (sVarB == null) {
                    tVarD.a(W0.a.f3690a, "No worker to delegate to.");
                    U0.k future2 = this$0.f4876d;
                    kotlin.jvm.internal.i.d(future2, "future");
                    future2.j(new J0.o());
                    return;
                }
                K0.r rVarB = K0.r.b(this$0.getApplicationContext());
                kotlin.jvm.internal.i.d(rVarB, "getInstance(applicationContext)");
                S0.t tVarV = rVarB.f2174c.v();
                String string = this$0.getId().toString();
                kotlin.jvm.internal.i.d(string, "id.toString()");
                S0.q qVarK = tVarV.k(string);
                if (qVarK == null) {
                    U0.k future3 = this$0.f4876d;
                    kotlin.jvm.internal.i.d(future3, "future");
                    String str2 = W0.a.f3690a;
                    future3.j(new J0.o());
                    return;
                }
                S0.n nVar = rVarB.f2179j;
                kotlin.jvm.internal.i.d(nVar, "workManagerImpl.trackers");
                h1.i iVar2 = new h1.i(nVar);
                f4.A a5 = (f4.A) ((S0.i) rVarB.f2175d).f2859b;
                kotlin.jvm.internal.i.d(a5, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                this$0.f4876d.a(new RunnableC0005e(O0.l.a(iVar2, qVarK, a5, this$0), 14), new T0.o(0));
                if (!iVar2.v(qVarK)) {
                    tVarD.a(W0.a.f3690a, "Constraints not met for delegate " + str + ". Requesting retry.");
                    U0.k future4 = this$0.f4876d;
                    kotlin.jvm.internal.i.d(future4, "future");
                    future4.j(new J0.p());
                    return;
                }
                tVarD.a(W0.a.f3690a, "Constraints met for delegate ".concat(str));
                try {
                    J0.s sVar = this$0.f4877e;
                    kotlin.jvm.internal.i.b(sVar);
                    InterfaceFutureC0659b interfaceFutureC0659bStartWork = sVar.startWork();
                    kotlin.jvm.internal.i.d(interfaceFutureC0659bStartWork, "delegate!!.startWork()");
                    interfaceFutureC0659bStartWork.a(new RunnableC0012l(15, this$0, interfaceFutureC0659bStartWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable th4) {
                    String str3 = W0.a.f3690a;
                    String strL = B.a.l("Delegated worker ", str, " threw exception in startWork.");
                    if (tVarD.f2064a <= 3) {
                        Log.d(str3, strL, th4);
                    }
                    synchronized (this$0.f4874b) {
                        try {
                            if (!this$0.f4875c) {
                                U0.k future5 = this$0.f4876d;
                                kotlin.jvm.internal.i.d(future5, "future");
                                future5.j(new J0.o());
                                return;
                            } else {
                                tVarD.a(str3, "Constraints were unmet, Retrying.");
                                U0.k future6 = this$0.f4876d;
                                kotlin.jvm.internal.i.d(future6, "future");
                                future6.j(new J0.p());
                                return;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            case 14:
                ((C0510i0) this.f185b).cancel((CancellationException) null);
                return;
            case 15:
                F1.h hVar = (F1.h) this.f185b;
                hVar.f1682c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hVar.f1684e;
                V.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    hVar.b(hVar.f1681b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(hVar.f1681b);
                        return;
                    }
                    return;
                }
            case 16:
                androidx.lifecycle.M this$02 = (androidx.lifecycle.M) this.f185b;
                kotlin.jvm.internal.i.e(this$02, "this$0");
                int i6 = this$02.f4591b;
                C0242x c0242x = this$02.f4595f;
                if (i6 == 0) {
                    this$02.f4592c = true;
                    c0242x.d(androidx.lifecycle.n.ON_PAUSE);
                }
                if (this$02.f4590a == 0 && this$02.f4592c) {
                    c0242x.d(androidx.lifecycle.n.ON_STOP);
                    this$02.f4593d = true;
                    return;
                }
                return;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((AbstractActivityC0570w) this.f185b).invalidateOptionsMenu();
                return;
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ExecutorC0254k executorC0254k = (ExecutorC0254k) this.f185b;
                Runnable runnable = executorC0254k.f4899b;
                if (runnable != null) {
                    runnable.run();
                    executorC0254k.f4899b = null;
                    return;
                }
                return;
            case 19:
                b.m.a((b.m) this.f185b);
                return;
            case 20:
                ((C0266e) this.f185b).t(true);
                return;
            case 21:
                C0272k c0272k = (C0272k) this.f185b;
                boolean zIsPopupShowing = c0272k.h.isPopupShowing();
                c0272k.t(zIsPopupShowing);
                c0272k.f5021m = zIsPopupShowing;
                return;
            case 22:
                ((TextInputLayout) this.f185b).f6149d.requestLayout();
                return;
            case 23:
                a();
                return;
            case 24:
                EditText editText = (EditText) this.f185b;
                editText.requestFocus();
                editText.post(new RunnableC0005e(editText, 12));
                return;
            case 25:
                ((com.google.android.material.timepicker.e) this.f185b).f();
                return;
            case 26:
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) this.f185b;
                abstractComponentCallbacksC0567t.f7521S.f7400f.h(abstractComponentCallbacksC0567t.f7530d);
                abstractComponentCallbacksC0567t.f7530d = null;
                return;
            case 27:
                FragmentInterventionBinding fragmentInterventionBinding = ((InterventionFragment) this.f185b).f6716f0;
                kotlin.jvm.internal.i.b(fragmentInterventionBinding);
                fragmentInterventionBinding.swipeRefreshLayout.setRefreshing(false);
                return;
            default:
                T t4 = (T) this.f185b;
                C0063m1 c0063m1 = (C0063m1) t4.f136d;
                c0063m1.getClass();
                C1049B c1049b = new C1049B((C0106i) c0063m1.f905e);
                C0017q c0017q = (C0017q) t4.f137e;
                c0017q.getClass();
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) c0017q.f229b;
                firebaseFirestore.getClass();
                Tasks.call((ThreadPoolExecutor) c0017q.f230c, new K0.e(firebaseFirestore, (C0283G) c0017q.f231d, c1049b, i)).addOnCompleteListener(((F2.f) t4.f133a).f1704a, new C0011k(8, t4, c1049b));
                return;
        }
    }
}
