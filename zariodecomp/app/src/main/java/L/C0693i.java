package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import k.InterfaceC0637A;
import k.SubMenuC0641E;
import k.l;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\i.1.smali */
public final class C0693i implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8594a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8595b;

    /* renamed from: c, reason: collision with root package name */
    public l f8596c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f8597d;

    /* renamed from: e, reason: collision with root package name */
    public k.x f8598e;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0637A f8601l;

    /* renamed from: m, reason: collision with root package name */
    public C0691h f8602m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f8603n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8604o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8605p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8606q;

    /* renamed from: r, reason: collision with root package name */
    public int f8607r;

    /* renamed from: s, reason: collision with root package name */
    public int f8608s;

    /* renamed from: t, reason: collision with root package name */
    public int f8609t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8610u;

    /* renamed from: w, reason: collision with root package name */
    public C0685e f8612w;

    /* renamed from: x, reason: collision with root package name */
    public C0685e f8613x;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC0689g f8614y;

    /* renamed from: z, reason: collision with root package name */
    public C0687f f8615z;

    /* renamed from: f, reason: collision with root package name */
    public final int f8599f = 2131427331;

    /* renamed from: k, reason: collision with root package name */
    public final int f8600k = 2131427330;

    /* renamed from: v, reason: collision with root package name */
    public final SparseBooleanArray f8611v = new SparseBooleanArray();

    /* renamed from: A, reason: collision with root package name */
    public final K2.c f8593A = new K2.c(this, 23);

    public C0693i(Context context) {
        this.f8594a = context;
        this.f8597d = LayoutInflater.from(context);
    }

    @Override // k.y
    public final void a(l lVar, boolean z4) {
        f();
        C0685e c0685e = this.f8613x;
        if (c0685e != null && c0685e.b()) {
            c0685e.i.dismiss();
        }
        k.x xVar = this.f8598e;
        if (xVar != null) {
            xVar.a(lVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(k.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.z ? (k.z) view : (k.z) this.f8597d.inflate(this.f8600k, viewGroup, false);
            actionMenuItemView.c(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f8601l);
            if (this.f8615z == null) {
                this.f8615z = new C0687f(this);
            }
            actionMenuItemView2.setPopupCallback(this.f8615z);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(nVar.f8245C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0697k)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // k.y
    public final boolean c(k.n nVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final boolean d(SubMenuC0641E subMenuC0641E) {
        boolean z4;
        if (!subMenuC0641E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0641E subMenuC0641E2 = subMenuC0641E;
        while (true) {
            l lVar = subMenuC0641E2.f8156z;
            if (lVar == this.f8596c) {
                break;
            }
            subMenuC0641E2 = (SubMenuC0641E) lVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8601l;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof k.z) && ((k.z) childAt).getItemData() == subMenuC0641E2.f8155A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0641E.f8155A.getClass();
        int size = subMenuC0641E.f8223f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z4 = false;
                break;
            }
            MenuItem item = subMenuC0641E.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i5++;
        }
        C0685e c0685e = new C0685e(this, this.f8595b, subMenuC0641E, view);
        this.f8613x = c0685e;
        c0685e.f8289g = z4;
        k.t tVar = c0685e.i;
        if (tVar != null) {
            tVar.o(z4);
        }
        C0685e c0685e2 = this.f8613x;
        if (!c0685e2.b()) {
            if (c0685e2.f8287e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0685e2.d(0, 0, false, false);
        }
        k.x xVar = this.f8598e;
        if (xVar != null) {
            xVar.d(subMenuC0641E);
        }
        return true;
    }

    @Override // k.y
    public final boolean e(k.n nVar) {
        return false;
    }

    public final boolean f() {
        Object obj;
        RunnableC0689g runnableC0689g = this.f8614y;
        if (runnableC0689g != null && (obj = this.f8601l) != null) {
            ((View) obj).removeCallbacks(runnableC0689g);
            this.f8614y = null;
            return true;
        }
        C0685e c0685e = this.f8612w;
        if (c0685e == null) {
            return false;
        }
        if (c0685e.b()) {
            c0685e.i.dismiss();
        }
        return true;
    }

    @Override // k.y
    public final void g(Context context, l lVar) {
        this.f8595b = context;
        LayoutInflater.from(context);
        this.f8596c = lVar;
        Resources resources = context.getResources();
        if (!this.f8606q) {
            this.f8605p = true;
        }
        int i = 2;
        this.f8607r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i = 4;
        } else if (i5 >= 360) {
            i = 3;
        }
        this.f8609t = i;
        int measuredWidth = this.f8607r;
        if (this.f8605p) {
            if (this.f8602m == null) {
                C0691h c0691h = new C0691h(this, this.f8594a);
                this.f8602m = c0691h;
                if (this.f8604o) {
                    c0691h.setImageDrawable(this.f8603n);
                    this.f8603n = null;
                    this.f8604o = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8602m.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8602m.getMeasuredWidth();
        } else {
            this.f8602m = null;
        }
        this.f8608s = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.y
    public final boolean h() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z4;
        l lVar = this.f8596c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i5 = this.f8609t;
        int i6 = this.f8608s;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f8601l;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = 2;
            z4 = true;
            if (i7 >= size) {
                break;
            }
            k.n nVar = (k.n) arrayListL.get(i7);
            int i10 = nVar.f8268y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z5 = true;
            }
            if (this.f8610u && nVar.f8245C) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f8605p && (z5 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f8611v;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            k.n nVar2 = (k.n) arrayListL.get(i12);
            int i14 = nVar2.f8268y;
            boolean z6 = (i14 & 2) == i ? z4 : false;
            int i15 = nVar2.f8247b;
            if (z6) {
                View viewB = b(nVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z4);
                }
                nVar2.g(z4);
            } else if ((i14 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i15);
                boolean z8 = ((i11 > 0 || z7) && i6 > 0) ? z4 : false;
                if (z8) {
                    View viewB2 = b(nVar2, null, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z8 &= i6 + i13 > 0;
                }
                if (z8 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z7) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        k.n nVar3 = (k.n) arrayListL.get(i16);
                        if (nVar3.f8247b == i15) {
                            if (nVar3.f()) {
                                i11++;
                            }
                            nVar3.g(false);
                        }
                    }
                }
                if (z8) {
                    i11--;
                }
                nVar2.g(z8);
            } else {
                nVar2.g(false);
                i12++;
                i = 2;
                z4 = true;
            }
            i12++;
            i = 2;
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f8601l;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            l lVar = this.f8596c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f8596c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    k.n nVar = (k.n) arrayListL.get(i5);
                    if (nVar.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        k.n itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
                        View viewB = b(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.f8601l).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f8602m) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f8601l).requestLayout();
        l lVar2 = this.f8596c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k.o oVar = ((k.n) arrayList2.get(i6)).f8243A;
            }
        }
        l lVar3 = this.f8596c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f8225j;
        }
        if (this.f8605p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((k.n) arrayList.get(0)).f8245C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f8602m == null) {
                this.f8602m = new C0691h(this, this.f8594a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8602m.getParent();
            if (viewGroup3 != this.f8601l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8602m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8601l;
                C0691h c0691h = this.f8602m;
                actionMenuView.getClass();
                C0697k c0697kL = ActionMenuView.l();
                c0697kL.f8621a = true;
                actionMenuView.addView(c0691h, c0697kL);
            }
        } else {
            C0691h c0691h2 = this.f8602m;
            if (c0691h2 != null) {
                Object parent = c0691h2.getParent();
                Object obj = this.f8601l;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8602m);
                }
            }
        }
        ((ActionMenuView) this.f8601l).setOverflowReserved(this.f8605p);
    }

    public final boolean j() {
        C0685e c0685e = this.f8612w;
        return c0685e != null && c0685e.b();
    }

    @Override // k.y
    public final void k(k.x xVar) {
        throw null;
    }

    public final boolean l() {
        l lVar;
        if (!this.f8605p || j() || (lVar = this.f8596c) == null || this.f8601l == null || this.f8614y != null) {
            return false;
        }
        lVar.i();
        if (lVar.f8225j.isEmpty()) {
            return false;
        }
        RunnableC0689g runnableC0689g = new RunnableC0689g(this, new C0685e(this, this.f8595b, this.f8596c, this.f8602m));
        this.f8614y = runnableC0689g;
        ((View) this.f8601l).post(runnableC0689g);
        return true;
    }
}
