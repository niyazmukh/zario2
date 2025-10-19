package e2;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import r.AbstractC0854a;

/* renamed from: e2.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\z.smali */
public final class C0477z {

    /* renamed from: a, reason: collision with root package name */
    public final String f6885a;

    public C0477z(String str) {
        this.f6885a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e5) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e5);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC0854a.c(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f6885a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f6885a, str, objArr));
        }
    }
}
