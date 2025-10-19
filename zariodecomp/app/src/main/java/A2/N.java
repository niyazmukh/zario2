package A2;

import B3.C0063m1;
import E2.EnumC0105h;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\N.smali */
public final /* synthetic */ class N implements F2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108c;

    public /* synthetic */ N(int i, Object obj, Object obj2) {
        this.f106a = i;
        this.f107b = obj;
        this.f108c = obj2;
    }

    @Override // F2.k
    public final void a(Object obj) {
        switch (this.f106a) {
            case 0:
                HashMap map = (HashMap) this.f108c;
                Cursor cursor = (Cursor) obj;
                O o5 = (O) this.f107b;
                o5.getClass();
                try {
                    int i = cursor.getInt(0);
                    String string = cursor.getString(1);
                    K2.c cVar = o5.f111b;
                    M2.d dVarW = M2.d.w(cursor.getBlob(2));
                    cVar.getClass();
                    o5.j(new B2.a(i, string, K2.c.o(dVarW), map.containsKey(Integer.valueOf(i)) ? (B2.c) map.get(Integer.valueOf(i)) : B2.a.f295e));
                    return;
                } catch (com.google.protobuf.N e5) {
                    AbstractC0183a.z("Failed to decode index: " + e5, new Object[0]);
                    throw null;
                }
            case 1:
                B2.n nVar = (B2.n) obj;
                if (((g1.i) this.f107b).i(nVar)) {
                    String strF = nVar.f();
                    B2.n nVar2 = (B2.n) nVar.k();
                    SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f108c;
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, strF);
                    sQLiteStatement.bindString(2, AbstractC0156x.C(nVar2));
                    sQLiteStatement.execute();
                    return;
                }
                return;
            default:
                C0063m1 c0063m1 = (C0063m1) this.f107b;
                c0063m1.getClass();
                ((F2.f) this.f108c).b(new RunnableC0012l(5, c0063m1, (EnumC0105h) obj));
                return;
        }
    }
}
