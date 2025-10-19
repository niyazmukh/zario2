package S0;

import A2.C0009i;
import J0.C0111e;
import N2.n0;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\r.smali */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2918c;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f2916a = i;
        this.f2918c = obj;
        this.f2917b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [S1.o, X2.m] */
    /* JADX WARN: Type inference failed for: r1v27, types: [S0.s, S1.o, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppDatabase_Impl appDatabase_Impl;
        UsageAggregationDatabase_Impl usageAggregationDatabase_Impl;
        switch (this.f2916a) {
            case 0:
                t tVar = (t) this.f2918c;
                WorkDatabase_Impl workDatabase_Impl = tVar.f2920a;
                workDatabase_Impl.c();
                try {
                    Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, (C0955C) this.f2917b, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorF.moveToNext()) {
                            String string = cursorF.getString(0);
                            if (((ArrayList) map.get(string)) == null) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorF.getString(0);
                            if (((ArrayList) map2.get(string2)) == null) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorF.moveToPosition(-1);
                        tVar.b(map);
                        tVar.a(map2);
                        ArrayList arrayList = new ArrayList(cursorF.getCount());
                        while (cursorF.moveToNext()) {
                            byte[] blob = null;
                            String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                            int I4 = r1.d.I(cursorF.getInt(1));
                            J0.h hVarA = J0.h.a(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                            int i = cursorF.getInt(3);
                            int i5 = cursorF.getInt(4);
                            long j5 = cursorF.getLong(13);
                            long j6 = cursorF.getLong(14);
                            long j7 = cursorF.getLong(15);
                            int iF = r1.d.F(cursorF.getInt(16));
                            long j8 = cursorF.getLong(17);
                            long j9 = cursorF.getLong(18);
                            int i6 = cursorF.getInt(19);
                            long j10 = cursorF.getLong(20);
                            int i7 = cursorF.getInt(21);
                            int iG = r1.d.G(cursorF.getInt(5));
                            boolean z4 = cursorF.getInt(6) != 0;
                            boolean z5 = cursorF.getInt(7) != 0;
                            boolean z6 = cursorF.getInt(8) != 0;
                            boolean z7 = cursorF.getInt(9) != 0;
                            long j11 = cursorF.getLong(10);
                            long j12 = cursorF.getLong(11);
                            if (!cursorF.isNull(12)) {
                                blob = cursorF.getBlob(12);
                            }
                            C0111e c0111e = new C0111e(iG, z4, z5, z6, z7, j11, j12, r1.d.j(blob));
                            ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) map2.get(cursorF.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new p(string3, I4, hVarA, j5, j6, j7, c0111e, i, iF, j8, j9, i6, i5, j10, i7, arrayList3, arrayList4));
                        }
                        workDatabase_Impl.o();
                        cursorF.close();
                        return arrayList;
                    } finally {
                        cursorF.close();
                    }
                } finally {
                    workDatabase_Impl.j();
                }
            case 1:
                e eVar = (e) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) eVar.f2851a;
                appDatabase_Impl.c();
                try {
                    ((b) eVar.f2852b).y((Y2.b) this.f2917b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case 2:
                e eVar2 = (e) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) eVar2.f2851a;
                appDatabase_Impl.c();
                try {
                    ((b) eVar2.f2852b).x((ArrayList) this.f2917b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case 3:
                l lVar = (l) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) lVar.f2867b;
                appDatabase_Impl.c();
                try {
                    ((b) lVar.f2868c).x((Iterable) this.f2917b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case 4:
                X2.o oVar = (X2.o) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) oVar.f3847a;
                appDatabase_Impl.c();
                try {
                    ((b) oVar.f3848b).y((Y2.c) this.f2917b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case 5:
                X2.o oVar2 = (X2.o) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) oVar2.f3847a;
                appDatabase_Impl.c();
                try {
                    ?? r12 = (X2.m) oVar2.f3850d;
                    ArrayList arrayList5 = (ArrayList) this.f2917b;
                    z0.i iVarA = r12.a();
                    try {
                        M3.c cVar = new M3.c(10);
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            r12.v(iVarA, it.next());
                            cVar.add(Long.valueOf(iVarA.a()));
                        }
                        M3.c cVarF = p1.b.f(cVar);
                        r12.q(iVarA);
                        appDatabase_Impl.o();
                        return cVarF;
                    } finally {
                        r12.q(iVarA);
                    }
                } finally {
                }
            case 6:
                X2.o oVar3 = (X2.o) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) oVar3.f3847a;
                appDatabase_Impl.c();
                try {
                    ?? r13 = (s) oVar3.f3853g;
                    List entities = (List) this.f2917b;
                    r13.getClass();
                    kotlin.jvm.internal.i.e(entities, "entities");
                    z0.i iVarA2 = r13.a();
                    try {
                        Iterator it2 = entities.iterator();
                        while (it2.hasNext()) {
                            r13.v(iVarA2, it2.next());
                            iVarA2.e();
                        }
                        r13.q(iVarA2);
                        appDatabase_Impl.o();
                        appDatabase_Impl.j();
                        return K3.k.f2288a;
                    } catch (Throwable th) {
                        r13.q(iVarA2);
                        throw th;
                    }
                } finally {
                }
            case 7:
                X2.o oVar4 = (X2.o) this.f2918c;
                appDatabase_Impl = (AppDatabase_Impl) oVar4.f3847a;
                appDatabase_Impl.c();
                try {
                    ((X2.n) oVar4.i).w((Y2.f) this.f2917b);
                    appDatabase_Impl.o();
                    appDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case 8:
                C0009i c0009i = (C0009i) this.f2918c;
                usageAggregationDatabase_Impl = (UsageAggregationDatabase_Impl) c0009i.f204b;
                usageAggregationDatabase_Impl.c();
                try {
                    ((b) c0009i.f205c).x((List) this.f2917b);
                    usageAggregationDatabase_Impl.o();
                    usageAggregationDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                UsageAggregationDatabase_Impl usageAggregationDatabase_Impl2 = (UsageAggregationDatabase_Impl) ((C0009i) this.f2918c).f204b;
                C0955C c0955c = (C0955C) this.f2917b;
                Cursor cursorF2 = AbstractC0967h.f(usageAggregationDatabase_Impl2, c0955c, false);
                try {
                    int iG2 = C1071b.g(cursorF2, "id");
                    int iG3 = C1071b.g(cursorF2, "timestampMs");
                    int iG4 = C1071b.g(cursorF2, "source");
                    int iG5 = C1071b.g(cursorF2, "packageName");
                    int iG6 = C1071b.g(cursorF2, "activityClass");
                    int iG7 = C1071b.g(cursorF2, "state");
                    int iG8 = C1071b.g(cursorF2, "confidenceOrdinal");
                    int iG9 = C1071b.g(cursorF2, "extras");
                    ArrayList arrayList6 = new ArrayList(cursorF2.getCount());
                    while (cursorF2.moveToNext()) {
                        arrayList6.add(new v3.b(cursorF2.getLong(iG2), cursorF2.getLong(iG3), cursorF2.isNull(iG4) ? null : cursorF2.getString(iG4), cursorF2.isNull(iG5) ? null : cursorF2.getString(iG5), cursorF2.isNull(iG6) ? null : cursorF2.getString(iG6), cursorF2.isNull(iG7) ? null : cursorF2.getString(iG7), cursorF2.getInt(iG8), cursorF2.isNull(iG9) ? null : cursorF2.getString(iG9)));
                    }
                    return arrayList6;
                } finally {
                    cursorF2.close();
                    c0955c.l();
                }
            default:
                C0009i c0009i2 = (C0009i) this.f2918c;
                usageAggregationDatabase_Impl = (UsageAggregationDatabase_Impl) c0009i2.f204b;
                usageAggregationDatabase_Impl.c();
                try {
                    ((b) c0009i2.f205c).x((ArrayList) this.f2917b);
                    usageAggregationDatabase_Impl.o();
                    usageAggregationDatabase_Impl.j();
                    return K3.k.f2288a;
                } finally {
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.f2916a) {
            case 0:
                ((C0955C) this.f2917b).l();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
