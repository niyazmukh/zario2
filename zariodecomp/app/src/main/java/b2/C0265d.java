package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\d.smali */
public final class C0265d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0266e f5001b;

    public /* synthetic */ C0265d(C0266e c0266e, int i) {
        this.f5000a = i;
        this.f5001b = c0266e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f5000a) {
            case 1:
                this.f5001b.f5054b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f5000a) {
            case 0:
                this.f5001b.f5054b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
