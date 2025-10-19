package z0;

import android.database.sqlite.SQLiteStatement;
import y0.InterfaceC1045d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z0.1\i.smali */
public final class i extends h implements InterfaceC1045d {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f11198b;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f11198b = sQLiteStatement;
    }

    public final long a() {
        return this.f11198b.executeInsert();
    }

    public final int e() {
        return this.f11198b.executeUpdateDelete();
    }
}
