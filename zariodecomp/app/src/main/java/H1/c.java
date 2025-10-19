package H1;

import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H1\c.smali */
public final class c extends InsetDrawable {
    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return false;
    }
}
