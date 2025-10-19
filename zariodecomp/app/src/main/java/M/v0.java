package M;

import a.AbstractC0183a;
import android.view.View;
import android.view.Window;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\v0.smali */
public final class v0 extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final Window f2428a;

    public v0(Window window, G2.e eVar) {
        this.f2428a = window;
    }

    @Override // a.AbstractC0183a
    public final void e0(boolean z4) {
        if (!z4) {
            r0(16);
            return;
        }
        Window window = this.f2428a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        q0(16);
    }

    @Override // a.AbstractC0183a
    public final void f0(boolean z4) {
        if (!z4) {
            r0(8192);
            return;
        }
        Window window = this.f2428a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        q0(8192);
    }

    public final void q0(int i) {
        View decorView = this.f2428a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void r0(int i) {
        View decorView = this.f2428a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
