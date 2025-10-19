package z3;

import a.AbstractC0183a;
import g2.AbstractC0579b;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\X.smali */
public abstract class X {

    /* renamed from: d, reason: collision with root package name */
    public static final BitSet f11268d;

    /* renamed from: a, reason: collision with root package name */
    public final String f11269a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11270b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11271c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c5 = '0'; c5 <= '9'; c5 = (char) (c5 + 1)) {
            bitSet.set(c5);
        }
        for (char c6 = 'a'; c6 <= 'z'; c6 = (char) (c6 + 1)) {
            bitSet.set(c6);
        }
        f11268d = bitSet;
    }

    public X(Object obj, String str, boolean z4) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        S0.f.l(lowerCase, "name");
        S0.f.g("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            a0.f11274c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((!z4 || cCharAt != ':' || i != 0) && !f11268d.get(cCharAt)) {
                throw new IllegalArgumentException(AbstractC0183a.U("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f11269a = lowerCase;
        this.f11270b = lowerCase.getBytes(AbstractC0579b.f7598a);
        this.f11271c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f11269a.equals(((X) obj).f11269a);
    }

    public final int hashCode() {
        return this.f11269a.hashCode();
    }

    public final String toString() {
        return B.a.m(new StringBuilder("Key{name='"), this.f11269a, "'}");
    }
}
