package N;

import A2.C0004d;
import M.B;
import M.S;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import b2.C0272k;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\e.smali */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f2530a;

    public e(d dVar) {
        this.f2530a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f2530a.equals(((e) obj).f2530a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2530a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        C0272k c0272k = (C0272k) ((C0004d) this.f2530a).f177b;
        AutoCompleteTextView autoCompleteTextView = c0272k.h;
        if (autoCompleteTextView == null || S0.f.M(autoCompleteTextView)) {
            return;
        }
        int i = z4 ? 2 : 1;
        WeakHashMap weakHashMap = S.f2363a;
        B.s(c0272k.f5056d, i);
    }
}
