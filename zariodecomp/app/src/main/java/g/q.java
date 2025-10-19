package g;

import M.S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\q.smali */
public final class q extends S0.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7221c;

    public /* synthetic */ q(Object obj, int i) {
        this.f7220b = i;
        this.f7221c = obj;
    }

    @Override // M.Y
    public final void a() {
        Object obj = this.f7221c;
        switch (this.f7220b) {
            case 0:
                o oVar = (o) obj;
                oVar.f7218b.f7298z.setAlpha(1.0f);
                y yVar = oVar.f7218b;
                yVar.f7253C.d(null);
                yVar.f7253C = null;
                break;
            case 1:
                y yVar2 = (y) obj;
                yVar2.f7298z.setAlpha(1.0f);
                yVar2.f7253C.d(null);
                yVar2.f7253C = null;
                break;
            default:
                S0.v vVar = (S0.v) obj;
                ((y) vVar.f2936c).f7298z.setVisibility(8);
                y yVar3 = (y) vVar.f2936c;
                PopupWindow popupWindow = yVar3.f7251A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (yVar3.f7298z.getParent() instanceof View) {
                    View view = (View) yVar3.f7298z.getParent();
                    WeakHashMap weakHashMap = S.f2363a;
                    M.F.c(view);
                }
                yVar3.f7298z.e();
                yVar3.f7253C.d(null);
                yVar3.f7253C = null;
                ViewGroup viewGroup = yVar3.f7255E;
                WeakHashMap weakHashMap2 = S.f2363a;
                M.F.c(viewGroup);
                break;
        }
    }

    @Override // S0.f, M.Y
    public void c() {
        Object obj = this.f7221c;
        switch (this.f7220b) {
            case 0:
                ((o) obj).f7218b.f7298z.setVisibility(0);
                break;
            case 1:
                y yVar = (y) obj;
                yVar.f7298z.setVisibility(0);
                if (yVar.f7298z.getParent() instanceof View) {
                    View view = (View) yVar.f7298z.getParent();
                    WeakHashMap weakHashMap = S.f2363a;
                    M.F.c(view);
                    break;
                }
                break;
        }
    }
}
