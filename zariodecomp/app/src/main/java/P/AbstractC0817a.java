package p;

import X1.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.AbstractC0765a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p.1\a.smali */
public abstract class AbstractC0817a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9290f = {R.attr.colorBackground};

    /* renamed from: k, reason: collision with root package name */
    public static final e f9291k = new e();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9292a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9293b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9294c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9295d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.c f9296e;

    public AbstractC0817a(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, 2130903769);
        Rect rect = new Rect();
        this.f9294c = rect;
        this.f9295d = new Rect();
        S0.c cVar = new S0.c(this);
        this.f9296e = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0765a.f8974a, 2130903769, 2131951903);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f9290f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(2131034161) : getResources().getColor(2131034160));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f9292a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f9293b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        e eVar = f9291k;
        C0818b c0818b = new C0818b(colorStateListValueOf, dimension);
        cVar.f2847b = c0818b;
        setBackgroundDrawable(c0818b);
        setClipToOutline(true);
        setElevation(dimension2);
        eVar.k(cVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0818b) ((Drawable) this.f9296e.f2847b)).h;
    }

    public float getCardElevation() {
        return ((AbstractC0817a) this.f9296e.f2848c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f9294c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9294c.left;
    }

    public int getContentPaddingRight() {
        return this.f9294c.right;
    }

    public int getContentPaddingTop() {
        return this.f9294c.top;
    }

    public float getMaxCardElevation() {
        return ((C0818b) ((Drawable) this.f9296e.f2847b)).f9301e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f9293b;
    }

    public float getRadius() {
        return ((C0818b) ((Drawable) this.f9296e.f2847b)).f9297a;
    }

    public boolean getUseCompatPadding() {
        return this.f9292a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C0818b c0818b = (C0818b) ((Drawable) this.f9296e.f2847b);
        if (colorStateListValueOf == null) {
            c0818b.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c0818b.h = colorStateListValueOf;
        c0818b.f9298b.setColor(colorStateListValueOf.getColorForState(c0818b.getState(), c0818b.h.getDefaultColor()));
        c0818b.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((AbstractC0817a) this.f9296e.f2848c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f9291k.k(this.f9296e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i5, int i6, int i7) {
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.f9293b) {
            this.f9293b = z4;
            e eVar = f9291k;
            S0.c cVar = this.f9296e;
            eVar.k(cVar, ((C0818b) ((Drawable) cVar.f2847b)).f9301e);
        }
    }

    public void setRadius(float f2) {
        C0818b c0818b = (C0818b) ((Drawable) this.f9296e.f2847b);
        if (f2 == c0818b.f9297a) {
            return;
        }
        c0818b.f9297a = f2;
        c0818b.b(null);
        c0818b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f9292a != z4) {
            this.f9292a = z4;
            e eVar = f9291k;
            S0.c cVar = this.f9296e;
            eVar.k(cVar, ((C0818b) ((Drawable) cVar.f2847b)).f9301e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0818b c0818b = (C0818b) ((Drawable) this.f9296e.f2847b);
        if (colorStateList == null) {
            c0818b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0818b.h = colorStateList;
        c0818b.f9298b.setColor(colorStateList.getColorForState(c0818b.getState(), c0818b.h.getDefaultColor()));
        c0818b.invalidateSelf();
    }
}
