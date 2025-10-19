package G0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\e.smali */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f1751a;

    public e(Drawable.ConstantState constantState) {
        this.f1751a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1751a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1751a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f1751a.newDrawable();
        fVar.f1757a = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f1756f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f1751a.newDrawable(resources);
        fVar.f1757a = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f1756f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f1751a.newDrawable(resources, theme);
        fVar.f1757a = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f1756f);
        return fVar;
    }
}
