package B3;

import java.util.ArrayList;
import java.util.Iterator;
import z3.EnumC1087k;

/* renamed from: B3.t0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\t0.1.smali */
public final class RunnableC0080t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.k0 f974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f975c;

    public /* synthetic */ RunnableC0080t0(A0 a02, z3.k0 k0Var, int i) {
        this.f973a = i;
        this.f975c = a02;
        this.f974b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f973a) {
            case 0:
                EnumC1087k enumC1087k = this.f975c.f369w.f11361a;
                EnumC1087k enumC1087k2 = EnumC1087k.f11345e;
                if (enumC1087k != enumC1087k2) {
                    A0 a02 = this.f975c;
                    a02.f370x = this.f974b;
                    E e5 = a02.f368v;
                    A0 a03 = this.f975c;
                    C0089w0 c0089w0 = a03.f367u;
                    a03.f368v = null;
                    A0 a04 = this.f975c;
                    a04.f367u = null;
                    A0.g(a04, enumC1087k2);
                    this.f975c.f358l.d();
                    if (this.f975c.f365s.isEmpty()) {
                        A0 a05 = this.f975c;
                        a05.getClass();
                        a05.f357k.execute(new s0(a05, 2));
                    }
                    A0 a06 = this.f975c;
                    a06.f357k.d();
                    S0.l lVar = a06.f362p;
                    if (lVar != null) {
                        lVar.i();
                        a06.f362p = null;
                        a06.f360n = null;
                    }
                    S0.l lVar2 = this.f975c.f363q;
                    if (lVar2 != null) {
                        lVar2.i();
                        this.f975c.f364r.b(this.f974b);
                        A0 a07 = this.f975c;
                        a07.f363q = null;
                        a07.f364r = null;
                    }
                    if (e5 != null) {
                        e5.b(this.f974b);
                    }
                    if (c0089w0 != null) {
                        c0089w0.b(this.f974b);
                        break;
                    }
                }
                break;
            default:
                Iterator it = new ArrayList(this.f975c.f365s).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0045g1) it.next()).d(this.f974b);
                }
                break;
        }
    }
}
