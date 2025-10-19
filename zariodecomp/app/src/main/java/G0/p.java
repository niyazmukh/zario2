package G0;

import E.c;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\p.smali */
public final class p extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final PorterDuff.Mode f1804n = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f1805b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f1806c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f1807d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1808e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1809f;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1810k;

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f1811l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1812m;

    public p() {
        this.f1809f = true;
        this.f1810k = new float[9];
        this.f1811l = new Matrix();
        this.f1812m = new Rect();
        n nVar = new n();
        nVar.f1795c = null;
        nVar.f1796d = f1804n;
        nVar.f1794b = new m();
        this.f1805b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1757a;
        if (drawable == null) {
            return false;
        }
        E.b.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1812m;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1807d;
        if (colorFilter == null) {
            colorFilter = this.f1806c;
        }
        Matrix matrix = this.f1811l;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1810k;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && c.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f1805b;
        Bitmap bitmap = nVar.f1798f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f1798f.getHeight()) {
            nVar.f1798f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f1801k = true;
        }
        if (this.f1809f) {
            n nVar2 = this.f1805b;
            if (nVar2.f1801k || nVar2.f1799g != nVar2.f1795c || nVar2.h != nVar2.f1796d || nVar2.f1800j != nVar2.f1797e || nVar2.i != nVar2.f1794b.getRootAlpha()) {
                n nVar3 = this.f1805b;
                nVar3.f1798f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f1798f);
                m mVar = nVar3.f1794b;
                mVar.a(mVar.f1786g, m.f1779p, canvas2, iMin, iMin2);
                n nVar4 = this.f1805b;
                nVar4.f1799g = nVar4.f1795c;
                nVar4.h = nVar4.f1796d;
                nVar4.i = nVar4.f1794b.getRootAlpha();
                nVar4.f1800j = nVar4.f1797e;
                nVar4.f1801k = false;
            }
        } else {
            n nVar5 = this.f1805b;
            nVar5.f1798f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f1798f);
            m mVar2 = nVar5.f1794b;
            mVar2.a(mVar2.f1786g, m.f1779p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f1805b;
        if (nVar6.f1794b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f1802l == null) {
                Paint paint2 = new Paint();
                nVar6.f1802l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f1802l.setAlpha(nVar6.f1794b.getRootAlpha());
            nVar6.f1802l.setColorFilter(colorFilter);
            paint = nVar6.f1802l;
        }
        canvas.drawBitmap(nVar6.f1798f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1757a;
        return drawable != null ? E.a.a(drawable) : this.f1805b.f1794b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f1805b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1757a;
        return drawable != null ? E.b.c(drawable) : this.f1807d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1757a != null) {
            return new o(this.f1757a.getConstantState());
        }
        this.f1805b.f1793a = getChangingConfigurations();
        return this.f1805b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1757a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1805b.f1794b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1757a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1805b.f1794b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1757a;
        return drawable != null ? E.a.d(drawable) : this.f1805b.f1797e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f1805b;
            if (nVar != null) {
                m mVar = nVar.f1794b;
                if (mVar.f1791n == null) {
                    mVar.f1791n = Boolean.valueOf(mVar.f1786g.a());
                }
                if (mVar.f1791n.booleanValue() || ((colorStateList = this.f1805b.f1795c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1808e && super.mutate() == this) {
            n nVar = this.f1805b;
            n nVar2 = new n();
            nVar2.f1795c = null;
            nVar2.f1796d = f1804n;
            if (nVar != null) {
                nVar2.f1793a = nVar.f1793a;
                m mVar = new m(nVar.f1794b);
                nVar2.f1794b = mVar;
                if (nVar.f1794b.f1784e != null) {
                    mVar.f1784e = new Paint(nVar.f1794b.f1784e);
                }
                if (nVar.f1794b.f1783d != null) {
                    nVar2.f1794b.f1783d = new Paint(nVar.f1794b.f1783d);
                }
                nVar2.f1795c = nVar.f1795c;
                nVar2.f1796d = nVar.f1796d;
                nVar2.f1797e = nVar.f1797e;
            }
            this.f1805b = nVar2;
            this.f1808e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f1805b;
        ColorStateList colorStateList = nVar.f1795c;
        if (colorStateList == null || (mode = nVar.f1796d) == null) {
            z4 = false;
        } else {
            this.f1806c = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        m mVar = nVar.f1794b;
        if (mVar.f1791n == null) {
            mVar.f1791n = Boolean.valueOf(mVar.f1786g.a());
        }
        if (mVar.f1791n.booleanValue()) {
            boolean zB = nVar.f1794b.f1786g.b(iArr);
            nVar.f1801k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1805b.f1794b.getRootAlpha() != i) {
            this.f1805b.f1794b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            E.a.e(drawable, z4);
        } else {
            this.f1805b.f1797e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1807d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            AbstractC0183a.j0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            E.b.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f1805b;
        if (nVar.f1795c != colorStateList) {
            nVar.f1795c = colorStateList;
            this.f1806c = a(colorStateList, nVar.f1796d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            E.b.i(drawable, mode);
            return;
        }
        n nVar = this.f1805b;
        if (nVar.f1796d != mode) {
            nVar.f1796d = mode;
            this.f1806c = a(nVar.f1795c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f1757a;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        m mVar;
        int i;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f1757a;
        if (drawable != null) {
            E.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f1805b;
        nVar.f1794b = new m();
        TypedArray typedArrayF = C.b.f(resources, theme, attributeSet, a.f1740a);
        n nVar2 = this.f1805b;
        m mVar2 = nVar2.f1794b;
        int i7 = !C.b.c(xmlPullParser, "tintMode") ? -1 : typedArrayF.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i8 = 3;
        if (i7 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i7 != 5) {
            if (i7 != 9) {
                switch (i7) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f1796d = mode;
        int i9 = 1;
        ColorStateList colorStateListA = null;
        boolean z6 = false;
        if (C.b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i10 >= 28 && i10 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                ThreadLocal threadLocal = C.c.f1044a;
                try {
                    colorStateListA = C.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e5) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f1795c = colorStateList;
        }
        boolean z7 = nVar2.f1797e;
        if (C.b.c(xmlPullParser, "autoMirrored")) {
            z7 = typedArrayF.getBoolean(5, z7);
        }
        nVar2.f1797e = z7;
        float f2 = mVar2.f1787j;
        if (C.b.c(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayF.getFloat(7, f2);
        }
        mVar2.f1787j = f2;
        float f3 = mVar2.f1788k;
        if (C.b.c(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayF.getFloat(8, f3);
        }
        mVar2.f1788k = f3;
        if (mVar2.f1787j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            mVar2.h = typedArrayF.getDimension(3, mVar2.h);
            float dimension = typedArrayF.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (C.b.c(xmlPullParser, "alpha")) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = typedArrayF.getString(0);
                if (string != null) {
                    mVar2.f1790m = string;
                    mVar2.f1792o.put(string, mVar2);
                }
                typedArrayF.recycle();
                nVar.f1793a = getChangingConfigurations();
                nVar.f1801k = true;
                n nVar3 = this.f1805b;
                m mVar3 = nVar3.f1794b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f1786g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z8 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i = depth;
                        q.b bVar = mVar3.f1792o;
                        if (zEquals) {
                            i iVar = new i();
                            iVar.f1759e = 0.0f;
                            iVar.f1761g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.i = 0.0f;
                            iVar.f1762j = 1.0f;
                            iVar.f1763k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f1764l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            iVar.f1765m = join3;
                            mVar = mVar3;
                            iVar.f1766n = 4.0f;
                            TypedArray typedArrayF2 = C.b.f(resources, theme, attributeSet, a.f1742c);
                            if (C.b.c(xmlPullParser, "pathData")) {
                                String string2 = typedArrayF2.getString(0);
                                if (string2 != null) {
                                    iVar.f1777b = string2;
                                }
                                String string3 = typedArrayF2.getString(2);
                                if (string3 != null) {
                                    iVar.f1776a = AbstractC0156x.s(string3);
                                }
                                iVar.f1760f = C.b.b(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                float f5 = iVar.h;
                                if (C.b.c(xmlPullParser, "fillAlpha")) {
                                    f5 = typedArrayF2.getFloat(12, f5);
                                }
                                iVar.h = f5;
                                int i11 = !C.b.c(xmlPullParser, "strokeLineCap") ? -1 : typedArrayF2.getInt(8, -1);
                                Paint.Cap cap3 = iVar.f1764l;
                                if (i11 != 0) {
                                    join = join3;
                                    if (i11 != 1) {
                                        cap = i11 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                iVar.f1764l = cap;
                                int i12 = !C.b.c(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayF2.getInt(9, -1);
                                Paint.Join join4 = iVar.f1765m;
                                if (i12 == 0) {
                                    join2 = join;
                                } else if (i12 != 1) {
                                    join2 = i12 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                iVar.f1765m = join2;
                                float f6 = iVar.f1766n;
                                if (C.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f6 = typedArrayF2.getFloat(10, f6);
                                }
                                iVar.f1766n = f6;
                                iVar.f1758d = C.b.b(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                float f7 = iVar.f1761g;
                                if (C.b.c(xmlPullParser, "strokeAlpha")) {
                                    f7 = typedArrayF2.getFloat(11, f7);
                                }
                                iVar.f1761g = f7;
                                float f8 = iVar.f1759e;
                                if (C.b.c(xmlPullParser, "strokeWidth")) {
                                    f8 = typedArrayF2.getFloat(4, f8);
                                }
                                iVar.f1759e = f8;
                                float f9 = iVar.f1762j;
                                if (C.b.c(xmlPullParser, "trimPathEnd")) {
                                    f9 = typedArrayF2.getFloat(6, f9);
                                }
                                iVar.f1762j = f9;
                                float f10 = iVar.f1763k;
                                if (C.b.c(xmlPullParser, "trimPathOffset")) {
                                    f10 = typedArrayF2.getFloat(7, f10);
                                }
                                iVar.f1763k = f10;
                                float f11 = iVar.i;
                                if (C.b.c(xmlPullParser, "trimPathStart")) {
                                    f11 = typedArrayF2.getFloat(5, f11);
                                }
                                iVar.i = f11;
                                int i13 = iVar.f1778c;
                                if (C.b.c(xmlPullParser, "fillType")) {
                                    i13 = typedArrayF2.getInt(13, i13);
                                }
                                iVar.f1778c = i13;
                            }
                            typedArrayF2.recycle();
                            jVar.f1768b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f1793a = nVar3.f1793a;
                            z5 = false;
                            i5 = 1;
                            z8 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (C.b.c(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayF3 = C.b.f(resources, theme, attributeSet, a.f1743d);
                                    String string4 = typedArrayF3.getString(0);
                                    if (string4 != null) {
                                        hVar.f1777b = string4;
                                    }
                                    String string5 = typedArrayF3.getString(1);
                                    if (string5 != null) {
                                        hVar.f1776a = AbstractC0156x.s(string5);
                                    }
                                    hVar.f1778c = !C.b.c(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                    typedArrayF3.recycle();
                                }
                                jVar.f1768b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f1793a = nVar3.f1793a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray typedArrayF4 = C.b.f(resources, theme, attributeSet, a.f1741b);
                                float f12 = jVar2.f1769c;
                                if (C.b.c(xmlPullParser, "rotation")) {
                                    f12 = typedArrayF4.getFloat(5, f12);
                                }
                                jVar2.f1769c = f12;
                                i5 = 1;
                                jVar2.f1770d = typedArrayF4.getFloat(1, jVar2.f1770d);
                                jVar2.f1771e = typedArrayF4.getFloat(2, jVar2.f1771e);
                                float f13 = jVar2.f1772f;
                                if (C.b.c(xmlPullParser, "scaleX")) {
                                    f13 = typedArrayF4.getFloat(3, f13);
                                }
                                jVar2.f1772f = f13;
                                float f14 = jVar2.f1773g;
                                if (C.b.c(xmlPullParser, "scaleY")) {
                                    f14 = typedArrayF4.getFloat(4, f14);
                                }
                                jVar2.f1773g = f14;
                                float f15 = jVar2.h;
                                if (C.b.c(xmlPullParser, "translateX")) {
                                    f15 = typedArrayF4.getFloat(6, f15);
                                }
                                jVar2.h = f15;
                                float f16 = jVar2.i;
                                if (C.b.c(xmlPullParser, "translateY")) {
                                    f16 = typedArrayF4.getFloat(7, f16);
                                }
                                jVar2.i = f16;
                                z5 = false;
                                String string6 = typedArrayF4.getString(0);
                                if (string6 != null) {
                                    jVar2.f1775k = string6;
                                }
                                jVar2.c();
                                typedArrayF4.recycle();
                                jVar.f1768b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f1793a = nVar3.f1793a;
                            }
                            z5 = false;
                            i5 = 1;
                        }
                        z4 = z5;
                        i6 = 3;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        i5 = i9;
                        z4 = z6;
                        i6 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i8 = i6;
                    z6 = z4;
                    i9 = i5;
                    depth = i;
                    mVar3 = mVar;
                }
                if (!z8) {
                    this.f1806c = a(nVar.f1795c, nVar.f1796d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f1809f = true;
        this.f1810k = new float[9];
        this.f1811l = new Matrix();
        this.f1812m = new Rect();
        this.f1805b = nVar;
        this.f1806c = a(nVar.f1795c, nVar.f1796d);
    }
}
