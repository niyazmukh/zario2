package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import t0.AbstractC0910Q;
import t0.AbstractC0913U;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\m.smali */
public final class m extends AbstractC0913U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f5968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f5969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f5970c;

    public m(o oVar, x xVar, MaterialButton materialButton) {
        this.f5970c = oVar;
        this.f5968a = xVar;
        this.f5969b = materialButton;
    }

    @Override // t0.AbstractC0913U
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f5969b.getText());
        }
    }

    @Override // t0.AbstractC0913U
    public final void b(RecyclerView recyclerView, int i, int i5) {
        int iI0;
        o oVar = this.f5970c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar.f5980i0.getLayoutManager();
            View viewK0 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
            iI0 = viewK0 == null ? -1 : AbstractC0910Q.F(viewK0);
        } else {
            iI0 = ((LinearLayoutManager) oVar.f5980i0.getLayoutManager()).I0();
        }
        C0383c c0383c = this.f5968a.f6037c;
        Calendar calendarC = D.c(c0383c.f5942a.f6019a);
        calendarC.add(2, iI0);
        oVar.f5976e0 = new t(calendarC);
        Calendar calendarC2 = D.c(c0383c.f5942a.f6019a);
        calendarC2.add(2, iI0);
        calendarC2.set(5, 1);
        Calendar calendarC3 = D.c(calendarC2);
        calendarC3.get(2);
        calendarC3.get(1);
        calendarC3.getMaximum(7);
        calendarC3.getActualMaximum(5);
        calendarC3.getTimeInMillis();
        this.f5969b.setText(D.b("yMMMM", Locale.getDefault()).format(new Date(calendarC3.getTimeInMillis())));
    }
}
