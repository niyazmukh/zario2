package r4;

import java.io.EOFException;
import kotlin.jvm.internal.i;
import q4.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r4\a.smali */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9664a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(e4.a.a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f9664a = bytes;
    }

    public static final String a(d dVar, long j5) throws EOFException {
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (dVar.e(j6) == 13) {
                String strO = dVar.o(j6, e4.a.a);
                dVar.p(2L);
                return strO;
            }
        }
        String strO2 = dVar.o(j5, e4.a.a);
        dVar.p(1L);
        return strO2;
    }
}
