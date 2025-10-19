package B;

import android.content.Context;
import java.io.File;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\d.smali */
public abstract class d {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] c(Context context) {
        return context.getObbDirs();
    }
}
