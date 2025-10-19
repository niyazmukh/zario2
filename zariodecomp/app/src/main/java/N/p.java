package N;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\p.smali */
public final class p extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final g1.i f2545a;

    public p(g1.i iVar) {
        this.f2545a = iVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f2545a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        o oVarN = this.f2545a.n(i);
        if (oVarN == null) {
            return null;
        }
        return oVarN.f2543a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2545a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        o oVarQ = this.f2545a.q(i);
        if (oVarQ == null) {
            return null;
        }
        return oVarQ.f2543a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i5, Bundle bundle) {
        return this.f2545a.C(i, i5, bundle);
    }
}
