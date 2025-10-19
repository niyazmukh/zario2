package l;

import A2.C0009i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f.AbstractC0489a;
import java.util.WeakHashMap;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\E.smali */
public final class C0675E extends C0724z {

    /* renamed from: e, reason: collision with root package name */
    public final C0674D f8439e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8440f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8441g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8442j;

    public C0675E(C0674D c0674d) {
        super(c0674d);
        this.f8441g = null;
        this.h = null;
        this.i = false;
        this.f8442j = false;
        this.f8439e = c0674d;
    }

    @Override // l.C0724z
    public final void d(AttributeSet attributeSet, int i) {
        super.d(attributeSet, 2130903954);
        C0674D c0674d = this.f8439e;
        Context context = c0674d.getContext();
        int[] iArr = AbstractC0489a.f6968g;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, 2130903954);
        Context context2 = c0674d.getContext();
        WeakHashMap weakHashMap = M.S.f2363a;
        M.M.d(c0674d, context2, iArr, attributeSet, (TypedArray) c0009iY.f205c, 2130903954, 0);
        Drawable drawableJ = c0009iY.J(0);
        if (drawableJ != null) {
            c0674d.setThumb(drawableJ);
        }
        Drawable drawableI = c0009iY.I(1);
        Drawable drawable = this.f8440f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f8440f = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(c0674d);
            E.c.b(drawableI, M.C.d(c0674d));
            if (drawableI.isStateful()) {
                drawableI.setState(c0674d.getDrawableState());
            }
            h();
        }
        c0674d.invalidate();
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0692h0.b(typedArray.getInt(3, -1), this.h);
            this.f8442j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f8441g = c0009iY.F(2);
            this.i = true;
        }
        c0009iY.e0();
        h();
    }

    public final void h() {
        Drawable drawable = this.f8440f;
        if (drawable != null) {
            if (this.i || this.f8442j) {
                Drawable drawableMutate = drawable.mutate();
                this.f8440f = drawableMutate;
                if (this.i) {
                    E.b.h(drawableMutate, this.f8441g);
                }
                if (this.f8442j) {
                    E.b.i(this.f8440f, this.h);
                }
                if (this.f8440f.isStateful()) {
                    this.f8440f.setState(this.f8439e.getDrawableState());
                }
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.f8440f != null) {
            int max = this.f8439e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8440f.getIntrinsicWidth();
                int intrinsicHeight = this.f8440f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8440f.setBounds(-i, -i5, i, i5);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f8440f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
