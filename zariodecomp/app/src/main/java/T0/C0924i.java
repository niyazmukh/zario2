package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\i.1.smali */
public final class C0924i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0925j f10029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0926l f10032e;

    public /* synthetic */ C0924i(C0926l c0926l, C0925j c0925j, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f10028a = i;
        this.f10032e = c0926l;
        this.f10029b = c0925j;
        this.f10030c = viewPropertyAnimator;
        this.f10031d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10028a) {
            case 0:
                this.f10030c.setListener(null);
                View view = this.f10031d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0925j c0925j = this.f10029b;
                g0 g0Var = c0925j.f10035a;
                C0926l c0926l = this.f10032e;
                c0926l.c(g0Var);
                c0926l.f10060r.remove(c0925j.f10035a);
                c0926l.i();
                break;
            default:
                this.f10030c.setListener(null);
                View view2 = this.f10031d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0925j c0925j2 = this.f10029b;
                g0 g0Var2 = c0925j2.f10036b;
                C0926l c0926l2 = this.f10032e;
                c0926l2.c(g0Var2);
                c0926l2.f10060r.remove(c0925j2.f10036b);
                c0926l2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10028a) {
            case 0:
                g0 g0Var = this.f10029b.f10035a;
                this.f10032e.getClass();
                break;
            default:
                g0 g0Var2 = this.f10029b.f10036b;
                this.f10032e.getClass();
                break;
        }
    }
}
