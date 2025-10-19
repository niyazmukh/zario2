package k;

import M.S;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import b2.ViewOnAttachStateChangeListenerC0275n;
import java.util.WeakHashMap;
import l.C0703n0;
import l.F0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\D.smali */
public final class ViewOnKeyListenerC0640D extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f8136b;

    /* renamed from: c, reason: collision with root package name */
    public final l f8137c;

    /* renamed from: d, reason: collision with root package name */
    public final C0650i f8138d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8139e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8140f;

    /* renamed from: k, reason: collision with root package name */
    public final int f8141k;

    /* renamed from: l, reason: collision with root package name */
    public final F0 f8142l;

    /* renamed from: o, reason: collision with root package name */
    public u f8145o;

    /* renamed from: p, reason: collision with root package name */
    public View f8146p;

    /* renamed from: q, reason: collision with root package name */
    public View f8147q;

    /* renamed from: r, reason: collision with root package name */
    public x f8148r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f8149s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8150t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8151u;

    /* renamed from: v, reason: collision with root package name */
    public int f8152v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8154x;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0645d f8143m = new ViewTreeObserverOnGlobalLayoutListenerC0645d(this, 1);

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0275n f8144n = new ViewOnAttachStateChangeListenerC0275n(this, 3);

    /* renamed from: w, reason: collision with root package name */
    public int f8153w = 0;

    public ViewOnKeyListenerC0640D(int i, Context context, View view, l lVar, boolean z4) {
        this.f8136b = context;
        this.f8137c = lVar;
        this.f8139e = z4;
        this.f8138d = new C0650i(lVar, LayoutInflater.from(context), z4, 2131427347);
        this.f8141k = i;
        Resources resources = context.getResources();
        this.f8140f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.f8146p = view;
        this.f8142l = new F0(context, null, i);
        lVar.b(this, context);
    }

    @Override // k.y
    public final void a(l lVar, boolean z4) {
        if (lVar != this.f8137c) {
            return;
        }
        dismiss();
        x xVar = this.f8148r;
        if (xVar != null) {
            xVar.a(lVar, z4);
        }
    }

    @Override // k.InterfaceC0639C
    public final boolean b() {
        return !this.f8150t && this.f8142l.f8723D.isShowing();
    }

    @Override // k.y
    public final boolean d(SubMenuC0641E subMenuC0641E) {
        if (subMenuC0641E.hasVisibleItems()) {
            View view = this.f8147q;
            w wVar = new w(this.f8141k, this.f8136b, view, subMenuC0641E, this.f8139e);
            x xVar = this.f8148r;
            wVar.h = xVar;
            t tVar = wVar.i;
            if (tVar != null) {
                tVar.k(xVar);
            }
            boolean zU = t.u(subMenuC0641E);
            wVar.f8289g = zU;
            t tVar2 = wVar.i;
            if (tVar2 != null) {
                tVar2.o(zU);
            }
            wVar.f8290j = this.f8145o;
            this.f8145o = null;
            this.f8137c.c(false);
            F0 f02 = this.f8142l;
            int width = f02.f8729f;
            int iG = f02.g();
            int i = this.f8153w;
            View view2 = this.f8146p;
            WeakHashMap weakHashMap = S.f2363a;
            if ((Gravity.getAbsoluteGravity(i, M.C.d(view2)) & 7) == 5) {
                width += this.f8146p.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f8287e != null) {
                    wVar.d(width, iG, true, true);
                }
            }
            x xVar2 = this.f8148r;
            if (xVar2 != null) {
                xVar2.d(subMenuC0641E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0639C
    public final void dismiss() {
        if (b()) {
            this.f8142l.dismiss();
        }
    }

    @Override // k.InterfaceC0639C
    public final void f() {
        View view;
        if (b()) {
            return;
        }
        if (this.f8150t || (view = this.f8146p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f8147q = view;
        F0 f02 = this.f8142l;
        f02.f8723D.setOnDismissListener(this);
        f02.f8739t = this;
        f02.f8722C = true;
        f02.f8723D.setFocusable(true);
        View view2 = this.f8147q;
        boolean z4 = this.f8149s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8149s = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8143m);
        }
        view2.addOnAttachStateChangeListener(this.f8144n);
        f02.f8738s = view2;
        f02.f8735p = this.f8153w;
        boolean z5 = this.f8151u;
        Context context = this.f8136b;
        C0650i c0650i = this.f8138d;
        if (!z5) {
            this.f8152v = t.m(c0650i, context, this.f8140f);
            this.f8151u = true;
        }
        f02.r(this.f8152v);
        f02.f8723D.setInputMethodMode(2);
        Rect rect = this.f8280a;
        f02.f8721B = rect != null ? new Rect(rect) : null;
        f02.f();
        C0703n0 c0703n0 = f02.f8726c;
        c0703n0.setOnKeyListener(this);
        if (this.f8154x) {
            l lVar = this.f8137c;
            if (lVar.f8228m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131427346, (ViewGroup) c0703n0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f8228m);
                }
                frameLayout.setEnabled(false);
                c0703n0.addHeaderView(frameLayout, null, false);
            }
        }
        f02.o(c0650i);
        f02.f();
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final void i() {
        this.f8151u = false;
        C0650i c0650i = this.f8138d;
        if (c0650i != null) {
            c0650i.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0639C
    public final C0703n0 j() {
        return this.f8142l.f8726c;
    }

    @Override // k.y
    public final void k(x xVar) {
        this.f8148r = xVar;
    }

    @Override // k.t
    public final void l(l lVar) {
    }

    @Override // k.t
    public final void n(View view) {
        this.f8146p = view;
    }

    @Override // k.t
    public final void o(boolean z4) {
        this.f8138d.f8213c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f8150t = true;
        this.f8137c.c(true);
        ViewTreeObserver viewTreeObserver = this.f8149s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8149s = this.f8147q.getViewTreeObserver();
            }
            this.f8149s.removeGlobalOnLayoutListener(this.f8143m);
            this.f8149s = null;
        }
        this.f8147q.removeOnAttachStateChangeListener(this.f8144n);
        u uVar = this.f8145o;
        if (uVar != null) {
            uVar.onDismiss();
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
        this.f8153w = i;
    }

    @Override // k.t
    public final void q(int i) {
        this.f8142l.f8729f = i;
    }

    @Override // k.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8145o = (u) onDismissListener;
    }

    @Override // k.t
    public final void s(boolean z4) {
        this.f8154x = z4;
    }

    @Override // k.t
    public final void t(int i) {
        this.f8142l.m(i);
    }
}
