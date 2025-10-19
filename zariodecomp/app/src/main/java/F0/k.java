package F0;

import M.Y;
import M.d0;
import M.i0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F0\k.smali */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1608c;

    public /* synthetic */ k(Object obj, View view, int i) {
        this.f1606a = i;
        this.f1607b = obj;
        this.f1608c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1606a) {
            case 1:
                ((Y) this.f1607b).b((View) this.f1608c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1606a) {
            case 0:
                ((q.b) this.f1607b).remove(animator);
                ((n) this.f1608c).f1629q.remove(animator);
                break;
            case 1:
                ((Y) this.f1607b).a();
                break;
            default:
                ((i0) this.f1607b).f2396a.d(1.0f);
                d0.e((View) this.f1608c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1606a) {
            case 0:
                ((n) this.f1608c).f1629q.add(animator);
                break;
            case 1:
                ((Y) this.f1607b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(n nVar, q.b bVar) {
        this.f1606a = 0;
        this.f1608c = nVar;
        this.f1607b = bVar;
    }
}
