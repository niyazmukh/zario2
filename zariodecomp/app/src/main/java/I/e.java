package I;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\e.smali */
public abstract class e {
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
