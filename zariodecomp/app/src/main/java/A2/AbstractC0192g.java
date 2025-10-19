package a2;

import M.B;
import M.F;
import M.H;
import M.S;
import N2.AbstractC0156x;
import S0.n;
import X1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import c2.AbstractC0336a;
import j0.C0623a;
import java.util.WeakHashMap;

/* renamed from: a2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\g.smali */
public abstract class AbstractC0192g extends FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final ViewOnTouchListenerC0191f f4067p = new ViewOnTouchListenerC0191f();

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0193h f4068a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4069b;

    /* renamed from: c, reason: collision with root package name */
    public int f4070c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4071d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4073f;

    /* renamed from: k, reason: collision with root package name */
    public final int f4074k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4075l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f4076m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f4077n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4078o;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0192g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC0336a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, A1.a.f37F);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = S.f2363a;
            H.s(this, dimensionPixelSize);
        }
        this.f4070c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f4069b = m.b(context2, attributeSet, 0, 0).a();
        }
        this.f4071d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(r1.d.x(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(Q1.k.i(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4072e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f4073f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f4074k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f4067p);
        setFocusable(true);
        if (getBackground() == null) {
            int iQ = AbstractC0156x.Q(AbstractC0156x.I(this, 2130903314), AbstractC0156x.I(this, 2130903291), getBackgroundOverlayColorAlpha());
            m mVar = this.f4069b;
            if (mVar != null) {
                C0623a c0623a = AbstractC0193h.f4079u;
                X1.h hVar = new X1.h(mVar);
                hVar.m(ColorStateList.valueOf(iQ));
                gradientDrawable = hVar;
            } else {
                Resources resources = getResources();
                C0623a c0623a2 = AbstractC0193h.f4079u;
                float dimension = resources.getDimension(2131100412);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iQ);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f4075l;
            if (colorStateList != null) {
                E.b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = S.f2363a;
            B.q(this, gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(AbstractC0193h abstractC0193h) {
        this.f4068a = abstractC0193h;
    }

    public float getActionTextColorAlpha() {
        return this.f4072e;
    }

    public int getAnimationMode() {
        return this.f4070c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4071d;
    }

    public int getMaxInlineActionWidth() {
        return this.f4074k;
    }

    public int getMaxWidth() {
        return this.f4073f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        AbstractC0193h abstractC0193h = this.f4068a;
        if (abstractC0193h != null && (rootWindowInsets = abstractC0193h.i.getRootWindowInsets()) != null) {
            abstractC0193h.f4098p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            abstractC0193h.e();
        }
        WeakHashMap weakHashMap = S.f2363a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z4;
        super.onDetachedFromWindow();
        AbstractC0193h abstractC0193h = this.f4068a;
        if (abstractC0193h != null) {
            n nVarI = n.i();
            C0190e c0190e = abstractC0193h.f4102t;
            synchronized (nVarI.f2872a) {
                z4 = true;
                if (!nVarI.j(c0190e)) {
                    C0196k c0196k = (C0196k) nVarI.f2875d;
                    if (!(c0196k != null && c0196k.f4106a.get() == c0190e)) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                AbstractC0193h.f4082x.post(new RunnableC0189d(abstractC0193h, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        AbstractC0193h abstractC0193h = this.f4068a;
        if (abstractC0193h == null || !abstractC0193h.f4100r) {
            return;
        }
        abstractC0193h.d();
        abstractC0193h.f4100r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        int i6 = this.f4073f;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
    }

    public void setAnimationMode(int i) {
        this.f4070c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f4075l != null) {
            drawable = drawable.mutate();
            E.b.h(drawable, this.f4075l);
            E.b.i(drawable, this.f4076m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4075l = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            E.b.h(drawableMutate, colorStateList);
            E.b.i(drawableMutate, this.f4076m);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4076m = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            E.b.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f4078o || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f4077n = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        AbstractC0193h abstractC0193h = this.f4068a;
        if (abstractC0193h != null) {
            C0623a c0623a = AbstractC0193h.f4079u;
            abstractC0193h.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4067p);
        super.setOnClickListener(onClickListener);
    }
}
