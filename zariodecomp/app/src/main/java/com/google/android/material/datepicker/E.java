package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\E.smali */
public final class E implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f5930b;

    public E(G g3, int i) {
        this.f5930b = g3;
        this.f5929a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        G g3 = this.f5930b;
        t tVarC = t.c(this.f5929a, g3.f5932c.f5976e0.f6020b);
        o oVar = g3.f5932c;
        C0383c c0383c = oVar.f5975d0;
        t tVar = c0383c.f5942a;
        if (tVarC.compareTo(tVar) < 0) {
            tVarC = tVar;
        } else {
            t tVar2 = c0383c.f5943b;
            if (tVarC.compareTo(tVar2) > 0) {
                tVarC = tVar2;
            }
        }
        oVar.Z(tVarC);
        oVar.a0(1);
    }
}
