package N;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\b.smali */
public abstract class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
