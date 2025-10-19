package A2;

import B3.C0043g;
import B3.C0077s;
import B3.C0079t;
import B3.C0082u;
import B3.C0088w;
import B3.EnumC0094y;
import B3.InterfaceC0097z;
import B3.Q1;
import B3.RunnableC0083u0;
import N2.AbstractC0156x;
import N2.n0;
import N2.q0;
import a.AbstractC0183a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0242x;
import androidx.recyclerview.widget.RecyclerView;
import b0.ChoreographerFrameCallbackC0256a;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import javax.net.ssl.SSLSocket;
import s2.AbstractC0869c;
import s2.C0868b;
import u0.C0955C;
import v.C0973b;
import v3.InterfaceC1003a;
import w.C1009f;
import x2.C1035a;
import x2.C1037c;
import x2.C1038d;
import z2.C1071b;
import z3.C1092p;
import z3.j0;
import z3.k0;

/* renamed from: A2.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\i.1.smali */
public class C0009i implements I, InterfaceC0001a, InterfaceC0097z, InterfaceC1003a, v3.c {

    /* renamed from: e, reason: collision with root package name */
    public static C0009i f202e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203a;

    /* renamed from: b, reason: collision with root package name */
    public Object f204b;

    /* renamed from: c, reason: collision with root package name */
    public Object f205c;

    /* renamed from: d, reason: collision with root package name */
    public Object f206d;

    public /* synthetic */ C0009i(int i) {
        this.f203a = i;
    }

    public static Method O(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return O(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public static C0009i Y(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0009i(16, context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A(int i) {
        t0.g0 g0VarI;
        int iN = N(i);
        ((C0043g) this.f205c).f(iN);
        RecyclerView recyclerView = (RecyclerView) ((K2.c) this.f204b).b;
        View childAt = recyclerView.getChildAt(iN);
        if (childAt != null && (g0VarI = RecyclerView.I(childAt)) != null) {
            if (g0VarI.k() && !g0VarI.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + g0VarI + recyclerView.y());
            }
            g0VarI.a(256);
        }
        recyclerView.detachViewFromParent(iN);
    }

    public synchronized void B() {
        if (!(((y2.o) this.f205c) != null)) {
            this.f205c = (y2.o) ((C0004d) this.f204b).e((F2.f) this.f206d);
        }
    }

    public int C(F2.k kVar) {
        Cursor cursorH0 = h0();
        int i = 0;
        while (cursorH0.moveToNext()) {
            try {
                i++;
                kVar.a(cursorH0);
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
        return i;
    }

    public View D(int i) {
        return ((RecyclerView) ((K2.c) this.f204b).b).getChildAt(N(i));
    }

    public int E() {
        return ((RecyclerView) ((K2.c) this.f204b).b).getChildCount() - ((ArrayList) this.f206d).size();
    }

    public ColorStateList F(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f205c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = B.l.getColorStateList((Context) this.f204b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public AbstractC0869c G(Iterable iterable) {
        return L(((J) this.f204b).h(iterable), new HashSet());
    }

    public AbstractC0869c H(y2.v vVar, B2.b bVar, G2.e eVar) {
        B2.n nVar = vVar.f11148e;
        if (B2.h.e(nVar) && vVar.f11147d.isEmpty()) {
            C0868b c0868b = B2.g.f312a;
            B2.h hVar = new B2.h(nVar);
            C2.d dVarL = ((InterfaceC0001a) this.f206d).l(hVar);
            B2.l lVarF = (dVarL == null || (dVarL.f1079b instanceof C2.m)) ? ((J) this.f204b).f(hVar) : B2.l.g(hVar);
            if (dVarL != null) {
                dVarL.f1079b.a(lVarF, C2.f.f1080b, new l2.o(new Date()));
            }
            return lVarF.d() ? c0868b.k(lVarF.f322a, lVarF) : c0868b;
        }
        HashMap mapH = ((InterfaceC0001a) this.f206d).h(vVar.f11148e, bVar.f304c);
        HashMap mapB = ((J) this.f204b).b(vVar, bVar, mapH.keySet(), eVar);
        for (Map.Entry entry : mapH.entrySet()) {
            if (!mapB.containsKey(entry.getKey())) {
                mapB.put((B2.h) entry.getKey(), B2.l.g((B2.h) entry.getKey()));
            }
        }
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        for (Map.Entry entry2 : mapB.entrySet()) {
            C2.d dVar = (C2.d) mapH.get(entry2.getKey());
            if (dVar != null) {
                dVar.f1079b.a((B2.l) entry2.getValue(), C2.f.f1080b, new l2.o(new Date()));
            }
            if (vVar.e((B2.l) entry2.getValue())) {
                abstractC0869cK = abstractC0869cK.k((B2.h) entry2.getKey(), (B2.l) entry2.getValue());
            }
        }
        return abstractC0869cK;
    }

    public Drawable I(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f205c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : r1.d.B((Context) this.f204b, resourceId);
    }

    public Drawable J(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f205c).hasValue(i) || (resourceId = ((TypedArray) this.f205c).getResourceId(i, 0)) == 0) {
            return null;
        }
        l.r rVarA = l.r.a();
        Context context = (Context) this.f204b;
        synchronized (rVarA) {
            drawableD = rVarA.f8676a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface K(int i, int i5, l.Q q5) {
        int resourceId = ((TypedArray) this.f205c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f206d) == null) {
            this.f206d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f206d;
        ThreadLocal threadLocal = C.o.f1060a;
        Context context = (Context) this.f204b;
        if (context.isRestricted()) {
            return null;
        }
        return C.o.b(context, resourceId, typedValue, i5, q5, true, false);
    }

    public AbstractC0869c L(Map map, HashSet hashSet) {
        HashMap map2 = new HashMap();
        Z(map2, map.keySet());
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        for (Map.Entry entry : y(map, map2, hashSet).entrySet()) {
            abstractC0869cK = abstractC0869cK.k((B2.h) entry.getKey(), ((F) entry.getValue()).f84a);
        }
        return abstractC0869cK;
    }

    public Method M(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        Method methodO = O(cls, (String) this.f205c, (Class[]) this.f206d);
        if (methodO == null || (cls2 = (Class) this.f204b) == null || cls2.isAssignableFrom(methodO.getReturnType())) {
            return methodO;
        }
        return null;
    }

    public int N(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((K2.c) this.f204b).b).getChildCount();
        int i5 = i;
        while (i5 < childCount) {
            C0043g c0043g = (C0043g) this.f205c;
            int iB = i - (i5 - c0043g.b(i5));
            if (iB == 0) {
                while (c0043g.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += iB;
        }
        return -1;
    }

    public View P(int i) {
        return ((RecyclerView) ((K2.c) this.f204b).b).getChildAt(i);
    }

    public int Q() {
        return ((RecyclerView) ((K2.c) this.f204b).b).getChildCount();
    }

    public void R(View view) {
        ((ArrayList) this.f206d).add(view);
        K2.c cVar = (K2.c) this.f204b;
        t0.g0 g0VarI = RecyclerView.I(view);
        if (g0VarI != null) {
            int i = g0VarI.f10018q;
            View view2 = g0VarI.f10004a;
            if (i != -1) {
                g0VarI.f10017p = i;
            } else {
                WeakHashMap weakHashMap = M.S.f2363a;
                g0VarI.f10017p = M.B.c(view2);
            }
            RecyclerView recyclerView = (RecyclerView) cVar.b;
            if (recyclerView.L()) {
                g0VarI.f10018q = 4;
                recyclerView.f4770v0.add(g0VarI);
            } else {
                WeakHashMap weakHashMap2 = M.S.f2363a;
                M.B.s(view2, 4);
            }
        }
    }

    public Object S(SSLSocket sSLSocket, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method methodM = M(sSLSocket.getClass());
        if (methodM == null) {
            throw new AssertionError("Method " + ((String) this.f205c) + " not supported for object " + sSLSocket);
        }
        try {
            return methodM.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e5) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM);
            assertionError.initCause(e5);
            throw assertionError;
        }
    }

    public void T(SSLSocket sSLSocket, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodM = M(sSLSocket.getClass());
            if (methodM == null) {
                return;
            }
            try {
                methodM.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object U(SSLSocket sSLSocket, Object... objArr) {
        try {
            return S(sSLSocket, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean V(B2.h hVar) {
        B b5 = (B) this.f205c;
        if (b5.f75e.f79b.b(hVar)) {
            return true;
        }
        for (A a5 : b5.f72b.values()) {
            a5.getClass();
            boolean zEquals = false;
            s2.d dVarG = a5.f67b.g(new C0003c(hVar, 0));
            if (((Iterator) dVarG.f9680b).hasNext()) {
                zEquals = ((C0003c) dVarG.next()).f172a.equals(hVar);
            }
            if (zEquals) {
                return true;
            }
        }
        S0.c cVar = (S0.c) this.f204b;
        return cVar != null && cVar.b(hVar);
    }

    public void W() {
        AbstractC0183a.N(((ScheduledFuture) this.f205c) != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
        this.f205c = null;
        AbstractC0183a.N(((F2.f) this.f206d).f1705b.remove(this), "Delayed task not found.", new Object[0]);
    }

    public boolean X(C1009f c1009f, u.d dVar, boolean z4) {
        int[] iArr = dVar.f10262c0;
        int i = iArr[0];
        C0973b c0973b = (C0973b) this.f205c;
        c0973b.f10513a = i;
        c0973b.f10514b = iArr[1];
        c0973b.f10515c = dVar.l();
        c0973b.f10516d = dVar.i();
        c0973b.i = false;
        c0973b.f10520j = z4;
        boolean z5 = c0973b.f10513a == 3;
        boolean z6 = c0973b.f10514b == 3;
        boolean z7 = z5 && dVar.f10243L > 0.0f;
        boolean z8 = z6 && dVar.f10243L > 0.0f;
        int[] iArr2 = dVar.f10269l;
        if (z7 && iArr2[0] == 4) {
            c0973b.f10513a = 1;
        }
        if (z8 && iArr2[1] == 4) {
            c0973b.f10514b = 1;
        }
        c1009f.a(dVar, c0973b);
        dVar.y(c0973b.f10517e);
        dVar.v(c0973b.f10518f);
        dVar.f10280w = c0973b.h;
        int i5 = c0973b.f10519g;
        dVar.f10247P = i5;
        dVar.f10280w = i5 > 0;
        c0973b.f10520j = false;
        return c0973b.i;
    }

    public void Z(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            if (!map.containsKey(hVar)) {
                treeSet.add(hVar);
            }
        }
        map.putAll(((InterfaceC0001a) this.f206d).i(treeSet));
    }

    @Override // A2.InterfaceC0001a
    public void a(int i, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            B2.h hVar = (B2.h) entry.getKey();
            C2.h hVar2 = (C2.h) entry.getValue();
            if (hVar2 == null) {
                Locale locale = Locale.US;
                throw new NullPointerException("null value for key: " + hVar);
            }
            String strG = hVar.f315a.g(r2.f309a.size() - 2);
            B2.n nVar = hVar.f315a;
            ((X) this.f204b).y0("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", (String) this.f206d, strG, AbstractC0156x.C((B2.n) nVar.k()), nVar.f(), Integer.valueOf(i), ((S0.l) ((K2.c) this.f205c).b).t(hVar2).d());
        }
    }

    public void a0(androidx.lifecycle.n nVar) {
        RunnableC0083u0 runnableC0083u0 = (RunnableC0083u0) this.f206d;
        if (runnableC0083u0 != null) {
            runnableC0083u0.run();
        }
        RunnableC0083u0 runnableC0083u02 = new RunnableC0083u0((C0242x) this.f204b, nVar);
        this.f206d = runnableC0083u02;
        ((Handler) this.f205c).postAtFrontOfQueue(runnableC0083u02);
    }

    @Override // B3.InterfaceC0097z
    public void b() {
        C0088w c0088w = (C0088w) this.f206d;
        z3.b0 b0Var = (z3.b0) c0088w.f999a.f5568c;
        b0Var.getClass();
        if (b0Var == z3.b0.f11281a || b0Var == z3.b0.f11282b) {
            return;
        }
        J3.b.c();
        try {
            J3.b.a();
            J3.b.b();
            c0088w.f1001c.execute(new C0082u(this));
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b0(F2.j jVar, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        Runnable runnable = new Runnable() { // from class: A2.K
            @Override // java.lang.Runnable
            public final void run() {
                C0009i c0009i = this.f94a;
                byte[] bArr = blob;
                int i5 = i;
                Map map2 = map;
                C2.d dVarZ = c0009i.z(bArr, i5);
                synchronized (map2) {
                    map2.put(dVarZ.f1079b.f1084a, dVarZ);
                }
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            jVar.b(runnable);
        }
    }

    @Override // A2.I
    public void c(B2.h hVar) {
        ((HashSet) this.f206d).add(hVar);
    }

    public void c0(HashMap map, F2.j jVar, B2.n nVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        T t4 = new T((X) this.f204b, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList((String) this.f206d, AbstractC0156x.C(nVar)), arrayList, ")");
        while (((Iterator) t4.f138f).hasNext()) {
            Cursor cursorH0 = t4.D().h0();
            while (cursorH0.moveToNext()) {
                try {
                    b0(jVar, map, cursorH0);
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
        }
    }

    @Override // A2.InterfaceC0001a
    public void d(int i) {
        ((X) this.f204b).y0("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", (String) this.f206d, Integer.valueOf(i));
    }

    public HashMap d0(Map map) {
        ArrayList arrayListI = ((D) this.f205c).i(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            C2.i iVar = (C2.i) it.next();
            Iterator it2 = iVar.b().iterator();
            while (it2.hasNext()) {
                B2.h hVar = (B2.h) it2.next();
                B2.l lVar = (B2.l) map.get(hVar);
                if (lVar != null) {
                    map2.put(hVar, iVar.a(lVar, map2.containsKey(hVar) ? (C2.f) map2.get(hVar) : C2.f.f1080b));
                    int i = iVar.f1087a;
                    if (!treeMap.containsKey(Integer.valueOf(i))) {
                        treeMap.put(Integer.valueOf(i), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i))).add(hVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (B2.h hVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(hVar2)) {
                    C2.h hVarC = C2.h.c((B2.l) map.get(hVar2), (C2.f) map2.get(hVar2));
                    if (hVarC != null) {
                        map3.put(hVar2, hVarC);
                    }
                    hashSet.add(hVar2);
                }
            }
            ((InterfaceC0001a) this.f206d).a(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    @Override // A2.I
    public void e(g0 g0Var) {
        B b5 = (B) this.f205c;
        int i = g0Var.f194b;
        C c5 = b5.f75e;
        Iterator it = c5.f79b.p(i).iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                c5.f78a.remove(g0Var.f193a);
                c5.f79b.r(g0Var.f194b);
                return;
            } else {
                ((HashSet) this.f206d).add((B2.h) dVar.next());
            }
        }
    }

    public void e0() {
        ((TypedArray) this.f205c).recycle();
    }

    @Override // B3.InterfaceC0097z
    public void f(z3.a0 a0Var) {
        C0088w c0088w = (C0088w) this.f206d;
        J3.b.c();
        try {
            J3.c cVar = c0088w.f1000b;
            J3.b.a();
            J3.b.b();
            c0088w.f1001c.execute(new C0077s(this, a0Var));
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Object f0(long j5, long j6, Q3.j jVar) {
        C0955C c0955cK = C0955C.k(2, "SELECT * FROM usage_sessions WHERE startMs < ? AND endMs > ? ORDER BY startMs");
        c0955cK.d(1, j6);
        c0955cK.d(2, j5);
        return C1071b.e((UsageAggregationDatabase_Impl) this.f204b, false, new CancellationSignal(), new v3.d(this, c0955cK, 1), jVar);
    }

    @Override // A2.I
    public void g(B2.h hVar) {
        if (V(hVar)) {
            ((HashSet) this.f206d).remove(hVar);
        } else {
            ((HashSet) this.f206d).add(hVar);
        }
    }

    public void g0(u.e eVar, int i, int i5) {
        int i6 = eVar.f10248Q;
        int i7 = eVar.f10249R;
        eVar.f10248Q = 0;
        eVar.f10249R = 0;
        eVar.y(i);
        eVar.v(i5);
        if (i6 < 0) {
            eVar.f10248Q = 0;
        } else {
            eVar.f10248Q = i6;
        }
        if (i7 < 0) {
            eVar.f10249R = 0;
        } else {
            eVar.f10249R = i7;
        }
        ((u.e) this.f206d).E();
    }

    @Override // A2.InterfaceC0001a
    public HashMap h(B2.n nVar, int i) {
        HashMap map = new HashMap();
        F2.j jVar = new F2.j();
        C0009i c0009iZ0 = ((X) this.f204b).z0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        c0009iZ0.v((String) this.f206d, AbstractC0156x.C(nVar), Integer.valueOf(i));
        Cursor cursorH0 = c0009iZ0.h0();
        while (cursorH0.moveToNext()) {
            try {
                b0(jVar, map, cursorH0);
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
        jVar.a();
        return map;
    }

    public Cursor h0() {
        W w4 = (W) this.f206d;
        String str = (String) this.f205c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f204b;
        return w4 != null ? sQLiteDatabase.rawQueryWithFactory(w4, str, null, null) : sQLiteDatabase.rawQuery(str, null);
    }

    @Override // A2.InterfaceC0001a
    public HashMap i(TreeSet treeSet) {
        AbstractC0183a.N(treeSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        F2.j jVar = new F2.j();
        B2.n nVarD = B2.n.f332b;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            if (!nVarD.equals(hVar.d())) {
                c0(map, jVar, nVarD, arrayList);
                nVarD = hVar.d();
                arrayList.clear();
            }
            arrayList.add(hVar.f315a.f());
        }
        c0(map, jVar, nVarD, arrayList);
        jVar.a();
        return map;
    }

    public C2.h i0(B2.h hVar, C2.n nVar) {
        C2.f fVar = (C2.f) this.f205c;
        return fVar != null ? new C2.m(hVar, (B2.m) this.f204b, fVar, nVar, (List) this.f206d) : new C2.p(hVar, (B2.m) this.f204b, nVar, (List) this.f206d);
    }

    @Override // A2.I
    public long j() {
        return -1L;
    }

    public void j0(View view) {
        if (((ArrayList) this.f206d).remove(view)) {
            K2.c cVar = (K2.c) this.f204b;
            t0.g0 g0VarI = RecyclerView.I(view);
            if (g0VarI != null) {
                int i = g0VarI.f10017p;
                RecyclerView recyclerView = (RecyclerView) cVar.b;
                if (recyclerView.L()) {
                    g0VarI.f10018q = i;
                    recyclerView.f4770v0.add(g0VarI);
                } else {
                    WeakHashMap weakHashMap = M.S.f2363a;
                    M.B.s(g0VarI.f10004a, i);
                }
                g0VarI.f10017p = 0;
            }
        }
    }

    @Override // A2.I
    public void k(B2.h hVar) {
        ((HashSet) this.f206d).remove(hVar);
    }

    @Override // A2.InterfaceC0001a
    public C2.d l(B2.h hVar) {
        String strC = AbstractC0156x.C((B2.n) hVar.f315a.k());
        String strF = hVar.f315a.f();
        C0009i c0009iZ0 = ((X) this.f204b).z0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        c0009iZ0.v((String) this.f206d, strC, strF);
        Cursor cursorH0 = c0009iZ0.h0();
        try {
            if (!cursorH0.moveToFirst()) {
                cursorH0.close();
                return null;
            }
            C2.d dVarZ = z(cursorH0.getBlob(0), cursorH0.getInt(1));
            cursorH0.close();
            return dVarZ;
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

    @Override // A2.I
    public void m(B2.h hVar) {
        ((HashSet) this.f206d).add(hVar);
    }

    @Override // A2.InterfaceC0001a
    public HashMap n(int i, int i5, String str) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final F2.j jVar = new F2.j();
        X x3 = (X) this.f204b;
        C0009i c0009iZ0 = x3.z0("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        c0009iZ0.v((String) this.f206d, str, Integer.valueOf(i), Integer.valueOf(i5));
        c0009iZ0.C(new F2.k() { // from class: A2.L
            @Override // F2.k
            public final void a(Object obj) {
                Cursor cursor = (Cursor) obj;
                C0009i c0009i = this.f98a;
                c0009i.getClass();
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                c0009i.b0(jVar, map, cursor);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        C0009i c0009iZ02 = x3.z0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        c0009iZ02.v((String) this.f206d, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        Cursor cursorH0 = c0009iZ02.h0();
        while (cursorH0.moveToNext()) {
            try {
                b0(jVar, map, cursorH0);
            } finally {
            }
        }
        cursorH0.close();
        jVar.a();
        return map;
    }

    @Override // A2.I
    public void o() {
        B b5 = (B) this.f205c;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.f206d).iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            if (!V(hVar)) {
                arrayList.add(hVar);
            }
        }
        b5.f76f.a(arrayList);
        this.f206d = null;
    }

    @Override // B3.InterfaceC0097z
    public void p(k0 k0Var, EnumC0094y enumC0094y, z3.a0 a0Var) {
        J3.b.c();
        try {
            J3.c cVar = ((C0088w) this.f206d).f1000b;
            J3.b.a();
            x(k0Var, a0Var);
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // A2.I
    public void q() {
        this.f206d = new HashSet();
    }

    @Override // A2.I
    public void r(S0.c cVar) {
        this.f204b = cVar;
    }

    @Override // B3.InterfaceC0097z
    public void s(g1.i iVar) {
        C0088w c0088w = (C0088w) this.f206d;
        J3.b.c();
        try {
            J3.c cVar = c0088w.f1000b;
            J3.b.a();
            J3.b.b();
            c0088w.f1001c.execute(new C0077s(this, iVar));
            J3.b.f2098a.getClass();
        } catch (Throwable th) {
            try {
                J3.b.f2098a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void t(View view, int i, boolean z4) {
        RecyclerView recyclerView = (RecyclerView) ((K2.c) this.f204b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : N(i);
        ((C0043g) this.f205c).e(childCount, z4);
        if (z4) {
            R(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public String toString() {
        switch (this.f203a) {
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f204b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f205c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f206d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                kotlin.jvm.internal.i.d(string, "sb.toString()");
                return string;
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return ((C0043g) this.f205c).toString() + ", hidden list:" + ((ArrayList) this.f206d).size();
            default:
                return super.toString();
        }
    }

    public void u(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = (RecyclerView) ((K2.c) this.f204b).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : N(i);
        ((C0043g) this.f205c).e(childCount, z4);
        if (z4) {
            R(view);
        }
        t0.g0 g0VarI = RecyclerView.I(view);
        if (g0VarI != null) {
            if (!g0VarI.k() && !g0VarI.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0VarI + recyclerView.y());
            }
            g0VarI.f10011j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void v(Object... objArr) {
        this.f206d = new W(objArr, 0);
    }

    public void w() {
        ((F2.f) this.f206d).d();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f205c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            W();
        }
    }

    public void x(k0 k0Var, z3.a0 a0Var) {
        C0088w c0088w = (C0088w) this.f206d;
        C1092p c1092p = c0088w.i.f11285a;
        c0088w.f1004f.getClass();
        if (c1092p == null) {
            c1092p = null;
        }
        if (k0Var.f11358a == j0.CANCELLED && c1092p != null && c1092p.b()) {
            g1.i iVar = new g1.i(3);
            c0088w.f1006j.e(iVar);
            k0Var = k0.h.a("ClientCall was cancelled at or after deadline. " + iVar);
            a0Var = new z3.a0();
        }
        J3.b.b();
        c0088w.f1001c.execute(new C0079t(this, k0Var, a0Var));
    }

    public HashMap y(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (B2.l lVar : map.values()) {
            C2.d dVar = (C2.d) map2.get(lVar.f322a);
            B2.h hVar = lVar.f322a;
            if (set.contains(hVar) && (dVar == null || (dVar.f1079b instanceof C2.m))) {
                map3.put(hVar, lVar);
            } else if (dVar != null) {
                C2.h hVar2 = dVar.f1079b;
                map4.put(hVar, hVar2.d());
                hVar2.a(lVar, hVar2.d(), new l2.o(new Date()));
            } else {
                map4.put(hVar, C2.f.f1080b);
            }
        }
        map4.putAll(d0(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            B2.h hVar3 = (B2.h) entry.getKey();
            B2.l lVar2 = (B2.l) entry.getValue();
            C2.f fVar = (C2.f) map4.get(entry.getKey());
            F f2 = new F();
            f2.f84a = lVar2;
            f2.f85b = fVar;
            map5.put(hVar3, f2);
        }
        return map5;
    }

    public C2.d z(byte[] bArr, int i) {
        try {
            return new C2.d(i, ((S0.l) ((K2.c) this.f205c).b).l(q0.P(bArr)));
        } catch (com.google.protobuf.N e5) {
            AbstractC0183a.z("Overlay failed to parse: %s", e5);
            throw null;
        }
    }

    public /* synthetic */ C0009i(int i, Object obj, Object obj2) {
        this.f203a = i;
        this.f204b = obj;
        this.f205c = obj2;
    }

    public /* synthetic */ C0009i(int i, Object obj, Object obj2, boolean z4) {
        this.f203a = i;
        this.f206d = obj;
        this.f204b = obj2;
    }

    public /* synthetic */ C0009i(Object obj, Object obj2, Object obj3, int i) {
        this.f203a = i;
        this.f204b = obj;
        this.f205c = obj2;
        this.f206d = obj3;
    }

    public C0009i(androidx.lifecycle.y yVar) {
        this.f203a = 11;
        this.f204b = new C0242x(yVar);
        this.f205c = new Handler();
    }

    public C0009i(B b5) {
        this.f203a = 1;
        this.f205c = b5;
    }

    public C0009i(UsageAggregationDatabase_Impl usageAggregationDatabase_Impl, int i) {
        this.f203a = i;
        switch (i) {
            case 21:
                this.f204b = usageAggregationDatabase_Impl;
                this.f205c = new S0.b(usageAggregationDatabase_Impl, 12);
                this.f206d = new S0.h(usageAggregationDatabase_Impl, 26);
                break;
            default:
                this.f204b = usageAggregationDatabase_Impl;
                this.f205c = new S0.b(usageAggregationDatabase_Impl, 11);
                this.f206d = new S0.h(usageAggregationDatabase_Impl, 25);
                break;
        }
    }

    public C0009i(X x3, K2.c cVar, C1038d c1038d) {
        this.f203a = 2;
        this.f204b = x3;
        this.f205c = cVar;
        String str = c1038d.f11025a;
        this.f206d = str == null ? "" : str;
    }

    public C0009i(K2.c cVar, char c5) {
        this.f203a = 18;
        this.f204b = cVar;
        this.f205c = new C0043g();
        this.f206d = new ArrayList();
    }

    public C0009i(J j5, D d5, InterfaceC0001a interfaceC0001a, InterfaceC0007g interfaceC0007g) {
        this.f203a = 0;
        this.f204b = j5;
        this.f205c = d5;
        this.f206d = interfaceC0001a;
    }

    public C0009i(C0004d c0004d) {
        this.f203a = 22;
        this.f204b = c0004d;
        this.f206d = new F2.f();
    }

    public C0009i(Runnable runnable) {
        this.f203a = 10;
        this.f205c = new CopyOnWriteArrayList();
        this.f206d = new HashMap();
        this.f204b = runnable;
    }

    public C0009i(Context context, LocationManager locationManager) {
        this.f203a = 13;
        this.f206d = new Q1(1);
        this.f204b = context;
        this.f205c = locationManager;
    }

    public C0009i(u.e eVar) {
        this.f203a = 19;
        this.f204b = new ArrayList();
        this.f205c = new C0973b();
        this.f206d = eVar;
    }

    public C0009i(Context context, F2.f fVar, C0020u c0020u, C1038d c1038d, C1037c c1037c, C1035a c1035a, E2.k kVar) {
        this.f203a = 23;
        this.f204b = context;
        this.f205c = fVar;
        this.f206d = c0020u;
    }

    public C0009i(Context context, View view) {
        this.f203a = 15;
        k.l lVar = new k.l(context);
        this.f204b = lVar;
        lVar.f8222e = new h1.i(this, 19);
        k.w wVar = new k.w(2130903912, context, view, lVar, false);
        this.f205c = wVar;
        wVar.f8288f = 0;
        wVar.f8290j = new k.u(this, 1);
    }

    public C0009i(K2.c cVar) {
        this.f203a = 12;
        this.f203a = 12;
        this.f204b = cVar;
        this.f205c = Choreographer.getInstance();
        this.f206d = new ChoreographerFrameCallbackC0256a(this);
    }

    public C0009i() {
        this.f203a = 9;
        this.f204b = Collections.emptyList();
        this.f205c = Collections.emptyList();
    }
}
