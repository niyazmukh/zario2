package com.google.android.gms.internal.common;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\common\zzx.smali */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e5);
                    String name2 = e5.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 8 + 1);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i5] = string;
            i5++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i6, iIndexOf);
            sb3.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i6, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i7 = i + 1; i7 < objArr.length; i7++) {
                sb3.append(", ");
                sb3.append(objArr[i7]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
