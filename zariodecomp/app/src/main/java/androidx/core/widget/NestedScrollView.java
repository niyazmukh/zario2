package androidx.core.widget;

import M.B;
import M.C0128n;
import M.H;
import M.InterfaceC0130p;
import M.S;
import M.q;
import Q.e;
import Q.i;
import Q.j;
import Q.k;
import Q.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import java.util.WeakHashMap;
import r1.d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\core\widget\NestedScrollView.smali */
public class NestedScrollView extends FrameLayout implements InterfaceC0130p {

    /* renamed from: E, reason: collision with root package name */
    public static final float f4373E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: F, reason: collision with root package name */
    public static final i f4374F = new i(0);
    public static final int[] G = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public l f4375A;

    /* renamed from: B, reason: collision with root package name */
    public final q f4376B;

    /* renamed from: C, reason: collision with root package name */
    public final C0128n f4377C;

    /* renamed from: D, reason: collision with root package name */
    public float f4378D;

    /* renamed from: a, reason: collision with root package name */
    public final float f4379a;

    /* renamed from: b, reason: collision with root package name */
    public long f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4381c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f4382d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f4383e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f4384f;

    /* renamed from: k, reason: collision with root package name */
    public int f4385k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4386l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4387m;

    /* renamed from: n, reason: collision with root package name */
    public View f4388n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4389o;

    /* renamed from: p, reason: collision with root package name */
    public VelocityTracker f4390p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4391q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4392r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4393s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4394t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4395u;

    /* renamed from: v, reason: collision with root package name */
    public int f4396v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f4397w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4398x;

    /* renamed from: y, reason: collision with root package name */
    public int f4399y;

    /* renamed from: z, reason: collision with root package name */
    public int f4400z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903862);
        this.f4381c = new Rect();
        this.f4386l = true;
        this.f4387m = false;
        this.f4388n = null;
        this.f4389o = false;
        this.f4392r = true;
        this.f4396v = -1;
        this.f4397w = new int[2];
        this.f4398x = new int[2];
        int i = Build.VERSION.SDK_INT;
        this.f4383e = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4384f = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4379a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4382d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4393s = viewConfiguration.getScaledTouchSlop();
        this.f4394t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4395u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, 2130903862, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4376B = new q();
        this.f4377C = new C0128n(this);
        setNestedScrollingEnabled(true);
        S.h(this, f4374F);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f4378D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4378D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4378D;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // M.InterfaceC0129o
    public final void a(View view, View view2, int i, int i5) {
        q qVar = this.f4376B;
        if (i5 == 1) {
            qVar.f2419b = i;
        } else {
            qVar.f2418a = i;
        }
        v(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // M.InterfaceC0129o
    public final void b(View view, int i) {
        q qVar = this.f4376B;
        if (i == 1) {
            qVar.f2419b = 0;
        } else {
            qVar.f2418a = 0;
        }
        x(i);
    }

    @Override // M.InterfaceC0129o
    public final void c(View view, int i, int i5, int[] iArr, int i6) {
        this.f4377C.c(i, i5, iArr, null, i6);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // M.InterfaceC0130p
    public final void d(View view, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        n(i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z4) {
        return this.f4377C.a(f2, f3, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f4377C.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return this.f4377C.c(i, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return this.f4377C.d(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4383e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = S.f2363a;
                B.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f4384f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (j.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (j.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = S.f2363a;
            B.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // M.InterfaceC0129o
    public final void e(View view, int i, int i5, int i6, int i7, int i8) {
        n(i7, i8, null);
    }

    @Override // M.InterfaceC0129o
    public final boolean f(View view, View view2, int i, int i5) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4381c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.f4376B;
        return qVar.f2419b | qVar.f2418a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4377C.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f4381c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : g(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4377C.f2407d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f4382d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            v(2, 1);
            this.f4400z = getScrollY();
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f4381c;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i5) {
        Rect rect = this.f4381c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4377C.d(0, scrollY2, 0, i - scrollY2, null, i5, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4396v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4385k = (int) motionEvent.getY(i);
            this.f4396v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4390p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4387m = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f4389o) {
            if ((motionEvent.getSource() & 2) == 2) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                s(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, (motionEvent.getSource() & 8194) == 8194);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int measuredHeight;
        super.onLayout(z4, i, i5, i6, i7);
        int i8 = 0;
        this.f4386l = false;
        View view = this.f4388n;
        if (view != null && l(view, this)) {
            View view2 = this.f4388n;
            Rect rect = this.f4381c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f4388n = null;
        if (!this.f4387m) {
            if (this.f4375A != null) {
                scrollTo(getScrollX(), this.f4375A.f2706a);
                this.f4375A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i8 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4387m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f4391q && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f4377C.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
        this.f4377C.c(i, i5, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        n(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i5, boolean z4, boolean z5) {
        super.scrollTo(i, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f4375A = lVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f2706a = getScrollY();
        return lVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i5, int i6, int i7) {
        super.onScrollChanged(i, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f4381c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f4392r) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        OverScroller overScroller = this.f4382d;
        int i = this.f4393s;
        EdgeEffect edgeEffect = this.f4383e;
        EdgeEffect edgeEffect2 = this.f4384f;
        if (this.f4390p == null) {
            this.f4390p = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4399y = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f4399y);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4390p;
                velocityTracker.computeCurrentVelocity(1000, this.f4395u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4396v);
                if (Math.abs(yVelocity) >= this.f4394t) {
                    if (d.A(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (d.A(edgeEffect2) != 0.0f) {
                        int i5 = -yVelocity;
                        if (t(edgeEffect2, i5)) {
                            edgeEffect2.onAbsorb(i5);
                        } else {
                            j(i5);
                        }
                    } else {
                        int i6 = -yVelocity;
                        float f3 = i6;
                        if (!this.f4377C.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            j(i6);
                        }
                    }
                } else if (this.f4382d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = S.f2363a;
                    B.k(this);
                }
                this.f4396v = -1;
                this.f4389o = false;
                VelocityTracker velocityTracker2 = this.f4390p;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4390p = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4396v);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4396v + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(iFindPointerIndex);
                    int i7 = this.f4385k - y4;
                    float x3 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i7 / getHeight();
                    if (d.A(edgeEffect) != 0.0f) {
                        float f5 = -d.R(edgeEffect, -height, x3);
                        if (d.A(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = f5;
                    } else if (d.A(edgeEffect2) != 0.0f) {
                        float fR = d.R(edgeEffect2, height, 1.0f - x3);
                        if (d.A(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = fR;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i8 = i7 - iRound;
                    if (!this.f4389o && Math.abs(i8) > i) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4389o = true;
                        i8 = i8 > 0 ? i8 - i : i8 + i;
                    }
                    if (this.f4389o) {
                        int iS = s(i8, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f4385k = y4 - iS;
                        this.f4399y += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4389o && getChildCount() > 0 && this.f4382d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap2 = S.f2363a;
                    B.k(this);
                }
                this.f4396v = -1;
                this.f4389o = false;
                VelocityTracker velocityTracker3 = this.f4390p;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4390p = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4385k = (int) motionEvent.getY(actionIndex);
                this.f4396v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f4385k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4396v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4389o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                x(1);
            }
            int y5 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4385k = y5;
            this.f4396v = pointerId;
            v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4390p;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i6 + i;
        if (i5 <= 0 && i5 >= 0) {
            z4 = false;
        } else {
            i5 = 0;
            z4 = true;
        }
        if (i8 > i7) {
            z5 = true;
        } else if (i8 < 0) {
            i7 = 0;
            z5 = true;
        } else {
            i7 = i8;
            z5 = false;
        }
        if (z5 && !this.f4377C.f(1)) {
            this.f4382d.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i7);
        return z4 || z5;
    }

    public final void q(int i) {
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f4381c;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        r(i, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.s(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r0 = r17.findFocus()
            if (r11 == r0) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4386l) {
            this.f4388n = view2;
        } else {
            Rect rect = this.f4381c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z5 = iH != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, iH);
            } else {
                u(0, iH, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f4390p) != null) {
            velocityTracker.recycle();
            this.f4390p = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4386l = true;
        super.requestLayout();
    }

    public final int s(int i, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        boolean z5;
        if (i6 == 1) {
            v(2, i6);
        }
        boolean zC = this.f4377C.c(0, i, this.f4398x, this.f4397w, i6);
        int[] iArr = this.f4398x;
        int[] iArr2 = this.f4397w;
        if (zC) {
            i7 = i - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z7 = p(i7, 0, scrollY, scrollRange) && !this.f4377C.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4377C.d(0, scrollY2, 0, i7 - scrollY2, this.f4397w, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f4384f;
        EdgeEffect edgeEffect2 = this.f4383e;
        if (i11 < 0) {
            if (z6) {
                d.R(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z6) {
            d.R(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z5 = z7;
        } else {
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
            z5 = false;
        }
        if (z5 && i6 == 0) {
            this.f4390p.clear();
        }
        if (i6 == 1) {
            x(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f4391q) {
            this.f4391q = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0128n c0128n = this.f4377C;
        if (c0128n.f2407d) {
            WeakHashMap weakHashMap = S.f2363a;
            H.z(c0128n.f2406c);
        }
        c0128n.f2407d = z4;
    }

    public void setOnScrollChangeListener(k kVar) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f4392r = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4377C.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fA = d.A(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f2 = this.f4379a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d5 = f4373E;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    public final void u(int i, int i5, boolean z4) {
        OverScroller overScroller = this.f4382d;
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4380b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4382d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                v(2, 1);
            } else {
                x(1);
            }
            this.f4400z = getScrollY();
            WeakHashMap weakHashMap = S.f2363a;
            B.k(this);
        } else {
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                x(1);
            }
            scrollBy(i, i5);
        }
        this.f4380b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i, int i5) {
        this.f4377C.g(2, i5);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f4383e;
        if (d.A(edgeEffect) != 0.0f) {
            d.R(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f4384f;
        if (d.A(edgeEffect2) == 0.0f) {
            return z4;
        }
        d.R(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void x(int i) {
        this.f4377C.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
