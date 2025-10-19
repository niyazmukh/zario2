package k;

import android.view.MenuItem;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\r.smali */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f8276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8277b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8277b = sVar;
        this.f8276a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f8276a.onMenuItemClick(this.f8277b.g(menuItem));
    }
}
