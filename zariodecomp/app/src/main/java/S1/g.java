package S1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\g.smali */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2964b;

    public /* synthetic */ g(h hVar, int i) {
        this.f2963a = i;
        this.f2964b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2963a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f2964b;
                hVar.b();
                c cVar = hVar.f2975k;
                if (cVar != null) {
                    cVar.a((p) hVar.f2998a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f2963a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f2964b;
                hVar.h = (hVar.h + 4) % hVar.f2973g.f2955c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
