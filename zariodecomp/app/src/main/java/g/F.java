package g;

import M.S;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\F.smali */
public final class F extends S0.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f7125c;

    public /* synthetic */ F(H h, int i) {
        this.f7124b = i;
        this.f7125c = h;
    }

    @Override // M.Y
    public final void a() {
        View view;
        H h = this.f7125c;
        switch (this.f7124b) {
            case 0:
                if (h.f7148t && (view = h.f7140l) != null) {
                    view.setTranslationY(0.0f);
                    h.i.setTranslationY(0.0f);
                }
                h.i.setVisibility(8);
                h.i.setTransitioning(false);
                h.f7152x = null;
                S0.v vVar = h.f7144p;
                if (vVar != null) {
                    vVar.g(h.f7143o);
                    h.f7143o = null;
                    h.f7144p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = h.h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f2363a;
                    M.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                h.f7152x = null;
                h.i.requestLayout();
                break;
        }
    }
}
