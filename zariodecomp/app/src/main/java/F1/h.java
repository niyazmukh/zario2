package F1;

import A2.RunnableC0005e;
import B3.N;
import M.B;
import M.S;
import android.view.View;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.internal.O;
import com.google.android.gms.common.internal.C;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h1.C0590c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\h.smali */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1680a;

    /* renamed from: b, reason: collision with root package name */
    public int f1681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1682c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1683d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1684e;

    public O a() {
        C.a("execute parameter required", ((InterfaceC0357t) this.f1683d) != null);
        return new O(this, (C0590c[]) this.f1684e, this.f1682c, this.f1681b);
    }

    public void b(int i) {
        switch (this.f1680a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1684e;
                WeakReference weakReference = bottomSheetBehavior.f5833U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1681b = i;
                    if (!this.f1682c) {
                        View view = (View) bottomSheetBehavior.f5833U.get();
                        N n5 = (N) this.f1683d;
                        WeakHashMap weakHashMap = S.f2363a;
                        B.m(view, n5);
                        this.f1682c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1684e;
                WeakReference weakReference2 = sideSheetBehavior.f6103p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1681b = i;
                    if (!this.f1682c) {
                        View view2 = (View) sideSheetBehavior.f6103p.get();
                        RunnableC0005e runnableC0005e = (RunnableC0005e) this.f1683d;
                        WeakHashMap weakHashMap2 = S.f2363a;
                        B.m(view2, runnableC0005e);
                        this.f1682c = true;
                        break;
                    }
                }
                break;
        }
    }

    public h(SideSheetBehavior sideSheetBehavior) {
        this.f1680a = 1;
        this.f1684e = sideSheetBehavior;
        this.f1683d = new RunnableC0005e(this, 15);
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.f1680a = 0;
        this.f1684e = bottomSheetBehavior;
        this.f1683d = new N(this, 15);
    }
}
