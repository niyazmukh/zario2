package B3;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\D0.smali */
public abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f395a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static Boolean b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(Map map, String str) {
        List listC = c(map, str);
        if (listC == null) {
            return null;
        }
        for (int i = 0; i < listC.size(); i++) {
            if (!(listC.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i), Integer.valueOf(i), listC));
            }
        }
        return listC;
    }

    public static Double e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d5 = (Double) obj;
        int iIntValue = d5.intValue();
        if (iIntValue == d5.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d5);
    }

    public static Map g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(Map map, String str) {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static long j(int i, long j5) {
        long j6;
        int i5 = i;
        long j7 = i5;
        long j8 = f395a;
        if (j7 <= (-j8) || j7 >= j8) {
            long j9 = j7 / j8;
            j6 = j5 + j9;
            if (!((j5 ^ j9) < 0) && !((j5 ^ j6) >= 0)) {
                throw new ArithmeticException("overflow: checkedAdd(" + j5 + ", " + j9 + ")");
            }
            i5 = (int) (j7 % j8);
        } else {
            j6 = j5;
        }
        if (j6 > 0 && i5 < 0) {
            i5 = (int) (i5 + j8);
            j6--;
        }
        if (j6 < 0 && i5 > 0) {
            i5 = (int) (i5 - j8);
            j6++;
        }
        if (j6 >= -315576000000L && j6 <= 315576000000L) {
            long j10 = i5;
            if (j10 >= -999999999 && j10 < j8 && ((j6 >= 0 && i5 >= 0) || (j6 <= 0 && i5 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j6);
                long j11 = i5;
                long j12 = nanos + j11;
                return (((j11 ^ nanos) > 0L ? 1 : ((j11 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j6 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i5 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws NumberFormatException, ParseException {
        boolean z4;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z4 = true;
        } else {
            z4 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j5 = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j5 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z4) {
            j5 = -j5;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j5);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
