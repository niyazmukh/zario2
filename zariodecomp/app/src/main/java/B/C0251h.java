package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.InterfaceC0239t;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.m0;
import g0.AbstractActivityC0570w;

/* renamed from: b.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\h.smali */
public final class C0251h implements InterfaceC0239t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0570w f4896b;

    public /* synthetic */ C0251h(AbstractActivityC0570w abstractActivityC0570w, int i) {
        this.f4895a = i;
        this.f4896b = abstractActivityC0570w;
    }

    @Override // androidx.lifecycle.InterfaceC0239t
    public final void onStateChanged(InterfaceC0241v interfaceC0241v, androidx.lifecycle.n nVar) {
        switch (this.f4895a) {
            case 0:
                if (nVar == androidx.lifecycle.n.ON_STOP) {
                    Window window = this.f4896b.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    this.f4896b.f4903b.f410a = null;
                    if (!this.f4896b.isChangingConfigurations()) {
                        this.f4896b.e().a();
                    }
                    ExecutorC0254k executorC0254k = this.f4896b.f4910m;
                    AbstractActivityC0570w abstractActivityC0570w = executorC0254k.f4901d;
                    abstractActivityC0570w.getWindow().getDecorView().removeCallbacks(executorC0254k);
                    abstractActivityC0570w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0254k);
                    break;
                }
                break;
            default:
                AbstractActivityC0570w abstractActivityC0570w2 = this.f4896b;
                if (abstractActivityC0570w2.f4907f == null) {
                    C0253j c0253j = (C0253j) abstractActivityC0570w2.getLastNonConfigurationInstance();
                    if (c0253j != null) {
                        abstractActivityC0570w2.f4907f = c0253j.f4897a;
                    }
                    if (abstractActivityC0570w2.f4907f == null) {
                        abstractActivityC0570w2.f4907f = new m0();
                    }
                }
                abstractActivityC0570w2.f4905d.f(this);
                break;
        }
    }
}
