package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\f.1.smali */
public final class RunnableC0921f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0926l f9990c;

    public /* synthetic */ RunnableC0921f(C0926l c0926l, ArrayList arrayList, int i) {
        this.f9988a = i;
        this.f9990c = c0926l;
        this.f9989b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f9988a) {
            case 0:
                ArrayList arrayList = this.f9989b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C0926l c0926l = this.f9990c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0926l.f10055m.remove(arrayList);
                        break;
                    } else {
                        k kVar = (k) it2.next();
                        g0 g0Var = kVar.a;
                        c0926l.getClass();
                        View view = g0Var.f10004a;
                        int i = kVar.d - kVar.b;
                        int i5 = kVar.e - kVar.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i5 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0926l.f10058p.add(g0Var);
                        viewPropertyAnimatorAnimate.setDuration(c0926l.f9907e).setListener(new C0923h(c0926l, g0Var, i, view, i5, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f9989b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    C0926l c0926l2 = this.f9990c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0926l2.f10056n.remove(arrayList2);
                        break;
                    } else {
                        C0925j c0925j = (C0925j) it3.next();
                        c0926l2.getClass();
                        g0 g0Var2 = c0925j.f10035a;
                        View view2 = g0Var2 == null ? null : g0Var2.f10004a;
                        g0 g0Var3 = c0925j.f10036b;
                        View view3 = g0Var3 != null ? g0Var3.f10004a : null;
                        ArrayList arrayList3 = c0926l2.f10060r;
                        long j5 = c0926l2.f9908f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j5);
                            arrayList3.add(c0925j.f10035a);
                            duration.translationX(c0925j.f10039e - c0925j.f10037c);
                            duration.translationY(c0925j.f10040f - c0925j.f10038d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0924i(c0926l2, c0925j, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0925j.f10036b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j5).alpha(1.0f).setListener(new C0924i(c0926l2, c0925j, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f9989b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it4.hasNext();
                    C0926l c0926l3 = this.f9990c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0926l3.f10054l.remove(arrayList4);
                        break;
                    } else {
                        g0 g0Var4 = (g0) it4.next();
                        c0926l3.getClass();
                        View view4 = g0Var4.f10004a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0926l3.f10057o.add(g0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0926l3.f9905c).setListener(new C0922g(c0926l3, g0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
