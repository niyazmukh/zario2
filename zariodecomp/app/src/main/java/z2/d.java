package z2;

import java.math.RoundingMode;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z2.1\d.smali */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11223a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f11223a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11223a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11223a[RoundingMode.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11223a[RoundingMode.CEILING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11223a[RoundingMode.FLOOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11223a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11223a[RoundingMode.HALF_DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11223a[RoundingMode.HALF_UP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
