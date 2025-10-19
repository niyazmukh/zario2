package v3;

import A2.C0009i;
import android.database.Cursor;
import com.niyaz.zario.usage.storage.UsageAggregationDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import u0.AbstractC0967h;
import u0.C0955C;
import z2.C1071b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v3.1\d.smali */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955C f10680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0009i f10681c;

    public /* synthetic */ d(C0009i c0009i, C0955C c0955c, int i) {
        this.f10679a = i;
        this.f10681c = c0009i;
        this.f10680b = c0955c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorF;
        switch (this.f10679a) {
            case 0:
                cursorF = AbstractC0967h.f((UsageAggregationDatabase_Impl) this.f10681c.f204b, this.f10680b, false);
                try {
                    int iG = C1071b.g(cursorF, "packageName");
                    int iG2 = C1071b.g(cursorF, "startMs");
                    int iG3 = C1071b.g(cursorF, "endMs");
                    int iG4 = C1071b.g(cursorF, "durationMs");
                    int iG5 = C1071b.g(cursorF, "dayStartMs");
                    int iG6 = C1071b.g(cursorF, "taskRootPackageName");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new e(cursorF.isNull(iG) ? null : cursorF.getString(iG), cursorF.getLong(iG2), cursorF.getLong(iG3), cursorF.getLong(iG4), cursorF.getLong(iG5), cursorF.isNull(iG6) ? null : cursorF.getString(iG6)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                cursorF = AbstractC0967h.f((UsageAggregationDatabase_Impl) this.f10681c.f204b, this.f10680b, false);
                try {
                    int iG7 = C1071b.g(cursorF, "packageName");
                    int iG8 = C1071b.g(cursorF, "startMs");
                    int iG9 = C1071b.g(cursorF, "endMs");
                    int iG10 = C1071b.g(cursorF, "durationMs");
                    int iG11 = C1071b.g(cursorF, "dayStartMs");
                    int iG12 = C1071b.g(cursorF, "taskRootPackageName");
                    ArrayList arrayList2 = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList2.add(new e(cursorF.isNull(iG7) ? null : cursorF.getString(iG7), cursorF.getLong(iG8), cursorF.getLong(iG9), cursorF.getLong(iG10), cursorF.getLong(iG11), cursorF.isNull(iG12) ? null : cursorF.getString(iG12)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                cursorF = AbstractC0967h.f((UsageAggregationDatabase_Impl) this.f10681c.f204b, this.f10680b, false);
                try {
                    int iG13 = C1071b.g(cursorF, "packageName");
                    int iG14 = C1071b.g(cursorF, "startMs");
                    int iG15 = C1071b.g(cursorF, "endMs");
                    int iG16 = C1071b.g(cursorF, "durationMs");
                    int iG17 = C1071b.g(cursorF, "dayStartMs");
                    int iG18 = C1071b.g(cursorF, "taskRootPackageName");
                    if (cursorF.moveToFirst()) {
                        eVar = new e(cursorF.isNull(iG13) ? null : cursorF.getString(iG13), cursorF.getLong(iG14), cursorF.getLong(iG15), cursorF.getLong(iG16), cursorF.getLong(iG17), cursorF.isNull(iG18) ? null : cursorF.getString(iG18));
                    }
                    return eVar;
                } finally {
                }
        }
    }
}
