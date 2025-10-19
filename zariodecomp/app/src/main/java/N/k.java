package N;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\k.smali */
public abstract class k {
    public static Object a(int i, float f2, float f3, float f5) {
        return new AccessibilityNodeInfo.RangeInfo(i, f2, f3, f5);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
