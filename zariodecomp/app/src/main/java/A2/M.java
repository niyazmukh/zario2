package A2;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.database.Cursor;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\M.smali */
public final /* synthetic */ class M implements F2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105b;

    public /* synthetic */ M(Object obj, int i) {
        this.f104a = i;
        this.f105b = obj;
    }

    @Override // F2.k
    public final void a(Object obj) {
        Object obj2 = this.f105b;
        switch (this.f104a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ((HashMap) obj2).put(Integer.valueOf(cursor.getInt(0)), new B2.c(cursor.getLong(1), new B2.b(new B2.o(new l2.o(cursor.getInt(3), cursor.getLong(2))), new B2.h(AbstractC0156x.z(cursor.getString(4))), cursor.getInt(5))));
                return;
            case 1:
                Boolean[] boolArr = (Boolean[]) obj2;
                try {
                    if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e5) {
                    AbstractC0183a.z("SQLitePersistence.DataMigration failed to parse: %s", e5);
                    throw null;
                }
            default:
                Cursor cursor2 = (Cursor) obj;
                d0 d0Var = (d0) obj2;
                d0Var.getClass();
                d0Var.f180c = cursor2.getInt(0);
                d0Var.f181d = cursor2.getInt(1);
                d0Var.f182e = new B2.o(new l2.o(cursor2.getInt(3), cursor2.getLong(2)));
                d0Var.f183f = cursor2.getLong(4);
                return;
        }
    }
}
