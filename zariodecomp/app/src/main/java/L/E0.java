package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0650i;
import k.l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\E0.smali */
public final class E0 extends C0703n0 {

    /* renamed from: q, reason: collision with root package name */
    public final int f8443q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8444r;

    /* renamed from: s, reason: collision with root package name */
    public A0 f8445s;

    /* renamed from: t, reason: collision with root package name */
    public k.n f8446t;

    public E0(Context context, boolean z4) {
        super(context, z4);
        if (1 == D0.a(context.getResources().getConfiguration())) {
            this.f8443q = 21;
            this.f8444r = 22;
        } else {
            this.f8443q = 22;
            this.f8444r = 21;
        }
    }

    @Override // l.C0703n0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0650i c0650i;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f8445s != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0650i = (C0650i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0650i = (C0650i) adapter;
                headersCount = 0;
            }
            k.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0650i.getCount()) ? null : c0650i.getItem(i);
            k.n nVar = this.f8446t;
            if (nVar != nVarB) {
                l lVar = c0650i.f8211a;
                if (nVar != null) {
                    this.f8445s.n(lVar, nVar);
                }
                this.f8446t = nVarB;
                if (nVarB != null) {
                    this.f8445s.c(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f8443q) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f8444r) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0650i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0650i) adapter).f8211a.c(false);
        return true;
    }

    public void setHoverListener(A0 a02) {
        this.f8445s = a02;
    }

    @Override // l.C0703n0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
