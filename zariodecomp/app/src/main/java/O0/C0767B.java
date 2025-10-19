package o0;

import N2.AbstractC0156x;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0236o;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.m0;
import g0.C0535B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o0.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\B.smali */
public final class C0767B {

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f8976A;

    /* renamed from: B, reason: collision with root package name */
    public final K3.h f8977B;

    /* renamed from: C, reason: collision with root package name */
    public final i4.B f8978C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8979a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f8980b;

    /* renamed from: c, reason: collision with root package name */
    public z f8981c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f8982d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f8983e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8984f;

    /* renamed from: g, reason: collision with root package name */
    public final L3.h f8985g;
    public final i4.I h;
    public final i4.I i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f8986j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f8987k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f8988l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8989m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0241v f8990n;

    /* renamed from: o, reason: collision with root package name */
    public r f8991o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f8992p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0236o f8993q;

    /* renamed from: r, reason: collision with root package name */
    public final C0789l f8994r;

    /* renamed from: s, reason: collision with root package name */
    public final C0535B f8995s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8996t;

    /* renamed from: u, reason: collision with root package name */
    public final O f8997u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f8998v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.j f8999w;

    /* renamed from: x, reason: collision with root package name */
    public C0791n f9000x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f9001y;

    /* renamed from: z, reason: collision with root package name */
    public int f9002z;

    public C0767B(Context context) {
        Object next;
        this.f8979a = context;
        Iterator it = d4.g.l0(context, C0779b.f9044c).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f8980b = (Activity) next;
        this.f8985g = new L3.h();
        L3.s sVar = L3.s.f2351a;
        this.h = i4.C.b(sVar);
        this.i = i4.C.b(sVar);
        this.f8986j = new LinkedHashMap();
        this.f8987k = new LinkedHashMap();
        this.f8988l = new LinkedHashMap();
        this.f8989m = new LinkedHashMap();
        this.f8992p = new CopyOnWriteArrayList();
        this.f8993q = EnumC0236o.f4659b;
        this.f8994r = new C0789l(this, 0);
        this.f8995s = new C0535B(this, 3);
        this.f8996t = true;
        O o5 = new O();
        this.f8997u = o5;
        this.f8998v = new LinkedHashMap();
        this.f9001y = new LinkedHashMap();
        o5.a(new C0766A(o5));
        o5.a(new C0780c(this.f8979a));
        this.f8976A = new ArrayList();
        this.f8977B = S0.f.P(new O0.g(this, 16));
        this.f8978C = i4.C.a(1, 0, h4.a.f7767b);
    }

    public static /* synthetic */ void l(C0767B c0767b, C0787j c0787j) {
        c0767b.k(c0787j, false, new L3.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [L3.e, L3.h, java.util.AbstractList, java.util.Collection] */
    public final void a(x xVar, Bundle bundle, C0787j c0787j, List list) {
        Object obj;
        Object objPrevious;
        Object objPrevious2;
        x xVar2 = c0787j.f9069b;
        boolean z4 = xVar2 instanceof InterfaceC0781d;
        L3.h hVar = this.f8985g;
        if (!z4) {
            while (!hVar.isEmpty() && (((C0787j) hVar.last()).f9069b instanceof InterfaceC0781d) && j(((C0787j) hVar.last()).f9069b.f9147l, true, false)) {
            }
        }
        ?? hVar2 = new L3.h();
        boolean z5 = xVar instanceof z;
        Context context = this.f8979a;
        if (z5) {
            x xVar3 = xVar2;
            do {
                kotlin.jvm.internal.i.b(xVar3);
                xVar3 = xVar3.f9141b;
                if (xVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (kotlin.jvm.internal.i.a(((C0787j) objPrevious2).f9069b, xVar3)) {
                                break;
                            }
                        }
                    }
                    C0787j c0787jA = (C0787j) objPrevious2;
                    if (c0787jA == null) {
                        c0787jA = J3.c.a(context, xVar3, bundle, f(), this.f8991o);
                    }
                    hVar2.addFirst(c0787jA);
                    if (!hVar.isEmpty() && ((C0787j) hVar.last()).f9069b == xVar3) {
                        l(this, (C0787j) hVar.last());
                    }
                }
                if (xVar3 == null) {
                    break;
                }
            } while (xVar3 != xVar);
        }
        x xVar4 = hVar2.isEmpty() ? xVar2 : ((C0787j) hVar2.first()).f9069b;
        while (xVar4 != null && c(xVar4.f9147l) != xVar4) {
            xVar4 = xVar4.f9141b;
            if (xVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        if (kotlin.jvm.internal.i.a(((C0787j) objPrevious).f9069b, xVar4)) {
                            break;
                        }
                    }
                }
                C0787j c0787jA2 = (C0787j) objPrevious;
                if (c0787jA2 == null) {
                    c0787jA2 = J3.c.a(context, xVar4, xVar4.g(bundle2), f(), this.f8991o);
                }
                hVar2.addFirst(c0787jA2);
            }
        }
        if (!hVar2.isEmpty()) {
            xVar2 = ((C0787j) hVar2.first()).f9069b;
        }
        while (!hVar.isEmpty() && (((C0787j) hVar.last()).f9069b instanceof z)) {
            x xVar5 = ((C0787j) hVar.last()).f9069b;
            kotlin.jvm.internal.i.c(xVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((z) xVar5).l(xVar2.f9147l, false) != null) {
                break;
            } else {
                l(this, (C0787j) hVar.last());
            }
        }
        C0787j c0787j2 = (C0787j) (hVar.isEmpty() ? null : hVar.f2346b[hVar.f2345a]);
        if (c0787j2 == null) {
            c0787j2 = (C0787j) (hVar2.isEmpty() ? null : hVar2.f2346b[hVar2.f2345a]);
        }
        if (!kotlin.jvm.internal.i.a(c0787j2 != null ? c0787j2.f9069b : null, this.f8981c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    obj = null;
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                x xVar6 = ((C0787j) objPrevious3).f9069b;
                z zVar = this.f8981c;
                kotlin.jvm.internal.i.b(zVar);
                if (kotlin.jvm.internal.i.a(xVar6, zVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C0787j c0787jA3 = (C0787j) obj;
            if (c0787jA3 == null) {
                z zVar2 = this.f8981c;
                kotlin.jvm.internal.i.b(zVar2);
                z zVar3 = this.f8981c;
                kotlin.jvm.internal.i.b(zVar3);
                c0787jA3 = J3.c.a(context, zVar2, zVar3.g(bundle), f(), this.f8991o);
            }
            hVar2.addFirst(c0787jA3);
        }
        Iterator it = hVar2.iterator();
        while (it.hasNext()) {
            C0787j c0787j3 = (C0787j) it.next();
            Object obj2 = this.f8998v.get(this.f8997u.b(c0787j3.f9069b.f9140a));
            if (obj2 == null) {
                throw new IllegalStateException(B.a.m(new StringBuilder("NavigatorBackStack for "), xVar.f9140a, " should already be created").toString());
            }
            ((C0790m) obj2).a(c0787j3);
        }
        hVar.addAll(hVar2);
        hVar.addLast(c0787j);
        ArrayList arrayList = new ArrayList(hVar2.size() + 1);
        arrayList.addAll(hVar2);
        arrayList.add(c0787j);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0787j c0787j4 = (C0787j) it2.next();
            z zVar4 = c0787j4.f9069b.f9141b;
            if (zVar4 != null) {
                g(c0787j4, d(zVar4.f9147l));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L3.h, java.util.Collection] */
    public final boolean b() {
        ?? r02;
        while (true) {
            r02 = this.f8985g;
            if (r02.isEmpty() || !(((C0787j) r02.last()).f9069b instanceof z)) {
                break;
            }
            l(this, (C0787j) r02.last());
        }
        C0787j c0787j = (C0787j) r02.k();
        ArrayList arrayList = this.f8976A;
        if (c0787j != null) {
            arrayList.add(c0787j);
        }
        this.f9002z++;
        q();
        int i = this.f9002z - 1;
        this.f9002z = i;
        if (i == 0) {
            ArrayList arrayListW0 = L3.j.w0(arrayList);
            arrayList.clear();
            Iterator it = arrayListW0.iterator();
            while (it.hasNext()) {
                C0787j c0787j2 = (C0787j) it.next();
                Iterator it2 = this.f8992p.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                    x xVar = c0787j2.f9069b;
                    c0787j2.c();
                    throw null;
                }
                this.f8978C.R(c0787j2);
            }
            ArrayList arrayListW02 = L3.j.w0(r02);
            i4.I i5 = this.h;
            i5.getClass();
            i5.M(null, arrayListW02);
            ArrayList arrayListM = m();
            i4.I i6 = this.i;
            i6.getClass();
            i6.M(null, arrayListM);
        }
        return c0787j != null;
    }

    public final x c(int i) {
        x xVar;
        z zVar;
        z zVar2 = this.f8981c;
        if (zVar2 == null) {
            return null;
        }
        if (zVar2.f9147l == i) {
            return zVar2;
        }
        C0787j c0787j = (C0787j) this.f8985g.k();
        if (c0787j == null || (xVar = c0787j.f9069b) == null) {
            xVar = this.f8981c;
            kotlin.jvm.internal.i.b(xVar);
        }
        if (xVar.f9147l == i) {
            return xVar;
        }
        if (xVar instanceof z) {
            zVar = (z) xVar;
        } else {
            zVar = xVar.f9141b;
            kotlin.jvm.internal.i.b(zVar);
        }
        return zVar.l(i, true);
    }

    public final C0787j d(int i) {
        Object objPrevious;
        L3.e eVar = this.f8985g;
        ListIterator listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C0787j) objPrevious).f9069b.f9147l == i) {
                break;
            }
        }
        C0787j c0787j = (C0787j) objPrevious;
        if (c0787j != null) {
            return c0787j;
        }
        StringBuilder sbN = B.a.n("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbN.append(e());
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final x e() {
        C0787j c0787j = (C0787j) this.f8985g.k();
        if (c0787j != null) {
            return c0787j.f9069b;
        }
        return null;
    }

    public final EnumC0236o f() {
        return this.f8990n == null ? EnumC0236o.f4660c : this.f8993q;
    }

    public final void g(C0787j c0787j, C0787j c0787j2) {
        this.f8986j.put(c0787j, c0787j2);
        LinkedHashMap linkedHashMap = this.f8987k;
        if (linkedHashMap.get(c0787j2) == null) {
            linkedHashMap.put(c0787j2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0787j2);
        kotlin.jvm.internal.i.b(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void h(int i, C0769D c0769d) {
        int i5;
        int i6;
        L3.h hVar = this.f8985g;
        x xVar = hVar.isEmpty() ? this.f8981c : ((C0787j) hVar.last()).f9069b;
        if (xVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C0782e c0782eH = xVar.h(i);
        Bundle bundle = null;
        if (c0782eH != null) {
            if (c0769d == null) {
                c0769d = c0782eH.f9057b;
            }
            Bundle bundle2 = c0782eH.f9058c;
            i5 = c0782eH.f9056a;
            if (bundle2 != null) {
                bundle = new Bundle();
                bundle.putAll(bundle2);
            }
        } else {
            i5 = i;
        }
        if (i5 == 0 && c0769d != null && (i6 = c0769d.f9008c) != -1) {
            if (i6 == -1 || !j(i6, c0769d.f9009d, false)) {
                return;
            }
            b();
            return;
        }
        if (i5 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        x xVarC = c(i5);
        if (xVarC != null) {
            i(xVarC, bundle, c0769d);
            return;
        }
        int i7 = x.f9139n;
        Context context = this.f8979a;
        String strJ = AbstractC0156x.J(context, i5);
        if (c0782eH == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strJ + " cannot be found from the current destination " + xVar);
        }
        StringBuilder sbO = B.a.o("Navigation destination ", strJ, " referenced from action ");
        sbO.append(AbstractC0156x.J(context, i));
        sbO.append(" cannot be found from the current destination ");
        sbO.append(xVar);
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Type inference failed for: r11v1, types: [L3.h, java.util.AbstractList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [L3.h, java.util.AbstractList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(o0.x r26, android.os.Bundle r27, o0.C0769D r28) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0767B.i(o0.x, android.os.Bundle, o0.D):void");
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [L3.h, java.lang.Iterable] */
    public final boolean j(int i, boolean z4, boolean z5) throws Resources.NotFoundException {
        x xVar;
        String str;
        String str2;
        ?? r9 = this.f8985g;
        if (r9.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = L3.j.m0(r9).iterator();
        while (true) {
            if (!it.hasNext()) {
                xVar = null;
                break;
            }
            x xVar2 = ((C0787j) it.next()).f9069b;
            N nB = this.f8997u.b(xVar2.f9140a);
            if (z4 || xVar2.f9147l != i) {
                arrayList.add(nB);
            }
            if (xVar2.f9147l == i) {
                xVar = xVar2;
                break;
            }
        }
        if (xVar == null) {
            int i5 = x.f9139n;
            Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC0156x.J(this.f8979a, i) + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o();
        L3.h hVar = new L3.h();
        Iterator it2 = arrayList.iterator();
        L3.h hVar2 = r9;
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            N n5 = (N) it2.next();
            kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
            C0787j c0787j = (C0787j) hVar2.last();
            L3.h hVar3 = hVar2;
            this.f9000x = new C0791n(oVar2, oVar, this, z5, hVar);
            n5.i(c0787j, z5);
            str = null;
            this.f9000x = null;
            if (!oVar2.f8428a) {
                break;
            }
            hVar2 = hVar3;
        }
        if (z5) {
            LinkedHashMap linkedHashMap = this.f8988l;
            if (!z4) {
                d4.c cVar = new d4.c(new d4.k(d4.g.l0(xVar, C0779b.f9046e), new C0792o(this, 0), 0));
                while (cVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((x) cVar.next()).f9147l);
                    C0788k c0788k = (C0788k) (hVar.isEmpty() ? str : hVar.f2346b[hVar.f2345a]);
                    linkedHashMap.put(numValueOf, c0788k != null ? c0788k.f9080a : str);
                }
            }
            if (!hVar.isEmpty()) {
                C0788k c0788k2 = (C0788k) hVar.first();
                d4.c cVar2 = new d4.c(new d4.k(d4.g.l0(c(c0788k2.f9081b), C0779b.f9047f), new C0792o(this, 1), 0));
                while (true) {
                    boolean zHasNext = cVar2.hasNext();
                    str2 = c0788k2.f9080a;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((x) cVar2.next()).f9147l), str2);
                }
                this.f8989m.put(str2, hVar);
            }
        }
        r();
        return oVar.f8428a;
    }

    public final void k(C0787j c0787j, boolean z4, L3.h hVar) {
        r rVar;
        i4.x xVar;
        Set set;
        L3.h hVar2 = this.f8985g;
        C0787j c0787j2 = (C0787j) hVar2.last();
        if (!kotlin.jvm.internal.i.a(c0787j2, c0787j)) {
            throw new IllegalStateException(("Attempted to pop " + c0787j.f9069b + ", which is not the top of the back stack (" + c0787j2.f9069b + ')').toString());
        }
        hVar2.removeLast();
        C0790m c0790m = (C0790m) this.f8998v.get(this.f8997u.b(c0787j2.f9069b.f9140a));
        boolean z5 = true;
        if ((c0790m == null || (xVar = c0790m.f9091f) == null || (set = (Set) ((i4.I) xVar.f7964a).K()) == null || !set.contains(c0787j2)) && !this.f8987k.containsKey(c0787j2)) {
            z5 = false;
        }
        EnumC0236o enumC0236o = c0787j2.f9075l.f4672d;
        EnumC0236o enumC0236o2 = EnumC0236o.f4660c;
        if (enumC0236o.compareTo(enumC0236o2) >= 0) {
            if (z4) {
                c0787j2.d(enumC0236o2);
                hVar.addFirst(new C0788k(c0787j2));
            }
            if (z5) {
                c0787j2.d(enumC0236o2);
            } else {
                c0787j2.d(EnumC0236o.f4658a);
                p(c0787j2);
            }
        }
        if (z4 || z5 || (rVar = this.f8991o) == null) {
            return;
        }
        String backStackEntryId = c0787j2.f9073f;
        kotlin.jvm.internal.i.e(backStackEntryId, "backStackEntryId");
        m0 m0Var = (m0) rVar.f9110a.remove(backStackEntryId);
        if (m0Var != null) {
            m0Var.a();
        }
    }

    public final ArrayList m() {
        EnumC0236o enumC0236o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8998v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0236o = EnumC0236o.f4661d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((i4.I) ((C0790m) it.next()).f9091f.f7964a).K();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0787j c0787j = (C0787j) obj;
                if (!arrayList.contains(c0787j) && c0787j.f9078o.compareTo(enumC0236o) < 0) {
                    arrayList2.add(obj);
                }
            }
            L3.p.b0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f8985g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0787j c0787j2 = (C0787j) next;
            if (!arrayList.contains(c0787j2) && c0787j2.f9078o.compareTo(enumC0236o) >= 0) {
                arrayList3.add(next);
            }
        }
        L3.p.b0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0787j) next2).f9069b instanceof z)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean n(int i, Bundle bundle, C0769D c0769d) throws Resources.NotFoundException {
        x xVar;
        C0787j c0787j;
        x xVar2;
        z zVar;
        x xVarL;
        LinkedHashMap linkedHashMap = this.f8988l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        e4.l lVar = new e4.l(str, 1);
        kotlin.jvm.internal.i.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
        L3.e eVar = (L3.h) kotlin.jvm.internal.u.b(this.f8989m).remove(str);
        ArrayList arrayList = new ArrayList();
        C0787j c0787j2 = (C0787j) this.f8985g.k();
        if ((c0787j2 == null || (xVar = c0787j2.f9069b) == null) && (xVar = this.f8981c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (eVar != null) {
            Iterator it2 = eVar.iterator();
            while (it2.hasNext()) {
                C0788k c0788k = (C0788k) it2.next();
                int i5 = c0788k.f9081b;
                if (xVar.f9147l == i5) {
                    xVarL = xVar;
                } else {
                    if (xVar instanceof z) {
                        zVar = (z) xVar;
                    } else {
                        zVar = xVar.f9141b;
                        kotlin.jvm.internal.i.b(zVar);
                    }
                    xVarL = zVar.l(i5, true);
                }
                Context context = this.f8979a;
                if (xVarL == null) {
                    int i6 = x.f9139n;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0156x.J(context, c0788k.f9081b) + " cannot be found from the current destination " + xVar).toString());
                }
                arrayList.add(c0788k.b(context, xVarL, f(), this.f8991o));
                xVar = xVarL;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0787j) next).f9069b instanceof z)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            C0787j c0787j3 = (C0787j) it4.next();
            List list = (List) L3.j.j0(arrayList2);
            if (list != null && (c0787j = (C0787j) L3.j.i0(list)) != null && (xVar2 = c0787j.f9069b) != null) {
                str2 = xVar2.f9140a;
            }
            if (kotlin.jvm.internal.i.a(str2, c0787j3.f9069b.f9140a)) {
                list.add(c0787j3);
            } else {
                arrayList2.add(new ArrayList(new L3.g(new C0787j[]{c0787j3}, true)));
            }
        }
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            N nB = this.f8997u.b(((C0787j) L3.j.d0(list2)).f9069b.f9140a);
            this.f8999w = new C0793p(oVar, arrayList, new kotlin.jvm.internal.p(), this, bundle);
            nB.d(list2, c0769d);
            this.f8999w = null;
        }
        return oVar.f8428a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [L3.h, java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [L3.h, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(o0.z r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0767B.o(o0.z, android.os.Bundle):void");
    }

    public final void p(C0787j child) {
        kotlin.jvm.internal.i.e(child, "child");
        C0787j c0787j = (C0787j) this.f8986j.remove(child);
        if (c0787j == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f8987k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0787j);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C0790m c0790m = (C0790m) this.f8998v.get(this.f8997u.b(c0787j.f9069b.f9140a));
            if (c0790m != null) {
                c0790m.b(c0787j);
            }
            linkedHashMap.remove(c0787j);
        }
    }

    public final void q() {
        AtomicInteger atomicInteger;
        i4.x xVar;
        Set set;
        ArrayList arrayListW0 = L3.j.w0(this.f8985g);
        if (arrayListW0.isEmpty()) {
            return;
        }
        x xVar2 = ((C0787j) L3.j.i0(arrayListW0)).f9069b;
        ArrayList arrayList = new ArrayList();
        if (xVar2 instanceof InterfaceC0781d) {
            Iterator it = L3.j.m0(arrayListW0).iterator();
            while (it.hasNext()) {
                x xVar3 = ((C0787j) it.next()).f9069b;
                arrayList.add(xVar3);
                if (!(xVar3 instanceof InterfaceC0781d) && !(xVar3 instanceof z)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C0787j c0787j : L3.j.m0(arrayListW0)) {
            EnumC0236o enumC0236o = c0787j.f9078o;
            x xVar4 = c0787j.f9069b;
            EnumC0236o enumC0236o2 = EnumC0236o.f4662e;
            EnumC0236o enumC0236o3 = EnumC0236o.f4661d;
            if (xVar2 != null && xVar4.f9147l == xVar2.f9147l) {
                if (enumC0236o != enumC0236o2) {
                    C0790m c0790m = (C0790m) this.f8998v.get(this.f8997u.b(xVar4.f9140a));
                    if (kotlin.jvm.internal.i.a((c0790m == null || (xVar = c0790m.f9091f) == null || (set = (Set) ((i4.I) xVar.f7964a).K()) == null) ? null : Boolean.valueOf(set.contains(c0787j)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f8987k.get(c0787j)) != null && atomicInteger.get() == 0)) {
                        map.put(c0787j, enumC0236o3);
                    } else {
                        map.put(c0787j, enumC0236o2);
                    }
                }
                x xVar5 = (x) L3.j.e0(arrayList);
                if (xVar5 != null && xVar5.f9147l == xVar4.f9147l) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                xVar2 = xVar2.f9141b;
            } else if (arrayList.isEmpty() || xVar4.f9147l != ((x) L3.j.d0(arrayList)).f9147l) {
                c0787j.d(EnumC0236o.f4660c);
            } else {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                x xVar6 = (x) arrayList.remove(0);
                if (enumC0236o == enumC0236o2) {
                    c0787j.d(enumC0236o3);
                } else if (enumC0236o != enumC0236o3) {
                    map.put(c0787j, enumC0236o3);
                }
                z zVar = xVar6.f9141b;
                if (zVar != null && !arrayList.contains(zVar)) {
                    arrayList.add(zVar);
                }
            }
        }
        Iterator it2 = arrayListW0.iterator();
        while (it2.hasNext()) {
            C0787j c0787j2 = (C0787j) it2.next();
            EnumC0236o enumC0236o4 = (EnumC0236o) map.get(c0787j2);
            if (enumC0236o4 != null) {
                c0787j2.d(enumC0236o4);
            } else {
                c0787j2.f();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L3.h, java.util.AbstractList] */
    public final void r() {
        int i;
        boolean z4 = false;
        if (this.f8996t) {
            ?? r02 = this.f8985g;
            if (r02 == 0 || !r02.isEmpty()) {
                Iterator it = r02.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((C0787j) it.next()).f9069b instanceof z) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z4 = true;
            }
        }
        C0535B c0535b = this.f8995s;
        c0535b.f4920a = z4;
        c4.a aVar = c0535b.f4922c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
