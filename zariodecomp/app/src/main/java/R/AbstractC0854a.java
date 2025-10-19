package r;

import N2.n0;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r.1\a.smali */
public abstract /* synthetic */ class AbstractC0854a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9542a = 1;

    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return -1;
        }
        throw null;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
