package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0617b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\p.smali */
public final class p extends FrameLayout implements InterfaceC0617b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f8273a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f8273a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // j.InterfaceC0617b
    public final void b() {
        this.f8273a.onActionViewExpanded();
    }

    @Override // j.InterfaceC0617b
    public final void e() {
        this.f8273a.onActionViewCollapsed();
    }
}
