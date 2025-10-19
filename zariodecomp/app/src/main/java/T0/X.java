package t0;

import M.C0118c;
import android.util.SparseArray;
import android.view.View;
import androidx.datastore.preferences.protobuf.C0208k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\X.smali */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9937a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f9938b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9939c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9940d;

    /* renamed from: e, reason: collision with root package name */
    public int f9941e;

    /* renamed from: f, reason: collision with root package name */
    public int f9942f;

    /* renamed from: g, reason: collision with root package name */
    public C0915W f9943g;
    public final /* synthetic */ RecyclerView h;

    public X(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f9937a = arrayList;
        this.f9938b = null;
        this.f9939c = new ArrayList();
        this.f9940d = Collections.unmodifiableList(arrayList);
        this.f9941e = 2;
        this.f9942f = 2;
    }

    public final void a(g0 g0Var, boolean z4) {
        RecyclerView.j(g0Var);
        RecyclerView recyclerView = this.h;
        i0 i0Var = recyclerView.f4758p0;
        if (i0Var != null) {
            h0 h0Var = i0Var.f10034e;
            View view = g0Var.f10004a;
            M.S.h(view, h0Var != null ? (C0118c) h0Var.f10027e.remove(view) : null);
        }
        if (z4 && recyclerView.f4745i0 != null) {
            recyclerView.f4741f.s(g0Var);
        }
        g0Var.f10019r = null;
        C0915W c0915wC = c();
        c0915wC.getClass();
        int i = g0Var.f10009f;
        ArrayList arrayList = c0915wC.a(i).f9931a;
        if (((C0914V) c0915wC.f9935a.get(i)).f9932b <= arrayList.size()) {
            return;
        }
        g0Var.n();
        arrayList.add(g0Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f4745i0.b()) {
            return !recyclerView.f4745i0.f9978g ? i : recyclerView.f4737d.u(i, 0);
        }
        StringBuilder sbN = B.a.n("invalid position ", i, ". State item count is ");
        sbN.append(recyclerView.f4745i0.b());
        sbN.append(recyclerView.y());
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public final C0915W c() {
        if (this.f9943g == null) {
            C0915W c0915w = new C0915W();
            c0915w.f9935a = new SparseArray();
            c0915w.f9936b = 0;
            this.f9943g = c0915w;
        }
        return this.f9943g;
    }

    public final void d() {
        ArrayList arrayList = this.f9939c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f4707y0;
        C0208k c0208k = this.h.f4744h0;
        int[] iArr2 = (int[]) c0208k.f4522e;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0208k.f4521d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f9939c;
        a((g0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        g0 g0VarI = RecyclerView.I(view);
        boolean zK = g0VarI.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (g0VarI.j()) {
            g0VarI.f10015n.j(g0VarI);
        } else if (g0VarI.q()) {
            g0VarI.f10011j &= -33;
        }
        g(g0VarI);
        if (recyclerView.f4721N == null || g0VarI.h()) {
            return;
        }
        recyclerView.f4721N.d(g0VarI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(t0.g0 r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.X.g(t0.g0):void");
    }

    public final void h(View view) {
        AbstractC0906M abstractC0906M;
        g0 g0VarI = RecyclerView.I(view);
        boolean zD = g0VarI.d(12);
        RecyclerView recyclerView = this.h;
        if (!zD && g0VarI.l() && (abstractC0906M = recyclerView.f4721N) != null) {
            C0926l c0926l = (C0926l) abstractC0906M;
            if (g0VarI.c().isEmpty() && c0926l.f10051g && !g0VarI.g()) {
                if (this.f9938b == null) {
                    this.f9938b = new ArrayList();
                }
                g0VarI.f10015n = this;
                g0VarI.f10016o = true;
                this.f9938b.add(g0VarI);
                return;
            }
        }
        if (g0VarI.g() && !g0VarI.i() && !recyclerView.f4757p.f9902b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        g0VarI.f10015n = this;
        g0VarI.f10016o = false;
        this.f9937a.add(g0VarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0393 A[PHI: r6 r11
  0x0393: PHI (r6v4 boolean) = (r6v3 boolean), (r6v6 boolean) binds: [B:128:0x0232, B:180:0x0317] A[DONT_GENERATE, DONT_INLINE]
  0x0393: PHI (r11v3 t0.g0) = (r11v2 t0.g0), (r11v6 t0.g0) binds: [B:128:0x0232, B:180:0x0317] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t0.g0 i(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.X.i(int, long):t0.g0");
    }

    public final void j(g0 g0Var) {
        if (g0Var.f10016o) {
            this.f9938b.remove(g0Var);
        } else {
            this.f9937a.remove(g0Var);
        }
        g0Var.f10015n = null;
        g0Var.f10016o = false;
        g0Var.f10011j &= -33;
    }

    public final void k() {
        AbstractC0910Q abstractC0910Q = this.h.f4759q;
        this.f9942f = this.f9941e + (abstractC0910Q != null ? abstractC0910Q.f9921j : 0);
        ArrayList arrayList = this.f9939c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f9942f; size--) {
            e(size);
        }
    }
}
