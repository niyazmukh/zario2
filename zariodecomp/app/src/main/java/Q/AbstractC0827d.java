package q;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\d.smali */
public abstract class AbstractC0827d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9402a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f9403b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f9404c = new Object[0];

    public static int a(int i, int i5, int[] iArr) {
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static int b(long[] jArr, int i, long j5) {
        int i5 = i - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j6 = jArr[i7];
            if (j6 < j5) {
                i6 = i7 + 1;
            } else {
                if (j6 <= j5) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }
}
