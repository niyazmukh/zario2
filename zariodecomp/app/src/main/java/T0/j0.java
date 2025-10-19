package t0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\j0.smali */
public final class j0 extends AbstractC0913U {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10041a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0896C f10042b;

    public j0(C0896C c0896c) {
        this.f10042b = c0896c;
    }

    @Override // t0.AbstractC0913U
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f10041a) {
            this.f10041a = false;
            this.f10042b.l();
        }
    }

    @Override // t0.AbstractC0913U
    public final void b(RecyclerView recyclerView, int i, int i5) {
        if (i == 0 && i5 == 0) {
            return;
        }
        this.f10041a = true;
    }
}
