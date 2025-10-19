package androidx.swiperefreshlayout.widget;

import D0.a;
import D0.d;
import D0.e;
import D0.f;
import D0.g;
import D0.h;
import D0.i;
import D0.j;
import D0.l;
import M.B;
import M.C0128n;
import M.H;
import M.InterfaceC0129o;
import M.InterfaceC0130p;
import M.S;
import M.q;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\swiperefreshlayout\widget\SwipeRefreshLayout.smali */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0130p, InterfaceC0129o {

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f4802O = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    public final int f4803A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4804B;

    /* renamed from: C, reason: collision with root package name */
    public int f4805C;

    /* renamed from: D, reason: collision with root package name */
    public final e f4806D;

    /* renamed from: E, reason: collision with root package name */
    public g f4807E;

    /* renamed from: F, reason: collision with root package name */
    public g f4808F;
    public h G;

    /* renamed from: H, reason: collision with root package name */
    public h f4809H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4810I;

    /* renamed from: J, reason: collision with root package name */
    public int f4811J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4812K;

    /* renamed from: L, reason: collision with root package name */
    public final f f4813L;

    /* renamed from: M, reason: collision with root package name */
    public final g f4814M;

    /* renamed from: N, reason: collision with root package name */
    public final g f4815N;

    /* renamed from: a, reason: collision with root package name */
    public View f4816a;

    /* renamed from: b, reason: collision with root package name */
    public j f4817b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4818c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4819d;

    /* renamed from: e, reason: collision with root package name */
    public float f4820e;

    /* renamed from: f, reason: collision with root package name */
    public float f4821f;

    /* renamed from: k, reason: collision with root package name */
    public final q f4822k;

    /* renamed from: l, reason: collision with root package name */
    public final C0128n f4823l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f4824m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f4825n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f4826o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4827p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4828q;

    /* renamed from: r, reason: collision with root package name */
    public int f4829r;

    /* renamed from: s, reason: collision with root package name */
    public float f4830s;

    /* renamed from: t, reason: collision with root package name */
    public float f4831t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4832u;

    /* renamed from: v, reason: collision with root package name */
    public int f4833v;

    /* renamed from: w, reason: collision with root package name */
    public final DecelerateInterpolator f4834w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4835x;

    /* renamed from: y, reason: collision with root package name */
    public int f4836y;

    /* renamed from: z, reason: collision with root package name */
    public int f4837z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4818c = false;
        this.f4820e = -1.0f;
        this.f4824m = new int[2];
        this.f4825n = new int[2];
        this.f4826o = new int[2];
        this.f4833v = -1;
        this.f4836y = -1;
        this.f4813L = new f(this, 0);
        this.f4814M = new g(this, 2);
        this.f4815N = new g(this, 3);
        this.f4819d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4828q = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4834w = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4811J = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f2 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(C0.a.f1072a);
        aVar.f1274b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = S.f2363a;
        H.s(aVar, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f1274b);
        B.q(aVar, shapeDrawable);
        this.f4835x = aVar;
        e eVar = new e(getContext());
        this.f4806D = eVar;
        eVar.c(1);
        this.f4835x.setImageDrawable(this.f4806D);
        this.f4835x.setVisibility(8);
        addView(this.f4835x);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f4804B = i;
        this.f4820e = i;
        this.f4822k = new q();
        this.f4823l = new C0128n(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.f4811J;
        this.f4829r = i5;
        this.f4803A = i5;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4802O);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f4835x.getBackground().setAlpha(i);
        this.f4806D.setAlpha(i);
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
        if (i6 == 0) {
            onNestedPreScroll(view, i, i5, iArr);
        }
    }

    @Override // M.InterfaceC0130p
    public final void d(View view, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        if (i8 != 0) {
            return;
        }
        int i9 = iArr[1];
        if (i8 == 0) {
            this.f4823l.d(i, i5, i6, i7, this.f4825n, i8, iArr);
        }
        int i10 = i7 - (iArr[1] - i9);
        if ((i10 == 0 ? i7 + this.f4825n[1] : i10) >= 0 || g()) {
            return;
        }
        float fAbs = this.f4821f + Math.abs(r2);
        this.f4821f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i10;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z4) {
        return this.f4823l.a(f2, f3, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f4823l.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return this.f4823l.c(i, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return this.f4823l.d(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // M.InterfaceC0129o
    public final void e(View view, int i, int i5, int i6, int i7, int i8) {
        d(view, i, i5, i6, i7, i8, this.f4826o);
    }

    @Override // M.InterfaceC0129o
    public final boolean f(View view, View view2, int i, int i5) {
        if (i5 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final boolean g() {
        View view = this.f4816a;
        return view instanceof ListView ? Q.h.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i5) {
        int i6 = this.f4836y;
        return i6 < 0 ? i5 : i5 == i + (-1) ? i6 : i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.f4822k;
        return qVar.f2419b | qVar.f2418a;
    }

    public int getProgressCircleDiameter() {
        return this.f4811J;
    }

    public int getProgressViewEndOffset() {
        return this.f4804B;
    }

    public int getProgressViewStartOffset() {
        return this.f4803A;
    }

    public final void h() {
        if (this.f4816a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f4835x)) {
                    this.f4816a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4823l.f(0);
    }

    public final void i(float f2) {
        if (f2 > this.f4820e) {
            m(true, true);
            return;
        }
        this.f4818c = false;
        e eVar = this.f4806D;
        d dVar = eVar.f1299a;
        dVar.f1281e = 0.0f;
        dVar.f1282f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.f4837z = this.f4829r;
        g gVar = this.f4815N;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.f4834w);
        a aVar = this.f4835x;
        aVar.f1273a = fVar;
        aVar.clearAnimation();
        this.f4835x.startAnimation(gVar);
        e eVar2 = this.f4806D;
        d dVar2 = eVar2.f1299a;
        if (dVar2.f1288n) {
            dVar2.f1288n = false;
        }
        eVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4823l.f2407d;
    }

    public final void j(float f2) {
        h hVar;
        h hVar2;
        e eVar = this.f4806D;
        d dVar = eVar.f1299a;
        if (!dVar.f1288n) {
            dVar.f1288n = true;
        }
        eVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f2 / this.f4820e));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.f4820e;
        int i = this.f4805C;
        if (i <= 0) {
            i = this.f4804B;
        }
        float f3 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i5 = this.f4803A + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.f4835x.getVisibility() != 0) {
            this.f4835x.setVisibility(0);
        }
        this.f4835x.setScaleX(1.0f);
        this.f4835x.setScaleY(1.0f);
        if (f2 < this.f4820e) {
            if (this.f4806D.f1299a.f1294t > 76 && ((hVar2 = this.G) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f4806D.f1299a.f1294t, 76);
                hVar3.setDuration(300L);
                a aVar = this.f4835x;
                aVar.f1273a = null;
                aVar.clearAnimation();
                this.f4835x.startAnimation(hVar3);
                this.G = hVar3;
            }
        } else if (this.f4806D.f1299a.f1294t < 255 && ((hVar = this.f4809H) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f4806D.f1299a.f1294t, 255);
            hVar4.setDuration(300L);
            a aVar2 = this.f4835x;
            aVar2.f1273a = null;
            aVar2.clearAnimation();
            this.f4835x.startAnimation(hVar4);
            this.f4809H = hVar4;
        }
        e eVar2 = this.f4806D;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        d dVar2 = eVar2.f1299a;
        dVar2.f1281e = 0.0f;
        dVar2.f1282f = fMin2;
        eVar2.invalidateSelf();
        e eVar3 = this.f4806D;
        float fMin3 = Math.min(1.0f, fMax);
        d dVar3 = eVar3.f1299a;
        if (fMin3 != dVar3.f1290p) {
            dVar3.f1290p = fMin3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f4806D;
        eVar4.f1299a.f1283g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i5 - this.f4829r);
    }

    public final void k(float f2) {
        setTargetOffsetTopAndBottom((this.f4837z + ((int) ((this.f4803A - r0) * f2))) - this.f4835x.getTop());
    }

    public final void l() {
        this.f4835x.clearAnimation();
        this.f4806D.stop();
        this.f4835x.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f4803A - this.f4829r);
        this.f4829r = this.f4835x.getTop();
    }

    public final void m(boolean z4, boolean z5) {
        if (this.f4818c != z4) {
            this.f4810I = z5;
            h();
            this.f4818c = z4;
            f fVar = this.f4813L;
            if (!z4) {
                g gVar = new g(this, 1);
                this.f4808F = gVar;
                gVar.setDuration(150L);
                a aVar = this.f4835x;
                aVar.f1273a = fVar;
                aVar.clearAnimation();
                this.f4835x.startAnimation(this.f4808F);
                return;
            }
            this.f4837z = this.f4829r;
            g gVar2 = this.f4814M;
            gVar2.reset();
            gVar2.setDuration(200L);
            gVar2.setInterpolator(this.f4834w);
            if (fVar != null) {
                this.f4835x.f1273a = fVar;
            }
            this.f4835x.clearAnimation();
            this.f4835x.startAnimation(gVar2);
        }
    }

    public final void n(float f2) {
        float f3 = this.f4831t;
        float f5 = f2 - f3;
        float f6 = this.f4819d;
        if (f5 <= f6 || this.f4832u) {
            return;
        }
        this.f4830s = f3 + f6;
        this.f4832u = true;
        this.f4806D.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.h()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.g()
            if (r1 != 0) goto L88
            boolean r1 = r5.f4818c
            if (r1 != 0) goto L88
            boolean r1 = r5.f4827p
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f4833v
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.f4833v = r6
            goto L85
        L44:
            int r0 = r5.f4833v
            if (r0 != r3) goto L50
            java.lang.String r5 = "SwipeRefreshLayout"
            java.lang.String r6 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r6)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            return r2
        L57:
            float r6 = r6.getY(r0)
            r5.n(r6)
            goto L85
        L5f:
            r5.f4832u = r2
            r5.f4833v = r3
            goto L85
        L64:
            D0.a r0 = r5.f4835x
            int r0 = r0.getTop()
            int r1 = r5.f4803A
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.f4833v = r0
            r5.f4832u = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            return r2
        L7f:
            float r6 = r6.getY(r0)
            r5.f4831t = r6
        L85:
            boolean r5 = r5.f4832u
            return r5
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4816a == null) {
            h();
        }
        View view = this.f4816a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4835x.getMeasuredWidth();
        int measuredHeight2 = this.f4835x.getMeasuredHeight();
        int i8 = measuredWidth / 2;
        int i9 = measuredWidth2 / 2;
        int i10 = this.f4829r;
        this.f4835x.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f4816a == null) {
            h();
        }
        View view = this.f4816a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4835x.measure(View.MeasureSpec.makeMeasureSpec(this.f4811J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4811J, 1073741824));
        this.f4836y = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f4835x) {
                this.f4836y = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z4) {
        return this.f4823l.a(f2, f3, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f4823l.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
        if (i5 > 0) {
            float f2 = this.f4821f;
            if (f2 > 0.0f) {
                float f3 = i5;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f4821f = 0.0f;
                } else {
                    this.f4821f = f2 - f3;
                    iArr[1] = i5;
                }
                j(this.f4821f);
            }
        }
        int i6 = i - iArr[0];
        int i7 = i5 - iArr[1];
        int[] iArr2 = this.f4824m;
        if (dispatchNestedPreScroll(i6, i7, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        d(view, i, i5, i6, i7, 0, this.f4826o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4822k.f2418a = i;
        startNestedScroll(i & 2);
        this.f4821f = 0.0f;
        this.f4827p = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        setRefreshing(lVar.f1313a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new l(super.onSaveInstanceState(), this.f4818c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f4818c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f4822k.f2418a = 0;
        this.f4827p = false;
        float f2 = this.f4821f;
        if (f2 > 0.0f) {
            i(f2);
            this.f4821f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || g() || this.f4818c || this.f4827p) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4833v = motionEvent.getPointerId(0);
            this.f4832u = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4833v);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4832u) {
                    float y4 = (motionEvent.getY(iFindPointerIndex) - this.f4830s) * 0.5f;
                    this.f4832u = false;
                    i(y4);
                }
                this.f4833v = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f4833v);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y5 = motionEvent.getY(iFindPointerIndex2);
                n(y5);
                if (this.f4832u) {
                    float f2 = (y5 - this.f4830s) * 0.5f;
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    j(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f4833v = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f4833v) {
                        this.f4833v = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ViewParent parent;
        View view = this.f4816a;
        if (view != null) {
            WeakHashMap weakHashMap = S.f2363a;
            if (!H.p(view)) {
                if (this.f4812K || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z4);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void setAnimationProgress(float f2) {
        this.f4835x.setScaleX(f2);
        this.f4835x.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        e eVar = this.f4806D;
        d dVar = eVar.f1299a;
        dVar.i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = B.l.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f4820e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z4) {
        this.f4812K = z4;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0128n c0128n = this.f4823l;
        if (c0128n.f2407d) {
            WeakHashMap weakHashMap = S.f2363a;
            H.z(c0128n.f2406c);
        }
        c0128n.f2407d = z4;
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f4817b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f4835x.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(B.l.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z4) {
        if (!z4 || this.f4818c == z4) {
            m(z4, false);
            return;
        }
        this.f4818c = z4;
        setTargetOffsetTopAndBottom((this.f4804B + this.f4803A) - this.f4829r);
        this.f4810I = false;
        f fVar = this.f4813L;
        this.f4835x.setVisibility(0);
        this.f4806D.setAlpha(255);
        g gVar = new g(this, 0);
        this.f4807E = gVar;
        gVar.setDuration(this.f4828q);
        if (fVar != null) {
            this.f4835x.f1273a = fVar;
        }
        this.f4835x.clearAnimation();
        this.f4835x.startAnimation(this.f4807E);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f4811J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4811J = (int) (displayMetrics.density * 40.0f);
            }
            this.f4835x.setImageDrawable(null);
            this.f4806D.c(i);
            this.f4835x.setImageDrawable(this.f4806D);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f4805C = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        a aVar = this.f4835x;
        aVar.bringToFront();
        WeakHashMap weakHashMap = S.f2363a;
        aVar.offsetTopAndBottom(i);
        this.f4829r = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4823l.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f4823l.h(0);
    }
}
