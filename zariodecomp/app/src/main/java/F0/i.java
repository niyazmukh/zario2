package F0;

import M.B;
import M.S;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;
import t0.C0933s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\i.smali */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1601a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1602b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1603c;

    public i(View view) {
        this.f1603c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1601a) {
            case 1:
                this.f1602b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.f1603c;
        switch (this.f1601a) {
            case 0:
                c cVar = t.f1646a;
                View view = (View) obj;
                view.setTransitionAlpha(1.0f);
                if (this.f1602b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
            default:
                if (!this.f1602b) {
                    C0933s c0933s = (C0933s) obj;
                    if (((Float) c0933s.f10140z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0933s.f10115A = 2;
                        c0933s.f10133s.invalidate();
                        break;
                    } else {
                        c0933s.f10115A = 0;
                        c0933s.g(0);
                        break;
                    }
                } else {
                    this.f1602b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1601a) {
            case 0:
                WeakHashMap weakHashMap = S.f2363a;
                View view = (View) this.f1603c;
                if (B.h(view) && view.getLayerType() == 0) {
                    this.f1602b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(C0933s c0933s) {
        this.f1603c = c0933s;
    }
}
