package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\a.1.smali */
public final class C0677a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f8549a;

    public C0677a(ActionBarContainer actionBarContainer) {
        this.f8549a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8549a;
        if (actionBarContainer.f4149k) {
            Drawable drawable = actionBarContainer.f4148f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4146d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4147e;
        if (drawable3 == null || !actionBarContainer.f4150l) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8549a;
        if (actionBarContainer.f4149k) {
            if (actionBarContainer.f4148f != null) {
                actionBarContainer.f4146d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4146d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
