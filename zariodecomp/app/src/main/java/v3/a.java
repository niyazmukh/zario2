package V3;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V3\a.smali */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        i.d(buf, "buf");
        return buf;
    }
}
