package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\x.smali */
public final class x extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final View f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1652b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1653c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1655e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1656f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1654d = true;

    public x(View view, int i) {
        this.f1651a = view;
        this.f1652b = i;
        this.f1653c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // F0.m
    public final void a() {
    }

    @Override // F0.m
    public final void b(n nVar) {
        if (!this.f1656f) {
            c cVar = t.f1646a;
            this.f1651a.setTransitionVisibility(this.f1652b);
            ViewGroup viewGroup = this.f1653c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        nVar.v(this);
    }

    @Override // F0.m
    public final void c() {
        f(false);
    }

    @Override // F0.m
    public final void d(n nVar) {
    }

    @Override // F0.m
    public final void e() {
        f(true);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f1654d || this.f1655e == z4 || (viewGroup = this.f1653c) == null) {
            return;
        }
        this.f1655e = z4;
        viewGroup.suppressLayout(z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1656f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1656f) {
            c cVar = t.f1646a;
            this.f1651a.setTransitionVisibility(this.f1652b);
            ViewGroup viewGroup = this.f1653c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f1656f) {
            return;
        }
        c cVar = t.f1646a;
        this.f1651a.setTransitionVisibility(this.f1652b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f1656f) {
            return;
        }
        c cVar = t.f1646a;
        this.f1651a.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
