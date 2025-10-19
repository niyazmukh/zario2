package F0;

import M.B;
import M.H;
import M.S;
import N2.AbstractC0156x;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0827d;
import q.C0828e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\n.smali */
public abstract class n implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1614x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final X1.e f1615y = new X1.e();

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f1616z = new ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1627o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1628p;

    /* renamed from: a, reason: collision with root package name */
    public final String f1617a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f1618b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f1619c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f1620d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1621e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1622f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public S0.i f1623k = new S0.i(3);

    /* renamed from: l, reason: collision with root package name */
    public S0.i f1624l = new S0.i(3);

    /* renamed from: m, reason: collision with root package name */
    public a f1625m = null;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f1626n = f1614x;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1629q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f1630r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1631s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1632t = false;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f1633u = null;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f1634v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public X1.e f1635w = f1615y;

    public static void b(S0.i iVar, View view, s sVar) {
        ((q.b) iVar.f2858a).put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) iVar.f2859b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f2363a;
        String strK = H.k(view);
        if (strK != null) {
            q.b bVar = (q.b) iVar.f2861d;
            if (bVar.containsKey(strK)) {
                bVar.put(strK, null);
            } else {
                bVar.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0828e c0828e = (C0828e) iVar.f2860c;
                if (c0828e.f9406a) {
                    c0828e.b();
                }
                if (AbstractC0827d.b(c0828e.f9407b, c0828e.f9409d, itemIdAtPosition) < 0) {
                    B.r(view, true);
                    c0828e.e(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) c0828e.c(itemIdAtPosition, null);
                if (view2 != null) {
                    B.r(view2, false);
                    c0828e.e(null, itemIdAtPosition);
                }
            }
        }
    }

    public static q.b o() {
        ThreadLocal threadLocal = f1616z;
        q.b bVar = (q.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean t(s sVar, s sVar2, String str) {
        Object obj = sVar.f1643a.get(str);
        Object obj2 = sVar2.f1643a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(TimeInterpolator timeInterpolator) {
        this.f1620d = timeInterpolator;
    }

    public void B(X1.e eVar) {
        if (eVar == null) {
            this.f1635w = f1615y;
        } else {
            this.f1635w = eVar;
        }
    }

    public void C() {
    }

    public void D(long j5) {
        this.f1618b = j5;
    }

    public final void E() {
        if (this.f1630r == 0) {
            ArrayList arrayList = this.f1633u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1633u.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((m) arrayList2.get(i)).d(this);
                }
            }
            this.f1632t = false;
        }
        this.f1630r++;
    }

    public String F(String str) {
        StringBuilder sbB = t.h.b(str);
        sbB.append(getClass().getSimpleName());
        sbB.append("@");
        sbB.append(Integer.toHexString(hashCode()));
        sbB.append(": ");
        String string = sbB.toString();
        if (this.f1619c != -1) {
            string = string + "dur(" + this.f1619c + ") ";
        }
        if (this.f1618b != -1) {
            string = string + "dly(" + this.f1618b + ") ";
        }
        if (this.f1620d != null) {
            string = string + "interp(" + this.f1620d + ") ";
        }
        ArrayList arrayList = this.f1621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1622f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strK = B.a.k(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strK = B.a.k(strK, ", ");
                }
                StringBuilder sbB2 = t.h.b(strK);
                sbB2.append(arrayList.get(i));
                strK = sbB2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                if (i5 > 0) {
                    strK = B.a.k(strK, ", ");
                }
                StringBuilder sbB3 = t.h.b(strK);
                sbB3.append(arrayList2.get(i5));
                strK = sbB3.toString();
            }
        }
        return B.a.k(strK, ")");
    }

    public void a(m mVar) {
        if (this.f1633u == null) {
            this.f1633u = new ArrayList();
        }
        this.f1633u.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f1629q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f1633u;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f1633u.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((m) arrayList3.get(i)).a();
        }
    }

    public abstract void d(s sVar);

    public final void e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z4) {
                g(sVar);
            } else {
                d(sVar);
            }
            sVar.f1645c.add(this);
            f(sVar);
            if (z4) {
                b(this.f1623k, view, sVar);
            } else {
                b(this.f1624l, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z4);
            }
        }
    }

    public void f(s sVar) {
    }

    public abstract void g(s sVar);

    public final void h(FrameLayout frameLayout, boolean z4) {
        i(z4);
        ArrayList arrayList = this.f1621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1622f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z4);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                s sVar = new s(viewFindViewById);
                if (z4) {
                    g(sVar);
                } else {
                    d(sVar);
                }
                sVar.f1645c.add(this);
                f(sVar);
                if (z4) {
                    b(this.f1623k, viewFindViewById, sVar);
                } else {
                    b(this.f1624l, viewFindViewById, sVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            s sVar2 = new s(view);
            if (z4) {
                g(sVar2);
            } else {
                d(sVar2);
            }
            sVar2.f1645c.add(this);
            f(sVar2);
            if (z4) {
                b(this.f1623k, view, sVar2);
            } else {
                b(this.f1624l, view, sVar2);
            }
        }
    }

    public final void i(boolean z4) {
        if (z4) {
            ((q.b) this.f1623k.f2858a).clear();
            ((SparseArray) this.f1623k.f2859b).clear();
            ((C0828e) this.f1623k.f2860c).a();
        } else {
            ((q.b) this.f1624l.f2858a).clear();
            ((SparseArray) this.f1624l.f2859b).clear();
            ((C0828e) this.f1624l.f2860c).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f1634v = new ArrayList();
            nVar.f1623k = new S0.i(3);
            nVar.f1624l = new S0.i(3);
            nVar.f1627o = null;
            nVar.f1628p = null;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(FrameLayout frameLayout, s sVar, s sVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, S0.i iVar, S0.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i;
        View view;
        s sVar;
        Animator animator;
        q.b bVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            s sVar2 = (s) arrayList.get(i5);
            s sVar3 = (s) arrayList2.get(i5);
            s sVar4 = null;
            if (sVar2 != null && !sVar2.f1645c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f1645c.contains(this)) {
                sVar3 = null;
            }
            if (!(sVar2 == null && sVar3 == null) && ((sVar2 == null || sVar3 == null || r(sVar2, sVar3)) && (animatorK = k(frameLayout, sVar2, sVar3)) != null)) {
                String str = this.f1617a;
                if (sVar3 != null) {
                    String[] strArrP = p();
                    view = sVar3.f1644b;
                    if (strArrP != null && strArrP.length > 0) {
                        sVar = new s(view);
                        s sVar5 = (s) ((q.b) iVar2.f2858a).getOrDefault(view, null);
                        i = size;
                        if (sVar5 != null) {
                            int i6 = 0;
                            while (i6 < strArrP.length) {
                                HashMap map = sVar.f1643a;
                                String str2 = strArrP[i6];
                                map.put(str2, sVar5.f1643a.get(str2));
                                i6++;
                                strArrP = strArrP;
                            }
                        }
                        int i7 = bVarO.f9428c;
                        for (int i8 = 0; i8 < i7; i8++) {
                            animator = null;
                            l lVar = (l) bVarO.getOrDefault((Animator) bVarO.h(i8), null);
                            if (lVar.f1611c != null && lVar.f1609a == view && lVar.f1610b.equals(str) && lVar.f1611c.equals(sVar)) {
                                break;
                            }
                        }
                    } else {
                        i = size;
                        sVar = null;
                    }
                    animator = animatorK;
                    animatorK = animator;
                    sVar4 = sVar;
                } else {
                    i = size;
                    view = sVar2.f1644b;
                }
                if (animatorK != null) {
                    c cVar = t.f1646a;
                    z zVar = new z(frameLayout);
                    l lVar2 = new l();
                    lVar2.f1609a = view;
                    lVar2.f1610b = str;
                    lVar2.f1611c = sVar4;
                    lVar2.f1612d = zVar;
                    lVar2.f1613e = this;
                    bVarO.put(animatorK, lVar2);
                    this.f1634v.add(animatorK);
                }
            } else {
                i = size;
            }
            i5++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                Animator animator2 = (Animator) this.f1634v.get(sparseIntArray.keyAt(i9));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f1630r - 1;
        this.f1630r = i;
        if (i == 0) {
            ArrayList arrayList = this.f1633u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1633u.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((m) arrayList2.get(i5)).b(this);
                }
            }
            for (int i6 = 0; i6 < ((C0828e) this.f1623k.f2860c).f(); i6++) {
                View view = (View) ((C0828e) this.f1623k.f2860c).g(i6);
                if (view != null) {
                    WeakHashMap weakHashMap = S.f2363a;
                    B.r(view, false);
                }
            }
            for (int i7 = 0; i7 < ((C0828e) this.f1624l.f2860c).f(); i7++) {
                View view2 = (View) ((C0828e) this.f1624l.f2860c).g(i7);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = S.f2363a;
                    B.r(view2, false);
                }
            }
            this.f1632t = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.f1628p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.f1627o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (F0.s) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F0.s n(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            F0.a r0 = r5.f1625m
            if (r0 == 0) goto L9
            F0.s r5 = r0.n(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f1627o
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f1628p
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            F0.s r4 = (F0.s) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f1644b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.f1628p
            goto L36
        L34:
            java.util.ArrayList r5 = r5.f1627o
        L36:
            java.lang.Object r5 = r5.get(r3)
            r1 = r5
            F0.s r1 = (F0.s) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.n.n(android.view.View, boolean):F0.s");
    }

    public String[] p() {
        return null;
    }

    public final s q(View view, boolean z4) {
        a aVar = this.f1625m;
        if (aVar != null) {
            return aVar.q(view, z4);
        }
        return (s) ((q.b) (z4 ? this.f1623k : this.f1624l).f2858a).getOrDefault(view, null);
    }

    public boolean r(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrP = p();
        if (strArrP == null) {
            Iterator it = sVar.f1643a.keySet().iterator();
            while (it.hasNext()) {
                if (t(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrP) {
            if (!t(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1621e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1622f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.f1632t) {
            return;
        }
        ArrayList arrayList = this.f1629q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f1633u;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f1633u.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((m) arrayList3.get(i)).c();
            }
        }
        this.f1631s = true;
    }

    public void v(m mVar) {
        ArrayList arrayList = this.f1633u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(mVar);
        if (this.f1633u.size() == 0) {
            this.f1633u = null;
        }
    }

    public void w(FrameLayout frameLayout) {
        if (this.f1631s) {
            if (!this.f1632t) {
                ArrayList arrayList = this.f1629q;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f1633u;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f1633u.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((m) arrayList3.get(i)).e();
                    }
                }
            }
            this.f1631s = false;
        }
    }

    public void x() {
        E();
        q.b bVarO = o();
        Iterator it = this.f1634v.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (bVarO.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new k(this, bVarO));
                    long j5 = this.f1619c;
                    if (j5 >= 0) {
                        animator.setDuration(j5);
                    }
                    long j6 = this.f1618b;
                    if (j6 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j6);
                    }
                    TimeInterpolator timeInterpolator = this.f1620d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new D1.a(this, 1));
                    animator.start();
                }
            }
        }
        this.f1634v.clear();
        m();
    }

    public void y(long j5) {
        this.f1619c = j5;
    }

    public void z(AbstractC0156x abstractC0156x) {
    }
}
