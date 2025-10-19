package N;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N\n.smali */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f2542a;

    public n(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2542a = collectionItemInfo;
    }

    public static n a(int i, int i5, int i6, int i7, boolean z4) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i5, i6, i7, false, z4));
    }
}
