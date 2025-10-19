package g0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\y.smali */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0548P f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f7567b;

    public y(z zVar, C0548P c0548p) {
        this.f7567b = zVar;
        this.f7566a = c0548p;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0548P c0548p = this.f7566a;
        c0548p.k();
        C0556h.g((ViewGroup) c0548p.f7385c.f7512J.getParent(), this.f7567b.f7568a).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
