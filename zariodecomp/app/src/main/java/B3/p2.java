package B3;

import g2.AbstractC0579b;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\p2.smali */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f944a = Logger.getLogger(p2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f945b = "-bin".getBytes(AbstractC0579b.f7598a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
