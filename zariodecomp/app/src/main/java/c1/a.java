package C1;

import M.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C1\a.smali */
public abstract class a extends y.a {

    /* renamed from: a, reason: collision with root package name */
    public b f1073a;

    @Override // y.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f1073a == null) {
            this.f1073a = new b(view);
        }
        b bVar = this.f1073a;
        View view2 = bVar.f1075b;
        bVar.f1074a = view2.getTop();
        bVar.f1076c = view2.getLeft();
        b bVar2 = this.f1073a;
        View view3 = bVar2.f1075b;
        int top = 0 - (view3.getTop() - bVar2.f1074a);
        WeakHashMap weakHashMap = S.f2363a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f1076c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
