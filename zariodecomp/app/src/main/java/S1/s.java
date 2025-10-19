package S1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\s.smali */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3013b;

    public /* synthetic */ s(t tVar, int i) {
        this.f3012a = i;
        this.f3013b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3012a) {
            case 1:
                super.onAnimationEnd(animator);
                t tVar = this.f3013b;
                tVar.b();
                c cVar = tVar.f3022k;
                if (cVar != null) {
                    cVar.a((p) tVar.f2998a);
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
        switch (this.f3012a) {
            case 0:
                super.onAnimationRepeat(animator);
                t tVar = this.f3013b;
                tVar.h = (tVar.h + 1) % tVar.f3020g.f2955c.length;
                tVar.i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
