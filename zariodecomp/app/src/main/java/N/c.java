package N;

import android.view.accessibility.AccessibilityManager;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\c.smali */
public abstract class c {
    public static boolean a(AccessibilityManager accessibilityManager, d dVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new e(dVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, d dVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new e(dVar));
    }
}
