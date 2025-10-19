package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import g.C0530e;
import j.AbstractC0616a;
import l.a1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\n.smali */
public final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5972b;

    public /* synthetic */ n(Object obj, int i) {
        this.f5971a = i;
        this.f5972b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f5971a) {
            case 0:
                o oVar = (o) this.f5972b;
                int i = oVar.f5977f0;
                if (i != 2) {
                    if (i == 1) {
                        oVar.a0(2);
                        break;
                    }
                } else {
                    oVar.a0(1);
                    break;
                }
                break;
            case 1:
                C0530e c0530e = (C0530e) this.f5972b;
                Message messageObtain = (view != c0530e.f7181g || (message3 = c0530e.i) == null) ? (view != c0530e.f7182j || (message2 = c0530e.f7184l) == null) ? (view != c0530e.f7185m || (message = c0530e.f7187o) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0530e.f7173C.obtainMessage(1, c0530e.f7176b).sendToTarget();
                break;
            case 2:
                ((AbstractC0616a) this.f5972b).a();
                break;
            default:
                a1 a1Var = ((Toolbar) this.f5972b).f4281P;
                k.n nVar = a1Var == null ? null : a1Var.f8551b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
