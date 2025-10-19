package t0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\o0.smali */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10090a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f10091b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f10092c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f10093d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f10094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10095f;

    public o0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f10095f = staggeredGridLayoutManager;
        this.f10094e = i;
    }

    public final void a() {
        View view = (View) this.f10090a.get(r0.size() - 1);
        l0 l0Var = (l0) view.getLayoutParams();
        this.f10092c = this.f10095f.f4789r.b(view);
        l0Var.getClass();
    }

    public final void b() {
        this.f10090a.clear();
        this.f10091b = Integer.MIN_VALUE;
        this.f10092c = Integer.MIN_VALUE;
        this.f10093d = 0;
    }

    public final int c() {
        return this.f10095f.f4794w ? e(r1.size() - 1, -1) : e(0, this.f10090a.size());
    }

    public final int d() {
        return this.f10095f.f4794w ? e(0, this.f10090a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10095f;
        int iK = staggeredGridLayoutManager.f4789r.k();
        int iG = staggeredGridLayoutManager.f4789r.g();
        int i6 = i5 > i ? 1 : -1;
        while (i != i5) {
            View view = (View) this.f10090a.get(i);
            int iE = staggeredGridLayoutManager.f4789r.e(view);
            int iB = staggeredGridLayoutManager.f4789r.b(view);
            boolean z4 = iE <= iG;
            boolean z5 = iB >= iK;
            if (z4 && z5 && (iE < iK || iB > iG)) {
                return AbstractC0910Q.F(view);
            }
            i += i6;
        }
        return -1;
    }

    public final int f(int i) {
        int i5 = this.f10092c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f10090a.size() == 0) {
            return i;
        }
        a();
        return this.f10092c;
    }

    public final View g(int i, int i5) {
        ArrayList arrayList = this.f10090a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f10095f;
        View view = null;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f4794w && AbstractC0910Q.F(view2) >= i) || ((!staggeredGridLayoutManager.f4794w && AbstractC0910Q.F(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                View view3 = (View) arrayList.get(i6);
                if ((staggeredGridLayoutManager.f4794w && AbstractC0910Q.F(view3) <= i) || ((!staggeredGridLayoutManager.f4794w && AbstractC0910Q.F(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i6++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i5 = this.f10091b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f10090a.size() == 0) {
            return i;
        }
        View view = (View) this.f10090a.get(0);
        l0 l0Var = (l0) view.getLayoutParams();
        this.f10091b = this.f10095f.f4789r.e(view);
        l0Var.getClass();
        return this.f10091b;
    }
}
