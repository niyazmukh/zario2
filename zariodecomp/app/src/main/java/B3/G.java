package B3;

import java.util.ArrayList;
import java.util.Iterator;
import z3.EnumC1087k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\G.smali */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f410a;

    /* renamed from: b, reason: collision with root package name */
    public Object f411b;

    public A a(C0099z1 c0099z1) {
        z3.K k5 = ((Y0) this.f411b).f620B;
        if (((Y0) this.f411b).f627J.get()) {
            return ((Y0) this.f411b).f625H;
        }
        if (k5 == null) {
            ((Y0) this.f411b).f659p.execute(new N(this, 3));
            return ((Y0) this.f411b).f625H;
        }
        A aF = AbstractC0056k0.f(k5.a(c0099z1), Boolean.TRUE.equals(c0099z1.f1031a.f11290f));
        return aF != null ? aF : ((Y0) this.f411b).f625H;
    }

    public void b(EnumC1087k enumC1087k) {
        S0.f.l(enumC1087k, "newState");
        if (((EnumC1087k) this.f410a) == enumC1087k || ((EnumC1087k) this.f410a) == EnumC1087k.f11345e) {
            return;
        }
        this.f410a = enumC1087k;
        if (((ArrayList) this.f411b).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f411b;
        this.f411b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            F f2 = (F) it.next();
            f2.f406b.execute(f2.f405a);
        }
    }
}
