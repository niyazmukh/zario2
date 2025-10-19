package E3;

import N2.AbstractC0156x;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import q4.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f1568a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final q4.f f1569b;

    static {
        q4.f fVar = q4.f.f9516d;
        f1569b = AbstractC0156x.D("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(i iVar) {
        return (iVar.a() & 255) | ((iVar.a() & 255) << 16) | ((iVar.a() & 255) << 8);
    }

    public static int b(int i, byte b5, short s4) throws IOException {
        if ((b5 & 8) != 0) {
            i--;
        }
        if (s4 <= i) {
            return (short) (i - s4);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s4), Integer.valueOf(i));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
