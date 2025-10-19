package k;

import M.S;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import b2.ViewOnAttachStateChangeListenerC0275n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.B0;
import l.C0703n0;
import l.F0;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\f.smali */
public final class ViewOnKeyListenerC0647f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public x f8178A;

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f8179B;

    /* renamed from: C, reason: collision with root package name */
    public u f8180C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8181D;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8183c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8184d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8185e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f8186f;

    /* renamed from: r, reason: collision with root package name */
    public View f8194r;

    /* renamed from: s, reason: collision with root package name */
    public View f8195s;

    /* renamed from: t, reason: collision with root package name */
    public int f8196t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8197u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8198v;

    /* renamed from: w, reason: collision with root package name */
    public int f8199w;

    /* renamed from: x, reason: collision with root package name */
    public int f8200x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8202z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8187k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8188l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0645d f8189m = new ViewTreeObserverOnGlobalLayoutListenerC0645d(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0275n f8190n = new ViewOnAttachStateChangeListenerC0275n(this, 2);

    /* renamed from: o, reason: collision with root package name */
    public final K2.c f8191o = new K2.c(this, 22);

    /* renamed from: p, reason: collision with root package name */
    public int f8192p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f8193q = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8201y = false;

    public ViewOnKeyListenerC0647f(Context context, View view, int i, boolean z4) {
        this.f8182b = context;
        this.f8194r = view;
        this.f8184d = i;
        this.f8185e = z4;
        WeakHashMap weakHashMap = S.f2363a;
        this.f8196t = M.C.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f8183c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.f8186f = new Handler();
    }

    @Override // k.y
    public final void a(l lVar, boolean z4) {
        ArrayList arrayList = this.f8188l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((C0646e) arrayList.get(i)).f8176b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i5 = i + 1;
        if (i5 < arrayList.size()) {
            ((C0646e) arrayList.get(i5)).f8176b.c(false);
        }
        C0646e c0646e = (C0646e) arrayList.remove(i);
        c0646e.f8176b.r(this);
        boolean z5 = this.f8181D;
        F0 f02 = c0646e.f8175a;
        if (z5) {
            B0.b(f02.f8723D, null);
            f02.f8723D.setAnimationStyle(0);
        }
        f02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f8196t = ((C0646e) arrayList.get(size2 - 1)).f8177c;
        } else {
            View view = this.f8194r;
            WeakHashMap weakHashMap = S.f2363a;
            this.f8196t = M.C.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C0646e) arrayList.get(0)).f8176b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f8178A;
        if (xVar != null) {
            xVar.a(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8179B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8179B.removeGlobalOnLayoutListener(this.f8189m);
            }
            this.f8179B = null;
        }
        this.f8195s.removeOnAttachStateChangeListener(this.f8190n);
        this.f8180C.onDismiss();
    }

    @Override // k.InterfaceC0639C
    public final boolean b() {
        ArrayList arrayList = this.f8188l;
        return arrayList.size() > 0 && ((C0646e) arrayList.get(0)).f8175a.f8723D.isShowing();
    }

    @Override // k.y
    public final boolean d(SubMenuC0641E subMenuC0641E) {
        Iterator it = this.f8188l.iterator();
        while (it.hasNext()) {
            C0646e c0646e = (C0646e) it.next();
            if (subMenuC0641E == c0646e.f8176b) {
                c0646e.f8175a.f8726c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0641E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0641E);
        x xVar = this.f8178A;
        if (xVar != null) {
            xVar.d(subMenuC0641E);
        }
        return true;
    }

    @Override // k.InterfaceC0639C
    public final void dismiss() {
        ArrayList arrayList = this.f8188l;
        int size = arrayList.size();
        if (size > 0) {
            C0646e[] c0646eArr = (C0646e[]) arrayList.toArray(new C0646e[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0646e c0646e = c0646eArr[i];
                if (c0646e.f8175a.f8723D.isShowing()) {
                    c0646e.f8175a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0639C
    public final void f() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f8187k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((l) it.next());
        }
        arrayList.clear();
        View view = this.f8194r;
        this.f8195s = view;
        if (view != null) {
            boolean z4 = this.f8179B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8179B = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8189m);
            }
            this.f8195s.addOnAttachStateChangeListener(this.f8190n);
        }
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final void i() {
        Iterator it = this.f8188l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0646e) it.next()).f8175a.f8726c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0650i) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0639C
    public final C0703n0 j() {
        ArrayList arrayList = this.f8188l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0646e) arrayList.get(arrayList.size() - 1)).f8175a.f8726c;
    }

    @Override // k.y
    public final void k(x xVar) {
        this.f8178A = xVar;
    }

    @Override // k.t
    public final void l(l lVar) {
        lVar.b(this, this.f8182b);
        if (b()) {
            v(lVar);
        } else {
            this.f8187k.add(lVar);
        }
    }

    @Override // k.t
    public final void n(View view) {
        if (this.f8194r != view) {
            this.f8194r = view;
            int i = this.f8192p;
            WeakHashMap weakHashMap = S.f2363a;
            this.f8193q = Gravity.getAbsoluteGravity(i, M.C.d(view));
        }
    }

    @Override // k.t
    public final void o(boolean z4) {
        this.f8201y = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0646e c0646e;
        ArrayList arrayList = this.f8188l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0646e = null;
                break;
            }
            c0646e = (C0646e) arrayList.get(i);
            if (!c0646e.f8175a.f8723D.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0646e != null) {
            c0646e.f8176b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.t
    public final void p(int i) {
        if (this.f8192p != i) {
            this.f8192p = i;
            View view = this.f8194r;
            WeakHashMap weakHashMap = S.f2363a;
            this.f8193q = Gravity.getAbsoluteGravity(i, M.C.d(view));
        }
    }

    @Override // k.t
    public final void q(int i) {
        this.f8197u = true;
        this.f8199w = i;
    }

    @Override // k.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8180C = (u) onDismissListener;
    }

    @Override // k.t
    public final void s(boolean z4) {
        this.f8202z = z4;
    }

    @Override // k.t
    public final void t(int i) {
        this.f8198v = true;
        this.f8200x = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(k.l r17) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.ViewOnKeyListenerC0647f.v(k.l):void");
    }
}
