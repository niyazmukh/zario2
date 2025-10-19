package k;

import A2.C0009i;
import android.widget.PopupWindow;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\u.smali */
public final class u implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8282b;

    public /* synthetic */ u(Object obj, int i) {
        this.f8281a = i;
        this.f8282b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f8281a) {
            case 0:
                ((w) this.f8282b).c();
                break;
            default:
                ((C0009i) this.f8282b).getClass();
                break;
        }
    }
}
