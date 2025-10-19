package A2;

import a.AbstractC0183a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import x2.C1038d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\X.smali */
public final class X extends S0.f {

    /* renamed from: b, reason: collision with root package name */
    public final V f144b;

    /* renamed from: c, reason: collision with root package name */
    public final K2.c f145c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f146d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.i f147e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f148f;

    /* renamed from: g, reason: collision with root package name */
    public final U f149g;
    public SQLiteDatabase h;
    public boolean i;

    public X(Context context, String str, B2.f fVar, K2.c cVar, C0021v c0021v) {
        try {
            V v4 = new V(context, cVar, "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f310a, "utf-8") + "." + URLEncoder.encode(fVar.f311b, "utf-8"));
            this.f149g = new U(this);
            this.f144b = v4;
            this.f145c = cVar;
            this.f146d = new d0(this, cVar);
            this.f147e = new S0.i(this, cVar);
            this.f148f = new Q(this, c0021v);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public static void x0(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    AbstractC0183a.z("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i + 1, (byte[]) obj);
            }
        }
    }

    @Override // S0.f
    public final InterfaceC0001a D(C1038d c1038d) {
        return new C0009i(this, this.f145c, c1038d);
    }

    @Override // S0.f
    public final InterfaceC0007g E(C1038d c1038d) {
        return new O(this, this.f145c, c1038d);
    }

    @Override // S0.f
    public final D F(C1038d c1038d, InterfaceC0007g interfaceC0007g) {
        K2.c cVar = this.f145c;
        T t4 = new T();
        t4.f133a = this;
        t4.f136d = cVar;
        String str = c1038d.f11025a;
        if (str == null) {
            str = "";
        }
        t4.f134b = str;
        t4.f138f = E2.I.f1420u;
        t4.f137e = interfaceC0007g;
        return t4;
    }

    @Override // S0.f
    public final E G() {
        return new K2.c(this, 2);
    }

    @Override // S0.f
    public final I H() {
        return this.f148f;
    }

    @Override // S0.f
    public final J I() {
        return this.f147e;
    }

    @Override // S0.f
    public final f0 K() {
        return this.f146d;
    }

    @Override // S0.f
    public final boolean N() {
        return this.i;
    }

    @Override // S0.f
    public final Object V(String str, F2.q qVar) {
        p1.b.p(1, "f", "Starting transaction: %s", str);
        this.h.beginTransactionWithListener(this.f149g);
        try {
            Object obj = qVar.get();
            this.h.setTransactionSuccessful();
            return obj;
        } finally {
            this.h.endTransaction();
        }
    }

    @Override // S0.f
    public final void W(String str, Runnable runnable) {
        p1.b.p(1, "f", "Starting transaction: %s", str);
        this.h.beginTransactionWithListener(this.f149g);
        try {
            runnable.run();
            this.h.setTransactionSuccessful();
        } finally {
            this.h.endTransaction();
        }
    }

    @Override // S0.f
    public final void b0() {
        boolean z4;
        AbstractC0183a.N(!this.i, "SQLitePersistence double-started!", new Object[0]);
        this.i = true;
        try {
            this.h = this.f144b.getWritableDatabase();
            d0 d0Var = this.f146d;
            C0009i c0009iZ0 = d0Var.f178a.z0("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            M m5 = new M(d0Var, 2);
            Cursor cursorH0 = c0009iZ0.h0();
            try {
                if (cursorH0.moveToFirst()) {
                    m5.a(cursorH0);
                    cursorH0.close();
                    z4 = true;
                } else {
                    cursorH0.close();
                    z4 = false;
                }
                AbstractC0183a.N(z4, "Missing target_globals entry", new Object[0]);
                long j5 = d0Var.f181d;
                Q q5 = this.f148f;
                q5.getClass();
                C0021v c0021v = new C0021v();
                c0021v.f254a = j5;
                q5.f126c = c0021v;
            } catch (Throwable th) {
                if (cursorH0 != null) {
                    try {
                        cursorH0.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e5) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e5);
        }
    }

    public final void y0(String str, Object... objArr) {
        this.h.execSQL(str, objArr);
    }

    public final C0009i z0(String str) {
        return new C0009i(3, this.h, str);
    }
}
