package E;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E\f.smali */
public abstract class f {
    public static int a(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
