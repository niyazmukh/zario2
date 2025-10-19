package k;

import M.S;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.F0;
import l.G;
import l.H;
import l.M;
import l.P;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\d.1.smali */
public final class ViewTreeObserverOnGlobalLayoutListenerC0645d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8174b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0645d(Object obj, int i) {
        this.f8173a = i;
        this.f8174b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj = this.f8174b;
        switch (this.f8173a) {
            case 0:
                ViewOnKeyListenerC0647f viewOnKeyListenerC0647f = (ViewOnKeyListenerC0647f) obj;
                if (viewOnKeyListenerC0647f.b()) {
                    ArrayList arrayList = viewOnKeyListenerC0647f.f8188l;
                    if (arrayList.size() > 0 && !((C0646e) arrayList.get(0)).f8175a.f8722C) {
                        View view = viewOnKeyListenerC0647f.f8195s;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0646e) it.next()).f8175a.f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0647f.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0640D viewOnKeyListenerC0640D = (ViewOnKeyListenerC0640D) obj;
                if (viewOnKeyListenerC0640D.b()) {
                    F0 f02 = viewOnKeyListenerC0640D.f8142l;
                    if (!f02.f8722C) {
                        View view2 = viewOnKeyListenerC0640D.f8147q;
                        if (view2 != null && view2.isShown()) {
                            f02.f();
                            break;
                        } else {
                            viewOnKeyListenerC0640D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                P p5 = (P) obj;
                if (!p5.getInternalPopup().b()) {
                    p5.f8487f.e(H.b(p5), H.a(p5));
                }
                ViewTreeObserver viewTreeObserver = p5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    G.a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                M m5 = (M) obj;
                P p6 = m5.f8477I;
                m5.getClass();
                WeakHashMap weakHashMap = S.f2363a;
                if (!M.E.b(p6) || !p6.getGlobalVisibleRect(m5.G)) {
                    m5.dismiss();
                    break;
                } else {
                    m5.s();
                    m5.f();
                    break;
                }
                break;
        }
    }
}
