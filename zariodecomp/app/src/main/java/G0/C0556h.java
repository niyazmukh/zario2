package g0;

import A2.C0011k;
import A2.C0013m;
import A2.RunnableC0016p;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\h.1.smali */
public final class C0556h {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f7460a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7461b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7463d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7464e;

    public C0556h(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f7460a = container;
        this.f7461b = new ArrayList();
        this.f7462c = new ArrayList();
    }

    public static final C0556h g(ViewGroup container, C0542J fragmentManager) {
        kotlin.jvm.internal.i.e(container, "container");
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.i.d(fragmentManager.F(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(2131231183);
        if (tag instanceof C0556h) {
            return (C0556h) tag;
        }
        C0556h c0556h = new C0556h(container);
        container.setTag(2131231183, c0556h);
        return c0556h;
    }

    public final void a(int i, int i5, C0548P c0548p) {
        synchronized (this.f7461b) {
            I.g gVar = new I.g();
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
            kotlin.jvm.internal.i.d(abstractComponentCallbacksC0567t, "fragmentStateManager.fragment");
            V vE = e(abstractComponentCallbacksC0567t);
            if (vE != null) {
                vE.c(i, i5);
                return;
            }
            final V v4 = new V(i, i5, c0548p, gVar);
            this.f7461b.add(v4);
            final int i6 = 0;
            v4.f7409d.add(new Runnable(this) { // from class: g0.U

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0556h f7404b;

                {
                    this.f7404b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            C0556h this$0 = this.f7404b;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            V v5 = v4;
                            if (this$0.f7461b.contains(v5)) {
                                int i7 = v5.f7406a;
                                View view = v5.f7408c.f7512J;
                                kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                                B.a.a(view, i7);
                                break;
                            }
                            break;
                        default:
                            C0556h this$02 = this.f7404b;
                            kotlin.jvm.internal.i.e(this$02, "this$0");
                            V v6 = v4;
                            this$02.f7461b.remove(v6);
                            this$02.f7462c.remove(v6);
                            break;
                    }
                }
            });
            final int i7 = 1;
            v4.f7409d.add(new Runnable(this) { // from class: g0.U

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0556h f7404b;

                {
                    this.f7404b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            C0556h this$0 = this.f7404b;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            V v5 = v4;
                            if (this$0.f7461b.contains(v5)) {
                                int i72 = v5.f7406a;
                                View view = v5.f7408c.f7512J;
                                kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                                B.a.a(view, i72);
                                break;
                            }
                            break;
                        default:
                            C0556h this$02 = this.f7404b;
                            kotlin.jvm.internal.i.e(this$02, "this$0");
                            V v6 = v4;
                            this$02.f7461b.remove(v6);
                            this$02.f7462c.remove(v6);
                            break;
                    }
                }
            });
        }
    }

    public final void b(int i, C0548P fragmentStateManager) {
        B.a.r(i, "finalState");
        kotlin.jvm.internal.i.e(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f7385c);
        }
        a(i, 2, fragmentStateManager);
    }

    public final void c(ArrayList arrayList, boolean z4) throws Resources.NotFoundException {
        Object obj;
        Object next;
        ArrayList arrayList2;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            V v4 = (V) next;
            View view = v4.f7408c.f7512J;
            kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
            if (p1.b.d(view) == 2 && v4.f7406a != 2) {
                break;
            }
        }
        V v5 = (V) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            V v6 = (V) objPrevious;
            View view2 = v6.f7408c.f7512J;
            kotlin.jvm.internal.i.d(view2, "operation.fragment.mView");
            if (p1.b.d(view2) != 2 && v6.f7406a == 2) {
                obj = objPrevious;
                break;
            }
        }
        V v7 = (V) obj;
        String str = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + v5 + " to " + v7);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayListW0 = L3.j.w0(arrayList);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = ((V) L3.j.i0(arrayList)).f7408c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r rVar = ((V) it2.next()).f7408c.f7515M;
            r rVar2 = abstractComponentCallbacksC0567t.f7515M;
            rVar.f7495b = rVar2.f7495b;
            rVar.f7496c = rVar2.f7496c;
            rVar.f7497d = rVar2.f7497d;
            rVar.f7498e = rVar2.f7498e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            V v8 = (V) it3.next();
            I.g gVar = new I.g();
            v8.d();
            LinkedHashSet linkedHashSet = v8.f7410e;
            linkedHashSet.add(gVar);
            arrayList3.add(new C0552d(v8, gVar, z4));
            I.g gVar2 = new I.g();
            v8.d();
            linkedHashSet.add(gVar2);
            boolean z5 = !z4 ? v8 != v7 : v8 != v5;
            C0553e c0553e = new C0553e(v8, gVar2);
            int i = v8.f7406a;
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = v8.f7408c;
            if (i == 2) {
                if (z4) {
                    r rVar3 = abstractComponentCallbacksC0567t2.f7515M;
                } else {
                    abstractComponentCallbacksC0567t2.getClass();
                }
            } else if (z4) {
                r rVar4 = abstractComponentCallbacksC0567t2.f7515M;
            } else {
                abstractComponentCallbacksC0567t2.getClass();
            }
            if (v8.f7406a == 2) {
                if (z4) {
                    r rVar5 = abstractComponentCallbacksC0567t2.f7515M;
                } else {
                    r rVar6 = abstractComponentCallbacksC0567t2.f7515M;
                }
            }
            if (z5) {
                if (z4) {
                    r rVar7 = abstractComponentCallbacksC0567t2.f7515M;
                } else {
                    abstractComponentCallbacksC0567t2.getClass();
                }
            }
            arrayList4.add(c0553e);
            v8.f7409d.add(new RunnableC0016p(arrayListW0, v8, this, 4));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!((C0553e) next2).h()) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0553e) it5.next()).getClass();
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            ((C0553e) it6.next()).getClass();
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0553e c0553e2 = (C0553e) it7.next();
            linkedHashMap.put((V) c0553e2.f7230a, Boolean.FALSE);
            c0553e2.d();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f7460a;
        Context context = viewGroup.getContext();
        ArrayList arrayList7 = new ArrayList();
        Iterator it8 = arrayList3.iterator();
        boolean z6 = false;
        while (it8.hasNext()) {
            C0552d c0552d = (C0552d) it8.next();
            if (c0552d.h()) {
                c0552d.d();
            } else {
                kotlin.jvm.internal.i.d(context, "context");
                S0.c cVarK = c0552d.k(context);
                if (cVarK == null) {
                    c0552d.d();
                } else {
                    Animator animator = (Animator) cVarK.f2848c;
                    if (animator == null) {
                        arrayList7.add(c0552d);
                    } else {
                        V v9 = (V) c0552d.f7230a;
                        arrayList2 = arrayList7;
                        boolean zA = kotlin.jvm.internal.i.a(linkedHashMap.get(v9), Boolean.TRUE);
                        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = v9.f7408c;
                        if (zA) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0567t3 + " as this Fragment was involved in a Transition.");
                            }
                            c0552d.d();
                            arrayList7 = arrayList2;
                        } else {
                            boolean z7 = v9.f7406a == 3;
                            if (z7) {
                                arrayListW0.remove(v9);
                            }
                            View view3 = abstractComponentCallbacksC0567t3.f7512J;
                            viewGroup.startViewTransition(view3);
                            V v10 = v7;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            String str2 = str;
                            boolean z8 = z7;
                            V v11 = v5;
                            Context context2 = context;
                            ArrayList arrayList8 = arrayListW0;
                            ViewGroup viewGroup2 = viewGroup;
                            animator.addListener(new C0554f(this, view3, z8, v9, c0552d));
                            animator.setTarget(view3);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animator from operation " + v9 + " has started.");
                            }
                            ((I.g) c0552d.f7231b).a(new C0011k(6, animator, v9));
                            context = context2;
                            viewGroup = viewGroup2;
                            arrayList7 = arrayList2;
                            v5 = v11;
                            linkedHashMap = linkedHashMap2;
                            v7 = v10;
                            str = str2;
                            arrayListW0 = arrayList8;
                            z6 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList7;
            arrayList7 = arrayList2;
        }
        V v12 = v5;
        V v13 = v7;
        String str3 = str;
        ArrayList arrayList9 = arrayListW0;
        Context context3 = context;
        ViewGroup viewGroup3 = viewGroup;
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            C0552d c0552d2 = (C0552d) it9.next();
            V v14 = (V) c0552d2.f7230a;
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t4 = v14.f7408c;
            if (zContainsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0567t4 + " as Animations cannot run alongside Transitions.");
                }
                c0552d2.d();
            } else if (z6) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0567t4 + " as Animations cannot run alongside Animators.");
                }
                c0552d2.d();
            } else {
                View view4 = abstractComponentCallbacksC0567t4.f7512J;
                kotlin.jvm.internal.i.d(context3, "context");
                S0.c cVarK2 = c0552d2.k(context3);
                if (cVarK2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) cVarK2.f2847b;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (v14.f7406a != 1) {
                    view4.startAnimation(animation);
                    c0552d2.d();
                } else {
                    viewGroup3.startViewTransition(view4);
                    RunnableC0571x runnableC0571x = new RunnableC0571x(animation, viewGroup3, view4);
                    runnableC0571x.setAnimationListener(new AnimationAnimationListenerC0555g(v14, this, view4, c0552d2));
                    view4.startAnimation(runnableC0571x);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + v14 + " has started.");
                    }
                }
                ((I.g) c0552d2.f7231b).a(new C0013m(view4, this, c0552d2, v14));
            }
        }
        Iterator it10 = arrayList9.iterator();
        while (it10.hasNext()) {
            V v15 = (V) it10.next();
            View view5 = v15.f7408c.f7512J;
            int i5 = v15.f7406a;
            kotlin.jvm.internal.i.d(view5, "view");
            B.a.a(view5, i5);
        }
        arrayList9.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + v12 + str3 + v13);
        }
    }

    public final void d() {
        if (this.f7464e) {
            return;
        }
        ViewGroup viewGroup = this.f7460a;
        WeakHashMap weakHashMap = M.S.f2363a;
        if (!M.E.b(viewGroup)) {
            f();
            this.f7463d = false;
            return;
        }
        synchronized (this.f7461b) {
            try {
                if (!this.f7461b.isEmpty()) {
                    ArrayList arrayListW0 = L3.j.w0(this.f7462c);
                    this.f7462c.clear();
                    Iterator it = arrayListW0.iterator();
                    while (it.hasNext()) {
                        V v4 = (V) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v4);
                        }
                        v4.a();
                        if (!v4.f7412g) {
                            this.f7462c.add(v4);
                        }
                    }
                    h();
                    ArrayList arrayListW02 = L3.j.w0(this.f7461b);
                    this.f7461b.clear();
                    this.f7462c.addAll(arrayListW02);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayListW02.iterator();
                    while (it2.hasNext()) {
                        ((V) it2.next()).d();
                    }
                    c(arrayListW02, this.f7463d);
                    this.f7463d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final V e(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        Object next;
        Iterator it = this.f7461b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            V v4 = (V) next;
            if (kotlin.jvm.internal.i.a(v4.f7408c, abstractComponentCallbacksC0567t) && !v4.f7411f) {
                break;
            }
        }
        return (V) next;
    }

    public final void f() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f7460a;
        WeakHashMap weakHashMap = M.S.f2363a;
        boolean zB = M.E.b(viewGroup);
        synchronized (this.f7461b) {
            try {
                h();
                Iterator it = this.f7461b.iterator();
                while (it.hasNext()) {
                    ((V) it.next()).d();
                }
                Iterator it2 = L3.j.w0(this.f7462c).iterator();
                while (it2.hasNext()) {
                    V v4 = (V) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zB) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f7460a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + v4);
                    }
                    v4.a();
                }
                Iterator it3 = L3.j.w0(this.f7461b).iterator();
                while (it3.hasNext()) {
                    V v5 = (V) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (zB) {
                            str = "";
                        } else {
                            str = "Container " + this.f7460a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + v5);
                    }
                    v5.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Iterator it = this.f7461b.iterator();
        while (it.hasNext()) {
            V v4 = (V) it.next();
            int i = 2;
            if (v4.f7407b == 2) {
                int visibility = v4.f7408c.T().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(B.a.g(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                v4.c(i, 1);
            }
        }
    }
}
