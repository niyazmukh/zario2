package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\v.smali */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f6033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f6034b;

    public v(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6034b = xVar;
        this.f6033a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        MaterialCalendarGridView materialCalendarGridView = this.f6033a;
        u uVarA = materialCalendarGridView.a();
        if (i < uVarA.a() || i > uVarA.c()) {
            return;
        }
        K2.c cVar = this.f6034b.f6039e;
        Long item = materialCalendarGridView.a().getItem(i);
        long jLongValue = item.longValue();
        o oVar = (o) cVar.b;
        if (oVar.f5975d0.f5944c.a(jLongValue)) {
            A a5 = oVar.f5974c0;
            Long l4 = a5.f5924b;
            if (l4 == null) {
                a5.f5924b = item;
            } else if (a5.f5925c != null || l4.longValue() > jLongValue) {
                a5.f5925c = null;
                a5.f5924b = item;
            } else {
                a5.f5925c = item;
            }
            Iterator it = oVar.f6041a0.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                A a6 = oVar.f5974c0;
                qVar.b(new L.c(a6.f5924b, a6.f5925c));
            }
            oVar.f5980i0.getAdapter().f9901a.b();
            RecyclerView recyclerView = oVar.f5979h0;
            if (recyclerView != null) {
                recyclerView.getAdapter().f9901a.b();
            }
        }
    }
}
