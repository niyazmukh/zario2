package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import k.ViewTreeObserverOnGlobalLayoutListenerC0645d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\L.smali */
public final class L implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0645d f8470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f8471b;

    public L(M m5, ViewTreeObserverOnGlobalLayoutListenerC0645d viewTreeObserverOnGlobalLayoutListenerC0645d) {
        this.f8471b = m5;
        this.f8470a = viewTreeObserverOnGlobalLayoutListenerC0645d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8471b.f8477I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8470a);
        }
    }
}
