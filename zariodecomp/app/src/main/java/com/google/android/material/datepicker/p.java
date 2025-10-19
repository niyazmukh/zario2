package com.google.android.material.datepicker;

import android.view.View;
import java.util.Iterator;
import k3.C0661b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\p.smali */
public final class p implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5986b;

    public /* synthetic */ p(r rVar, int i) {
        this.f5985a = i;
        this.f5986b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5985a) {
            case 0:
                r rVar = this.f5986b;
                Iterator it = rVar.f6006q0.iterator();
                while (it.hasNext()) {
                    C0661b c0661b = (C0661b) it.next();
                    A aC0 = rVar.c0();
                    c0661b.f8307a.invoke(new L.c(aC0.f5924b, aC0.f5925c));
                }
                rVar.Y(false, false);
                break;
            default:
                r rVar2 = this.f5986b;
                Iterator it2 = rVar2.f6007r0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                rVar2.Y(false, false);
                break;
        }
    }
}
