package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\L.smali */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6425a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6426b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f6427c;

    static {
        Charset.forName("US-ASCII");
        f6425a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6426b = bArr;
        f6427c = ByteBuffer.wrap(bArr);
        AbstractC0417p.m(bArr, 0, 0, false);
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
