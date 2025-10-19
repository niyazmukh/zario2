package G0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\d.smali */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public p f1747a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f1748b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1749c;

    /* renamed from: d, reason: collision with root package name */
    public q.b f1750d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
