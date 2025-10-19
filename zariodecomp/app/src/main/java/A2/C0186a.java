package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\a.smali */
public final class C0186a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0193h f4061b;

    public /* synthetic */ C0186a(AbstractC0193h abstractC0193h, int i) {
        this.f4060a = i;
        this.f4061b = abstractC0193h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4060a) {
            case 0:
                this.f4061b.b();
                break;
            case 1:
                this.f4061b.c();
                break;
            case 2:
                this.f4061b.b();
                break;
            default:
                this.f4061b.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4060a) {
            case 1:
                AbstractC0193h abstractC0193h = this.f4061b;
                SnackbarContentLayout snackbarContentLayout = abstractC0193h.f4092j;
                int i = abstractC0193h.f4087c;
                int i5 = abstractC0193h.f4085a;
                int i6 = i - i5;
                snackbarContentLayout.f6110a.setAlpha(0.0f);
                long j5 = i5;
                ViewPropertyAnimator duration = snackbarContentLayout.f6110a.animate().alpha(1.0f).setDuration(j5);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f6112c;
                long j6 = i6;
                duration.setInterpolator(timeInterpolator).setStartDelay(j6).start();
                if (snackbarContentLayout.f6111b.getVisibility() == 0) {
                    snackbarContentLayout.f6111b.setAlpha(0.0f);
                    snackbarContentLayout.f6111b.animate().alpha(1.0f).setDuration(j5).setInterpolator(timeInterpolator).setStartDelay(j6).start();
                    break;
                }
                break;
            case 2:
                AbstractC0193h abstractC0193h2 = this.f4061b;
                SnackbarContentLayout snackbarContentLayout2 = abstractC0193h2.f4092j;
                snackbarContentLayout2.f6110a.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout2.f6110a.animate().alpha(0.0f);
                long j7 = abstractC0193h2.f4086b;
                ViewPropertyAnimator duration2 = viewPropertyAnimatorAlpha.setDuration(j7);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f6112c;
                long j8 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j8).start();
                if (snackbarContentLayout2.f6111b.getVisibility() == 0) {
                    snackbarContentLayout2.f6111b.setAlpha(1.0f);
                    snackbarContentLayout2.f6111b.animate().alpha(0.0f).setDuration(j7).setInterpolator(timeInterpolator2).setStartDelay(j8).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C0186a(AbstractC0193h abstractC0193h, int i, int i5) {
        this.f4060a = i5;
        this.f4061b = abstractC0193h;
    }
}
