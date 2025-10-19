package Q;

import android.widget.PopupWindow;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q\n.smali */
public abstract class n {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z4) {
        popupWindow.setOverlapAnchor(z4);
    }

    public static void d(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
