package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0617b;
import java.util.ArrayList;
import k.SubMenuC0641E;
import k.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\a1.smali */
public final class a1 implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public l f8550a;

    /* renamed from: b, reason: collision with root package name */
    public k.n f8551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f8552c;

    public a1(Toolbar toolbar) {
        this.f8552c = toolbar;
    }

    @Override // k.y
    public final void a(l lVar, boolean z4) {
    }

    @Override // k.y
    public final boolean c(k.n nVar) {
        Toolbar toolbar = this.f8552c;
        toolbar.c();
        ViewParent parent = toolbar.f4294l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4294l);
            }
            toolbar.addView(toolbar.f4294l);
        }
        View actionView = nVar.getActionView();
        toolbar.f4295m = actionView;
        this.f8551b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4295m);
            }
            b1 b1VarH = Toolbar.h();
            b1VarH.f8555a = (toolbar.f4300r & 112) | 8388611;
            b1VarH.f8556b = 2;
            toolbar.f4295m.setLayoutParams(b1VarH);
            toolbar.addView(toolbar.f4295m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((b1) childAt.getLayoutParams()).f8556b != 2 && childAt != toolbar.f4287a) {
                toolbar.removeViewAt(childCount);
                toolbar.f4274I.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f8245C = true;
        nVar.f8257n.p(false);
        KeyEvent.Callback callback = toolbar.f4295m;
        if (callback instanceof InterfaceC0617b) {
            ((InterfaceC0617b) callback).b();
        }
        toolbar.v();
        return true;
    }

    @Override // k.y
    public final boolean d(SubMenuC0641E subMenuC0641E) {
        return false;
    }

    @Override // k.y
    public final boolean e(k.n nVar) {
        Toolbar toolbar = this.f8552c;
        KeyEvent.Callback callback = toolbar.f4295m;
        if (callback instanceof InterfaceC0617b) {
            ((InterfaceC0617b) callback).e();
        }
        toolbar.removeView(toolbar.f4295m);
        toolbar.removeView(toolbar.f4294l);
        toolbar.f4295m = null;
        ArrayList arrayList = toolbar.f4274I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f8551b = null;
        toolbar.requestLayout();
        nVar.f8245C = false;
        nVar.f8257n.p(false);
        toolbar.v();
        return true;
    }

    @Override // k.y
    public final void g(Context context, l lVar) {
        k.n nVar;
        l lVar2 = this.f8550a;
        if (lVar2 != null && (nVar = this.f8551b) != null) {
            lVar2.d(nVar);
        }
        this.f8550a = lVar;
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final void i() {
        if (this.f8551b != null) {
            l lVar = this.f8550a;
            if (lVar != null) {
                int size = lVar.f8223f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f8550a.getItem(i) == this.f8551b) {
                        return;
                    }
                }
            }
            e(this.f8551b);
        }
    }
}
