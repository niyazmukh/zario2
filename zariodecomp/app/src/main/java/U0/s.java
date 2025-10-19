package u0;

import A2.C0020u;
import N2.AbstractC0156x;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C0761f;
import t0.RunnableC0931q;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\s.smali */
public final class s {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f10429o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final x f10430a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10431b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10432c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f10433d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f10434e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f10435f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10436g;
    public volatile z0.i h;
    public final C0020u i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.e f10437j;

    /* renamed from: k, reason: collision with root package name */
    public final C0761f f10438k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10439l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f10440m;

    /* renamed from: n, reason: collision with root package name */
    public final RunnableC0931q f10441n;

    public s(x xVar, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f10430a = xVar;
        this.f10431b = map;
        this.f10432c = map2;
        this.i = new C0020u(strArr.length);
        S0.e eVar = new S0.e();
        eVar.f2851a = xVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.i.d(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        eVar.f2852b = setNewSetFromMap;
        this.f10437j = eVar;
        this.f10438k = new C0761f();
        this.f10439l = new Object();
        this.f10440m = new Object();
        this.f10433d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f10433d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f10431b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f10434e = strArr2;
        for (Map.Entry entry : this.f10431b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.i.d(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            kotlin.jvm.internal.i.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f10433d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.i.d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f10433d;
                kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.f10441n = new RunnableC0931q(this, 2);
    }

    public final void a(p pVar) {
        q qVar;
        boolean z4;
        String[] strArrD = d(pVar.f10422a);
        ArrayList arrayList = new ArrayList(strArrD.length);
        for (String str : strArrD) {
            LinkedHashMap linkedHashMap = this.f10433d;
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrT0 = L3.j.t0(arrayList);
        q qVar2 = new q(pVar, iArrT0, strArrD);
        synchronized (this.f10438k) {
            qVar = (q) this.f10438k.g(pVar, qVar2);
        }
        if (qVar == null) {
            C0020u c0020u = this.i;
            int[] tableIds = Arrays.copyOf(iArrT0, iArrT0.length);
            c0020u.getClass();
            kotlin.jvm.internal.i.e(tableIds, "tableIds");
            synchronized (c0020u) {
                z4 = false;
                for (int i : tableIds) {
                    long[] jArr = (long[]) c0020u.f251c;
                    long j5 = jArr[i];
                    jArr[i] = 1 + j5;
                    if (j5 == 0) {
                        z4 = true;
                        c0020u.f250b = true;
                    }
                }
            }
            if (z4) {
                x xVar = this.f10430a;
                if (xVar.l()) {
                    f(xVar.g().i());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f10430a.l()) {
            return false;
        }
        if (!this.f10436g) {
            this.f10430a.g().i();
        }
        if (this.f10436g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(p pVar) {
        q qVar;
        boolean z4;
        synchronized (this.f10438k) {
            qVar = (q) this.f10438k.h(pVar);
        }
        if (qVar != null) {
            C0020u c0020u = this.i;
            int[] iArr = qVar.f10424b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            c0020u.getClass();
            kotlin.jvm.internal.i.e(tableIds, "tableIds");
            synchronized (c0020u) {
                z4 = false;
                for (int i : tableIds) {
                    long[] jArr = (long[]) c0020u.f251c;
                    long j5 = jArr[i];
                    jArr[i] = j5 - 1;
                    if (j5 == 1) {
                        z4 = true;
                        c0020u.f250b = true;
                    }
                }
            }
            if (z4) {
                x xVar = this.f10430a;
                if (xVar.l()) {
                    f(xVar.g().i());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        M3.i iVar = new M3.i();
        for (String str : strArr) {
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            HashMap map = this.f10432c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase2);
                kotlin.jvm.internal.i.b(obj);
                iVar.addAll((Collection) obj);
            } else {
                iVar.add(str);
            }
        }
        return (String[]) AbstractC0156x.f(iVar).toArray(new String[0]);
    }

    public final void e(C1063b c1063b, int i) throws SQLException {
        c1063b.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f10434e[i];
        String[] strArr = f10429o;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + o.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            kotlin.jvm.internal.i.d(str3, "StringBuilder().apply(builderAction).toString()");
            c1063b.m(str3);
        }
    }

    public final void f(C1063b database) {
        kotlin.jvm.internal.i.e(database, "database");
        if (database.o()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f10430a.i.readLock();
            kotlin.jvm.internal.i.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f10439l) {
                    int[] iArrF = this.i.f();
                    if (iArrF == null) {
                        return;
                    }
                    if (database.p()) {
                        database.e();
                    } else {
                        database.a();
                    }
                    try {
                        int length = iArrF.length;
                        int i = 0;
                        int i5 = 0;
                        while (i < length) {
                            int i6 = iArrF[i];
                            int i7 = i5 + 1;
                            if (i6 == 1) {
                                e(database, i5);
                            } else if (i6 == 2) {
                                String str = this.f10434e[i5];
                                String[] strArr = f10429o;
                                for (int i8 = 0; i8 < 3; i8++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + o.c(str, strArr[i8]);
                                    kotlin.jvm.internal.i.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    database.m(str2);
                                }
                            }
                            i++;
                            i5 = i7;
                        }
                        database.s();
                        database.l();
                    } catch (Throwable th) {
                        database.l();
                        throw th;
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e5) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
        } catch (IllegalStateException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        }
    }
}
