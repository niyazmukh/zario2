package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\g.1.smali */
public final class C0922g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9998a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f9999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0926l f10002e;

    public C0922g(C0926l c0926l, g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10002e = c0926l;
        this.f9999b = g0Var;
        this.f10001d = viewPropertyAnimator;
        this.f10000c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9998a) {
            case 1:
                this.f10000c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9998a) {
            case 0:
                this.f10001d.setListener(null);
                this.f10000c.setAlpha(1.0f);
                C0926l c0926l = this.f10002e;
                g0 g0Var = this.f9999b;
                c0926l.c(g0Var);
                c0926l.f10059q.remove(g0Var);
                c0926l.i();
                break;
            default:
                this.f10001d.setListener(null);
                C0926l c0926l2 = this.f10002e;
                g0 g0Var2 = this.f9999b;
                c0926l2.c(g0Var2);
                c0926l2.f10057o.remove(g0Var2);
                c0926l2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f9998a) {
            case 0:
                this.f10002e.getClass();
                break;
            default:
                this.f10002e.getClass();
                break;
        }
    }

    public C0922g(C0926l c0926l, g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10002e = c0926l;
        this.f9999b = g0Var;
        this.f10000c = view;
        this.f10001d = viewPropertyAnimator;
    }
}
