package S1;

import N2.AbstractC0156x;
import android.animation.ObjectAnimator;
import j0.C0623a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\h.smali */
public final class h extends o {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2965l = {0, 1350, 2700, 4050};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2966m = {667, 2017, 3367, 4717};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2967n = {1000, 2350, 3700, 5050};

    /* renamed from: o, reason: collision with root package name */
    public static final F0.c f2968o = new F0.c(Float.class, "animationFraction", 7);

    /* renamed from: p, reason: collision with root package name */
    public static final F0.c f2969p = new F0.c(Float.class, "completeEndFraction", 8);

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f2970d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f2971e;

    /* renamed from: f, reason: collision with root package name */
    public final C0623a f2972f;

    /* renamed from: g, reason: collision with root package name */
    public final i f2973g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2974j;

    /* renamed from: k, reason: collision with root package name */
    public c f2975k;

    public h(i iVar) {
        super(1);
        this.h = 0;
        this.f2975k = null;
        this.f2973g = iVar;
        this.f2972f = new C0623a(1);
    }

    @Override // S1.o
    public final void b() {
        ObjectAnimator objectAnimator = this.f2970d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // S1.o
    public final void o() {
        this.h = 0;
        ((int[]) this.f3000c)[0] = AbstractC0156x.k(this.f2973g.f2955c[0], ((p) this.f2998a).f2995n);
        this.f2974j = 0.0f;
    }

    @Override // S1.o
    public final void p(c cVar) {
        this.f2975k = cVar;
    }

    @Override // S1.o
    public final void r() {
        ObjectAnimator objectAnimator = this.f2971e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((p) this.f2998a).isVisible()) {
            this.f2971e.start();
        } else {
            b();
        }
    }

    @Override // S1.o
    public final void s() {
        if (this.f2970d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f2968o, 0.0f, 1.0f);
            this.f2970d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f2970d.setInterpolator(null);
            this.f2970d.setRepeatCount(-1);
            this.f2970d.addListener(new g(this, 0));
        }
        if (this.f2971e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f2969p, 0.0f, 1.0f);
            this.f2971e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f2971e.setInterpolator(this.f2972f);
            this.f2971e.addListener(new g(this, 1));
        }
        this.h = 0;
        ((int[]) this.f3000c)[0] = AbstractC0156x.k(this.f2973g.f2955c[0], ((p) this.f2998a).f2995n);
        this.f2974j = 0.0f;
        this.f2970d.start();
    }

    @Override // S1.o
    public final void u() {
        this.f2975k = null;
    }
}
