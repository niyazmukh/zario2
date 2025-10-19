package w0;

import L3.t;
import N2.AbstractC0156x;
import S0.f;
import android.database.Cursor;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import u0.AbstractC0953A;
import z0.C1063b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w0.1\e.smali */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10893a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10894b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f10895c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f10896d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        i.e(foreignKeys, "foreignKeys");
        this.f10893a = str;
        this.f10894b = map;
        this.f10895c = foreignKeys;
        this.f10896d = abstractSet;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C1063b c1063b, String str) {
        Map mapB;
        M3.i iVarF;
        M3.i iVar;
        Cursor cursorQ = c1063b.q("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQ.getColumnCount() <= 0) {
                mapB = t.f2352a;
                f.t(cursorQ, null);
            } else {
                int columnIndex = cursorQ.getColumnIndex("name");
                int columnIndex2 = cursorQ.getColumnIndex("type");
                int columnIndex3 = cursorQ.getColumnIndex("notnull");
                int columnIndex4 = cursorQ.getColumnIndex("pk");
                int columnIndex5 = cursorQ.getColumnIndex("dflt_value");
                M3.f fVar = new M3.f();
                while (cursorQ.moveToNext()) {
                    String name = cursorQ.getString(columnIndex);
                    String type = cursorQ.getString(columnIndex2);
                    boolean z4 = cursorQ.getInt(columnIndex3) != 0;
                    int i = cursorQ.getInt(columnIndex4);
                    String string = cursorQ.getString(columnIndex5);
                    i.d(name, "name");
                    i.d(type, "type");
                    fVar.put(name, new C1021a(name, type, z4, i, string, 2));
                }
                mapB = fVar.b();
                f.t(cursorQ, null);
            }
            cursorQ = c1063b.q("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorQ.getColumnIndex("id");
                int columnIndex7 = cursorQ.getColumnIndex("seq");
                int columnIndex8 = cursorQ.getColumnIndex("table");
                int columnIndex9 = cursorQ.getColumnIndex("on_delete");
                int columnIndex10 = cursorQ.getColumnIndex("on_update");
                List listC = AbstractC0953A.c(cursorQ);
                cursorQ.moveToPosition(-1);
                M3.i iVar2 = new M3.i();
                while (cursorQ.moveToNext()) {
                    if (cursorQ.getInt(columnIndex7) == 0) {
                        int i5 = cursorQ.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i6 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listC) {
                            int i7 = columnIndex7;
                            List list = listC;
                            if (((c) obj).f10885a == i5) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i7;
                            listC = list;
                        }
                        int i8 = columnIndex7;
                        List list2 = listC;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f10887c);
                            arrayList2.add(cVar.f10888d);
                        }
                        String string2 = cursorQ.getString(columnIndex8);
                        i.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorQ.getString(columnIndex9);
                        i.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorQ.getString(columnIndex10);
                        i.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        iVar2.add(new C1022b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i6;
                        columnIndex7 = i8;
                        listC = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                M3.i iVarF2 = AbstractC0156x.f(iVar2);
                f.t(cursorQ, null);
                cursorQ = c1063b.q("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorQ.getColumnIndex("name");
                    int columnIndex12 = cursorQ.getColumnIndex("origin");
                    int columnIndex13 = cursorQ.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        iVarF = null;
                        f.t(cursorQ, null);
                    } else {
                        M3.i iVar3 = new M3.i();
                        while (cursorQ.moveToNext()) {
                            if ("c".equals(cursorQ.getString(columnIndex12))) {
                                String name2 = cursorQ.getString(columnIndex11);
                                boolean z5 = cursorQ.getInt(columnIndex13) == 1;
                                i.d(name2, "name");
                                d dVarD = AbstractC0953A.d(c1063b, name2, z5);
                                if (dVarD == null) {
                                    f.t(cursorQ, null);
                                    iVar = null;
                                    break;
                                }
                                iVar3.add(dVarD);
                            }
                        }
                        iVarF = AbstractC0156x.f(iVar3);
                        f.t(cursorQ, null);
                    }
                    iVar = iVarF;
                    return new e(str, mapB, iVarF2, iVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f10893a.equals(eVar.f10893a) || !this.f10894b.equals(eVar.f10894b) || !i.a(this.f10895c, eVar.f10895c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f10896d;
        if (abstractSet2 == null || (abstractSet = eVar.f10896d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f10895c.hashCode() + ((this.f10894b.hashCode() + (this.f10893a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f10893a + "', columns=" + this.f10894b + ", foreignKeys=" + this.f10895c + ", indices=" + this.f10896d + '}';
    }
}
