package l;

import androidx.appcompat.widget.SearchView;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\L0.smali */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f8473b;

    public /* synthetic */ L0(SearchView searchView, int i) {
        this.f8472a = i;
        this.f8473b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8472a) {
            case 0:
                this.f8473b.t();
                break;
            default:
                T.c cVar = this.f8473b.f4241S;
                if (cVar instanceof U0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
