package z0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import t.h;
import u0.AbstractC0953A;
import u0.C0954B;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z0.1\f.smali */
public final class f extends SQLiteOpenHelper {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11183l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11184a;

    /* renamed from: b, reason: collision with root package name */
    public final C1064c f11185b;

    /* renamed from: c, reason: collision with root package name */
    public final C0954B f11186c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11187d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11188e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.a f11189f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11190k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final C1064c c1064c, final C0954B callback, boolean z4) {
        super(context, str, null, callback.f10357a, new DatabaseErrorHandler() { // from class: z0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                C0954B callback2 = callback;
                kotlin.jvm.internal.i.e(callback2, "$callback");
                C1064c c1064c2 = c1064c;
                int i = f.f11183l;
                kotlin.jvm.internal.i.d(dbObj, "dbObj");
                C1063b c1063bA = AbstractC0953A.a(c1064c2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c1063bA + ".path");
                SQLiteDatabase sQLiteDatabase = c1063bA.f11177a;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        C0954B.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                kotlin.jvm.internal.i.d(obj, "p.second");
                                C0954B.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                C0954B.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c1063bA.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f11184a = context;
        this.f11185b = c1064c;
        this.f11186c = callback;
        this.f11187d = z4;
        if (str == null) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.d(str, "randomUUID().toString()");
        }
        this.f11189f = new A0.a(str, context.getCacheDir(), false);
    }

    public final C1063b a(boolean z4) throws IOException {
        A0.a aVar = this.f11189f;
        try {
            aVar.a((this.f11190k || getDatabaseName() == null) ? false : true);
            this.f11188e = false;
            SQLiteDatabase sQLiteDatabaseL = l(z4);
            if (!this.f11188e) {
                C1063b c1063bE = e(sQLiteDatabaseL);
                aVar.b();
                return c1063bE;
            }
            close();
            C1063b c1063bA = a(z4);
            aVar.b();
            return c1063bA;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        A0.a aVar = this.f11189f;
        try {
            aVar.a(aVar.f28a);
            super.close();
            this.f11185b.f11178a = null;
            this.f11190k = false;
        } finally {
            aVar.b();
        }
    }

    public final C1063b e(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC0953A.a(this.f11185b, sqLiteDatabase);
    }

    public final SQLiteDatabase k(boolean z4) {
        if (z4) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            kotlin.jvm.internal.i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        kotlin.jvm.internal.i.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase l(boolean z4) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z5 = this.f11190k;
        Context context = this.f11184a;
        if (databaseName != null && !z5 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return k(z4);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return this.k(z4);
            } catch (Throwable th) {
                super.close();
                if (th instanceof e) {
                    e eVar = th;
                    int iC = h.c(eVar.f11181a);
                    Throwable th2 = eVar.f11182b;
                    if (iC == 0 || iC == 1 || iC == 2 || iC == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f11187d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return this.k(z4);
                } catch (e e5) {
                    throw e5.f11182b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        boolean z4 = this.f11188e;
        C0954B c0954b = this.f11186c;
        if (!z4 && c0954b.f10357a != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            e(db);
            c0954b.getClass();
        } catch (Throwable th) {
            throw new e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f11186c.c(e(sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i5) {
        kotlin.jvm.internal.i.e(db, "db");
        this.f11188e = true;
        try {
            this.f11186c.e(e(db), i, i5);
        } catch (Throwable th) {
            throw new e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        if (!this.f11188e) {
            try {
                this.f11186c.d(e(db));
            } catch (Throwable th) {
                throw new e(5, th);
            }
        }
        this.f11190k = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i5) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        this.f11188e = true;
        try {
            this.f11186c.e(e(sqLiteDatabase), i, i5);
        } catch (Throwable th) {
            throw new e(3, th);
        }
    }
}
