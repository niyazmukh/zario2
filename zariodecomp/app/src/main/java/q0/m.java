package q0;

import L3.p;
import a.AbstractC0183a;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0536D;
import g0.C0540H;
import g0.C0541I;
import g0.C0542J;
import g0.C0549a;
import g0.InterfaceC0546N;
import i4.I;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import k0.C0651a;
import k0.C0654d;
import k0.C0656f;
import kotlin.jvm.internal.s;
import o0.C0769D;
import o0.C0787j;
import o0.C0789l;
import o0.C0790m;
import o0.M;
import o0.N;
import o0.x;

@M("fragment")
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\m.smali */
public class m extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9459c;

    /* renamed from: d, reason: collision with root package name */
    public final C0542J f9460d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9461e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f9462f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9463g = new ArrayList();
    public final C0789l h = new C0789l(this, 1);
    public final J0.m i = new J0.m(this, 5);

    public m(Context context, C0542J c0542j, int i) {
        this.f9459c = context;
        this.f9460d = c0542j;
        this.f9461e = i;
    }

    public static void k(m mVar, String str, boolean z4, int i) {
        int iX;
        int i5 = 0;
        if ((i & 2) != 0) {
            z4 = false;
        }
        boolean z5 = (i & 4) != 0;
        ArrayList arrayList = mVar.f9463g;
        if (z5) {
            e4.l lVar = new e4.l(str, 2);
            kotlin.jvm.internal.i.e(arrayList, "<this>");
            int iX2 = L3.k.X(arrayList);
            if (iX2 >= 0) {
                int i6 = 0;
                while (true) {
                    Object obj = arrayList.get(i5);
                    if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                        if (i6 != i5) {
                            arrayList.set(i6, obj);
                        }
                        i6++;
                    }
                    if (i5 == iX2) {
                        break;
                    } else {
                        i5++;
                    }
                }
                i5 = i6;
            }
            if (i5 < arrayList.size() && i5 <= (iX = L3.k.X(arrayList))) {
                while (true) {
                    arrayList.remove(iX);
                    if (iX == i5) {
                        break;
                    } else {
                        iX--;
                    }
                }
            }
        }
        arrayList.add(new K3.e(str, Boolean.valueOf(z4)));
    }

    public static void l(AbstractComponentCallbacksC0567t fragment, C0787j c0787j, C0790m c0790m) {
        kotlin.jvm.internal.i.e(fragment, "fragment");
        m0 m0VarE = fragment.e();
        ArrayList arrayList = new ArrayList();
        Class clsA = s.a(C0842f.class).a();
        kotlin.jvm.internal.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0656f(clsA));
        C0656f[] c0656fArr = (C0656f[]) arrayList.toArray(new C0656f[0]);
        ((C0842f) new l0(m0VarE, new C0654d((C0656f[]) Arrays.copyOf(c0656fArr, c0656fArr.length)), C0651a.f8292b).a(C0842f.class)).f9446a = new WeakReference(new P0.b(fragment, c0787j, c0790m));
    }

    @Override // o0.N
    public final x a() {
        return new C0843g(this);
    }

    @Override // o0.N
    public final void d(List list, C0769D c0769d) {
        C0542J c0542j = this.f9460d;
        if (c0542j.L()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0787j c0787j = (C0787j) it.next();
            boolean zIsEmpty = ((List) ((I) b().f9090e.f7964a).K()).isEmpty();
            if (c0769d == null || zIsEmpty || !c0769d.f9007b || !this.f9462f.remove(c0787j.f9073f)) {
                C0549a c0549aM = m(c0787j, c0769d);
                if (!zIsEmpty) {
                    C0787j c0787j2 = (C0787j) L3.j.j0((List) ((I) b().f9090e.f7964a).K());
                    if (c0787j2 != null) {
                        k(this, c0787j2.f9073f, false, 6);
                    }
                    String str = c0787j.f9073f;
                    k(this, str, false, 6);
                    if (!c0549aM.h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c0549aM.f7420g = true;
                    c0549aM.i = str;
                }
                c0549aM.d(false);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c0787j);
                }
                b().h(c0787j);
            } else {
                c0542j.v(new C0541I(c0542j, c0787j.f9073f, 0), false);
                b().h(c0787j);
            }
        }
    }

    @Override // o0.N
    public final void e(final C0790m c0790m) {
        this.f9034a = c0790m;
        this.f9035b = true;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        InterfaceC0546N interfaceC0546N = new InterfaceC0546N() { // from class: q0.e
            @Override // g0.InterfaceC0546N
            public final void a(C0542J c0542j, AbstractComponentCallbacksC0567t fragment) {
                Object objPrevious;
                C0790m c0790m2 = c0790m;
                m this$0 = this;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(c0542j, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.e(fragment, "fragment");
                List list = (List) ((I) c0790m2.f9090e.f7964a).K();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (kotlin.jvm.internal.i.a(((C0787j) objPrevious).f9073f, fragment.f7506C)) {
                            break;
                        }
                    }
                }
                C0787j c0787j = (C0787j) objPrevious;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + c0787j + " to FragmentManager " + this$0.f9460d);
                }
                if (c0787j != null) {
                    G g3 = fragment.f7522T;
                    final C0845i c0845i = new C0845i(this$0, fragment, c0787j);
                    g3.d(fragment, new H() { // from class: q0.l
                        @Override // androidx.lifecycle.H
                        public final /* synthetic */ void a(Object obj) {
                            c0845i.invoke(obj);
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof H) || !(obj instanceof l)) {
                                return false;
                            }
                            return c0845i.equals(c0845i);
                        }

                        public final int hashCode() {
                            return c0845i.hashCode();
                        }
                    });
                    fragment.f7520R.a(this$0.h);
                    m.l(fragment, c0787j, c0790m2);
                }
            }
        };
        C0542J c0542j = this.f9460d;
        c0542j.f7340n.add(interfaceC0546N);
        k kVar = new k(c0790m, this);
        if (c0542j.f7338l == null) {
            c0542j.f7338l = new ArrayList();
        }
        c0542j.f7338l.add(kVar);
    }

    @Override // o0.N
    public final void f(C0787j c0787j) {
        C0542J c0542j = this.f9460d;
        if (c0542j.L()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0549a c0549aM = m(c0787j, null);
        List list = (List) ((I) b().f9090e.f7964a).K();
        if (list.size() > 1) {
            C0787j c0787j2 = (C0787j) L3.j.f0(L3.k.X(list) - 1, list);
            if (c0787j2 != null) {
                k(this, c0787j2.f9073f, false, 6);
            }
            String str = c0787j.f9073f;
            k(this, str, true, 4);
            c0542j.v(new C0540H(c0542j, str, -1), false);
            k(this, str, false, 2);
            if (!c0549aM.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            c0549aM.f7420g = true;
            c0549aM.i = str;
        }
        c0549aM.d(false);
        b().c(c0787j);
    }

    @Override // o0.N
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f9462f;
            linkedHashSet.clear();
            p.b0(stringArrayList, linkedHashSet);
        }
    }

    @Override // o0.N
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f9462f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC0183a.j(new K3.e("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    @Override // o0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(o0.C0787j r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.m.i(o0.j, boolean):void");
    }

    public final C0549a m(C0787j c0787j, C0769D c0769d) {
        x xVar = c0787j.f9069b;
        kotlin.jvm.internal.i.c(xVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleC = c0787j.c();
        String str = ((C0843g) xVar).f9447o;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f9459c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        C0542J c0542j = this.f9460d;
        C0536D c0536dE = c0542j.E();
        context.getClassLoader();
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tA = c0536dE.a(str);
        kotlin.jvm.internal.i.d(abstractComponentCallbacksC0567tA, "fragmentManager.fragment…t.classLoader, className)");
        abstractComponentCallbacksC0567tA.W(bundleC);
        C0549a c0549a = new C0549a(c0542j);
        int i = c0769d != null ? c0769d.f9011f : -1;
        int i5 = c0769d != null ? c0769d.f9012g : -1;
        int i6 = c0769d != null ? c0769d.h : -1;
        int i7 = c0769d != null ? c0769d.i : -1;
        if (i != -1 || i5 != -1 || i6 != -1 || i7 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i5 == -1) {
                i5 = 0;
            }
            if (i6 == -1) {
                i6 = 0;
            }
            int i8 = i7 != -1 ? i7 : 0;
            c0549a.f7415b = i;
            c0549a.f7416c = i5;
            c0549a.f7417d = i6;
            c0549a.f7418e = i8;
        }
        int i9 = this.f9461e;
        if (i9 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0549a.e(i9, abstractComponentCallbacksC0567tA, c0787j.f9073f, 2);
        c0549a.g(abstractComponentCallbacksC0567tA);
        c0549a.f7427p = true;
        return c0549a;
    }
}
