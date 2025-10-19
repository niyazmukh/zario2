package z0;

import A2.W;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import g2.C0580c;
import java.io.Closeable;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z0.1\b.smali */
public final class C1063b implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11175b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f11176c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f11177a;

    public C1063b(SQLiteDatabase delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f11177a = delegate;
    }

    public final void a() {
        this.f11177a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11177a.close();
    }

    public final void e() {
        this.f11177a.beginTransactionNonExclusive();
    }

    public final i k(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.f11177a.compileStatement(str);
        kotlin.jvm.internal.i.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new i(sQLiteStatementCompileStatement);
    }

    public final void l() {
        this.f11177a.endTransaction();
    }

    public final void m(String sql) throws SQLException {
        kotlin.jvm.internal.i.e(sql, "sql");
        this.f11177a.execSQL(sql);
    }

    public final void n(Object[] bindArgs) throws SQLException {
        kotlin.jvm.internal.i.e(bindArgs, "bindArgs");
        this.f11177a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    public final boolean o() {
        return this.f11177a.inTransaction();
    }

    public final boolean p() {
        SQLiteDatabase sQLiteDatabase = this.f11177a;
        kotlin.jvm.internal.i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor q(String query) {
        kotlin.jvm.internal.i.e(query, "query");
        return r(new C0580c(query, 1));
    }

    public final Cursor r(y0.e query) {
        kotlin.jvm.internal.i.e(query, "query");
        Cursor cursorRawQueryWithFactory = this.f11177a.rawQueryWithFactory(new W(new C1062a(query), 2), query.e(), f11176c, null);
        kotlin.jvm.internal.i.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final void s() {
        this.f11177a.setTransactionSuccessful();
    }
}
