package J1;

import A2.C0009i;
import C.j;
import C.o;
import G0.e;
import G0.f;
import N2.AbstractC0156x;
import Q1.k;
import S1.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import c2.AbstractC0336a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0704o;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J1\b.smali */
public final class b extends C0704o {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2072C = {2130904020};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2073D = {2130904019};

    /* renamed from: E, reason: collision with root package name */
    public static final int[][] f2074E = {new int[]{R.attr.state_enabled, 2130904019}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: F, reason: collision with root package name */
    public static final int f2075F = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A, reason: collision with root package name */
    public final f f2076A;

    /* renamed from: B, reason: collision with root package name */
    public final c f2077B;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2078e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2079f;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2080k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2081l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2082m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2083n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f2084o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2085p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2086q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2087r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2088s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f2089t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f2090u;

    /* renamed from: v, reason: collision with root package name */
    public int f2091v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f2092w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2093x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f2094y;

    /* renamed from: z, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2095z;

    public b(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130903207, 2131952653), attributeSet, 2130903207);
        this.f2078e = new LinkedHashSet();
        this.f2079f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = o.f1060a;
        Drawable drawableA = j.a(resources, 2131165393, theme);
        fVar.f1757a = drawableA;
        drawableA.setCallback(fVar.f1756f);
        new e(fVar.f1757a.getConstantState());
        this.f2076A = fVar;
        this.f2077B = new c(this, 2);
        Context context3 = getContext();
        this.f2085p = Q.c.a(this);
        this.f2088s = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = A1.a.f59t;
        k.a(context3, attributeSet, 2130903207, 2131952653);
        k.b(context3, attributeSet, iArr, 2130903207, 2131952653, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, 2130903207, 2131952653);
        C0009i c0009i = new C0009i(16, context3, typedArrayObtainStyledAttributes);
        this.f2086q = c0009i.I(2);
        if (this.f2085p != null && p1.b.P(context3, 2130903603, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f2075F && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f2085p = d.B(context3, 2131165392);
                this.f2087r = true;
                if (this.f2086q == null) {
                    this.f2086q = d.B(context3, 2131165394);
                }
            }
        }
        this.f2089t = d.w(context3, c0009i, 3);
        this.f2090u = k.i(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2081l = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f2082m = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f2083n = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f2084o = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0009i.e0();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f2091v;
        return i == 1 ? getResources().getString(2131886384) : i == 0 ? getResources().getString(2131886386) : getResources().getString(2131886385);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2080k == null) {
            int I4 = AbstractC0156x.I(this, 2130903272);
            int I5 = AbstractC0156x.I(this, 2130903275);
            int I6 = AbstractC0156x.I(this, 2130903314);
            int I7 = AbstractC0156x.I(this, 2130903291);
            this.f2080k = new ColorStateList(f2074E, new int[]{AbstractC0156x.Q(I6, I5, 1.0f), AbstractC0156x.Q(I6, I4, 1.0f), AbstractC0156x.Q(I6, I7, 0.54f), AbstractC0156x.Q(I6, I7, 0.38f), AbstractC0156x.Q(I6, I7, 0.38f)});
        }
        return this.f2080k;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2088s;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D1.a aVar;
        Drawable drawableMutate = this.f2085p;
        ColorStateList colorStateList3 = this.f2088s;
        PorterDuff.Mode modeB = Q.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                E.b.i(drawableMutate, modeB);
            }
        }
        this.f2085p = drawableMutate;
        Drawable drawableMutate2 = this.f2086q;
        ColorStateList colorStateList4 = this.f2089t;
        PorterDuff.Mode mode = this.f2090u;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                E.b.i(drawableMutate2, mode);
            }
        }
        this.f2086q = drawableMutate2;
        if (this.f2087r) {
            f fVar = this.f2076A;
            if (fVar != null) {
                Drawable drawable = fVar.f1757a;
                c cVar = this.f2077B;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f2939a == null) {
                        cVar.f2939a = new G0.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f2939a);
                }
                ArrayList arrayList = fVar.f1755e;
                G0.d dVar = fVar.f1752b;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f1755e.size() == 0 && (aVar = fVar.f1754d) != null) {
                        dVar.f1748b.removeListener(aVar);
                        fVar.f1754d = null;
                    }
                }
                Drawable drawable2 = fVar.f1757a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f2939a == null) {
                        cVar.f2939a = new G0.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f2939a);
                } else if (cVar != null) {
                    if (fVar.f1755e == null) {
                        fVar.f1755e = new ArrayList();
                    }
                    if (!fVar.f1755e.contains(cVar)) {
                        fVar.f1755e.add(cVar);
                        if (fVar.f1754d == null) {
                            fVar.f1754d = new D1.a(fVar, 2);
                        }
                        dVar.f1748b.addListener(fVar.f1754d);
                    }
                }
            }
            Drawable drawable3 = this.f2085p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(2131230871, 2131231328, fVar, false);
                ((AnimatedStateListDrawable) this.f2085p).addTransition(2131230977, 2131231328, fVar, false);
            }
        }
        Drawable drawable4 = this.f2085p;
        if (drawable4 != null && (colorStateList2 = this.f2088s) != null) {
            E.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f2086q;
        if (drawable5 != null && (colorStateList = this.f2089t) != null) {
            E.b.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f2085p;
        Drawable drawable7 = this.f2086q;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f2085p;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2086q;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2089t;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2090u;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2088s;
    }

    public int getCheckedState() {
        return this.f2091v;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2084o;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f2091v == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2081l && this.f2088s == null && this.f2089t == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2072C);
        }
        if (this.f2083n) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2073D);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i6 = iArrOnCreateDrawableState[i5];
            if (i6 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i6 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i5] = 16842912;
                break;
            }
            i5++;
        }
        this.f2092w = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f2082m || !TextUtils.isEmpty(getText()) || (drawableA = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (k.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            E.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f2083n) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f2084o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f2071a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2071a = getCheckedState();
        return aVar;
    }

    @Override // l.C0704o, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.B(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2086q = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.B(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2089t == colorStateList) {
            return;
        }
        this.f2089t = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2090u == mode) {
            return;
        }
        this.f2090u = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2088s == colorStateList) {
            return;
        }
        this.f2088s = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f2082m = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2091v != i) {
            this.f2091v = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f2094y == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f2093x) {
                return;
            }
            this.f2093x = true;
            LinkedHashSet linkedHashSet = this.f2079f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f2091v != 2 && (onCheckedChangeListener = this.f2095z) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f2093x = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2084o = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f2083n == z4) {
            return;
        }
        this.f2083n = z4;
        refreshDrawableState();
        Iterator it = this.f2078e.iterator();
        if (it.hasNext()) {
            B.a.p(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2095z = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f2094y = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f2081l = z4;
        if (z4) {
            Q.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.b.c(this, (ColorStateList) null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0704o, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f2085p = drawable;
        this.f2087r = false;
        a();
    }
}
