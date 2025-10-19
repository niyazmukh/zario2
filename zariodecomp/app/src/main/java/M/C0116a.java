package M;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\a.1.smali */
public final class C0116a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0118c f2368a;

    public C0116a(C0118c c0118c) {
        this.f2368a = c0118c;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2368a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        g1.i iVarB = this.f2368a.b(view);
        if (iVarB != null) {
            return (AccessibilityNodeProvider) iVarB.f7594b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2368a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        N.o oVar = new N.o(accessibilityNodeInfo);
        WeakHashMap weakHashMap = S.f2363a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(L.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(L.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(L.b(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            tag = N.b(view);
        } else {
            tag = view.getTag(2131231215);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (i >= 30) {
            N.k.c(accessibilityNodeInfo, charSequence);
        } else {
            N.j.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2368a.d(view, oVar);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(2131231207);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i5 = 0; i5 < listEmptyList.size(); i5++) {
            oVar.b((N.i) listEmptyList.get(i5));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2368a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2368a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f2368a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f2368a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2368a.i(view, accessibilityEvent);
    }
}
