package U1;

import A1.a;
import C.o;
import N2.AbstractC0156x;
import S0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U1\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3304d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3305e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3306f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3307g;
    public final boolean h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3308j;

    /* renamed from: k, reason: collision with root package name */
    public float f3309k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3310l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3311m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f3312n;

    public d(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, a.G);
        this.f3309k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f3308j = r1.d.x(context, typedArrayObtainStyledAttributes, 3);
        r1.d.x(context, typedArrayObtainStyledAttributes, 4);
        r1.d.x(context, typedArrayObtainStyledAttributes, 5);
        this.f3303c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f3304d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i5 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f3310l = typedArrayObtainStyledAttributes.getResourceId(i5, 0);
        this.f3302b = typedArrayObtainStyledAttributes.getString(i5);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f3301a = r1.d.x(context, typedArrayObtainStyledAttributes, 6);
        this.f3305e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f3306f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f3307g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, a.f62w);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f3312n;
        int i = this.f3303c;
        if (typeface == null && (str = this.f3302b) != null) {
            this.f3312n = Typeface.create(str, i);
        }
        if (this.f3312n == null) {
            int i5 = this.f3304d;
            if (i5 == 1) {
                this.f3312n = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f3312n = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f3312n = Typeface.DEFAULT;
            } else {
                this.f3312n = Typeface.MONOSPACE;
            }
            this.f3312n = Typeface.create(this.f3312n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f3311m) {
            return this.f3312n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = o.a(context, this.f3310l);
                this.f3312n = typefaceA;
                if (typefaceA != null) {
                    this.f3312n = Typeface.create(typefaceA, this.f3303c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d("TextAppearance", "Error loading font " + this.f3302b, e5);
            }
        }
        a();
        this.f3311m = true;
        return this.f3312n;
    }

    public final void c(Context context, AbstractC0156x abstractC0156x) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f3310l;
        if (i == 0) {
            this.f3311m = true;
        }
        if (this.f3311m) {
            abstractC0156x.T(this.f3312n, true);
            return;
        }
        try {
            b bVar = new b(this, abstractC0156x);
            ThreadLocal threadLocal = o.f1060a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                o.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f3311m = true;
            abstractC0156x.S(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f3302b, e5);
            this.f3311m = true;
            abstractC0156x.S(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceB = null;
        int i = this.f3310l;
        if (i != 0) {
            ThreadLocal threadLocal = o.f1060a;
            if (!context.isRestricted()) {
                typefaceB = o.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, AbstractC0156x abstractC0156x) {
        f(context, textPaint, abstractC0156x);
        ColorStateList colorStateList = this.f3308j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f3301a;
        textPaint.setShadowLayer(this.f3307g, this.f3305e, this.f3306f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, AbstractC0156x abstractC0156x) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f3312n);
        c(context, new c(this, context, textPaint, abstractC0156x));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceQ = f.Q(context.getResources().getConfiguration(), typeface);
        if (typefaceQ != null) {
            typeface = typefaceQ;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3303c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3309k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
