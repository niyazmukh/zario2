package D0;

import android.animation.Animator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\c.smali */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1276b;

    public c(e eVar, d dVar) {
        this.f1276b = eVar;
        this.f1275a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f1276b;
        d dVar = this.f1275a;
        eVar.a(1.0f, dVar, true);
        dVar.f1285k = dVar.f1281e;
        dVar.f1286l = dVar.f1282f;
        dVar.f1287m = dVar.f1283g;
        dVar.a((dVar.f1284j + 1) % dVar.i.length);
        if (!eVar.f1304f) {
            eVar.f1303e += 1.0f;
            return;
        }
        eVar.f1304f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f1288n) {
            dVar.f1288n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1276b.f1303e = 0.0f;
    }
}
