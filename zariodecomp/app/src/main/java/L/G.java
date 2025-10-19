package l;

import android.view.ViewTreeObserver;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\G.smali */
public abstract class G {
    public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
