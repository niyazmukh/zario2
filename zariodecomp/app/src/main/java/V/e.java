package V;

import B3.N;
import M.S;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V\e.smali */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f3404v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f3405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3406b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3408d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3409e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3410f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3411g;
    public int[] h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3412j;

    /* renamed from: k, reason: collision with root package name */
    public int f3413k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3414l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3415m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3416n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3417o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f3418p;

    /* renamed from: q, reason: collision with root package name */
    public final p1.b f3419q;

    /* renamed from: r, reason: collision with root package name */
    public View f3420r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3421s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f3422t;

    /* renamed from: c, reason: collision with root package name */
    public int f3407c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final N f3423u = new N(this, 18);

    public e(Context context, CoordinatorLayout coordinatorLayout, p1.b bVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3422t = coordinatorLayout;
        this.f3419q = bVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3417o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3406b = viewConfiguration.getScaledTouchSlop();
        this.f3415m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3416n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3418p = new OverScroller(context, f3404v);
    }

    public final void a() {
        this.f3407c = -1;
        float[] fArr = this.f3408d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3409e, 0.0f);
            Arrays.fill(this.f3410f, 0.0f);
            Arrays.fill(this.f3411g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3412j, 0);
            this.f3413k = 0;
        }
        VelocityTracker velocityTracker = this.f3414l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3414l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3422t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3420r = view;
        this.f3407c = i;
        this.f3419q.G(view, i);
        n(1);
    }

    public final boolean c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        p1.b bVar = this.f3419q;
        boolean z4 = bVar.v(view) > 0;
        boolean z5 = bVar.w() > 0;
        if (!z4 || !z5) {
            return z4 ? Math.abs(f2) > ((float) this.f3406b) : z5 && Math.abs(f3) > ((float) this.f3406b);
        }
        float f5 = (f3 * f3) + (f2 * f2);
        int i = this.f3406b;
        return f5 > ((float) (i * i));
    }

    public final void d(int i) {
        float[] fArr = this.f3408d;
        if (fArr != null) {
            int i5 = this.f3413k;
            int i6 = 1 << i;
            if ((i5 & i6) != 0) {
                fArr[i] = 0.0f;
                this.f3409e[i] = 0.0f;
                this.f3410f[i] = 0.0f;
                this.f3411g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f3412j[i] = 0;
                this.f3413k = (~i6) & i5;
            }
        }
    }

    public final int e(int i, int i5, int i6) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3422t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i5);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3405a == 2) {
            OverScroller overScroller = this.f3418p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3420r.getLeft();
            int top = currY - this.f3420r.getTop();
            if (left != 0) {
                View view = this.f3420r;
                WeakHashMap weakHashMap = S.f2363a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3420r;
                WeakHashMap weakHashMap2 = S.f2363a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3419q.I(this.f3420r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f3422t.post(this.f3423u);
            }
        }
        return this.f3405a == 2;
    }

    public final View g(int i, int i5) {
        CoordinatorLayout coordinatorLayout = this.f3422t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3419q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i5, int i6, int i7) {
        float f2;
        float f3;
        float f5;
        float f6;
        int left = this.f3420r.getLeft();
        int top = this.f3420r.getTop();
        int i8 = i - left;
        int i9 = i5 - top;
        OverScroller overScroller = this.f3418p;
        int i10 = 0;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f3420r;
        int i11 = (int) this.f3416n;
        int i12 = (int) this.f3415m;
        int iAbs = Math.abs(i6);
        if (iAbs < i11) {
            i6 = 0;
        } else if (iAbs > i12) {
            i6 = i6 > 0 ? i12 : -i12;
        }
        int iAbs2 = Math.abs(i7);
        if (iAbs2 < i11) {
            i7 = i10;
        } else if (iAbs2 > i12) {
            if (i7 > 0) {
                i7 = i12;
            } else {
                i10 = -i12;
                i7 = i10;
            }
        }
        int iAbs3 = Math.abs(i8);
        int iAbs4 = Math.abs(i9);
        int iAbs5 = Math.abs(i6);
        int iAbs6 = Math.abs(i7);
        int i13 = iAbs5 + iAbs6;
        int i14 = iAbs3 + iAbs4;
        if (i6 != 0) {
            f2 = iAbs5;
            f3 = i13;
        } else {
            f2 = iAbs3;
            f3 = i14;
        }
        float f7 = f2 / f3;
        if (i7 != 0) {
            f5 = iAbs6;
            f6 = i13;
        } else {
            f5 = iAbs4;
            f6 = i14;
        }
        float f8 = f5 / f6;
        p1.b bVar = this.f3419q;
        overScroller.startScroll(left, top, i8, i9, (int) ((e(i9, i7, bVar.w()) * f8) + (e(i8, i6, bVar.v(view)) * f7)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f3413k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3414l == null) {
            this.f3414l = VelocityTracker.obtain();
        }
        this.f3414l.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x3, (int) y4);
            l(x3, y4, pointerId);
            q(viewG, pointerId);
            int i6 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3405a == 1) {
                k();
            }
            a();
            return;
        }
        p1.b bVar = this.f3419q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3405a == 1) {
                    this.f3421s = true;
                    bVar.J(this.f3420r, 0.0f, 0.0f);
                    this.f3421s = false;
                    if (this.f3405a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                l(x4, y5, pointerId2);
                if (this.f3405a == 0) {
                    q(g((int) x4, (int) y5), pointerId2);
                    int i7 = this.h[pointerId2];
                    return;
                }
                int i8 = (int) x4;
                int i9 = (int) y5;
                View view = this.f3420r;
                if (view != null) {
                    i5 = (i8 < view.getLeft() || i8 >= view.getRight() || i9 < view.getTop() || i9 >= view.getBottom()) ? 0 : 1;
                }
                if (i5 != 0) {
                    q(this.f3420r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3405a == 1 && pointerId3 == this.f3407c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i5 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i5);
                    if (pointerId4 != this.f3407c) {
                        View viewG2 = g((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                        View view2 = this.f3420r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i = this.f3407c;
                            break;
                        }
                    }
                    i5++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f3405a == 1) {
            if (i(this.f3407c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3407c);
                float x5 = motionEvent.getX(iFindPointerIndex);
                float y6 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f3410f;
                int i10 = this.f3407c;
                int i11 = (int) (x5 - fArr[i10]);
                int i12 = (int) (y6 - this.f3411g[i10]);
                int left = this.f3420r.getLeft() + i11;
                int top = this.f3420r.getTop() + i12;
                int left2 = this.f3420r.getLeft();
                int top2 = this.f3420r.getTop();
                if (i11 != 0) {
                    left = bVar.l(this.f3420r, left);
                    WeakHashMap weakHashMap = S.f2363a;
                    this.f3420r.offsetLeftAndRight(left - left2);
                }
                if (i12 != 0) {
                    top = bVar.m(this.f3420r, top);
                    WeakHashMap weakHashMap2 = S.f2363a;
                    this.f3420r.offsetTopAndBottom(top - top2);
                }
                if (i11 != 0 || i12 != 0) {
                    bVar.I(this.f3420r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i5 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i5);
            if (i(pointerId5)) {
                float x6 = motionEvent.getX(i5);
                float y7 = motionEvent.getY(i5);
                float f2 = x6 - this.f3408d[pointerId5];
                float f3 = y7 - this.f3409e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i13 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i14 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i15 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i16 = this.h[pointerId5];
                if (this.f3405a != 1) {
                    View viewG3 = g((int) x6, (int) y7);
                    if (c(viewG3, f2, f3) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i5++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3414l;
        float f2 = this.f3415m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f3414l.getXVelocity(this.f3407c);
        float f3 = this.f3416n;
        float fAbs = Math.abs(xVelocity);
        float f5 = 0.0f;
        if (fAbs < f3) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f3414l.getYVelocity(this.f3407c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f3) {
            if (fAbs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f5 = f2;
            } else {
                f5 = yVelocity;
            }
        }
        this.f3421s = true;
        this.f3419q.J(this.f3420r, xVelocity, f5);
        this.f3421s = false;
        if (this.f3405a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i) {
        float[] fArr = this.f3408d;
        if (fArr == null || fArr.length <= i) {
            int i5 = i + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3409e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3410f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3411g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3412j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3408d = fArr2;
            this.f3409e = fArr3;
            this.f3410f = fArr4;
            this.f3411g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f3412j = iArr3;
        }
        float[] fArr9 = this.f3408d;
        this.f3410f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f3409e;
        this.f3411g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.h;
        int i6 = (int) f2;
        int i7 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f3422t;
        int left = coordinatorLayout.getLeft();
        int i8 = this.f3417o;
        int i9 = i6 < left + i8 ? 1 : 0;
        if (i7 < coordinatorLayout.getTop() + i8) {
            i9 |= 4;
        }
        if (i6 > coordinatorLayout.getRight() - i8) {
            i9 |= 2;
        }
        if (i7 > coordinatorLayout.getBottom() - i8) {
            i9 |= 8;
        }
        iArr7[i] = i9;
        this.f3413k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x3 = motionEvent.getX(i);
                float y4 = motionEvent.getY(i);
                this.f3410f[pointerId] = x3;
                this.f3411g[pointerId] = y4;
            }
        }
    }

    public final void n(int i) {
        this.f3422t.removeCallbacks(this.f3423u);
        if (this.f3405a != i) {
            this.f3405a = i;
            this.f3419q.H(i);
            if (this.f3405a == 0) {
                this.f3420r = null;
            }
        }
    }

    public final boolean o(int i, int i5) {
        if (this.f3421s) {
            return h(i, i5, (int) this.f3414l.getXVelocity(this.f3407c), (int) this.f3414l.getYVelocity(this.f3407c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i) {
        if (view == this.f3420r && this.f3407c == i) {
            return true;
        }
        if (view == null || !this.f3419q.S(view, i)) {
            return false;
        }
        this.f3407c = i;
        b(view, i);
        return true;
    }
}
