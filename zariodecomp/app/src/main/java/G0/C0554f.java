package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\f.1.smali */
public final class C0554f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0556h f7451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f7454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0552d f7455e;

    public C0554f(C0556h c0556h, View view, boolean z4, V v4, C0552d c0552d) {
        this.f7451a = c0556h;
        this.f7452b = view;
        this.f7453c = z4;
        this.f7454d = v4;
        this.f7455e = c0552d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.i.e(anim, "anim");
        ViewGroup viewGroup = this.f7451a.f7460a;
        View viewToAnimate = this.f7452b;
        viewGroup.endViewTransition(viewToAnimate);
        V v4 = this.f7454d;
        if (this.f7453c) {
            int i = v4.f7406a;
            kotlin.jvm.internal.i.d(viewToAnimate, "viewToAnimate");
            B.a.a(viewToAnimate, i);
        }
        this.f7455e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + v4 + " has ended.");
        }
    }
}
