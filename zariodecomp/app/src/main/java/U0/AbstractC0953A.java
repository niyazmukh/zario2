package u0;

import B3.RunnableC0029b;
import T0.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.niyaz.zario.data.local.AppDatabase_Impl;
import f4.C0516n;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.RejectedExecutionException;
import o0.C0767B;
import z0.C1063b;
import z0.C1064c;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\A.smali */
public abstract class AbstractC0953A {
    public static C1063b a(C1064c refHolder, SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(refHolder, "refHolder");
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        C1063b c1063b = refHolder.f11178a;
        if (c1063b != null && kotlin.jvm.internal.i.a(c1063b.f11177a, sqLiteDatabase)) {
            return c1063b;
        }
        C1063b c1063b2 = new C1063b(sqLiteDatabase);
        refHolder.f11178a = c1063b2;
        return c1063b2;
    }

    public static void b(C0767B c0767b, int i) {
        kotlin.jvm.internal.i.e(c0767b, "<this>");
        try {
            o0.x xVarE = c0767b.e();
            if ((xVarE != null ? xVarE.h(i) : null) != null) {
                c0767b.h(i, null);
                return;
            }
            Log.w("NavigationExtensions", "Navigation action " + i + " not found in current destination");
        } catch (IllegalStateException e5) {
            Log.e("NavigationExtensions", "Navigation failed: NavController not available", e5);
        } catch (Exception e6) {
            Log.e("NavigationExtensions", "Unexpected navigation error", e6);
        }
    }

    public static final List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        M3.c cVar = new M3.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.i.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.i.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new w0.c(string, i, i5, string2));
        }
        return L3.j.n0(p1.b.f(cVar));
    }

    public static final w0.d d(C1063b c1063b, String str, boolean z4) throws IOException {
        Cursor cursorQ = c1063b.q("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQ.getColumnIndex("seqno");
            int columnIndex2 = cursorQ.getColumnIndex("cid");
            int columnIndex3 = cursorQ.getColumnIndex("name");
            int columnIndex4 = cursorQ.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQ.moveToNext()) {
                    if (cursorQ.getInt(columnIndex2) >= 0) {
                        int i = cursorQ.getInt(columnIndex);
                        String columnName = cursorQ.getString(columnIndex3);
                        String str2 = cursorQ.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        kotlin.jvm.internal.i.d(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                kotlin.jvm.internal.i.d(collectionValues, "columnsMap.values");
                List listU0 = L3.j.u0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                kotlin.jvm.internal.i.d(collectionValues2, "ordersMap.values");
                w0.d dVar = new w0.d(str, z4, listU0, L3.j.u0(collectionValues2));
                S0.f.t(cursorQ, null);
                return dVar;
            }
            S0.f.t(cursorQ, null);
            return null;
        } finally {
        }
    }

    public static final Object e(AppDatabase_Impl appDatabase_Impl, X3.l lVar, Q3.j jVar) {
        m mVar;
        z zVar = new z(appDatabase_Impl, lVar, null);
        C0959G c0959g = (C0959G) jVar.getContext().get(C0959G.f10383c);
        O3.f fVar = c0959g != null ? c0959g.f10384a : null;
        if (fVar != null) {
            return f4.E.B(fVar, zVar, jVar);
        }
        O3.i context = jVar.getContext();
        C0516n c0516n = new C0516n(1, p1.b.x(jVar));
        c0516n.s();
        try {
            mVar = appDatabase_Impl.f10461c;
        } catch (RejectedExecutionException e5) {
            c0516n.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e5));
        }
        if (mVar == null) {
            kotlin.jvm.internal.i.i("internalTransactionExecutor");
            throw null;
        }
        mVar.execute(new RunnableC0029b(context, c0516n, appDatabase_Impl, zVar));
        Object objR = c0516n.r();
        P3.a aVar = P3.a.f2678a;
        return objR;
    }
}
