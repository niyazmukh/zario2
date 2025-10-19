package u0;

import N2.n0;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import e4.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z0.C1063b;
import z2.C1071b;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\h.smali */
public abstract class AbstractC0967h {
    public static final void a(C1063b c1063b) throws IOException, SQLException {
        M3.c cVar = new M3.c(10);
        Cursor cursorQ = c1063b.q("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQ.moveToNext()) {
            try {
                cVar.add(cursorQ.getString(0));
            } finally {
            }
        }
        S0.f.t(cursorQ, null);
        ListIterator listIterator = p1.b.f(cVar).listIterator(0);
        while (true) {
            M3.a aVar = (M3.a) listIterator;
            if (!aVar.hasNext()) {
                return;
            }
            String triggerName = (String) aVar.next();
            kotlin.jvm.internal.i.d(triggerName, "triggerName");
            if (m.x0(triggerName, "room_fts_content_sync_")) {
                c1063b.m("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static String b(Context context, long j5) {
        kotlin.jvm.internal.i.e(context, "context");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j5);
        long minutes = timeUnit.toMinutes(j5) % 60;
        long seconds = timeUnit.toSeconds(j5) % 60;
        if (hours > 0) {
            String string = context.getString(2131886508, Long.valueOf(hours), Long.valueOf(minutes));
            kotlin.jvm.internal.i.d(string, "getString(...)");
            return string;
        }
        if (minutes > 0) {
            String string2 = context.getString(2131886511, Long.valueOf(minutes));
            kotlin.jvm.internal.i.d(string2, "getString(...)");
            return string2;
        }
        String string3 = context.getString(2131886512, Long.valueOf(seconds));
        kotlin.jvm.internal.i.d(string3, "getString(...)");
        return string3;
    }

    public static String c(Context context, long j5) {
        long j6 = j5 / 3600000;
        long j7 = (j5 % 3600000) / 60000;
        if (j6 > 0 && j7 > 0) {
            String string = context.getString(2131886508, Long.valueOf(j6), Long.valueOf(j7));
            kotlin.jvm.internal.i.d(string, "getString(...)");
            return string;
        }
        if (j6 > 0) {
            String string2 = context.getString(2131886509, Long.valueOf(j6));
            kotlin.jvm.internal.i.d(string2, "getString(...)");
            return string2;
        }
        if (j7 > 0) {
            String string3 = context.getString(2131886511, Long.valueOf(j7));
            kotlin.jvm.internal.i.d(string3, "getString(...)");
            return string3;
        }
        String string4 = context.getString(2131886510);
        kotlin.jvm.internal.i.d(string4, "getString(...)");
        return string4;
    }

    public static final f4.A d(x xVar) {
        Map map = xVar.f10467k;
        Object objK = map.get("QueryDispatcher");
        if (objK == null) {
            Executor executor = xVar.f10460b;
            if (executor == null) {
                kotlin.jvm.internal.i.i("internalQueryExecutor");
                throw null;
            }
            objK = f4.E.k(executor);
            map.put("QueryDispatcher", objK);
        }
        return (f4.A) objK;
    }

    public static final f4.A e(x xVar) {
        Map map = xVar.f10467k;
        Object objK = map.get("TransactionDispatcher");
        if (objK == null) {
            T0.m mVar = xVar.f10461c;
            if (mVar == null) {
                kotlin.jvm.internal.i.i("internalTransactionExecutor");
                throw null;
            }
            objK = f4.E.k(mVar);
            map.put("TransactionDispatcher", objK);
        }
        return (f4.A) objK;
    }

    public static final Cursor f(x db, y0.e sqLiteQuery, boolean z4) {
        kotlin.jvm.internal.i.e(db, "db");
        kotlin.jvm.internal.i.e(sqLiteQuery, "sqLiteQuery");
        Cursor c5 = db.m(sqLiteQuery, null);
        if (z4 && (c5 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c5;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                kotlin.jvm.internal.i.e(c5, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c5.getColumnNames(), c5.getCount());
                    while (c5.moveToNext()) {
                        Object[] objArr = new Object[c5.getColumnCount()];
                        int columnCount = c5.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c5.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c5.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c5.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c5.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c5.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    S0.f.t(c5, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c5;
    }

    public static void g(n0 n0Var, C1071b c1071b) {
        switch (t.h.c(n0Var.R())) {
            case 0:
                c1071b.m(5);
                return;
            case 1:
                c1071b.m(10);
                c1071b.m(n0Var.H() ? 1L : 0L);
                return;
            case 2:
                c1071b.m(15);
                c1071b.k(n0Var.M());
                return;
            case 3:
                double dK = n0Var.K();
                if (Double.isNaN(dK)) {
                    c1071b.m(13);
                    return;
                }
                c1071b.m(15);
                if (dK == -0.0d) {
                    c1071b.k(0.0d);
                    return;
                } else {
                    c1071b.k(dK);
                    return;
                }
            case 4:
                B0 b0Q = n0Var.Q();
                c1071b.m(20);
                c1071b.m(b0Q.z());
                c1071b.m(b0Q.y());
                return;
            case 5:
                String strP = n0Var.P();
                c1071b.m(25);
                c1071b.n(strP);
                c1071b.m(2L);
                return;
            case 6:
                c1071b.m(30);
                AbstractC0409l abstractC0409lI = n0Var.I();
                switch (c1071b.f11218a) {
                    case 0:
                        z2.e eVar = c1071b.f11219b.f11220a;
                        for (int i = 0; i < abstractC0409lI.size(); i++) {
                            eVar.b(abstractC0409lI.h(i));
                        }
                        eVar.d((byte) 0);
                        eVar.d((byte) 1);
                        break;
                    default:
                        z2.e eVar2 = c1071b.f11219b.f11220a;
                        for (int i5 = 0; i5 < abstractC0409lI.size(); i5++) {
                            eVar2.c(abstractC0409lI.h(i5));
                        }
                        eVar2.e((byte) 0);
                        eVar2.e((byte) 1);
                        break;
                }
                c1071b.m(2L);
                return;
            case 7:
                String strO = n0Var.O();
                c1071b.m(37);
                B2.n nVarL = B2.n.l(strO);
                int size = nVarL.f309a.size();
                for (int i6 = 5; i6 < size; i6++) {
                    String strG = nVarL.g(i6);
                    c1071b.m(60);
                    c1071b.n(strG);
                }
                return;
            case 8:
                Q2.b bVarL = n0Var.L();
                c1071b.m(45);
                c1071b.k(bVarL.y());
                c1071b.k(bVarL.z());
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                N2.b bVarG = n0Var.G();
                c1071b.m(50);
                Iterator it = bVarG.a().iterator();
                while (it.hasNext()) {
                    g((n0) it.next(), c1071b);
                }
                c1071b.m(2L);
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                n0 n0Var2 = B2.p.f335a;
                if (B2.p.f338d.equals(n0Var.N().y().get("__type__"))) {
                    c1071b.m(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return;
                }
                if (B2.p.j(n0Var)) {
                    Map mapY = n0Var.N().y();
                    c1071b.m(53);
                    int iA = ((n0) mapY.get("value")).G().A();
                    c1071b.m(15);
                    c1071b.m(iA);
                    c1071b.m(25);
                    c1071b.n("value");
                    g((n0) mapY.get("value"), c1071b);
                    return;
                }
                N2.E eN = n0Var.N();
                c1071b.m(55);
                for (Map.Entry entry : eN.y().entrySet()) {
                    String str = (String) entry.getKey();
                    n0 n0Var3 = (n0) entry.getValue();
                    c1071b.m(25);
                    c1071b.n(str);
                    g(n0Var3, c1071b);
                }
                c1071b.m(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type ".concat(B.a.z(n0Var.R())));
        }
    }
}
