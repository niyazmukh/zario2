package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.H, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\H.smali */
public final class C0901H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9900a;

    public /* synthetic */ C0901H(RecyclerView recyclerView) {
        this.f9900a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(t0.g0 r8, M.q r9, M.q r10) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.f9900a
            r7.getClass()
            r0 = 0
            r8.o(r0)
            t0.M r0 = r7.f4721N
            r1 = r0
            t0.l r1 = (t0.C0926l) r1
            if (r9 == 0) goto L29
            r1.getClass()
            int r3 = r9.f2418a
            int r5 = r10.f2418a
            if (r3 != r5) goto L1f
            int r0 = r9.f2419b
            int r2 = r10.f2419b
            if (r0 == r2) goto L29
        L1f:
            int r4 = r9.f2419b
            int r6 = r10.f2419b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r8)
            android.view.View r9 = r8.f10004a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.i
            r9.add(r8)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.S()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C0901H.a(t0.g0, M.q, M.q):void");
    }

    public void b(g0 g0Var, M.q qVar, M.q qVar2) {
        boolean zG;
        RecyclerView recyclerView = this.f9900a;
        recyclerView.f4733b.j(g0Var);
        recyclerView.f(g0Var);
        g0Var.o(false);
        C0926l c0926l = (C0926l) recyclerView.f4721N;
        c0926l.getClass();
        int i = qVar.f2418a;
        int i5 = qVar.f2419b;
        View view = g0Var.f10004a;
        int left = qVar2 == null ? view.getLeft() : qVar2.f2418a;
        int top = qVar2 == null ? view.getTop() : qVar2.f2419b;
        if (g0Var.i() || (i == left && i5 == top)) {
            c0926l.l(g0Var);
            c0926l.h.add(g0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0926l.g(g0Var, i, i5, left, top);
        }
        if (zG) {
            recyclerView.S();
        }
    }
}
