package B3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\C0.smali */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f381a = Logger.getLogger(C0.class.getName());

    public static Object a(O2.a aVar) throws IOException, NumberFormatException {
        String strQ;
        String strQ2;
        String str;
        double d5;
        S0.f.q("unexpected end of JSON", aVar.m());
        int iC = t.h.c(aVar.s());
        boolean z4 = true;
        if (iC == 0) {
            int iE = aVar.f2646k;
            if (iE == 0) {
                iE = aVar.e();
            }
            if (iE != 3) {
                throw new IllegalStateException("Expected BEGIN_ARRAY but was " + B.a.s(aVar.s()) + aVar.o());
            }
            aVar.t(1);
            aVar.f2653r[aVar.f2651p - 1] = 0;
            aVar.f2646k = 0;
            ArrayList arrayList = new ArrayList();
            while (aVar.m()) {
                arrayList.add(a(aVar));
            }
            S0.f.q("Bad token: " + aVar.l(), aVar.s() == 2);
            int iE2 = aVar.f2646k;
            if (iE2 == 0) {
                iE2 = aVar.e();
            }
            if (iE2 != 4) {
                throw new IllegalStateException("Expected END_ARRAY but was " + B.a.s(aVar.s()) + aVar.o());
            }
            int i = aVar.f2651p;
            aVar.f2651p = i - 1;
            int[] iArr = aVar.f2653r;
            int i5 = i - 2;
            iArr[i5] = iArr[i5] + 1;
            aVar.f2646k = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (iC == 2) {
            int iE3 = aVar.f2646k;
            if (iE3 == 0) {
                iE3 = aVar.e();
            }
            if (iE3 != 1) {
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + B.a.s(aVar.s()) + aVar.o());
            }
            aVar.t(3);
            aVar.f2646k = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.m()) {
                int iE4 = aVar.f2646k;
                if (iE4 == 0) {
                    iE4 = aVar.e();
                }
                if (iE4 == 14) {
                    strQ2 = aVar.r();
                } else if (iE4 == 12) {
                    strQ2 = aVar.q('\'');
                } else {
                    if (iE4 != 13) {
                        throw new IllegalStateException("Expected a name but was " + B.a.s(aVar.s()) + aVar.o());
                    }
                    strQ = aVar.q('\"');
                    aVar.f2646k = 0;
                    aVar.f2652q[aVar.f2651p - 1] = strQ;
                    linkedHashMap.put(strQ, a(aVar));
                }
                strQ = strQ2;
                aVar.f2646k = 0;
                aVar.f2652q[aVar.f2651p - 1] = strQ;
                linkedHashMap.put(strQ, a(aVar));
            }
            S0.f.q("Bad token: " + aVar.l(), aVar.s() == 4);
            int iE5 = aVar.f2646k;
            if (iE5 == 0) {
                iE5 = aVar.e();
            }
            if (iE5 != 2) {
                throw new IllegalStateException("Expected END_OBJECT but was " + B.a.s(aVar.s()) + aVar.o());
            }
            int i6 = aVar.f2651p;
            int i7 = i6 - 1;
            aVar.f2651p = i7;
            aVar.f2652q[i7] = null;
            int[] iArr2 = aVar.f2653r;
            int i8 = i6 - 2;
            iArr2[i8] = iArr2[i8] + 1;
            aVar.f2646k = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        char[] cArr = aVar.f2641b;
        if (iC == 5) {
            int iE6 = aVar.f2646k;
            if (iE6 == 0) {
                iE6 = aVar.e();
            }
            if (iE6 == 10) {
                str = aVar.r();
            } else if (iE6 == 8) {
                str = aVar.q('\'');
            } else if (iE6 == 9) {
                str = aVar.q('\"');
            } else if (iE6 == 11) {
                str = aVar.f2649n;
                aVar.f2649n = null;
            } else if (iE6 == 15) {
                str = Long.toString(aVar.f2647l);
            } else {
                if (iE6 != 16) {
                    throw new IllegalStateException("Expected a string but was " + B.a.s(aVar.s()) + aVar.o());
                }
                str = new String(cArr, aVar.f2642c, aVar.f2648m);
                aVar.f2642c += aVar.f2648m;
            }
            aVar.f2646k = 0;
            int[] iArr3 = aVar.f2653r;
            int i9 = aVar.f2651p - 1;
            iArr3[i9] = iArr3[i9] + 1;
            return str;
        }
        if (iC != 6) {
            if (iC != 7) {
                if (iC != 8) {
                    throw new IllegalStateException("Bad token: " + aVar.l());
                }
                int iE7 = aVar.f2646k;
                if (iE7 == 0) {
                    iE7 = aVar.e();
                }
                if (iE7 != 7) {
                    throw new IllegalStateException("Expected null but was " + B.a.s(aVar.s()) + aVar.o());
                }
                aVar.f2646k = 0;
                int[] iArr4 = aVar.f2653r;
                int i10 = aVar.f2651p - 1;
                iArr4[i10] = iArr4[i10] + 1;
                return null;
            }
            int iE8 = aVar.f2646k;
            if (iE8 == 0) {
                iE8 = aVar.e();
            }
            if (iE8 == 5) {
                aVar.f2646k = 0;
                int[] iArr5 = aVar.f2653r;
                int i11 = aVar.f2651p - 1;
                iArr5[i11] = iArr5[i11] + 1;
            } else {
                if (iE8 != 6) {
                    throw new IllegalStateException("Expected a boolean but was " + B.a.s(aVar.s()) + aVar.o());
                }
                aVar.f2646k = 0;
                int[] iArr6 = aVar.f2653r;
                int i12 = aVar.f2651p - 1;
                iArr6[i12] = iArr6[i12] + 1;
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        int iE9 = aVar.f2646k;
        if (iE9 == 0) {
            iE9 = aVar.e();
        }
        if (iE9 == 15) {
            aVar.f2646k = 0;
            int[] iArr7 = aVar.f2653r;
            int i13 = aVar.f2651p - 1;
            iArr7[i13] = iArr7[i13] + 1;
            d5 = aVar.f2647l;
        } else {
            if (iE9 == 16) {
                aVar.f2649n = new String(cArr, aVar.f2642c, aVar.f2648m);
                aVar.f2642c += aVar.f2648m;
            } else if (iE9 == 8 || iE9 == 9) {
                aVar.f2649n = aVar.q(iE9 == 8 ? '\'' : '\"');
            } else if (iE9 == 10) {
                aVar.f2649n = aVar.r();
            } else if (iE9 != 11) {
                throw new IllegalStateException("Expected a double but was " + B.a.s(aVar.s()) + aVar.o());
            }
            aVar.f2646k = 11;
            double d6 = Double.parseDouble(aVar.f2649n);
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                throw new O2.b("JSON forbids NaN and infinities: " + d6 + aVar.o());
            }
            aVar.f2649n = null;
            aVar.f2646k = 0;
            int[] iArr8 = aVar.f2653r;
            int i14 = aVar.f2651p - 1;
            iArr8[i14] = iArr8[i14] + 1;
            d5 = d6;
        }
        return Double.valueOf(d5);
    }
}
