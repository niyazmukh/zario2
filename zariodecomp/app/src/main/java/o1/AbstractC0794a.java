package o1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o1.1\a.smali */
public abstract class AbstractC0794a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9156a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f9157b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f9158c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f9159d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f9160e;

    /* renamed from: f, reason: collision with root package name */
    public static String f9161f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f9162g;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            char[] cArr = f9156a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static byte[] b(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfo = ((Context) p1.c.a(context).b).getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i = 0;
            while (true) {
                if (i >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9157b == null) {
            f9157b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f9157b.booleanValue();
        if (f9158c == null) {
            f9158c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f9158c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static void d(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z4 = true;
        for (String str : map.keySet()) {
            if (!z4) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z4 = false;
        }
        sb.append("}");
    }
}
