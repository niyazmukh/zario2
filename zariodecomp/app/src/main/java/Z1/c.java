package Z1;

import B.l;
import B3.RunnableC0040f;
import M.C;
import M.E;
import M.S;
import N2.AbstractC0156x;
import Q1.i;
import Q1.k;
import X1.h;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import c2.AbstractC0336a;
import com.google.android.gms.common.api.f;
import com.google.android.material.slider.Slider;
import d2.C0444a;
import j3.C0628a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z1\c.smali */
public abstract class c extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int f3954A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3955B;

    /* renamed from: C, reason: collision with root package name */
    public int f3956C;

    /* renamed from: D, reason: collision with root package name */
    public int f3957D;

    /* renamed from: E, reason: collision with root package name */
    public int f3958E;

    /* renamed from: F, reason: collision with root package name */
    public int f3959F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public int f3960H;

    /* renamed from: I, reason: collision with root package name */
    public final int f3961I;

    /* renamed from: J, reason: collision with root package name */
    public float f3962J;

    /* renamed from: K, reason: collision with root package name */
    public MotionEvent f3963K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3964L;

    /* renamed from: M, reason: collision with root package name */
    public float f3965M;

    /* renamed from: N, reason: collision with root package name */
    public float f3966N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f3967O;

    /* renamed from: P, reason: collision with root package name */
    public int f3968P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3969Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3970R;

    /* renamed from: S, reason: collision with root package name */
    public float[] f3971S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3972T;

    /* renamed from: U, reason: collision with root package name */
    public int f3973U;

    /* renamed from: V, reason: collision with root package name */
    public int f3974V;

    /* renamed from: W, reason: collision with root package name */
    public int f3975W;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3976a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3977a0;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3978b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3979b0;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3980c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f3981c0;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f3982d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f3983d0;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f3984e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f3985e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f3986f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f3987f0;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f3988g0;

    /* renamed from: h0, reason: collision with root package name */
    public final h f3989h0;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f3990i0;

    /* renamed from: j0, reason: collision with root package name */
    public List f3991j0;

    /* renamed from: k, reason: collision with root package name */
    public final a f3992k;

    /* renamed from: k0, reason: collision with root package name */
    public float f3993k0;

    /* renamed from: l, reason: collision with root package name */
    public final AccessibilityManager f3994l;

    /* renamed from: l0, reason: collision with root package name */
    public int f3995l0;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC0040f f3996m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3997n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3998o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3999p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f4000q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4001r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f4002s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f4003t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4004u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4005v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4006w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4007x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4008y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4009z;

    public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0336a.a(context, attributeSet, 2130903991, 2131952699), attributeSet, 2130903991);
        this.f3998o = new ArrayList();
        this.f3999p = new ArrayList();
        this.f4000q = new ArrayList();
        this.f4001r = false;
        this.f3964L = false;
        this.f3967O = new ArrayList();
        this.f3968P = -1;
        this.f3969Q = -1;
        this.f3970R = 0.0f;
        this.f3972T = true;
        this.f3977a0 = false;
        h hVar = new h();
        this.f3989h0 = hVar;
        this.f3991j0 = Collections.emptyList();
        this.f3995l0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f3976a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f3978b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f3980c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f3982d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f3984e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f3986f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f3955B = resources.getDimensionPixelSize(2131100410);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131100409);
        this.f4005v = dimensionPixelOffset;
        this.f3959F = dimensionPixelOffset;
        this.f4006w = resources.getDimensionPixelSize(2131100406);
        this.f4007x = resources.getDimensionPixelSize(2131100408);
        this.f4008y = resources.getDimensionPixelSize(2131100407);
        this.f4009z = resources.getDimensionPixelSize(2131100407);
        this.f3961I = resources.getDimensionPixelSize(2131100402);
        int[] iArr = A1.a.f36E;
        k.a(context2, attributeSet, 2130903991, 2131952699);
        k.b(context2, attributeSet, iArr, 2130903991, 2131952699, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903991, 2131952699);
        this.f3997n = typedArrayObtainStyledAttributes.getResourceId(8, 2131952733);
        this.f3965M = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f3966N = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f3965M));
        this.f3970R = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f3954A = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(21);
        int i = zHasValue ? 21 : 23;
        int i5 = zHasValue ? 21 : 22;
        ColorStateList colorStateListX = r1.d.x(context2, typedArrayObtainStyledAttributes, i);
        setTrackInactiveTintList(colorStateListX == null ? l.getColorStateList(context2, 2131034817) : colorStateListX);
        ColorStateList colorStateListX2 = r1.d.x(context2, typedArrayObtainStyledAttributes, i5);
        setTrackActiveTintList(colorStateListX2 == null ? l.getColorStateList(context2, 2131034814) : colorStateListX2);
        hVar.m(r1.d.x(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setThumbStrokeColor(r1.d.x(context2, typedArrayObtainStyledAttributes, 13));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(14, 0.0f));
        ColorStateList colorStateListX3 = r1.d.x(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListX3 == null ? l.getColorStateList(context2, 2131034815) : colorStateListX3);
        this.f3972T = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(15);
        int i6 = zHasValue2 ? 15 : 17;
        int i7 = zHasValue2 ? 15 : 16;
        ColorStateList colorStateListX4 = r1.d.x(context2, typedArrayObtainStyledAttributes, i6);
        setTickInactiveTintList(colorStateListX4 == null ? l.getColorStateList(context2, 2131034816) : colorStateListX4);
        ColorStateList colorStateListX5 = r1.d.x(context2, typedArrayObtainStyledAttributes, i7);
        setTickActiveTintList(colorStateListX5 == null ? l.getColorStateList(context2, 2131034813) : colorStateListX5);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0));
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        hVar.p();
        this.f4004u = ViewConfiguration.get(context2).getScaledTouchSlop();
        a aVar = new a((Slider) this);
        this.f3992k = aVar;
        S.h(this, aVar);
        this.f3994l = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void a(Drawable drawable) {
        int i = this.G * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i = this.f3956C / 2;
        int i5 = this.f3957D;
        return i + ((i5 == 1 || i5 == 3) ? ((C0444a) this.f3998o.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z4) {
        int iD0;
        TimeInterpolator timeInterpolatorE0;
        int i = 1;
        float fFloatValue = z4 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z4 ? this.f4003t : this.f4002s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z4 ? 1.0f : 0.0f);
        if (z4) {
            iD0 = AbstractC0156x.d0(getContext(), 2130903827, 83);
            timeInterpolatorE0 = AbstractC0156x.e0(getContext(), 2130903837, B1.a.f287e);
        } else {
            iD0 = AbstractC0156x.d0(getContext(), 2130903830, 117);
            timeInterpolatorE0 = AbstractC0156x.e0(getContext(), 2130903835, B1.a.f285c);
        }
        valueAnimatorOfFloat.setDuration(iD0);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorE0);
        valueAnimatorOfFloat.addUpdateListener(new F1.c(this, i));
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i, int i5, float f2, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f3959F + ((int) (m(f2) * i))) - (drawable.getBounds().width() / 2.0f), i5 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f3992k.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3976a.setColor(f(this.f3988g0));
        this.f3978b.setColor(f(this.f3987f0));
        this.f3984e.setColor(f(this.f3985e0));
        this.f3986f.setColor(f(this.f3983d0));
        Iterator it = this.f3998o.iterator();
        while (it.hasNext()) {
            C0444a c0444a = (C0444a) it.next();
            if (c0444a.isStateful()) {
                c0444a.setState(getDrawableState());
            }
        }
        h hVar = this.f3989h0;
        if (hVar.isStateful()) {
            hVar.setState(getDrawableState());
        }
        Paint paint = this.f3982d;
        paint.setColor(f(this.f3981c0));
        paint.setAlpha(63);
    }

    public final float[] e() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f3967O.size() == 1) {
            fFloatValue2 = this.f3965M;
        }
        float fM = m(fFloatValue2);
        float fM2 = m(fFloatValue);
        return i() ? new float[]{fM2, fM} : new float[]{fM, fM2};
    }

    public final int f(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean g(float f2) {
        double dDoubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.f3970R)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f3992k.f3396k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f3967O);
    }

    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        WeakHashMap weakHashMap = S.f2363a;
        return C.d(this) == 1;
    }

    public final void j() {
        if (this.f3970R <= 0.0f) {
            return;
        }
        v();
        int iMin = Math.min((int) (((this.f3966N - this.f3965M) / this.f3970R) + 1.0f), (this.f3975W / (this.f3958E * 2)) + 1);
        float[] fArr = this.f3971S;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f3971S = new float[iMin * 2];
        }
        float f2 = this.f3975W / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f3971S;
            fArr2[i] = ((i / 2.0f) * f2) + this.f3959F;
            fArr2[i + 1] = b();
        }
    }

    public final boolean k(int i) {
        int i5 = this.f3969Q;
        long j5 = i5 + i;
        long size = this.f3967O.size() - 1;
        if (j5 < 0) {
            j5 = 0;
        } else if (j5 > size) {
            j5 = size;
        }
        int i6 = (int) j5;
        this.f3969Q = i6;
        if (i6 == i5) {
            return false;
        }
        if (this.f3968P != -1) {
            this.f3968P = i6;
        }
        t();
        postInvalidate();
        return true;
    }

    public final void l(int i) {
        if (i()) {
            i = i == Integer.MIN_VALUE ? f.API_PRIORITY_OTHER : -i;
        }
        k(i);
    }

    public final float m(float f2) {
        float f3 = this.f3965M;
        float f5 = (f2 - f3) / (this.f3966N - f3);
        return i() ? 1.0f - f5 : f5;
    }

    public final void n() {
        Iterator it = this.f4000q.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void o(C0444a c0444a, float f2) {
        String str = String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
        if (!TextUtils.equals(c0444a.f6783B, str)) {
            c0444a.f6783B = str;
            c0444a.f6786E.f2799d = true;
            c0444a.invalidateSelf();
        }
        int iM = (this.f3959F + ((int) (m(f2) * this.f3975W))) - (c0444a.getIntrinsicWidth() / 2);
        int iB = b() - (this.f3961I + this.G);
        c0444a.setBounds(iM, iB - c0444a.getIntrinsicHeight(), c0444a.getIntrinsicWidth() + iM, iB);
        Rect rect = new Rect(c0444a.getBounds());
        Q1.c.b(k.d(this), this, rect);
        c0444a.setBounds(rect);
        ((ViewOverlay) k.e(this).b).add(c0444a);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f3998o.iterator();
        while (it.hasNext()) {
            C0444a c0444a = (C0444a) it.next();
            ViewGroup viewGroupD = k.d(this);
            if (viewGroupD == null) {
                c0444a.getClass();
            } else {
                c0444a.getClass();
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                c0444a.f6793M = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(c0444a.G);
                viewGroupD.addOnLayoutChangeListener(c0444a.f6787F);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0040f runnableC0040f = this.f3996m;
        if (runnableC0040f != null) {
            removeCallbacks(runnableC0040f);
        }
        this.f4001r = false;
        Iterator it = this.f3998o.iterator();
        while (it.hasNext()) {
            C0444a c0444a = (C0444a) it.next();
            K2.c cVarE = k.e(this);
            if (cVarE != null) {
                ((ViewOverlay) cVarE.b).remove(c0444a);
                ViewGroup viewGroupD = k.d(this);
                if (viewGroupD == null) {
                    c0444a.getClass();
                } else {
                    viewGroupD.removeOnLayoutChangeListener(c0444a.f6787F);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f3979b0) {
            v();
            j();
        }
        super.onDraw(canvas);
        int iB = b();
        int i = this.f3975W;
        float[] fArrE = e();
        int i5 = this.f3959F;
        float f2 = i;
        float f3 = i5 + (fArrE[1] * f2);
        float f5 = i5 + i;
        Paint paint = this.f3976a;
        if (f3 < f5) {
            float f6 = iB;
            canvas.drawLine(f3, f6, f5, f6, paint);
        }
        float f7 = this.f3959F;
        float f8 = (fArrE[0] * f2) + f7;
        if (f8 > f7) {
            float f9 = iB;
            canvas.drawLine(f7, f9, f8, f9, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f3965M) {
            int i6 = this.f3975W;
            float[] fArrE2 = e();
            float f10 = this.f3959F;
            float f11 = i6;
            float f12 = iB;
            canvas.drawLine((fArrE2[0] * f11) + f10, f12, (fArrE2[1] * f11) + f10, f12, this.f3978b);
        }
        if (this.f3972T && this.f3970R > 0.0f) {
            float[] fArrE3 = e();
            int iRound = Math.round(fArrE3[0] * ((this.f3971S.length / 2) - 1));
            int iRound2 = Math.round(fArrE3[1] * ((this.f3971S.length / 2) - 1));
            float[] fArr = this.f3971S;
            int i7 = iRound * 2;
            Paint paint2 = this.f3984e;
            canvas.drawPoints(fArr, 0, i7, paint2);
            int i8 = iRound2 * 2;
            canvas.drawPoints(this.f3971S, i7, i8 - i7, this.f3986f);
            float[] fArr2 = this.f3971S;
            canvas.drawPoints(fArr2, i8, fArr2.length - i8, paint2);
        }
        if ((this.f3964L || isFocused()) && isEnabled()) {
            int i9 = this.f3975W;
            if (!(getBackground() instanceof RippleDrawable)) {
                canvas.drawCircle((int) ((m(((Float) this.f3967O.get(this.f3969Q)).floatValue()) * i9) + this.f3959F), iB, this.f3960H, this.f3982d);
            }
        }
        if ((this.f3968P != -1 || this.f3957D == 3) && isEnabled()) {
            if (this.f3957D != 2) {
                if (!this.f4001r) {
                    this.f4001r = true;
                    ValueAnimator valueAnimatorC = c(true);
                    this.f4002s = valueAnimatorC;
                    this.f4003t = null;
                    valueAnimatorC.start();
                }
                ArrayList arrayList = this.f3998o;
                Iterator it = arrayList.iterator();
                for (int i10 = 0; i10 < this.f3967O.size() && it.hasNext(); i10++) {
                    if (i10 != this.f3969Q) {
                        o((C0444a) it.next(), ((Float) this.f3967O.get(i10)).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f3967O.size())));
                }
                o((C0444a) it.next(), ((Float) this.f3967O.get(this.f3969Q)).floatValue());
            }
        } else if (this.f4001r) {
            this.f4001r = false;
            ValueAnimator valueAnimatorC2 = c(false);
            this.f4003t = valueAnimatorC2;
            this.f4002s = null;
            valueAnimatorC2.addListener(new D1.a(this, 4));
            this.f4003t.start();
        }
        int i11 = this.f3975W;
        for (int i12 = 0; i12 < this.f3967O.size(); i12++) {
            float fFloatValue = ((Float) this.f3967O.get(i12)).floatValue();
            Drawable drawable = this.f3990i0;
            if (drawable != null) {
                d(canvas, i11, iB, fFloatValue, drawable);
            } else if (i12 < this.f3991j0.size()) {
                d(canvas, i11, iB, fFloatValue, (Drawable) this.f3991j0.get(i12));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((m(fFloatValue) * i11) + this.f3959F, iB, this.G, this.f3980c);
                }
                d(canvas, i11, iB, fFloatValue, this.f3989h0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        a aVar = this.f3992k;
        if (!z4) {
            this.f3968P = -1;
            aVar.j(this.f3969Q);
            return;
        }
        if (i == 1) {
            k(f.API_PRIORITY_OTHER);
        } else if (i == 2) {
            k(Integer.MIN_VALUE);
        } else if (i == 17) {
            l(f.API_PRIORITY_OTHER);
        } else if (i == 66) {
            l(Integer.MIN_VALUE);
        }
        aVar.w(this.f3969Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f3977a0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int i6 = this.f3956C;
        int i7 = this.f3957D;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i6 + ((i7 == 1 || i7 == 3) ? ((C0444a) this.f3998o.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f3965M = bVar.f3949a;
        this.f3966N = bVar.f3950b;
        p(bVar.f3951c);
        this.f3970R = bVar.f3952d;
        if (bVar.f3953e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3949a = this.f3965M;
        bVar.f3950b = this.f3966N;
        bVar.f3951c = new ArrayList(this.f3967O);
        bVar.f3952d = this.f3970R;
        bVar.f3953e = hasFocus();
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        this.f3975W = Math.max(i - (this.f3959F * 2), 0);
        j();
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        K2.c cVarE;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (cVarE = k.e(this)) == null) {
            return;
        }
        Iterator it = this.f3998o.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) cVarE.b).remove((C0444a) it.next());
        }
    }

    public final void p(ArrayList arrayList) {
        ViewGroup viewGroupD;
        int resourceId;
        K2.c cVarE;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f3967O.size() == arrayList.size() && this.f3967O.equals(arrayList)) {
            return;
        }
        this.f3967O = arrayList;
        this.f3979b0 = true;
        this.f3969Q = 0;
        t();
        ArrayList arrayList2 = this.f3998o;
        if (arrayList2.size() > this.f3967O.size()) {
            List<C0444a> listSubList = arrayList2.subList(this.f3967O.size(), arrayList2.size());
            for (C0444a c0444a : listSubList) {
                WeakHashMap weakHashMap = S.f2363a;
                if (E.b(this) && (cVarE = k.e(this)) != null) {
                    ((ViewOverlay) cVarE.b).remove(c0444a);
                    ViewGroup viewGroupD2 = k.d(this);
                    if (viewGroupD2 == null) {
                        c0444a.getClass();
                    } else {
                        viewGroupD2.removeOnLayoutChangeListener(c0444a.f6787F);
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f3967O.size()) {
            Context context = getContext();
            int i = this.f3997n;
            C0444a c0444a2 = new C0444a(context, i);
            TypedArray typedArrayH = k.h(c0444a2.f6784C, null, A1.a.f41K, 0, i, new int[0]);
            Context context2 = c0444a2.f6784C;
            c0444a2.f6792L = context2.getResources().getDimensionPixelSize(2131100433);
            X1.l lVarE = c0444a2.f3738a.f3722a.e();
            lVarE.f3771k = c0444a2.v();
            c0444a2.setShapeAppearanceModel(lVarE.a());
            CharSequence text = typedArrayH.getText(6);
            boolean zEquals = TextUtils.equals(c0444a2.f6783B, text);
            i iVar = c0444a2.f6786E;
            if (!zEquals) {
                c0444a2.f6783B = text;
                iVar.f2799d = true;
                c0444a2.invalidateSelf();
            }
            U1.d dVar = (!typedArrayH.hasValue(0) || (resourceId = typedArrayH.getResourceId(0, 0)) == 0) ? null : new U1.d(context2, resourceId);
            if (dVar != null && typedArrayH.hasValue(1)) {
                dVar.f3308j = r1.d.x(context2, typedArrayH, 1);
            }
            iVar.b(dVar, context2);
            c0444a2.m(ColorStateList.valueOf(typedArrayH.getColor(7, D.a.b(D.a.d(AbstractC0156x.H(context2, 2130903277, C0444a.class.getCanonicalName()), 153), D.a.d(AbstractC0156x.H(context2, R.attr.colorBackground, C0444a.class.getCanonicalName()), 229)))));
            c0444a2.q(ColorStateList.valueOf(AbstractC0156x.H(context2, 2130903314, C0444a.class.getCanonicalName())));
            c0444a2.f6788H = typedArrayH.getDimensionPixelSize(2, 0);
            c0444a2.f6789I = typedArrayH.getDimensionPixelSize(4, 0);
            c0444a2.f6790J = typedArrayH.getDimensionPixelSize(5, 0);
            c0444a2.f6791K = typedArrayH.getDimensionPixelSize(3, 0);
            typedArrayH.recycle();
            arrayList2.add(c0444a2);
            WeakHashMap weakHashMap2 = S.f2363a;
            if (E.b(this) && (viewGroupD = k.d(this)) != null) {
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                c0444a2.f6793M = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(c0444a2.G);
                viewGroupD.addOnLayoutChangeListener(c0444a2.f6787F);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0444a c0444a3 = (C0444a) it.next();
            c0444a3.f3738a.f3729j = i5;
            c0444a3.invalidateSelf();
        }
        Iterator it2 = this.f3999p.iterator();
        while (it2.hasNext()) {
            C0628a c0628a = (C0628a) it2.next();
            Iterator it3 = this.f3967O.iterator();
            while (it3.hasNext()) {
                c0628a.a(this, ((Float) it3.next()).floatValue());
            }
        }
        postInvalidate();
    }

    public final boolean q(int i, float f2) {
        this.f3969Q = i;
        if (Math.abs(f2 - ((Float) this.f3967O.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f3995l0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f3 = this.f3965M;
                minSeparation = ((f3 - this.f3966N) * ((minSeparation - this.f3959F) / this.f3975W)) + f3;
            }
        }
        if (i()) {
            minSeparation = -minSeparation;
        }
        int i5 = i + 1;
        float fFloatValue = i5 >= this.f3967O.size() ? this.f3966N : ((Float) this.f3967O.get(i5)).floatValue() - minSeparation;
        int i6 = i - 1;
        float fFloatValue2 = i6 < 0 ? this.f3965M : minSeparation + ((Float) this.f3967O.get(i6)).floatValue();
        if (f2 < fFloatValue2) {
            f2 = fFloatValue2;
        } else if (f2 > fFloatValue) {
            f2 = fFloatValue;
        }
        this.f3967O.set(i, Float.valueOf(f2));
        Iterator it = this.f3999p.iterator();
        while (it.hasNext()) {
            ((C0628a) it.next()).a(this, ((Float) this.f3967O.get(i)).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f3994l;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        Runnable runnable = this.f3996m;
        if (runnable == null) {
            this.f3996m = new RunnableC0040f(this);
        } else {
            removeCallbacks(runnable);
        }
        RunnableC0040f runnableC0040f = this.f3996m;
        runnableC0040f.f802b = i;
        postDelayed(runnableC0040f, 200L);
        return true;
    }

    public final void r() {
        double dRound;
        float f2 = this.f3993k0;
        float f3 = this.f3970R;
        if (f3 > 0.0f) {
            dRound = Math.round(f2 * r1) / ((int) ((this.f3966N - this.f3965M) / f3));
        } else {
            dRound = f2;
        }
        if (i()) {
            dRound = 1.0d - dRound;
        }
        float f5 = this.f3966N;
        q(this.f3968P, (float) ((dRound * (f5 - r1)) + this.f3965M));
    }

    public final void s(int i, Rect rect) {
        int iM = this.f3959F + ((int) (m(getValues().get(i).floatValue()) * this.f3975W));
        int iB = b();
        int i5 = this.G;
        int i6 = this.f3954A;
        if (i5 <= i6) {
            i5 = i6;
        }
        int i7 = i5 / 2;
        rect.set(iM - i7, iB - i7, iM + i7, iB + i7);
    }

    public void setActiveThumbIndex(int i) {
        this.f3968P = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        setLayerType(z4 ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.f3995l0 = i;
        this.f3979b0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f2);

    public abstract void setThumbRadius(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f2);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        p(arrayList);
    }

    public final void t() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM = (int) ((m(((Float) this.f3967O.get(this.f3969Q)).floatValue()) * this.f3975W) + this.f3959F);
            int iB = b();
            int i = this.f3960H;
            E.b.f(background, iM - i, iB - i, iM + i, iB + i);
        }
    }

    public final void u() {
        boolean z4;
        int iMax = Math.max(this.f3955B, Math.max(this.f3958E + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.G * 2)));
        boolean z5 = false;
        if (iMax == this.f3956C) {
            z4 = false;
        } else {
            this.f3956C = iMax;
            z4 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max(this.G - this.f4006w, 0), Math.max((this.f3958E - this.f4007x) / 2, 0)), Math.max(Math.max(this.f3973U - this.f4008y, 0), Math.max(this.f3974V - this.f4009z, 0))) + this.f4005v;
        if (this.f3959F != iMax2) {
            this.f3959F = iMax2;
            WeakHashMap weakHashMap = S.f2363a;
            if (E.c(this)) {
                this.f3975W = Math.max(getWidth() - (this.f3959F * 2), 0);
                j();
            }
            z5 = true;
        }
        if (z4) {
            requestLayout();
        } else if (z5) {
            postInvalidate();
        }
    }

    public final void v() {
        if (this.f3979b0) {
            float f2 = this.f3965M;
            float f3 = this.f3966N;
            if (f2 >= f3) {
                throw new IllegalStateException("valueFrom(" + this.f3965M + ") must be smaller than valueTo(" + this.f3966N + ")");
            }
            if (f3 <= f2) {
                throw new IllegalStateException("valueTo(" + this.f3966N + ") must be greater than valueFrom(" + this.f3965M + ")");
            }
            if (this.f3970R > 0.0f && !g(f3 - f2)) {
                throw new IllegalStateException("The stepSize(" + this.f3970R + ") must be 0, or a factor of the valueFrom(" + this.f3965M + ")-valueTo(" + this.f3966N + ") range");
            }
            Iterator it = this.f3967O.iterator();
            while (it.hasNext()) {
                Float f5 = (Float) it.next();
                if (f5.floatValue() < this.f3965M || f5.floatValue() > this.f3966N) {
                    throw new IllegalStateException("Slider value(" + f5 + ") must be greater or equal to valueFrom(" + this.f3965M + "), and lower or equal to valueTo(" + this.f3966N + ")");
                }
                if (this.f3970R > 0.0f && !g(f5.floatValue() - this.f3965M)) {
                    float f6 = this.f3965M;
                    float f7 = this.f3970R;
                    throw new IllegalStateException("Value(" + f5 + ") must be equal to valueFrom(" + f6 + ") plus a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f8 = this.f3970R;
            if (f8 > 0.0f && minSeparation > 0.0f) {
                if (this.f3995l0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f3970R + ")");
                }
                if (minSeparation < f8 || !g(minSeparation)) {
                    float f9 = this.f3970R;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f9 + ") when using stepSize(" + f9 + ")");
                }
            }
            float f10 = this.f3970R;
            if (f10 != 0.0f) {
                if (((int) f10) != f10) {
                    Log.w("c", "Floating point value used for stepSize(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f11 = this.f3965M;
                if (((int) f11) != f11) {
                    Log.w("c", "Floating point value used for valueFrom(" + f11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f12 = this.f3966N;
                if (((int) f12) != f12) {
                    Log.w("c", "Floating point value used for valueTo(" + f12 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f3979b0 = false;
        }
    }

    public void setValues(List<Float> list) {
        p(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f3990i0 = null;
        this.f3991j0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f3991j0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
