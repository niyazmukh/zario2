package Q1;

import M.B;
import M.C;
import M.S;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import j0.C0623a;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q1\b.smali */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2725A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2726B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2727C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f2729E;

    /* renamed from: F, reason: collision with root package name */
    public float f2730F;
    public float G;

    /* renamed from: H, reason: collision with root package name */
    public float f2731H;

    /* renamed from: I, reason: collision with root package name */
    public float f2732I;

    /* renamed from: J, reason: collision with root package name */
    public float f2733J;

    /* renamed from: K, reason: collision with root package name */
    public int f2734K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f2735L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2736M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f2737N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f2738O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f2739P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f2740Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2741R;

    /* renamed from: S, reason: collision with root package name */
    public float f2742S;

    /* renamed from: T, reason: collision with root package name */
    public float f2743T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f2744U;

    /* renamed from: V, reason: collision with root package name */
    public float f2745V;

    /* renamed from: W, reason: collision with root package name */
    public float f2746W;
    public float X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f2747Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f2748Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2749a;

    /* renamed from: a0, reason: collision with root package name */
    public float f2750a0;

    /* renamed from: b, reason: collision with root package name */
    public float f2751b;

    /* renamed from: b0, reason: collision with root package name */
    public float f2752b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2753c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f2754c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2755d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f2757e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2762j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2763k;

    /* renamed from: l, reason: collision with root package name */
    public float f2764l;

    /* renamed from: m, reason: collision with root package name */
    public float f2765m;

    /* renamed from: n, reason: collision with root package name */
    public float f2766n;

    /* renamed from: o, reason: collision with root package name */
    public float f2767o;

    /* renamed from: p, reason: collision with root package name */
    public float f2768p;

    /* renamed from: q, reason: collision with root package name */
    public float f2769q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f2770r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f2771s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f2772t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f2773u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f2774v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f2775w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f2776x;

    /* renamed from: y, reason: collision with root package name */
    public U1.a f2777y;

    /* renamed from: f, reason: collision with root package name */
    public int f2759f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f2761g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f2778z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f2728D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f2756d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f2758e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f2760f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f2749a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f2737N = textPaint;
        this.f2738O = new TextPaint(textPaint);
        this.f2755d = new Rect();
        this.f2753c = new Rect();
        this.f2757e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i5, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i5) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i5) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i5) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i5) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return B1.a.a(f2, f3, f5);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f2363a;
        boolean z4 = C.d(this.f2749a) == 1;
        if (this.f2728D) {
            return (z4 ? K.g.f2118d : K.g.f2117c).b(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void c(float f2, boolean z4) {
        float f3;
        float f5;
        Typeface typeface;
        boolean z5;
        Layout.Alignment alignment;
        if (this.f2725A == null) {
            return;
        }
        float fWidth = this.f2755d.width();
        float fWidth2 = this.f2753c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f5 = this.f2745V;
            this.f2730F = 1.0f;
            typeface = this.f2770r;
        } else {
            float f6 = this.h;
            float f7 = this.f2746W;
            Typeface typeface2 = this.f2773u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f2730F = 1.0f;
            } else {
                this.f2730F = f(this.h, this.i, f2, this.f2740Q) / this.h;
            }
            float f8 = this.i / this.h;
            fWidth = (z4 || fWidth2 * f8 <= fWidth) ? fWidth2 : Math.min(fWidth / f8, fWidth2);
            f3 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2737N;
        if (fWidth > 0.0f) {
            boolean z6 = this.G != f3;
            boolean z7 = this.X != f5;
            boolean z8 = this.f2776x != typeface;
            StaticLayout staticLayout = this.f2747Y;
            boolean z9 = z6 || z7 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z8 || this.f2736M;
            this.G = f3;
            this.X = f5;
            this.f2776x = typeface;
            this.f2736M = false;
            textPaint.setLinearText(this.f2730F != 1.0f);
            z5 = z9;
        } else {
            z5 = false;
        }
        if (this.f2726B == null || z5) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f2776x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.f2725A);
            this.f2727C = zB;
            int i = this.f2756d0;
            if (i <= 1 || zB) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2759f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f2727C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f2727C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f2725A, textPaint, (int) fWidth);
            gVar.f2795k = this.f2778z;
            gVar.f2794j = zB;
            gVar.f2791e = alignment;
            gVar.i = false;
            gVar.f2792f = i;
            gVar.f2793g = this.f2758e0;
            gVar.h = this.f2760f0;
            StaticLayout staticLayoutA = gVar.a();
            staticLayoutA.getClass();
            this.f2747Y = staticLayoutA;
            this.f2726B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f2738O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f2770r);
        textPaint.setLetterSpacing(this.f2745V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2735L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2772t;
            if (typeface != null) {
                this.f2771s = S0.f.Q(configuration, typeface);
            }
            Typeface typeface2 = this.f2775w;
            if (typeface2 != null) {
                this.f2774v = S0.f.Q(configuration, typeface2);
            }
            Typeface typeface3 = this.f2771s;
            if (typeface3 == null) {
                typeface3 = this.f2772t;
            }
            this.f2770r = typeface3;
            Typeface typeface4 = this.f2774v;
            if (typeface4 == null) {
                typeface4 = this.f2775w;
            }
            this.f2773u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z4) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2749a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z4) {
            return;
        }
        c(1.0f, z4);
        CharSequence charSequence = this.f2726B;
        TextPaint textPaint = this.f2737N;
        if (charSequence != null && (staticLayout = this.f2747Y) != null) {
            this.f2754c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2778z);
        }
        CharSequence charSequence2 = this.f2754c0;
        if (charSequence2 != null) {
            this.f2748Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2748Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2761g, this.f2727C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f2755d;
        if (i == 48) {
            this.f2765m = rect.top;
        } else if (i != 80) {
            this.f2765m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2765m = textPaint.ascent() + rect.bottom;
        }
        int i5 = absoluteGravity & 8388615;
        if (i5 == 1) {
            this.f2767o = rect.centerX() - (this.f2748Z / 2.0f);
        } else if (i5 != 5) {
            this.f2767o = rect.left;
        } else {
            this.f2767o = rect.right - this.f2748Z;
        }
        c(0.0f, z4);
        float height = this.f2747Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f2747Y;
        if (staticLayout2 == null || this.f2756d0 <= 1) {
            CharSequence charSequence3 = this.f2726B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f2747Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2759f, this.f2727C ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.f2753c;
        if (i6 == 48) {
            this.f2764l = rect2.top;
        } else if (i6 != 80) {
            this.f2764l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2764l = textPaint.descent() + (rect2.bottom - height);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f2766n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i7 != 5) {
            this.f2766n = rect2.left;
        } else {
            this.f2766n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f2729E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2729E = null;
        }
        l(this.f2751b);
        float f2 = this.f2751b;
        float f3 = f(rect2.left, rect.left, f2, this.f2739P);
        RectF rectF = this.f2757e;
        rectF.left = f3;
        rectF.top = f(this.f2764l, this.f2765m, f2, this.f2739P);
        rectF.right = f(rect2.right, rect.right, f2, this.f2739P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f2739P);
        this.f2768p = f(this.f2766n, this.f2767o, f2, this.f2739P);
        this.f2769q = f(this.f2764l, this.f2765m, f2, this.f2739P);
        l(f2);
        C0623a c0623a = B1.a.f284b;
        this.f2750a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0623a);
        WeakHashMap weakHashMap = S.f2363a;
        B.k(textInputLayout);
        this.f2752b0 = f(1.0f, 0.0f, f2, c0623a);
        B.k(textInputLayout);
        ColorStateList colorStateList = this.f2763k;
        ColorStateList colorStateList2 = this.f2762j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f2763k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f5 = this.f2745V;
        float f6 = this.f2746W;
        if (f5 != f6) {
            textPaint.setLetterSpacing(f(f6, f5, f2, c0623a));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.f2731H = B1.a.a(0.0f, this.f2741R, f2);
        this.f2732I = B1.a.a(0.0f, this.f2742S, f2);
        this.f2733J = B1.a.a(0.0f, this.f2743T, f2);
        int iA = a(0, e(this.f2744U), f2);
        this.f2734K = iA;
        textPaint.setShadowLayer(this.f2731H, this.f2732I, this.f2733J, iA);
        B.k(textInputLayout);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f2763k == colorStateList && this.f2762j == colorStateList) {
            return;
        }
        this.f2763k = colorStateList;
        this.f2762j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        U1.a aVar = this.f2777y;
        if (aVar != null) {
            aVar.f = true;
        }
        if (this.f2772t == typeface) {
            return false;
        }
        this.f2772t = typeface;
        Typeface typefaceQ = S0.f.Q(this.f2749a.getContext().getResources().getConfiguration(), typeface);
        this.f2771s = typefaceQ;
        if (typefaceQ == null) {
            typefaceQ = this.f2772t;
        }
        this.f2770r = typefaceQ;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f2751b) {
            this.f2751b = f2;
            float f3 = this.f2753c.left;
            Rect rect = this.f2755d;
            float f5 = f(f3, rect.left, f2, this.f2739P);
            RectF rectF = this.f2757e;
            rectF.left = f5;
            rectF.top = f(this.f2764l, this.f2765m, f2, this.f2739P);
            rectF.right = f(r1.right, rect.right, f2, this.f2739P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f2739P);
            this.f2768p = f(this.f2766n, this.f2767o, f2, this.f2739P);
            this.f2769q = f(this.f2764l, this.f2765m, f2, this.f2739P);
            l(f2);
            C0623a c0623a = B1.a.f284b;
            this.f2750a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0623a);
            WeakHashMap weakHashMap = S.f2363a;
            TextInputLayout textInputLayout = this.f2749a;
            B.k(textInputLayout);
            this.f2752b0 = f(1.0f, 0.0f, f2, c0623a);
            B.k(textInputLayout);
            ColorStateList colorStateList = this.f2763k;
            ColorStateList colorStateList2 = this.f2762j;
            TextPaint textPaint = this.f2737N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f2763k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f2745V;
            float f7 = this.f2746W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f2, c0623a));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f2731H = B1.a.a(0.0f, this.f2741R, f2);
            this.f2732I = B1.a.a(0.0f, this.f2742S, f2);
            this.f2733J = B1.a.a(0.0f, this.f2743T, f2);
            int iA = a(0, e(this.f2744U), f2);
            this.f2734K = iA;
            textPaint.setShadowLayer(this.f2731H, this.f2732I, this.f2733J, iA);
            B.k(textInputLayout);
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f2363a;
        B.k(this.f2749a);
    }

    public final void m(Typeface typeface) {
        boolean z4;
        boolean zJ = j(typeface);
        if (this.f2775w != typeface) {
            this.f2775w = typeface;
            Typeface typefaceQ = S0.f.Q(this.f2749a.getContext().getResources().getConfiguration(), typeface);
            this.f2774v = typefaceQ;
            if (typefaceQ == null) {
                typefaceQ = this.f2775w;
            }
            this.f2773u = typefaceQ;
            z4 = true;
        } else {
            z4 = false;
        }
        if (zJ || z4) {
            h(false);
        }
    }
}
