package B3;

import A2.C0020u;
import N2.AbstractC0156x;
import a.AbstractC0183a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: B3.e1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\e1.1.smali */
public final class C0039e1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0033c1 f795a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f796b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f797c;

    /* renamed from: d, reason: collision with root package name */
    public final W1 f798d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f799e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f800f;

    public C0039e1(C0033c1 c0033c1, HashMap map, HashMap map2, W1 w12, Object obj, Map map3) {
        this.f795a = c0033c1;
        this.f796b = Collections.unmodifiableMap(new HashMap(map));
        this.f797c = Collections.unmodifiableMap(new HashMap(map2));
        this.f798d = w12;
        this.f799e = obj;
        this.f800f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static C0039e1 a(Map map, boolean z4, int i, int i5, Object obj) {
        W1 w12;
        Map mapG;
        W1 w13;
        if (z4) {
            if (map == null || (mapG = D0.g(map, "retryThrottling")) == null) {
                w13 = null;
            } else {
                float fFloatValue = D0.e(mapG, "maxTokens").floatValue();
                float fFloatValue2 = D0.e(mapG, "tokenRatio").floatValue();
                S0.f.q("maxToken should be greater than zero", fFloatValue > 0.0f);
                S0.f.q("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
                w13 = new W1(fFloatValue, fFloatValue2);
            }
            w12 = w13;
        } else {
            w12 = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : D0.g(map, "healthCheckConfig");
        List<Map> listC = D0.c(map, "methodConfig");
        if (listC == null) {
            listC = null;
        } else {
            D0.a(listC);
        }
        if (listC == null) {
            return new C0039e1(null, map2, map3, w12, obj, mapG2);
        }
        C0033c1 c0033c1 = null;
        for (Map map4 : listC) {
            C0033c1 c0033c12 = new C0033c1(map4, z4, i, i5);
            List<Map> listC2 = D0.c(map4, "name");
            if (listC2 == null) {
                listC2 = null;
            } else {
                D0.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = D0.h(map5, "service");
                    String strH2 = D0.h(map5, "method");
                    if (AbstractC0183a.R(strH)) {
                        S0.f.e(strH2, "missing service name for method %s", AbstractC0183a.R(strH2));
                        S0.f.e(map, "Duplicate default method config in service config %s", c0033c1 == null);
                        c0033c1 = c0033c12;
                    } else if (AbstractC0183a.R(strH2)) {
                        S0.f.e(strH, "Duplicate service %s", !map3.containsKey(strH));
                        map3.put(strH, c0033c12);
                    } else {
                        String strB = com.google.android.gms.common.api.internal.F.b(strH, strH2);
                        S0.f.e(strB, "Duplicate method name %s", !map2.containsKey(strB));
                        map2.put(strB, c0033c12);
                    }
                }
            }
        }
        return new C0039e1(c0033c1, map2, map3, w12, obj, mapG2);
    }

    public final C0036d1 b() {
        if (this.f797c.isEmpty() && this.f796b.isEmpty() && this.f795a == null) {
            return null;
        }
        return new C0036d1(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0039e1.class != obj.getClass()) {
            return false;
        }
        C0039e1 c0039e1 = (C0039e1) obj;
        return AbstractC0156x.F(this.f795a, c0039e1.f795a) && AbstractC0156x.F(this.f796b, c0039e1.f796b) && AbstractC0156x.F(this.f797c, c0039e1.f797c) && AbstractC0156x.F(this.f798d, c0039e1.f798d) && AbstractC0156x.F(this.f799e, c0039e1.f799e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f795a, this.f796b, this.f797c, this.f798d, this.f799e});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f795a, "defaultMethodConfig");
        c0020uX.a(this.f796b, "serviceMethodMap");
        c0020uX.a(this.f797c, "serviceMap");
        c0020uX.a(this.f798d, "retryThrottling");
        c0020uX.a(this.f799e, "loadBalancingConfig");
        return c0020uX.toString();
    }
}
