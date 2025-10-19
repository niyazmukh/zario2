package W0;

import J0.t;
import L3.j;
import S0.g;
import S0.l;
import S0.q;
import S0.v;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import u0.AbstractC0967h;
import u0.C0955C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W0\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3691a;

    static {
        String strF = t.f("DiagnosticsWrkr");
        i.d(strF, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f3691a = strF;
    }

    public static final String a(l lVar, v vVar, S0.i iVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            g gVarO = iVar.o(p1.b.r(qVar));
            Integer numValueOf = gVarO != null ? Integer.valueOf(gVarO.f2856c) : null;
            lVar.getClass();
            C0955C c0955cK = C0955C.k(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = qVar.f2895a;
            if (str2 == null) {
                c0955cK.f(1);
            } else {
                c0955cK.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f2867b;
            workDatabase_Impl.b();
            Cursor cursorF = AbstractC0967h.f(workDatabase_Impl, c0955cK, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList2.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                }
                cursorF.close();
                c0955cK.l();
                String strH0 = j.h0(arrayList2, ",", null, null, null, 62);
                String strH02 = j.h0(vVar.d(str2), ",", null, null, null, 62);
                StringBuilder sbO = B.a.o("\n", str2, "\t ");
                sbO.append(qVar.f2897c);
                sbO.append("\t ");
                sbO.append(numValueOf);
                sbO.append("\t ");
                switch (qVar.f2896b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbO.append(str);
                sbO.append("\t ");
                sbO.append(strH0);
                sbO.append("\t ");
                sbO.append(strH02);
                sbO.append('\t');
                sb.append(sbO.toString());
            } catch (Throwable th) {
                cursorF.close();
                c0955cK.l();
                throw th;
            }
        }
        String string = sb.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
