package com.google.android.material.datepicker;

import A2.T;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import t0.AbstractC0902I;
import t0.g0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\G.smali */
public final class G extends AbstractC0902I {

    /* renamed from: c, reason: collision with root package name */
    public final o f5932c;

    public G(o oVar) {
        this.f5932c = oVar;
    }

    @Override // t0.AbstractC0902I
    public final int a() {
        return this.f5932c.f5975d0.f5947f;
    }

    @Override // t0.AbstractC0902I
    public final void c(g0 g0Var, int i) {
        o oVar = this.f5932c;
        int i5 = oVar.f5975d0.f5942a.f6021c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i5));
        TextView textView = ((F) g0Var).f5931t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(D.d().get(1) == i5 ? String.format(context.getString(2131886406), Integer.valueOf(i5)) : String.format(context.getString(2131886407), Integer.valueOf(i5)));
        K0.t tVar = oVar.f5978g0;
        Calendar calendarD = D.d();
        T t4 = (T) (calendarD.get(1) == i5 ? tVar.f2186f : tVar.f2184d);
        Iterator it = oVar.f5974c0.c().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarD.get(1) == i5) {
                t4 = (T) tVar.f2185e;
            }
        }
        t4.K(textView);
        textView.setOnClickListener(new E(this, i5));
    }

    @Override // t0.AbstractC0902I
    public final g0 d(ViewGroup viewGroup) {
        return new F((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131427428, viewGroup, false));
    }
}
