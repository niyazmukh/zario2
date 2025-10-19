package Q;

import B3.N;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import l.C0703n0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\g.smali */
public final class g implements View.OnTouchListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f2687v = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f2689b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f2690c;

    /* renamed from: d, reason: collision with root package name */
    public N f2691d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f2692e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f2693f;

    /* renamed from: k, reason: collision with root package name */
    public final int f2694k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2695l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f2696m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f2697n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f2698o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2699p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2700q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2701r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2702s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2703t;

    /* renamed from: u, reason: collision with root package name */
    public final C0703n0 f2704u;

    public g(C0703n0 c0703n0) {
        a aVar = new a();
        aVar.f2684e = Long.MIN_VALUE;
        aVar.f2686g = -1L;
        aVar.f2685f = 0L;
        this.f2688a = aVar;
        this.f2689b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2692e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2693f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2696m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2697n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2698o = fArr5;
        this.f2690c = c0703n0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f5 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f2694k = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2695l = f2687v;
        aVar.f2680a = 500;
        aVar.f2681b = 500;
        this.f2704u = c0703n0;
    }

    public static float b(float f2, float f3, float f5) {
        return f2 > f5 ? f5 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2692e
            r0 = r0[r4]
            float[] r1 = r3.f2693f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f2689b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f2696m
            r0 = r0[r4]
            float[] r1 = r3.f2697n
            r1 = r1[r4]
            float[] r3 = r3.f2698o
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.g.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2694k;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f2702s && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f2700q) {
            this.f2702s = false;
            return;
        }
        a aVar = this.f2688a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (jCurrentAnimationTimeMillis - aVar.f2684e);
        int i6 = aVar.f2681b;
        if (i5 > i6) {
            i = i6;
        } else if (i5 >= 0) {
            i = i5;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f2686g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C0703n0 c0703n0;
        int count;
        a aVar = this.f2688a;
        float f2 = aVar.f2683d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f2682c);
        if (iAbs == 0 || (count = (c0703n0 = this.f2704u).getCount()) == 0) {
            return false;
        }
        int childCount = c0703n0.getChildCount();
        int firstVisiblePosition = c0703n0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && c0703n0.getChildAt(childCount - 1).getBottom() <= c0703n0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0703n0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f2703t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.d()
            goto L7d
        L1a:
            r7.f2701r = r2
            r7.f2699p = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f2690c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            Q.a r9 = r7.f2688a
            r9.f2682c = r0
            r9.f2683d = r8
            boolean r8 = r7.f2702s
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            B3.N r8 = r7.f2691d
            if (r8 != 0) goto L61
            B3.N r8 = new B3.N
            r9 = 17
            r8.<init>(r7, r9)
            r7.f2691d = r8
        L61:
            r7.f2702s = r2
            r7.f2700q = r2
            boolean r8 = r7.f2699p
            if (r8 != 0) goto L76
            int r8 = r7.f2695l
            if (r8 <= 0) goto L76
            B3.N r9 = r7.f2691d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = M.S.f2363a
            M.B.n(r4, r9, r5)
            goto L7b
        L76:
            B3.N r8 = r7.f2691d
            r8.run()
        L7b:
            r7.f2699p = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
