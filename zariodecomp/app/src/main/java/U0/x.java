package u0;

import A2.W;
import T0.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y0.InterfaceC1044c;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\x.smali */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public volatile C1063b f10459a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f10460b;

    /* renamed from: c, reason: collision with root package name */
    public m f10461c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1044c f10462d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10464f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f10465g;

    /* renamed from: k, reason: collision with root package name */
    public final Map f10467k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f10468l;

    /* renamed from: e, reason: collision with root package name */
    public final s f10463e = d();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f10466j = new ThreadLocal();

    public x() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f10467k = mapSynchronizedMap;
        this.f10468l = new LinkedHashMap();
    }

    public static Object p(Class cls, InterfaceC1044c interfaceC1044c) {
        if (cls.isInstance(interfaceC1044c)) {
            return interfaceC1044c;
        }
        if (interfaceC1044c instanceof InterfaceC0969j) {
            return p(cls, ((InterfaceC0969j) interfaceC1044c).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f10464f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().i().o() && this.f10466j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C1063b c1063bI = g().i();
        this.f10463e.f(c1063bI);
        if (c1063bI.p()) {
            c1063bI.e();
        } else {
            c1063bI.a();
        }
    }

    public abstract s d();

    public abstract InterfaceC1044c e(C0968i c0968i);

    public List f(LinkedHashMap autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        return L3.s.f2351a;
    }

    public final InterfaceC1044c g() {
        InterfaceC1044c interfaceC1044c = this.f10462d;
        if (interfaceC1044c != null) {
            return interfaceC1044c;
        }
        kotlin.jvm.internal.i.i("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return L3.u.f2353a;
    }

    public Map i() {
        return L3.t.f2352a;
    }

    public final void j() {
        g().i().l();
        if (g().i().o()) {
            return;
        }
        s sVar = this.f10463e;
        if (sVar.f10435f.compareAndSet(false, true)) {
            Executor executor = sVar.f10430a.f10460b;
            if (executor != null) {
                executor.execute(sVar.f10441n);
            } else {
                kotlin.jvm.internal.i.i("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(C1063b c1063b) {
        s sVar = this.f10463e;
        sVar.getClass();
        synchronized (sVar.f10440m) {
            if (sVar.f10436g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            c1063b.m("PRAGMA temp_store = MEMORY;");
            c1063b.m("PRAGMA recursive_triggers='ON';");
            c1063b.m("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            sVar.f(c1063b);
            sVar.h = c1063b.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            sVar.f10436g = true;
        }
    }

    public final boolean l() {
        C1063b c1063b = this.f10459a;
        return c1063b != null && c1063b.f11177a.isOpen();
    }

    public final Cursor m(y0.e query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.i.e(query, "query");
        a();
        b();
        if (cancellationSignal == null) {
            return g().i().r(query);
        }
        C1063b c1063bI = g().i();
        c1063bI.getClass();
        kotlin.jvm.internal.i.e(query, "query");
        String sql = query.e();
        String[] strArr = C1063b.f11176c;
        kotlin.jvm.internal.i.b(cancellationSignal);
        W w4 = new W(query, 1);
        SQLiteDatabase sQLiteDatabase = c1063bI.f11177a;
        kotlin.jvm.internal.i.e(sQLiteDatabase, "sQLiteDatabase");
        kotlin.jvm.internal.i.e(sql, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(w4, sql, strArr, null, cancellationSignal);
        kotlin.jvm.internal.i.d(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            o();
            return objCall;
        } finally {
            j();
        }
    }

    public final void o() {
        g().i().s();
    }
}
