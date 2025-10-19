package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\b.1.smali */
public final class RunnableC0679b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f8554b;

    public /* synthetic */ RunnableC0679b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f8553a = i;
        this.f8554b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8553a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8554b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4173A = actionBarOverlayLayout.f4181d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4174B);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8554b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4173A = actionBarOverlayLayout2.f4181d.animate().translationY(-actionBarOverlayLayout2.f4181d.getHeight()).setListener(actionBarOverlayLayout2.f4174B);
                break;
        }
    }
}
