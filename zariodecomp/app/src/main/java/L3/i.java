package L3;

import N2.AbstractC0156x;
import a.AbstractC0183a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\L3\i.smali */
public abstract class i extends AbstractC0183a {
    public static List q0(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean r0(Object[] objArr, Object obj) {
        int i;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i5 = 0; i5 < length2; i5++) {
                if (obj.equals(objArr[i5])) {
                    i = i5;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static void s0(byte[] bArr, int i, byte[] destination, int i5, int i6) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i5, destination, i, i6 - i5);
    }

    public static void t0(Object[] objArr, int i, Object[] destination, int i5, int i6) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i5, destination, i, i6 - i5);
    }

    public static final void u0(Object[] objArr, h1.i iVar, int i, int i5) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i, i5, iVar);
    }

    public static ArrayList v0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object w0(int i, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static String x0(Object[] objArr, String separator, String prefix, String postfix, int i) {
        if ((i & 1) != 0) {
            separator = ", ";
        }
        if ((i & 2) != 0) {
            prefix = "";
        }
        if ((i & 4) != 0) {
            postfix = "";
        }
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) prefix);
        int i5 = 0;
        for (Object obj : objArr) {
            i5++;
            if (i5 > 1) {
                sb.append((CharSequence) separator);
            }
            AbstractC0156x.d(sb, obj, null);
        }
        sb.append((CharSequence) postfix);
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static List y0(long[] jArr) {
        kotlin.jvm.internal.i.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return s.f2351a;
        }
        if (length == 1) {
            return p1.b.B(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j5 : jArr) {
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    public static List z0(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new g(objArr, false)) : p1.b.B(objArr[0]) : s.f2351a;
    }
}
