package androidx.appcompat.widget;

import X1.e;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.f;
import g1.i;
import k.InterfaceC0637A;
import k.k;
import k.n;
import l.AbstractC0712s0;
import l.C0685e;
import l.C0691h;
import l.C0693i;
import l.C0697k;
import l.C0710r0;
import l.InterfaceC0695j;
import l.j1;
import l.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ActionMenuView.smali */
public class ActionMenuView extends AbstractC0712s0 implements k, InterfaceC0637A {

    /* renamed from: A, reason: collision with root package name */
    public int f4200A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4201B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4202C;

    /* renamed from: D, reason: collision with root package name */
    public l f4203D;

    /* renamed from: t, reason: collision with root package name */
    public k.l f4204t;

    /* renamed from: u, reason: collision with root package name */
    public Context f4205u;

    /* renamed from: v, reason: collision with root package name */
    public int f4206v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4207w;

    /* renamed from: x, reason: collision with root package name */
    public C0693i f4208x;

    /* renamed from: y, reason: collision with root package name */
    public i f4209y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4210z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4201B = (int) (56.0f * f2);
        this.f4202C = (int) (f2 * 4.0f);
        this.f4205u = context;
        this.f4206v = 0;
    }

    public static C0697k l() {
        C0697k c0697k = new C0697k(-2, -2);
        c0697k.f8621a = false;
        ((LinearLayout.LayoutParams) c0697k).gravity = 16;
        return c0697k;
    }

    public static C0697k m(ViewGroup.LayoutParams layoutParams) {
        C0697k c0697k;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof C0697k) {
            C0697k c0697k2 = (C0697k) layoutParams;
            c0697k = new C0697k(c0697k2);
            c0697k.f8621a = c0697k2.f8621a;
        } else {
            c0697k = new C0697k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0697k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0697k).gravity = 16;
        }
        return c0697k;
    }

    public final boolean a(n nVar) {
        return this.f4204t.q(nVar, null, 0);
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0697k;
    }

    @Override // k.InterfaceC0637A
    public final void d(k.l lVar) {
        this.f4204t = lVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4204t == null) {
            Context context = getContext();
            k.l lVar = new k.l(context);
            this.f4204t = lVar;
            lVar.f8222e = new i(this, 20);
            C0693i c0693i = new C0693i(context);
            this.f4208x = c0693i;
            c0693i.f8605p = true;
            c0693i.f8606q = true;
            c0693i.f8598e = new e();
            this.f4204t.b(c0693i, this.f4205u);
            C0693i c0693i2 = this.f4208x;
            c0693i2.f8601l = this;
            this.f4204t = c0693i2.f8596c;
        }
        return this.f4204t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0693i c0693i = this.f4208x;
        C0691h c0691h = c0693i.f8602m;
        if (c0691h != null) {
            return c0691h.getDrawable();
        }
        if (c0693i.f8604o) {
            return c0693i.f8603n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4206v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0712s0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0710r0 generateDefaultLayoutParams() {
        return l();
    }

    @Override // l.AbstractC0712s0
    /* renamed from: i */
    public final C0710r0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0697k(getContext(), attributeSet);
    }

    @Override // l.AbstractC0712s0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0710r0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0695j)) {
            zA = ((InterfaceC0695j) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0695j)) ? zA : zA | ((InterfaceC0695j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0693i c0693i = this.f4208x;
        if (c0693i != null) {
            c0693i.i();
            if (this.f4208x.j()) {
                this.f4208x.f();
                this.f4208x.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0693i c0693i = this.f4208x;
        if (c0693i != null) {
            c0693i.f();
            C0685e c0685e = c0693i.f8613x;
            if (c0685e == null || !c0685e.b()) {
                return;
            }
            c0685e.i.dismiss();
        }
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f4210z) {
            super.onLayout(z4, i, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zA = j1.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0697k c0697k = (C0697k) childAt.getLayoutParams();
                if (c0697k.f8621a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0697k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0697k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0697k).leftMargin) + ((LinearLayout.LayoutParams) c0697k).rightMargin;
                    n(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0697k c0697k2 = (C0697k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0697k2.f8621a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0697k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0697k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0697k c0697k3 = (C0697k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0697k3.f8621a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) c0697k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0697k3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0712s0, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        ?? r42;
        int i11;
        int i12;
        int i13;
        k.l lVar;
        boolean z6 = this.f4210z;
        boolean z7 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4210z = z7;
        if (z6 != z7) {
            this.f4200A = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4210z && (lVar = this.f4204t) != null && size != this.f4200A) {
            this.f4200A = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4210z || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C0697k c0697k = (C0697k) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) c0697k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0697k).leftMargin = 0;
            }
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f4201B;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        boolean z8 = false;
        int i22 = 0;
        long j5 = 0;
        while (true) {
            i6 = this.f4202C;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = i15;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i25 = i20 + 1;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C0697k c0697k2 = (C0697k) childAt.getLayoutParams();
                c0697k2.f8626f = false;
                c0697k2.f8623c = 0;
                c0697k2.f8622b = 0;
                c0697k2.f8624d = false;
                ((LinearLayout.LayoutParams) c0697k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0697k2).rightMargin = 0;
                c0697k2.f8625e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c0697k2.f8621a ? 1 : i17;
                C0697k c0697k3 = (C0697k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i26 <= 0 || (z10 && i26 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z10 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c0697k3.f8624d = !c0697k3.f8621a && z10;
                c0697k3.f8622b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i13);
                if (c0697k2.f8624d) {
                    i22++;
                }
                if (c0697k2.f8621a) {
                    z8 = true;
                }
                i17 -= i13;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j5 |= 1 << i21;
                }
                i20 = i25;
            }
            i21++;
            size3 = i23;
            i15 = i24;
            paddingBottom = i12;
            mode = i11;
        }
        int i27 = mode;
        int i28 = i15;
        int i29 = size3;
        boolean z11 = z8 && i20 == 2;
        boolean z12 = false;
        while (i22 > 0 && i17 > 0) {
            int i30 = f.API_PRIORITY_OTHER;
            int i31 = 0;
            int i32 = 0;
            long j6 = 0;
            while (i32 < childCount2) {
                C0697k c0697k4 = (C0697k) getChildAt(i32).getLayoutParams();
                boolean z13 = z12;
                if (c0697k4.f8624d) {
                    int i33 = c0697k4.f8622b;
                    if (i33 < i30) {
                        j6 = 1 << i32;
                        i30 = i33;
                        i31 = 1;
                    } else if (i33 == i30) {
                        j6 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z12 = z13;
            }
            z4 = z12;
            j5 |= j6;
            if (i31 > i17) {
                break;
            }
            int i34 = i30 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C0697k c0697k5 = (C0697k) childAt2.getLayoutParams();
                int i36 = iMax;
                int i37 = childMeasureSpec;
                int i38 = childCount2;
                long j7 = 1 << i35;
                if ((j6 & j7) != 0) {
                    if (z11 && c0697k5.f8625e) {
                        r42 = 1;
                        r42 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i6 + i19, 0, i6, 0);
                        }
                    } else {
                        r42 = 1;
                    }
                    c0697k5.f8622b += r42;
                    c0697k5.f8626f = r42;
                    i17--;
                } else if (c0697k5.f8622b == i34) {
                    j5 |= j7;
                }
                i35++;
                childMeasureSpec = i37;
                iMax = i36;
                childCount2 = i38;
            }
            z12 = true;
        }
        z4 = z12;
        int i39 = iMax;
        int i40 = childMeasureSpec;
        int i41 = childCount2;
        boolean z14 = !z8 && i20 == 1;
        if (i17 <= 0 || j5 == 0 || (i17 >= i20 - 1 && !z14 && iMax2 <= 1)) {
            i7 = i41;
            z5 = z4;
        } else {
            float fBitCount = Long.bitCount(j5);
            if (!z14) {
                if ((j5 & 1) != 0 && !((C0697k) getChildAt(0).getLayoutParams()).f8625e) {
                    fBitCount -= 0.5f;
                }
                int i42 = i41 - 1;
                if ((j5 & (1 << i42)) != 0 && !((C0697k) getChildAt(i42).getLayoutParams()).f8625e) {
                    fBitCount -= 0.5f;
                }
            }
            int i43 = fBitCount > 0.0f ? (int) ((i17 * i19) / fBitCount) : 0;
            boolean z15 = z4;
            i7 = i41;
            for (int i44 = 0; i44 < i7; i44++) {
                if ((j5 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    C0697k c0697k6 = (C0697k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0697k6.f8623c = i43;
                        c0697k6.f8626f = true;
                        if (i44 == 0 && !c0697k6.f8625e) {
                            ((LinearLayout.LayoutParams) c0697k6).leftMargin = (-i43) / 2;
                        }
                        z15 = true;
                    } else {
                        if (c0697k6.f8621a) {
                            c0697k6.f8623c = i43;
                            c0697k6.f8626f = true;
                            ((LinearLayout.LayoutParams) c0697k6).rightMargin = (-i43) / 2;
                            z15 = true;
                        } else {
                            if (i44 != 0) {
                                ((LinearLayout.LayoutParams) c0697k6).leftMargin = i43 / 2;
                            }
                            if (i44 != i7 - 1) {
                                ((LinearLayout.LayoutParams) c0697k6).rightMargin = i43 / 2;
                            }
                        }
                    }
                }
            }
            z5 = z15;
        }
        if (z5) {
            int i45 = 0;
            while (i45 < i7) {
                View childAt4 = getChildAt(i45);
                C0697k c0697k7 = (C0697k) childAt4.getLayoutParams();
                if (c0697k7.f8626f) {
                    i10 = i40;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0697k7.f8622b * i19) + c0697k7.f8623c, 1073741824), i10);
                } else {
                    i10 = i40;
                }
                i45++;
                i40 = i10;
            }
        }
        if (i27 != 1073741824) {
            i9 = i28;
            i8 = i39;
        } else {
            i8 = i29;
            i9 = i28;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f4208x.f8610u = z4;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.f4203D = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0693i c0693i = this.f4208x;
        C0691h c0691h = c0693i.f8602m;
        if (c0691h != null) {
            c0691h.setImageDrawable(drawable);
        } else {
            c0693i.f8604o = true;
            c0693i.f8603n = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f4207w = z4;
    }

    public void setPopupTheme(int i) {
        if (this.f4206v != i) {
            this.f4206v = i;
            if (i == 0) {
                this.f4205u = getContext();
            } else {
                this.f4205u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0693i c0693i) {
        this.f4208x = c0693i;
        c0693i.f8601l = this;
        this.f4204t = c0693i.f8596c;
    }

    @Override // l.AbstractC0712s0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0697k(getContext(), attributeSet);
    }
}
