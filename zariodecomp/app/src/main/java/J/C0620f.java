package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.MenuC0638B;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\f.smali */
public final class C0620f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7983a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0616a f7984b;

    public C0620f(Context context, AbstractC0616a abstractC0616a) {
        this.f7983a = context;
        this.f7984b = abstractC0616a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f7984b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f7984b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0638B(this.f7983a, this.f7984b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f7984b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f7984b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f7984b.f7969a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f7984b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f7984b.f7970b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f7984b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f7984b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f7984b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f7984b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f7984b.f7969a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f7984b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f7984b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f7984b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f7984b.m(i);
    }
}
