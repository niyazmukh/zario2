package t0;

import androidx.datastore.preferences.protobuf.C0208k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\u.1.smali */
public final class RunnableC0935u implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f10146e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final Q1.l f10147f = new Q1.l(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10148a;

    /* renamed from: b, reason: collision with root package name */
    public long f10149b;

    /* renamed from: c, reason: collision with root package name */
    public long f10150c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10151d;

    public static g0 c(RecyclerView recyclerView, int i, long j5) {
        int iQ = recyclerView.f4739e.Q();
        for (int i5 = 0; i5 < iQ; i5++) {
            g0 g0VarI = RecyclerView.I(recyclerView.f4739e.P(i5));
            if (g0VarI.f10006c == i && !g0VarI.g()) {
                return null;
            }
        }
        X x3 = recyclerView.f4733b;
        try {
            recyclerView.P();
            g0 g0VarI2 = x3.i(i, j5);
            if (g0VarI2 != null) {
                if (!g0VarI2.f() || g0VarI2.g()) {
                    x3.a(g0VarI2, false);
                } else {
                    x3.f(g0VarI2.f10004a);
                }
            }
            recyclerView.Q(false);
            return g0VarI2;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i5) {
        if (recyclerView.f4767u && this.f10149b == 0) {
            this.f10149b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0208k c0208k = recyclerView.f4744h0;
        c0208k.f4519b = i;
        c0208k.f4520c = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r16) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.RunnableC0935u.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            I.m.a("RV Prefetch");
            ArrayList arrayList = this.f10148a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10150c);
        } finally {
            this.f10149b = 0L;
            I.m.b();
        }
    }
}
