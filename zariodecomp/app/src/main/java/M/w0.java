package M;

import a.AbstractC0183a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\w0.smali */
public final class w0 extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f2429a;

    /* renamed from: b, reason: collision with root package name */
    public Window f2430b;

    public w0(WindowInsetsController windowInsetsController, G2.e eVar) {
        this.f2429a = windowInsetsController;
    }

    @Override // a.AbstractC0183a
    public final void e0(boolean z4) {
        Window window = this.f2430b;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f2429a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f2429a.setSystemBarsAppearance(0, 16);
    }

    @Override // a.AbstractC0183a
    public final void f0(boolean z4) {
        Window window = this.f2430b;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f2429a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f2429a.setSystemBarsAppearance(0, 8);
    }
}
