package com.google.android.material.imageview;

import A1.a;
import B.l;
import X1.h;
import X1.m;
import X1.n;
import X1.o;
import X1.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import c2.AbstractC0336a;
import l.C0718w;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\imageview\ShapeableImageView.smali */
public class ShapeableImageView extends C0718w implements x {

    /* renamed from: d, reason: collision with root package name */
    public final o f6055d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f6056e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f6057f;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f6058k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f6059l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f6060m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f6061n;

    /* renamed from: o, reason: collision with root package name */
    public h f6062o;

    /* renamed from: p, reason: collision with root package name */
    public m f6063p;

    /* renamed from: q, reason: collision with root package name */
    public float f6064q;

    /* renamed from: r, reason: collision with root package name */
    public final Path f6065r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6066s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6067t;

    /* renamed from: u, reason: collision with root package name */
    public final int f6068u;

    /* renamed from: v, reason: collision with root package name */
    public final int f6069v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6070w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6071x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6072y;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 0, 2131952698), attributeSet, 0);
        this.f6055d = n.f3783a;
        this.f6060m = new Path();
        this.f6072y = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f6059l = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f6056e = new RectF();
        this.f6057f = new RectF();
        this.f6065r = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.f34C, 0, 2131952698);
        setLayerType(2, null);
        this.f6061n = d.x(context2, typedArrayObtainStyledAttributes, 9);
        this.f6064q = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6066s = dimensionPixelSize;
        this.f6067t = dimensionPixelSize;
        this.f6068u = dimensionPixelSize;
        this.f6069v = dimensionPixelSize;
        this.f6066s = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f6067t = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f6068u = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f6069v = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f6070w = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f6071x = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f6058k = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f6063p = m.b(context2, attributeSet, 0, 2131952698).a();
        setOutlineProvider(new P1.a(this));
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i5) {
        RectF rectF = this.f6056e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i5 - getPaddingBottom());
        m mVar = this.f6063p;
        Path path = this.f6060m;
        this.f6055d.a(mVar, 1.0f, rectF, null, path);
        Path path2 = this.f6065r;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f6057f;
        rectF2.set(0.0f, 0.0f, i, i5);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f6069v;
    }

    public final int getContentPaddingEnd() {
        int i = this.f6071x;
        return i != Integer.MIN_VALUE ? i : c() ? this.f6066s : this.f6068u;
    }

    public int getContentPaddingLeft() {
        int i;
        int i5;
        if (this.f6070w != Integer.MIN_VALUE || this.f6071x != Integer.MIN_VALUE) {
            if (c() && (i5 = this.f6071x) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!c() && (i = this.f6070w) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f6066s;
    }

    public int getContentPaddingRight() {
        int i;
        int i5;
        if (this.f6070w != Integer.MIN_VALUE || this.f6071x != Integer.MIN_VALUE) {
            if (c() && (i5 = this.f6070w) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!c() && (i = this.f6071x) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f6068u;
    }

    public final int getContentPaddingStart() {
        int i = this.f6070w;
        return i != Integer.MIN_VALUE ? i : c() ? this.f6068u : this.f6066s;
    }

    public int getContentPaddingTop() {
        return this.f6067t;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.f6063p;
    }

    public ColorStateList getStrokeColor() {
        return this.f6061n;
    }

    public float getStrokeWidth() {
        return this.f6064q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f6065r, this.f6059l);
        if (this.f6061n == null) {
            return;
        }
        Paint paint = this.f6058k;
        paint.setStrokeWidth(this.f6064q);
        int colorForState = this.f6061n.getColorForState(getDrawableState(), this.f6061n.getDefaultColor());
        if (this.f6064q <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f6060m, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (!this.f6072y && isLayoutDirectionResolved()) {
            this.f6072y = true;
            if (!isPaddingRelative() && this.f6070w == Integer.MIN_VALUE && this.f6071x == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        d(i, i5);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i5, int i6, int i7) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i5, getContentPaddingRight() + i6, getContentPaddingBottom() + i7);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i5, int i6, int i7) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i5, getContentPaddingEnd() + i6, getContentPaddingBottom() + i7);
    }

    @Override // X1.x
    public void setShapeAppearanceModel(m mVar) {
        this.f6063p = mVar;
        h hVar = this.f6062o;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f6061n = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(l.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f2) {
        if (this.f6064q != f2) {
            this.f6064q = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }
}
