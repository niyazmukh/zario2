package com.google.android.material.appbar;

import A1.a;
import E.b;
import M.B;
import M.H;
import M.S;
import N2.AbstractC0156x;
import Q1.k;
import X1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c2.AbstractC0336a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\appbar\MaterialToolbar.smali */
public class MaterialToolbar extends Toolbar {

    /* renamed from: d0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f5794d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: V, reason: collision with root package name */
    public Integer f5795V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5796W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f5797a0;

    /* renamed from: b0, reason: collision with root package name */
    public ImageView.ScaleType f5798b0;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f5799c0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0336a.a(context, attributeSet, 2130904178, 2131952729), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayH = k.h(context2, attributeSet, a.f64y, 2130904178, 2131952729, new int[0]);
        if (typedArrayH.hasValue(2)) {
            setNavigationIconTint(typedArrayH.getColor(2, -1));
        }
        this.f5796W = typedArrayH.getBoolean(4, false);
        this.f5797a0 = typedArrayH.getBoolean(3, false);
        int i = typedArrayH.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f5794d0;
            if (i < scaleTypeArr.length) {
                this.f5798b0 = scaleTypeArr[i];
            }
        }
        if (typedArrayH.hasValue(0)) {
            this.f5799c0 = Boolean.valueOf(typedArrayH.getBoolean(0, false));
        }
        typedArrayH.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
        if (colorStateListValueOf != null) {
            h hVar = new h();
            hVar.m(colorStateListValueOf);
            hVar.j(context2);
            WeakHashMap weakHashMap = S.f2363a;
            hVar.l(H.i(this));
            B.q(this, hVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5798b0;
    }

    public Integer getNavigationIconTint() {
        return this.f5795V;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i) {
        Menu menu = getMenu();
        boolean z4 = menu instanceof l;
        if (z4) {
            ((l) menu).w();
        }
        super.n(i);
        if (z4) {
            ((l) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof h) {
            AbstractC0156x.f0(this, (h) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i, i5, i6, i7);
        int i8 = 0;
        ImageView imageView2 = null;
        if (this.f5796W || this.f5797a0) {
            ArrayList arrayListF = k.f(this, getTitle());
            boolean zIsEmpty = arrayListF.isEmpty();
            Q1.l lVar = k.f2804c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListF, lVar);
            ArrayList arrayListF2 = k.f(this, getSubtitle());
            TextView textView2 = arrayListF2.isEmpty() ? null : (TextView) Collections.max(arrayListF2, lVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i9 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i9 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i9 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5796W && textView != null) {
                    w(textView, pair);
                }
                if (this.f5797a0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i8 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i8);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i8++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5799c0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5798b0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof h) {
            ((h) background).l(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.f5799c0;
        if (bool == null || bool.booleanValue() != z4) {
            this.f5799c0 = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5798b0 != scaleType) {
            this.f5798b0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f5795V != null) {
            drawable = drawable.mutate();
            b.g(drawable, this.f5795V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f5795V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.f5797a0 != z4) {
            this.f5797a0 = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.f5796W != z4) {
            this.f5796W = z4;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i5 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i5, textView.getBottom());
    }
}
