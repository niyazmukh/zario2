package M;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\C.smali */
public abstract class C {
    public static int a() {
        return View.generateViewId();
    }

    public static Display b(View view) {
        return view.getDisplay();
    }

    public static int c(View view) {
        return view.getLabelFor();
    }

    public static int d(View view) {
        return view.getLayoutDirection();
    }

    public static int e(View view) {
        return view.getPaddingEnd();
    }

    public static int f(View view) {
        return view.getPaddingStart();
    }

    public static boolean g(View view) {
        return view.isPaddingRelative();
    }

    public static void h(View view, int i) {
        view.setLabelFor(i);
    }

    public static void i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void j(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static void k(View view, int i, int i5, int i6, int i7) {
        view.setPaddingRelative(i, i5, i6, i7);
    }
}
