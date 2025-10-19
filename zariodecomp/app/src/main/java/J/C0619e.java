package j;

import S0.v;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.C0693i;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\e.smali */
public final class C0619e extends AbstractC0616a implements k.j {

    /* renamed from: c, reason: collision with root package name */
    public Context f7977c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f7978d;

    /* renamed from: e, reason: collision with root package name */
    public v f7979e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f7980f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7981k;

    /* renamed from: l, reason: collision with root package name */
    public k.l f7982l;

    @Override // j.AbstractC0616a
    public final void a() {
        if (this.f7981k) {
            return;
        }
        this.f7981k = true;
        this.f7979e.g(this);
    }

    @Override // j.AbstractC0616a
    public final View b() {
        WeakReference weakReference = this.f7980f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0616a
    public final k.l c() {
        return this.f7982l;
    }

    @Override // j.AbstractC0616a
    public final MenuInflater d() {
        return new C0622i(this.f7978d.getContext());
    }

    @Override // j.AbstractC0616a
    public final CharSequence e() {
        return this.f7978d.getSubtitle();
    }

    @Override // k.j
    public final boolean f(k.l lVar, MenuItem menuItem) {
        return ((S0.i) this.f7979e.f2935b).q(this, menuItem);
    }

    @Override // j.AbstractC0616a
    public final CharSequence g() {
        return this.f7978d.getTitle();
    }

    @Override // j.AbstractC0616a
    public final void h() {
        this.f7979e.h(this, this.f7982l);
    }

    @Override // j.AbstractC0616a
    public final boolean i() {
        return this.f7978d.f4170w;
    }

    @Override // j.AbstractC0616a
    public final void j(View view) {
        this.f7978d.setCustomView(view);
        this.f7980f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0616a
    public final void k(int i) {
        l(this.f7977c.getString(i));
    }

    @Override // j.AbstractC0616a
    public final void l(CharSequence charSequence) {
        this.f7978d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0616a
    public final void m(int i) {
        n(this.f7977c.getString(i));
    }

    @Override // j.AbstractC0616a
    public final void n(CharSequence charSequence) {
        this.f7978d.setTitle(charSequence);
    }

    @Override // k.j
    public final void o(k.l lVar) {
        h();
        C0693i c0693i = this.f7978d.f4155d;
        if (c0693i != null) {
            c0693i.l();
        }
    }

    @Override // j.AbstractC0616a
    public final void p(boolean z4) {
        this.f7970b = z4;
        this.f7978d.setTitleOptional(z4);
    }
}
