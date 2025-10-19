package M;

import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\N.smali */
public abstract class N {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static boolean c(View view) {
        return view.isImportantForContentCapture();
    }

    public static void d(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
