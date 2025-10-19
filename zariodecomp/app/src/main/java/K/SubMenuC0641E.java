package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\E.smali */
public final class SubMenuC0641E extends l implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final n f8155A;

    /* renamed from: z, reason: collision with root package name */
    public final l f8156z;

    public SubMenuC0641E(Context context, l lVar, n nVar) {
        super(context);
        this.f8156z = lVar;
        this.f8155A = nVar;
    }

    @Override // k.l
    public final boolean d(n nVar) {
        return this.f8156z.d(nVar);
    }

    @Override // k.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f8156z.e(lVar, menuItem);
    }

    @Override // k.l
    public final boolean f(n nVar) {
        return this.f8156z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f8155A;
    }

    @Override // k.l
    public final String j() {
        n nVar = this.f8155A;
        int i = nVar != null ? nVar.f8246a : 0;
        if (i == 0) {
            return null;
        }
        return B.a.g(i, "android:menu:actionviewstates:");
    }

    @Override // k.l
    public final l k() {
        return this.f8156z.k();
    }

    @Override // k.l
    public final boolean m() {
        return this.f8156z.m();
    }

    @Override // k.l
    public final boolean n() {
        return this.f8156z.n();
    }

    @Override // k.l
    public final boolean o() {
        return this.f8156z.o();
    }

    @Override // k.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f8156z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f8155A.setIcon(drawable);
        return this;
    }

    @Override // k.l, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f8156z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f8155A.setIcon(i);
        return this;
    }
}
