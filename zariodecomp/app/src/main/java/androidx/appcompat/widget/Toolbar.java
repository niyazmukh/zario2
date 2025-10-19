package androidx.appcompat.widget;

import A2.C0009i;
import B3.N;
import M.AbstractC0126l;
import M.C;
import M.M;
import M.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.datepicker.n;
import f.AbstractC0489a;
import g1.i;
import j.C0622i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.l;
import l.C0693i;
import l.C0716v;
import l.C0718w;
import l.InterfaceC0690g0;
import l.J0;
import l.Y;
import l.Y0;
import l.a1;
import l.b1;
import l.c1;
import l.d1;
import l.e1;
import l.f1;
import l.g1;
import l.j1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\appcompat\widget\Toolbar.smali */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public final int f4267A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f4268B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f4269C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4270D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f4271E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4272F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f4273H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f4274I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f4275J;

    /* renamed from: K, reason: collision with root package name */
    public final C0009i f4276K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f4277L;

    /* renamed from: M, reason: collision with root package name */
    public final K2.c f4278M;

    /* renamed from: N, reason: collision with root package name */
    public f1 f4279N;

    /* renamed from: O, reason: collision with root package name */
    public C0693i f4280O;

    /* renamed from: P, reason: collision with root package name */
    public a1 f4281P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4282Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedCallback f4283R;

    /* renamed from: S, reason: collision with root package name */
    public OnBackInvokedDispatcher f4284S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4285T;

    /* renamed from: U, reason: collision with root package name */
    public final N f4286U;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f4287a;

    /* renamed from: b, reason: collision with root package name */
    public Y f4288b;

    /* renamed from: c, reason: collision with root package name */
    public Y f4289c;

    /* renamed from: d, reason: collision with root package name */
    public C0716v f4290d;

    /* renamed from: e, reason: collision with root package name */
    public C0718w f4291e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f4292f;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f4293k;

    /* renamed from: l, reason: collision with root package name */
    public C0716v f4294l;

    /* renamed from: m, reason: collision with root package name */
    public View f4295m;

    /* renamed from: n, reason: collision with root package name */
    public Context f4296n;

    /* renamed from: o, reason: collision with root package name */
    public int f4297o;

    /* renamed from: p, reason: collision with root package name */
    public int f4298p;

    /* renamed from: q, reason: collision with root package name */
    public int f4299q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4300r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4301s;

    /* renamed from: t, reason: collision with root package name */
    public int f4302t;

    /* renamed from: u, reason: collision with root package name */
    public int f4303u;

    /* renamed from: v, reason: collision with root package name */
    public int f4304v;

    /* renamed from: w, reason: collision with root package name */
    public int f4305w;

    /* renamed from: x, reason: collision with root package name */
    public J0 f4306x;

    /* renamed from: y, reason: collision with root package name */
    public int f4307y;

    /* renamed from: z, reason: collision with root package name */
    public int f4308z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0622i(getContext());
    }

    public static b1 h() {
        b1 b1Var = new b1(-2, -2);
        b1Var.f8556b = 0;
        b1Var.f8555a = 8388627;
        return b1Var;
    }

    public static b1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof b1;
        if (z4) {
            b1 b1Var = (b1) layoutParams;
            b1 b1Var2 = new b1(b1Var);
            b1Var2.f8556b = 0;
            b1Var2.f8556b = b1Var.f8556b;
            return b1Var2;
        }
        if (z4) {
            b1 b1Var3 = new b1((b1) layoutParams);
            b1Var3.f8556b = 0;
            return b1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            b1 b1Var4 = new b1(layoutParams);
            b1Var4.f8556b = 0;
            return b1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        b1 b1Var5 = new b1(marginLayoutParams);
        b1Var5.f8556b = 0;
        ((ViewGroup.MarginLayoutParams) b1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) b1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) b1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) b1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return b1Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0126l.b(marginLayoutParams) + AbstractC0126l.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = S.f2363a;
        boolean z4 = C.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C.d(this));
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                b1 b1Var = (b1) childAt.getLayoutParams();
                if (b1Var.f8556b == 0 && u(childAt) && j(b1Var.f8555a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            b1 b1Var2 = (b1) childAt2.getLayoutParams();
            if (b1Var2.f8556b == 0 && u(childAt2) && j(b1Var2.f8555a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b1 b1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (b1) layoutParams;
        b1VarH.f8556b = 1;
        if (!z4 || this.f4295m == null) {
            addView(view, b1VarH);
        } else {
            view.setLayoutParams(b1VarH);
            this.f4274I.add(view);
        }
    }

    public final void c() {
        if (this.f4294l == null) {
            C0716v c0716v = new C0716v(getContext(), null, 2130904177);
            this.f4294l = c0716v;
            c0716v.setImageDrawable(this.f4292f);
            this.f4294l.setContentDescription(this.f4293k);
            b1 b1VarH = h();
            b1VarH.f8555a = (this.f4300r & 112) | 8388611;
            b1VarH.f8556b = 2;
            this.f4294l.setLayoutParams(b1VarH);
            this.f4294l.setOnClickListener(new n(this, 3));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b1);
    }

    public final void d() {
        if (this.f4306x == null) {
            J0 j02 = new J0();
            j02.f8461a = 0;
            j02.f8462b = 0;
            j02.f8463c = Integer.MIN_VALUE;
            j02.f8464d = Integer.MIN_VALUE;
            j02.f8465e = 0;
            j02.f8466f = 0;
            j02.f8467g = false;
            j02.h = false;
            this.f4306x = j02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f4287a;
        if (actionMenuView.f4204t == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.f4281P == null) {
                this.f4281P = new a1(this);
            }
            this.f4287a.setExpandedActionViewsExclusive(true);
            lVar.b(this.f4281P, this.f4296n);
            v();
        }
    }

    public final void f() {
        if (this.f4287a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4287a = actionMenuView;
            actionMenuView.setPopupTheme(this.f4297o);
            this.f4287a.setOnMenuItemClickListener(this.f4278M);
            ActionMenuView actionMenuView2 = this.f4287a;
            i iVar = new i(this, 21);
            actionMenuView2.getClass();
            actionMenuView2.f4209y = iVar;
            b1 b1VarH = h();
            b1VarH.f8555a = (this.f4300r & 112) | 8388613;
            this.f4287a.setLayoutParams(b1VarH);
            b(this.f4287a, false);
        }
    }

    public final void g() {
        if (this.f4290d == null) {
            this.f4290d = new C0716v(getContext(), null, 2130904177);
            b1 b1VarH = h();
            b1VarH.f8555a = (this.f4300r & 112) | 8388611;
            this.f4290d.setLayoutParams(b1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0716v c0716v = this.f4294l;
        if (c0716v != null) {
            return c0716v.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0716v c0716v = this.f4294l;
        if (c0716v != null) {
            return c0716v.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        J0 j02 = this.f4306x;
        if (j02 != null) {
            return j02.f8467g ? j02.f8461a : j02.f8462b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4308z;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        J0 j02 = this.f4306x;
        if (j02 != null) {
            return j02.f8461a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        J0 j02 = this.f4306x;
        if (j02 != null) {
            return j02.f8462b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        J0 j02 = this.f4306x;
        if (j02 != null) {
            return j02.f8467g ? j02.f8462b : j02.f8461a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4307y;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f4287a;
        return (actionMenuView == null || (lVar = actionMenuView.f4204t) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4308z, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = S.f2363a;
        return C.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = S.f2363a;
        return C.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4307y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0718w c0718w = this.f4291e;
        if (c0718w != null) {
            return c0718w.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0718w c0718w = this.f4291e;
        if (c0718w != null) {
            return c0718w.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4287a.getMenu();
    }

    public View getNavButtonView() {
        return this.f4290d;
    }

    public CharSequence getNavigationContentDescription() {
        C0716v c0716v = this.f4290d;
        if (c0716v != null) {
            return c0716v.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0716v c0716v = this.f4290d;
        if (c0716v != null) {
            return c0716v.getDrawable();
        }
        return null;
    }

    public C0693i getOuterActionMenuPresenter() {
        return this.f4280O;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4287a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4296n;
    }

    public int getPopupTheme() {
        return this.f4297o;
    }

    public CharSequence getSubtitle() {
        return this.f4269C;
    }

    public final TextView getSubtitleTextView() {
        return this.f4289c;
    }

    public CharSequence getTitle() {
        return this.f4268B;
    }

    public int getTitleMarginBottom() {
        return this.f4305w;
    }

    public int getTitleMarginEnd() {
        return this.f4303u;
    }

    public int getTitleMarginStart() {
        return this.f4302t;
    }

    public int getTitleMarginTop() {
        return this.f4304v;
    }

    public final TextView getTitleTextView() {
        return this.f4288b;
    }

    public InterfaceC0690g0 getWrapper() {
        Drawable drawable;
        if (this.f4279N == null) {
            f1 f1Var = new f1();
            f1Var.f8585n = 0;
            f1Var.f8574a = this;
            f1Var.h = getTitle();
            f1Var.i = getSubtitle();
            f1Var.f8580g = f1Var.h != null;
            f1Var.f8579f = getNavigationIcon();
            C0009i c0009iY = C0009i.Y(getContext(), null, AbstractC0489a.f6962a, 2130903046);
            f1Var.f8586o = c0009iY.I(15);
            TypedArray typedArray = (TypedArray) c0009iY.f205c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                f1Var.f8580g = true;
                f1Var.h = text;
                if ((f1Var.f8575b & 8) != 0) {
                    Toolbar toolbar = f1Var.f8574a;
                    toolbar.setTitle(text);
                    if (f1Var.f8580g) {
                        S.i(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                f1Var.i = text2;
                if ((f1Var.f8575b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableI = c0009iY.I(20);
            if (drawableI != null) {
                f1Var.f8578e = drawableI;
                f1Var.c();
            }
            Drawable drawableI2 = c0009iY.I(17);
            if (drawableI2 != null) {
                f1Var.f8577d = drawableI2;
                f1Var.c();
            }
            if (f1Var.f8579f == null && (drawable = f1Var.f8586o) != null) {
                f1Var.f8579f = drawable;
                int i = f1Var.f8575b & 4;
                Toolbar toolbar2 = f1Var.f8574a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            f1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = f1Var.f8576c;
                if (view != null && (f1Var.f8575b & 16) != 0) {
                    removeView(view);
                }
                f1Var.f8576c = viewInflate;
                if (viewInflate != null && (f1Var.f8575b & 16) != 0) {
                    addView(viewInflate);
                }
                f1Var.a(f1Var.f8575b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f4306x.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f4298p = resourceId2;
                Y y4 = this.f4288b;
                if (y4 != null) {
                    y4.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4299q = resourceId3;
                Y y5 = this.f4289c;
                if (y5 != null) {
                    y5.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0009iY.e0();
            if (2131886081 != f1Var.f8585n) {
                f1Var.f8585n = 2131886081;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = f1Var.f8585n;
                    f1Var.f8581j = i5 != 0 ? getContext().getString(i5) : null;
                    f1Var.b();
                }
            }
            f1Var.f8581j = getNavigationContentDescription();
            setNavigationOnClickListener(new e1(f1Var));
            this.f4279N = f1Var;
        }
        return this.f4279N;
    }

    public final int j(int i) {
        WeakHashMap weakHashMap = S.f2363a;
        int iD = C.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iD) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : iD == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        b1 b1Var = (b1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i6 = b1Var.f8555a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4267A & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) b1Var).topMargin;
        if (iMax < i7) {
            iMax = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) b1Var).bottomMargin;
            if (i8 < i9) {
                iMax = Math.max(0, iMax - (i9 - i8));
            }
        }
        return paddingTop + iMax;
    }

    public void n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void o() {
        Iterator it = this.f4277L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f4276K.f205c).iterator();
        while (it2.hasNext()) {
            ((g0.C) it2.next()).f7304a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4277L = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4286U);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iM;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = j1.a(this);
        int i6 = !zA ? 1 : 0;
        int i7 = 0;
        if (u(this.f4290d)) {
            t(this.f4290d, i, 0, i5, this.f4301s);
            iL = l(this.f4290d) + this.f4290d.getMeasuredWidth();
            iMax = Math.max(0, m(this.f4290d) + this.f4290d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4290d.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f4294l)) {
            t(this.f4294l, i, 0, i5, this.f4301s);
            iL = l(this.f4294l) + this.f4294l.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f4294l) + this.f4294l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4294l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL);
        int iMax4 = Math.max(0, currentContentInsetStart - iL);
        int[] iArr = this.f4275J;
        iArr[zA ? 1 : 0] = iMax4;
        if (u(this.f4287a)) {
            t(this.f4287a, i, iMax3, i5, this.f4301s);
            iL2 = l(this.f4287a) + this.f4287a.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f4287a) + this.f4287a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4287a.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iL2);
        iArr[i6] = Math.max(0, currentContentInsetEnd - iL2);
        if (u(this.f4295m)) {
            iMax5 += s(this.f4295m, i, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, m(this.f4295m) + this.f4295m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4295m.getMeasuredState());
        }
        if (u(this.f4291e)) {
            iMax5 += s(this.f4291e, i, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, m(this.f4291e) + this.f4291e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4291e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (((b1) childAt.getLayoutParams()).f8556b == 0 && u(childAt)) {
                iMax5 += s(childAt, i, iMax5, i5, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i9 = this.f4304v + this.f4305w;
        int i10 = this.f4302t + this.f4303u;
        if (u(this.f4288b)) {
            s(this.f4288b, i, iMax5 + i10, i5, i9, iArr);
            int iL3 = l(this.f4288b) + this.f4288b.getMeasuredWidth();
            iM = m(this.f4288b) + this.f4288b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4288b.getMeasuredState());
            iMax2 = iL3;
        } else {
            iM = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f4289c)) {
            iMax2 = Math.max(iMax2, s(this.f4289c, i, iMax5 + i10, i5, iM + i9, iArr));
            iM += m(this.f4289c) + this.f4289c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f4289c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16);
        if (!this.f4282Q) {
            i7 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i7 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d1 d1Var = (d1) parcelable;
        super.onRestoreInstanceState(d1Var.f3264a);
        ActionMenuView actionMenuView = this.f4287a;
        l lVar = actionMenuView != null ? actionMenuView.f4204t : null;
        int i = d1Var.f8567c;
        if (i != 0 && this.f4281P != null && lVar != null && (menuItemFindItem = lVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (d1Var.f8568d) {
            N n5 = this.f4286U;
            removeCallbacks(n5);
            post(n5);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        J0 j02 = this.f4306x;
        boolean z4 = i == 1;
        if (z4 == j02.f8467g) {
            return;
        }
        j02.f8467g = z4;
        if (!j02.h) {
            j02.f8461a = j02.f8465e;
            j02.f8462b = j02.f8466f;
            return;
        }
        if (z4) {
            int i5 = j02.f8464d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = j02.f8465e;
            }
            j02.f8461a = i5;
            int i6 = j02.f8463c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = j02.f8466f;
            }
            j02.f8462b = i6;
            return;
        }
        int i7 = j02.f8463c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = j02.f8465e;
        }
        j02.f8461a = i7;
        int i8 = j02.f8464d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = j02.f8466f;
        }
        j02.f8462b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0693i c0693i;
        k.n nVar;
        d1 d1Var = new d1(super.onSaveInstanceState());
        a1 a1Var = this.f4281P;
        if (a1Var != null && (nVar = a1Var.f8551b) != null) {
            d1Var.f8567c = nVar.f8246a;
        }
        ActionMenuView actionMenuView = this.f4287a;
        d1Var.f8568d = (actionMenuView == null || (c0693i = actionMenuView.f4208x) == null || !c0693i.j()) ? false : true;
        return d1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4272F = false;
        }
        if (!this.f4272F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4272F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4272F = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.f4274I.contains(view);
    }

    public final int q(View view, int i, int i5, int[] iArr) {
        b1 b1Var = (b1) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) b1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i6) + i;
        iArr[0] = Math.max(0, -i6);
        int iK = k(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) b1Var).rightMargin + iMax;
    }

    public final int r(View view, int i, int i5, int[] iArr) {
        b1 b1Var = (b1) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) b1Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iK = k(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) b1Var).leftMargin);
    }

    public final int s(View view, int i, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f4285T != z4) {
            this.f4285T = z4;
            v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(r1.d.B(getContext(), i));
    }

    public void setCollapsible(boolean z4) {
        this.f4282Q = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4308z) {
            this.f4308z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4307y) {
            this.f4307y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(r1.d.B(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(r1.d.B(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f4290d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(c1 c1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4287a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f4297o != i) {
            this.f4297o = i;
            if (i == 0) {
                this.f4296n = getContext();
            } else {
                this.f4296n = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f4305w = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f4303u = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4302t = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4304v = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            android.window.OnBackInvokedDispatcher r1 = l.Z0.a(r4)
            l.a1 r2 = r4.f4281P
            if (r2 == 0) goto L23
            k.n r2 = r2.f8551b
            if (r2 == 0) goto L23
            if (r1 == 0) goto L23
            java.util.WeakHashMap r2 = M.S.f2363a
            boolean r2 = M.E.b(r4)
            if (r2 == 0) goto L23
            boolean r2 = r4.f4285T
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f4284S
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r2 = r4.f4283R
            if (r2 != 0) goto L39
            l.Y0 r2 = new l.Y0
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = l.Z0.b(r2)
            r4.f4283R = r0
        L39:
            android.window.OnBackInvokedCallback r0 = r4.f4283R
            l.Z0.c(r1, r0)
            r4.f4284S = r1
            goto L4f
        L41:
            if (r2 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f4284S
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f4283R
            l.Z0.d(r0, r1)
            r0 = 0
            r4.f4284S = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.v():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 2130904178);
        this.f4267A = 8388627;
        this.f4273H = new ArrayList();
        this.f4274I = new ArrayList();
        this.f4275J = new int[2];
        this.f4276K = new C0009i(new Y0(this, 1));
        this.f4277L = new ArrayList();
        this.f4278M = new K2.c(this, 24);
        this.f4286U = new N(this, 29);
        Context context2 = getContext();
        int[] iArr = AbstractC0489a.f6983x;
        C0009i c0009iY = C0009i.Y(context2, attributeSet, iArr, 2130904178);
        WeakHashMap weakHashMap = S.f2363a;
        M.d(this, context, iArr, attributeSet, (TypedArray) c0009iY.f205c, 2130904178, 0);
        TypedArray typedArray = (TypedArray) c0009iY.f205c;
        this.f4298p = typedArray.getResourceId(28, 0);
        this.f4299q = typedArray.getResourceId(19, 0);
        this.f4267A = typedArray.getInteger(0, 8388627);
        this.f4300r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4305w = dimensionPixelOffset;
        this.f4304v = dimensionPixelOffset;
        this.f4303u = dimensionPixelOffset;
        this.f4302t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4302t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4303u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4304v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4305w = dimensionPixelOffset5;
        }
        this.f4301s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        J0 j02 = this.f4306x;
        j02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j02.f8465e = dimensionPixelSize;
            j02.f8461a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j02.f8466f = dimensionPixelSize2;
            j02.f8462b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4307y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4308z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4292f = c0009iY.I(4);
        this.f4293k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4296n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableI = c0009iY.I(16);
        if (drawableI != null) {
            setNavigationIcon(drawableI);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableI2 = c0009iY.I(11);
        if (drawableI2 != null) {
            setLogo(drawableI2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0009iY.F(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0009iY.F(20));
        }
        if (typedArray.hasValue(14)) {
            n(typedArray.getResourceId(14, 0));
        }
        c0009iY.e0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b1 b1Var = new b1(context, attributeSet);
        b1Var.f8555a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0489a.f6963b);
        b1Var.f8555a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        b1Var.f8556b = 0;
        return b1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0716v c0716v = this.f4294l;
        if (c0716v != null) {
            c0716v.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4294l.setImageDrawable(drawable);
        } else {
            C0716v c0716v = this.f4294l;
            if (c0716v != null) {
                c0716v.setImageDrawable(this.f4292f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4291e == null) {
                this.f4291e = new C0718w(getContext(), null, 0);
            }
            if (!p(this.f4291e)) {
                b(this.f4291e, true);
            }
        } else {
            C0718w c0718w = this.f4291e;
            if (c0718w != null && p(c0718w)) {
                removeView(this.f4291e);
                this.f4274I.remove(this.f4291e);
            }
        }
        C0718w c0718w2 = this.f4291e;
        if (c0718w2 != null) {
            c0718w2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4291e == null) {
            this.f4291e = new C0718w(getContext(), null, 0);
        }
        C0718w c0718w = this.f4291e;
        if (c0718w != null) {
            c0718w.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0716v c0716v = this.f4290d;
        if (c0716v != null) {
            c0716v.setContentDescription(charSequence);
            g1.a(this.f4290d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f4290d)) {
                b(this.f4290d, true);
            }
        } else {
            C0716v c0716v = this.f4290d;
            if (c0716v != null && p(c0716v)) {
                removeView(this.f4290d);
                this.f4274I.remove(this.f4290d);
            }
        }
        C0716v c0716v2 = this.f4290d;
        if (c0716v2 != null) {
            c0716v2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y4 = this.f4289c;
            if (y4 != null && p(y4)) {
                removeView(this.f4289c);
                this.f4274I.remove(this.f4289c);
            }
        } else {
            if (this.f4289c == null) {
                Context context = getContext();
                Y y5 = new Y(context, null);
                this.f4289c = y5;
                y5.setSingleLine();
                this.f4289c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4299q;
                if (i != 0) {
                    this.f4289c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4271E;
                if (colorStateList != null) {
                    this.f4289c.setTextColor(colorStateList);
                }
            }
            if (!p(this.f4289c)) {
                b(this.f4289c, true);
            }
        }
        Y y6 = this.f4289c;
        if (y6 != null) {
            y6.setText(charSequence);
        }
        this.f4269C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4271E = colorStateList;
        Y y4 = this.f4289c;
        if (y4 != null) {
            y4.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y4 = this.f4288b;
            if (y4 != null && p(y4)) {
                removeView(this.f4288b);
                this.f4274I.remove(this.f4288b);
            }
        } else {
            if (this.f4288b == null) {
                Context context = getContext();
                Y y5 = new Y(context, null);
                this.f4288b = y5;
                y5.setSingleLine();
                this.f4288b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4298p;
                if (i != 0) {
                    this.f4288b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4270D;
                if (colorStateList != null) {
                    this.f4288b.setTextColor(colorStateList);
                }
            }
            if (!p(this.f4288b)) {
                b(this.f4288b, true);
            }
        }
        Y y6 = this.f4288b;
        if (y6 != null) {
            y6.setText(charSequence);
        }
        this.f4268B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4270D = colorStateList;
        Y y4 = this.f4288b;
        if (y4 != null) {
            y4.setTextColor(colorStateList);
        }
    }
}
