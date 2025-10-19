package B;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\f.smali */
public abstract class f {
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
