package B3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import z3.C1077a;
import z3.InterfaceC1085i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\i2.smali */
public abstract class i2 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1077a f844a = new C1077a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* renamed from: b, reason: collision with root package name */
    public static final C1077a f845b = new C1077a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static I0 n() {
        return E1.f402e == null ? new E1() : new C0049i(0);
    }

    public static Set o(Map map, String str) {
        z3.j0 j0VarValueOf;
        List listC = D0.c(map, str);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(z3.j0.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d5 = (Double) obj;
                int iIntValue = d5.intValue();
                p1.b.T(obj, "Status code %s is not integral", ((double) iIntValue) == d5.doubleValue());
                j0VarValueOf = z3.k0.c(iIntValue).f11358a;
                p1.b.T(obj, "Status code %s is not valid", j0VarValueOf.f11339a == d5.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new B0.c("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    j0VarValueOf = z3.j0.valueOf((String) obj);
                } catch (IllegalArgumentException e5) {
                    throw new B0.c("Status code " + obj + " is not valid", e5);
                }
            }
            enumSetNoneOf.add(j0VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List p(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = D0.c(map, "loadBalancingConfig");
            if (listC == null) {
                listC = null;
            } else {
                D0.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = D0.h(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static z3.d0 t(List list, z3.O o5) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g2 g2Var = (g2) it.next();
            String str = g2Var.f813a;
            z3.N nB = o5.b(str);
            if (nB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(i2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                z3.d0 d0VarE = nB.e(g2Var.f814b);
                return d0VarE.f11302a != null ? d0VarE : new z3.d0(new h2(nB, d0VarE.f11303b));
            }
            arrayList.add(str);
        }
        return new z3.d0(z3.k0.f11350g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new g2(D0.g(map, str), str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // B3.n2
    public void a(InterfaceC1085i interfaceC1085i) {
        ((AbstractC0034d) this).f782d.a(interfaceC1085i);
    }

    @Override // B3.n2
    public void flush() {
        InterfaceC0047h0 interfaceC0047h0 = ((AbstractC0034d) this).f782d;
        if (interfaceC0047h0.c()) {
            return;
        }
        interfaceC0047h0.flush();
    }

    @Override // B3.n2
    public void i(int i) {
        C3.i iVar = ((C3.j) this).f1182n;
        iVar.getClass();
        J3.b.b();
        RunnableC0040f runnableC0040f = new RunnableC0040f(iVar, i, 0);
        synchronized (iVar.f1173w) {
            runnableC0040f.run();
        }
    }

    @Override // B3.n2
    public void j(G3.a aVar) throws IOException {
        try {
            if (!((AbstractC0034d) this).f782d.c()) {
                ((AbstractC0034d) this).f782d.d(aVar);
            }
        } finally {
            AbstractC0056k0.b(aVar);
        }
    }

    @Override // B3.n2
    public void l() {
        C3.i iVar = ((C3.j) this).f1182n;
        C0051i1 c0051i1 = iVar.f755d;
        c0051i1.f826a = iVar;
        iVar.f752a = c0051i1;
    }

    public abstract int q();

    public abstract boolean r(f2 f2Var);

    public abstract void s(f2 f2Var);
}
