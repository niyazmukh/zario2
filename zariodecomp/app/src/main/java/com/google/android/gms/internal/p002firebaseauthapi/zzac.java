package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzac.smali */
public final class zzac {
    public static String zza(String str) {
        return zzp.zzb(str);
    }

    public static String zzb(String str) {
        return zzp.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzp.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i5 = 0; i5 < objArr.length; i5++) {
                objArr[i5] = zza(objArr[i5]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i6 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i6)) != -1) {
            sb.append((CharSequence) strValueOf, i6, iIndexOf);
            sb.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i6, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i7 = i + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e5) {
            String strC = AbstractC0854a.c(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", AbstractC0854a.b("Exception during lenientFormat for ", strC), (Throwable) e5);
            return "<" + strC + " threw " + e5.getClass().getName() + ">";
        }
    }
}
