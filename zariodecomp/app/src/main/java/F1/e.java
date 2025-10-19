package F1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\e.smali */
public final class e extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y.a f1673g;

    public /* synthetic */ e(y.a aVar, int i) {
        this.f1672f = i;
        this.f1673g = aVar;
    }

    @Override // p1.b
    public final void H(int i) throws Resources.NotFoundException {
        switch (this.f1672f) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1673g;
                    if (bottomSheetBehavior.f5823K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1673g;
                    if (sideSheetBehavior.f6096g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p1.b
    public final void I(View view, int i, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1672f) {
            case 0:
                ((BottomSheetBehavior) this.f1673g).u(i5);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1673g;
                WeakReference weakReference = sideSheetBehavior.f6104q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f6090a.n0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f6108u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f6090a.m(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    @Override // p1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.view.View r5, float r6, float r7) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.e.J(android.view.View, float, float):void");
    }

    @Override // p1.b
    public final boolean S(View view, int i) {
        WeakReference weakReference;
        switch (this.f1672f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1673g;
                int i5 = bottomSheetBehavior.f5824L;
                if (i5 != 1 && !bottomSheetBehavior.f5839a0) {
                    if (i5 == 3 && bottomSheetBehavior.f5836Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f5834V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f5833U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1673g;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f6103p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p1.b
    public final int l(View view, int i) {
        switch (this.f1672f) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1673g;
                return S0.f.r(i, sideSheetBehavior.f6090a.H(), sideSheetBehavior.f6090a.G());
        }
    }

    @Override // p1.b
    public final int m(View view, int i) {
        switch (this.f1672f) {
            case 0:
                return S0.f.r(i, ((BottomSheetBehavior) this.f1673g).x(), w());
            default:
                return view.getTop();
        }
    }

    @Override // p1.b
    public int v(View view) {
        switch (this.f1672f) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1673g;
                return sideSheetBehavior.f6099l + sideSheetBehavior.f6102o;
            default:
                return super.v(view);
        }
    }

    @Override // p1.b
    public int w() {
        switch (this.f1672f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1673g;
                return bottomSheetBehavior.f5821I ? bottomSheetBehavior.f5832T : bottomSheetBehavior.G;
            default:
                return super.w();
        }
    }
}
