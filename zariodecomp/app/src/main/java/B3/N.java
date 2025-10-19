package B3;

import E2.AbstractC0101c;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0542J;
import g0.DialogInterfaceOnCancelListenerC0561m;
import h1.C0588a;
import java.io.IOException;
import java.net.Socket;
import java.util.WeakHashMap;
import java.util.logging.Level;
import l.C0693i;
import l.C0703n0;
import z3.AbstractC1098w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\N.smali */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f464b;

    public /* synthetic */ N(Object obj, int i) {
        this.f463a = i;
        this.f464b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, IOException {
        Object obj;
        C0693i c0693i;
        int i = 0;
        switch (this.f463a) {
            case 0:
                ((O) this.f464b).f497a.j();
                return;
            case 1:
                ((V) this.f464b).f570a.b();
                return;
            case 2:
                A0 a02 = (A0) ((I) this.f464b).f433b;
                InterfaceC0045g1 interfaceC0045g1 = a02.f364r;
                a02.f363q = null;
                a02.f364r = null;
                interfaceC0045g1.b(z3.k0.f11355n.g("InternalSubchannel closed transport due to address change"));
                return;
            case 3:
                ((Y0) ((G) this.f464b).f411b).A();
                return;
            case 4:
                Y0 y02 = ((Q0) this.f464b).f519e;
                y02.f659p.d();
                if (y02.f669z) {
                    y02.f668y.k();
                    return;
                }
                return;
            case 5:
                A0 a03 = ((X0) this.f464b).f600f;
                z3.k0 k0Var = Y0.f615k0;
                a03.getClass();
                a03.f357k.execute(new RunnableC0080t0(a03, k0Var, i));
                return;
            case 6:
                C0081t1 c0081t1 = (C0081t1) this.f464b;
                c0081t1.f980k = null;
                if (c0081t1.h.b()) {
                    c0081t1.e();
                    return;
                }
                return;
            case 7:
                ((AbstractC1098w) ((C0076r1) this.f464b).f961c).l();
                return;
            case 8:
                N0 n02 = (N0) this.f464b;
                if (n02.f495z) {
                    return;
                }
                n02.f490u.b();
                return;
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                T1 t12 = (T1) this.f464b;
                N0 n03 = (N0) t12.f552c.f953c;
                V1 v12 = t12.f551b;
                z3.V v4 = N0.f465E;
                n03.r(v12);
                return;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                ((a2) this.f464b).k();
                return;
            case 11:
                C3.c cVar = (C3.c) this.f464b;
                try {
                    q4.b bVar = cVar.f1119m;
                    if (bVar != null) {
                        q4.d dVar = cVar.f1112b;
                        long j5 = dVar.f9515b;
                        if (j5 > 0) {
                            bVar.b(dVar, j5);
                        }
                    }
                } catch (IOException e5) {
                    cVar.f1114d.p(e5);
                }
                q4.d dVar2 = cVar.f1112b;
                C3.m mVar = cVar.f1114d;
                try {
                    q4.b bVar2 = cVar.f1119m;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                } catch (IOException e6) {
                    mVar.p(e6);
                }
                try {
                    Socket socket = cVar.f1120n;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e7) {
                    mVar.p(e7);
                    return;
                }
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                C0043g c0043g = (C0043g) this.f464b;
                long j6 = c0043g.f810b;
                long jMax = Math.max(2 * j6, j6);
                C0046h c0046h = (C0046h) c0043g.f811c;
                if (c0046h.f817b.compareAndSet(j6, jMax)) {
                    C0046h.f815c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c0046h.f816a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 13:
                ((C3.m) this.f464b).getClass();
                C3.m mVar2 = (C3.m) this.f464b;
                mVar2.f1218o.execute(mVar2.f1223t);
                synchronized (((C3.m) this.f464b).f1214k) {
                    C3.m mVar3 = (C3.m) this.f464b;
                    mVar3.f1194C = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    mVar3.t();
                }
                ((C3.m) this.f464b).getClass();
                return;
            case 14:
                AbstractC0101c abstractC0101c = (AbstractC0101c) this.f464b;
                if (abstractC0101c.c()) {
                    abstractC0101c.a(E2.x.f1508a, z3.k0.f11348e);
                    return;
                }
                return;
            case 15:
                F1.h hVar = (F1.h) this.f464b;
                hVar.f1682c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f1684e;
                V.e eVar = bottomSheetBehavior.f5825M;
                if (eVar != null && eVar.f()) {
                    hVar.b(hVar.f1681b);
                    return;
                } else {
                    if (bottomSheetBehavior.f5824L == 2) {
                        bottomSheetBehavior.C(hVar.f1681b);
                        return;
                    }
                    return;
                }
            case 16:
                Worker worker = (Worker) this.f464b;
                try {
                    worker.f4840a.j(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.f4840a.k(th);
                    return;
                }
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Q.g gVar = (Q.g) this.f464b;
                if (gVar.f2702s) {
                    boolean z4 = gVar.f2700q;
                    Q.a aVar = gVar.f2688a;
                    if (z4) {
                        gVar.f2700q = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f2684e = jCurrentAnimationTimeMillis;
                        aVar.f2686g = -1L;
                        aVar.f2685f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f2686g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f2686g + aVar.i) || !gVar.e()) {
                        gVar.f2702s = false;
                        return;
                    }
                    boolean z5 = gVar.f2701r;
                    ListView listView = gVar.f2690c;
                    if (z5) {
                        gVar.f2701r = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f2685f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j7 = jCurrentAnimationTimeMillis2 - aVar.f2685f;
                    aVar.f2685f = jCurrentAnimationTimeMillis2;
                    Q.h.b(gVar.f2704u, (int) (j7 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f2683d));
                    WeakHashMap weakHashMap = M.S.f2363a;
                    M.B.m(listView, this);
                    return;
                }
                return;
            case N2.n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((V.e) this.f464b).n(0);
                return;
            case 19:
                synchronized (((androidx.lifecycle.D) this.f464b).f4577a) {
                    obj = ((androidx.lifecycle.D) this.f464b).f4582f;
                    ((androidx.lifecycle.D) this.f464b).f4582f = androidx.lifecycle.D.f4576k;
                }
                ((androidx.lifecycle.D) this.f464b).j(obj);
                return;
            case 20:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e8) {
                    if (!TextUtils.equals(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e8;
                    }
                    return;
                } catch (NullPointerException e9) {
                    if (!TextUtils.equals(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e9;
                    }
                    return;
                }
            case 21:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f464b).f6147c.f5037k;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 22:
                ((com.google.android.gms.common.api.internal.D) this.f464b).h();
                return;
            case 23:
                com.google.android.gms.common.api.g gVar2 = ((com.google.android.gms.common.api.internal.D) ((h1.i) this.f464b).f7641b).f5553b;
                gVar2.disconnect(gVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 24:
                ((com.google.android.gms.common.api.internal.N) this.f464b).i.e(new C0588a(4));
                return;
            case 25:
                DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = (DialogInterfaceOnCancelListenerC0561m) this.f464b;
                dialogInterfaceOnCancelListenerC0561m.f7473d0.onDismiss(dialogInterfaceOnCancelListenerC0561m.f7481l0);
                return;
            case 26:
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) this.f464b;
                if (abstractComponentCallbacksC0567t.f7515M != null) {
                    abstractComponentCallbacksC0567t.k().getClass();
                    return;
                }
                return;
            case 27:
                ((C0542J) this.f464b).x(true);
                return;
            case 28:
                C0703n0 c0703n0 = (C0703n0) this.f464b;
                c0703n0.f8648p = null;
                c0703n0.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.f464b).f4287a;
                if (actionMenuView == null || (c0693i = actionMenuView.f4208x) == null) {
                    return;
                }
                c0693i.l();
                return;
        }
    }
}
