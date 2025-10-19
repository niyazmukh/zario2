package b2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import c2.AbstractC0336a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import l.C0700m;
import l.C0725z0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\v.smali */
public final class v extends C0700m {

    /* renamed from: e, reason: collision with root package name */
    public final C0725z0 f5094e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f5095f;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f5096k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5097l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5098m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f5099n;

    /* renamed from: o, reason: collision with root package name */
    public int f5100o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f5101p;

    public v(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130903103, 0), attributeSet);
        this.f5096k = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = Q1.k.h(context2, attributeSet, A1.a.f53n, 2130903103, 2131952368, new int[0]);
        if (typedArrayH.hasValue(0) && typedArrayH.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f5097l = typedArrayH.getResourceId(3, 2131427418);
        this.f5098m = typedArrayH.getDimensionPixelOffset(1, 2131100335);
        if (typedArrayH.hasValue(2)) {
            this.f5099n = ColorStateList.valueOf(typedArrayH.getColor(2, 0));
        }
        this.f5100o = typedArrayH.getColor(4, 0);
        this.f5101p = r1.d.x(context2, typedArrayH, 5);
        this.f5095f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0725z0 c0725z0 = new C0725z0(context2, null, 2130903726);
        this.f5094e = c0725z0;
        c0725z0.f8722C = true;
        c0725z0.f8723D.setFocusable(true);
        c0725z0.f8738s = this;
        c0725z0.f8723D.setInputMethodMode(2);
        c0725z0.o(getAdapter());
        c0725z0.f8739t = new t(this, 0);
        if (typedArrayH.hasValue(6)) {
            setSimpleItems(typedArrayH.getResourceId(6, 0));
        }
        typedArrayH.recycle();
    }

    public static void a(v vVar, Object obj) {
        vVar.setText(vVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f5095f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f5094e.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f5099n;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f6128I) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f5098m;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5100o;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5101p;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f6128I && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5094e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0725z0 c0725z0 = this.f5094e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0725z0.f8723D.isShowing() ? -1 : c0725z0.f8726c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0725z0.f8723D.getBackground();
                if (background != null) {
                    Rect rect = this.f5096k;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        AccessibilityManager accessibilityManager = this.f5095f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z4);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f5094e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0725z0 c0725z0 = this.f5094e;
        if (c0725z0 != null) {
            c0725z0.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f5099n = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof X1.h) {
            ((X1.h) dropDownBackground).m(this.f5099n);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5094e.f8740u = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f5100o = i;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5101p = colorStateList;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f5095f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f5094e.f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new u(this, getContext(), this.f5097l, strArr));
    }
}
