package i2;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i2.1\g.smali */
public abstract class g {
    static {
        new f();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(G3.a aVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < iMin2) {
                int i6 = aVar.read(bArr, i5, iMin2 - i5);
                if (i6 == -1) {
                    return a(arrayDeque, i);
                }
                i5 += i6;
                i += i6;
            }
            long j5 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j5 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j5 < -2147483648L ? Integer.MIN_VALUE : (int) j5;
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
