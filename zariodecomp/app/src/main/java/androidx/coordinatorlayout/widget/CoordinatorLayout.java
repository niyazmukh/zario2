package androidx.coordinatorlayout.widget;

import E.c;
import L.f;
import M.AbstractC0124j;
import M.B;
import M.C;
import M.F;
import M.H;
import M.InterfaceC0129o;
import M.InterfaceC0130p;
import M.S;
import M.q;
import M.u0;
import Q1.l;
import S0.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import q.C0834k;
import t0.C0908O;
import x.a;
import y.C1041d;
import y.InterfaceC1039b;
import y.ViewGroupOnHierarchyChangeListenerC1040c;
import y.e;
import y.g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\coordinatorlayout\widget\CoordinatorLayout.smali */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0129o, InterfaceC0130p {

    /* renamed from: A, reason: collision with root package name */
    public static final l f4334A;

    /* renamed from: B, reason: collision with root package name */
    public static final f f4335B;

    /* renamed from: x, reason: collision with root package name */
    public static final String f4336x;

    /* renamed from: y, reason: collision with root package name */
    public static final Class[] f4337y;

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f4338z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4340b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4341c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4342d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4343e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4344f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4345k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4346l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f4347m;

    /* renamed from: n, reason: collision with root package name */
    public View f4348n;

    /* renamed from: o, reason: collision with root package name */
    public View f4349o;

    /* renamed from: p, reason: collision with root package name */
    public e f4350p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4351q;

    /* renamed from: r, reason: collision with root package name */
    public u0 f4352r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4353s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f4354t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4355u;

    /* renamed from: v, reason: collision with root package name */
    public C0908O f4356v;

    /* renamed from: w, reason: collision with root package name */
    public final q f4357w;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4336x = r02 != null ? r02.getName() : null;
        f4334A = new l(8);
        f4337y = new Class[]{Context.class, AttributeSet.class};
        f4338z = new ThreadLocal();
        f4335B = new f();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 2130903354);
        this.f4339a = new ArrayList();
        this.f4340b = new i(11);
        this.f4341c = new ArrayList();
        this.f4342d = new ArrayList();
        this.f4343e = new int[2];
        this.f4344f = new int[2];
        this.f4357w = new q();
        int[] iArr = a.f11010a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130903354, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 2130903354, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4347m = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f4347m[i] = (int) (r1[i] * f2);
            }
        }
        this.f4354t = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1040c(this));
        WeakHashMap weakHashMap = S.f2363a;
        if (B.c(this) == 0) {
            B.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4335B.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C1041d c1041d, int i5, int i6) {
        int i7 = c1041d.f11029c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i);
        int i8 = c1041d.f11030d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int iWidth = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            iWidth -= i5 / 2;
        } else if (i9 != 5) {
            iWidth -= i5;
        }
        if (i10 == 16) {
            iHeight -= i6 / 2;
        } else if (i10 != 80) {
            iHeight -= i6;
        }
        rect2.set(iWidth, iHeight, i5 + iWidth, i6 + iHeight);
    }

    public static C1041d n(View view) {
        C1041d c1041d = (C1041d) view.getLayoutParams();
        if (!c1041d.f11028b) {
            InterfaceC1039b interfaceC1039b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC1039b = (InterfaceC1039b) superclass.getAnnotation(InterfaceC1039b.class);
                if (interfaceC1039b != null) {
                    break;
                }
            }
            if (interfaceC1039b != null) {
                try {
                    y.a aVar = (y.a) interfaceC1039b.value().getDeclaredConstructor(null).newInstance(null);
                    y.a aVar2 = c1041d.f11027a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        c1041d.f11027a = aVar;
                        c1041d.f11028b = true;
                        if (aVar != null) {
                            aVar.c(c1041d);
                        }
                    }
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1039b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            c1041d.f11028b = true;
        }
        return c1041d;
    }

    public static void u(View view, int i) {
        C1041d c1041d = (C1041d) view.getLayoutParams();
        int i5 = c1041d.i;
        if (i5 != i) {
            WeakHashMap weakHashMap = S.f2363a;
            view.offsetLeftAndRight(i - i5);
            c1041d.i = i;
        }
    }

    public static void v(View view, int i) {
        C1041d c1041d = (C1041d) view.getLayoutParams();
        int i5 = c1041d.f11034j;
        if (i5 != i) {
            WeakHashMap weakHashMap = S.f2363a;
            view.offsetTopAndBottom(i - i5);
            c1041d.f11034j = i;
        }
    }

    @Override // M.InterfaceC0129o
    public final void a(View view, View view2, int i, int i5) {
        q qVar = this.f4357w;
        if (i5 == 1) {
            qVar.f2419b = i;
        } else {
            qVar.f2418a = i;
        }
        this.f4349o = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((C1041d) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // M.InterfaceC0129o
    public final void b(View view, int i) {
        q qVar = this.f4357w;
        if (i == 1) {
            qVar.f2419b = 0;
        } else {
            qVar.f2418a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1041d c1041d = (C1041d) childAt.getLayoutParams();
            if (c1041d.a(i)) {
                y.a aVar = c1041d.f11027a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    c1041d.f11037m = false;
                } else if (i == 1) {
                    c1041d.f11038n = false;
                }
            }
        }
        this.f4349o = null;
    }

    @Override // M.InterfaceC0129o
    public final void c(View view, int i, int i5, int[] iArr, int i6) {
        y.a aVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1041d c1041d = (C1041d) childAt.getLayoutParams();
                if (c1041d.a(i6) && (aVar = c1041d.f11027a) != null) {
                    int[] iArr2 = this.f4343e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i, i5, iArr2, i6);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1041d) && super.checkLayoutParams(layoutParams);
    }

    @Override // M.InterfaceC0130p
    public final void d(View view, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        y.a aVar;
        int childCount = getChildCount();
        boolean z4 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1041d c1041d = (C1041d) childAt.getLayoutParams();
                if (c1041d.a(i8) && (aVar = c1041d.f11027a) != null) {
                    int[] iArr2 = this.f4343e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i5, i6, i7, iArr2);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        y.a aVar = ((C1041d) view.getLayoutParams()).f11027a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4354t;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // M.InterfaceC0129o
    public final void e(View view, int i, int i5, int i6, int i7, int i8) {
        d(view, i, i5, i6, i7, 0, this.f4344f);
    }

    @Override // M.InterfaceC0129o
    public final boolean f(View view, View view2, int i, int i5) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1041d c1041d = (C1041d) childAt.getLayoutParams();
                y.a aVar = c1041d.f11027a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i, i5);
                    z4 |= zO;
                    if (i5 == 0) {
                        c1041d.f11037m = zO;
                    } else if (i5 == 1) {
                        c1041d.f11038n = zO;
                    }
                } else if (i5 == 0) {
                    c1041d.f11037m = false;
                } else if (i5 == 1) {
                    c1041d.f11038n = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1041d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1041d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f4339a);
    }

    public final u0 getLastWindowInsets() {
        return this.f4352r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.f4357w;
        return qVar.f2419b | qVar.f2418a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4354t;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C1041d c1041d, Rect rect, int i, int i5) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1041d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1041d).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1041d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) c1041d).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i5 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C0834k c0834k = (C0834k) this.f4340b.f2859b;
        int i = c0834k.f9428c;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i; i5++) {
            ArrayList arrayList2 = (ArrayList) c0834k.j(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0834k.h(i5));
            }
        }
        ArrayList arrayList3 = this.f4342d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f11041a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f11041a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f11042b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f4347m;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i5) {
        f fVar = f4335B;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i, i5);
        } finally {
            rectG.setEmpty();
            fVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4351q) {
            if (this.f4350p == null) {
                this.f4350p = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4350p);
        }
        if (this.f4352r == null) {
            WeakHashMap weakHashMap = S.f2363a;
            if (B.b(this)) {
                F.c(this);
            }
        }
        this.f4346l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4351q && this.f4350p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4350p);
        }
        View view = this.f4349o;
        if (view != null) {
            b(view, 0);
        }
        this.f4346l = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4353s || this.f4354t == null) {
            return;
        }
        u0 u0Var = this.f4352r;
        int iD = u0Var != null ? u0Var.d() : 0;
        if (iD > 0) {
            this.f4354t.setBounds(0, 0, getWidth(), iD);
            this.f4354t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        y.a aVar;
        WeakHashMap weakHashMap = S.f2363a;
        int iD = C.d(this);
        ArrayList arrayList = this.f4339a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((aVar = ((C1041d) view.getLayoutParams()).f11027a) == null || !aVar.g(this, view, iD))) {
                q(view, iD);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1041d c1041d = (C1041d) childAt.getLayoutParams();
                if (c1041d.a(0)) {
                    y.a aVar = c1041d.f11027a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        y.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1041d c1041d = (C1041d) childAt.getLayoutParams();
                if (c1041d.a(0) && (aVar = c1041d.f11027a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
        c(view, i, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        e(view, i, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y.f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y.f fVar = (y.f) parcelable;
        super.onRestoreInstanceState(fVar.f3264a);
        SparseArray sparseArray = fVar.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            y.a aVar = n(childAt).f11027a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        y.f fVar = new y.f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            y.a aVar = ((C1041d) childAt.getLayoutParams()).f11027a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        fVar.c = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f4348n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f4348n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            y.d r6 = (y.C1041d) r6
            y.a r6 = r6.f11027a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f4348n
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f4348n
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b BREAK  A[LOOP:2: B:122:0x02db->B:127:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect rectG;
        Rect rectG2;
        C1041d c1041d = (C1041d) view.getLayoutParams();
        View view2 = c1041d.f11035k;
        if (view2 == null && c1041d.f11032f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        f fVar = f4335B;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                C1041d c1041d2 = (C1041d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, c1041d2, measuredWidth, measuredHeight);
                h(c1041d2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                fVar.c(rectG);
                rectG2.setEmpty();
                fVar.c(rectG2);
            }
        }
        int i5 = c1041d.f11031e;
        if (i5 < 0) {
            C1041d c1041d3 = (C1041d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1041d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1041d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1041d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1041d3).bottomMargin);
            if (this.f4352r != null) {
                WeakHashMap weakHashMap = S.f2363a;
                if (B.b(this) && !B.b(view)) {
                    rectG.left = this.f4352r.b() + rectG.left;
                    rectG.top = this.f4352r.d() + rectG.top;
                    rectG.right -= this.f4352r.c();
                    rectG.bottom -= this.f4352r.a();
                }
            }
            rectG2 = g();
            int i6 = c1041d3.f11029c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            AbstractC0124j.b(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        C1041d c1041d4 = (C1041d) view.getLayoutParams();
        int i7 = c1041d4.f11029c;
        if (i7 == 0) {
            i7 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i5 = width - i5;
        }
        int iM = m(i5) - measuredWidth2;
        if (i8 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i8 == 5) {
            iM += measuredWidth2;
        }
        int i10 = i9 != 16 ? i9 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1041d4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1041d4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1041d4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1041d4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4341c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        l lVar = f4334A;
        if (lVar != null) {
            Collections.sort(arrayList, lVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            y.a aVar = ((C1041d) view.getLayoutParams()).f11027a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f4348n = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        y.a aVar = ((C1041d) view.getLayoutParams()).f11027a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f4345k) {
            return;
        }
        t(false);
        this.f4345k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4355u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4354t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f4354t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f4354t.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4354t;
                WeakHashMap weakHashMap = S.f2363a;
                c.b(drawable3, C.d(this));
                this.f4354t.setVisible(getVisibility() == 0, false);
                this.f4354t.setCallback(this);
            }
            WeakHashMap weakHashMap2 = S.f2363a;
            B.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? B.l.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.f4354t;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f4354t.setVisible(z4, false);
    }

    public final void t(boolean z4) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            y.a aVar = ((C1041d) childAt.getLayoutParams()).f11027a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((C1041d) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f4348n = null;
        this.f4345k = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4354t;
    }

    public final void w() {
        WeakHashMap weakHashMap = S.f2363a;
        if (!B.b(this)) {
            H.u(this, null);
            return;
        }
        if (this.f4356v == null) {
            this.f4356v = new C0908O(this);
        }
        H.u(this, this.f4356v);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1041d ? new C1041d((C1041d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1041d((ViewGroup.MarginLayoutParams) layoutParams) : new C1041d(layoutParams);
    }
}
