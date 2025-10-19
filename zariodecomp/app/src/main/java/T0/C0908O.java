package t0;

import M.s0;
import M.u0;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import s2.C0870e;
import u1.BinderC0970b;
import v1.C0999y;
import y.C1041d;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\O.smali */
public final class C0908O implements q0, InterfaceC0357t, M.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9909a;

    public /* synthetic */ C0908O(Object obj) {
        this.f9909a = obj;
    }

    public C0870e a(int i) {
        X2.o oVarE = ((y2.t) this.f9909a).e();
        y2.z zVar = (y2.z) ((HashMap) oVarE.f3853g).get(Integer.valueOf(i));
        if (zVar != null && zVar.f11161b) {
            return B2.h.f314c.f(zVar.f11160a);
        }
        C0870e c0870e = B2.h.f314c;
        HashMap map = (HashMap) oVarE.f3850d;
        if (map.containsKey(Integer.valueOf(i))) {
            for (y2.v vVar : (List) map.get(Integer.valueOf(i))) {
                HashMap map2 = (HashMap) oVarE.f3849c;
                if (map2.containsKey(vVar)) {
                    C0870e c0870eF = ((y2.x) map2.get(vVar)).f11159c.f11067e;
                    if (c0870e.f9681a.size() >= c0870eF.f9681a.size()) {
                        c0870eF = c0870e;
                        c0870e = c0870eF;
                    }
                    Iterator it = c0870e.iterator();
                    while (true) {
                        s2.d dVar = (s2.d) it;
                        if (!((Iterator) dVar.f9680b).hasNext()) {
                            break;
                        }
                        c0870eF = c0870eF.f(dVar.next());
                    }
                    c0870e = c0870eF;
                }
            }
        }
        return c0870e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
    public void accept(Object obj, Object obj2) {
        ((zzs) ((zzp) obj).getService()).zzc(new BinderC0970b((TaskCompletionSource) obj2), (C0999y) this.f9909a);
    }

    @Override // t0.q0
    public View b(int i) {
        return ((AbstractC0910Q) this.f9909a).u(i);
    }

    @Override // t0.q0
    public int c() {
        AbstractC0910Q abstractC0910Q = (AbstractC0910Q) this.f9909a;
        return abstractC0910Q.f9925n - abstractC0910Q.D();
    }

    @Override // t0.q0
    public int e() {
        return ((AbstractC0910Q) this.f9909a).C();
    }

    @Override // t0.q0
    public int g(View view) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        ((AbstractC0910Q) this.f9909a).getClass();
        return view.getRight() + ((C0911S) view.getLayoutParams()).f9928b.right + ((ViewGroup.MarginLayoutParams) c0911s).rightMargin;
    }

    @Override // t0.q0
    public int h(View view) {
        C0911S c0911s = (C0911S) view.getLayoutParams();
        ((AbstractC0910Q) this.f9909a).getClass();
        return (view.getLeft() - ((C0911S) view.getLayoutParams()).f9928b.left) - ((ViewGroup.MarginLayoutParams) c0911s).leftMargin;
    }

    @Override // M.r
    public u0 k(View view, u0 u0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9909a;
        if (!L.b.a(coordinatorLayout.f4352r, u0Var)) {
            coordinatorLayout.f4352r = u0Var;
            boolean z4 = u0Var.d() > 0;
            coordinatorLayout.f4353s = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            s0 s0Var = u0Var.f2427a;
            if (!s0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = M.S.f2363a;
                    if (M.B.b(childAt) && ((C1041d) childAt.getLayoutParams()).f11027a != null && s0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return u0Var;
    }
}
