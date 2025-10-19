package com.google.android.material.internal;

import C.j;
import C.o;
import E.b;
import G1.e;
import M.B;
import M.S;
import Q.p;
import Q1.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k.n;
import k.z;
import l.C0710r0;
import l.g1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\internal\NavigationMenuItemView.smali */
public class NavigationMenuItemView extends d implements z {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f6078K = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f6079A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6080B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f6081C;

    /* renamed from: D, reason: collision with root package name */
    public final CheckedTextView f6082D;

    /* renamed from: E, reason: collision with root package name */
    public FrameLayout f6083E;

    /* renamed from: F, reason: collision with root package name */
    public n f6084F;
    public ColorStateList G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6085H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f6086I;

    /* renamed from: J, reason: collision with root package name */
    public final e f6087J;

    /* renamed from: z, reason: collision with root package name */
    public int f6088z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6081C = true;
        e eVar = new e(this, 2);
        this.f6087J = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131427372, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131099779));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131230902);
        this.f6082D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.h(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f6083E == null) {
                this.f6083E = (FrameLayout) ((ViewStub) findViewById(2131230901)).inflate();
            }
            this.f6083E.removeAllViews();
            this.f6083E.addView(view);
        }
    }

    @Override // k.z
    public final void c(n nVar) {
        StateListDrawable stateListDrawable;
        this.f6084F = nVar;
        int i = nVar.f8246a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130903273, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6078K, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f2363a;
            B.q(this, stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f8250e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f8260q);
        g1.a(this, nVar.f8261r);
        n nVar2 = this.f6084F;
        CharSequence charSequence = nVar2.f8250e;
        CheckedTextView checkedTextView = this.f6082D;
        if (charSequence == null && nVar2.getIcon() == null && this.f6084F.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f6083E;
            if (frameLayout != null) {
                C0710r0 c0710r0 = (C0710r0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0710r0).width = -1;
                this.f6083E.setLayoutParams(c0710r0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f6083E;
        if (frameLayout2 != null) {
            C0710r0 c0710r02 = (C0710r0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0710r02).width = -2;
            this.f6083E.setLayoutParams(c0710r02);
        }
    }

    @Override // k.z
    public n getItemData() {
        return this.f6084F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        n nVar = this.f6084F;
        if (nVar != null && nVar.isCheckable() && this.f6084F.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6078K);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f6080B != z4) {
            this.f6080B = z4;
            this.f6087J.h(this.f6082D, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f6082D;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.f6081C) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f6085H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.G);
            }
            int i = this.f6088z;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f6079A) {
            if (this.f6086I == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.f1060a;
                Drawable drawableA = j.a(resources, 2131165428, theme);
                this.f6086I = drawableA;
                if (drawableA != null) {
                    int i5 = this.f6088z;
                    drawableA.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f6086I;
        }
        p.e(this.f6082D, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f6082D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f6088z = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.f6085H = colorStateList != null;
        n nVar = this.f6084F;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f6082D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f6079A = z4;
    }

    public void setTextAppearance(int i) {
        this.f6082D.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6082D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6082D.setText(charSequence);
    }
}
