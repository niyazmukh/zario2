package t0;

import M.C0118c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\h0.smali */
public final class h0 extends C0118c {

    /* renamed from: d, reason: collision with root package name */
    public final i0 f10026d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f10027e = new WeakHashMap();

    public h0(i0 i0Var) {
        this.f10026d = i0Var;
    }

    @Override // M.C0118c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        return c0118c != null ? c0118c.a(view, accessibilityEvent) : this.f2375a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // M.C0118c
    public final g1.i b(View view) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        return c0118c != null ? c0118c.b(view) : super.b(view);
    }

    @Override // M.C0118c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        if (c0118c != null) {
            c0118c.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // M.C0118c
    public final void d(View view, N.o oVar) {
        i0 i0Var = this.f10026d;
        boolean zK = i0Var.f10033d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f2375a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f2543a;
        if (!zK) {
            RecyclerView recyclerView = i0Var.f10033d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().S(view, oVar);
                C0118c c0118c = (C0118c) this.f10027e.get(view);
                if (c0118c != null) {
                    c0118c.d(view, oVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // M.C0118c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        if (c0118c != null) {
            c0118c.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // M.C0118c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0118c c0118c = (C0118c) this.f10027e.get(viewGroup);
        return c0118c != null ? c0118c.f(viewGroup, view, accessibilityEvent) : this.f2375a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // M.C0118c
    public final boolean g(View view, int i, Bundle bundle) {
        i0 i0Var = this.f10026d;
        if (!i0Var.f10033d.K()) {
            RecyclerView recyclerView = i0Var.f10033d;
            if (recyclerView.getLayoutManager() != null) {
                C0118c c0118c = (C0118c) this.f10027e.get(view);
                if (c0118c != null) {
                    if (c0118c.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                X x3 = recyclerView.getLayoutManager().f9915b.f4733b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // M.C0118c
    public final void h(View view, int i) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        if (c0118c != null) {
            c0118c.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // M.C0118c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0118c c0118c = (C0118c) this.f10027e.get(view);
        if (c0118c != null) {
            c0118c.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
