package S1;

import N2.AbstractC0156x;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\t.smali */
public final class t extends o {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f3014l = {533, 567, 850, 750};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f3015m = {1267, 1000, 333, 0};

    /* renamed from: n, reason: collision with root package name */
    public static final F0.c f3016n = new F0.c(Float.class, "animationFraction", 11);

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f3017d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f3018e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator[] f3019f;

    /* renamed from: g, reason: collision with root package name */
    public final u f3020g;
    public int h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public float f3021j;

    /* renamed from: k, reason: collision with root package name */
    public c f3022k;

    public t(Context context, u uVar) {
        super(2);
        this.h = 0;
        this.f3022k = null;
        this.f3020g = uVar;
        this.f3019f = new Interpolator[]{AnimationUtils.loadInterpolator(context, 2130771997), AnimationUtils.loadInterpolator(context, 2130771998), AnimationUtils.loadInterpolator(context, 2130771999), AnimationUtils.loadInterpolator(context, 2130772000)};
    }

    @Override // S1.o
    public final void b() {
        ObjectAnimator objectAnimator = this.f3017d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // S1.o
    public final void o() {
        this.h = 0;
        int iK = AbstractC0156x.k(this.f3020g.f2955c[0], ((p) this.f2998a).f2995n);
        int[] iArr = (int[]) this.f3000c;
        iArr[0] = iK;
        iArr[1] = iK;
    }

    @Override // S1.o
    public final void p(c cVar) {
        this.f3022k = cVar;
    }

    @Override // S1.o
    public final void r() {
        ObjectAnimator objectAnimator = this.f3018e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        b();
        if (((p) this.f2998a).isVisible()) {
            this.f3018e.setFloatValues(this.f3021j, 1.0f);
            this.f3018e.setDuration((long) ((1.0f - this.f3021j) * 1800.0f));
            this.f3018e.start();
        }
    }

    @Override // S1.o
    public final void s() {
        ObjectAnimator objectAnimator = this.f3017d;
        F0.c cVar = f3016n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, cVar, 0.0f, 1.0f);
            this.f3017d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f3017d.setInterpolator(null);
            this.f3017d.setRepeatCount(-1);
            this.f3017d.addListener(new s(this, 0));
        }
        if (this.f3018e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, cVar, 1.0f);
            this.f3018e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f3018e.setInterpolator(null);
            this.f3018e.addListener(new s(this, 1));
        }
        this.h = 0;
        int iK = AbstractC0156x.k(this.f3020g.f2955c[0], ((p) this.f2998a).f2995n);
        int[] iArr = (int[]) this.f3000c;
        iArr[0] = iK;
        iArr[1] = iK;
        this.f3017d.start();
    }

    @Override // S1.o
    public final void u() {
        this.f3022k = null;
    }
}
