package com.google.android.material.textfield;

import A2.C0009i;
import A2.RunnableC0005e;
import B1.a;
import B3.N;
import E2.n;
import F0.j;
import F1.c;
import K.i;
import M.AbstractC0126l;
import M.B;
import M.C;
import M.E;
import M.J;
import M.S;
import N2.AbstractC0156x;
import Q1.b;
import Q1.k;
import S0.f;
import X1.e;
import X1.g;
import X1.h;
import X1.l;
import X1.m;
import a.AbstractC0183a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b2.C0261B;
import b2.C0268g;
import b2.C0269h;
import b2.C0272k;
import b2.C0274m;
import b2.C0276o;
import b2.InterfaceC0260A;
import b2.s;
import b2.v;
import b2.x;
import b2.y;
import b2.z;
import c2.AbstractC0336a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0692h0;
import l.Y;
import l.r;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\textfield\TextInputLayout.smali */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[][] f6116F0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public j f6117A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f6118A0;

    /* renamed from: B, reason: collision with root package name */
    public j f6119B;

    /* renamed from: B0, reason: collision with root package name */
    public ValueAnimator f6120B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f6121C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f6122C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f6123D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f6124D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f6125E;
    public boolean E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f6126F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f6127H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6128I;

    /* renamed from: J, reason: collision with root package name */
    public h f6129J;

    /* renamed from: K, reason: collision with root package name */
    public h f6130K;

    /* renamed from: L, reason: collision with root package name */
    public StateListDrawable f6131L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f6132M;

    /* renamed from: N, reason: collision with root package name */
    public h f6133N;

    /* renamed from: O, reason: collision with root package name */
    public h f6134O;

    /* renamed from: P, reason: collision with root package name */
    public m f6135P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6136Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f6137R;

    /* renamed from: S, reason: collision with root package name */
    public int f6138S;

    /* renamed from: T, reason: collision with root package name */
    public int f6139T;

    /* renamed from: U, reason: collision with root package name */
    public int f6140U;

    /* renamed from: V, reason: collision with root package name */
    public int f6141V;

    /* renamed from: W, reason: collision with root package name */
    public int f6142W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f6143a;

    /* renamed from: a0, reason: collision with root package name */
    public int f6144a0;

    /* renamed from: b, reason: collision with root package name */
    public final x f6145b;

    /* renamed from: b0, reason: collision with root package name */
    public int f6146b0;

    /* renamed from: c, reason: collision with root package name */
    public final C0276o f6147c;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f6148c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f6149d;

    /* renamed from: d0, reason: collision with root package name */
    public final Rect f6150d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6151e;

    /* renamed from: e0, reason: collision with root package name */
    public final RectF f6152e0;

    /* renamed from: f, reason: collision with root package name */
    public int f6153f;

    /* renamed from: f0, reason: collision with root package name */
    public Typeface f6154f0;

    /* renamed from: g0, reason: collision with root package name */
    public ColorDrawable f6155g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f6156h0;

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f6157i0;

    /* renamed from: j0, reason: collision with root package name */
    public ColorDrawable f6158j0;

    /* renamed from: k, reason: collision with root package name */
    public int f6159k;

    /* renamed from: k0, reason: collision with root package name */
    public int f6160k0;

    /* renamed from: l, reason: collision with root package name */
    public int f6161l;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f6162l0;

    /* renamed from: m, reason: collision with root package name */
    public int f6163m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f6164m0;

    /* renamed from: n, reason: collision with root package name */
    public final s f6165n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f6166n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6167o;

    /* renamed from: o0, reason: collision with root package name */
    public int f6168o0;

    /* renamed from: p, reason: collision with root package name */
    public int f6169p;

    /* renamed from: p0, reason: collision with root package name */
    public int f6170p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6171q;

    /* renamed from: q0, reason: collision with root package name */
    public int f6172q0;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0260A f6173r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f6174r0;

    /* renamed from: s, reason: collision with root package name */
    public Y f6175s;

    /* renamed from: s0, reason: collision with root package name */
    public int f6176s0;

    /* renamed from: t, reason: collision with root package name */
    public int f6177t;

    /* renamed from: t0, reason: collision with root package name */
    public int f6178t0;

    /* renamed from: u, reason: collision with root package name */
    public int f6179u;

    /* renamed from: u0, reason: collision with root package name */
    public int f6180u0;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f6181v;

    /* renamed from: v0, reason: collision with root package name */
    public int f6182v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6183w;

    /* renamed from: w0, reason: collision with root package name */
    public int f6184w0;

    /* renamed from: x, reason: collision with root package name */
    public Y f6185x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6186x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f6187y;

    /* renamed from: y0, reason: collision with root package name */
    public final b f6188y0;

    /* renamed from: z, reason: collision with root package name */
    public int f6189z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f6190z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0336a.a(context, attributeSet, 2130904131, 2131952443), attributeSet, 2130904131);
        int i = 16;
        this.f6153f = -1;
        this.f6159k = -1;
        this.f6161l = -1;
        this.f6163m = -1;
        this.f6165n = new s(this);
        this.f6173r = new n(4);
        this.f6148c0 = new Rect();
        this.f6150d0 = new Rect();
        this.f6152e0 = new RectF();
        this.f6157i0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f6188y0 = bVar;
        this.E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f6143a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.f283a;
        bVar.f2740Q = linearInterpolator;
        bVar.h(false);
        bVar.f2739P = linearInterpolator;
        bVar.h(false);
        if (bVar.f2761g != 8388659) {
            bVar.f2761g = 8388659;
            bVar.h(false);
        }
        int[] iArr = A1.a.f39I;
        k.a(context2, attributeSet, 2130904131, 2131952443);
        k.b(context2, attributeSet, iArr, 2130904131, 2131952443, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130904131, 2131952443);
        C0009i c0009i = new C0009i(i, context2, typedArrayObtainStyledAttributes);
        x xVar = new x(this, c0009i);
        this.f6145b = xVar;
        this.G = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f6118A0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f6190z0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f6135P = m.b(context2, attributeSet, 2130904131, 2131952443).a();
        this.f6137R = context2.getResources().getDimensionPixelOffset(2131100425);
        this.f6139T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f6141V = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(2131100426));
        this.f6142W = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(2131100427));
        this.f6140U = this.f6141V;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        l lVarE = this.f6135P.e();
        if (dimension >= 0.0f) {
            lVarE.f3767e = new X1.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            lVarE.f3768f = new X1.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            lVarE.f3769g = new X1.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            lVarE.h = new X1.a(dimension4);
        }
        this.f6135P = lVarE.a();
        ColorStateList colorStateListW = d.w(context2, c0009i, 7);
        if (colorStateListW != null) {
            int defaultColor = colorStateListW.getDefaultColor();
            this.f6176s0 = defaultColor;
            this.f6146b0 = defaultColor;
            if (colorStateListW.isStateful()) {
                this.f6178t0 = colorStateListW.getColorForState(new int[]{-16842910}, -1);
                this.f6180u0 = colorStateListW.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f6182v0 = colorStateListW.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f6180u0 = this.f6176s0;
                ColorStateList colorStateList = B.l.getColorStateList(context2, 2131034847);
                this.f6178t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f6182v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f6146b0 = 0;
            this.f6176s0 = 0;
            this.f6178t0 = 0;
            this.f6180u0 = 0;
            this.f6182v0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListF = c0009i.F(1);
            this.f6166n0 = colorStateListF;
            this.f6164m0 = colorStateListF;
        }
        ColorStateList colorStateListW2 = d.w(context2, c0009i, 14);
        this.f6172q0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f6168o0 = B.l.getColor(context2, 2131034874);
        this.f6184w0 = B.l.getColor(context2, 2131034875);
        this.f6170p0 = B.l.getColor(context2, 2131034878);
        if (colorStateListW2 != null) {
            setBoxStrokeColorStateList(colorStateListW2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.w(context2, c0009i, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f6125E = c0009i.F(24);
        this.f6126F = c0009i.F(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i5 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f6179u = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f6177t = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i5);
        setCounterOverflowTextAppearance(this.f6177t);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f6179u);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0009i.F(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0009i.F(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0009i.F(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0009i.F(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0009i.F(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0009i.F(58));
        }
        C0276o c0276o = new C0276o(this, c0009i);
        this.f6147c = c0276o;
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0009i.e0();
        WeakHashMap weakHashMap = S.f2363a;
        B.s(this, 2);
        J.m(this, 1);
        frameLayout.addView(xVar);
        frameLayout.addView(c0276o);
        addView(frameLayout);
        setEnabled(z7);
        setHelperTextEnabled(z5);
        setErrorEnabled(z4);
        setCounterEnabled(z6);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f6149d;
        if (!(editText instanceof AutoCompleteTextView) || f.M(editText)) {
            return this.f6129J;
        }
        int I4 = AbstractC0156x.I(this.f6149d, 2130903273);
        int i = this.f6138S;
        int[][] iArr = f6116F0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            h hVar = this.f6129J;
            int i5 = this.f6146b0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0156x.Q(I4, i5, 0.1f), i5}), hVar, hVar);
        }
        Context context = getContext();
        h hVar2 = this.f6129J;
        int iH = AbstractC0156x.H(context, 2130903314, "TextInputLayout");
        h hVar3 = new h(hVar2.f3738a.f3722a);
        int iQ = AbstractC0156x.Q(I4, iH, 0.1f);
        hVar3.m(new ColorStateList(iArr, new int[]{iQ, 0}));
        hVar3.setTint(iH);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iQ, iH});
        h hVar4 = new h(hVar2.f3738a.f3722a);
        hVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar3, hVar4), hVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f6131L == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f6131L = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f6131L.addState(new int[0], f(false));
        }
        return this.f6131L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f6130K == null) {
            this.f6130K = f(true);
        }
        return this.f6130K;
    }

    public static void k(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f6149d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f6149d = editText;
        int i = this.f6153f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f6161l);
        }
        int i5 = this.f6159k;
        if (i5 != -1) {
            setMaxEms(i5);
        } else {
            setMaxWidth(this.f6163m);
        }
        this.f6132M = false;
        i();
        setTextInputAccessibilityDelegate(new z(this));
        Typeface typeface = this.f6149d.getTypeface();
        b bVar = this.f6188y0;
        bVar.m(typeface);
        float textSize = this.f6149d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f6149d.getLetterSpacing();
        if (bVar.f2746W != letterSpacing) {
            bVar.f2746W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f6149d.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (bVar.f2761g != i6) {
            bVar.f2761g = i6;
            bVar.h(false);
        }
        if (bVar.f2759f != gravity) {
            bVar.f2759f = gravity;
            bVar.h(false);
        }
        this.f6149d.addTextChangedListener(new y(this, 0));
        if (this.f6164m0 == null) {
            this.f6164m0 = this.f6149d.getHintTextColors();
        }
        if (this.G) {
            if (TextUtils.isEmpty(this.f6127H)) {
                CharSequence hint = this.f6149d.getHint();
                this.f6151e = hint;
                setHint(hint);
                this.f6149d.setHint((CharSequence) null);
            }
            this.f6128I = true;
        }
        p();
        if (this.f6175s != null) {
            n(this.f6149d.getText());
        }
        r();
        this.f6165n.b();
        this.f6145b.bringToFront();
        C0276o c0276o = this.f6147c;
        c0276o.bringToFront();
        Iterator it = this.f6157i0.iterator();
        while (it.hasNext()) {
            ((C0274m) it.next()).a(this);
        }
        c0276o.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6127H)) {
            return;
        }
        this.f6127H = charSequence;
        b bVar = this.f6188y0;
        if (charSequence == null || !TextUtils.equals(bVar.f2725A, charSequence)) {
            bVar.f2725A = charSequence;
            bVar.f2726B = null;
            Bitmap bitmap = bVar.f2729E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f2729E = null;
            }
            bVar.h(false);
        }
        if (this.f6186x0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f6183w == z4) {
            return;
        }
        if (z4) {
            Y y4 = this.f6185x;
            if (y4 != null) {
                this.f6143a.addView(y4);
                this.f6185x.setVisibility(0);
            }
        } else {
            Y y5 = this.f6185x;
            if (y5 != null) {
                y5.setVisibility(8);
            }
            this.f6185x = null;
        }
        this.f6183w = z4;
    }

    public final void a(float f2) {
        int i = 2;
        b bVar = this.f6188y0;
        if (bVar.f2751b == f2) {
            return;
        }
        if (this.f6120B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6120B0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0156x.e0(getContext(), 2130903837, a.f284b));
            this.f6120B0.setDuration(AbstractC0156x.d0(getContext(), 2130903827, 167));
            this.f6120B0.addUpdateListener(new c(this, i));
        }
        this.f6120B0.setFloatValues(bVar.f2751b, f2);
        this.f6120B0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f6143a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i5;
        h hVar = this.f6129J;
        if (hVar == null) {
            return;
        }
        m mVar = hVar.f3738a.f3722a;
        m mVar2 = this.f6135P;
        if (mVar != mVar2) {
            hVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f6138S == 2 && (i = this.f6140U) > -1 && (i5 = this.f6144a0) != 0) {
            h hVar2 = this.f6129J;
            hVar2.f3738a.f3729j = i;
            hVar2.invalidateSelf();
            hVar2.q(ColorStateList.valueOf(i5));
        }
        int iB = this.f6146b0;
        if (this.f6138S == 1) {
            iB = D.a.b(this.f6146b0, AbstractC0156x.G(getContext(), 2130903314, 0));
        }
        this.f6146b0 = iB;
        this.f6129J.m(ColorStateList.valueOf(iB));
        h hVar3 = this.f6133N;
        if (hVar3 != null && this.f6134O != null) {
            if (this.f6140U > -1 && this.f6144a0 != 0) {
                hVar3.m(this.f6149d.isFocused() ? ColorStateList.valueOf(this.f6168o0) : ColorStateList.valueOf(this.f6144a0));
                this.f6134O.m(ColorStateList.valueOf(this.f6144a0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.G) {
            return 0;
        }
        int i = this.f6138S;
        b bVar = this.f6188y0;
        if (i == 0) {
            fD = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final j d() {
        j jVar = new j();
        jVar.f1619c = AbstractC0156x.d0(getContext(), 2130903829, 87);
        jVar.f1620d = AbstractC0156x.e0(getContext(), 2130903839, a.f283a);
        return jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f6149d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f6151e != null) {
            boolean z4 = this.f6128I;
            this.f6128I = false;
            CharSequence hint = editText.getHint();
            this.f6149d.setHint(this.f6151e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f6149d.setHint(hint);
                this.f6128I = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f6143a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
            View childAt = frameLayout.getChildAt(i5);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f6149d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f6124D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f6124D0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar;
        int i;
        super.draw(canvas);
        boolean z4 = this.G;
        b bVar = this.f6188y0;
        if (z4) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.f2726B != null) {
                RectF rectF = bVar.f2757e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f2737N;
                    textPaint.setTextSize(bVar.G);
                    float f2 = bVar.f2768p;
                    float f3 = bVar.f2769q;
                    float f5 = bVar.f2730F;
                    if (f5 != 1.0f) {
                        canvas.scale(f5, f5, f2, f3);
                    }
                    if (bVar.f2756d0 <= 1 || bVar.f2727C) {
                        canvas.translate(f2, f3);
                        bVar.f2747Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f2768p - bVar.f2747Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f6 = alpha;
                        textPaint.setAlpha((int) (bVar.f2752b0 * f6));
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.f2731H, bVar.f2732I, bVar.f2733J, AbstractC0156x.k(bVar.f2734K, textPaint.getAlpha()));
                        }
                        bVar.f2747Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f2750a0 * f6));
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.f2731H, bVar.f2732I, bVar.f2733J, AbstractC0156x.k(bVar.f2734K, textPaint.getAlpha()));
                        }
                        int lineBaseline = bVar.f2747Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f2754c0;
                        float f7 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, textPaint);
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.f2731H, bVar.f2732I, bVar.f2733J, bVar.f2734K);
                        }
                        String strTrim = bVar.f2754c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f2747Y.getLineEnd(i), str.length()), 0.0f, f7, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f6134O == null || (hVar = this.f6133N) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f6149d.isFocused()) {
            Rect bounds = this.f6134O.getBounds();
            Rect bounds2 = this.f6133N.getBounds();
            float f8 = bVar.f2751b;
            int iCenterX = bounds2.centerX();
            bounds.left = a.c(iCenterX, bounds2.left, f8);
            bounds.right = a.c(iCenterX, bounds2.right, f8);
            this.f6134O.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.f6122C0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f6122C0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            Q1.b r3 = r4.f6188y0
            if (r3 == 0) goto L2f
            r3.f2735L = r1
            android.content.res.ColorStateList r1 = r3.f2763k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f2762j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f6149d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = M.S.f2363a
            boolean r3 = M.E.c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f6122C0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.G && !TextUtils.isEmpty(this.f6127H) && (this.f6129J instanceof C0269h);
    }

    public final h f(boolean z4) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(2131100400);
        float f2 = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f6149d;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(2131100000);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131100337);
        X1.k kVar = new X1.k();
        X1.k kVar2 = new X1.k();
        X1.k kVar3 = new X1.k();
        X1.k kVar4 = new X1.k();
        e eVar = new e();
        e eVar2 = new e();
        e eVar3 = new e();
        e eVar4 = new e();
        X1.a aVar = new X1.a(f2);
        X1.a aVar2 = new X1.a(f2);
        X1.a aVar3 = new X1.a(dimensionPixelOffset);
        X1.a aVar4 = new X1.a(dimensionPixelOffset);
        m mVar = new m();
        mVar.f3773a = kVar;
        mVar.f3774b = kVar2;
        mVar.f3775c = kVar3;
        mVar.f3776d = kVar4;
        mVar.f3777e = aVar;
        mVar.f3778f = aVar2;
        mVar.f3779g = aVar4;
        mVar.h = aVar3;
        mVar.i = eVar;
        mVar.f3780j = eVar2;
        mVar.f3781k = eVar3;
        mVar.f3782l = eVar4;
        EditText editText2 = this.f6149d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = h.f3737A;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC0156x.H(context, 2130903314, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.j(context);
        hVar.m(dropDownBackgroundTintList);
        hVar.l(popupElevation);
        hVar.setShapeAppearanceModel(mVar);
        g gVar = hVar.f3738a;
        if (gVar.f3728g == null) {
            gVar.f3728g = new Rect();
        }
        hVar.f3738a.f3728g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i, boolean z4) {
        return ((z4 || getPrefixText() == null) ? (!z4 || getSuffixText() == null) ? this.f6149d.getCompoundPaddingLeft() : this.f6147c.c() : this.f6145b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6149d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public h getBoxBackground() {
        int i = this.f6138S;
        if (i == 1 || i == 2) {
            return this.f6129J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6146b0;
    }

    public int getBoxBackgroundMode() {
        return this.f6138S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f6139T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zG = k.g(this);
        RectF rectF = this.f6152e0;
        return zG ? this.f6135P.h.a(rectF) : this.f6135P.f3779g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zG = k.g(this);
        RectF rectF = this.f6152e0;
        return zG ? this.f6135P.f3779g.a(rectF) : this.f6135P.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zG = k.g(this);
        RectF rectF = this.f6152e0;
        return zG ? this.f6135P.f3777e.a(rectF) : this.f6135P.f3778f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zG = k.g(this);
        RectF rectF = this.f6152e0;
        return zG ? this.f6135P.f3778f.a(rectF) : this.f6135P.f3777e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f6172q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6174r0;
    }

    public int getBoxStrokeWidth() {
        return this.f6141V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6142W;
    }

    public int getCounterMaxLength() {
        return this.f6169p;
    }

    public CharSequence getCounterOverflowDescription() {
        Y y4;
        if (this.f6167o && this.f6171q && (y4 = this.f6175s) != null) {
            return y4.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f6123D;
    }

    public ColorStateList getCounterTextColor() {
        return this.f6121C;
    }

    public ColorStateList getCursorColor() {
        return this.f6125E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f6126F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f6164m0;
    }

    public EditText getEditText() {
        return this.f6149d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6147c.f5037k.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6147c.f5037k.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f6147c.f5043q;
    }

    public int getEndIconMode() {
        return this.f6147c.f5039m;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6147c.f5044r;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6147c.f5037k;
    }

    public CharSequence getError() {
        s sVar = this.f6165n;
        if (sVar.f5079q) {
            return sVar.f5078p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f6165n.f5082t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6165n.f5081s;
    }

    public int getErrorCurrentTextColors() {
        Y y4 = this.f6165n.f5080r;
        if (y4 != null) {
            return y4.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f6147c.f5033c.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f6165n;
        if (sVar.f5086x) {
            return sVar.f5085w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        Y y4 = this.f6165n.f5087y;
        if (y4 != null) {
            return y4.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.G) {
            return this.f6127H;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f6188y0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f6188y0;
        return bVar.e(bVar.f2763k);
    }

    public ColorStateList getHintTextColor() {
        return this.f6166n0;
    }

    public InterfaceC0260A getLengthCounter() {
        return this.f6173r;
    }

    public int getMaxEms() {
        return this.f6159k;
    }

    public int getMaxWidth() {
        return this.f6163m;
    }

    public int getMinEms() {
        return this.f6153f;
    }

    public int getMinWidth() {
        return this.f6161l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6147c.f5037k.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6147c.f5037k.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6183w) {
            return this.f6181v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6189z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6187y;
    }

    public CharSequence getPrefixText() {
        return this.f6145b.f5107c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6145b.f5106b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6145b.f5106b;
    }

    public m getShapeAppearanceModel() {
        return this.f6135P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6145b.f5108d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6145b.f5108d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6145b.f5111k;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6145b.f5112l;
    }

    public CharSequence getSuffixText() {
        return this.f6147c.f5046t;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6147c.f5047u.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6147c.f5047u;
    }

    public Typeface getTypeface() {
        return this.f6154f0;
    }

    public final int h(int i, boolean z4) {
        return i - ((z4 || getSuffixText() == null) ? (!z4 || getPrefixText() == null) ? this.f6149d.getCompoundPaddingRight() : this.f6145b.a() : this.f6147c.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i = this.f6138S;
        if (i == 0) {
            this.f6129J = null;
            this.f6133N = null;
            this.f6134O = null;
        } else if (i == 1) {
            this.f6129J = new h(this.f6135P);
            this.f6133N = new h();
            this.f6134O = new h();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f6138S + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.G || (this.f6129J instanceof C0269h)) {
                this.f6129J = new h(this.f6135P);
            } else {
                m mVar = this.f6135P;
                int i5 = C0269h.f5011C;
                if (mVar == null) {
                    mVar = new m();
                }
                C0268g c0268g = new C0268g(mVar, new RectF());
                C0269h c0269h = new C0269h(c0268g);
                c0269h.f5012B = c0268g;
                this.f6129J = c0269h;
            }
            this.f6133N = null;
            this.f6134O = null;
        }
        s();
        x();
        if (this.f6138S == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6139T = getResources().getDimensionPixelSize(2131100231);
            } else if (d.L(getContext())) {
                this.f6139T = getResources().getDimensionPixelSize(2131100230);
            }
        }
        if (this.f6149d != null && this.f6138S == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f6149d;
                WeakHashMap weakHashMap = S.f2363a;
                C.k(editText, C.f(editText), getResources().getDimensionPixelSize(2131100229), C.e(this.f6149d), getResources().getDimensionPixelSize(2131100228));
            } else if (d.L(getContext())) {
                EditText editText2 = this.f6149d;
                WeakHashMap weakHashMap2 = S.f2363a;
                C.k(editText2, C.f(editText2), getResources().getDimensionPixelSize(2131100227), C.e(this.f6149d), getResources().getDimensionPixelSize(2131100226));
            }
        }
        if (this.f6138S != 0) {
            t();
        }
        EditText editText3 = this.f6149d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.f6138S;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(Y y4, int i) {
        try {
            y4.setTextAppearance(i);
            if (y4.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        y4.setTextAppearance(2131952023);
        y4.setTextColor(B.l.getColor(getContext(), 2131034203));
    }

    public final boolean m() {
        s sVar = this.f6165n;
        return (sVar.f5077o != 1 || sVar.f5080r == null || TextUtils.isEmpty(sVar.f5078p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((n) this.f6173r).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f6171q;
        int i = this.f6169p;
        String string = null;
        if (i == -1) {
            this.f6175s.setText(String.valueOf(length));
            this.f6175s.setContentDescription(null);
            this.f6171q = false;
        } else {
            this.f6171q = length > i;
            Context context = getContext();
            this.f6175s.setContentDescription(context.getString(this.f6171q ? 2131886163 : 2131886162, Integer.valueOf(length), Integer.valueOf(this.f6169p)));
            if (z4 != this.f6171q) {
                o();
            }
            String str = K.b.f2105b;
            Locale locale = Locale.getDefault();
            int i5 = i.f2119a;
            K.b bVar = K.h.a(locale) == 1 ? K.b.f2108e : K.b.f2107d;
            Y y4 = this.f6175s;
            String string2 = getContext().getString(2131886164, Integer.valueOf(length), Integer.valueOf(this.f6169p));
            if (string2 == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                F1.d dVar = K.g.f2115a;
                string = bVar.c(string2).toString();
            }
            y4.setText(string);
        }
        if (this.f6149d == null || z4 == this.f6171q) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y4 = this.f6175s;
        if (y4 != null) {
            l(y4, this.f6171q ? this.f6177t : this.f6179u);
            if (!this.f6171q && (colorStateList2 = this.f6121C) != null) {
                this.f6175s.setTextColor(colorStateList2);
            }
            if (!this.f6171q || (colorStateList = this.f6123D) == null) {
                return;
            }
            this.f6175s.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6188y0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0276o c0276o = this.f6147c;
        c0276o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.E0 = false;
        if (this.f6149d != null && this.f6149d.getMeasuredHeight() < (iMax = Math.max(c0276o.getMeasuredHeight(), this.f6145b.getMeasuredHeight()))) {
            this.f6149d.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zQ = q();
        if (z4 || zQ) {
            this.f6149d.post(new RunnableC0005e(this, 22));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        EditText editText = this.f6149d;
        if (editText != null) {
            ThreadLocal threadLocal = Q1.c.f2779a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f6148c0;
            rect.set(0, 0, width, height);
            Q1.c.b(this, editText, rect);
            h hVar = this.f6133N;
            if (hVar != null) {
                int i8 = rect.bottom;
                hVar.setBounds(rect.left, i8 - this.f6141V, rect.right, i8);
            }
            h hVar2 = this.f6134O;
            if (hVar2 != null) {
                int i9 = rect.bottom;
                hVar2.setBounds(rect.left, i9 - this.f6142W, rect.right, i9);
            }
            if (this.G) {
                float textSize = this.f6149d.getTextSize();
                b bVar = this.f6188y0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f6149d.getGravity();
                int i10 = (gravity & (-113)) | 48;
                if (bVar.f2761g != i10) {
                    bVar.f2761g = i10;
                    bVar.h(false);
                }
                if (bVar.f2759f != gravity) {
                    bVar.f2759f = gravity;
                    bVar.h(false);
                }
                if (this.f6149d == null) {
                    throw new IllegalStateException();
                }
                boolean zG = k.g(this);
                int i11 = rect.bottom;
                Rect rect2 = this.f6150d0;
                rect2.bottom = i11;
                int i12 = this.f6138S;
                if (i12 == 1) {
                    rect2.left = g(rect.left, zG);
                    rect2.top = rect.top + this.f6139T;
                    rect2.right = h(rect.right, zG);
                } else if (i12 != 2) {
                    rect2.left = g(rect.left, zG);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zG);
                } else {
                    rect2.left = this.f6149d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f6149d.getPaddingRight();
                }
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                int i16 = rect2.bottom;
                Rect rect3 = bVar.f2755d;
                if (rect3.left != i13 || rect3.top != i14 || rect3.right != i15 || rect3.bottom != i16) {
                    rect3.set(i13, i14, i15, i16);
                    bVar.f2736M = true;
                }
                if (this.f6149d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f2738O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f2773u);
                textPaint.setLetterSpacing(bVar.f2746W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f6149d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f6138S != 1 || this.f6149d.getMinLines() > 1) ? rect.top + this.f6149d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f6149d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f6138S != 1 || this.f6149d.getMinLines() > 1) ? rect.bottom - this.f6149d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i17 = rect2.left;
                int i18 = rect2.top;
                int i19 = rect2.right;
                Rect rect4 = bVar.f2753c;
                if (rect4.left != i17 || rect4.top != i18 || rect4.right != i19 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i17, i18, i19, compoundPaddingBottom);
                    bVar.f2736M = true;
                }
                bVar.h(false);
                if (!e() || this.f6186x0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) throws Resources.NotFoundException {
        EditText editText;
        super.onMeasure(i, i5);
        boolean z4 = this.E0;
        C0276o c0276o = this.f6147c;
        if (!z4) {
            c0276o.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if (this.f6185x != null && (editText = this.f6149d) != null) {
            this.f6185x.setGravity(editText.getGravity());
            this.f6185x.setPadding(this.f6149d.getCompoundPaddingLeft(), this.f6149d.getCompoundPaddingTop(), this.f6149d.getCompoundPaddingRight(), this.f6149d.getCompoundPaddingBottom());
        }
        c0276o.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0261B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0261B c0261b = (C0261B) parcelable;
        super.onRestoreInstanceState(c0261b.f3264a);
        setError(c0261b.f4992c);
        if (c0261b.f4993d) {
            post(new N(this, 21));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z4 = i == 1;
        if (z4 != this.f6136Q) {
            X1.c cVar = this.f6135P.f3777e;
            RectF rectF = this.f6152e0;
            float fA = cVar.a(rectF);
            float fA2 = this.f6135P.f3778f.a(rectF);
            float fA3 = this.f6135P.h.a(rectF);
            float fA4 = this.f6135P.f3779g.a(rectF);
            m mVar = this.f6135P;
            d dVar = mVar.f3773a;
            d dVar2 = mVar.f3774b;
            d dVar3 = mVar.f3776d;
            d dVar4 = mVar.f3775c;
            e eVar = new e();
            e eVar2 = new e();
            e eVar3 = new e();
            e eVar4 = new e();
            l.b(dVar2);
            l.b(dVar);
            l.b(dVar4);
            l.b(dVar3);
            X1.a aVar = new X1.a(fA2);
            X1.a aVar2 = new X1.a(fA);
            X1.a aVar3 = new X1.a(fA4);
            X1.a aVar4 = new X1.a(fA3);
            m mVar2 = new m();
            mVar2.f3773a = dVar2;
            mVar2.f3774b = dVar;
            mVar2.f3775c = dVar3;
            mVar2.f3776d = dVar4;
            mVar2.f3777e = aVar;
            mVar2.f3778f = aVar2;
            mVar2.f3779g = aVar4;
            mVar2.h = aVar3;
            mVar2.i = eVar;
            mVar2.f3780j = eVar2;
            mVar2.f3781k = eVar3;
            mVar2.f3782l = eVar4;
            this.f6136Q = z4;
            setShapeAppearanceModel(mVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0261B c0261b = new C0261B(super.onSaveInstanceState());
        if (m()) {
            c0261b.f4992c = getError();
        }
        C0276o c0276o = this.f6147c;
        c0261b.f4993d = c0276o.f5039m != 0 && c0276o.f5037k.f6075d;
        return c0261b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f6125E
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903272(0x7f0300e8, float:1.7413357E38)
            android.util.TypedValue r1 = p1.b.O(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = B.l.getColorStateList(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f6149d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f6149d
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L49
            l.Y r2 = r4.f6175s
            if (r2 == 0) goto L4e
            boolean r2 = r4.f6171q
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r4 = r4.f6126F
            if (r4 == 0) goto L4e
            r0 = r4
        L4e:
            E.b.h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        Y y4;
        EditText editText = this.f6149d;
        if (editText == null || this.f6138S != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0692h0.f8590a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f6171q && (y4 = this.f6175s) != null) {
            drawableMutate.setColorFilter(r.c(y4.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f6149d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f6149d;
        if (editText == null || this.f6129J == null) {
            return;
        }
        if ((this.f6132M || editText.getBackground() == null) && this.f6138S != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f6149d;
            WeakHashMap weakHashMap = S.f2363a;
            B.q(editText2, editTextBoxBackground);
            this.f6132M = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f6146b0 != i) {
            this.f6146b0 = i;
            this.f6176s0 = i;
            this.f6180u0 = i;
            this.f6182v0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(B.l.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f6176s0 = defaultColor;
        this.f6146b0 = defaultColor;
        this.f6178t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6180u0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f6182v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f6138S) {
            return;
        }
        this.f6138S = i;
        if (this.f6149d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f6139T = i;
    }

    public void setBoxCornerFamily(int i) {
        l lVarE = this.f6135P.e();
        X1.c cVar = this.f6135P.f3777e;
        d dVarQ = AbstractC0156x.q(i);
        lVarE.f3763a = dVarQ;
        l.b(dVarQ);
        lVarE.f3767e = cVar;
        X1.c cVar2 = this.f6135P.f3778f;
        d dVarQ2 = AbstractC0156x.q(i);
        lVarE.f3764b = dVarQ2;
        l.b(dVarQ2);
        lVarE.f3768f = cVar2;
        X1.c cVar3 = this.f6135P.h;
        d dVarQ3 = AbstractC0156x.q(i);
        lVarE.f3766d = dVarQ3;
        l.b(dVarQ3);
        lVarE.h = cVar3;
        X1.c cVar4 = this.f6135P.f3779g;
        d dVarQ4 = AbstractC0156x.q(i);
        lVarE.f3765c = dVarQ4;
        l.b(dVarQ4);
        lVarE.f3769g = cVar4;
        this.f6135P = lVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.f6172q0 != i) {
            this.f6172q0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f6168o0 = colorStateList.getDefaultColor();
            this.f6184w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f6170p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f6172q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f6172q0 != colorStateList.getDefaultColor()) {
            this.f6172q0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f6174r0 != colorStateList) {
            this.f6174r0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f6141V = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f6142W = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f6167o != z4) {
            s sVar = this.f6165n;
            if (z4) {
                Y y4 = new Y(getContext(), null);
                this.f6175s = y4;
                y4.setId(2131231233);
                Typeface typeface = this.f6154f0;
                if (typeface != null) {
                    this.f6175s.setTypeface(typeface);
                }
                this.f6175s.setMaxLines(1);
                sVar.a(this.f6175s, 2);
                AbstractC0126l.h((ViewGroup.MarginLayoutParams) this.f6175s.getLayoutParams(), getResources().getDimensionPixelOffset(2131100428));
                o();
                if (this.f6175s != null) {
                    EditText editText = this.f6149d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f6175s, 2);
                this.f6175s = null;
            }
            this.f6167o = z4;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f6169p != i) {
            if (i > 0) {
                this.f6169p = i;
            } else {
                this.f6169p = -1;
            }
            if (!this.f6167o || this.f6175s == null) {
                return;
            }
            EditText editText = this.f6149d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f6177t != i) {
            this.f6177t = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f6123D != colorStateList) {
            this.f6123D = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f6179u != i) {
            this.f6179u = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f6121C != colorStateList) {
            this.f6121C = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f6125E != colorStateList) {
            this.f6125E = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f6126F != colorStateList) {
            this.f6126F = colorStateList;
            if (m() || (this.f6175s != null && this.f6171q)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f6164m0 = colorStateList;
        this.f6166n0 = colorStateList;
        if (this.f6149d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        k(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f6147c.f5037k.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f6147c.f5037k.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i) {
        C0276o c0276o = this.f6147c;
        CharSequence text = i != 0 ? c0276o.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0276o.f5037k;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0276o c0276o = this.f6147c;
        Drawable drawableB = i != 0 ? d.B(c0276o.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0276o.f5037k;
        checkableImageButton.setImageDrawable(drawableB);
        if (drawableB != null) {
            ColorStateList colorStateList = c0276o.f5041o;
            PorterDuff.Mode mode = c0276o.f5042p;
            TextInputLayout textInputLayout = c0276o.f5031a;
            AbstractC0183a.f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0183a.c0(textInputLayout, checkableImageButton, c0276o.f5041o);
        }
    }

    public void setEndIconMinSize(int i) {
        C0276o c0276o = this.f6147c;
        if (i < 0) {
            c0276o.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0276o.f5043q) {
            c0276o.f5043q = i;
            CheckableImageButton checkableImageButton = c0276o.f5037k;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0276o.f5033c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) throws Resources.NotFoundException {
        this.f6147c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0276o c0276o = this.f6147c;
        View.OnLongClickListener onLongClickListener = c0276o.f5045s;
        CheckableImageButton checkableImageButton = c0276o.f5037k;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0276o c0276o = this.f6147c;
        c0276o.f5045s = onLongClickListener;
        CheckableImageButton checkableImageButton = c0276o.f5037k;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0276o c0276o = this.f6147c;
        c0276o.f5044r = scaleType;
        c0276o.f5037k.setScaleType(scaleType);
        c0276o.f5033c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0276o c0276o = this.f6147c;
        if (c0276o.f5041o != colorStateList) {
            c0276o.f5041o = colorStateList;
            AbstractC0183a.f(c0276o.f5031a, c0276o.f5037k, colorStateList, c0276o.f5042p);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0276o c0276o = this.f6147c;
        if (c0276o.f5042p != mode) {
            c0276o.f5042p = mode;
            AbstractC0183a.f(c0276o.f5031a, c0276o.f5037k, c0276o.f5041o, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f6147c.h(z4);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f6165n;
        if (!sVar.f5079q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f5078p = charSequence;
        sVar.f5080r.setText(charSequence);
        int i = sVar.f5076n;
        if (i != 1) {
            sVar.f5077o = 1;
        }
        sVar.i(i, sVar.f5077o, sVar.h(sVar.f5080r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        s sVar = this.f6165n;
        sVar.f5082t = i;
        Y y4 = sVar.f5080r;
        if (y4 != null) {
            WeakHashMap weakHashMap = S.f2363a;
            E.f(y4, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f6165n;
        sVar.f5081s = charSequence;
        Y y4 = sVar.f5080r;
        if (y4 != null) {
            y4.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) throws Resources.NotFoundException {
        s sVar = this.f6165n;
        if (sVar.f5079q == z4) {
            return;
        }
        sVar.c();
        TextInputLayout textInputLayout = sVar.h;
        if (z4) {
            Y y4 = new Y(sVar.f5071g, null);
            sVar.f5080r = y4;
            y4.setId(2131231234);
            sVar.f5080r.setTextAlignment(5);
            Typeface typeface = sVar.f5064B;
            if (typeface != null) {
                sVar.f5080r.setTypeface(typeface);
            }
            int i = sVar.f5083u;
            sVar.f5083u = i;
            Y y5 = sVar.f5080r;
            if (y5 != null) {
                textInputLayout.l(y5, i);
            }
            ColorStateList colorStateList = sVar.f5084v;
            sVar.f5084v = colorStateList;
            Y y6 = sVar.f5080r;
            if (y6 != null && colorStateList != null) {
                y6.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f5081s;
            sVar.f5081s = charSequence;
            Y y7 = sVar.f5080r;
            if (y7 != null) {
                y7.setContentDescription(charSequence);
            }
            int i5 = sVar.f5082t;
            sVar.f5082t = i5;
            Y y8 = sVar.f5080r;
            if (y8 != null) {
                WeakHashMap weakHashMap = S.f2363a;
                E.f(y8, i5);
            }
            sVar.f5080r.setVisibility(4);
            sVar.a(sVar.f5080r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f5080r, 0);
            sVar.f5080r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        sVar.f5079q = z4;
    }

    public void setErrorIconDrawable(int i) throws Resources.NotFoundException {
        C0276o c0276o = this.f6147c;
        c0276o.i(i != 0 ? d.B(c0276o.getContext(), i) : null);
        AbstractC0183a.c0(c0276o.f5031a, c0276o.f5033c, c0276o.f5034d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0276o c0276o = this.f6147c;
        CheckableImageButton checkableImageButton = c0276o.f5033c;
        View.OnLongClickListener onLongClickListener = c0276o.f5036f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0276o c0276o = this.f6147c;
        c0276o.f5036f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0276o.f5033c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0276o c0276o = this.f6147c;
        if (c0276o.f5034d != colorStateList) {
            c0276o.f5034d = colorStateList;
            AbstractC0183a.f(c0276o.f5031a, c0276o.f5033c, colorStateList, c0276o.f5035e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0276o c0276o = this.f6147c;
        if (c0276o.f5035e != mode) {
            c0276o.f5035e = mode;
            AbstractC0183a.f(c0276o.f5031a, c0276o.f5033c, c0276o.f5034d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        s sVar = this.f6165n;
        sVar.f5083u = i;
        Y y4 = sVar.f5080r;
        if (y4 != null) {
            sVar.h.l(y4, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f6165n;
        sVar.f5084v = colorStateList;
        Y y4 = sVar.f5080r;
        if (y4 == null || colorStateList == null) {
            return;
        }
        y4.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.f6190z0 != z4) {
            this.f6190z0 = z4;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f6165n;
        if (zIsEmpty) {
            if (sVar.f5086x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f5086x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f5085w = charSequence;
        sVar.f5087y.setText(charSequence);
        int i = sVar.f5076n;
        if (i != 2) {
            sVar.f5077o = 2;
        }
        sVar.i(i, sVar.f5077o, sVar.h(sVar.f5087y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f6165n;
        sVar.f5063A = colorStateList;
        Y y4 = sVar.f5087y;
        if (y4 == null || colorStateList == null) {
            return;
        }
        y4.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) throws Resources.NotFoundException {
        s sVar = this.f6165n;
        if (sVar.f5086x == z4) {
            return;
        }
        sVar.c();
        if (z4) {
            Y y4 = new Y(sVar.f5071g, null);
            sVar.f5087y = y4;
            y4.setId(2131231235);
            sVar.f5087y.setTextAlignment(5);
            Typeface typeface = sVar.f5064B;
            if (typeface != null) {
                sVar.f5087y.setTypeface(typeface);
            }
            sVar.f5087y.setVisibility(4);
            Y y5 = sVar.f5087y;
            WeakHashMap weakHashMap = S.f2363a;
            E.f(y5, 1);
            int i = sVar.f5088z;
            sVar.f5088z = i;
            Y y6 = sVar.f5087y;
            if (y6 != null) {
                y6.setTextAppearance(i);
            }
            ColorStateList colorStateList = sVar.f5063A;
            sVar.f5063A = colorStateList;
            Y y7 = sVar.f5087y;
            if (y7 != null && colorStateList != null) {
                y7.setTextColor(colorStateList);
            }
            sVar.a(sVar.f5087y, 1);
            sVar.f5087y.setAccessibilityDelegate(new b2.r(sVar));
        } else {
            sVar.c();
            int i5 = sVar.f5076n;
            if (i5 == 2) {
                sVar.f5077o = 0;
            }
            sVar.i(i5, sVar.f5077o, sVar.h(sVar.f5087y, ""));
            sVar.g(sVar.f5087y, 1);
            sVar.f5087y = null;
            TextInputLayout textInputLayout = sVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        sVar.f5086x = z4;
    }

    public void setHelperTextTextAppearance(int i) {
        s sVar = this.f6165n;
        sVar.f5088z = i;
        Y y4 = sVar.f5087y;
        if (y4 != null) {
            y4.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f6118A0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.G) {
            this.G = z4;
            if (z4) {
                CharSequence hint = this.f6149d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6127H)) {
                        setHint(hint);
                    }
                    this.f6149d.setHint((CharSequence) null);
                }
                this.f6128I = true;
            } else {
                this.f6128I = false;
                if (!TextUtils.isEmpty(this.f6127H) && TextUtils.isEmpty(this.f6149d.getHint())) {
                    this.f6149d.setHint(this.f6127H);
                }
                setHintInternal(null);
            }
            if (this.f6149d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f6188y0;
        TextInputLayout textInputLayout = bVar.f2749a;
        U1.d dVar = new U1.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f3308j;
        if (colorStateList != null) {
            bVar.f2763k = colorStateList;
        }
        float f2 = dVar.f3309k;
        if (f2 != 0.0f) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f3301a;
        if (colorStateList2 != null) {
            bVar.f2744U = colorStateList2;
        }
        bVar.f2742S = dVar.f3305e;
        bVar.f2743T = dVar.f3306f;
        bVar.f2741R = dVar.f3307g;
        bVar.f2745V = dVar.i;
        U1.a aVar = bVar.f2777y;
        if (aVar != null) {
            aVar.f = true;
        }
        h1.i iVar = new h1.i(bVar, 8);
        dVar.a();
        bVar.f2777y = new U1.a(iVar, dVar.f3312n);
        dVar.c(textInputLayout.getContext(), bVar.f2777y);
        bVar.h(false);
        this.f6166n0 = bVar.f2763k;
        if (this.f6149d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f6166n0 != colorStateList) {
            if (this.f6164m0 == null) {
                b bVar = this.f6188y0;
                if (bVar.f2763k != colorStateList) {
                    bVar.f2763k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f6166n0 = colorStateList;
            if (this.f6149d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0260A interfaceC0260A) {
        this.f6173r = interfaceC0260A;
    }

    public void setMaxEms(int i) {
        this.f6159k = i;
        EditText editText = this.f6149d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f6163m = i;
        EditText editText = this.f6149d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f6153f = i;
        EditText editText = this.f6149d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f6161l = i;
        EditText editText = this.f6149d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0276o c0276o = this.f6147c;
        c0276o.f5037k.setContentDescription(i != 0 ? c0276o.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0276o c0276o = this.f6147c;
        c0276o.f5037k.setImageDrawable(i != 0 ? d.B(c0276o.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) throws Resources.NotFoundException {
        C0276o c0276o = this.f6147c;
        if (z4 && c0276o.f5039m != 1) {
            c0276o.g(1);
        } else if (z4) {
            c0276o.getClass();
        } else {
            c0276o.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0276o c0276o = this.f6147c;
        c0276o.f5041o = colorStateList;
        AbstractC0183a.f(c0276o.f5031a, c0276o.f5037k, colorStateList, c0276o.f5042p);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0276o c0276o = this.f6147c;
        c0276o.f5042p = mode;
        AbstractC0183a.f(c0276o.f5031a, c0276o.f5037k, c0276o.f5041o, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6185x == null) {
            Y y4 = new Y(getContext(), null);
            this.f6185x = y4;
            y4.setId(2131231236);
            Y y5 = this.f6185x;
            WeakHashMap weakHashMap = S.f2363a;
            B.s(y5, 2);
            j jVarD = d();
            this.f6117A = jVarD;
            jVarD.f1618b = 67L;
            this.f6119B = d();
            setPlaceholderTextAppearance(this.f6189z);
            setPlaceholderTextColor(this.f6187y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6183w) {
                setPlaceholderTextEnabled(true);
            }
            this.f6181v = charSequence;
        }
        EditText editText = this.f6149d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f6189z = i;
        Y y4 = this.f6185x;
        if (y4 != null) {
            y4.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6187y != colorStateList) {
            this.f6187y = colorStateList;
            Y y4 = this.f6185x;
            if (y4 == null || colorStateList == null) {
                return;
            }
            y4.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        x xVar = this.f6145b;
        xVar.getClass();
        xVar.f5107c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xVar.f5106b.setText(charSequence);
        xVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f6145b.f5106b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6145b.f5106b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        h hVar = this.f6129J;
        if (hVar == null || hVar.f3738a.f3722a == mVar) {
            return;
        }
        this.f6135P = mVar;
        b();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f6145b.f5108d.setCheckable(z4);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6145b.f5108d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? d.B(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        x xVar = this.f6145b;
        if (i < 0) {
            xVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != xVar.f5111k) {
            xVar.f5111k = i;
            CheckableImageButton checkableImageButton = xVar.f5108d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x xVar = this.f6145b;
        View.OnLongClickListener onLongClickListener = xVar.f5113m;
        CheckableImageButton checkableImageButton = xVar.f5108d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x xVar = this.f6145b;
        xVar.f5113m = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f5108d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0183a.h0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x xVar = this.f6145b;
        xVar.f5112l = scaleType;
        xVar.f5108d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x xVar = this.f6145b;
        if (xVar.f5109e != colorStateList) {
            xVar.f5109e = colorStateList;
            AbstractC0183a.f(xVar.f5105a, xVar.f5108d, colorStateList, xVar.f5110f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x xVar = this.f6145b;
        if (xVar.f5110f != mode) {
            xVar.f5110f = mode;
            AbstractC0183a.f(xVar.f5105a, xVar.f5108d, xVar.f5109e, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f6145b.c(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0276o c0276o = this.f6147c;
        c0276o.getClass();
        c0276o.f5046t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0276o.f5047u.setText(charSequence);
        c0276o.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f6147c.f5047u.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6147c.f5047u.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(z zVar) {
        EditText editText = this.f6149d;
        if (editText != null) {
            S.h(editText, zVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6154f0) {
            this.f6154f0 = typeface;
            this.f6188y0.m(typeface);
            s sVar = this.f6165n;
            if (typeface != sVar.f5064B) {
                sVar.f5064B = typeface;
                Y y4 = sVar.f5080r;
                if (y4 != null) {
                    y4.setTypeface(typeface);
                }
                Y y5 = sVar.f5087y;
                if (y5 != null) {
                    y5.setTypeface(typeface);
                }
            }
            Y y6 = this.f6175s;
            if (y6 != null) {
                y6.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f6138S != 1) {
            FrameLayout frameLayout = this.f6143a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        Y y4;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f6149d;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6149d;
        boolean z7 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f6164m0;
        b bVar = this.f6188y0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f6164m0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f6184w0) : this.f6184w0));
        } else if (m()) {
            Y y5 = this.f6165n.f5080r;
            bVar.i(y5 != null ? y5.getTextColors() : null);
        } else if (this.f6171q && (y4 = this.f6175s) != null) {
            bVar.i(y4.getTextColors());
        } else if (z7 && (colorStateList = this.f6166n0) != null && bVar.f2763k != colorStateList) {
            bVar.f2763k = colorStateList;
            bVar.h(false);
        }
        C0276o c0276o = this.f6147c;
        x xVar = this.f6145b;
        if (z6 || !this.f6190z0 || (isEnabled() && z7)) {
            if (z5 || this.f6186x0) {
                ValueAnimator valueAnimator = this.f6120B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6120B0.cancel();
                }
                if (z4 && this.f6118A0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f6186x0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f6149d;
                v(editText3 != null ? editText3.getText() : null);
                xVar.f5114n = false;
                xVar.e();
                c0276o.f5048v = false;
                c0276o.n();
                return;
            }
            return;
        }
        if (z5 || !this.f6186x0) {
            ValueAnimator valueAnimator2 = this.f6120B0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f6120B0.cancel();
            }
            if (z4 && this.f6118A0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((C0269h) this.f6129J).f5012B.f5010r.isEmpty() && e()) {
                ((C0269h) this.f6129J).u(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f6186x0 = true;
            Y y6 = this.f6185x;
            if (y6 != null && this.f6183w) {
                y6.setText((CharSequence) null);
                F0.r.a(this.f6143a, this.f6119B);
                this.f6185x.setVisibility(4);
            }
            xVar.f5114n = true;
            xVar.e();
            c0276o.f5048v = true;
            c0276o.n();
        }
    }

    public final void v(Editable editable) {
        ((n) this.f6173r).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f6143a;
        if (length != 0 || this.f6186x0) {
            Y y4 = this.f6185x;
            if (y4 == null || !this.f6183w) {
                return;
            }
            y4.setText((CharSequence) null);
            F0.r.a(frameLayout, this.f6119B);
            this.f6185x.setVisibility(4);
            return;
        }
        if (this.f6185x == null || !this.f6183w || TextUtils.isEmpty(this.f6181v)) {
            return;
        }
        this.f6185x.setText(this.f6181v);
        F0.r.a(frameLayout, this.f6117A);
        this.f6185x.setVisibility(0);
        this.f6185x.bringToFront();
        announceForAccessibility(this.f6181v);
    }

    public final void w(boolean z4, boolean z5) {
        int defaultColor = this.f6174r0.getDefaultColor();
        int colorForState = this.f6174r0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f6174r0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f6144a0 = colorForState2;
        } else if (z5) {
            this.f6144a0 = colorForState;
        } else {
            this.f6144a0 = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        Y y4;
        EditText editText;
        EditText editText2;
        if (this.f6129J == null || this.f6138S == 0) {
            return;
        }
        boolean z4 = false;
        boolean z5 = isFocused() || ((editText2 = this.f6149d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f6149d) != null && editText.isHovered())) {
            z4 = true;
        }
        if (!isEnabled()) {
            this.f6144a0 = this.f6184w0;
        } else if (m()) {
            if (this.f6174r0 != null) {
                w(z5, z4);
            } else {
                this.f6144a0 = getErrorCurrentTextColors();
            }
        } else if (!this.f6171q || (y4 = this.f6175s) == null) {
            if (z5) {
                this.f6144a0 = this.f6172q0;
            } else if (z4) {
                this.f6144a0 = this.f6170p0;
            } else {
                this.f6144a0 = this.f6168o0;
            }
        } else if (this.f6174r0 != null) {
            w(z5, z4);
        } else {
            this.f6144a0 = y4.getCurrentTextColor();
        }
        p();
        C0276o c0276o = this.f6147c;
        c0276o.l();
        CheckableImageButton checkableImageButton = c0276o.f5033c;
        ColorStateList colorStateList = c0276o.f5034d;
        TextInputLayout textInputLayout = c0276o.f5031a;
        AbstractC0183a.c0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0276o.f5041o;
        CheckableImageButton checkableImageButton2 = c0276o.f5037k;
        AbstractC0183a.c0(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0276o.b() instanceof C0272k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0183a.f(textInputLayout, checkableImageButton2, c0276o.f5041o, c0276o.f5042p);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                E.b.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        x xVar = this.f6145b;
        AbstractC0183a.c0(xVar.f5105a, xVar.f5108d, xVar.f5109e);
        if (this.f6138S == 2) {
            int i = this.f6140U;
            if (z5 && isEnabled()) {
                this.f6140U = this.f6142W;
            } else {
                this.f6140U = this.f6141V;
            }
            if (this.f6140U != i && e() && !this.f6186x0) {
                if (e()) {
                    ((C0269h) this.f6129J).u(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f6138S == 1) {
            if (!isEnabled()) {
                this.f6146b0 = this.f6178t0;
            } else if (z4 && !z5) {
                this.f6146b0 = this.f6182v0;
            } else if (z5) {
                this.f6146b0 = this.f6180u0;
            } else {
                this.f6146b0 = this.f6176s0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6145b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6147c.f5037k.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6147c.f5037k.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6147c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6147c.f5037k;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0276o c0276o = this.f6147c;
        CheckableImageButton checkableImageButton = c0276o.f5037k;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0276o.f5041o;
            PorterDuff.Mode mode = c0276o.f5042p;
            TextInputLayout textInputLayout = c0276o.f5031a;
            AbstractC0183a.f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0183a.c0(textInputLayout, checkableImageButton, c0276o.f5041o);
        }
    }
}
