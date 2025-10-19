package a0;

import B3.C0057k1;
import L3.j;
import N2.n0;
import W.C0160b;
import androidx.datastore.preferences.protobuf.AbstractC0218v;
import androidx.datastore.preferences.protobuf.AbstractC0220x;
import androidx.datastore.preferences.protobuf.C0204g;
import androidx.datastore.preferences.protobuf.C0209l;
import androidx.datastore.preferences.protobuf.C0222z;
import androidx.datastore.preferences.protobuf.InterfaceC0219w;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\g.smali */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4024a = new g();

    public final b a(FileInputStream fileInputStream) throws C0160b {
        byte[] bArr;
        try {
            Z.e eVarQ = Z.e.q(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map mapO = eVarQ.o();
            i.d(mapO, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapO.entrySet()) {
                String name = (String) entry.getKey();
                Z.i value = (Z.i) entry.getValue();
                i.d(name, "name");
                i.d(value, "value");
                int iE = value.E();
                switch (iE == 0 ? -1 : f.f4023a[t.h.c(iE)]) {
                    case -1:
                        throw new C0160b("Value case is null.", null);
                    case 0:
                    default:
                        throw new B0.c();
                    case 1:
                        bVar.f(r1.d.i(name), Boolean.valueOf(value.v()));
                        break;
                    case 2:
                        bVar.f(new d(name), Float.valueOf(value.z()));
                        break;
                    case 3:
                        bVar.f(new d(name), Double.valueOf(value.y()));
                        break;
                    case 4:
                        bVar.f(r1.d.E(name), Integer.valueOf(value.A()));
                        break;
                    case 5:
                        bVar.f(r1.d.M(name), Long.valueOf(value.B()));
                        break;
                    case 6:
                        d dVarV = r1.d.V(name);
                        String strC = value.C();
                        i.d(strC, "value.string");
                        bVar.f(dVarV, strC);
                        break;
                    case 7:
                        d dVarW = r1.d.W(name);
                        InterfaceC0219w interfaceC0219wP = value.D().p();
                        i.d(interfaceC0219wP, "value.stringSet.stringsList");
                        bVar.f(dVarW, j.z0(interfaceC0219wP));
                        break;
                    case 8:
                        d dVar = new d(name);
                        C0204g c0204gW = value.w();
                        int size = c0204gW.size();
                        if (size == 0) {
                            bArr = AbstractC0220x.f4564b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0204gW.i(bArr2, size);
                            bArr = bArr2;
                        }
                        i.d(bArr, "value.bytes.toByteArray()");
                        bVar.f(dVar, bArr);
                        break;
                    case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        throw new C0160b("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0222z e5) {
            throw new C0160b("Unable to parse preferences proto.", e5);
        }
    }

    public final void b(Object obj, C0057k1 c0057k1) {
        AbstractC0218v abstractC0218vA;
        Map mapA = ((b) obj).a();
        Z.c cVarP = Z.e.p();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f4022a;
            if (value instanceof Boolean) {
                Z.h hVarF = Z.i.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarF.c();
                Z.i.s((Z.i) hVarF.f4562b, zBooleanValue);
                abstractC0218vA = hVarF.a();
            } else if (value instanceof Float) {
                Z.h hVarF2 = Z.i.F();
                float fFloatValue = ((Number) value).floatValue();
                hVarF2.c();
                Z.i.t((Z.i) hVarF2.f4562b, fFloatValue);
                abstractC0218vA = hVarF2.a();
            } else if (value instanceof Double) {
                Z.h hVarF3 = Z.i.F();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarF3.c();
                Z.i.q((Z.i) hVarF3.f4562b, dDoubleValue);
                abstractC0218vA = hVarF3.a();
            } else if (value instanceof Integer) {
                Z.h hVarF4 = Z.i.F();
                int iIntValue = ((Number) value).intValue();
                hVarF4.c();
                Z.i.u((Z.i) hVarF4.f4562b, iIntValue);
                abstractC0218vA = hVarF4.a();
            } else if (value instanceof Long) {
                Z.h hVarF5 = Z.i.F();
                long jLongValue = ((Number) value).longValue();
                hVarF5.c();
                Z.i.n((Z.i) hVarF5.f4562b, jLongValue);
                abstractC0218vA = hVarF5.a();
            } else if (value instanceof String) {
                Z.h hVarF6 = Z.i.F();
                hVarF6.c();
                Z.i.o((Z.i) hVarF6.f4562b, (String) value);
                abstractC0218vA = hVarF6.a();
            } else if (value instanceof Set) {
                Z.h hVarF7 = Z.i.F();
                Z.f fVarQ = Z.g.q();
                i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                fVarQ.c();
                Z.g.n((Z.g) fVarQ.f4562b, (Set) value);
                hVarF7.c();
                Z.i.p((Z.i) hVarF7.f4562b, (Z.g) fVarQ.a());
                abstractC0218vA = hVarF7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                Z.h hVarF8 = Z.i.F();
                byte[] bArr = (byte[]) value;
                C0204g c0204g = C0204g.f4493c;
                C0204g c0204gH = C0204g.h(bArr, 0, bArr.length);
                hVarF8.c();
                Z.i.r((Z.i) hVarF8.f4562b, c0204gH);
                abstractC0218vA = hVarF8.a();
            }
            cVarP.getClass();
            str.getClass();
            cVarP.c();
            Z.e.n((Z.e) cVarP.f4562b).put(str, (Z.i) abstractC0218vA);
        }
        Z.e eVar = (Z.e) cVarP.a();
        int iA = eVar.a(null);
        Logger logger = C0209l.f4523g;
        if (iA > 4096) {
            iA = 4096;
        }
        C0209l c0209l = new C0209l(c0057k1, iA);
        eVar.b(c0209l);
        if (c0209l.f4527e > 0) {
            c0209l.X0();
        }
    }
}
