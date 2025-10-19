package A2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import z0.C1062a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\W.smali */
public final /* synthetic */ class W implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143b;

    public /* synthetic */ W(Object obj, int i) {
        this.f142a = i;
        this.f143b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f142a) {
            case 0:
                X.x0(sQLiteQuery, (Object[]) this.f143b);
                break;
            case 1:
                y0.e query = (y0.e) this.f143b;
                kotlin.jvm.internal.i.e(query, "$query");
                kotlin.jvm.internal.i.b(sQLiteQuery);
                query.a(new z0.h(sQLiteQuery));
                break;
            default:
                C1062a c1062a = (C1062a) this.f143b;
                kotlin.jvm.internal.i.b(sQLiteQuery);
                c1062a.f11174a.a(new z0.h(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
