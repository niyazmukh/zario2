package A2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\V.smali */
public final class V extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final K2.c f140a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f141b;

    public V(Context context, K2.c cVar, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 18);
        this.f140a = cVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f141b = true;
        sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (!this.f141b) {
            onConfigure(sQLiteDatabase);
        }
        new S0.l(2, sQLiteDatabase, this.f140a).E(0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        if (this.f141b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f141b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i5) throws SQLException {
        if (!this.f141b) {
            onConfigure(sQLiteDatabase);
        }
        new S0.l(2, sQLiteDatabase, this.f140a).E(i);
    }
}
