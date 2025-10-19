package e2;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\g.smali */
public abstract class AbstractC0459g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0477z f6878a = new C0477z("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) throws NoSuchAlgorithmException {
        String strEncodeToString;
        if (signatureArr == null || (signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            C0477z c0477z = f6878a;
            c0477z.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", C0477z.c(c0477z.f6885a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
            return false;
        }
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                strEncodeToString = "";
            }
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        return false;
    }
}
