package com.google.android.material.datepicker;

import g0.AbstractComponentCallbacksC0567t;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\datepicker\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0567t f5988b;

    public /* synthetic */ q(int i, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        this.f5987a = i;
        this.f5988b = abstractComponentCallbacksC0567t;
    }

    public final void a() {
        switch (this.f5987a) {
            case 0:
                ((r) this.f5988b).f6002P0.setEnabled(false);
                break;
            default:
                Iterator it = ((s) this.f5988b).f6041a0.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).a();
                }
                break;
        }
    }

    public final void b(L.c cVar) {
        switch (this.f5987a) {
            case 0:
                r rVar = (r) this.f5988b;
                rVar.i0(rVar.d0());
                rVar.f6002P0.setEnabled(rVar.c0().e());
                break;
            default:
                Iterator it = ((s) this.f5988b).f6041a0.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).b(cVar);
                }
                break;
        }
    }
}
