package M;

import android.view.ViewConfiguration;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\U.smali */
public abstract class U {
    public static int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
