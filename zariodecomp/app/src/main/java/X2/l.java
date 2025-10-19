package X2;

import a.AbstractC0183a;
import android.database.Cursor;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import q.AbstractC0827d;
import q.C0828e;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\l.smali */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955C f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f3844c;

    public /* synthetic */ l(o oVar, C0955C c0955c, int i) {
        this.f3842a = i;
        this.f3844c = oVar;
        this.f3843b = c0955c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C0955C c0955c;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        int iG5;
        int iG6;
        int iG7;
        int iG8;
        int iG9;
        int iG10;
        int iG11;
        int iG12;
        boolean z4;
        int i;
        Long lValueOf;
        int i5;
        C0955C c0955c2;
        Object objV;
        int i6;
        Y2.e eVar;
        Long lValueOf2;
        int i7;
        switch (this.f3842a) {
            case 0:
                AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) this.f3844c.f3847a;
                C0955C c0955c3 = this.f3843b;
                Cursor cursorF = AbstractC0967h.f(appDatabase_Impl, c0955c3, false);
                try {
                    int iG13 = C1071b.g(cursorF, "key");
                    int iG14 = C1071b.g(cursorF, "userId");
                    int iG15 = C1071b.g(cursorF, "cycleStartTime");
                    int iG16 = C1071b.g(cursorF, "lastSyncedHourStart");
                    int iG17 = C1071b.g(cursorF, "updatedAt");
                    if (cursorF.moveToFirst()) {
                        cVar = new Y2.c(cursorF.getLong(iG15), cursorF.getLong(iG16), cursorF.getLong(iG17), cursorF.isNull(iG13) ? null : cursorF.getString(iG13), cursorF.isNull(iG14) ? null : cursorF.getString(iG14));
                    }
                    return cVar;
                } finally {
                    cursorF.close();
                    c0955c3.l();
                }
            case 1:
                C0955C c0955c4 = this.f3843b;
                o oVar = this.f3844c;
                AppDatabase_Impl appDatabase_Impl2 = (AppDatabase_Impl) oVar.f3847a;
                appDatabase_Impl2.c();
                try {
                    try {
                        Cursor cursorF2 = AbstractC0967h.f(appDatabase_Impl2, c0955c4, true);
                        try {
                            iG = C1071b.g(cursorF2, "id");
                            iG2 = C1071b.g(cursorF2, "userId");
                            iG3 = C1071b.g(cursorF2, "userEmail");
                            iG4 = C1071b.g(cursorF2, "historyDocumentId");
                            iG5 = C1071b.g(cursorF2, "planLabel");
                            iG6 = C1071b.g(cursorF2, "goalTimeMs");
                            iG7 = C1071b.g(cursorF2, "dailyAverageMs");
                            iG8 = C1071b.g(cursorF2, "finalUsageMs");
                            iG9 = C1071b.g(cursorF2, "evaluationStartTime");
                            iG10 = C1071b.g(cursorF2, "evaluationEndTime");
                            iG11 = C1071b.g(cursorF2, "metGoal");
                            iG12 = C1071b.g(cursorF2, "pointsDelta");
                            c0955c = c0955c4;
                        } catch (Throwable th) {
                            th = th;
                            c0955c = c0955c4;
                        }
                        try {
                            int iG18 = C1071b.g(cursorF2, "pointsBalanceAfter");
                            try {
                                int iG19 = C1071b.g(cursorF2, "attempts");
                                int iG20 = C1071b.g(cursorF2, "lastAttemptAt");
                                int iG21 = C1071b.g(cursorF2, "createdAt");
                                C0828e c0828e = new C0828e();
                                while (cursorF2.moveToNext()) {
                                    int i8 = iG10;
                                    int i9 = iG11;
                                    long j5 = cursorF2.getLong(iG);
                                    int i10 = iG18;
                                    if (c0828e.f9406a) {
                                        c0828e.b();
                                    }
                                    int i11 = iG12;
                                    if (AbstractC0827d.b(c0828e.f9407b, c0828e.f9409d, j5) < 0) {
                                        c0828e.e(new ArrayList(), j5);
                                    }
                                    iG10 = i8;
                                    iG11 = i9;
                                    iG18 = i10;
                                    iG12 = i11;
                                }
                                int i12 = iG18;
                                int i13 = iG12;
                                int i14 = iG10;
                                int i15 = iG11;
                                cursorF2.moveToPosition(-1);
                                oVar.a(c0828e);
                                ArrayList arrayList = new ArrayList(cursorF2.getCount());
                                while (cursorF2.moveToNext()) {
                                    long j6 = cursorF2.getLong(iG);
                                    String string = cursorF2.isNull(iG2) ? null : cursorF2.getString(iG2);
                                    String string2 = cursorF2.isNull(iG3) ? null : cursorF2.getString(iG3);
                                    String string3 = cursorF2.isNull(iG4) ? null : cursorF2.getString(iG4);
                                    String string4 = cursorF2.isNull(iG5) ? null : cursorF2.getString(iG5);
                                    long j7 = cursorF2.getLong(iG6);
                                    long j8 = cursorF2.getLong(iG7);
                                    long j9 = cursorF2.getLong(iG8);
                                    long j10 = cursorF2.getLong(iG9);
                                    int i16 = i14;
                                    long j11 = cursorF2.getLong(i16);
                                    int i17 = i15;
                                    if (cursorF2.getInt(i17) != 0) {
                                        i = i13;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                        i = i13;
                                    }
                                    int i18 = cursorF2.getInt(i);
                                    int i19 = i12;
                                    int i20 = cursorF2.getInt(i19);
                                    int i21 = iG19;
                                    int i22 = cursorF2.getInt(i21);
                                    iG19 = i21;
                                    int i23 = iG20;
                                    if (cursorF2.isNull(i23)) {
                                        iG20 = i23;
                                        i5 = iG21;
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(cursorF2.getLong(i23));
                                        iG20 = i23;
                                        i5 = iG21;
                                    }
                                    iG21 = i5;
                                    arrayList.add(new d(new Y2.d(j6, string, string2, string3, string4, j7, j8, j9, j10, j11, z4, i18, i20, i22, lValueOf, cursorF2.getLong(i5)), (ArrayList) c0828e.c(cursorF2.getLong(iG), null)));
                                    i14 = i16;
                                    iG2 = iG2;
                                    iG3 = iG3;
                                    i12 = i19;
                                    i15 = i17;
                                    i13 = i;
                                }
                                appDatabase_Impl2.o();
                                cursorF2.close();
                                c0955c.l();
                                appDatabase_Impl2.j();
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                cursorF2.close();
                                c0955c.l();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorF2.close();
                            c0955c.l();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        appDatabase_Impl2.j();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    appDatabase_Impl2.j();
                    throw th;
                }
            default:
                AppDatabase_Impl appDatabase_Impl3 = (AppDatabase_Impl) this.f3844c.f3847a;
                C0955C c0955c5 = this.f3843b;
                Cursor cursorF3 = AbstractC0967h.f(appDatabase_Impl3, c0955c5, false);
                try {
                    int iG22 = C1071b.g(cursorF3, "id");
                    int iG23 = C1071b.g(cursorF3, "parentCycleId");
                    int iG24 = C1071b.g(cursorF3, "userId");
                    int iG25 = C1071b.g(cursorF3, "userEmail");
                    int iG26 = C1071b.g(cursorF3, "planLabel");
                    int iG27 = C1071b.g(cursorF3, "cycleStartTime");
                    int iG28 = C1071b.g(cursorF3, "hourStartTime");
                    int iG29 = C1071b.g(cursorF3, "hourEndTime");
                    int iG30 = C1071b.g(cursorF3, "packageName");
                    int iG31 = C1071b.g(cursorF3, "usageMs");
                    int iG32 = C1071b.g(cursorF3, "syncType");
                    int iG33 = C1071b.g(cursorF3, "attempts");
                    int iG34 = C1071b.g(cursorF3, "lastAttemptAt");
                    c0955c2 = c0955c5;
                    try {
                        int iG35 = C1071b.g(cursorF3, "createdAt");
                        ArrayList arrayList2 = new ArrayList(cursorF3.getCount());
                        while (cursorF3.moveToNext()) {
                            long j12 = cursorF3.getLong(iG22);
                            Long lValueOf3 = cursorF3.isNull(iG23) ? null : Long.valueOf(cursorF3.getLong(iG23));
                            String string5 = cursorF3.isNull(iG24) ? null : cursorF3.getString(iG24);
                            String string6 = cursorF3.isNull(iG25) ? null : cursorF3.getString(iG25);
                            String string7 = cursorF3.isNull(iG26) ? null : cursorF3.getString(iG26);
                            long j13 = cursorF3.getLong(iG27);
                            long j14 = cursorF3.getLong(iG28);
                            long j15 = cursorF3.getLong(iG29);
                            String string8 = cursorF3.isNull(iG30) ? null : cursorF3.getString(iG30);
                            long j16 = cursorF3.getLong(iG31);
                            String string9 = cursorF3.isNull(iG32) ? null : cursorF3.getString(iG32);
                            if (string9 != null) {
                                try {
                                    objV = Y2.e.valueOf(string9);
                                } catch (Throwable th6) {
                                    objV = AbstractC0183a.v(th6);
                                }
                                i6 = iG22;
                                if (objV instanceof K3.f) {
                                    objV = null;
                                }
                                eVar = (Y2.e) objV;
                            } else {
                                i6 = iG22;
                                eVar = null;
                            }
                            int i24 = cursorF3.getInt(iG33);
                            if (cursorF3.isNull(iG34)) {
                                i7 = iG35;
                                lValueOf2 = null;
                            } else {
                                lValueOf2 = Long.valueOf(cursorF3.getLong(iG34));
                                i7 = iG35;
                            }
                            arrayList2.add(new Y2.f(j12, lValueOf3, string5, string6, string7, j13, j14, j15, string8, j16, eVar, i24, lValueOf2, cursorF3.getLong(i7)));
                            iG35 = i7;
                            iG22 = i6;
                        }
                        cursorF3.close();
                        c0955c2.l();
                        return arrayList2;
                    } catch (Throwable th7) {
                        th = th7;
                        cursorF3.close();
                        c0955c2.l();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c0955c2 = c0955c5;
                }
        }
    }
}
