package N;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\j.smali */
public abstract class j {
    public static n a(int i, int i5, int i6, int i7, boolean z4) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i5, i6, i7, z4));
    }

    public static Object b(int i, float f2, float f3, float f5) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i, f2, f3, f5);
    }

    public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
