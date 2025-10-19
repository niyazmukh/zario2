package G0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\n.smali */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1793a;

    /* renamed from: b, reason: collision with root package name */
    public m f1794b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1795c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1796d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1797e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f1798f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1799g;
    public PorterDuff.Mode h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1800j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1801k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f1802l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1793a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
