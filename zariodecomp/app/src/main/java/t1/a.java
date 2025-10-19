package T1;

import N2.AbstractC0156x;
import Q.b;
import android.R;
import android.content.res.ColorStateList;
import l.C0672A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T1\a.smali */
public final class a extends C0672A {

    /* renamed from: k, reason: collision with root package name */
    public static final int[][] f3190k = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3191e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3192f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3191e == null) {
            int I4 = AbstractC0156x.I(this, 2130903272);
            int I5 = AbstractC0156x.I(this, 2130903291);
            int I6 = AbstractC0156x.I(this, 2130903314);
            this.f3191e = new ColorStateList(f3190k, new int[]{AbstractC0156x.Q(I6, I4, 1.0f), AbstractC0156x.Q(I6, I5, 0.54f), AbstractC0156x.Q(I6, I5, 0.38f), AbstractC0156x.Q(I6, I5, 0.38f)});
        }
        return this.f3191e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3192f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f3192f = z4;
        if (z4) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }
}
