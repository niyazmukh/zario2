package M;

import android.graphics.Rect;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\D.smali */
public abstract class D {
    public static Rect a(View view) {
        return view.getClipBounds();
    }

    public static boolean b(View view) {
        return view.isInLayout();
    }

    public static void c(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
