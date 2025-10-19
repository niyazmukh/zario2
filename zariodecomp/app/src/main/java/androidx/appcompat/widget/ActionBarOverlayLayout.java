package androidx.appcompat.widget;

import M.B;
import M.F;
import M.H;
import M.InterfaceC0129o;
import M.InterfaceC0130p;
import M.S;
import M.k0;
import M.l0;
import M.m0;
import M.q;
import M.s0;
import M.u0;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import j.k;
import java.util.WeakHashMap;
import k.l;
import k.x;
import l.C0683d;
import l.C0693i;
import l.InterfaceC0681c;
import l.InterfaceC0688f0;
import l.InterfaceC0690g0;
import l.RunnableC0679b;
import l.a1;
import l.f1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\ActionBarOverlayLayout.smali */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0688f0, InterfaceC0129o, InterfaceC0130p {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f4172F = {2130903044, R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public ViewPropertyAnimator f4173A;

    /* renamed from: B, reason: collision with root package name */
    public final D1.a f4174B;

    /* renamed from: C, reason: collision with root package name */
    public final RunnableC0679b f4175C;

    /* renamed from: D, reason: collision with root package name */
    public final RunnableC0679b f4176D;

    /* renamed from: E, reason: collision with root package name */
    public final q f4177E;

    /* renamed from: a, reason: collision with root package name */
    public int f4178a;

    /* renamed from: b, reason: collision with root package name */
    public int f4179b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f4180c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f4181d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0690g0 f4182e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4183f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4184k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4185l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4186m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4187n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4188o;

    /* renamed from: p, reason: collision with root package name */
    public int f4189p;

    /* renamed from: q, reason: collision with root package name */
    public int f4190q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f4191r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f4192s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f4193t;

    /* renamed from: u, reason: collision with root package name */
    public u0 f4194u;

    /* renamed from: v, reason: collision with root package name */
    public u0 f4195v;

    /* renamed from: w, reason: collision with root package name */
    public u0 f4196w;

    /* renamed from: x, reason: collision with root package name */
    public u0 f4197x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0681c f4198y;

    /* renamed from: z, reason: collision with root package name */
    public OverScroller f4199z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4179b = 0;
        this.f4191r = new Rect();
        this.f4192s = new Rect();
        this.f4193t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        u0 u0Var = u0.f2426b;
        this.f4194u = u0Var;
        this.f4195v = u0Var;
        this.f4196w = u0Var;
        this.f4197x = u0Var;
        this.f4174B = new D1.a(this, 6);
        this.f4175C = new RunnableC0679b(this, 0);
        this.f4176D = new RunnableC0679b(this, 1);
        i(context);
        this.f4177E = new q();
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        C0683d c0683d = (C0683d) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0683d).leftMargin;
        int i5 = rect.left;
        if (i != i5) {
            ((ViewGroup.MarginLayoutParams) c0683d).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0683d).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0683d).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c0683d).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c0683d).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) c0683d).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c0683d).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // M.InterfaceC0129o
    public final void a(View view, View view2, int i, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // M.InterfaceC0129o
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // M.InterfaceC0129o
    public final void c(View view, int i, int i5, int[] iArr, int i6) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0683d;
    }

    @Override // M.InterfaceC0130p
    public final void d(View view, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f4183f == null || this.f4184k) {
            return;
        }
        if (this.f4181d.getVisibility() == 0) {
            translationY = (int) (this.f4181d.getTranslationY() + this.f4181d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f4183f.setBounds(0, translationY, getWidth(), this.f4183f.getIntrinsicHeight() + translationY);
        this.f4183f.draw(canvas);
    }

    @Override // M.InterfaceC0129o
    public final void e(View view, int i, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i, i5, i6, i7);
        }
    }

    @Override // M.InterfaceC0129o
    public final boolean f(View view, View view2, int i, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0683d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0683d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4181d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.f4177E;
        return qVar.f2419b | qVar.f2418a;
    }

    public CharSequence getTitle() {
        k();
        return ((f1) this.f4182e).f8574a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4175C);
        removeCallbacks(this.f4176D);
        ViewPropertyAnimator viewPropertyAnimator = this.f4173A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4172F);
        this.f4178a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4183f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4184k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f4199z = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((f1) this.f4182e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((f1) this.f4182e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0690g0 wrapper;
        if (this.f4180c == null) {
            this.f4180c = (ContentFrameLayout) findViewById(2131230770);
            this.f4181d = (ActionBarContainer) findViewById(2131230771);
            KeyEvent.Callback callbackFindViewById = findViewById(2131230769);
            if (callbackFindViewById instanceof InterfaceC0690g0) {
                wrapper = (InterfaceC0690g0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4182e = wrapper;
        }
    }

    public final void l(l lVar, x xVar) {
        k();
        f1 f1Var = (f1) this.f4182e;
        C0693i c0693i = f1Var.f8584m;
        Toolbar toolbar = f1Var.f8574a;
        if (c0693i == null) {
            f1Var.f8584m = new C0693i(toolbar.getContext());
        }
        C0693i c0693i2 = f1Var.f8584m;
        c0693i2.f8598e = xVar;
        if (lVar == null && toolbar.f4287a == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f4287a.f4204t;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f4280O);
            lVar2.r(toolbar.f4281P);
        }
        if (toolbar.f4281P == null) {
            toolbar.f4281P = new a1(toolbar);
        }
        c0693i2.f8610u = true;
        if (lVar != null) {
            lVar.b(c0693i2, toolbar.f4296n);
            lVar.b(toolbar.f4281P, toolbar.f4296n);
        } else {
            c0693i2.g(toolbar.f4296n, null);
            toolbar.f4281P.g(toolbar.f4296n, null);
            c0693i2.i();
            toolbar.f4281P.i();
        }
        toolbar.f4287a.setPopupTheme(toolbar.f4297o);
        toolbar.f4287a.setPresenter(c0693i2);
        toolbar.f4280O = c0693i2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        u0 u0VarF = u0.f(this, windowInsets);
        boolean zG = g(this.f4181d, new Rect(u0VarF.b(), u0VarF.d(), u0VarF.c(), u0VarF.a()), false);
        WeakHashMap weakHashMap = S.f2363a;
        Rect rect = this.f4191r;
        H.b(this, u0VarF, rect);
        int i = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        s0 s0Var = u0VarF.f2427a;
        u0 u0VarL = s0Var.l(i, i5, i6, i7);
        this.f4194u = u0VarL;
        boolean z4 = true;
        if (!this.f4195v.equals(u0VarL)) {
            this.f4195v = this.f4194u;
            zG = true;
        }
        Rect rect2 = this.f4192s;
        if (rect2.equals(rect)) {
            z4 = zG;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return s0Var.a().f2427a.c().f2427a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f2363a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0683d c0683d = (C0683d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c0683d).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c0683d).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f4181d, i, 0, i5, 0);
        C0683d c0683d = (C0683d) this.f4181d.getLayoutParams();
        int iMax = Math.max(0, this.f4181d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0683d).leftMargin + ((ViewGroup.MarginLayoutParams) c0683d).rightMargin);
        int iMax2 = Math.max(0, this.f4181d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0683d).topMargin + ((ViewGroup.MarginLayoutParams) c0683d).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4181d.getMeasuredState());
        WeakHashMap weakHashMap = S.f2363a;
        boolean z4 = (B.g(this) & 256) != 0;
        if (z4) {
            measuredHeight = this.f4178a;
            if (this.f4186m && this.f4181d.getTabContainer() != null) {
                measuredHeight += this.f4178a;
            }
        } else {
            measuredHeight = this.f4181d.getVisibility() != 8 ? this.f4181d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4191r;
        Rect rect2 = this.f4193t;
        rect2.set(rect);
        u0 u0Var = this.f4194u;
        this.f4196w = u0Var;
        if (this.f4185l || z4) {
            D.c cVarB = D.c.b(u0Var.b(), this.f4196w.d() + measuredHeight, this.f4196w.c(), this.f4196w.a());
            u0 u0Var2 = this.f4196w;
            m0 l0Var = Build.VERSION.SDK_INT >= 30 ? new l0(u0Var2) : new k0(u0Var2);
            l0Var.f(cVarB);
            this.f4196w = l0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f4196w = u0Var.f2427a.l(0, measuredHeight, 0, 0);
        }
        g(this.f4180c, rect2, true);
        if (!this.f4197x.equals(this.f4196w)) {
            u0 u0Var3 = this.f4196w;
            this.f4197x = u0Var3;
            ContentFrameLayout contentFrameLayout = this.f4180c;
            WindowInsets windowInsetsE = u0Var3.e();
            if (windowInsetsE != null) {
                WindowInsets windowInsetsA = F.a(contentFrameLayout, windowInsetsE);
                if (!windowInsetsA.equals(windowInsetsE)) {
                    u0.f(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.f4180c, i, 0, i5, 0);
        C0683d c0683d2 = (C0683d) this.f4180c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4180c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0683d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0683d2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4180c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0683d2).topMargin + ((ViewGroup.MarginLayoutParams) c0683d2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4180c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z4) {
        if (!this.f4187n || !z4) {
            return false;
        }
        this.f4199z.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.f4199z.getFinalY() > this.f4181d.getHeight()) {
            h();
            this.f4176D.run();
        } else {
            h();
            this.f4175C.run();
        }
        this.f4188o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        int i8 = this.f4189p + i5;
        this.f4189p = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g.H h;
        k kVar;
        this.f4177E.f2418a = i;
        this.f4189p = getActionBarHideOffset();
        h();
        InterfaceC0681c interfaceC0681c = this.f4198y;
        if (interfaceC0681c == null || (kVar = (h = (g.H) interfaceC0681c).f7152x) == null) {
            return;
        }
        kVar.a();
        h.f7152x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4181d.getVisibility() != 0) {
            return false;
        }
        return this.f4187n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4187n || this.f4188o) {
            return;
        }
        if (this.f4189p <= this.f4181d.getHeight()) {
            h();
            postDelayed(this.f4175C, 600L);
        } else {
            h();
            postDelayed(this.f4176D, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i5 = this.f4190q ^ i;
        this.f4190q = i;
        boolean z4 = (i & 4) == 0;
        boolean z5 = (i & 256) != 0;
        InterfaceC0681c interfaceC0681c = this.f4198y;
        if (interfaceC0681c != null) {
            g.H h = (g.H) interfaceC0681c;
            h.f7148t = !z5;
            if (z4 || !z5) {
                if (h.f7149u) {
                    h.f7149u = false;
                    h.c0(true);
                }
            } else if (!h.f7149u) {
                h.f7149u = true;
                h.c0(true);
            }
        }
        if ((i5 & 256) == 0 || this.f4198y == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f2363a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4179b = i;
        InterfaceC0681c interfaceC0681c = this.f4198y;
        if (interfaceC0681c != null) {
            ((g.H) interfaceC0681c).f7147s = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f4181d.setTranslationY(-Math.max(0, Math.min(i, this.f4181d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0681c interfaceC0681c) {
        this.f4198y = interfaceC0681c;
        if (getWindowToken() != null) {
            ((g.H) this.f4198y).f7147s = this.f4179b;
            int i = this.f4190q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f2363a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f4186m = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f4187n) {
            this.f4187n = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        f1 f1Var = (f1) this.f4182e;
        f1Var.f8577d = i != 0 ? r1.d.B(f1Var.f8574a.getContext(), i) : null;
        f1Var.c();
    }

    public void setLogo(int i) {
        k();
        f1 f1Var = (f1) this.f4182e;
        f1Var.f8578e = i != 0 ? r1.d.B(f1Var.f8574a.getContext(), i) : null;
        f1Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f4185l = z4;
        this.f4184k = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0688f0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((f1) this.f4182e).f8582k = callback;
    }

    @Override // l.InterfaceC0688f0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        f1 f1Var = (f1) this.f4182e;
        if (f1Var.f8580g) {
            return;
        }
        f1Var.h = charSequence;
        if ((f1Var.f8575b & 8) != 0) {
            Toolbar toolbar = f1Var.f8574a;
            toolbar.setTitle(charSequence);
            if (f1Var.f8580g) {
                S.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0683d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        f1 f1Var = (f1) this.f4182e;
        f1Var.f8577d = drawable;
        f1Var.c();
    }
}
