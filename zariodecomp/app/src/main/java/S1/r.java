package S1;

import N2.AbstractC0156x;
import android.animation.ObjectAnimator;
import j0.C0623a;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\r.smali */
public final class r extends o {

    /* renamed from: j, reason: collision with root package name */
    public static final F0.c f3007j = new F0.c(Float.class, "animationFraction", 10);

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f3008d;

    /* renamed from: e, reason: collision with root package name */
    public final C0623a f3009e;

    /* renamed from: f, reason: collision with root package name */
    public final u f3010f;

    /* renamed from: g, reason: collision with root package name */
    public int f3011g;
    public boolean h;
    public float i;

    public r(u uVar) {
        super(3);
        this.f3011g = 1;
        this.f3010f = uVar;
        this.f3009e = new C0623a(1);
    }

    @Override // S1.o
    public final void b() {
        ObjectAnimator objectAnimator = this.f3008d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // S1.o
    public final void o() {
        this.h = true;
        this.f3011g = 1;
        Arrays.fill((int[]) this.f3000c, AbstractC0156x.k(this.f3010f.f2955c[0], ((p) this.f2998a).f2995n));
    }

    @Override // S1.o
    public final void p(c cVar) {
    }

    @Override // S1.o
    public final void r() {
    }

    @Override // S1.o
    public final void s() {
        if (this.f3008d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3007j, 0.0f, 1.0f);
            this.f3008d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f3008d.setInterpolator(null);
            this.f3008d.setRepeatCount(-1);
            this.f3008d.addListener(new D1.a(this, 3));
        }
        this.h = true;
        this.f3011g = 1;
        Arrays.fill((int[]) this.f3000c, AbstractC0156x.k(this.f3010f.f2955c[0], ((p) this.f2998a).f2995n));
        this.f3008d.start();
    }

    @Override // S1.o
    public final void u() {
    }
}
