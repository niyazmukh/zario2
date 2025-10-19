package k;

import android.view.MenuItem;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\q.smali */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f8274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8275b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8275b = sVar;
        this.f8274a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8274a.onMenuItemActionCollapse(this.f8275b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8274a.onMenuItemActionExpand(this.f8275b.g(menuItem));
    }
}
