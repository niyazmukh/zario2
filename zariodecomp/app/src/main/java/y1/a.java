package Y1;

import a.AbstractC0183a;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y1\a.smali */
public final class a extends AbstractC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3871a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f3872b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f3871a = i;
        this.f3872b = sideSheetBehavior;
    }

    @Override // a.AbstractC0183a
    public final int D() {
        switch (this.f3871a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3872b;
                return Math.max(0, sideSheetBehavior.f6101n + sideSheetBehavior.f6102o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f3872b;
                return Math.max(0, (sideSheetBehavior2.f6100m - sideSheetBehavior2.f6099l) - sideSheetBehavior2.f6102o);
        }
    }

    @Override // a.AbstractC0183a
    public final int F() {
        switch (this.f3871a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f3872b;
                return (-sideSheetBehavior.f6099l) - sideSheetBehavior.f6102o;
            default:
                return this.f3872b.f6100m;
        }
    }

    @Override // a.AbstractC0183a
    public final int G() {
        switch (this.f3871a) {
            case 0:
                return this.f3872b.f6102o;
            default:
                return this.f3872b.f6100m;
        }
    }

    @Override // a.AbstractC0183a
    public final int H() {
        switch (this.f3871a) {
            case 0:
                return -this.f3872b.f6099l;
            default:
                return D();
        }
    }

    @Override // a.AbstractC0183a
    public final int J(View view) {
        switch (this.f3871a) {
            case 0:
                return view.getRight() + this.f3872b.f6102o;
            default:
                return view.getLeft() - this.f3872b.f6102o;
        }
    }

    @Override // a.AbstractC0183a
    public final int K(CoordinatorLayout coordinatorLayout) {
        switch (this.f3871a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // a.AbstractC0183a
    public final int L() {
        switch (this.f3871a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // a.AbstractC0183a
    public final boolean Q(float f2) {
        switch (this.f3871a) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0183a
    public final boolean S(View view) {
        switch (this.f3871a) {
            case 0:
                if (view.getRight() < (D() - F()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (D() + this.f3872b.f6100m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0183a
    public final boolean T(float f2, float f3) {
        switch (this.f3871a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs = Math.abs(f2);
                    this.f3872b.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs2 = Math.abs(f2);
                    this.f3872b.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0183a
    public final int k(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f3871a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.AbstractC0183a
    public final boolean k0(View view, float f2) {
        switch (this.f3871a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f3872b;
                float fAbs = Math.abs((f2 * sideSheetBehavior.f6098k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f3872b;
                float fAbs2 = Math.abs((f2 * sideSheetBehavior2.f6098k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0183a
    public final float m(int i) {
        switch (this.f3871a) {
            case 0:
                float F4 = F();
                return (i - F4) / (D() - F4);
            default:
                float f2 = this.f3872b.f6100m;
                return (f2 - i) / (f2 - D());
        }
    }

    @Override // a.AbstractC0183a
    public final void n0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i5) {
        switch (this.f3871a) {
            case 0:
                if (i <= this.f3872b.f6100m) {
                    marginLayoutParams.leftMargin = i5;
                    break;
                }
                break;
            default:
                int i6 = this.f3872b.f6100m;
                if (i <= i6) {
                    marginLayoutParams.rightMargin = i6 - i;
                    break;
                }
                break;
        }
    }
}
