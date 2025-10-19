package g0;

import A2.C0009i;
import a.AbstractC0183a;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.l0;
import b.C0250g;
import b.InterfaceC0246c;
import e.C0447a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0708q;
import r.AbstractC0854a;

/* renamed from: g0.J, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\J.smali */
public final class C0542J {

    /* renamed from: A, reason: collision with root package name */
    public d.e f7316A;

    /* renamed from: B, reason: collision with root package name */
    public d.e f7317B;

    /* renamed from: C, reason: collision with root package name */
    public d.e f7318C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque f7319D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7320E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7321F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7322H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7323I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f7324J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f7325K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f7326L;

    /* renamed from: M, reason: collision with root package name */
    public C0545M f7327M;

    /* renamed from: N, reason: collision with root package name */
    public final B3.N f7328N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7330b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7332d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7333e;

    /* renamed from: g, reason: collision with root package name */
    public b.x f7335g;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7338l;

    /* renamed from: m, reason: collision with root package name */
    public final S0.e f7339m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f7340n;

    /* renamed from: o, reason: collision with root package name */
    public final C0534A f7341o;

    /* renamed from: p, reason: collision with root package name */
    public final C0534A f7342p;

    /* renamed from: q, reason: collision with root package name */
    public final C0534A f7343q;

    /* renamed from: r, reason: collision with root package name */
    public final C0534A f7344r;

    /* renamed from: s, reason: collision with root package name */
    public final C f7345s;

    /* renamed from: t, reason: collision with root package name */
    public int f7346t;

    /* renamed from: u, reason: collision with root package name */
    public C0569v f7347u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0183a f7348v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0567t f7349w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0567t f7350x;

    /* renamed from: y, reason: collision with root package name */
    public final C0536D f7351y;

    /* renamed from: z, reason: collision with root package name */
    public final J3.c f7352z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7329a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final S0.n f7331c = new S0.n(7);

    /* renamed from: f, reason: collision with root package name */
    public final z f7334f = new z(this);
    public final C0535B h = new C0535B(this, 0);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f7336j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f7337k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [g0.A] */
    /* JADX WARN: Type inference failed for: r0v13, types: [g0.A] */
    /* JADX WARN: Type inference failed for: r0v14, types: [g0.A] */
    /* JADX WARN: Type inference failed for: r0v15, types: [g0.A] */
    public C0542J() {
        Collections.synchronizedMap(new HashMap());
        S0.e eVar = new S0.e();
        eVar.f2851a = new CopyOnWriteArrayList();
        eVar.f2852b = this;
        this.f7339m = eVar;
        this.f7340n = new CopyOnWriteArrayList();
        final int i = 0;
        this.f7341o = new L.a(this) { // from class: g0.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0542J f7301b;

            {
                this.f7301b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        C0542J c0542j = this.f7301b;
                        if (c0542j.I()) {
                            c0542j.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0542J c0542j2 = this.f7301b;
                        if (c0542j2.I() && num.intValue() == 80) {
                            c0542j2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.g gVar = (A.g) obj;
                        C0542J c0542j3 = this.f7301b;
                        if (c0542j3.I()) {
                            c0542j3.m(gVar.f3a, false);
                            break;
                        }
                        break;
                    default:
                        A.y yVar = (A.y) obj;
                        C0542J c0542j4 = this.f7301b;
                        if (c0542j4.I()) {
                            c0542j4.r(yVar.f26a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f7342p = new L.a(this) { // from class: g0.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0542J f7301b;

            {
                this.f7301b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        C0542J c0542j = this.f7301b;
                        if (c0542j.I()) {
                            c0542j.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0542J c0542j2 = this.f7301b;
                        if (c0542j2.I() && num.intValue() == 80) {
                            c0542j2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.g gVar = (A.g) obj;
                        C0542J c0542j3 = this.f7301b;
                        if (c0542j3.I()) {
                            c0542j3.m(gVar.f3a, false);
                            break;
                        }
                        break;
                    default:
                        A.y yVar = (A.y) obj;
                        C0542J c0542j4 = this.f7301b;
                        if (c0542j4.I()) {
                            c0542j4.r(yVar.f26a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f7343q = new L.a(this) { // from class: g0.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0542J f7301b;

            {
                this.f7301b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        C0542J c0542j = this.f7301b;
                        if (c0542j.I()) {
                            c0542j.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0542J c0542j2 = this.f7301b;
                        if (c0542j2.I() && num.intValue() == 80) {
                            c0542j2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.g gVar = (A.g) obj;
                        C0542J c0542j3 = this.f7301b;
                        if (c0542j3.I()) {
                            c0542j3.m(gVar.f3a, false);
                            break;
                        }
                        break;
                    default:
                        A.y yVar = (A.y) obj;
                        C0542J c0542j4 = this.f7301b;
                        if (c0542j4.I()) {
                            c0542j4.r(yVar.f26a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f7344r = new L.a(this) { // from class: g0.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0542J f7301b;

            {
                this.f7301b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        C0542J c0542j = this.f7301b;
                        if (c0542j.I()) {
                            c0542j.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0542J c0542j2 = this.f7301b;
                        if (c0542j2.I() && num.intValue() == 80) {
                            c0542j2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        A.g gVar = (A.g) obj;
                        C0542J c0542j3 = this.f7301b;
                        if (c0542j3.I()) {
                            c0542j3.m(gVar.f3a, false);
                            break;
                        }
                        break;
                    default:
                        A.y yVar = (A.y) obj;
                        C0542J c0542j4 = this.f7301b;
                        if (c0542j4.I()) {
                            c0542j4.r(yVar.f26a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f7345s = new C(this);
        this.f7346t = -1;
        this.f7351y = new C0536D(this);
        this.f7352z = new J3.c();
        this.f7319D = new ArrayDeque();
        this.f7328N = new B3.N(this, 27);
    }

    public static boolean H(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        abstractComponentCallbacksC0567t.getClass();
        Iterator it = abstractComponentCallbacksC0567t.f7547y.f7331c.g().iterator();
        boolean zH = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) it.next();
            if (abstractComponentCallbacksC0567t2 != null) {
                zH = H(abstractComponentCallbacksC0567t2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (abstractComponentCallbacksC0567t == null) {
            return true;
        }
        return abstractComponentCallbacksC0567t.G && (abstractComponentCallbacksC0567t.f7545w == null || J(abstractComponentCallbacksC0567t.f7548z));
    }

    public static boolean K(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (abstractComponentCallbacksC0567t == null) {
            return true;
        }
        C0542J c0542j = abstractComponentCallbacksC0567t.f7545w;
        return abstractComponentCallbacksC0567t.equals(c0542j.f7350x) && K(c0542j.f7349w);
    }

    public static void a0(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0567t);
        }
        if (abstractComponentCallbacksC0567t.f7507D) {
            abstractComponentCallbacksC0567t.f7507D = false;
            abstractComponentCallbacksC0567t.f7516N = !abstractComponentCallbacksC0567t.f7516N;
        }
    }

    public final int A(String str, int i, boolean z4) {
        ArrayList arrayList = this.f7332d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z4) {
                return 0;
            }
            return this.f7332d.size() - 1;
        }
        int size = this.f7332d.size() - 1;
        while (size >= 0) {
            C0549a c0549a = (C0549a) this.f7332d.get(size);
            if ((str != null && str.equals(c0549a.i)) || (i >= 0 && i == c0549a.f7430s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z4) {
            if (size == this.f7332d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0549a c0549a2 = (C0549a) this.f7332d.get(size - 1);
            if ((str == null || !str.equals(c0549a2.i)) && (i < 0 || i != c0549a2.f7430s)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final AbstractComponentCallbacksC0567t B(int i) {
        S0.n nVar = this.f7331c;
        ArrayList arrayList = (ArrayList) nVar.f2872a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) arrayList.get(size);
            if (abstractComponentCallbacksC0567t != null && abstractComponentCallbacksC0567t.f7504A == i) {
                return abstractComponentCallbacksC0567t;
            }
        }
        for (C0548P c0548p : ((HashMap) nVar.f2873b).values()) {
            if (c0548p != null) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = c0548p.f7385c;
                if (abstractComponentCallbacksC0567t2.f7504A == i) {
                    return abstractComponentCallbacksC0567t2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0567t C(String str) {
        S0.n nVar = this.f7331c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) nVar.f2872a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) arrayList.get(size);
                if (abstractComponentCallbacksC0567t != null && str.equals(abstractComponentCallbacksC0567t.f7506C)) {
                    return abstractComponentCallbacksC0567t;
                }
            }
        }
        if (str != null) {
            for (C0548P c0548p : ((HashMap) nVar.f2873b).values()) {
                if (c0548p != null) {
                    AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = c0548p.f7385c;
                    if (str.equals(abstractComponentCallbacksC0567t2.f7506C)) {
                        return abstractComponentCallbacksC0567t2;
                    }
                }
            }
        } else {
            nVar.getClass();
        }
        return null;
    }

    public final ViewGroup D(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        ViewGroup viewGroup = abstractComponentCallbacksC0567t.f7511I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0567t.f7505B > 0 && this.f7348v.Z()) {
            View viewY = this.f7348v.Y(abstractComponentCallbacksC0567t.f7505B);
            if (viewY instanceof ViewGroup) {
                return (ViewGroup) viewY;
            }
        }
        return null;
    }

    public final C0536D E() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7349w;
        return abstractComponentCallbacksC0567t != null ? abstractComponentCallbacksC0567t.f7545w.E() : this.f7351y;
    }

    public final J3.c F() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7349w;
        return abstractComponentCallbacksC0567t != null ? abstractComponentCallbacksC0567t.f7545w.F() : this.f7352z;
    }

    public final void G(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0567t);
        }
        if (abstractComponentCallbacksC0567t.f7507D) {
            return;
        }
        abstractComponentCallbacksC0567t.f7507D = true;
        abstractComponentCallbacksC0567t.f7516N = true ^ abstractComponentCallbacksC0567t.f7516N;
        Z(abstractComponentCallbacksC0567t);
    }

    public final boolean I() {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7349w;
        if (abstractComponentCallbacksC0567t == null) {
            return true;
        }
        return abstractComponentCallbacksC0567t.w() && this.f7349w.p().I();
    }

    public final boolean L() {
        return this.f7321F || this.G;
    }

    public final void M(int i, boolean z4) {
        HashMap map;
        C0569v c0569v;
        if (this.f7347u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i != this.f7346t) {
            this.f7346t = i;
            S0.n nVar = this.f7331c;
            Iterator it = ((ArrayList) nVar.f2872a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) nVar.f2873b;
                if (!zHasNext) {
                    break;
                }
                C0548P c0548p = (C0548P) map.get(((AbstractComponentCallbacksC0567t) it.next()).f7531e);
                if (c0548p != null) {
                    c0548p.k();
                }
            }
            for (C0548P c0548p2 : map.values()) {
                if (c0548p2 != null) {
                    c0548p2.k();
                    AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p2.f7385c;
                    if (abstractComponentCallbacksC0567t.f7538p && !abstractComponentCallbacksC0567t.y()) {
                        if (abstractComponentCallbacksC0567t.f7539q && !((HashMap) nVar.f2874c).containsKey(abstractComponentCallbacksC0567t.f7531e)) {
                            nVar.r(c0548p2.o(), abstractComponentCallbacksC0567t.f7531e);
                        }
                        nVar.l(c0548p2);
                    }
                }
            }
            b0();
            if (this.f7320E && (c0569v = this.f7347u) != null && this.f7346t == 7) {
                c0569v.f7555e.invalidateOptionsMenu();
                this.f7320E = false;
            }
        }
    }

    public final void N() {
        if (this.f7347u == null) {
            return;
        }
        this.f7321F = false;
        this.G = false;
        this.f7327M.f7368f = false;
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                abstractComponentCallbacksC0567t.f7547y.N();
            }
        }
    }

    public final boolean O() {
        return P(-1, 0);
    }

    public final boolean P(int i, int i5) {
        x(false);
        w(true);
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7350x;
        if (abstractComponentCallbacksC0567t != null && i < 0 && abstractComponentCallbacksC0567t.m().O()) {
            return true;
        }
        boolean zQ = Q(this.f7324J, this.f7325K, null, i, i5);
        if (zQ) {
            this.f7330b = true;
            try {
                S(this.f7324J, this.f7325K);
            } finally {
                d();
            }
        }
        d0();
        if (this.f7323I) {
            this.f7323I = false;
            b0();
        }
        ((HashMap) this.f7331c.f2873b).values().removeAll(Collections.singleton(null));
        return zQ;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i5) {
        int iA = A(str, i, (i5 & 1) != 0);
        if (iA < 0) {
            return false;
        }
        for (int size = this.f7332d.size() - 1; size >= iA; size--) {
            arrayList.add((C0549a) this.f7332d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0567t + " nesting=" + abstractComponentCallbacksC0567t.f7544v);
        }
        boolean zY = abstractComponentCallbacksC0567t.y();
        if (abstractComponentCallbacksC0567t.f7508E && zY) {
            return;
        }
        S0.n nVar = this.f7331c;
        synchronized (((ArrayList) nVar.f2872a)) {
            ((ArrayList) nVar.f2872a).remove(abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.f7537o = false;
        if (H(abstractComponentCallbacksC0567t)) {
            this.f7320E = true;
        }
        abstractComponentCallbacksC0567t.f7538p = true;
        Z(abstractComponentCallbacksC0567t);
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (i < size) {
            if (!((C0549a) arrayList.get(i)).f7427p) {
                if (i5 != i) {
                    z(arrayList, arrayList2, i5, i);
                }
                i5 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0549a) arrayList.get(i5)).f7427p) {
                        i5++;
                    }
                }
                z(arrayList, arrayList2, i, i5);
                i = i5 - 1;
            }
            i++;
        }
        if (i5 != size) {
            z(arrayList, arrayList2, i5, size);
        }
    }

    public final void T(Bundle bundle) {
        S0.e eVar;
        C0548P c0548p;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f7347u.f7552b.getClassLoader());
                this.f7337k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f7347u.f7552b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        S0.n nVar = this.f7331c;
        HashMap map2 = (HashMap) nVar.f2874c;
        map2.clear();
        map2.putAll(map);
        C0543K c0543k = (C0543K) bundle.getParcelable("state");
        if (c0543k == null) {
            return;
        }
        HashMap map3 = (HashMap) nVar.f2873b;
        map3.clear();
        Iterator it = c0543k.f7353a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = this.f7339m;
            if (!zHasNext) {
                break;
            }
            Bundle bundleR = nVar.r(null, (String) it.next());
            if (bundleR != null) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) this.f7327M.f7363a.get(((C0547O) bundleR.getParcelable("state")).f7370b);
                if (abstractComponentCallbacksC0567t != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0567t);
                    }
                    c0548p = new C0548P(eVar, nVar, abstractComponentCallbacksC0567t, bundleR);
                } else {
                    c0548p = new C0548P(this.f7339m, this.f7331c, this.f7347u.f7552b.getClassLoader(), E(), bundleR);
                }
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = c0548p.f7385c;
                abstractComponentCallbacksC0567t2.f7528b = bundleR;
                abstractComponentCallbacksC0567t2.f7545w = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0567t2.f7531e + "): " + abstractComponentCallbacksC0567t2);
                }
                c0548p.m(this.f7347u.f7552b.getClassLoader());
                nVar.k(c0548p);
                c0548p.f7387e = this.f7346t;
            }
        }
        C0545M c0545m = this.f7327M;
        c0545m.getClass();
        Iterator it2 = new ArrayList(c0545m.f7363a.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = (AbstractComponentCallbacksC0567t) it2.next();
            if (map3.get(abstractComponentCallbacksC0567t3.f7531e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0567t3 + " that was not found in the set of active Fragments " + c0543k.f7353a);
                }
                this.f7327M.e(abstractComponentCallbacksC0567t3);
                abstractComponentCallbacksC0567t3.f7545w = this;
                C0548P c0548p2 = new C0548P(eVar, nVar, abstractComponentCallbacksC0567t3);
                c0548p2.f7387e = 1;
                c0548p2.k();
                abstractComponentCallbacksC0567t3.f7538p = true;
                c0548p2.k();
            }
        }
        ArrayList<String> arrayList = c0543k.f7354b;
        ((ArrayList) nVar.f2872a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tD = nVar.d(str3);
                if (abstractComponentCallbacksC0567tD == null) {
                    throw new IllegalStateException(B.a.l("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0567tD);
                }
                nVar.a(abstractComponentCallbacksC0567tD);
            }
        }
        if (c0543k.f7355c != null) {
            this.f7332d = new ArrayList(c0543k.f7355c.length);
            int i = 0;
            while (true) {
                C0550b[] c0550bArr = c0543k.f7355c;
                if (i >= c0550bArr.length) {
                    break;
                }
                C0550b c0550b = c0550bArr[i];
                c0550b.getClass();
                C0549a c0549a = new C0549a(this);
                c0550b.b(c0549a);
                c0549a.f7430s = c0550b.f7438k;
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = c0550b.f7433b;
                    if (i5 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i5);
                    if (str4 != null) {
                        ((Q) c0549a.f7414a.get(i5)).f7389b = nVar.d(str4);
                    }
                    i5++;
                }
                c0549a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbN = B.a.n("restoreAllState: back stack #", i, " (index ");
                    sbN.append(c0549a.f7430s);
                    sbN.append("): ");
                    sbN.append(c0549a);
                    Log.v("FragmentManager", sbN.toString());
                    PrintWriter printWriter = new PrintWriter(new T());
                    c0549a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f7332d.add(c0549a);
                i++;
            }
        } else {
            this.f7332d = null;
        }
        this.i.set(c0543k.f7356d);
        String str5 = c0543k.f7357e;
        if (str5 != null) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tD2 = nVar.d(str5);
            this.f7350x = abstractComponentCallbacksC0567tD2;
            q(abstractComponentCallbacksC0567tD2);
        }
        ArrayList arrayList3 = c0543k.f7358f;
        if (arrayList3 != null) {
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                this.f7336j.put((String) arrayList3.get(i6), (C0551c) c0543k.f7359k.get(i6));
            }
        }
        this.f7319D = new ArrayDeque(c0543k.f7360l);
    }

    public final Bundle U() {
        int i;
        ArrayList arrayList;
        C0550b[] c0550bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0556h c0556h = (C0556h) it.next();
            if (c0556h.f7464e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0556h.f7464e = false;
                c0556h.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0556h) it2.next()).f();
        }
        x(true);
        this.f7321F = true;
        this.f7327M.f7368f = true;
        S0.n nVar = this.f7331c;
        nVar.getClass();
        HashMap map = (HashMap) nVar.f2873b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0548P c0548p : map.values()) {
            if (c0548p != null) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
                nVar.r(c0548p.o(), abstractComponentCallbacksC0567t.f7531e);
                arrayList2.add(abstractComponentCallbacksC0567t.f7531e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0567t + ": " + abstractComponentCallbacksC0567t.f7528b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f7331c.f2874c;
        if (!map2.isEmpty()) {
            S0.n nVar2 = this.f7331c;
            synchronized (((ArrayList) nVar2.f2872a)) {
                try {
                    if (((ArrayList) nVar2.f2872a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) nVar2.f2872a).size());
                        Iterator it3 = ((ArrayList) nVar2.f2872a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) it3.next();
                            arrayList.add(abstractComponentCallbacksC0567t2.f7531e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0567t2.f7531e + "): " + abstractComponentCallbacksC0567t2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f7332d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0550bArr = null;
            } else {
                c0550bArr = new C0550b[size];
                for (i = 0; i < size; i++) {
                    c0550bArr[i] = new C0550b((C0549a) this.f7332d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbN = B.a.n("saveAllState: adding back stack #", i, ": ");
                        sbN.append(this.f7332d.get(i));
                        Log.v("FragmentManager", sbN.toString());
                    }
                }
            }
            C0543K c0543k = new C0543K();
            c0543k.f7357e = null;
            ArrayList arrayList4 = new ArrayList();
            c0543k.f7358f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c0543k.f7359k = arrayList5;
            c0543k.f7353a = arrayList2;
            c0543k.f7354b = arrayList;
            c0543k.f7355c = c0550bArr;
            c0543k.f7356d = this.i.get();
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = this.f7350x;
            if (abstractComponentCallbacksC0567t3 != null) {
                c0543k.f7357e = abstractComponentCallbacksC0567t3.f7531e;
            }
            arrayList4.addAll(this.f7336j.keySet());
            arrayList5.addAll(this.f7336j.values());
            c0543k.f7360l = new ArrayList(this.f7319D);
            bundle.putParcelable("state", c0543k);
            for (String str : this.f7337k.keySet()) {
                bundle.putBundle(AbstractC0854a.b("result_", str), (Bundle) this.f7337k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC0854a.b("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void V() {
        synchronized (this.f7329a) {
            try {
                if (this.f7329a.size() == 1) {
                    this.f7347u.f7553c.removeCallbacks(this.f7328N);
                    this.f7347u.f7553c.post(this.f7328N);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, boolean z4) {
        ViewGroup viewGroupD = D(abstractComponentCallbacksC0567t);
        if (viewGroupD == null || !(viewGroupD instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD).setDrawDisappearingViewsLast(!z4);
    }

    public final void X(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, EnumC0236o enumC0236o) {
        if (abstractComponentCallbacksC0567t.equals(this.f7331c.d(abstractComponentCallbacksC0567t.f7531e)) && (abstractComponentCallbacksC0567t.f7546x == null || abstractComponentCallbacksC0567t.f7545w == this)) {
            abstractComponentCallbacksC0567t.f7519Q = enumC0236o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0567t + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (abstractComponentCallbacksC0567t != null) {
            if (!abstractComponentCallbacksC0567t.equals(this.f7331c.d(abstractComponentCallbacksC0567t.f7531e)) || (abstractComponentCallbacksC0567t.f7546x != null && abstractComponentCallbacksC0567t.f7545w != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0567t + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = this.f7350x;
        this.f7350x = abstractComponentCallbacksC0567t;
        q(abstractComponentCallbacksC0567t2);
        q(this.f7350x);
    }

    public final void Z(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        ViewGroup viewGroupD = D(abstractComponentCallbacksC0567t);
        if (viewGroupD != null) {
            r rVar = abstractComponentCallbacksC0567t.f7515M;
            if ((rVar == null ? 0 : rVar.f7498e) + (rVar == null ? 0 : rVar.f7497d) + (rVar == null ? 0 : rVar.f7496c) + (rVar == null ? 0 : rVar.f7495b) > 0) {
                if (viewGroupD.getTag(2131231340) == null) {
                    viewGroupD.setTag(2131231340, abstractComponentCallbacksC0567t);
                }
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) viewGroupD.getTag(2131231340);
                r rVar2 = abstractComponentCallbacksC0567t.f7515M;
                boolean z4 = rVar2 != null ? rVar2.f7494a : false;
                if (abstractComponentCallbacksC0567t2.f7515M == null) {
                    return;
                }
                abstractComponentCallbacksC0567t2.k().f7494a = z4;
            }
        }
    }

    public final C0548P a(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        String str = abstractComponentCallbacksC0567t.f7518P;
        if (str != null) {
            h0.d.c(abstractComponentCallbacksC0567t, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0567t);
        }
        C0548P c0548pF = f(abstractComponentCallbacksC0567t);
        abstractComponentCallbacksC0567t.f7545w = this;
        S0.n nVar = this.f7331c;
        nVar.k(c0548pF);
        if (!abstractComponentCallbacksC0567t.f7508E) {
            nVar.a(abstractComponentCallbacksC0567t);
            abstractComponentCallbacksC0567t.f7538p = false;
            if (abstractComponentCallbacksC0567t.f7512J == null) {
                abstractComponentCallbacksC0567t.f7516N = false;
            }
            if (H(abstractComponentCallbacksC0567t)) {
                this.f7320E = true;
            }
        }
        return c0548pF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0569v c0569v, AbstractC0183a abstractC0183a, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (this.f7347u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f7347u = c0569v;
        this.f7348v = abstractC0183a;
        this.f7349w = abstractComponentCallbacksC0567t;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7340n;
        if (abstractComponentCallbacksC0567t != 0) {
            copyOnWriteArrayList.add(new C0537E(abstractComponentCallbacksC0567t));
        } else if (c0569v != null) {
            copyOnWriteArrayList.add(c0569v);
        }
        if (this.f7349w != null) {
            d0();
        }
        if (c0569v != null) {
            b.x xVarI = c0569v.f7555e.i();
            this.f7335g = xVarI;
            xVarI.a(abstractComponentCallbacksC0567t != 0 ? abstractComponentCallbacksC0567t : c0569v, this.h);
        }
        if (abstractComponentCallbacksC0567t != 0) {
            C0545M c0545m = abstractComponentCallbacksC0567t.f7545w.f7327M;
            HashMap map = c0545m.f7364b;
            C0545M c0545m2 = (C0545M) map.get(abstractComponentCallbacksC0567t.f7531e);
            if (c0545m2 == null) {
                c0545m2 = new C0545M(c0545m.f7366d);
                map.put(abstractComponentCallbacksC0567t.f7531e, c0545m2);
            }
            this.f7327M = c0545m2;
        } else if (c0569v != null) {
            this.f7327M = (C0545M) new l0(c0569v.f7555e.e(), C0545M.f7362g).a(C0545M.class);
        } else {
            this.f7327M = new C0545M(false);
        }
        this.f7327M.f7368f = L();
        this.f7331c.f2875d = this.f7327M;
        C0569v c0569v2 = this.f7347u;
        if (c0569v2 != null && abstractComponentCallbacksC0567t == 0) {
            C0708q c0708qB = c0569v2.b();
            c0708qB.f("android:support:fragments", new androidx.lifecycle.W(this, 1));
            Bundle bundleC = c0708qB.c("android:support:fragments");
            if (bundleC != null) {
                T(bundleC);
            }
        }
        C0569v c0569v3 = this.f7347u;
        if (c0569v3 != null) {
            AbstractActivityC0570w abstractActivityC0570w = c0569v3.f7555e;
            String strB = AbstractC0854a.b("FragmentManager:", abstractComponentCallbacksC0567t != 0 ? B.a.m(new StringBuilder(), abstractComponentCallbacksC0567t.f7531e, ":") : "");
            String strK = B.a.k(strB, "StartActivityForResult");
            C0447a c0447a = new C0447a(2);
            g1.i iVar = new g1.i(this, 18);
            C0250g c0250g = abstractActivityC0570w.f4912o;
            this.f7316A = c0250g.c(strK, c0447a, iVar);
            this.f7317B = c0250g.c(B.a.k(strB, "StartIntentSenderForResult"), new C0447a(3), new h1.i(this, 16));
            this.f7318C = c0250g.c(B.a.k(strB, "RequestPermissions"), new C0447a(0), new K2.c(this, 20));
        }
        C0569v c0569v4 = this.f7347u;
        if (c0569v4 != null) {
            c0569v4.f7555e.d(this.f7341o);
        }
        C0569v c0569v5 = this.f7347u;
        if (c0569v5 != null) {
            c0569v5.f7555e.f4914q.add(this.f7342p);
        }
        C0569v c0569v6 = this.f7347u;
        if (c0569v6 != null) {
            c0569v6.f7555e.f4916s.add(this.f7343q);
        }
        C0569v c0569v7 = this.f7347u;
        if (c0569v7 != null) {
            c0569v7.f7555e.f4917t.add(this.f7344r);
        }
        C0569v c0569v8 = this.f7347u;
        if (c0569v8 == null || abstractComponentCallbacksC0567t != 0) {
            return;
        }
        AbstractActivityC0570w abstractActivityC0570w2 = c0569v8.f7555e;
        C c5 = this.f7345s;
        C0009i c0009i = abstractActivityC0570w2.f4904c;
        ((CopyOnWriteArrayList) c0009i.f205c).add(c5);
        ((Runnable) c0009i.f204b).run();
    }

    public final void b0() {
        Iterator it = this.f7331c.f().iterator();
        while (it.hasNext()) {
            C0548P c0548p = (C0548P) it.next();
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
            if (abstractComponentCallbacksC0567t.f7513K) {
                if (this.f7330b) {
                    this.f7323I = true;
                } else {
                    abstractComponentCallbacksC0567t.f7513K = false;
                    c0548p.k();
                }
            }
        }
    }

    public final void c(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0567t);
        }
        if (abstractComponentCallbacksC0567t.f7508E) {
            abstractComponentCallbacksC0567t.f7508E = false;
            if (abstractComponentCallbacksC0567t.f7537o) {
                return;
            }
            this.f7331c.a(abstractComponentCallbacksC0567t);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0567t);
            }
            if (H(abstractComponentCallbacksC0567t)) {
                this.f7320E = true;
            }
        }
    }

    public final void c0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new T());
        C0569v c0569v = this.f7347u;
        if (c0569v == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw runtimeException;
            }
        }
        try {
            c0569v.f7555e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw runtimeException;
        }
    }

    public final void d() {
        this.f7330b = false;
        this.f7325K.clear();
        this.f7324J.clear();
    }

    public final void d0() {
        synchronized (this.f7329a) {
            try {
                if (!this.f7329a.isEmpty()) {
                    C0535B c0535b = this.h;
                    c0535b.f4920a = true;
                    c4.a aVar = c0535b.f4922c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return;
                }
                C0535B c0535b2 = this.h;
                ArrayList arrayList = this.f7332d;
                c0535b2.f4920a = (arrayList != null ? arrayList.size() : 0) > 0 && K(this.f7349w);
                c4.a aVar2 = c0535b2.f4922c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        C0556h c0556h;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7331c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0548P) it.next()).f7385c.f7511I;
            if (viewGroup != null) {
                J3.c factory = F();
                kotlin.jvm.internal.i.e(factory, "factory");
                Object tag = viewGroup.getTag(2131231183);
                if (tag instanceof C0556h) {
                    c0556h = (C0556h) tag;
                } else {
                    c0556h = new C0556h(viewGroup);
                    viewGroup.setTag(2131231183, c0556h);
                }
                hashSet.add(c0556h);
            }
        }
        return hashSet;
    }

    public final C0548P f(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        String str = abstractComponentCallbacksC0567t.f7531e;
        S0.n nVar = this.f7331c;
        C0548P c0548p = (C0548P) ((HashMap) nVar.f2873b).get(str);
        if (c0548p != null) {
            return c0548p;
        }
        C0548P c0548p2 = new C0548P(this.f7339m, nVar, abstractComponentCallbacksC0567t);
        c0548p2.m(this.f7347u.f7552b.getClassLoader());
        c0548p2.f7387e = this.f7346t;
        return c0548p2;
    }

    public final void g(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0567t);
        }
        if (abstractComponentCallbacksC0567t.f7508E) {
            return;
        }
        abstractComponentCallbacksC0567t.f7508E = true;
        if (abstractComponentCallbacksC0567t.f7537o) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0567t);
            }
            S0.n nVar = this.f7331c;
            synchronized (((ArrayList) nVar.f2872a)) {
                ((ArrayList) nVar.f2872a).remove(abstractComponentCallbacksC0567t);
            }
            abstractComponentCallbacksC0567t.f7537o = false;
            if (H(abstractComponentCallbacksC0567t)) {
                this.f7320E = true;
            }
            Z(abstractComponentCallbacksC0567t);
        }
    }

    public final void h(boolean z4) {
        if (z4 && this.f7347u != null) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                abstractComponentCallbacksC0567t.f7510H = true;
                if (z4) {
                    abstractComponentCallbacksC0567t.f7547y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f7346t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                if (!abstractComponentCallbacksC0567t.f7507D ? abstractComponentCallbacksC0567t.f7547y.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f7346t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null && J(abstractComponentCallbacksC0567t)) {
                if (!abstractComponentCallbacksC0567t.f7507D ? abstractComponentCallbacksC0567t.f7547y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0567t);
                    z4 = true;
                }
            }
        }
        if (this.f7333e != null) {
            for (int i = 0; i < this.f7333e.size(); i++) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) this.f7333e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0567t2)) {
                    abstractComponentCallbacksC0567t2.getClass();
                }
            }
        }
        this.f7333e = arrayList;
        return z4;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f7322H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0556h) it.next()).f();
        }
        C0569v c0569v = this.f7347u;
        S0.n nVar = this.f7331c;
        if (c0569v != null) {
            zIsChangingConfigurations = ((C0545M) nVar.f2875d).f7367e;
        } else {
            AbstractActivityC0570w abstractActivityC0570w = c0569v.f7552b;
            if (abstractActivityC0570w != null) {
                zIsChangingConfigurations = true ^ abstractActivityC0570w.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f7336j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C0551c) it2.next()).f7446a.iterator();
                while (it3.hasNext()) {
                    ((C0545M) nVar.f2875d).c((String) it3.next(), false);
                }
            }
        }
        t(-1);
        C0569v c0569v2 = this.f7347u;
        if (c0569v2 != null) {
            AbstractActivityC0570w abstractActivityC0570w2 = c0569v2.f7555e;
            abstractActivityC0570w2.f4914q.remove(this.f7342p);
        }
        C0569v c0569v3 = this.f7347u;
        if (c0569v3 != null) {
            AbstractActivityC0570w abstractActivityC0570w3 = c0569v3.f7555e;
            abstractActivityC0570w3.f4913p.remove(this.f7341o);
        }
        C0569v c0569v4 = this.f7347u;
        if (c0569v4 != null) {
            AbstractActivityC0570w abstractActivityC0570w4 = c0569v4.f7555e;
            abstractActivityC0570w4.f4916s.remove(this.f7343q);
        }
        C0569v c0569v5 = this.f7347u;
        if (c0569v5 != null) {
            AbstractActivityC0570w abstractActivityC0570w5 = c0569v5.f7555e;
            abstractActivityC0570w5.f4917t.remove(this.f7344r);
        }
        C0569v c0569v6 = this.f7347u;
        if (c0569v6 != null && this.f7349w == null) {
            AbstractActivityC0570w abstractActivityC0570w6 = c0569v6.f7555e;
            C c5 = this.f7345s;
            C0009i c0009i = abstractActivityC0570w6.f4904c;
            ((CopyOnWriteArrayList) c0009i.f205c).remove(c5);
            if (((HashMap) c0009i.f206d).remove(c5) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0009i.f204b).run();
        }
        this.f7347u = null;
        this.f7348v = null;
        this.f7349w = null;
        if (this.f7335g != null) {
            Iterator it4 = this.h.f4921b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0246c) it4.next()).cancel();
            }
            this.f7335g = null;
        }
        d.e eVar = this.f7316A;
        if (eVar != null) {
            eVar.b();
            this.f7317B.b();
            this.f7318C.b();
        }
    }

    public final void l(boolean z4) {
        if (z4 && this.f7347u != null) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                abstractComponentCallbacksC0567t.f7510H = true;
                if (z4) {
                    abstractComponentCallbacksC0567t.f7547y.l(true);
                }
            }
        }
    }

    public final void m(boolean z4, boolean z5) {
        if (z5 && this.f7347u != null) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null && z5) {
                abstractComponentCallbacksC0567t.f7547y.m(z4, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f7331c.g().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = (AbstractComponentCallbacksC0567t) it.next();
            if (abstractComponentCallbacksC0567t != null) {
                abstractComponentCallbacksC0567t.x();
                abstractComponentCallbacksC0567t.f7547y.n();
            }
        }
    }

    public final boolean o() {
        if (this.f7346t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                if (!abstractComponentCallbacksC0567t.f7507D ? abstractComponentCallbacksC0567t.f7547y.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f7346t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null && !abstractComponentCallbacksC0567t.f7507D) {
                abstractComponentCallbacksC0567t.f7547y.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (abstractComponentCallbacksC0567t != null) {
            if (abstractComponentCallbacksC0567t.equals(this.f7331c.d(abstractComponentCallbacksC0567t.f7531e))) {
                abstractComponentCallbacksC0567t.f7545w.getClass();
                boolean zK = K(abstractComponentCallbacksC0567t);
                Boolean bool = abstractComponentCallbacksC0567t.f7536n;
                if (bool == null || bool.booleanValue() != zK) {
                    abstractComponentCallbacksC0567t.f7536n = Boolean.valueOf(zK);
                    C0542J c0542j = abstractComponentCallbacksC0567t.f7547y;
                    c0542j.d0();
                    c0542j.q(c0542j.f7350x);
                }
            }
        }
    }

    public final void r(boolean z4, boolean z5) {
        if (z5 && this.f7347u != null) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null && z5) {
                abstractComponentCallbacksC0567t.f7547y.r(z4, true);
            }
        }
    }

    public final boolean s() {
        if (this.f7346t < 1) {
            return false;
        }
        boolean z4 = false;
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : this.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null && J(abstractComponentCallbacksC0567t)) {
                if (!abstractComponentCallbacksC0567t.f7507D ? abstractComponentCallbacksC0567t.f7547y.s() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void t(int i) {
        try {
            this.f7330b = true;
            for (C0548P c0548p : ((HashMap) this.f7331c.f2873b).values()) {
                if (c0548p != null) {
                    c0548p.f7387e = i;
                }
            }
            M(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0556h) it.next()).f();
            }
            this.f7330b = false;
            x(true);
        } catch (Throwable th) {
            this.f7330b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = this.f7349w;
        if (abstractComponentCallbacksC0567t != null) {
            sb.append(abstractComponentCallbacksC0567t.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f7349w)));
            sb.append("}");
        } else {
            C0569v c0569v = this.f7347u;
            if (c0569v != null) {
                sb.append(c0569v.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f7347u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strK = B.a.k(str, "    ");
        S0.n nVar = this.f7331c;
        nVar.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) nVar.f2873b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0548P c0548p : map.values()) {
                printWriter.print(str);
                if (c0548p != null) {
                    AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
                    printWriter.println(abstractComponentCallbacksC0567t);
                    abstractComponentCallbacksC0567t.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) nVar.f2872a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t2 = (AbstractComponentCallbacksC0567t) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0567t2.toString());
            }
        }
        ArrayList arrayList2 = this.f7333e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t3 = (AbstractComponentCallbacksC0567t) this.f7333e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0567t3.toString());
            }
        }
        ArrayList arrayList3 = this.f7332d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                C0549a c0549a = (C0549a) this.f7332d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0549a.toString());
                c0549a.f(strK, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f7329a) {
            try {
                int size4 = this.f7329a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (InterfaceC0539G) this.f7329a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7347u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7348v);
        if (this.f7349w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7349w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7346t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7321F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7322H);
        if (this.f7320E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7320E);
        }
    }

    public final void v(InterfaceC0539G interfaceC0539G, boolean z4) {
        if (!z4) {
            if (this.f7347u == null) {
                if (!this.f7322H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f7329a) {
            try {
                if (this.f7347u == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f7329a.add(interfaceC0539G);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z4) {
        if (this.f7330b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f7347u == null) {
            if (!this.f7322H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f7347u.f7553c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && L()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f7324J == null) {
            this.f7324J = new ArrayList();
            this.f7325K = new ArrayList();
        }
    }

    public final boolean x(boolean z4) {
        boolean zA;
        w(z4);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f7324J;
            ArrayList arrayList2 = this.f7325K;
            synchronized (this.f7329a) {
                if (this.f7329a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f7329a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((InterfaceC0539G) this.f7329a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z5 = true;
            this.f7330b = true;
            try {
                S(this.f7324J, this.f7325K);
            } finally {
                d();
            }
        }
        d0();
        if (this.f7323I) {
            this.f7323I = false;
            b0();
        }
        ((HashMap) this.f7331c.f2873b).values().removeAll(Collections.singleton(null));
        return z5;
    }

    public final void y(C0549a c0549a, boolean z4) {
        if (z4 && (this.f7347u == null || this.f7322H)) {
            return;
        }
        w(z4);
        c0549a.a(this.f7324J, this.f7325K);
        this.f7330b = true;
        try {
            S(this.f7324J, this.f7325K);
            d();
            d0();
            if (this.f7323I) {
                this.f7323I = false;
                b0();
            }
            ((HashMap) this.f7331c.f2873b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x022e A[PHI: r14
  0x022e: PHI (r14v23 int) = (r14v22 int), (r14v24 int) binds: [B:107:0x021e, B:112:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0542J.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
