package S0;

import A2.InterfaceC0007g;
import A2.J;
import N2.C0138a;
import N2.C0145i;
import N2.C0146k;
import N2.C0148m;
import N2.C0151q;
import N2.C0152s;
import N2.C0154u;
import N2.EnumC0153t;
import N2.F;
import N2.G;
import N2.H;
import N2.I;
import N2.K;
import N2.L;
import N2.M;
import N2.N;
import N2.O;
import N2.P;
import N2.Q;
import N2.S;
import N2.T;
import N2.U;
import N2.W;
import N2.X;
import N2.Y;
import N2.a0;
import N2.b0;
import N2.c0;
import N2.d0;
import N2.h0;
import N2.i0;
import N2.n0;
import N2.q0;
import N2.v0;
import a.AbstractC0183a;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.google.protobuf.A0;
import com.google.protobuf.B0;
import com.google.protobuf.E;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import e2.C0457e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import s2.AbstractC0869c;
import t0.m0;
import y2.C1048A;
import y2.C1054c;
import y2.C1055d;
import z3.o0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\l.smali */
public final class l implements J, X2.c, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2866a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2867b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2868c;

    public /* synthetic */ l(int i) {
        this.f2866a = i;
    }

    public static y2.k j(W w4) {
        int iOrdinal = w4.B().ordinal();
        int i = 1;
        if (iOrdinal == 0) {
            M mY = w4.y();
            ArrayList arrayList = new ArrayList();
            Iterator it = mY.y().iterator();
            while (it.hasNext()) {
                arrayList.add(j((W) it.next()));
            }
            int iOrdinal2 = mY.z().ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    AbstractC0183a.z("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                i = 2;
            }
            return new C1055d(i, arrayList);
        }
        y2.i iVar = y2.i.NOT_EQUAL;
        y2.i iVar2 = y2.i.EQUAL;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                AbstractC0183a.z("Unrecognized Filter.filterType %d", w4.B());
                throw null;
            }
            c0 c0VarC = w4.C();
            B2.k kVarL = B2.k.l(c0VarC.y().x());
            int iOrdinal3 = c0VarC.z().ordinal();
            if (iOrdinal3 == 1) {
                return y2.j.e(kVarL, iVar2, B2.p.f335a);
            }
            if (iOrdinal3 == 2) {
                return y2.j.e(kVarL, iVar2, B2.p.f336b);
            }
            if (iOrdinal3 == 3) {
                return y2.j.e(kVarL, iVar, B2.p.f335a);
            }
            if (iOrdinal3 == 4) {
                return y2.j.e(kVarL, iVar, B2.p.f336b);
            }
            AbstractC0183a.z("Unrecognized UnaryFilter.operator %d", c0VarC.z());
            throw null;
        }
        Q qA = w4.A();
        B2.k kVarL2 = B2.k.l(qA.z().x());
        P pA = qA.A();
        switch (pA.ordinal()) {
            case 1:
                iVar = y2.i.LESS_THAN;
                break;
            case 2:
                iVar = y2.i.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                iVar = y2.i.GREATER_THAN;
                break;
            case 4:
                iVar = y2.i.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                iVar = iVar2;
                break;
            case 6:
                break;
            case 7:
                iVar = y2.i.ARRAY_CONTAINS;
                break;
            case 8:
                iVar = y2.i.IN;
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                iVar = y2.i.ARRAY_CONTAINS_ANY;
                break;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                iVar = y2.i.NOT_IN;
                break;
            default:
                AbstractC0183a.z("Unhandled FieldFilter.operator %d", pA);
                throw null;
        }
        return y2.j.e(kVarL2, iVar, qA.B());
    }

    public static C2.k m(v0 v0Var, B2.o oVar) {
        B2.o oVarO = o(v0Var.x());
        if (!B2.o.f333b.equals(oVarO)) {
            oVar = oVarO;
        }
        int iW = v0Var.w();
        ArrayList arrayList = new ArrayList(iW);
        for (int i = 0; i < iW; i++) {
            arrayList.add(v0Var.v(i));
        }
        return new C2.k(oVar, arrayList);
    }

    public static B2.n n(String str) {
        B2.n nVarL = B2.n.l(str);
        boolean z4 = false;
        if (nVarL.f309a.size() >= 4 && nVarL.g(0).equals("projects") && nVarL.g(2).equals("databases")) {
            z4 = true;
        }
        AbstractC0183a.N(z4, "Tried to deserialize invalid key %s", nVarL);
        return nVarL;
    }

    public static B2.o o(B0 b02) {
        if (b02.z() == 0 && b02.y() == 0) {
            return B2.o.f333b;
        }
        return new B2.o(new l2.o(b02.y(), b02.z()));
    }

    public static T q(B2.k kVar) {
        S sY = T.y();
        String strC = kVar.c();
        sY.d();
        T.v((T) sY.f6410b, strC);
        return (T) sY.b();
    }

    public static W r(y2.k kVar) {
        L l4;
        P p5;
        if (!(kVar instanceof y2.j)) {
            if (!(kVar instanceof C1055d)) {
                AbstractC0183a.z("Unrecognized filter type %s", kVar.toString());
                throw null;
            }
            C1055d c1055d = (C1055d) kVar;
            ArrayList arrayList = new ArrayList(Collections.unmodifiableList(c1055d.f11083a).size());
            Iterator it = Collections.unmodifiableList(c1055d.f11083a).iterator();
            while (it.hasNext()) {
                arrayList.add(r((y2.k) it.next()));
            }
            if (arrayList.size() == 1) {
                return (W) arrayList.get(0);
            }
            K kA = M.A();
            int iC = t.h.c(c1055d.f11084b);
            if (iC == 0) {
                l4 = L.AND;
            } else {
                if (iC != 1) {
                    AbstractC0183a.z("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                l4 = L.OR;
            }
            kA.d();
            M.v((M) kA.f6410b, l4);
            kA.d();
            M.w((M) kA.f6410b, arrayList);
            U uD = W.D();
            uD.d();
            W.x((W) uD.f6410b, (M) kA.b());
            return (W) uD.b();
        }
        y2.j jVar = (y2.j) kVar;
        y2.i iVar = jVar.f11110a;
        y2.i iVar2 = y2.i.EQUAL;
        B2.k kVar2 = jVar.f11112c;
        n0 n0Var = jVar.f11111b;
        if (iVar == iVar2 || iVar == y2.i.NOT_EQUAL) {
            a0 a0VarA = c0.A();
            T tQ = q(kVar2);
            a0VarA.d();
            c0.w((c0) a0VarA.f6410b, tQ);
            n0 n0Var2 = B2.p.f335a;
            if (n0Var != null && Double.isNaN(n0Var.K())) {
                b0 b0Var = iVar == iVar2 ? b0.c : b0.e;
                a0VarA.d();
                c0.v((c0) a0VarA.f6410b, b0Var);
                U uD2 = W.D();
                uD2.d();
                W.w((W) uD2.f6410b, (c0) a0VarA.b());
                return (W) uD2.b();
            }
            if (n0Var != null && n0Var.R() == 1) {
                b0 b0Var2 = iVar == iVar2 ? b0.d : b0.f;
                a0VarA.d();
                c0.v((c0) a0VarA.f6410b, b0Var2);
                U uD3 = W.D();
                uD3.d();
                W.w((W) uD3.f6410b, (c0) a0VarA.b());
                return (W) uD3.b();
            }
        }
        O oC = Q.C();
        T tQ2 = q(kVar2);
        oC.d();
        Q.v((Q) oC.f6410b, tQ2);
        switch (iVar.ordinal()) {
            case 0:
                p5 = P.LESS_THAN;
                break;
            case 1:
                p5 = P.LESS_THAN_OR_EQUAL;
                break;
            case 2:
                p5 = P.EQUAL;
                break;
            case 3:
                p5 = P.NOT_EQUAL;
                break;
            case 4:
                p5 = P.GREATER_THAN;
                break;
            case 5:
                p5 = P.GREATER_THAN_OR_EQUAL;
                break;
            case 6:
                p5 = P.ARRAY_CONTAINS;
                break;
            case 7:
                p5 = P.ARRAY_CONTAINS_ANY;
                break;
            case 8:
                p5 = P.IN;
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                p5 = P.NOT_IN;
                break;
            default:
                AbstractC0183a.z("Unknown operator %d", iVar);
                throw null;
        }
        oC.d();
        Q.w((Q) oC.f6410b, p5);
        oC.d();
        Q.x((Q) oC.f6410b, n0Var);
        U uD4 = W.D();
        uD4.d();
        W.v((W) uD4.f6410b, (Q) oC.b());
        return (W) uD4.b();
    }

    public static String v(B2.f fVar, B2.n nVar) {
        return ((B2.n) ((B2.n) x(fVar).b("documents")).a(nVar)).c();
    }

    public static B0 w(l2.o oVar) {
        A0 a0A = B0.A();
        long j5 = oVar.f8792a;
        a0A.d();
        B0.v((B0) a0A.f6410b, j5);
        a0A.d();
        B0.w((B0) a0A.f6410b, oVar.f8793b);
        return (B0) a0A.b();
    }

    public static B2.n x(B2.f fVar) {
        List listAsList = Arrays.asList("projects", fVar.f310a, "databases", fVar.f311b);
        B2.n nVar = B2.n.f332b;
        return listAsList.isEmpty() ? B2.n.f332b : new B2.n(listAsList);
    }

    public static B2.n z(B2.n nVar) {
        AbstractC0183a.N(nVar.f309a.size() > 4 && nVar.g(4).equals("documents"), "Tried to deserialize invalid key %s", nVar);
        return (B2.n) nVar.j();
    }

    public void A(String[] strArr, Runnable runnable) {
        String string;
        String strM = B.a.m(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z4 = false;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean zH = H(str);
            if (i == 0) {
                z4 = zH;
            } else if (zH != z4) {
                String strL = B.a.l("Expected all of ", strM, " to either exist or not, but ");
                if (z4) {
                    StringBuilder sbB = t.h.b(strL);
                    sbB.append(strArr[0]);
                    sbB.append(" exists and ");
                    sbB.append(str);
                    sbB.append(" does not");
                    string = sbB.toString();
                } else {
                    StringBuilder sbB2 = t.h.b(strL);
                    sbB2.append(strArr[0]);
                    sbB2.append(" does not exist and ");
                    sbB2.append(str);
                    sbB2.append(" does");
                    string = sbB2.toString();
                }
                throw new IllegalStateException(string);
            }
        }
        if (z4) {
            p1.b.p(1, "SQLiteSchema", B.a.l("Skipping migration because all of ", strM, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    public void B(int i, int i5) {
        int[] iArr = (int[]) this.f2867b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i5;
        y(i6);
        int[] iArr2 = (int[]) this.f2867b;
        System.arraycopy(iArr2, i, iArr2, i6, (iArr2.length - i) - i5);
        Arrays.fill((int[]) this.f2867b, i, i6, -1);
        ArrayList arrayList = (ArrayList) this.f2868c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m0 m0Var = (m0) ((ArrayList) this.f2868c).get(size);
            int i7 = m0Var.f10069a;
            if (i7 >= i) {
                m0Var.f10069a = i7 + i5;
            }
        }
    }

    public void C(int i, int i5) {
        int[] iArr = (int[]) this.f2867b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i6 = i + i5;
        y(i6);
        int[] iArr2 = (int[]) this.f2867b;
        System.arraycopy(iArr2, i6, iArr2, i, (iArr2.length - i) - i5);
        int[] iArr3 = (int[]) this.f2867b;
        Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2868c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m0 m0Var = (m0) ((ArrayList) this.f2868c).get(size);
            int i7 = m0Var.f10069a;
            if (i7 >= i) {
                if (i7 < i6) {
                    ((ArrayList) this.f2868c).remove(size);
                } else {
                    m0Var.f10069a = i7 - i5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.l.D(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r10v0 ??, r10v3 ??, r10v5 ??, r10v4 ??, r10v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:457)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public void E(int r24) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.l.E(int):void");
    }

    public void F(K0.l workSpecId, int i) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        ((V0.a) this.f2868c).c(new T0.n((K0.f) this.f2867b, workSpecId, false, i));
    }

    public boolean G(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = ((SQLiteDatabase) this.f2867b).rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public boolean H(String str) {
        Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.f2867b).rawQueryWithFactory(new A2.W(new Object[]{str}, 0), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z4 = !cursorRawQueryWithFactory.moveToFirst();
            cursorRawQueryWithFactory.close();
            return !z4;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // A2.J
    public void a(ArrayList arrayList) {
        AbstractC0183a.N(((InterfaceC0007g) this.f2868c) != null, "setIndexManager() not called", new Object[0]);
        AbstractC0869c abstractC0869cK = B2.g.f312a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            this.f2867b = ((AbstractC0869c) this.f2867b).m(hVar);
            abstractC0869cK = abstractC0869cK.k(hVar, B2.l.h(hVar, B2.o.f333b));
        }
        ((InterfaceC0007g) this.f2868c).e(abstractC0869cK);
    }

    @Override // A2.J
    public HashMap b(y2.v vVar, B2.b bVar, Set set, G2.e eVar) {
        HashMap map = new HashMap();
        B2.n nVar = vVar.f11148e;
        Iterator itL = ((AbstractC0869c) this.f2867b).l(new B2.h((B2.n) nVar.b("")));
        while (itL.hasNext()) {
            Map.Entry entry = (Map.Entry) itL.next();
            B2.l lVar = (B2.l) entry.getValue();
            B2.h hVar = (B2.h) entry.getKey();
            if (!nVar.i(hVar.f315a)) {
                break;
            }
            if (hVar.f315a.f309a.size() <= nVar.f309a.size() + 1 && B2.b.b(lVar).compareTo(bVar) > 0) {
                B2.h hVar2 = lVar.f322a;
                if (set.contains(hVar2) || vVar.e(lVar)) {
                    map.put(hVar2, lVar.f());
                }
            }
        }
        return map;
    }

    public void c(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.f2867b).add(sb.toString());
    }

    @Override // A2.J
    public Map d(String str, B2.b bVar, int i) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // A2.J
    public void e(InterfaceC0007g interfaceC0007g) {
        this.f2868c = interfaceC0007g;
    }

    @Override // A2.J
    public B2.l f(B2.h hVar) {
        B2.l lVar = (B2.l) ((AbstractC0869c) this.f2867b).g(hVar);
        return lVar != null ? lVar.f() : B2.l.g(hVar);
    }

    @Override // A2.J
    public void g(B2.l lVar, B2.o oVar) {
        AbstractC0183a.N(((InterfaceC0007g) this.f2868c) != null, "setIndexManager() not called", new Object[0]);
        AbstractC0183a.N(!oVar.equals(B2.o.f333b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        AbstractC0869c abstractC0869c = (AbstractC0869c) this.f2867b;
        B2.l lVarF = lVar.f();
        lVarF.f325d = oVar;
        B2.h hVar = lVar.f322a;
        this.f2867b = abstractC0869c.k(hVar, lVarF);
        ((InterfaceC0007g) this.f2868c).r(hVar.d());
    }

    @Override // A2.J
    public HashMap h(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            B2.h hVar = (B2.h) it.next();
            map.put(hVar, f(hVar));
        }
        return map;
    }

    public void i() {
        ((o0) this.f2867b).f11375b = true;
        ((ScheduledFuture) this.f2868c).cancel(false);
    }

    public B2.h k(String str) {
        B2.n nVarN = n(str);
        String strG = nVarN.g(1);
        B2.f fVar = (B2.f) this.f2867b;
        AbstractC0183a.N(strG.equals(fVar.f310a), "Tried to deserialize key from different project.", new Object[0]);
        AbstractC0183a.N(nVarN.g(3).equals(fVar.f311b), "Tried to deserialize key from different database.", new Object[0]);
        return new B2.h(z(nVarN));
    }

    public C2.h l(q0 q0Var) {
        C2.n nVar;
        C2.g gVar;
        C2.n nVar2;
        if (q0Var.J()) {
            G gB = q0Var.B();
            int iC = t.h.c(gB.x());
            if (iC == 0) {
                nVar2 = new C2.n(null, Boolean.valueOf(gB.z()));
            } else if (iC == 1) {
                nVar2 = new C2.n(o(gB.A()), null);
            } else {
                if (iC != 2) {
                    AbstractC0183a.z("Unknown precondition", new Object[0]);
                    throw null;
                }
                nVar = C2.n.f1102c;
            }
            nVar = nVar2;
        } else {
            nVar = C2.n.f1102c;
        }
        C2.n nVar3 = nVar;
        ArrayList arrayList = new ArrayList();
        for (C0154u c0154u : q0Var.H()) {
            int iC2 = t.h.c(c0154u.F());
            if (iC2 == 0) {
                AbstractC0183a.N(c0154u.E() == EnumC0153t.REQUEST_TIME, "Unknown transform setToServerValue: %s", c0154u.E());
                gVar = new C2.g(B2.k.l(c0154u.B()), C2.o.f1105a);
            } else if (iC2 == 1) {
                B2.k kVarL = B2.k.l(c0154u.B());
                n0 n0VarC = c0154u.C();
                C2.l lVar = new C2.l();
                AbstractC0183a.N(B2.p.h(n0VarC) || B2.p.g(n0VarC), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
                lVar.f1099a = n0VarC;
                gVar = new C2.g(kVarL, lVar);
            } else if (iC2 == 4) {
                gVar = new C2.g(B2.k.l(c0154u.B()), new C2.b((com.google.protobuf.K) c0154u.A().a()));
            } else {
                if (iC2 != 5) {
                    AbstractC0183a.z("Unknown FieldTransform proto: %s", c0154u);
                    throw null;
                }
                gVar = new C2.g(B2.k.l(c0154u.B()), new C2.a((com.google.protobuf.K) c0154u.D().a()));
            }
            arrayList.add(gVar);
        }
        int iOrdinal = q0Var.D().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new C2.e(k(q0Var.C()), nVar3);
            }
            if (iOrdinal == 2) {
                return new C2.r(k(q0Var.I()), nVar3);
            }
            AbstractC0183a.z("Unknown mutation operation: %d", q0Var.D());
            throw null;
        }
        if (!q0Var.M()) {
            return new C2.p(k(q0Var.F().A()), B2.m.e(q0Var.F().z()), nVar3, arrayList);
        }
        B2.h hVarK = k(q0Var.F().A());
        B2.m mVarE = B2.m.e(q0Var.F().z());
        C0151q c0151qG = q0Var.G();
        int iY = c0151qG.y();
        HashSet hashSet = new HashSet(iY);
        for (int i = 0; i < iY; i++) {
            hashSet.add(B2.k.l(c0151qG.x(i)));
        }
        return new C2.m(hVarK, mVarE, new C2.f(hashSet), nVar3, arrayList);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f2866a) {
            case 8:
                C0457e c0457e = (C0457e) this.f2867b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2868c;
                synchronized (c0457e.f6871f) {
                    c0457e.f6870e.remove(taskCompletionSource);
                }
                return;
            default:
                p2.t tVar = RecaptchaActivity.f6391D;
                Intent intent = new Intent("android.intent.action.VIEW");
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f2867b;
                ResolveInfo resolveInfoResolveActivity = recaptchaActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.f2868c;
                if (resolveInfoResolveActivity == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzaer.zzb(recaptchaActivity, str);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent2.putExtra("com.android.browser.application_id", str);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(268435456);
                    recaptchaActivity.startActivity(intent2);
                    return;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle = new Bundle();
                    I.e.b(bundle, "android.support.customtabs.extra.SESSION", null);
                    intent3.putExtras(bundle);
                }
                intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent3.putExtras(new Bundle());
                intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent3.addFlags(1073741824);
                intent3.addFlags(268435456);
                intent3.setData((Uri) task.getResult());
                B.l.startActivity(recaptchaActivity, intent3, null);
                return;
        }
    }

    public void p() {
        A2.c0 c0Var = new A2.c0(this, 0);
        Cursor cursorRawQuery = ((SQLiteDatabase) this.f2867b).rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                c0Var.a(cursorRawQuery);
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorRawQuery.close();
    }

    public String s(B2.h hVar) {
        return v((B2.f) this.f2867b, hVar.f315a);
    }

    public q0 t(C2.h hVar) {
        G g3;
        E eB;
        N2.o0 o0VarN = q0.N();
        if (hVar instanceof C2.p) {
            B2.h hVar2 = hVar.f1084a;
            B2.m mVar = ((C2.p) hVar).f1106d;
            C0146k c0146kC = C0148m.C();
            String strS = s(hVar2);
            c0146kC.d();
            C0148m.v((C0148m) c0146kC.f6410b, strS);
            Map mapY = mVar.b().N().y();
            c0146kC.d();
            C0148m.w((C0148m) c0146kC.f6410b).putAll(mapY);
            C0148m c0148m = (C0148m) c0146kC.b();
            o0VarN.d();
            q0.x((q0) o0VarN.f6410b, c0148m);
        } else if (hVar instanceof C2.m) {
            B2.h hVar3 = hVar.f1084a;
            B2.m mVar2 = ((C2.m) hVar).f1100d;
            C0146k c0146kC2 = C0148m.C();
            String strS2 = s(hVar3);
            c0146kC2.d();
            C0148m.v((C0148m) c0146kC2.f6410b, strS2);
            Map mapY2 = mVar2.b().N().y();
            c0146kC2.d();
            C0148m.w((C0148m) c0146kC2.f6410b).putAll(mapY2);
            C0148m c0148m2 = (C0148m) c0146kC2.b();
            o0VarN.d();
            q0.x((q0) o0VarN.f6410b, c0148m2);
            N2.p pVarZ = C0151q.z();
            Iterator it = ((C2.m) hVar).f1101e.f1081a.iterator();
            while (it.hasNext()) {
                String strC = ((B2.k) it.next()).c();
                pVarZ.d();
                C0151q.v((C0151q) pVarZ.f6410b, strC);
            }
            C0151q c0151q = (C0151q) pVarZ.b();
            o0VarN.d();
            q0.v((q0) o0VarN.f6410b, c0151q);
        } else if (hVar instanceof C2.e) {
            String strS3 = s(hVar.f1084a);
            o0VarN.d();
            q0.z((q0) o0VarN.f6410b, strS3);
        } else {
            if (!(hVar instanceof C2.r)) {
                AbstractC0183a.z("unknown mutation type %s", hVar.getClass());
                throw null;
            }
            String strS4 = s(hVar.f1084a);
            o0VarN.d();
            q0.A((q0) o0VarN.f6410b, strS4);
        }
        for (C2.g gVar : hVar.f1086c) {
            C2.b bVar = gVar.f1083b;
            boolean z4 = bVar instanceof C2.o;
            B2.k kVar = gVar.f1082a;
            if (z4) {
                C0152s c0152sG = C0154u.G();
                String strC2 = kVar.c();
                c0152sG.d();
                C0154u.w((C0154u) c0152sG.f6410b, strC2);
                c0152sG.d();
                C0154u.y((C0154u) c0152sG.f6410b);
                eB = c0152sG.b();
            } else if (bVar instanceof C2.b) {
                C0152s c0152sG2 = C0154u.G();
                String strC3 = kVar.c();
                c0152sG2.d();
                C0154u.w((C0154u) c0152sG2.f6410b, strC3);
                C0138a c0138aB = N2.b.B();
                c0138aB.d();
                N2.b.w((N2.b) c0138aB.f6410b, bVar.f1077a);
                c0152sG2.d();
                C0154u.v((C0154u) c0152sG2.f6410b, (N2.b) c0138aB.b());
                eB = c0152sG2.b();
            } else if (bVar instanceof C2.a) {
                C0152s c0152sG3 = C0154u.G();
                String strC4 = kVar.c();
                c0152sG3.d();
                C0154u.w((C0154u) c0152sG3.f6410b, strC4);
                C0138a c0138aB2 = N2.b.B();
                c0138aB2.d();
                N2.b.w((N2.b) c0138aB2.f6410b, ((C2.a) bVar).f1077a);
                c0152sG3.d();
                C0154u.x((C0154u) c0152sG3.f6410b, (N2.b) c0138aB2.b());
                eB = c0152sG3.b();
            } else {
                if (!(bVar instanceof C2.l)) {
                    AbstractC0183a.z("Unknown transform: %s", bVar);
                    throw null;
                }
                C0152s c0152sG4 = C0154u.G();
                String strC5 = kVar.c();
                c0152sG4.d();
                C0154u.w((C0154u) c0152sG4.f6410b, strC5);
                n0 n0Var = ((C2.l) bVar).f1099a;
                c0152sG4.d();
                C0154u.z((C0154u) c0152sG4.f6410b, n0Var);
                eB = c0152sG4.b();
            }
            o0VarN.d();
            q0.w((q0) o0VarN.f6410b, (C0154u) eB);
        }
        C2.n nVar = hVar.f1085b;
        B2.o oVar = nVar.f1103a;
        Boolean bool = nVar.f1104b;
        if (oVar != null || bool != null) {
            AbstractC0183a.N(!(oVar == null && bool == null), "Can't serialize an empty precondition", new Object[0]);
            F fB = G.B();
            B2.o oVar2 = nVar.f1103a;
            if (oVar2 != null) {
                B0 b0W = w(oVar2.f334a);
                fB.d();
                G.w((G) fB.f6410b, b0W);
                g3 = (G) fB.b();
            } else {
                if (bool == null) {
                    AbstractC0183a.z("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean zBooleanValue = bool.booleanValue();
                fB.d();
                G.v((G) fB.f6410b, zBooleanValue);
                g3 = (G) fB.b();
            }
            o0VarN.d();
            q0.y((q0) o0VarN.f6410b, g3);
        }
        return (q0) o0VarN.b();
    }

    public String toString() {
        switch (this.f2866a) {
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f2868c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f2867b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i0 u(C1048A c1048a) {
        h0 h0VarA = i0.A();
        H hO = d0.O();
        B2.n nVar = c1048a.f11053d;
        B2.f fVar = (B2.f) this.f2867b;
        String str = c1048a.f11054e;
        if (str != null) {
            AbstractC0183a.N(nVar.f309a.size() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            String strV = v(fVar, nVar);
            h0VarA.d();
            i0.w((i0) h0VarA.f6410b, strV);
            I iZ = N2.J.z();
            iZ.d();
            N2.J.v((N2.J) iZ.f6410b, str);
            iZ.d();
            N2.J.w((N2.J) iZ.f6410b);
            hO.d();
            d0.v((d0) hO.f6410b, (N2.J) iZ.b());
        } else {
            AbstractC0183a.N(nVar.f309a.size() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            String strV2 = v(fVar, (B2.n) nVar.k());
            h0VarA.d();
            i0.w((i0) h0VarA.f6410b, strV2);
            I iZ2 = N2.J.z();
            String strF = nVar.f();
            iZ2.d();
            N2.J.v((N2.J) iZ2.f6410b, strF);
            hO.d();
            d0.v((d0) hO.f6410b, (N2.J) iZ2.b());
        }
        List list = c1048a.f11052c;
        if (list.size() > 0) {
            W wR = r(new C1055d(1, list));
            hO.d();
            d0.w((d0) hO.f6410b, wR);
        }
        for (y2.u uVar : c1048a.f11051b) {
            X xZ = Y.z();
            if (t.h.a(uVar.f11142a, 1)) {
                N n5 = N.ASCENDING;
                xZ.d();
                Y.w((Y) xZ.f6410b, n5);
            } else {
                N n6 = N.DESCENDING;
                xZ.d();
                Y.w((Y) xZ.f6410b, n6);
            }
            T tQ = q(uVar.f11143b);
            xZ.d();
            Y.v((Y) xZ.f6410b, tQ);
            Y y4 = (Y) xZ.b();
            hO.d();
            d0.x((d0) hO.f6410b, y4);
        }
        if (c1048a.e()) {
            com.google.protobuf.F fY = com.google.protobuf.G.y();
            int i = (int) c1048a.f11055f;
            fY.d();
            com.google.protobuf.G.v((com.google.protobuf.G) fY.f6410b, i);
            hO.d();
            d0.A((d0) hO.f6410b, (com.google.protobuf.G) fY.b());
        }
        C1054c c1054c = c1048a.f11056g;
        if (c1054c != null) {
            C0145i c0145iZ = N2.j.z();
            List list2 = (List) c1054c.f11082b;
            c0145iZ.d();
            N2.j.v(c0145iZ.f6410b, list2);
            c0145iZ.d();
            N2.j.w(c0145iZ.f6410b, c1054c.f11081a);
            hO.d();
            d0.y((d0) hO.f6410b, c0145iZ.b());
        }
        C1054c c1054c2 = c1048a.h;
        if (c1054c2 != null) {
            C0145i c0145iZ2 = N2.j.z();
            List list3 = (List) c1054c2.f11082b;
            c0145iZ2.d();
            N2.j.v(c0145iZ2.f6410b, list3);
            boolean z4 = !c1054c2.f11081a;
            c0145iZ2.d();
            N2.j.w(c0145iZ2.f6410b, z4);
            hO.d();
            d0.z((d0) hO.f6410b, c0145iZ2.b());
        }
        h0VarA.d();
        i0.v((i0) h0VarA.f6410b, (d0) hO.b());
        return (i0) h0VarA.b();
    }

    public void y(int i) {
        int[] iArr = (int[]) this.f2867b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f2867b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2867b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2867b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f2866a = i;
        this.f2867b = obj;
        this.f2868c = obj2;
    }

    public /* synthetic */ l(Object obj) {
        this.f2866a = 7;
        this.f2868c = obj;
        this.f2867b = new ArrayList();
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f2866a = 0;
        this.f2867b = workDatabase_Impl;
        this.f2868c = new b(workDatabase_Impl, 3);
    }

    public l(AppDatabase_Impl appDatabase_Impl) {
        this.f2866a = 6;
        this.f2867b = appDatabase_Impl;
        this.f2868c = new b(appDatabase_Impl, 8);
        new h(appDatabase_Impl, 20);
    }

    public l(K0.f processor, V0.a workTaskExecutor) {
        this.f2866a = 5;
        kotlin.jvm.internal.i.e(processor, "processor");
        kotlin.jvm.internal.i.e(workTaskExecutor, "workTaskExecutor");
        this.f2867b = processor;
        this.f2868c = workTaskExecutor;
    }

    public l(B2.f fVar) {
        this.f2866a = 3;
        this.f2867b = fVar;
        this.f2868c = x(fVar).c();
    }

    public l(o0 o0Var, ScheduledFuture scheduledFuture) {
        this.f2866a = 13;
        this.f2867b = o0Var;
        f.l(scheduledFuture, "future");
        this.f2868c = scheduledFuture;
    }

    public l() {
        this.f2866a = 4;
        this.f2867b = new AtomicLong();
        this.f2868c = new AtomicLong();
    }
}
