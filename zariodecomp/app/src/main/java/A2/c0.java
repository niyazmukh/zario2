package A2;

import a.AbstractC0183a;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\c0.smali */
public final /* synthetic */ class c0 implements F2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0.l f175b;

    public /* synthetic */ c0(S0.l lVar, int i) {
        this.f174a = i;
        this.f175b = lVar;
    }

    @Override // F2.k
    public final void a(Object obj) throws SQLException {
        int i = this.f174a;
        Cursor cursor = (Cursor) obj;
        S0.l lVar = this.f175b;
        lVar.getClass();
        switch (i) {
            case 0:
                int i5 = cursor.getInt(0);
                try {
                    D2.g gVarM = D2.g.M(cursor.getBlob(1));
                    com.google.protobuf.C c5 = (com.google.protobuf.C) gVarM.j(5);
                    if (!c5.f6409a.equals(gVarM)) {
                        c5.d();
                        com.google.protobuf.C.e(c5.f6410b, gVarM);
                    }
                    D2.e eVar = (D2.e) c5;
                    eVar.d();
                    D2.g.y((D2.g) eVar.f6410b);
                    ((SQLiteDatabase) lVar.f2867b).execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((D2.g) eVar.b()).d(), Integer.valueOf(i5)});
                    return;
                } catch (com.google.protobuf.N unused) {
                    AbstractC0183a.z("Failed to decode Query data for target %s", Integer.valueOf(i5));
                    throw null;
                }
            case 1:
                int i6 = cursor.getInt(0);
                try {
                    ((SQLiteDatabase) lVar.f2867b).execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{((K2.c) lVar.f2868c).r(D2.g.M(cursor.getBlob(1))).f193a.b(), Integer.valueOf(i6)});
                    return;
                } catch (com.google.protobuf.N unused2) {
                    AbstractC0183a.z("Failed to decode Query data for target %s", Integer.valueOf(i6));
                    throw null;
                }
            default:
                String string = cursor.getString(0);
                W w4 = new W(new Object[]{string, Long.valueOf(cursor.getLong(1))}, 0);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) lVar.f2867b;
                Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(w4, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (cursorRawQueryWithFactory.moveToNext()) {
                    try {
                        int i7 = cursorRawQueryWithFactory.getInt(0);
                        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                        sQLiteStatementCompileStatement.bindString(1, string);
                        sQLiteStatementCompileStatement.bindLong(2, i7);
                        AbstractC0183a.N(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", string, Integer.valueOf(i7));
                        sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{string, Integer.valueOf(i7)});
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
                cursorRawQueryWithFactory.close();
                return;
        }
    }
}
