package O;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\O\a.smali */
public abstract class a {
    public static Interpolator a(float f2, float f3) {
        return new PathInterpolator(f2, f3);
    }

    public static Interpolator b(float f2, float f3, float f5, float f6) {
        return new PathInterpolator(f2, f3, f5, f6);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
