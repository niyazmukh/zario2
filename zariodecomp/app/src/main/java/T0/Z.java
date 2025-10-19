package t0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\Z.smali */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9944a;

    public Z(RecyclerView recyclerView) {
        this.f9944a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.f4707y0;
        RecyclerView recyclerView = this.f9944a;
        if (recyclerView.f4769v && recyclerView.f4767u) {
            WeakHashMap weakHashMap = M.S.f2363a;
            M.B.m(recyclerView, recyclerView.f4749l);
        } else {
            recyclerView.f4711C = true;
            recyclerView.requestLayout();
        }
    }
}
