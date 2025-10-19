package B3;

import A2.C0020u;
import N2.AbstractC0156x;
import g2.C0580c;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* renamed from: B3.c1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\c1.1.smali */
public final class C0033c1 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0580c f771g = new C0580c("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 2);

    /* renamed from: a, reason: collision with root package name */
    public final Long f772a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f773b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f774c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f775d;

    /* renamed from: e, reason: collision with root package name */
    public final X1 f776e;

    /* renamed from: f, reason: collision with root package name */
    public final C0062m0 f777f;

    public C0033c1(Map map, boolean z4, int i, int i5) {
        X1 x12;
        C0062m0 c0062m0;
        this.f772a = D0.i(map, "timeout");
        this.f773b = D0.b(map, "waitForReady");
        Integer numF = D0.f(map, "maxResponseMessageBytes");
        this.f774c = numF;
        if (numF != null) {
            S0.f.e(numF, "maxInboundMessageSize %s exceeds bounds", numF.intValue() >= 0);
        }
        Integer numF2 = D0.f(map, "maxRequestMessageBytes");
        this.f775d = numF2;
        if (numF2 != null) {
            S0.f.e(numF2, "maxOutboundMessageSize %s exceeds bounds", numF2.intValue() >= 0);
        }
        Map mapG = z4 ? D0.g(map, "retryPolicy") : null;
        if (mapG == null) {
            x12 = null;
        } else {
            Integer numF3 = D0.f(mapG, "maxAttempts");
            S0.f.l(numF3, "maxAttempts cannot be empty");
            int iIntValue = numF3.intValue();
            S0.f.f("maxAttempts must be greater than 1: %s", iIntValue, iIntValue >= 2);
            int iMin = Math.min(iIntValue, i);
            Long lI = D0.i(mapG, "initialBackoff");
            S0.f.l(lI, "initialBackoff cannot be empty");
            long jLongValue = lI.longValue();
            S0.f.i(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            Long lI2 = D0.i(mapG, "maxBackoff");
            S0.f.l(lI2, "maxBackoff cannot be empty");
            long jLongValue2 = lI2.longValue();
            S0.f.i(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double dE = D0.e(mapG, "backoffMultiplier");
            S0.f.l(dE, "backoffMultiplier cannot be empty");
            double dDoubleValue = dE.doubleValue();
            S0.f.e(dE, "backoffMultiplier must be greater than 0: %s", dDoubleValue > 0.0d);
            Long lI3 = D0.i(mapG, "perAttemptRecvTimeout");
            S0.f.e(lI3, "perAttemptRecvTimeout cannot be negative: %s", lI3 == null || lI3.longValue() >= 0);
            Set setO = i2.o(mapG, "retryableStatusCodes");
            p1.b.T("retryableStatusCodes", "%s is required in retry policy", setO != null);
            p1.b.T("retryableStatusCodes", "%s must not contain OK", !setO.contains(z3.j0.OK));
            S0.f.g("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setO.isEmpty()) ? false : true);
            x12 = new X1(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setO);
        }
        this.f776e = x12;
        Map mapG2 = z4 ? D0.g(map, "hedgingPolicy") : null;
        if (mapG2 == null) {
            c0062m0 = null;
        } else {
            Integer numF4 = D0.f(mapG2, "maxAttempts");
            S0.f.l(numF4, "maxAttempts cannot be empty");
            int iIntValue2 = numF4.intValue();
            S0.f.f("maxAttempts must be greater than 1: %s", iIntValue2, iIntValue2 >= 2);
            int iMin2 = Math.min(iIntValue2, i5);
            Long lI4 = D0.i(mapG2, "hedgingDelay");
            S0.f.l(lI4, "hedgingDelay cannot be empty");
            long jLongValue3 = lI4.longValue();
            S0.f.i(jLongValue3 >= 0, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setO2 = i2.o(mapG2, "nonFatalStatusCodes");
            if (setO2 == null) {
                setO2 = Collections.unmodifiableSet(EnumSet.noneOf(z3.j0.class));
            } else {
                p1.b.T("nonFatalStatusCodes", "%s must not contain OK", !setO2.contains(z3.j0.OK));
            }
            c0062m0 = new C0062m0(iMin2, jLongValue3, setO2);
        }
        this.f777f = c0062m0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0033c1)) {
            return false;
        }
        C0033c1 c0033c1 = (C0033c1) obj;
        return AbstractC0156x.F(this.f772a, c0033c1.f772a) && AbstractC0156x.F(this.f773b, c0033c1.f773b) && AbstractC0156x.F(this.f774c, c0033c1.f774c) && AbstractC0156x.F(this.f775d, c0033c1.f775d) && AbstractC0156x.F(this.f776e, c0033c1.f776e) && AbstractC0156x.F(this.f777f, c0033c1.f777f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f772a, this.f773b, this.f774c, this.f775d, this.f776e, this.f777f});
    }

    public final String toString() {
        C0020u c0020uX = r1.d.X(this);
        c0020uX.a(this.f772a, "timeoutNanos");
        c0020uX.a(this.f773b, "waitForReady");
        c0020uX.a(this.f774c, "maxInboundMessageSize");
        c0020uX.a(this.f775d, "maxOutboundMessageSize");
        c0020uX.a(this.f776e, "retryPolicy");
        c0020uX.a(this.f777f, "hedgingPolicy");
        return c0020uX.toString();
    }
}
