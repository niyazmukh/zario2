package X1;

import N2.AbstractC0156x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\h.smali */
public class h extends Drawable implements x {

    /* renamed from: A, reason: collision with root package name */
    public static final Paint f3737A;

    /* renamed from: a, reason: collision with root package name */
    public g f3738a;

    /* renamed from: b, reason: collision with root package name */
    public final v[] f3739b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f3740c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f3741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3742e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f3743f;

    /* renamed from: k, reason: collision with root package name */
    public final Path f3744k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f3745l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f3746m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f3747n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f3748o;

    /* renamed from: p, reason: collision with root package name */
    public final Region f3749p;

    /* renamed from: q, reason: collision with root package name */
    public m f3750q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f3751r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f3752s;

    /* renamed from: t, reason: collision with root package name */
    public final W1.a f3753t;

    /* renamed from: u, reason: collision with root package name */
    public final K2.c f3754u;

    /* renamed from: v, reason: collision with root package name */
    public final o f3755v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f3756w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f3757x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f3758y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3759z;

    static {
        Paint paint = new Paint(1);
        f3737A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new m());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        g gVar = this.f3738a;
        this.f3755v.a(gVar.f3722a, gVar.i, rectF, this.f3754u, path);
        if (this.f3738a.h != 1.0f) {
            Matrix matrix = this.f3743f;
            matrix.reset();
            float f2 = this.f3738a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3758y, true);
    }

    public final int c(int i) {
        int i5;
        g gVar = this.f3738a;
        float f2 = gVar.f3732m + 0.0f + gVar.f3731l;
        O1.a aVar = gVar.f3723b;
        if (aVar == null || !aVar.f2635a || D.a.d(i, 255) != aVar.f2638d) {
            return i;
        }
        float fMin = (aVar.f2639e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iQ = AbstractC0156x.Q(D.a.d(i, 255), aVar.f2636b, fMin);
        if (fMin > 0.0f && (i5 = aVar.f2637c) != 0) {
            iQ = D.a.b(D.a.d(i5, O1.a.f2634f), iQ);
        }
        return D.a.d(iQ, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f3741d.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f3738a.f3735p;
        Path path = this.f3744k;
        W1.a aVar = this.f3753t;
        if (i != 0) {
            canvas.drawPath(path, aVar.f3695a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            v vVar = this.f3739b[i5];
            int i6 = this.f3738a.f3734o;
            Matrix matrix = v.f3809b;
            vVar.a(matrix, aVar, i6, canvas);
            this.f3740c[i5].a(matrix, aVar, this.f3738a.f3734o, canvas);
        }
        if (this.f3759z) {
            double d5 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d5)) * this.f3738a.f3735p);
            int iCos = (int) (Math.cos(Math.toRadians(d5)) * this.f3738a.f3735p);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f3737A);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f3751r;
        paint.setColorFilter(this.f3756w);
        int alpha = paint.getAlpha();
        int i = this.f3738a.f3730k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f3752s;
        paint2.setColorFilter(this.f3757x);
        paint2.setStrokeWidth(this.f3738a.f3729j);
        int alpha2 = paint2.getAlpha();
        int i5 = this.f3738a.f3730k;
        paint2.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        boolean z4 = this.f3742e;
        Path path = this.f3744k;
        if (z4) {
            float f2 = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            m mVar = this.f3738a.f3722a;
            l lVarE = mVar.e();
            c bVar = mVar.f3777e;
            if (!(bVar instanceof j)) {
                bVar = new b(f2, bVar);
            }
            lVarE.f3767e = bVar;
            c bVar2 = mVar.f3778f;
            if (!(bVar2 instanceof j)) {
                bVar2 = new b(f2, bVar2);
            }
            lVarE.f3768f = bVar2;
            c bVar3 = mVar.h;
            if (!(bVar3 instanceof j)) {
                bVar3 = new b(f2, bVar3);
            }
            lVarE.h = bVar3;
            c bVar4 = mVar.f3779g;
            if (!(bVar4 instanceof j)) {
                bVar4 = new b(f2, bVar4);
            }
            lVarE.f3769g = bVar4;
            m mVarA = lVarE.a();
            this.f3750q = mVarA;
            float f3 = this.f3738a.i;
            RectF rectF = this.f3747n;
            rectF.set(g());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f3755v.a(mVarA, f3, rectF, null, this.f3745l);
            b(g(), path);
            this.f3742e = false;
        }
        g gVar = this.f3738a;
        int i6 = gVar.f3733n;
        if (i6 != 1 && gVar.f3734o > 0) {
            if (i6 == 2) {
                canvas.save();
                double d5 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d5)) * this.f3738a.f3735p), (int) (Math.cos(Math.toRadians(d5)) * this.f3738a.f3735p));
                if (this.f3759z) {
                    RectF rectF2 = this.f3758y;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f3738a.f3734o * 2) + ((int) rectF2.width()) + iWidth, (this.f3738a.f3734o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f5 = (getBounds().left - this.f3738a.f3734o) - iWidth;
                    float f6 = (getBounds().top - this.f3738a.f3734o) - iHeight;
                    canvas2.translate(-f5, -f6);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f5, f6, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            } else if (!k()) {
                path.isConvex();
            }
        }
        g gVar2 = this.f3738a;
        Paint.Style style = gVar2.f3736q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, gVar2.f3722a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, m mVar, RectF rectF) {
        if (!mVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = mVar.f3778f.a(rectF) * this.f3738a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f3752s;
        Path path = this.f3745l;
        m mVar = this.f3750q;
        RectF rectF = this.f3747n;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, mVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f3746m;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3738a.f3730k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3738a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f3738a.f3733n == 2) {
            return;
        }
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.f3738a.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.f3744k;
        b(rectFG, path);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3738a.f3728g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3748o;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f3744k;
        b(rectFG, path);
        Region region2 = this.f3749p;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.f3738a.f3722a.f3777e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.f3738a.f3736q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3752s.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3742e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f3738a.f3726e) == null || !colorStateList.isStateful())) {
            this.f3738a.getClass();
            ColorStateList colorStateList3 = this.f3738a.f3725d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f3738a.f3724c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(Context context) {
        this.f3738a.f3723b = new O1.a(context);
        t();
    }

    public final boolean k() {
        return this.f3738a.f3722a.d(g());
    }

    public final void l(float f2) {
        g gVar = this.f3738a;
        if (gVar.f3732m != f2) {
            gVar.f3732m = f2;
            t();
        }
    }

    public final void m(ColorStateList colorStateList) {
        g gVar = this.f3738a;
        if (gVar.f3724c != colorStateList) {
            gVar.f3724c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3738a = new g(this.f3738a);
        return this;
    }

    public final void n(float f2) {
        g gVar = this.f3738a;
        if (gVar.i != f2) {
            gVar.i = f2;
            this.f3742e = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.f3753t.a(-12303292);
        this.f3738a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f3742e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, Q1.h
    public boolean onStateChange(int[] iArr) {
        boolean z4 = r(iArr) || s();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public final void p() {
        g gVar = this.f3738a;
        if (gVar.f3733n != 2) {
            gVar.f3733n = 2;
            super.invalidateSelf();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f3738a;
        if (gVar.f3725d != colorStateList) {
            gVar.f3725d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean r(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3738a.f3724c == null || color2 == (colorForState2 = this.f3738a.f3724c.getColorForState(iArr, (color2 = (paint2 = this.f3751r).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f3738a.f3725d == null || color == (colorForState = this.f3738a.f3725d.getColorForState(iArr, (color = (paint = this.f3752s).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean s() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3756w;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f3757x;
        g gVar = this.f3738a;
        ColorStateList colorStateList = gVar.f3726e;
        PorterDuff.Mode mode = gVar.f3727f;
        Paint paint = this.f3751r;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f3756w = porterDuffColorFilter;
        this.f3738a.getClass();
        this.f3757x = null;
        this.f3738a.getClass();
        return (L.b.a(porterDuffColorFilter2, this.f3756w) && L.b.a(porterDuffColorFilter3, this.f3757x)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        g gVar = this.f3738a;
        if (gVar.f3730k != i) {
            gVar.f3730k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3738a.getClass();
        super.invalidateSelf();
    }

    @Override // X1.x
    public final void setShapeAppearanceModel(m mVar) {
        this.f3738a.f3722a = mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3738a.f3726e = colorStateList;
        s();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f3738a;
        if (gVar.f3727f != mode) {
            gVar.f3727f = mode;
            s();
            super.invalidateSelf();
        }
    }

    public final void t() {
        g gVar = this.f3738a;
        float f2 = gVar.f3732m + 0.0f;
        gVar.f3734o = (int) Math.ceil(0.75f * f2);
        this.f3738a.f3735p = (int) Math.ceil(f2 * 0.25f);
        s();
        super.invalidateSelf();
    }

    public h(Context context, AttributeSet attributeSet, int i, int i5) {
        this(m.b(context, attributeSet, i, i5).a());
    }

    public h(m mVar) {
        this(new g(mVar));
    }

    public h(g gVar) {
        o oVar;
        this.f3739b = new v[4];
        this.f3740c = new v[4];
        this.f3741d = new BitSet(8);
        this.f3743f = new Matrix();
        this.f3744k = new Path();
        this.f3745l = new Path();
        this.f3746m = new RectF();
        this.f3747n = new RectF();
        this.f3748o = new Region();
        this.f3749p = new Region();
        Paint paint = new Paint(1);
        this.f3751r = paint;
        Paint paint2 = new Paint(1);
        this.f3752s = paint2;
        this.f3753t = new W1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = n.f3783a;
        } else {
            oVar = new o();
        }
        this.f3755v = oVar;
        this.f3758y = new RectF();
        this.f3759z = true;
        this.f3738a = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        s();
        r(getState());
        this.f3754u = new K2.c(this, 13);
    }
}
