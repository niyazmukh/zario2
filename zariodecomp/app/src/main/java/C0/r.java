package c0;

import android.util.SparseArray;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\r.smali */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5387a;

    /* renamed from: b, reason: collision with root package name */
    public n f5388b;

    public r(int i) {
        this.f5387a = new SparseArray(i);
    }

    public final void a(n nVar, int i, int i5) {
        int iA = nVar.a(i);
        SparseArray sparseArray = this.f5387a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(iA);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i), rVar);
        }
        if (i5 > i) {
            rVar.a(nVar, i + 1, i5);
        } else {
            rVar.f5388b = nVar;
        }
    }
}
