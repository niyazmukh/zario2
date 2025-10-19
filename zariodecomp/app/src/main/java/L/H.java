package l;

import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\H.smali */
public abstract class H {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i) {
        view.setTextAlignment(i);
    }

    public static void d(View view, int i) {
        view.setTextDirection(i);
    }
}
