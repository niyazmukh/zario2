package M;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\F.smali */
public abstract class F {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
