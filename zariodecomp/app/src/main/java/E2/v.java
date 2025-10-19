package E2;

import A2.C0009i;
import A2.g0;
import B3.C0063m1;
import a.AbstractC0183a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\v.smali */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0063m1 f1506a;

    public v(C0063m1 c0063m1) {
        this.f1506a = c0063m1;
    }

    public final void a() {
        C0063m1 c0063m1 = this.f1506a;
        Iterator it = ((HashMap) c0063m1.f906f).values().iterator();
        while (it.hasNext()) {
            c0063m1.h((g0) it.next());
        }
    }

    public final void b(k0 k0Var) {
        C0063m1 c0063m1 = this.f1506a;
        c0063m1.getClass();
        if (k0Var.e()) {
            AbstractC0183a.N(!c0063m1.i(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        c0063m1.f908j = null;
        boolean zI = c0063m1.i();
        u uVar = (u) c0063m1.f907g;
        if (!zI) {
            uVar.c(1);
            return;
        }
        if (uVar.f1500a == 2) {
            uVar.b(1);
            AbstractC0183a.N(uVar.f1501b == 0, "watchStreamFailures must be 0", new Object[0]);
            AbstractC0183a.N(uVar.f1502c == null, "onlineStateTimer must be null", new Object[0]);
        } else {
            int i = uVar.f1501b + 1;
            uVar.f1501b = i;
            if (i >= 1) {
                C0009i c0009i = uVar.f1502c;
                if (c0009i != null) {
                    c0009i.w();
                    uVar.f1502c = null;
                }
                Locale locale = Locale.ENGLISH;
                uVar.a("Connection failed 1 times. Most recent error: " + k0Var);
                uVar.b(3);
            }
        }
        c0063m1.k();
    }
}
