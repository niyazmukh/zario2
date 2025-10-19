package com.google.android.material.snackbar;

import B1.a;
import M.C;
import M.S;
import N2.AbstractC0156x;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\snackbar\SnackbarContentLayout.smali */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f6110a;

    /* renamed from: b, reason: collision with root package name */
    public Button f6111b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f6112c;

    /* renamed from: d, reason: collision with root package name */
    public int f6113d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6112c = AbstractC0156x.e0(context, 2130903837, a.f284b);
    }

    public final boolean a(int i, int i5, int i6) {
        boolean z4;
        if (i != getOrientation()) {
            setOrientation(i);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f6110a.getPaddingTop() == i5 && this.f6110a.getPaddingBottom() == i6) {
            return z4;
        }
        TextView textView = this.f6110a;
        WeakHashMap weakHashMap = S.f2363a;
        if (C.g(textView)) {
            C.k(textView, C.f(textView), i5, C.e(textView), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f6111b;
    }

    public TextView getMessageView() {
        return this.f6110a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6110a = (TextView) findViewById(2131231179);
        this.f6111b = (Button) findViewById(2131231178);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) throws Resources.NotFoundException {
        super.onMeasure(i, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131099795);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131099794);
        Layout layout = this.f6110a.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.f6113d <= 0 || this.f6111b.getMeasuredWidth() <= this.f6113d) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i5);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f6113d = i;
    }
}
