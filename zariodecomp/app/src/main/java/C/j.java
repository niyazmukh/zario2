package C;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\j.smali */
public abstract class j {
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Resources resources, int i, int i5, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i5, theme);
    }
}
