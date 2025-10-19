package g0;

import A2.RunnableC0016p;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\g.1.smali */
public final class AnimationAnimationListenerC0555g implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f7456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0556h f7457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0552d f7459d;

    public AnimationAnimationListenerC0555g(V v4, C0556h c0556h, View view, C0552d c0552d) {
        this.f7456a = v4;
        this.f7457b = c0556h;
        this.f7458c = view;
        this.f7459d = c0552d;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        C0556h c0556h = this.f7457b;
        c0556h.f7460a.post(new RunnableC0016p(c0556h, this.f7458c, this.f7459d, 5));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7456a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7456a + " has reached onAnimationStart.");
        }
    }
}
