package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t0.AbstractC0910Q;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\j.smali */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f5961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f5962c;

    public /* synthetic */ j(o oVar, x xVar, int i) {
        this.f5960a = i;
        this.f5962c = oVar;
        this.f5961b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5960a) {
            case 0:
                o oVar = this.f5962c;
                int iI0 = ((LinearLayoutManager) oVar.f5980i0.getLayoutManager()).I0() - 1;
                if (iI0 >= 0) {
                    Calendar calendarC = D.c(this.f5961b.f6037c.f5942a.f6019a);
                    calendarC.add(2, iI0);
                    oVar.Z(new t(calendarC));
                    break;
                }
                break;
            default:
                o oVar2 = this.f5962c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar2.f5980i0.getLayoutManager();
                View viewK0 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
                int iF = (viewK0 == null ? -1 : AbstractC0910Q.F(viewK0)) + 1;
                if (iF < oVar2.f5980i0.getAdapter().a()) {
                    Calendar calendarC2 = D.c(this.f5961b.f6037c.f5942a.f6019a);
                    calendarC2.add(2, iF);
                    oVar2.Z(new t(calendarC2));
                    break;
                }
                break;
        }
    }
}
