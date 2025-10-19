package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.r, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\r.smali */
public final class C0932r extends AbstractC0913U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0933s f10108a;

    public C0932r(C0933s c0933s) {
        this.f10108a = c0933s;
    }

    @Override // t0.AbstractC0913U
    public final void b(RecyclerView recyclerView, int i, int i5) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0933s c0933s = this.f10108a;
        int iComputeVerticalScrollRange = c0933s.f10133s.computeVerticalScrollRange();
        int i6 = c0933s.f10132r;
        int i7 = iComputeVerticalScrollRange - i6;
        int i8 = c0933s.f10117a;
        c0933s.f10134t = i7 > 0 && i6 >= i8;
        int iComputeHorizontalScrollRange = c0933s.f10133s.computeHorizontalScrollRange();
        int i9 = c0933s.f10131q;
        boolean z4 = iComputeHorizontalScrollRange - i9 > 0 && i9 >= i8;
        c0933s.f10135u = z4;
        boolean z5 = c0933s.f10134t;
        if (!z5 && !z4) {
            if (c0933s.f10136v != 0) {
                c0933s.g(0);
                return;
            }
            return;
        }
        if (z5) {
            float f2 = i6;
            c0933s.f10126l = (int) ((((f2 / 2.0f) + iComputeVerticalScrollOffset) * f2) / iComputeVerticalScrollRange);
            c0933s.f10125k = Math.min(i6, (i6 * i6) / iComputeVerticalScrollRange);
        }
        if (c0933s.f10135u) {
            float f3 = iComputeHorizontalScrollOffset;
            float f5 = i9;
            c0933s.f10129o = (int) ((((f5 / 2.0f) + f3) * f5) / iComputeHorizontalScrollRange);
            c0933s.f10128n = Math.min(i9, (i9 * i9) / iComputeHorizontalScrollRange);
        }
        int i10 = c0933s.f10136v;
        if (i10 == 0 || i10 == 1) {
            c0933s.g(1);
        }
    }
}
