package u0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import z0.C1063b;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\B.smali */
public final class C0954B {

    /* renamed from: a, reason: collision with root package name */
    public final int f10357a;

    /* renamed from: b, reason: collision with root package name */
    public C0968i f10358b;

    /* renamed from: c, reason: collision with root package name */
    public final I1.e f10359c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10360d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10361e;

    public C0954B(C0968i c0968i, I1.e eVar, String str, String str2) {
        this.f10357a = eVar.f1927a;
        this.f10358b = c0968i;
        this.f10359c = eVar;
        this.f10360d = str;
        this.f10361e = str2;
    }

    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = kotlin.jvm.internal.i.f(str.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e5) {
            Log.w("SupportSQLite", "delete failed: ", e5);
        }
    }

    public final void b(C1063b c1063b) {
    }

    public final void c(C1063b c1063b) throws IOException, SQLException {
        Cursor cursorQ = c1063b.q("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z4 = false;
            if (cursorQ.moveToFirst()) {
                if (cursorQ.getInt(0) == 0) {
                    z4 = true;
                }
            }
            S0.f.t(cursorQ, null);
            I1.e eVar = this.f10359c;
            eVar.a(c1063b);
            if (!z4) {
                F1.d dVarK = eVar.k(c1063b);
                if (!dVarK.f1670a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) dVarK.f1671b));
                }
            }
            f(c1063b);
            eVar.h(c1063b);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(z0.C1063b r7) throws java.io.IOException, android.database.SQLException {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.q(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L9a
        L18:
            r1 = r2
        L19:
            r3 = 0
            S0.f.t(r0, r3)
            I1.e r0 = r6.f10359c
            if (r1 == 0) goto L71
            g2.c r1 = new g2.c
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r5 = 1
            r1.<init>(r4, r5)
            android.database.Cursor r1 = r7.r(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r6 = move-exception
            goto L6b
        L3a:
            r2 = r3
        L3b:
            S0.f.t(r1, r3)
            java.lang.String r1 = r6.f10360d
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L7c
            java.lang.String r4 = r6.f10361e
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4f
            goto L7c
        L4f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r7.<init>(r0)
            r7.append(r1)
            java.lang.String r0 = ", found: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6b:
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r7 = move-exception
            S0.f.t(r1, r6)
            throw r7
        L71:
            F1.d r1 = r0.k(r7)
            boolean r2 = r1.f1670a
            if (r2 == 0) goto L82
            r6.f(r7)
        L7c:
            r0.i(r7)
            r6.f10358b = r3
            return
        L82:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r7.<init>(r0)
            java.lang.Object r0 = r1.f1671b
            java.lang.String r0 = (java.lang.String) r0
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L9a:
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r7 = move-exception
            S0.f.t(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C0954B.d(z0.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x003d A[EDGE_INSN: B:72:0x003d->B:18:0x003d BREAK  A[LOOP:1: B:12:0x0025->B:75:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(z0.C1063b r17, int r18, int r19) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C0954B.e(z0.b, int, int):void");
    }

    public final void f(C1063b c1063b) throws SQLException {
        c1063b.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1063b.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f10360d + "')");
    }
}
