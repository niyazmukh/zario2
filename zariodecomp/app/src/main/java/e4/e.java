package e4;

import B.a;
import N2.AbstractC0156x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\e.smali */
public abstract class e extends AbstractC0156x {
    public static String k0(String str) {
        Comparable comparable;
        String strSubstring;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i = 0;
        m.w0(0);
        List listM0 = d4.g.m0(new d4.k(new c(str, 0, 0, new k(L3.i.q0(new String[]{"\r\n", "\n", "\r"}), false)), new l(str, 0), 1));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (!m.q0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L3.l.a0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                char cCharAt = str2.charAt(length2);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM0.size();
        int iX = L3.k.X(listM0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM0) {
            int i5 = i + 1;
            if (i < 0) {
                L3.k.Z();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iX) && m.q0(str3)) {
                strSubstring = null;
            } else {
                kotlin.jvm.internal.i.e(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.i("Requested character count ", iIntValue, " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i5;
        }
        StringBuilder sb = new StringBuilder(length3);
        L3.j.g0(arrayList3, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
