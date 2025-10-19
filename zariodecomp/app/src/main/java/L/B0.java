package l;

import android.transition.Transition;
import android.widget.PopupWindow;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\B0.smali */
public abstract class B0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
