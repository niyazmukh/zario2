package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k.1\g.smali */
public final class C0648g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f8203a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0649h f8204b;

    public C0648g(C0649h c0649h) {
        this.f8204b = c0649h;
        a();
    }

    public final void a() {
        l lVar = this.f8204b.f8207c;
        n nVar = lVar.f8237v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f8225j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((n) arrayList.get(i)) == nVar) {
                    this.f8203a = i;
                    return;
                }
            }
        }
        this.f8203a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i) {
        C0649h c0649h = this.f8204b;
        l lVar = c0649h.f8207c;
        lVar.i();
        ArrayList arrayList = lVar.f8225j;
        c0649h.getClass();
        int i5 = this.f8203a;
        if (i5 >= 0 && i >= i5) {
            i++;
        }
        return (n) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0649h c0649h = this.f8204b;
        l lVar = c0649h.f8207c;
        lVar.i();
        int size = lVar.f8225j.size();
        c0649h.getClass();
        return this.f8203a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8204b.f8206b.inflate(2131427344, viewGroup, false);
        }
        ((z) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
