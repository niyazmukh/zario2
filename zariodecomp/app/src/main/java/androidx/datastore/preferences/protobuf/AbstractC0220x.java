package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\x.1.smali */
public abstract class AbstractC0220x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4563a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4564b;

    static {
        Charset.forName("US-ASCII");
        f4563a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4564b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0205h(bArr, 0, 0, false).e(0);
        } catch (C0222z e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }
}
