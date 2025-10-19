package e4;

import B.a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\m.smali */
public abstract class m extends j {
    public static CharSequence A0(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z4 ? i : length);
            boolean z5 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean l0(CharSequence charSequence, String str) {
        return p0(0, 2, charSequence, str, false) >= 0;
    }

    public static boolean m0(String str, String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static final int n0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int o0(CharSequence charSequence, String string, int i, boolean z4) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        kotlin.jvm.internal.i.e(string, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        b4.f fVar = new b4.f(i, length, 1);
        boolean z5 = charSequence instanceof String;
        int i5 = ((b4.d) fVar).c;
        int i6 = ((b4.d) fVar).b;
        int i7 = ((b4.d) fVar).a;
        if (!z5 || string == null) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                while (!t0(i7, string.length(), charSequence, string, z4)) {
                    if (i7 != i6) {
                        i7 += i5;
                    }
                }
                return i7;
            }
            return -1;
        }
        if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            while (!s0(0, i7, string.length(), string, (String) charSequence, z4)) {
                if (i7 != i6) {
                    i7 += i5;
                }
            }
            return i7;
        }
        return -1;
    }

    public static /* synthetic */ int p0(int i, int i5, CharSequence charSequence, String str, boolean z4) {
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return o0(charSequence, str, i, z4);
    }

    public static boolean q0(CharSequence charSequence) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static String r0(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a.i("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i5 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean s0(int i, int i5, int i6, String str, String other, boolean z4) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z4 ? str.regionMatches(i, other, i5, i6) : str.regionMatches(z4, i, other, i5, i6);
    }

    public static final boolean t0(int i, int i5, CharSequence other, String str, boolean z4) {
        char upperCase;
        char upperCase2;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        if (i < 0 || str.length() - i5 < 0 || i > other.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            char cCharAt = str.charAt(i6);
            char cCharAt2 = other.charAt(i + i6);
            boolean z5 = true;
            if (cCharAt != cCharAt2 && (!z4 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                z5 = false;
            }
            if (!z5) {
                return false;
            }
        }
        return true;
    }

    public static String u0(String str, char c5) {
        String strReplace = str.replace(c5, '_');
        kotlin.jvm.internal.i.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String v0(String str, String str2, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int iO0 = o0(str, str2, 0, false);
        if (iO0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, iO0);
            sb.append(newValue);
            i5 = iO0 + length;
            if (iO0 >= str.length()) {
                break;
            }
            iO0 = o0(str, str2, iO0 + i, false);
        } while (iO0 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static final void w0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static boolean x0(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static String y0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.i.e(delimiter, "delimiter");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = p0(0, 6, str, delimiter, false);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iP0, str.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z0(String str, String missingDelimiterValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, n0(str));
        if (iLastIndexOf == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
