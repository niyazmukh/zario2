package M;

import android.view.View;
import android.view.Window;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\Z.smali */
public abstract class Z {
    public static void a(Window window, boolean z4) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
