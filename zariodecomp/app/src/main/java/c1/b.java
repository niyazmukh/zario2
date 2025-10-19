package C1;

import M.r;
import M.u0;
import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C1\b.smali */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public int f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1075b;

    /* renamed from: c, reason: collision with root package name */
    public int f1076c;

    public b(View view) {
        this.f1075b = view;
    }

    @Override // M.r
    public u0 k(View view, u0 u0Var) {
        int i = u0Var.f2427a.f(7).f1266b;
        View view2 = this.f1075b;
        int i5 = this.f1074a;
        if (i5 >= 0) {
            view2.getLayoutParams().height = i5 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f1076c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return u0Var;
    }

    public b(View view, int i, int i5) {
        this.f1074a = i;
        this.f1075b = view;
        this.f1076c = i5;
    }
}
