package o0;

import N2.n0;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: o0.F, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\F.smali */
public final class C0771F extends AbstractC0777L {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9018m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0771F(int i, boolean z4) {
        super(z4);
        this.f9018m = i;
    }

    public static float[] f(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        return new float[]{((Number) AbstractC0777L.f9029g.c(value)).floatValue()};
    }

    public static int[] g(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        return new int[]{((Number) AbstractC0777L.f9024b.c(value)).intValue()};
    }

    public static long[] h(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        return new long[]{((Number) AbstractC0777L.f9027e.c(value)).longValue()};
    }

    public static boolean[] i(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        return new boolean[]{((Boolean) AbstractC0777L.i.c(value)).booleanValue()};
    }

    @Override // o0.AbstractC0777L
    public final Object a(Bundle bundle, String key) {
        switch (this.f9018m) {
            case 0:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                Object obj = bundle.get(key);
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                Object obj2 = bundle.get(key);
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            case 6:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                Object obj3 = bundle.get(key);
                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj3;
            case 8:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                Object obj4 = bundle.get(key);
                kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj4;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (String[]) bundle.get(key);
            default:
                kotlin.jvm.internal.i.e(bundle, "bundle");
                kotlin.jvm.internal.i.e(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // o0.AbstractC0777L
    public final String b() {
        switch (this.f9018m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // o0.AbstractC0777L
    public final Object c(String value) throws NumberFormatException {
        boolean z4;
        int i;
        String strSubstring;
        long j5;
        int i5;
        switch (this.f9018m) {
            case 0:
                return i(value);
            case 1:
                kotlin.jvm.internal.i.e(value, "value");
                if (value.equals("true")) {
                    z4 = true;
                } else {
                    if (!value.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 2:
                return f(value);
            case 3:
                kotlin.jvm.internal.i.e(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 4:
                return g(value);
            case 5:
                kotlin.jvm.internal.i.e(value, "value");
                if (e4.m.x0(value, "0x")) {
                    String strSubstring2 = value.substring(2);
                    kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    r1.d.o(16);
                    i = Integer.parseInt(strSubstring2, 16);
                } else {
                    i = Integer.parseInt(value);
                }
                return Integer.valueOf(i);
            case 6:
                return h(value);
            case 7:
                kotlin.jvm.internal.i.e(value, "value");
                if (e4.m.m0(value, "L")) {
                    strSubstring = value.substring(0, value.length() - 1);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = value;
                }
                if (e4.m.x0(value, "0x")) {
                    String strSubstring3 = strSubstring.substring(2);
                    kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    r1.d.o(16);
                    j5 = Long.parseLong(strSubstring3, 16);
                } else {
                    j5 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j5);
            case 8:
                kotlin.jvm.internal.i.e(value, "value");
                if (e4.m.x0(value, "0x")) {
                    String strSubstring4 = value.substring(2);
                    kotlin.jvm.internal.i.d(strSubstring4, "this as java.lang.String).substring(startIndex)");
                    r1.d.o(16);
                    i5 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i5 = Integer.parseInt(value);
                }
                return Integer.valueOf(i5);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                kotlin.jvm.internal.i.e(value, "value");
                return new String[]{value};
            default:
                kotlin.jvm.internal.i.e(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // o0.AbstractC0777L
    public Object d(String str, Object obj) {
        switch (this.f9018m) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] zArrI = i(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrI, 0, zArrCopyOf, length, 1);
                kotlin.jvm.internal.i.b(zArrCopyOf);
                return zArrCopyOf;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return f(str);
                }
                float[] fArrF = f(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrF, 0, fArrCopyOf, length2, 1);
                kotlin.jvm.internal.i.b(fArrCopyOf);
                return fArrCopyOf;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] iArrG = g(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrG, 0, iArrCopyOf, length3, 1);
                kotlin.jvm.internal.i.b(iArrCopyOf);
                return iArrCopyOf;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] jArrH = h(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrH, 0, jArrCopyOf, length4, 1);
                kotlin.jvm.internal.i.b(jArrCopyOf);
                return jArrCopyOf;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
                kotlin.jvm.internal.i.b(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                return super.d(str, obj);
        }
    }

    @Override // o0.AbstractC0777L
    public final void e(Bundle bundle, String key, Object obj) {
        switch (this.f9018m) {
            case 0:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putBoolean(key, zBooleanValue);
                break;
            case 2:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            case 4:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                break;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putInt(key, iIntValue);
                break;
            case 6:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                break;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putLong(key, jLongValue);
                break;
            case 8:
                int iIntValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putInt(key, iIntValue2);
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                break;
            default:
                kotlin.jvm.internal.i.e(key, "key");
                bundle.putString(key, (String) obj);
                break;
        }
    }
}
