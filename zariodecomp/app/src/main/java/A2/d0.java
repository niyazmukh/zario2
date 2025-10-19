package A2;

import N2.AbstractC0156x;
import N2.i0;
import a.AbstractC0183a;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import java.util.Iterator;
import s2.C0870e;
import y2.C1048A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\d0.smali */
public final class d0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final X f178a;

    /* renamed from: b, reason: collision with root package name */
    public final K2.c f179b;

    /* renamed from: c, reason: collision with root package name */
    public int f180c;

    /* renamed from: d, reason: collision with root package name */
    public long f181d;

    /* renamed from: e, reason: collision with root package name */
    public B2.o f182e = B2.o.f333b;

    /* renamed from: f, reason: collision with root package name */
    public long f183f;

    public d0(X x3, K2.c cVar) {
        this.f178a = x3;
        this.f179b = cVar;
    }

    @Override // A2.f0
    public final g0 a(C1048A c1048a) {
        String strB = c1048a.b();
        C0009i c0009iZ0 = this.f178a.z0("SELECT target_proto FROM targets WHERE canonical_id = ?");
        c0009iZ0.v(strB);
        Cursor cursorH0 = c0009iZ0.h0();
        g0 g0Var = null;
        while (cursorH0.moveToNext()) {
            try {
                g0 g0VarJ = j(cursorH0.getBlob(0));
                if (c1048a.equals(g0VarJ.f193a)) {
                    g0Var = g0VarJ;
                }
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
        }
        cursorH0.close();
        return g0Var;
    }

    @Override // A2.f0
    public final void b(C0870e c0870e, int i) throws SQLException {
        X x3 = this.f178a;
        SQLiteStatement sQLiteStatementCompileStatement = x3.h.compileStatement("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Iterator it = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return;
            }
            B2.h hVar = (B2.h) dVar.next();
            Object[] objArr = {Integer.valueOf(i), AbstractC0156x.C(hVar.f315a)};
            sQLiteStatementCompileStatement.clearBindings();
            X.x0(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            x3.f148f.d(hVar);
        }
    }

    @Override // A2.f0
    public final C0870e c(int i) {
        C0870e c0870eF = B2.h.f314c;
        C0009i c0009iZ0 = this.f178a.z0("SELECT path FROM target_documents WHERE target_id = ?");
        c0009iZ0.v(Integer.valueOf(i));
        Cursor cursorH0 = c0009iZ0.h0();
        while (cursorH0.moveToNext()) {
            try {
                c0870eF = c0870eF.f(new B2.h(AbstractC0156x.z(cursorH0.getString(0))));
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
        }
        cursorH0.close();
        return c0870eF;
    }

    @Override // A2.f0
    public final B2.o d() {
        return this.f182e;
    }

    @Override // A2.f0
    public final void e(C0870e c0870e, int i) throws SQLException {
        X x3 = this.f178a;
        SQLiteStatement sQLiteStatementCompileStatement = x3.h.compileStatement("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Iterator it = c0870e.iterator();
        while (true) {
            s2.d dVar = (s2.d) it;
            if (!((Iterator) dVar.f9680b).hasNext()) {
                return;
            }
            B2.h hVar = (B2.h) dVar.next();
            Object[] objArr = {Integer.valueOf(i), AbstractC0156x.C(hVar.f315a)};
            sQLiteStatementCompileStatement.clearBindings();
            X.x0(sQLiteStatementCompileStatement, objArr);
            sQLiteStatementCompileStatement.executeUpdateDelete();
            x3.f148f.d(hVar);
        }
    }

    @Override // A2.f0
    public final void f(B2.o oVar) {
        this.f182e = oVar;
        l();
    }

    @Override // A2.f0
    public final void g(g0 g0Var) {
        k(g0Var);
        int i = this.f180c;
        int i5 = g0Var.f194b;
        if (i5 > i) {
            this.f180c = i5;
        }
        long j5 = this.f181d;
        long j6 = g0Var.f195c;
        if (j6 > j5) {
            this.f181d = j6;
        }
        this.f183f++;
        l();
    }

    @Override // A2.f0
    public final int h() {
        return this.f180c;
    }

    @Override // A2.f0
    public final void i(g0 g0Var) {
        boolean z4;
        k(g0Var);
        int i = this.f180c;
        int i5 = g0Var.f194b;
        boolean z5 = true;
        if (i5 > i) {
            this.f180c = i5;
            z4 = true;
        } else {
            z4 = false;
        }
        long j5 = this.f181d;
        long j6 = g0Var.f195c;
        if (j6 > j5) {
            this.f181d = j6;
        } else {
            z5 = z4;
        }
        if (z5) {
            l();
        }
    }

    public final g0 j(byte[] bArr) {
        try {
            return this.f179b.r(D2.g.M(bArr));
        } catch (com.google.protobuf.N e5) {
            AbstractC0183a.z("TargetData failed to parse: %s", e5);
            throw null;
        }
    }

    public final void k(g0 g0Var) {
        C1048A c1048a = g0Var.f193a;
        String strB = c1048a.b();
        B2.o oVar = g0Var.f197e;
        l2.o oVar2 = oVar.f334a;
        K2.c cVar = this.f179b;
        cVar.getClass();
        H h = H.f89a;
        H h5 = g0Var.f196d;
        AbstractC0183a.N(h.equals(h5), "Only queries with purpose %s may be stored, got %s", h, h5);
        D2.e eVarL = D2.g.L();
        eVarL.d();
        D2.g gVar = (D2.g) eVarL.f6410b;
        int i = g0Var.f194b;
        D2.g.z(gVar, i);
        eVarL.d();
        D2.g gVar2 = (D2.g) eVarL.f6410b;
        long j5 = g0Var.f195c;
        D2.g.C(gVar2, j5);
        S0.l lVar = (S0.l) cVar.b;
        B0 b0W = S0.l.w(g0Var.f198f.f334a);
        eVarL.d();
        D2.g.x((D2.g) eVarL.f6410b, b0W);
        B0 b0W2 = S0.l.w(oVar.f334a);
        eVarL.d();
        D2.g.A((D2.g) eVarL.f6410b, b0W2);
        eVarL.d();
        D2.g gVar3 = (D2.g) eVarL.f6410b;
        AbstractC0409l abstractC0409l = g0Var.f199g;
        D2.g.B(gVar3, abstractC0409l);
        if (c1048a.f()) {
            N2.f0 f0VarZ = N2.g0.z();
            String strV = S0.l.v((B2.f) lVar.f2867b, c1048a.f11053d);
            f0VarZ.d();
            N2.g0.v((N2.g0) f0VarZ.f6410b, strV);
            N2.g0 g0Var2 = (N2.g0) f0VarZ.b();
            eVarL.d();
            D2.g.w((D2.g) eVarL.f6410b, g0Var2);
        } else {
            i0 i0VarU = lVar.u(c1048a);
            eVarL.d();
            D2.g.v((D2.g) eVarL.f6410b, i0VarU);
        }
        this.f178a.y0("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i), strB, Long.valueOf(oVar2.f8792a), Integer.valueOf(oVar2.f8793b), abstractC0409l.u(), Long.valueOf(j5), ((D2.g) eVarL.b()).d());
    }

    public final void l() {
        this.f178a.y0("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f180c), Long.valueOf(this.f181d), Long.valueOf(this.f182e.f334a.f8792a), Integer.valueOf(this.f182e.f334a.f8793b), Long.valueOf(this.f183f));
    }
}
