package M;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\j0.smali */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2397a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2398b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2399c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2400d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2397a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2398b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2399c = declaredField3;
            declaredField3.setAccessible(true);
            f2400d = true;
        } catch (ReflectiveOperationException e5) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
        }
    }
}
