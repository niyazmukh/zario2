package A2;

import E2.C0106i;
import N2.AbstractC0156x;
import N2.C0142f;
import N2.C0143g;
import N2.C0144h;
import N2.q0;
import a.AbstractC0183a;
import android.animation.Animator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.protobuf.AbstractC0409l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import q2.C0849a;
import s2.AbstractC0869c;
import y2.C1049B;

/* renamed from: A2.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\k.1.smali */
public final /* synthetic */ class C0011k implements F2.q, Continuation, q2.d, I.f, H2.a, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f211c;

    public /* synthetic */ C0011k(int i, Object obj, Object obj2) {
        this.f209a = i;
        this.f210b = obj;
        this.f211c = obj2;
    }

    @Override // q2.d
    public Object a(E2.G g3) {
        String strValueOf;
        switch (this.f209a) {
            case 4:
                Context context = (Context) g3.a(Context.class);
                switch (((E2.n) this.f211c).f1474a) {
                    case 5:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 6:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 7:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        strValueOf = "";
                                        break;
                                    } else {
                                        strValueOf = "embedded";
                                        break;
                                    }
                                } else {
                                    strValueOf = "auto";
                                    break;
                                }
                            } else {
                                strValueOf = "watch";
                                break;
                            }
                        } else {
                            strValueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new K2.a((String) this.f210b, strValueOf);
            default:
                String str = (String) this.f210b;
                C0849a c0849a = (C0849a) this.f211c;
                try {
                    Trace.beginSection(str);
                    return c0849a.f9472e.a(g3);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // H2.a
    public void c(H2.b bVar) {
        ((H2.a) this.f210b).c(bVar);
        ((H2.a) this.f211c).c(bVar);
    }

    @Override // I.f
    public void d() {
        g0.V operation = (g0.V) this.f211c;
        kotlin.jvm.internal.i.e(operation, "$operation");
        ((Animator) this.f210b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // F2.q
    public Object get() {
        Long lValueOf;
        Long lValueOf2;
        switch (this.f209a) {
            case 0:
                r rVar = (r) this.f210b;
                C2.j jVar = (C2.j) this.f211c;
                C2.i iVar = (C2.i) jVar.f1092b;
                rVar.f235c.e(iVar, (AbstractC0409l) jVar.f1095e);
                Iterator it = iVar.b().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = (ArrayList) jVar.f1094d;
                    List list = iVar.f1090d;
                    int i = 0;
                    if (!zHasNext) {
                        rVar.f235c.f(iVar);
                        rVar.f235c.b();
                        rVar.f236d.d(iVar.f1087a);
                        C0009i c0009i = rVar.f238f;
                        HashSet hashSet = new HashSet();
                        while (i < arrayList.size()) {
                            if (!((C2.k) arrayList.get(i)).f1098b.isEmpty()) {
                                hashSet.add(((C2.h) list.get(i)).f1084a);
                            }
                            i++;
                        }
                        c0009i.d0(((J) c0009i.f204b).h(hashSet));
                        return rVar.f238f.G(iVar.b());
                    }
                    B2.h hVar = (B2.h) it.next();
                    J j5 = rVar.f237e;
                    B2.l lVarF = j5.f(hVar);
                    B2.o oVar = (B2.o) ((AbstractC0869c) jVar.f1096f).g(hVar);
                    AbstractC0183a.N(oVar != null, "docVersions should contain every doc in the write.", new Object[0]);
                    if (lVarF.f324c.compareTo(oVar) < 0) {
                        int size = list.size();
                        AbstractC0183a.N(arrayList.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                        while (i < size) {
                            C2.h hVar2 = (C2.h) list.get(i);
                            if (hVar2.f1084a.equals(lVarF.f322a)) {
                                hVar2.b(lVarF, (C2.k) arrayList.get(i));
                            }
                            i++;
                        }
                        if (lVarF.e()) {
                            j5.g(lVarF, (B2.o) jVar.f1093c);
                        }
                    }
                }
            default:
                SparseArray sparseArray = ((r) this.f210b).f240j;
                C0024y c0024y = (C0024y) this.f211c;
                C0021v c0021v = c0024y.f261b;
                long jLongValue = -1;
                if (c0021v.f254a == -1) {
                    p1.b.p(1, "LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
                    return new C0022w();
                }
                Object obj = c0024y.f260a;
                X x3 = (X) ((Q) obj).f125b;
                Cursor cursorH0 = x3.z0("PRAGMA page_count").h0();
                try {
                    if (cursorH0.moveToFirst()) {
                        lValueOf = Long.valueOf(cursorH0.getLong(0));
                        cursorH0.close();
                    } else {
                        cursorH0.close();
                        lValueOf = null;
                    }
                    long jLongValue2 = lValueOf.longValue();
                    Cursor cursorH02 = x3.z0("PRAGMA page_size").h0();
                    try {
                        Long lValueOf3 = cursorH02.moveToFirst() ? Long.valueOf(cursorH02.getLong(0)) : null;
                        cursorH02.close();
                        long jLongValue3 = lValueOf3.longValue() * jLongValue2;
                        long j6 = c0021v.f254a;
                        if (jLongValue3 < j6) {
                            p1.b.p(1, "LruGarbageCollector", "Garbage collection skipped; Cache size " + jLongValue3 + " is lower than threshold " + j6, new Object[0]);
                            return new C0022w();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        X x4 = (X) ((Q) obj).f125b;
                        long j7 = x4.f146d.f183f;
                        Cursor cursorH03 = x4.z0("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").h0();
                        try {
                            if (cursorH03.moveToFirst()) {
                                lValueOf2 = Long.valueOf(cursorH03.getLong(0));
                                cursorH03.close();
                            } else {
                                cursorH03.close();
                                lValueOf2 = null;
                            }
                            int iLongValue = (int) ((10 / 100.0f) * (lValueOf2.longValue() + j7));
                            if (iLongValue > 1000) {
                                p1.b.p(1, "LruGarbageCollector", B.a.g(iLongValue, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                                iLongValue = 1000;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (iLongValue != 0) {
                                final C0023x c0023x = new C0023x();
                                c0023x.f256a = iLongValue;
                                c0023x.f257b = new PriorityQueue(iLongValue, C0023x.f255c);
                                final int i5 = 0;
                                F2.k kVar = new F2.k() { // from class: A2.t
                                    @Override // F2.k
                                    public final void a(Object obj2) {
                                        switch (i5) {
                                            case 0:
                                                c0023x.a(Long.valueOf(((g0) obj2).f195c));
                                                break;
                                            default:
                                                c0023x.a((Long) obj2);
                                                break;
                                        }
                                    }
                                };
                                d0 d0Var = ((X) ((Q) obj).f125b).f146d;
                                Cursor cursorH04 = d0Var.f178a.z0("SELECT target_proto FROM targets").h0();
                                while (cursorH04.moveToNext()) {
                                    try {
                                        kVar.a(d0Var.j(cursorH04.getBlob(0)));
                                    } finally {
                                    }
                                }
                                cursorH04.close();
                                final int i6 = 1;
                                F2.k kVar2 = new F2.k() { // from class: A2.t
                                    @Override // F2.k
                                    public final void a(Object obj2) {
                                        switch (i6) {
                                            case 0:
                                                c0023x.a(Long.valueOf(((g0) obj2).f195c));
                                                break;
                                            default:
                                                c0023x.a((Long) obj2);
                                                break;
                                        }
                                    }
                                };
                                cursorH02 = ((X) ((Q) obj).f125b).z0("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").h0();
                                while (cursorH02.moveToNext()) {
                                    try {
                                        kVar2.a(Long.valueOf(cursorH02.getLong(0)));
                                    } finally {
                                    }
                                }
                                cursorH02.close();
                                jLongValue = ((Long) ((PriorityQueue) c0023x.f257b).peek()).longValue();
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            d0 d0Var2 = ((X) ((Q) obj).f125b).f146d;
                            int[] iArr = new int[1];
                            C0009i c0009iZ0 = d0Var2.f178a.z0("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                            c0009iZ0.v(Long.valueOf(jLongValue));
                            c0009iZ0.C(new S(d0Var2, sparseArray, iArr, 1));
                            d0Var2.l();
                            int i7 = iArr[0];
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            final Q q5 = (Q) obj;
                            q5.getClass();
                            final int[] iArr2 = new int[1];
                            final ArrayList arrayList2 = new ArrayList();
                            final B2.n[] nVarArr = {B2.n.f332b};
                            while (true) {
                                X x5 = (X) q5.f125b;
                                long j8 = jCurrentTimeMillis4;
                                C0009i c0009iZ02 = x5.z0("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                                long j9 = jLongValue;
                                int i8 = iLongValue;
                                c0009iZ02.v(Long.valueOf(jLongValue), AbstractC0156x.C(nVarArr[0]), 100);
                                if (c0009iZ02.C(new F2.k() { // from class: A2.P
                                    @Override // F2.k
                                    public final void a(Object obj2) {
                                        boolean zMoveToFirst;
                                        Q q6 = q5;
                                        q6.getClass();
                                        B2.n nVarZ = AbstractC0156x.z(((Cursor) obj2).getString(0));
                                        B2.h hVar3 = new B2.h(nVarZ);
                                        boolean zB = ((S0.c) q6.f128e).b(hVar3);
                                        X x6 = (X) q6.f125b;
                                        B2.n nVar = hVar3.f315a;
                                        if (zB) {
                                            zMoveToFirst = true;
                                        } else {
                                            C0009i c0009iZ03 = x6.z0("SELECT 1 FROM document_mutations WHERE path = ?");
                                            c0009iZ03.v(AbstractC0156x.C(nVar));
                                            Cursor cursorH05 = c0009iZ03.h0();
                                            try {
                                                zMoveToFirst = cursorH05.moveToFirst();
                                                cursorH05.close();
                                            } catch (Throwable th) {
                                                if (cursorH05 != null) {
                                                    try {
                                                        cursorH05.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!zMoveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList2.add(hVar3);
                                            x6.y0("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC0156x.C(nVar));
                                        }
                                        nVarArr[0] = nVarZ;
                                    }
                                }) != 100) {
                                    x5.f147e.a(arrayList2);
                                    int i9 = iArr2[0];
                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                    StringBuilder sbB = t.h.b("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
                                    Locale locale = Locale.ROOT;
                                    sbB.append("\tDetermined least recently used " + i8 + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
                                    StringBuilder sbB2 = t.h.b(sbB.toString());
                                    sbB2.append("\tRemoved " + i7 + " targets in " + (j8 - jCurrentTimeMillis3) + "ms\n");
                                    StringBuilder sbB3 = t.h.b(sbB2.toString());
                                    sbB3.append("\tRemoved " + i9 + " documents in " + (jCurrentTimeMillis5 - j8) + "ms\n");
                                    StringBuilder sbB4 = t.h.b(sbB3.toString());
                                    StringBuilder sb = new StringBuilder("Total Duration: ");
                                    sb.append(jCurrentTimeMillis5 - jCurrentTimeMillis);
                                    sb.append("ms");
                                    sbB4.append(sb.toString());
                                    p1.b.p(1, "LruGarbageCollector", sbB4.toString(), new Object[0]);
                                    return new C0022w();
                                }
                                jCurrentTimeMillis4 = j8;
                                iLongValue = i8;
                                jLongValue = j9;
                            }
                        } finally {
                            if (cursorH03 == null) {
                                throw th;
                            }
                            try {
                                cursorH03.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        if (cursorH02 == null) {
                            throw th;
                        }
                        try {
                            cursorH02.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    if (cursorH0 == null) {
                        throw th;
                    }
                    try {
                        cursorH0.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = 2;
        switch (this.f209a) {
            case 8:
                T t4 = (T) this.f210b;
                C1049B c1049b = (C1049B) this.f211c;
                t4.getClass();
                if (!task.isSuccessful()) {
                    t4.x(task);
                    return;
                }
                AbstractC0183a.N(!c1049b.f11061d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
                HashSet hashSet = new HashSet(c1049b.f11059b.keySet());
                Iterator it = c1049b.f11060c.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((C2.h) it.next()).f1084a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    B2.h hVar = (B2.h) it2.next();
                    c1049b.f11060c.add(new C2.r(hVar, c1049b.a(hVar)));
                }
                c1049b.f11061d = true;
                C0106i c0106i = c1049b.f11058a;
                ArrayList arrayList = c1049b.f11060c;
                c0106i.getClass();
                C0142f c0142fY = C0143g.y();
                String str = (String) c0106i.f1455a.f2868c;
                c0142fY.d();
                C0143g.v((C0143g) c0142fY.f6410b, str);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    q0 q0VarT = c0106i.f1455a.t((C2.h) it3.next());
                    c0142fY.d();
                    C0143g.w((C0143g) c0142fY.f6410b, q0VarT);
                }
                E2.q qVar = c0106i.f1457c;
                com.google.android.gms.common.api.internal.F f2 = AbstractC0156x.f2608a;
                if (f2 == null) {
                    synchronized (AbstractC0156x.class) {
                        try {
                            f2 = AbstractC0156x.f2608a;
                            if (f2 == null) {
                                z3.b0 b0Var = z3.b0.f11281a;
                                String strB = com.google.android.gms.common.api.internal.F.b("google.firestore.v1.Firestore", "Commit");
                                C0143g c0143gX = C0143g.x();
                                com.google.protobuf.v vVar = G3.c.f1874a;
                                f2 = new com.google.android.gms.common.api.internal.F(b0Var, strB, new G3.b(c0143gX), new G3.b(C0144h.w()), true);
                                AbstractC0156x.f2608a = f2;
                            }
                        } finally {
                        }
                    }
                }
                C0143g c0143g = (C0143g) c0142fY.b();
                qVar.getClass();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                E2.t tVar = qVar.f1485d;
                tVar.f1493a.continueWithTask(tVar.f1494b.f1704a, new C0011k(3, tVar, f2)).addOnCompleteListener(qVar.f1482a.f1704a, new C0017q(qVar, taskCompletionSource, c0143g, i));
                taskCompletionSource.getTask().continueWith(c0106i.f1456b.f1704a, new C0004d(c0106i, i)).continueWithTask(F2.o.f1725b, new E2.n(16)).addOnCompleteListener(((F2.f) t4.f133a).f1704a, new C0011k(9, t4, task));
                return;
            default:
                T t5 = (T) this.f210b;
                t5.getClass();
                if (task.isSuccessful()) {
                    ((TaskCompletionSource) t5.f138f).setResult(((Task) this.f211c).getResult());
                    return;
                } else {
                    t5.x(task);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        E2.t tVar = (E2.t) this.f210b;
        tVar.getClass();
        return Tasks.forResult(((z3.P) task.getResult()).n((com.google.android.gms.common.api.internal.F) this.f211c, tVar.f1495c));
    }
}
