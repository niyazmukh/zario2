package l;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: l.x0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\x0.1.smali */
public final class C0721x0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0725z0 f8714a;

    public C0721x0(C0725z0 c0725z0) {
        this.f8714a = c0725z0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0725z0 c0725z0 = this.f8714a;
            if (c0725z0.f8723D.getInputMethodMode() == 2 || c0725z0.f8723D.getContentView() == null) {
                return;
            }
            Handler handler = c0725z0.f8745z;
            RunnableC0719w0 runnableC0719w0 = c0725z0.f8741v;
            handler.removeCallbacks(runnableC0719w0);
            runnableC0719w0.run();
        }
    }
}
