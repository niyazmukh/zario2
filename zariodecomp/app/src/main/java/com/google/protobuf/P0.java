package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\P0.smali */
public abstract class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f6458a;

    static {
        f6458a = (M0.f6432d && M0.f6431c && !AbstractC0392c.a()) ? new N0(1) : new N0(0);
    }

    public static int a(byte[] bArr, int i, int i5) {
        byte b5 = bArr[i - 1];
        int i6 = i5 - i;
        if (i6 == 0) {
            if (b5 > -12) {
                b5 = -1;
            }
            return b5;
        }
        if (i6 == 1) {
            return d(b5, bArr[i]);
        }
        if (i6 == 2) {
            return e(b5, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static String b(ByteBuffer byteBuffer, int i, int i5) {
        y0 y0Var = f6458a;
        y0Var.getClass();
        if (byteBuffer.hasArray()) {
            return y0Var.H(byteBuffer.array(), byteBuffer.arrayOffset() + i, i5);
        }
        return byteBuffer.isDirect() ? y0Var.J(byteBuffer, i, i5) : y0.I(byteBuffer, i, i5);
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new O0(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    public static int d(int i, int i5) {
        if (i > -12 || i5 > -65) {
            return -1;
        }
        return i ^ (i5 << 8);
    }

    public static int e(int i, int i5, int i6) {
        if (i > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i5 << 8)) ^ (i6 << 16);
    }

    public static boolean f(byte[] bArr, int i, int i5) {
        return f6458a.U(0, bArr, i, i5) == 0;
    }
}
