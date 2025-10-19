package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0616a;
import j.C0622i;
import java.lang.ref.WeakReference;
import l.C0693i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\G.smali */
public final class G extends AbstractC0616a implements k.j {

    /* renamed from: c, reason: collision with root package name */
    public final Context f7126c;

    /* renamed from: d, reason: collision with root package name */
    public final k.l f7127d;

    /* renamed from: e, reason: collision with root package name */
    public S0.v f7128e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f7129f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H f7130k;

    public G(H h, Context context, S0.v vVar) {
        this.f7130k = h;
        this.f7126c = context;
        this.f7128e = vVar;
        k.l lVar = new k.l(context);
        lVar.f8227l = 1;
        this.f7127d = lVar;
        lVar.f8222e = this;
    }

    @Override // j.AbstractC0616a
    public final void a() {
        H h = this.f7130k;
        if (h.f7142n != this) {
            return;
        }
        if (h.f7149u) {
            h.f7143o = this;
            h.f7144p = this.f7128e;
        } else {
            this.f7128e.g(this);
        }
        this.f7128e = null;
        h.X(false);
        ActionBarContextView actionBarContextView = h.f7139k;
        if (actionBarContextView.f4162o == null) {
            actionBarContextView.e();
        }
        h.h.setHideOnContentScrollEnabled(h.f7154z);
        h.f7142n = null;
    }

    @Override // j.AbstractC0616a
    public final View b() {
        WeakReference weakReference = this.f7129f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0616a
    public final k.l c() {
        return this.f7127d;
    }

    @Override // j.AbstractC0616a
    public final MenuInflater d() {
        return new C0622i(this.f7126c);
    }

    @Override // j.AbstractC0616a
    public final CharSequence e() {
        return this.f7130k.f7139k.getSubtitle();
    }

    @Override // k.j
    public final boolean f(k.l lVar, MenuItem menuItem) {
        S0.v vVar = this.f7128e;
        if (vVar != null) {
            return ((S0.i) vVar.f2935b).q(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0616a
    public final CharSequence g() {
        return this.f7130k.f7139k.getTitle();
    }

    @Override // j.AbstractC0616a
    public final void h() {
        if (this.f7130k.f7142n != this) {
            return;
        }
        k.l lVar = this.f7127d;
        lVar.w();
        try {
            this.f7128e.h(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // j.AbstractC0616a
    public final boolean i() {
        return this.f7130k.f7139k.f4170w;
    }

    @Override // j.AbstractC0616a
    public final void j(View view) {
        this.f7130k.f7139k.setCustomView(view);
        this.f7129f = new WeakReference(view);
    }

    @Override // j.AbstractC0616a
    public final void k(int i) {
        l(this.f7130k.f7136f.getResources().getString(i));
    }

    @Override // j.AbstractC0616a
    public final void l(CharSequence charSequence) {
        this.f7130k.f7139k.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0616a
    public final void m(int i) {
        n(this.f7130k.f7136f.getResources().getString(i));
    }

    @Override // j.AbstractC0616a
    public final void n(CharSequence charSequence) {
        this.f7130k.f7139k.setTitle(charSequence);
    }

    @Override // k.j
    public final void o(k.l lVar) {
        if (this.f7128e == null) {
            return;
        }
        h();
        C0693i c0693i = this.f7130k.f7139k.f4155d;
        if (c0693i != null) {
            c0693i.l();
        }
    }

    @Override // j.AbstractC0616a
    public final void p(boolean z4) {
        this.f7970b = z4;
        this.f7130k.f7139k.setTitleOptional(z4);
    }
}
