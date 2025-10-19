package com.google.android.material.chip;

import A1.a;
import B.l;
import B1.c;
import E.h;
import K.g;
import K1.b;
import K1.d;
import K1.e;
import K1.f;
import M.B;
import M.C;
import M.H;
import M.S;
import N2.AbstractC0156x;
import Q1.i;
import Q1.k;
import X1.m;
import X1.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import c2.AbstractC0336a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C0704o;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\chip\Chip.smali */
public class Chip extends C0704o implements e, x, Checkable {

    /* renamed from: A, reason: collision with root package name */
    public static final Rect f5902A = new Rect();

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f5903B = {R.attr.state_selected};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f5904C = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public f f5905e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f5906f;

    /* renamed from: k, reason: collision with root package name */
    public RippleDrawable f5907k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnClickListener f5908l;

    /* renamed from: m, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5909m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5910n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5911o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5912p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5913q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5914r;

    /* renamed from: s, reason: collision with root package name */
    public int f5915s;

    /* renamed from: t, reason: collision with root package name */
    public int f5916t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f5917u;

    /* renamed from: v, reason: collision with root package name */
    public final d f5918v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5919w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f5920x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f5921y;

    /* renamed from: z, reason: collision with root package name */
    public final b f5922z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0336a.a(context, attributeSet, 2130903237, 2131952643), attributeSet, 2130903237);
        this.f5920x = new Rect();
        this.f5921y = new RectF();
        this.f5922z = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = a.f46e;
        TypedArray typedArrayH = k.h(fVar.f2252i0, attributeSet, iArr, 2130903237, 2131952643, new int[0]);
        fVar.I0 = typedArrayH.hasValue(37);
        Context context3 = fVar.f2252i0;
        ColorStateList colorStateListX = r1.d.x(context3, typedArrayH, 24);
        if (fVar.f2215B != colorStateListX) {
            fVar.f2215B = colorStateListX;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListX2 = r1.d.x(context3, typedArrayH, 11);
        if (fVar.f2217C != colorStateListX2) {
            fVar.f2217C = colorStateListX2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayH.getDimension(19, 0.0f);
        if (fVar.f2219D != dimension) {
            fVar.f2219D = dimension;
            fVar.invalidateSelf();
            fVar.B();
        }
        if (typedArrayH.hasValue(12)) {
            fVar.H(typedArrayH.getDimension(12, 0.0f));
        }
        fVar.M(r1.d.x(context3, typedArrayH, 22));
        fVar.N(typedArrayH.getDimension(23, 0.0f));
        fVar.W(r1.d.x(context3, typedArrayH, 36));
        String text = typedArrayH.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(fVar.f2227I, text);
        i iVar = fVar.f2258o0;
        if (!zEquals) {
            fVar.f2227I = text;
            iVar.f2799d = true;
            fVar.invalidateSelf();
            fVar.B();
        }
        U1.d dVar = (!typedArrayH.hasValue(0) || (resourceId3 = typedArrayH.getResourceId(0, 0)) == 0) ? null : new U1.d(context3, resourceId3);
        dVar.f3309k = typedArrayH.getDimension(1, dVar.f3309k);
        iVar.b(dVar, context3);
        int i = typedArrayH.getInt(3, 0);
        if (i == 1) {
            fVar.f2223F0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.f2223F0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.f2223F0 = TextUtils.TruncateAt.END;
        }
        fVar.L(typedArrayH.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.L(typedArrayH.getBoolean(15, false));
        }
        fVar.I(r1.d.C(context3, typedArrayH, 14));
        if (typedArrayH.hasValue(17)) {
            fVar.K(r1.d.x(context3, typedArrayH, 17));
        }
        fVar.J(typedArrayH.getDimension(16, -1.0f));
        fVar.T(typedArrayH.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(typedArrayH.getBoolean(26, false));
        }
        fVar.O(r1.d.C(context3, typedArrayH, 25));
        fVar.S(r1.d.x(context3, typedArrayH, 30));
        fVar.Q(typedArrayH.getDimension(28, 0.0f));
        fVar.D(typedArrayH.getBoolean(6, false));
        fVar.G(typedArrayH.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.G(typedArrayH.getBoolean(8, false));
        }
        fVar.E(r1.d.C(context3, typedArrayH, 7));
        if (typedArrayH.hasValue(9)) {
            fVar.F(r1.d.x(context3, typedArrayH, 9));
        }
        fVar.f2242Y = (!typedArrayH.hasValue(39) || (resourceId2 = typedArrayH.getResourceId(39, 0)) == 0) ? null : c.a(context3, resourceId2);
        fVar.f2243Z = (!typedArrayH.hasValue(33) || (resourceId = typedArrayH.getResourceId(33, 0)) == 0) ? null : c.a(context3, resourceId);
        float dimension2 = typedArrayH.getDimension(21, 0.0f);
        if (fVar.f2244a0 != dimension2) {
            fVar.f2244a0 = dimension2;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.V(typedArrayH.getDimension(35, 0.0f));
        fVar.U(typedArrayH.getDimension(34, 0.0f));
        float dimension3 = typedArrayH.getDimension(41, 0.0f);
        if (fVar.f2247d0 != dimension3) {
            fVar.f2247d0 = dimension3;
            fVar.invalidateSelf();
            fVar.B();
        }
        float dimension4 = typedArrayH.getDimension(40, 0.0f);
        if (fVar.f2248e0 != dimension4) {
            fVar.f2248e0 = dimension4;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.R(typedArrayH.getDimension(29, 0.0f));
        fVar.P(typedArrayH.getDimension(27, 0.0f));
        float dimension5 = typedArrayH.getDimension(13, 0.0f);
        if (fVar.f2251h0 != dimension5) {
            fVar.f2251h0 = dimension5;
            fVar.invalidateSelf();
            fVar.B();
        }
        fVar.f2226H0 = typedArrayH.getDimensionPixelSize(4, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        typedArrayH.recycle();
        k.a(context2, attributeSet, 2130903237, 2131952643);
        k.b(context2, attributeSet, iArr, 2130903237, 2131952643, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130903237, 2131952643);
        this.f5914r = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f5916t = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        WeakHashMap weakHashMap = S.f2363a;
        fVar.l(H.i(this));
        k.a(context2, attributeSet, 2130903237, 2131952643);
        k.b(context2, attributeSet, iArr, 2130903237, 2131952643, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, 2130903237, 2131952643);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f5918v = new d(this, this);
        f();
        if (!zHasValue) {
            setOutlineProvider(new K1.c(this));
        }
        setChecked(this.f5910n);
        setText(fVar.f2227I);
        setEllipsize(fVar.f2223F0);
        i();
        if (!this.f5905e.f2224G0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f5914r) {
            setMinHeight(this.f5916t);
        }
        this.f5915s = C.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f2207a.f5909m;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f5921y;
        rectF.setEmpty();
        if (d() && this.f5908l != null) {
            f fVar = this.f5905e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.Z()) {
                float f2 = fVar.f2251h0 + fVar.f2250g0 + fVar.f2237S + fVar.f2249f0 + fVar.f2248e0;
                if (E.c.a(fVar) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f5920x;
        rect.set(i, i5, i6, i7);
        return rect;
    }

    private U1.d getTextAppearance() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2258o0.f2801f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f5912p != z4) {
            this.f5912p = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f5911o != z4) {
            this.f5911o = z4;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.f5916t = i;
        if (!this.f5914r) {
            InsetDrawable insetDrawable = this.f5906f;
            if (insetDrawable == null) {
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f5906f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f5905e.f2219D));
        int iMax2 = Math.max(0, i - this.f5905e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f5906f;
            if (insetDrawable2 == null) {
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f5906f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    g();
                    return;
                }
                return;
            }
        }
        int i5 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i6 = iMax > 0 ? iMax / 2 : 0;
        if (this.f5906f != null) {
            Rect rect = new Rect();
            this.f5906f.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f5906f = new InsetDrawable((Drawable) this.f5905e, i5, i6, i5, i6);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r1 = this;
            K1.f r1 = r1.f5905e
            if (r1 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r1.f2234P
            if (r1 == 0) goto Le
            boolean r0 = r1 instanceof E.h
            if (r0 == 0) goto Lf
            E.h r1 = (E.h) r1
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d():boolean");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f5919w ? super.dispatchHoverEvent(motionEvent) : this.f5918v.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f5919w
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            K1.d r0 = r9.f5918v
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r1 == r2) goto L85
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6f
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L85
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L85
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r2
            goto L49
        L55:
            r4 = r7
            goto L85
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L85
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L85
            int r1 = r0.f3397l
            if (r1 == r3) goto L6d
            r4 = 16
            boolean r1 = r0.s(r1, r4, r6)
        L6d:
            r4 = r2
            goto L85
        L6f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L85
        L7b:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L85
            boolean r4 = r0.q(r2, r6)
        L85:
            if (r4 == 0) goto L8c
            int r0 = r0.f3397l
            if (r0 == r3) goto L8c
            return r2
        L8c:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0704o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.f5905e;
        boolean zC = false;
        if (fVar != null && f.A(fVar.f2234P)) {
            f fVar2 = this.f5905e;
            ?? IsEnabled = isEnabled();
            int i5 = IsEnabled;
            if (this.f5913q) {
                i5 = IsEnabled + 1;
            }
            int i6 = i5;
            if (this.f5912p) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (this.f5911o) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (isChecked()) {
                i8 = i7 + 1;
            }
            int[] iArr = new int[i8];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f5913q) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f5912p) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f5911o) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f2218C0, iArr)) {
                fVar2.f2218C0 = iArr;
                if (fVar2.Z()) {
                    zC = fVar2.C(fVar2.getState(), iArr);
                }
            }
        }
        if (zC) {
            invalidate();
        }
    }

    public final boolean e() {
        f fVar = this.f5905e;
        return fVar != null && fVar.f2239U;
    }

    public final void f() {
        f fVar;
        if (!d() || (fVar = this.f5905e) == null || !fVar.f2233O || this.f5908l == null) {
            S.h(this, null);
            this.f5919w = false;
        } else {
            S.h(this, this.f5918v);
            this.f5919w = true;
        }
    }

    public final void g() {
        ColorStateList colorStateListValueOf = this.f5905e.f2225H;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.f5907k = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.f5905e.getClass();
        RippleDrawable rippleDrawable = this.f5907k;
        WeakHashMap weakHashMap = S.f2363a;
        B.q(this, rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5917u)) {
            return this.f5917u;
        }
        if (!e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5906f;
        return insetDrawable == null ? this.f5905e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2241W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2217C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.y());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5905e;
    }

    public float getChipEndPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2251h0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f5905e;
        if (fVar == null || (drawable = fVar.f2229K) == 0) {
            return null;
        }
        boolean z4 = drawable instanceof h;
        Drawable drawable2 = drawable;
        if (z4) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2231M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2230L;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2219D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2244a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2222F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f5905e;
        if (fVar == null || (drawable = fVar.f2234P) == 0) {
            return null;
        }
        boolean z4 = drawable instanceof h;
        Drawable drawable2 = drawable;
        if (z4) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2238T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2250g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2237S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2249f0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2236R;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2223F0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f5919w) {
            d dVar = this.f5918v;
            if (dVar.f3397l == 1 || dVar.f3396k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public c getHideMotionSpec() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2243Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2246c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2245b0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2225H;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.f5905e.f3738a.f3722a;
    }

    public c getShowMotionSpec() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2242Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2248e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f5905e;
        if (fVar != null) {
            return fVar.f2247d0;
        }
        return 0.0f;
    }

    public final void h() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f5905e) == null) {
            return;
        }
        int iX = (int) (fVar.x() + fVar.f2251h0 + fVar.f2248e0);
        f fVar2 = this.f5905e;
        int iW = (int) (fVar2.w() + fVar2.f2244a0 + fVar2.f2247d0);
        if (this.f5906f != null) {
            Rect rect = new Rect();
            this.f5906f.getPadding(rect);
            iW += rect.left;
            iX += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = S.f2363a;
        C.k(this, iW, paddingTop, iX, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        f fVar = this.f5905e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        U1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f5922z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0156x.f0(this, this.f5905e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5903B);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5904C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        if (this.f5919w) {
            d dVar = this.f5918v;
            int i5 = dVar.f3397l;
            if (i5 != Integer.MIN_VALUE) {
                dVar.j(i5);
            }
            if (z4) {
                dVar.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f5915s != i) {
            this.f5915s = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f5911o
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f5911o
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f5908l
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f5919w
            if (r0 == 0) goto L43
            K1.d r0 = r5.f5918v
            r0.x(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5917u = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5907k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0704o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5907k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0704o, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.D(z4);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.D(fVar.f2252i0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        f fVar = this.f5905e;
        if (fVar == null) {
            this.f5910n = z4;
        } else if (fVar.f2239U) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.E(r1.d.B(fVar.f2252i0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.F(l.getColorStateList(fVar.f2252i0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.G(fVar.f2252i0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2217C == colorStateList) {
            return;
        }
        fVar.f2217C = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2217C == (colorStateList = l.getColorStateList(fVar.f2252i0, i))) {
            return;
        }
        fVar.f2217C = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.H(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.H(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f5905e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.E0 = new WeakReference(null);
            }
            this.f5905e = fVar;
            fVar.f2224G0 = false;
            fVar.E0 = new WeakReference(this);
            c(this.f5916t);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2251h0 == f2) {
            return;
        }
        fVar.f2251h0 = f2;
        fVar.invalidateSelf();
        fVar.B();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        f fVar = this.f5905e;
        if (fVar != null) {
            float dimension = fVar.f2252i0.getResources().getDimension(i);
            if (fVar.f2251h0 != dimension) {
                fVar.f2251h0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.I(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.I(r1.d.B(fVar.f2252i0, i));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.J(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.J(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.K(l.getColorStateList(fVar.f2252i0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.L(fVar.f2252i0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2219D == f2) {
            return;
        }
        fVar.f2219D = f2;
        fVar.invalidateSelf();
        fVar.B();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        f fVar = this.f5905e;
        if (fVar != null) {
            float dimension = fVar.f2252i0.getResources().getDimension(i);
            if (fVar.f2219D != dimension) {
                fVar.f2219D = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2244a0 == f2) {
            return;
        }
        fVar.f2244a0 = f2;
        fVar.invalidateSelf();
        fVar.B();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        f fVar = this.f5905e;
        if (fVar != null) {
            float dimension = fVar.f2252i0.getResources().getDimension(i);
            if (fVar.f2244a0 != dimension) {
                fVar.f2244a0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.M(l.getColorStateList(fVar.f2252i0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.N(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.O(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2238T == charSequence) {
            return;
        }
        String str = K.b.f2105b;
        Locale locale = Locale.getDefault();
        int i = K.i.f2119a;
        K.b bVar = K.h.a(locale) == 1 ? K.b.f2108e : K.b.f2107d;
        bVar.getClass();
        F1.d dVar = g.f2115a;
        fVar.f2238T = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.P(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.P(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.O(r1.d.B(fVar.f2252i0, i));
        }
        f();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.Q(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.Q(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.R(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.R(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.S(l.getColorStateList(fVar.f2252i0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0704o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0704o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i5, int i6, int i7) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i5, i6, i7);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.l(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5905e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2223F0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f5914r = z4;
        c(this.f5916t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(c cVar) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2243Z = cVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2243Z = c.a(fVar.f2252i0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.U(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.U(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.V(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.V(fVar.f2252i0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(Q1.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f5905e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2226H0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5909m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5908l = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.f5905e.getClass();
        g();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.W(l.getColorStateList(fVar.f2252i0, i));
            this.f5905e.getClass();
            g();
        }
    }

    @Override // X1.x
    public void setShapeAppearanceModel(m mVar) {
        this.f5905e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(c cVar) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2242Y = cVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2242Y = c.a(fVar.f2252i0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f5905e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f2224G0 ? null : charSequence, bufferType);
        f fVar2 = this.f5905e;
        if (fVar2 == null || TextUtils.equals(fVar2.f2227I, charSequence)) {
            return;
        }
        fVar2.f2227I = charSequence;
        fVar2.f2258o0.f2799d = true;
        fVar2.invalidateSelf();
        fVar2.B();
    }

    public void setTextAppearance(U1.d dVar) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.f2258o0.b(dVar, fVar.f2252i0);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2248e0 == f2) {
            return;
        }
        fVar.f2248e0 = f2;
        fVar.invalidateSelf();
        fVar.B();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        f fVar = this.f5905e;
        if (fVar != null) {
            float dimension = fVar.f2252i0.getResources().getDimension(i);
            if (fVar.f2248e0 != dimension) {
                fVar.f2248e0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        f fVar = this.f5905e;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            i iVar = fVar.f2258o0;
            U1.d dVar = iVar.f2801f;
            if (dVar != null) {
                dVar.f3309k = fApplyDimension;
                iVar.f2796a.setTextSize(fApplyDimension);
                fVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.f5905e;
        if (fVar == null || fVar.f2247d0 == f2) {
            return;
        }
        fVar.f2247d0 = f2;
        fVar.invalidateSelf();
        fVar.B();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        f fVar = this.f5905e;
        if (fVar != null) {
            float dimension = fVar.f2252i0.getResources().getDimension(i);
            if (fVar.f2247d0 != dimension) {
                fVar.f2247d0 = dimension;
                fVar.invalidateSelf();
                fVar.B();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.T(z4);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z4) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.G(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        f fVar = this.f5905e;
        if (fVar != null) {
            fVar.L(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f fVar = this.f5905e;
        if (fVar != null) {
            Context context2 = fVar.f2252i0;
            fVar.f2258o0.b(new U1.d(context2, i), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f5905e;
        if (fVar != null) {
            Context context = fVar.f2252i0;
            fVar.f2258o0.b(new U1.d(context, i), context);
        }
        i();
    }
}
