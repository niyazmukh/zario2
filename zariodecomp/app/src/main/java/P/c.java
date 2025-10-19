package p;

import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p.1\c.smali */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f9306a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f3, boolean z4) {
        if (!z4) {
            return f2;
        }
        return (float) (((1.0d - f9306a) * f3) + f2);
    }

    public static float b(float f2, float f3, boolean z4) {
        if (!z4) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f9306a) * f3) + (f2 * 1.5f));
    }
}
