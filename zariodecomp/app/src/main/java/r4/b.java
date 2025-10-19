package r4;

import kotlin.jvm.internal.i;
import q4.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r4\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9665a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(l lVar, int i) {
        int i5;
        i.e(lVar, "<this>");
        int i6 = i + 1;
        int length = lVar.f9537e.length;
        int[] iArr = lVar.f9538f;
        i.e(iArr, "<this>");
        int i7 = length - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i5 = (i8 + i7) >>> 1;
                int i9 = iArr[i5];
                if (i9 >= i6) {
                    if (i9 <= i6) {
                        break;
                    }
                    i7 = i5 - 1;
                } else {
                    i8 = i5 + 1;
                }
            } else {
                i5 = (-i8) - 1;
                break;
            }
        }
        return i5 >= 0 ? i5 : ~i5;
    }
}
