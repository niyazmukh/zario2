package X2;

import android.database.Cursor;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\b.smali */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955C f3819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0.e f3820c;

    public /* synthetic */ b(S0.e eVar, C0955C c0955c, int i) {
        this.f3818a = i;
        this.f3820c = eVar;
        this.f3819b = c0955c;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorF;
        switch (this.f3818a) {
            case 0:
                AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) this.f3820c.f2851a;
                C0955C c0955c = this.f3819b;
                Cursor cursorF2 = AbstractC0967h.f(appDatabase_Impl, c0955c, false);
                try {
                    Long lValueOf = null;
                    if (cursorF2.moveToFirst() && !cursorF2.isNull(0)) {
                        lValueOf = Long.valueOf(cursorF2.getLong(0));
                    }
                    return lValueOf;
                } finally {
                    cursorF2.close();
                    c0955c.l();
                }
            case 1:
                cursorF = AbstractC0967h.f((AppDatabase_Impl) this.f3820c.f2851a, this.f3819b, false);
                try {
                    int iG = C1071b.g(cursorF, "id");
                    int iG2 = C1071b.g(cursorF, "userId");
                    int iG3 = C1071b.g(cursorF, "userEmail");
                    int iG4 = C1071b.g(cursorF, "planLabel");
                    int iG5 = C1071b.g(cursorF, "goalTimeMs");
                    int iG6 = C1071b.g(cursorF, "dailyAverageMs");
                    int iG7 = C1071b.g(cursorF, "finalUsageMs");
                    int iG8 = C1071b.g(cursorF, "evaluationStartTime");
                    int iG9 = C1071b.g(cursorF, "evaluationEndTime");
                    int iG10 = C1071b.g(cursorF, "metGoal");
                    int iG11 = C1071b.g(cursorF, "pointsDelta");
                    int iG12 = C1071b.g(cursorF, "pointsBalanceAfter");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new Y2.b(cursorF.getLong(iG), cursorF.isNull(iG2) ? null : cursorF.getString(iG2), cursorF.isNull(iG3) ? null : cursorF.getString(iG3), cursorF.isNull(iG4) ? null : cursorF.getString(iG4), cursorF.getLong(iG5), cursorF.getLong(iG6), cursorF.getLong(iG7), cursorF.getLong(iG8), cursorF.getLong(iG9), cursorF.getInt(iG10) != 0, cursorF.getInt(iG11), cursorF.getInt(iG12)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                cursorF = AbstractC0967h.f((AppDatabase_Impl) this.f3820c.f2851a, this.f3819b, false);
                try {
                    int iG13 = C1071b.g(cursorF, "id");
                    int iG14 = C1071b.g(cursorF, "userId");
                    int iG15 = C1071b.g(cursorF, "userEmail");
                    int iG16 = C1071b.g(cursorF, "planLabel");
                    int iG17 = C1071b.g(cursorF, "goalTimeMs");
                    int iG18 = C1071b.g(cursorF, "dailyAverageMs");
                    int iG19 = C1071b.g(cursorF, "finalUsageMs");
                    int iG20 = C1071b.g(cursorF, "evaluationStartTime");
                    int iG21 = C1071b.g(cursorF, "evaluationEndTime");
                    int iG22 = C1071b.g(cursorF, "metGoal");
                    int iG23 = C1071b.g(cursorF, "pointsDelta");
                    int iG24 = C1071b.g(cursorF, "pointsBalanceAfter");
                    ArrayList arrayList2 = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList2.add(new Y2.b(cursorF.getLong(iG13), cursorF.isNull(iG14) ? null : cursorF.getString(iG14), cursorF.isNull(iG15) ? null : cursorF.getString(iG15), cursorF.isNull(iG16) ? null : cursorF.getString(iG16), cursorF.getLong(iG17), cursorF.getLong(iG18), cursorF.getLong(iG19), cursorF.getLong(iG20), cursorF.getLong(iG21), cursorF.getInt(iG22) != 0, cursorF.getInt(iG23), cursorF.getInt(iG24)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.f3818a) {
            case 1:
                this.f3819b.l();
                break;
            case 2:
                this.f3819b.l();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
