package I3;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import z3.AbstractC1080d;
import z3.AbstractC1098w;
import z3.C1077a;
import z3.C1078b;
import z3.C1088l;
import z3.C1094s;
import z3.EnumC1087k;
import z3.H;
import z3.L;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\r.smali */
public final class r extends b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f1973a;

    /* renamed from: b, reason: collision with root package name */
    public k f1974b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1975c;

    /* renamed from: d, reason: collision with root package name */
    public C1088l f1976d;

    /* renamed from: e, reason: collision with root package name */
    public L f1977e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1080d f1978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f1979g;

    public r(s sVar, H h, h hVar) {
        this.f1979g = sVar;
        L l4 = (L) h.c();
        if (l4 != null) {
            this.f1977e = l4;
            f fVar = new f(this, l4, 1);
            h.getClass();
            H hD = H.d();
            hD.e(h.f11242b);
            C1078b c1078b = h.f11243c;
            S0.f.l(c1078b, "attrs");
            hD.f11243c = c1078b;
            Object[][] objArr = h.f11244d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            hD.f11244d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            hD.a(fVar);
            this.f1973a = hVar.g(hD.b());
        } else {
            this.f1973a = hVar.g(h);
        }
        this.f1978f = this.f1973a.d();
    }

    @Override // z3.AbstractC1098w
    public final C1078b c() {
        k kVar = this.f1974b;
        AbstractC1098w abstractC1098w = this.f1973a;
        if (kVar == null) {
            return abstractC1098w.c();
        }
        C1078b c1078bC = abstractC1098w.c();
        c1078bC.getClass();
        C1077a c1077a = s.n;
        k kVar2 = this.f1974b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1077a, kVar2);
        for (Map.Entry entry : c1078bC.f11280a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1077a) entry.getKey(), entry.getValue());
            }
        }
        return new C1078b(identityHashMap);
    }

    @Override // I3.b, z3.AbstractC1098w
    public final void m() {
        k kVar = this.f1974b;
        if (kVar != null) {
            this.f1974b = null;
            kVar.f1955f.remove(this);
        }
        super.m();
    }

    @Override // z3.AbstractC1098w
    public final void o(L l4) {
        if (this.f1977e != null) {
            q().o(l4);
            return;
        }
        this.f1977e = l4;
        q().o(new f(this, l4, 1));
    }

    @Override // I3.b, z3.AbstractC1098w
    public final void p(List list) {
        boolean zG = s.g(b());
        s sVar = this.f1979g;
        if (zG && s.g(list)) {
            l lVar = sVar.f;
            if (((HashMap) lVar.f1957b).containsValue(this.f1974b)) {
                k kVar = this.f1974b;
                kVar.getClass();
                this.f1974b = null;
                kVar.f1955f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C1094s) list.get(0)).f11399a.get(0);
            if (((HashMap) sVar.f.f1957b).containsKey(socketAddress)) {
                ((k) ((HashMap) sVar.f.f1957b).get(socketAddress)).a(this);
            }
        } else if (s.g(b()) && !s.g(list)) {
            l lVar2 = sVar.f;
            if (((HashMap) lVar2.f1957b).containsKey(a().f11399a.get(0))) {
                l lVar3 = sVar.f;
                k kVar2 = (k) ((HashMap) lVar3.f1957b).get(a().f11399a.get(0));
                kVar2.getClass();
                this.f1974b = null;
                kVar2.f1955f.remove(this);
                S0.l lVar4 = kVar2.f1951b;
                ((AtomicLong) lVar4.f2867b).set(0L);
                ((AtomicLong) lVar4.f2868c).set(0L);
                S0.l lVar5 = kVar2.f1952c;
                ((AtomicLong) lVar5.f2867b).set(0L);
                ((AtomicLong) lVar5.f2868c).set(0L);
            }
        } else if (!s.g(b()) && s.g(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((C1094s) list.get(0)).f11399a.get(0);
            if (((HashMap) sVar.f.f1957b).containsKey(socketAddress2)) {
                ((k) ((HashMap) sVar.f.f1957b).get(socketAddress2)).a(this);
            }
        }
        this.f1973a.p(list);
    }

    @Override // I3.b
    public final AbstractC1098w q() {
        return this.f1973a;
    }

    public final void r() {
        this.f1975c = true;
        L l4 = this.f1977e;
        k0 k0Var = k0.f11355n;
        S0.f.g("The error status must not be OK", true ^ k0Var.e());
        l4.a(new C1088l(EnumC1087k.f11343c, k0Var));
        this.f1978f.m(2, "Subchannel ejected: {0}", this);
    }

    @Override // I3.b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f1973a.b() + '}';
    }
}
