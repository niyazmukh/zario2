package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import t0.AbstractC0902I;
import t0.C0911S;
import t0.g0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\x.smali */
public final class x extends AbstractC0902I {

    /* renamed from: c, reason: collision with root package name */
    public final C0383c f6037c;

    /* renamed from: d, reason: collision with root package name */
    public final A f6038d;

    /* renamed from: e, reason: collision with root package name */
    public final K2.c f6039e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6040f;

    public x(ContextThemeWrapper contextThemeWrapper, A a5, C0383c c0383c, K2.c cVar) {
        t tVar = c0383c.f5942a;
        t tVar2 = c0383c.f5945d;
        if (tVar.compareTo(tVar2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (tVar2.compareTo(c0383c.f5943b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f6040f = (contextThemeWrapper.getResources().getDimensionPixelSize(2131100291) * u.f6026f) + (r.g0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131100291) : 0);
        this.f6037c = c0383c;
        this.f6038d = a5;
        this.f6039e = cVar;
        if (this.f9901a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f9902b = true;
    }

    @Override // t0.AbstractC0902I
    public final int a() {
        return this.f6037c.f5948k;
    }

    @Override // t0.AbstractC0902I
    public final long b(int i) {
        Calendar calendarC = D.c(this.f6037c.f5942a.f6019a);
        calendarC.add(2, i);
        calendarC.set(5, 1);
        Calendar calendarC2 = D.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // t0.AbstractC0902I
    public final void c(g0 g0Var, int i) {
        w wVar = (w) g0Var;
        C0383c c0383c = this.f6037c;
        Calendar calendarC = D.c(c0383c.f5942a.f6019a);
        calendarC.add(2, i);
        t tVar = new t(calendarC);
        wVar.f6035t.setText(tVar.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) wVar.f6036u.findViewById(2131231037);
        if (materialCalendarGridView.a() == null || !tVar.equals(materialCalendarGridView.a().f6028a)) {
            u uVar = new u(tVar, this.f6038d, c0383c);
            materialCalendarGridView.setNumColumns(tVar.f6022d);
            materialCalendarGridView.setAdapter((ListAdapter) uVar);
        } else {
            materialCalendarGridView.invalidate();
            u uVarA = materialCalendarGridView.a();
            Iterator it = uVarA.f6030c.iterator();
            while (it.hasNext()) {
                uVarA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            A a5 = uVarA.f6029b;
            if (a5 != null) {
                Iterator it2 = a5.c().iterator();
                while (it2.hasNext()) {
                    uVarA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                uVarA.f6030c = a5.c();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new v(this, materialCalendarGridView));
    }

    @Override // t0.AbstractC0902I
    public final g0 d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131427424, viewGroup, false);
        if (!r.g0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new w(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0911S(-1, this.f6040f));
        return new w(linearLayout, true);
    }
}
