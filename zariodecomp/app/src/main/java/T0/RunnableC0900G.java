package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: t0.G, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\G.smali */
public final class RunnableC0900G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9899b;

    public /* synthetic */ RunnableC0900G(RecyclerView recyclerView, int i) {
        this.f9898a = i;
        this.f9899b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f9899b;
        switch (this.f9898a) {
            case 0:
                if (recyclerView.f4771w && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f4767u) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f4776z) {
                        recyclerView.m();
                        break;
                    } else {
                        recyclerView.f4775y = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC0906M abstractC0906M = recyclerView.f4721N;
                if (abstractC0906M != null) {
                    C0926l c0926l = (C0926l) abstractC0906M;
                    ArrayList arrayList = c0926l.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0926l.f10052j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0926l.f10053k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0926l.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j5 = c0926l.f9906d;
                            if (zHasNext) {
                                g0 g0Var = (g0) it.next();
                                View view = g0Var.f10004a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c0926l.f10059q.add(g0Var);
                                viewPropertyAnimatorAnimate.setDuration(j5).alpha(0.0f).setListener(new C0922g(c0926l, g0Var, viewPropertyAnimatorAnimate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0926l.f10055m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0921f runnableC0921f = new RunnableC0921f(c0926l, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC0921f.run();
                                    } else {
                                        View view2 = ((k) arrayList5.get(0)).a.f10004a;
                                        WeakHashMap weakHashMap = M.S.f2363a;
                                        M.B.n(view2, runnableC0921f, j5);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0926l.f10056n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0921f runnableC0921f2 = new RunnableC0921f(c0926l, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC0921f2.run();
                                    } else {
                                        View view3 = ((C0925j) arrayList6.get(0)).f10035a.f10004a;
                                        WeakHashMap weakHashMap2 = M.S.f2363a;
                                        M.B.n(view3, runnableC0921f2, j5);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0926l.f10054l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0921f runnableC0921f3 = new RunnableC0921f(c0926l, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC0921f3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j5 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c0926l.f9907e : 0L, zIsEmpty3 ? 0L : c0926l.f9908f) + j5;
                                        View view4 = ((g0) arrayList7.get(0)).f10004a;
                                        WeakHashMap weakHashMap3 = M.S.f2363a;
                                        M.B.n(view4, runnableC0921f3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f4756o0 = false;
                break;
        }
    }
}
