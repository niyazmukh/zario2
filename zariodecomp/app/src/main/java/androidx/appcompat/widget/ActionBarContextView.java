package androidx.appcompat.widget;

import M.B;
import M.S;
import M.X;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.n;
import f.AbstractC0489a;
import h2.C0593b;
import j.AbstractC0616a;
import java.util.WeakHashMap;
import k.InterfaceC0637A;
import k.l;
import l.C0685e;
import l.C0693i;
import l.j1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ActionBarContextView.smali */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0593b f4152a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4153b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f4154c;

    /* renamed from: d, reason: collision with root package name */
    public C0693i f4155d;

    /* renamed from: e, reason: collision with root package name */
    public int f4156e;

    /* renamed from: f, reason: collision with root package name */
    public X f4157f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4159l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f4160m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f4161n;

    /* renamed from: o, reason: collision with root package name */
    public View f4162o;

    /* renamed from: p, reason: collision with root package name */
    public View f4163p;

    /* renamed from: q, reason: collision with root package name */
    public View f4164q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f4165r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f4166s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f4167t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4168u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4169v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4170w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4171x;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 2130903069);
        this.f4152a = new C0593b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130903043, typedValue, true) || typedValue.resourceId == 0) {
            this.f4153b = context;
        } else {
            this.f4153b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6965d, 2130903069, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : r1.d.B(context, resourceId);
        WeakHashMap weakHashMap = S.f2363a;
        B.q(this, drawable);
        this.f4168u = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f4169v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f4156e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4171x = typedArrayObtainStyledAttributes.getResourceId(2, 2131427333);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i5);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i - measuredWidth, i7, i, measuredHeight + i7);
        } else {
            view.layout(i, i7, i + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0616a abstractC0616a) {
        View view = this.f4162o;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4171x, (ViewGroup) this, false);
            this.f4162o = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f4162o);
        }
        View viewFindViewById = this.f4162o.findViewById(2131230797);
        this.f4163p = viewFindViewById;
        viewFindViewById.setOnClickListener(new n(abstractC0616a, 2));
        l lVarC = abstractC0616a.c();
        C0693i c0693i = this.f4155d;
        if (c0693i != null) {
            c0693i.f();
            C0685e c0685e = c0693i.f8613x;
            if (c0685e != null && c0685e.b()) {
                c0685e.i.dismiss();
            }
        }
        C0693i c0693i2 = new C0693i(getContext());
        this.f4155d = c0693i2;
        c0693i2.f8605p = true;
        c0693i2.f8606q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarC.b(this.f4155d, this.f4153b);
        C0693i c0693i3 = this.f4155d;
        InterfaceC0637A interfaceC0637A = c0693i3.f8601l;
        if (interfaceC0637A == null) {
            InterfaceC0637A interfaceC0637A2 = (InterfaceC0637A) c0693i3.f8597d.inflate(c0693i3.f8599f, (ViewGroup) this, false);
            c0693i3.f8601l = interfaceC0637A2;
            interfaceC0637A2.d(c0693i3.f8596c);
            c0693i3.i();
        }
        InterfaceC0637A interfaceC0637A3 = c0693i3.f8601l;
        if (interfaceC0637A != interfaceC0637A3) {
            ((ActionMenuView) interfaceC0637A3).setPresenter(c0693i3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0637A3;
        this.f4154c = actionMenuView;
        WeakHashMap weakHashMap = S.f2363a;
        B.q(actionMenuView, null);
        addView(this.f4154c, layoutParams);
    }

    public final void d() {
        if (this.f4165r == null) {
            LayoutInflater.from(getContext()).inflate(2131427328, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4165r = linearLayout;
            this.f4166s = (TextView) linearLayout.findViewById(2131230775);
            this.f4167t = (TextView) this.f4165r.findViewById(2131230774);
            int i = this.f4168u;
            if (i != 0) {
                this.f4166s.setTextAppearance(getContext(), i);
            }
            int i5 = this.f4169v;
            if (i5 != 0) {
                this.f4167t.setTextAppearance(getContext(), i5);
            }
        }
        this.f4166s.setText(this.f4160m);
        this.f4167t.setText(this.f4161n);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4160m);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4161n);
        this.f4167t.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4165r.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4165r.getParent() == null) {
            addView(this.f4165r);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4164q = null;
        this.f4154c = null;
        this.f4155d = null;
        View view = this.f4163p;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f4157f != null ? this.f4152a.f7661c : getVisibility();
    }

    public int getContentHeight() {
        return this.f4156e;
    }

    public CharSequence getSubtitle() {
        return this.f4161n;
    }

    public CharSequence getTitle() {
        return this.f4160m;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            X x3 = this.f4157f;
            if (x3 != null) {
                x3.b();
            }
            super.setVisibility(i);
        }
    }

    public final X i(int i, long j5) {
        X x3 = this.f4157f;
        if (x3 != null) {
            x3.b();
        }
        C0593b c0593b = this.f4152a;
        if (i != 0) {
            X xA = S.a(this);
            xA.a(0.0f);
            xA.c(j5);
            ((ActionBarContextView) c0593b.f7662d).f4157f = xA;
            c0593b.f7661c = i;
            xA.d(c0593b);
            return xA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        X xA2 = S.a(this);
        xA2.a(1.0f);
        xA2.c(j5);
        ((ActionBarContextView) c0593b.f7662d).f4157f = xA2;
        c0593b.f7661c = i;
        xA2.d(c0593b);
        return xA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0489a.f6962a, 2130903046, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0693i c0693i = this.f4155d;
        if (c0693i != null) {
            Configuration configuration2 = c0693i.f8595b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            c0693i.f8609t = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i5 > 720) || (i > 720 && i5 > 960)) ? 5 : (i >= 500 || (i > 640 && i5 > 480) || (i > 480 && i5 > 640)) ? 4 : i >= 360 ? 3 : 2;
            l lVar = c0693i.f8596c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0693i c0693i = this.f4155d;
        if (c0693i != null) {
            c0693i.f();
            C0685e c0685e = this.f4155d.f8613x;
            if (c0685e == null || !c0685e.b()) {
                return;
            }
            c0685e.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4159l = false;
        }
        if (!this.f4159l) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4159l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4159l = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        boolean zA = j1.a(this);
        int paddingRight = zA ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4162o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4162o.getLayoutParams();
            int i8 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = zA ? paddingRight - i8 : paddingRight + i8;
            int iG = g(this.f4162o, i10, paddingTop, paddingTop2, zA) + i10;
            paddingRight = zA ? iG - i9 : iG + i9;
        }
        LinearLayout linearLayout = this.f4165r;
        if (linearLayout != null && this.f4164q == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f4165r, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.f4164q;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i6 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4154c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f4156e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4162o;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4162o.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4154c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f4154c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4165r;
        if (linearLayout != null && this.f4164q == null) {
            if (this.f4170w) {
                this.f4165r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4165r.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f4165r.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f4164q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f4164q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f4156e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4158k = false;
        }
        if (!this.f4158k) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4158k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4158k = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f4156e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4164q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4164q = view;
        if (view != null && (linearLayout = this.f4165r) != null) {
            removeView(linearLayout);
            this.f4165r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4161n = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4160m = charSequence;
        d();
        S.i(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f4170w) {
            requestLayout();
        }
        this.f4170w = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
