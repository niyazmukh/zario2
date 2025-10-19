package E2;

import N2.j0;
import N2.n0;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: E2.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\i.1.smali */
public final class C0106i {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f1454d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a, reason: collision with root package name */
    public final S0.l f1455a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.f f1456b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1457c;

    public C0106i(F2.f fVar, S0.l lVar, q qVar) {
        this.f1456b = fVar;
        this.f1455a = lVar;
        this.f1457c = qVar;
    }

    public static boolean a(w2.o oVar) {
        switch (oVar.ordinal()) {
            case 0:
                throw new IllegalArgumentException("Treated status OK as error");
            case 1:
            case 2:
            case 4:
            case 8:
            case 13:
            case 14:
            case 16:
                return false;
            case 3:
            case 5:
            case 6:
            case 7:
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 15:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + oVar);
        }
    }
}
