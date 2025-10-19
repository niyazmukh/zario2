package F2;

import com.google.protobuf.AbstractC0409l;
import java.security.SecureRandom;
import java.util.Iterator;
import z3.k0;
import z3.l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\s.smali */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.n f1736a;

    static {
        new SecureRandom();
        f1736a = new E2.n(1);
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i5 = bArr[i] & 255;
            int i6 = bArr2[i] & 255;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int c(AbstractC0409l abstractC0409l, AbstractC0409l abstractC0409l2) {
        int iMin = Math.min(abstractC0409l.size(), abstractC0409l2.size());
        for (int i = 0; i < iMin; i++) {
            int iH = abstractC0409l.h(i) & 255;
            int iH2 = abstractC0409l2.h(i) & 255;
            if (iH < iH2) {
                return -1;
            }
            if (iH > iH2) {
                return 1;
            }
        }
        return Integer.compare(abstractC0409l.size(), abstractC0409l2.size());
    }

    public static int d(double d5, long j5) {
        if (Double.isNaN(d5) || d5 < -9.223372036854776E18d) {
            return -1;
        }
        if (d5 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d5, j5);
        return iCompare != 0 ? iCompare : S0.f.B(d5, j5);
    }

    public static int e(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2) ? Character.compare(cCharAt, cCharAt2) : Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    public static w2.p f(k0 k0Var) {
        k0Var.getClass();
        l0 l0Var = new l0(k0Var);
        return new w2.p(l0Var.getMessage(), (w2.o) w2.o.f10947o.get(k0Var.f11358a.f11339a, w2.o.UNKNOWN), l0Var);
    }

    public static StringBuilder g(CharSequence charSequence, int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i5 = 1; i5 < i; i5++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String h(AbstractC0409l abstractC0409l) {
        int size = abstractC0409l.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte bH = abstractC0409l.h(i);
            sb.append(Character.forDigit((bH & 255) >>> 4, 16));
            sb.append(Character.forDigit(bH & 15, 16));
        }
        return sb.toString();
    }
}
