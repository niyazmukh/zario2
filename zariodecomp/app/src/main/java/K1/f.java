package K1;

import Q1.i;
import X1.g;
import X1.h;
import X1.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K1\f.smali */
public final class f extends h implements Drawable.Callback, Q1.h {

    /* renamed from: J0, reason: collision with root package name */
    public static final int[] f2212J0 = {R.attr.state_enabled};

    /* renamed from: K0, reason: collision with root package name */
    public static final ShapeDrawable f2213K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public ColorStateList f2214A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2215B;

    /* renamed from: B0, reason: collision with root package name */
    public PorterDuff.Mode f2216B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2217C;

    /* renamed from: C0, reason: collision with root package name */
    public int[] f2218C0;

    /* renamed from: D, reason: collision with root package name */
    public float f2219D;

    /* renamed from: D0, reason: collision with root package name */
    public ColorStateList f2220D0;

    /* renamed from: E, reason: collision with root package name */
    public float f2221E;
    public WeakReference E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f2222F;

    /* renamed from: F0, reason: collision with root package name */
    public TextUtils.TruncateAt f2223F0;
    public float G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f2224G0;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f2225H;

    /* renamed from: H0, reason: collision with root package name */
    public int f2226H0;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f2227I;
    public boolean I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2228J;

    /* renamed from: K, reason: collision with root package name */
    public Drawable f2229K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f2230L;

    /* renamed from: M, reason: collision with root package name */
    public float f2231M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2232N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2233O;

    /* renamed from: P, reason: collision with root package name */
    public Drawable f2234P;

    /* renamed from: Q, reason: collision with root package name */
    public RippleDrawable f2235Q;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f2236R;

    /* renamed from: S, reason: collision with root package name */
    public float f2237S;

    /* renamed from: T, reason: collision with root package name */
    public SpannableStringBuilder f2238T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2239U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2240V;

    /* renamed from: W, reason: collision with root package name */
    public Drawable f2241W;
    public ColorStateList X;

    /* renamed from: Y, reason: collision with root package name */
    public B1.c f2242Y;

    /* renamed from: Z, reason: collision with root package name */
    public B1.c f2243Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f2244a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f2245b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f2246c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f2247d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f2248e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f2249f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f2250g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f2251h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Context f2252i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint f2253j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Paint.FontMetrics f2254k0;

    /* renamed from: l0, reason: collision with root package name */
    public final RectF f2255l0;

    /* renamed from: m0, reason: collision with root package name */
    public final PointF f2256m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Path f2257n0;

    /* renamed from: o0, reason: collision with root package name */
    public final i f2258o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2259p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2260q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2261r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2262s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2263t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2264u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f2265v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2266w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f2267x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorFilter f2268y0;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuffColorFilter f2269z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903237, 2131952643);
        this.f2221E = -1.0f;
        this.f2253j0 = new Paint(1);
        this.f2254k0 = new Paint.FontMetrics();
        this.f2255l0 = new RectF();
        this.f2256m0 = new PointF();
        this.f2257n0 = new Path();
        this.f2267x0 = 255;
        this.f2216B0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference(null);
        j(context);
        this.f2252i0 = context;
        i iVar = new i(this);
        this.f2258o0 = iVar;
        this.f2227I = "";
        iVar.f2796a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2212J0;
        setState(iArr);
        if (!Arrays.equals(this.f2218C0, iArr)) {
            this.f2218C0 = iArr;
            if (Z()) {
                C(getState(), iArr);
            }
        }
        this.f2224G0 = true;
        f2213K0.setTint(-1);
    }

    public static boolean A(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean z(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void B() {
        e eVar = (e) this.E0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.c(chip.f5916t);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.f.C(int[], int[]):boolean");
    }

    public final void D(boolean z4) {
        if (this.f2239U != z4) {
            this.f2239U = z4;
            float fW = w();
            if (!z4 && this.f2265v0) {
                this.f2265v0 = false;
            }
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void E(Drawable drawable) {
        if (this.f2241W != drawable) {
            float fW = w();
            this.f2241W = drawable;
            float fW2 = w();
            a0(this.f2241W);
            u(this.f2241W);
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.f2240V && (drawable = this.f2241W) != null && this.f2239U) {
                E.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z4) {
        if (this.f2240V != z4) {
            boolean zX = X();
            this.f2240V = z4;
            boolean zX2 = X();
            if (zX != zX2) {
                if (zX2) {
                    u(this.f2241W);
                } else {
                    a0(this.f2241W);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void H(float f2) {
        if (this.f2221E != f2) {
            this.f2221E = f2;
            l lVarE = this.f3738a.f3722a.e();
            lVarE.c(f2);
            setShapeAppearanceModel(lVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2229K;
        if (drawable3 != 0) {
            boolean z4 = drawable3 instanceof E.h;
            drawable2 = drawable3;
            if (z4) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.f2229K = drawable != null ? drawable.mutate() : null;
            float fW2 = w();
            a0(drawable2);
            if (Y()) {
                u(this.f2229K);
            }
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void J(float f2) {
        if (this.f2231M != f2) {
            float fW = w();
            this.f2231M = f2;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        this.f2232N = true;
        if (this.f2230L != colorStateList) {
            this.f2230L = colorStateList;
            if (Y()) {
                E.b.h(this.f2229K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z4) {
        if (this.f2228J != z4) {
            boolean zY = Y();
            this.f2228J = z4;
            boolean zY2 = Y();
            if (zY != zY2) {
                if (zY2) {
                    u(this.f2229K);
                } else {
                    a0(this.f2229K);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f2222F != colorStateList) {
            this.f2222F = colorStateList;
            if (this.I0) {
                q(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(float f2) {
        if (this.G != f2) {
            this.G = f2;
            this.f2253j0.setStrokeWidth(f2);
            if (this.I0) {
                this.f3738a.f3729j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2234P;
        if (drawable3 != 0) {
            boolean z4 = drawable3 instanceof E.h;
            drawable2 = drawable3;
            if (z4) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fX = x();
            this.f2234P = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.f2225H;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f2235Q = new RippleDrawable(colorStateListValueOf, this.f2234P, f2213K0);
            float fX2 = x();
            a0(drawable2);
            if (Z()) {
                u(this.f2234P);
            }
            invalidateSelf();
            if (fX != fX2) {
                B();
            }
        }
    }

    public final void P(float f2) {
        if (this.f2250g0 != f2) {
            this.f2250g0 = f2;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void Q(float f2) {
        if (this.f2237S != f2) {
            this.f2237S = f2;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void R(float f2) {
        if (this.f2249f0 != f2) {
            this.f2249f0 = f2;
            invalidateSelf();
            if (Z()) {
                B();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.f2236R != colorStateList) {
            this.f2236R = colorStateList;
            if (Z()) {
                E.b.h(this.f2234P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z4) {
        if (this.f2233O != z4) {
            boolean Z4 = Z();
            this.f2233O = z4;
            boolean Z5 = Z();
            if (Z4 != Z5) {
                if (Z5) {
                    u(this.f2234P);
                } else {
                    a0(this.f2234P);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void U(float f2) {
        if (this.f2246c0 != f2) {
            float fW = w();
            this.f2246c0 = f2;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void V(float f2) {
        if (this.f2245b0 != f2) {
            float fW = w();
            this.f2245b0 = f2;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.f2225H != colorStateList) {
            this.f2225H = colorStateList;
            this.f2220D0 = null;
            onStateChange(getState());
        }
    }

    public final boolean X() {
        return this.f2240V && this.f2241W != null && this.f2265v0;
    }

    public final boolean Y() {
        return this.f2228J && this.f2229K != null;
    }

    public final boolean Z() {
        return this.f2233O && this.f2234P != null;
    }

    @Override // X1.h, Q1.h
    public final void a() {
        B();
        invalidateSelf();
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i5;
        int i6;
        int i7;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f2267x0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z4 = this.I0;
        Paint paint = this.f2253j0;
        RectF rectF3 = this.f2255l0;
        if (!z4) {
            paint.setColor(this.f2259p0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, y(), y(), paint);
        }
        if (!this.I0) {
            paint.setColor(this.f2260q0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f2268y0;
            if (colorFilter == null) {
                colorFilter = this.f2269z0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, y(), y(), paint);
        }
        if (this.I0) {
            super.draw(canvas);
        }
        if (this.G > 0.0f && !this.I0) {
            paint.setColor(this.f2262s0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.I0) {
                ColorFilter colorFilter2 = this.f2268y0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f2269z0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.G / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f5 = this.f2221E - (this.G / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f2263t0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.I0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f2257n0;
            g gVar = this.f3738a;
            this.f3755v.a(gVar.f3722a, gVar.i, rectF4, this.f3754u, path);
            e(canvas, paint, path, this.f3738a.f3722a, g());
        } else {
            canvas.drawRoundRect(rectF3, y(), y(), paint);
        }
        if (Y()) {
            v(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f2229K.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2229K.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (X()) {
            v(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f2241W.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2241W.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f2224G0 || this.f2227I == null) {
            rectF = rectF3;
            i5 = iSaveLayerAlpha;
            i6 = 0;
            i7 = 255;
        } else {
            PointF pointF = this.f2256m0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2227I;
            i iVar = this.f2258o0;
            if (charSequence != null) {
                float fW = w() + this.f2244a0 + this.f2247d0;
                if (E.c.a(this) == 0) {
                    pointF.x = bounds.left + fW;
                } else {
                    pointF.x = bounds.right - fW;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.f2796a;
                Paint.FontMetrics fontMetrics = this.f2254k0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f2227I != null) {
                float fW2 = w() + this.f2244a0 + this.f2247d0;
                float fX = x() + this.f2251h0 + this.f2248e0;
                if (E.c.a(this) == 0) {
                    rectF3.left = bounds.left + fW2;
                    rectF3.right = bounds.right - fX;
                } else {
                    rectF3.left = bounds.left + fX;
                    rectF3.right = bounds.right - fW2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            U1.d dVar = iVar.f2801f;
            TextPaint textPaint2 = iVar.f2796a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f2801f.e(this.f2252i0, textPaint2, iVar.f2797b);
            }
            textPaint2.setTextAlign(align);
            boolean z5 = Math.round(iVar.a(this.f2227I.toString())) > Math.round(rectF3.width());
            if (z5) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f2227I;
            if (z5 && this.f2223F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f2223F0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i5 = iSaveLayerAlpha;
            i6 = 0;
            i7 = 255;
            canvas.drawText(charSequence2, 0, length, f10, f11, textPaint2);
            if (z5) {
                canvas.restoreToCount(iSave);
            }
        }
        if (Z()) {
            rectF.setEmpty();
            if (Z()) {
                float f12 = this.f2251h0 + this.f2250g0;
                if (E.c.a(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f2237S;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f2237S;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f15 = this.f2237S;
                float f16 = fExactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f2234P.setBounds(i6, i6, (int) rectF2.width(), (int) rectF2.height());
            this.f2235Q.setBounds(this.f2234P.getBounds());
            this.f2235Q.jumpToCurrentState();
            this.f2235Q.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f2267x0 < i7) {
            canvas.restoreToCount(i5);
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2267x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2268y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2219D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(x() + this.f2258o0.a(this.f2227I.toString()) + w() + this.f2244a0 + this.f2247d0 + this.f2248e0 + this.f2251h0), this.f2226H0);
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2219D, this.f2221E);
        } else {
            outline.setRoundRect(bounds, this.f2221E);
        }
        outline.setAlpha(this.f2267x0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        U1.d dVar;
        ColorStateList colorStateList;
        return z(this.f2215B) || z(this.f2217C) || z(this.f2222F) || !((dVar = this.f2258o0.f2801f) == null || (colorStateList = dVar.f3308j) == null || !colorStateList.isStateful()) || ((this.f2240V && this.f2241W != null && this.f2239U) || A(this.f2229K) || A(this.f2241W) || z(this.f2214A0));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Y()) {
            zOnLayoutDirectionChanged |= E.c.b(this.f2229K, i);
        }
        if (X()) {
            zOnLayoutDirectionChanged |= E.c.b(this.f2241W, i);
        }
        if (Z()) {
            zOnLayoutDirectionChanged |= E.c.b(this.f2234P, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (Y()) {
            zOnLevelChange |= this.f2229K.setLevel(i);
        }
        if (X()) {
            zOnLevelChange |= this.f2241W.setLevel(i);
        }
        if (Z()) {
            zOnLevelChange |= this.f2234P.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // X1.h, android.graphics.drawable.Drawable, Q1.h
    public final boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return C(iArr, this.f2218C0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2267x0 != i) {
            this.f2267x0 = i;
            invalidateSelf();
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2268y0 != colorFilter) {
            this.f2268y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2214A0 != colorStateList) {
            this.f2214A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X1.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f2216B0 != mode) {
            this.f2216B0 = mode;
            ColorStateList colorStateList = this.f2214A0;
            this.f2269z0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (Y()) {
            visible |= this.f2229K.setVisible(z4, z5);
        }
        if (X()) {
            visible |= this.f2241W.setVisible(z4, z5);
        }
        if (Z()) {
            visible |= this.f2234P.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        E.c.b(drawable, E.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2234P) {
            if (drawable.isStateful()) {
                drawable.setState(this.f2218C0);
            }
            E.b.h(drawable, this.f2236R);
            return;
        }
        Drawable drawable2 = this.f2229K;
        if (drawable == drawable2 && this.f2232N) {
            E.b.h(drawable2, this.f2230L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y() || X()) {
            float f2 = this.f2244a0 + this.f2245b0;
            Drawable drawable = this.f2265v0 ? this.f2241W : this.f2229K;
            float intrinsicWidth = this.f2231M;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (E.c.a(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - intrinsicWidth;
            }
            Drawable drawable2 = this.f2265v0 ? this.f2241W : this.f2229K;
            float fCeil = this.f2231M;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2252i0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float w() {
        if (!Y() && !X()) {
            return 0.0f;
        }
        float f2 = this.f2245b0;
        Drawable drawable = this.f2265v0 ? this.f2241W : this.f2229K;
        float intrinsicWidth = this.f2231M;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f2 + this.f2246c0;
    }

    public final float x() {
        if (Z()) {
            return this.f2249f0 + this.f2237S + this.f2250g0;
        }
        return 0.0f;
    }

    public final float y() {
        return this.I0 ? h() : this.f2221E;
    }
}
