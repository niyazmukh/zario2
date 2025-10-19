package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\i.smali */
public final class C0650i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final l f8211a;

    /* renamed from: b, reason: collision with root package name */
    public int f8212b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8213c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8214d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f8215e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8216f;

    public C0650i(l lVar, LayoutInflater layoutInflater, boolean z4, int i) {
        this.f8214d = z4;
        this.f8215e = layoutInflater;
        this.f8211a = lVar;
        this.f8216f = i;
        a();
    }

    public final void a() {
        l lVar = this.f8211a;
        n nVar = lVar.f8237v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f8225j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f8212b = i;
                    return;
                }
            }
        }
        this.f8212b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        ArrayList arrayListL;
        l lVar = this.f8211a;
        if (this.f8214d) {
            lVar.i();
            arrayListL = lVar.f8225j;
        } else {
            arrayListL = lVar.l();
        }
        int i5 = this.f8212b;
        if (i5 >= 0 && i >= i5) {
            i++;
        }
        return (n) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        l lVar = this.f8211a;
        if (this.f8214d) {
            lVar.i();
            arrayListL = lVar.f8225j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f8212b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f8215e.inflate(this.f8216f, viewGroup, false);
        }
        int i5 = getItem(i).f8247b;
        int i6 = i - 1;
        int i7 = i6 >= 0 ? getItem(i6).f8247b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f8211a.m() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        z zVar = (z) view;
        if (this.f8213c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
