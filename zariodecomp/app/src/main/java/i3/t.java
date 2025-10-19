package I3;

import B3.D0;
import B3.h2;
import B3.i2;
import S0.i;
import java.util.List;
import java.util.Map;
import z3.AbstractC1080d;
import z3.M;
import z3.N;
import z3.O;
import z3.d0;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I3\t.smali */
public final class t extends N {
    public static d0 f(Map map) {
        i iVar;
        S0.n nVar;
        List list;
        Integer num;
        Integer num2;
        Long lI = D0.i(map, "interval");
        Long lI2 = D0.i(map, "baseEjectionTime");
        Long lI3 = D0.i(map, "maxEjectionTime");
        Integer numF = D0.f(map, "maxEjectionPercentage");
        Long l4 = lI != null ? lI : 10000000000L;
        Long l5 = lI2 != null ? lI2 : 30000000000L;
        Long l6 = lI3 != null ? lI3 : 300000000000L;
        Integer num3 = numF != null ? numF : 10;
        Map mapG = D0.g(map, "successRateEjection");
        if (mapG != null) {
            Integer num4 = 100;
            Integer numF2 = D0.f(mapG, "stdevFactor");
            Integer numF3 = D0.f(mapG, "enforcementPercentage");
            Integer numF4 = D0.f(mapG, "minimumHosts");
            Integer numF5 = D0.f(mapG, "requestVolume");
            Integer num5 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                S0.f.h(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num = numF3;
            } else {
                num = num4;
            }
            if (numF4 != null) {
                S0.f.h(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = 5;
            }
            if (numF5 != null) {
                S0.f.h(numF5.intValue() >= 0);
                num4 = numF5;
            }
            iVar = new i(num5, num, num2, num4);
        } else {
            iVar = null;
        }
        Map mapG2 = D0.g(map, "failurePercentageEjection");
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer numF6 = D0.f(mapG2, "threshold");
            Integer numF7 = D0.f(mapG2, "enforcementPercentage");
            Integer numF8 = D0.f(mapG2, "minimumHosts");
            Integer numF9 = D0.f(mapG2, "requestVolume");
            if (numF6 != null) {
                S0.f.h(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                S0.f.h(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num7 = numF7;
            }
            if (numF8 != null) {
                S0.f.h(numF8.intValue() >= 0);
                num8 = numF8;
            }
            if (numF9 != null) {
                S0.f.h(numF9.intValue() >= 0);
                num9 = numF9;
            }
            S0.n nVar2 = new S0.n();
            nVar2.f2872a = num6;
            nVar2.f2873b = num7;
            nVar2.f2874c = num8;
            nVar2.f2875d = num9;
            nVar = nVar2;
        } else {
            nVar = null;
        }
        List listC = D0.c(map, "childPolicy");
        if (listC == null) {
            list = null;
        } else {
            D0.a(listC);
            list = listC;
        }
        List listU = i2.u(list);
        if (listU == null || listU.isEmpty()) {
            return new d0(k0.f11354m.g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        d0 d0VarT = i2.t(listU, O.a());
        if (d0VarT.f11302a != null) {
            return d0VarT;
        }
        h2 h2Var = (h2) d0VarT.f11303b;
        if (h2Var == null) {
            throw new IllegalStateException();
        }
        if (h2Var != null) {
            return new d0(new n(l4, l5, l6, num3, iVar, nVar, h2Var));
        }
        throw new IllegalStateException();
    }

    @Override // z3.N
    public String a() {
        return "outlier_detection_experimental";
    }

    @Override // z3.N
    public int b() {
        return 5;
    }

    @Override // z3.N
    public boolean c() {
        return true;
    }

    @Override // z3.N
    public final M d(AbstractC1080d abstractC1080d) {
        return new s(abstractC1080d);
    }

    @Override // z3.N
    public d0 e(Map map) {
        try {
            return f(map);
        } catch (RuntimeException e5) {
            return new d0(k0.f11355n.f(e5).g("Failed parsing configuration for " + this.a()));
        }
    }
}
