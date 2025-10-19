package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\h.1.smali */
public final class C0923h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f10020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0926l f10025f;

    public C0923h(C0926l c0926l, g0 g0Var, int i, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10025f = c0926l;
        this.f10020a = g0Var;
        this.f10021b = i;
        this.f10022c = view;
        this.f10023d = i5;
        this.f10024e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f10021b;
        View view = this.f10022c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10023d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10024e.setListener(null);
        C0926l c0926l = this.f10025f;
        g0 g0Var = this.f10020a;
        c0926l.c(g0Var);
        c0926l.f10058p.remove(g0Var);
        c0926l.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10025f.getClass();
    }
}
