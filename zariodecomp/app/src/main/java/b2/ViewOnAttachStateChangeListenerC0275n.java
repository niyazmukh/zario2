package b2;

import M.E;
import M.F;
import M.S;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import k.ViewOnKeyListenerC0640D;
import k.ViewOnKeyListenerC0647f;

/* renamed from: b2.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\n.smali */
public final class ViewOnAttachStateChangeListenerC0275n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5030b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0275n(Object obj, int i) {
        this.f5029a = i;
        this.f5030b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f5030b;
        switch (this.f5029a) {
            case 0:
                C0276o c0276o = (C0276o) obj;
                if (c0276o.f5051y != null && (accessibilityManager = c0276o.f5050x) != null) {
                    WeakHashMap weakHashMap = S.f2363a;
                    if (E.b(c0276o)) {
                        N.c.a(accessibilityManager, c0276o.f5051y);
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = S.f2363a;
                F.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f5029a) {
            case 0:
                C0276o c0276o = (C0276o) this.f5030b;
                N.d dVar = c0276o.f5051y;
                if (dVar != null && (accessibilityManager = c0276o.f5050x) != null) {
                    N.c.b(accessibilityManager, dVar);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0647f viewOnKeyListenerC0647f = (ViewOnKeyListenerC0647f) this.f5030b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0647f.f8179B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0647f.f8179B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0647f.f8179B.removeGlobalOnLayoutListener(viewOnKeyListenerC0647f.f8189m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0640D viewOnKeyListenerC0640D = (ViewOnKeyListenerC0640D) this.f5030b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0640D.f8149s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0640D.f8149s = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0640D.f8149s.removeGlobalOnLayoutListener(viewOnKeyListenerC0640D.f8143m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
