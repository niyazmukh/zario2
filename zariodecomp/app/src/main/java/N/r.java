package N;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\r.smali */
public abstract class r {
    public static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
