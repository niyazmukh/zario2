package com.google.android.material.timepicker;

import B.l;
import M.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.C1011h;
import w.C1012i;
import w.C1016m;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\ClockFaceView.smali */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final SparseArray f6193A;

    /* renamed from: B, reason: collision with root package name */
    public final c f6194B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f6195C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f6196D;

    /* renamed from: E, reason: collision with root package name */
    public final int f6197E;

    /* renamed from: F, reason: collision with root package name */
    public final int f6198F;
    public final int G;

    /* renamed from: H, reason: collision with root package name */
    public final int f6199H;

    /* renamed from: I, reason: collision with root package name */
    public final String[] f6200I;

    /* renamed from: J, reason: collision with root package name */
    public float f6201J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f6202K;

    /* renamed from: w, reason: collision with root package name */
    public final ClockHandView f6203w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f6204x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f6205y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f6206z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6204x = new Rect();
        this.f6205y = new RectF();
        this.f6206z = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f6193A = sparseArray;
        this.f6196D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1.a.f48g, 2130903771, 2131952721);
        Resources resources = getResources();
        ColorStateList colorStateListX = r1.d.x(context, typedArrayObtainStyledAttributes, 1);
        this.f6202K = colorStateListX;
        LayoutInflater.from(context).inflate(2131427404, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131231012);
        this.f6203w = clockHandView;
        this.f6197E = resources.getDimensionPixelSize(2131100211);
        int colorForState = colorStateListX.getColorForState(new int[]{R.attr.state_selected}, colorStateListX.getDefaultColor());
        this.f6195C = new int[]{colorForState, colorForState, colorStateListX.getDefaultColor()};
        clockHandView.f6209c.add(this);
        int defaultColor = l.getColorStateList(context, 2131034822).getDefaultColor();
        ColorStateList colorStateListX2 = r1.d.x(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListX2 != null ? colorStateListX2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6194B = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6200I = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i = 0; i < Math.max(this.f6200I.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f6200I.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(2131427403, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f6200I[i]);
                textView.setTag(2131231028, Integer.valueOf(i));
                int i5 = (i / 12) + 1;
                textView.setTag(2131231013, Integer.valueOf(i5));
                z4 = i5 > 1 ? true : z4;
                S.h(textView, this.f6194B);
                textView.setTextColor(this.f6202K);
            }
        }
        ClockHandView clockHandView2 = this.f6203w;
        if (clockHandView2.f6208b && !z4) {
            clockHandView2.f6219q = 1;
        }
        clockHandView2.f6208b = z4;
        clockHandView2.invalidate();
        this.f6198F = resources.getDimensionPixelSize(2131100239);
        this.G = resources.getDimensionPixelSize(2131100240);
        this.f6199H = resources.getDimensionPixelSize(2131100218);
    }

    @Override // com.google.android.material.timepicker.e
    public final void f() {
        C1016m c1016m = new C1016m();
        c1016m.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != 2131230873 && !"skip".equals(childAt.getTag())) {
                int i5 = (Integer) childAt.getTag(2131231013);
                if (i5 == null) {
                    i5 = 1;
                }
                if (!map.containsKey(i5)) {
                    map.put(i5, new ArrayList());
                }
                ((List) map.get(i5)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f6226u * 0.66f) : this.f6226u;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c1016m.f10863c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1011h());
                }
                C1012i c1012i = ((C1011h) map2.get(Integer.valueOf(id))).f10778d;
                c1012i.f10835w = 2131230873;
                c1012i.f10836x = iRound;
                c1012i.f10837y = size;
                size += 360.0f / list.size();
            }
        }
        c1016m.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f6193A;
            if (i6 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i6)).setVisibility(0);
            i6++;
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f6203w.f6213k;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f6193A;
            int size = sparseArray.size();
            rectF = this.f6205y;
            rect = this.f6204x;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i++;
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            TextView textView3 = (TextView) sparseArray.get(i5);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f6206z);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f6195C, this.f6196D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f6200I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i5) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f6199H / Math.max(Math.max(this.f6198F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
