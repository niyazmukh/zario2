package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0527b;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\h.smali */
public final class C0649h implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f8205a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f8206b;

    /* renamed from: c, reason: collision with root package name */
    public l f8207c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f8208d;

    /* renamed from: e, reason: collision with root package name */
    public x f8209e;

    /* renamed from: f, reason: collision with root package name */
    public C0648g f8210f;

    public C0649h(ContextWrapper contextWrapper) {
        this.f8205a = contextWrapper;
        this.f8206b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void a(l lVar, boolean z4) {
        x xVar = this.f8209e;
        if (xVar != null) {
            xVar.a(lVar, z4);
        }
    }

    @Override // k.y
    public final boolean c(n nVar) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Dialog, g.f] */
    @Override // k.y
    public final boolean d(SubMenuC0641E subMenuC0641E) {
        if (!subMenuC0641E.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f8240a = subMenuC0641E;
        Context context = subMenuC0641E.f8218a;
        E2.j jVar = new E2.j(context);
        C0527b c0527b = (C0527b) jVar.f1460c;
        C0649h c0649h = new C0649h(c0527b.f7157a);
        mVar.f8242c = c0649h;
        c0649h.f8209e = mVar;
        subMenuC0641E.b(c0649h, context);
        C0649h c0649h2 = mVar.f8242c;
        if (c0649h2.f8210f == null) {
            c0649h2.f8210f = new C0648g(c0649h2);
        }
        c0527b.f7165k = c0649h2.f8210f;
        c0527b.f7166l = mVar;
        View view = subMenuC0641E.f8230o;
        if (view != null) {
            c0527b.f7161e = view;
        } else {
            c0527b.f7159c = subMenuC0641E.f8229n;
            c0527b.f7160d = subMenuC0641E.f8228m;
        }
        c0527b.f7164j = mVar;
        ?? A4 = jVar.a();
        mVar.f8241b = A4;
        A4.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f8241b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f8241b.show();
        x xVar = this.f8209e;
        if (xVar == null) {
            return true;
        }
        xVar.d(subMenuC0641E);
        return true;
    }

    @Override // k.y
    public final boolean e(n nVar) {
        return false;
    }

    @Override // k.y
    public final void g(Context context, l lVar) {
        if (this.f8205a != null) {
            this.f8205a = context;
            if (this.f8206b == null) {
                this.f8206b = LayoutInflater.from(context);
            }
        }
        this.f8207c = lVar;
        C0648g c0648g = this.f8210f;
        if (c0648g != null) {
            c0648g.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final void i() {
        C0648g c0648g = this.f8210f;
        if (c0648g != null) {
            c0648g.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void k(x xVar) {
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        this.f8207c.q(this.f8210f.getItem(i), this, 0);
    }
}
