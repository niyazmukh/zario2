package B3;

import g2.AbstractC0579b;
import java.nio.charset.Charset;
import java.util.Locale;
import z3.AbstractC1076E;

/* renamed from: B3.n0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\n0.1.smali */
public abstract class AbstractC0065n0 extends AbstractC0031c {

    /* renamed from: u, reason: collision with root package name */
    public static final z3.Y f919u = AbstractC1076E.a(":status", new o2(13));

    /* renamed from: q, reason: collision with root package name */
    public z3.k0 f920q;

    /* renamed from: r, reason: collision with root package name */
    public z3.a0 f921r;

    /* renamed from: s, reason: collision with root package name */
    public Charset f922s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f923t;

    public static Charset h(z3.a0 a0Var) {
        String str = (String) a0Var.c(AbstractC0056k0.i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0579b.f7599b;
    }

    public static z3.k0 i(z3.a0 a0Var) {
        char cCharAt;
        Integer num = (Integer) a0Var.c(f919u);
        if (num == null) {
            return z3.k0.f11354m.g("Missing HTTP status code");
        }
        String str = (String) a0Var.c(AbstractC0056k0.i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return AbstractC0056k0.g(num.intValue()).a("invalid content-type: " + str);
    }
}
