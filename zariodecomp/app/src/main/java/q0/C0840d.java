package q0;

import L3.C;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0242x;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0536D;
import g0.C0542J;
import g0.DialogInterfaceOnCancelListenerC0561m;
import g0.InterfaceC0546N;
import i4.I;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.u;
import o0.C0769D;
import o0.C0787j;
import o0.C0790m;
import o0.M;
import o0.N;
import o0.x;
import x0.C1031a;

@M("dialog")
/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\d.smali */
public final class C0840d extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9439c;

    /* renamed from: d, reason: collision with root package name */
    public final C0542J f9440d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f9441e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C1031a f9442f = new C1031a(this, 5);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f9443g = new LinkedHashMap();

    public C0840d(Context context, C0542J c0542j) {
        this.f9439c = context;
        this.f9440d = c0542j;
    }

    @Override // o0.N
    public final x a() {
        return new C0838b(this);
    }

    @Override // o0.N
    public final void d(List list, C0769D c0769d) {
        C0542J c0542j = this.f9440d;
        if (c0542j.L()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0787j c0787j = (C0787j) it.next();
            k(c0787j).b0(c0542j, c0787j.f9073f);
            C0787j c0787j2 = (C0787j) L3.j.j0((List) ((I) b().f9090e.f7964a).K());
            boolean zC0 = L3.j.c0((Iterable) ((I) b().f9091f.f7964a).K(), c0787j2);
            b().h(c0787j);
            if (c0787j2 != null && !zC0) {
                b().b(c0787j2);
            }
        }
    }

    @Override // o0.N
    public final void e(C0790m c0790m) {
        C0242x c0242x;
        this.f9034a = c0790m;
        this.f9035b = true;
        Iterator it = ((List) ((I) c0790m.f9090e.f7964a).K()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C0542J c0542j = this.f9440d;
            if (!zHasNext) {
                c0542j.f7340n.add(new InterfaceC0546N() { // from class: q0.a
                    @Override // g0.InterfaceC0546N
                    public final void a(C0542J c0542j2, AbstractComponentCallbacksC0567t childFragment) {
                        C0840d this$0 = this.f9436a;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        kotlin.jvm.internal.i.e(c0542j2, "<anonymous parameter 0>");
                        kotlin.jvm.internal.i.e(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f9441e;
                        String str = childFragment.f7506C;
                        u.a(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            childFragment.f7520R.a(this$0.f9442f);
                        }
                        LinkedHashMap linkedHashMap = this$0.f9443g;
                        u.b(linkedHashMap).remove(childFragment.f7506C);
                    }
                });
                return;
            }
            C0787j c0787j = (C0787j) it.next();
            DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = (DialogInterfaceOnCancelListenerC0561m) c0542j.C(c0787j.f9073f);
            if (dialogInterfaceOnCancelListenerC0561m == null || (c0242x = dialogInterfaceOnCancelListenerC0561m.f7520R) == null) {
                this.f9441e.add(c0787j.f9073f);
            } else {
                c0242x.a(this.f9442f);
            }
        }
    }

    @Override // o0.N
    public final void f(C0787j c0787j) {
        C0542J c0542j = this.f9440d;
        if (c0542j.L()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f9443g;
        String str = c0787j.f9073f;
        DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = (DialogInterfaceOnCancelListenerC0561m) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0561m == null) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tC = c0542j.C(str);
            dialogInterfaceOnCancelListenerC0561m = abstractComponentCallbacksC0567tC instanceof DialogInterfaceOnCancelListenerC0561m ? (DialogInterfaceOnCancelListenerC0561m) abstractComponentCallbacksC0567tC : null;
        }
        if (dialogInterfaceOnCancelListenerC0561m != null) {
            dialogInterfaceOnCancelListenerC0561m.f7520R.f(this.f9442f);
            dialogInterfaceOnCancelListenerC0561m.Y(false, false);
        }
        k(c0787j).b0(c0542j, str);
        C0790m c0790mB = b();
        List list = (List) ((I) c0790mB.f9090e.f7964a).K();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C0787j c0787j2 = (C0787j) listIterator.previous();
            if (kotlin.jvm.internal.i.a(c0787j2.f9073f, str)) {
                I i = c0790mB.f9088c;
                i.M(null, C.l0(C.l0((Set) i.K(), c0787j2), c0787j));
                c0790mB.c(c0787j);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // o0.N
    public final void i(C0787j popUpTo, boolean z4) {
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        C0542J c0542j = this.f9440d;
        if (c0542j.L()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((I) b().f9090e.f7964a).K();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = L3.j.m0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tC = c0542j.C(((C0787j) it.next()).f9073f);
            if (abstractComponentCallbacksC0567tC != null) {
                ((DialogInterfaceOnCancelListenerC0561m) abstractComponentCallbacksC0567tC).Y(false, false);
            }
        }
        l(iIndexOf, popUpTo, z4);
    }

    public final DialogInterfaceOnCancelListenerC0561m k(C0787j c0787j) {
        x xVar = c0787j.f9069b;
        kotlin.jvm.internal.i.c(xVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0838b c0838b = (C0838b) xVar;
        String str = c0838b.f9437o;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f9439c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        C0536D c0536dE = this.f9440d.E();
        context.getClassLoader();
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tA = c0536dE.a(str);
        kotlin.jvm.internal.i.d(abstractComponentCallbacksC0567tA, "fragmentManager.fragment…ader, className\n        )");
        if (DialogInterfaceOnCancelListenerC0561m.class.isAssignableFrom(abstractComponentCallbacksC0567tA.getClass())) {
            DialogInterfaceOnCancelListenerC0561m dialogInterfaceOnCancelListenerC0561m = (DialogInterfaceOnCancelListenerC0561m) abstractComponentCallbacksC0567tA;
            dialogInterfaceOnCancelListenerC0561m.W(c0787j.c());
            dialogInterfaceOnCancelListenerC0561m.f7520R.a(this.f9442f);
            this.f9443g.put(c0787j.f9073f, dialogInterfaceOnCancelListenerC0561m);
            return dialogInterfaceOnCancelListenerC0561m;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = c0838b.f9437o;
        if (str2 != null) {
            throw new IllegalArgumentException(B.a.m(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i, C0787j c0787j, boolean z4) {
        C0787j c0787j2 = (C0787j) L3.j.f0(i - 1, (List) ((I) b().f9090e.f7964a).K());
        boolean zC0 = L3.j.c0((Iterable) ((I) b().f9091f.f7964a).K(), c0787j2);
        b().f(c0787j, z4);
        if (c0787j2 == null || zC0) {
            return;
        }
        b().b(c0787j2);
    }
}
