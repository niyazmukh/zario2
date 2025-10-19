package B;

import android.content.Context;
import java.io.File;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\g.smali */
public abstract class g {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
