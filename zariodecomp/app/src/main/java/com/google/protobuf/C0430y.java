package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\y.1.smali */
public final class C0430y {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6599c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0427v0 f6600a = new C0427v0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f6601b;

    static {
        new C0430y(0);
    }

    public C0430y() {
    }

    public static void b(AbstractC0422s abstractC0422s, U0 u02, int i, Object obj) {
        if (u02 == U0.f6462d) {
            abstractC0422s.K0(i, 3);
            ((AbstractC0388a) obj).e(abstractC0422s);
            abstractC0422s.K0(i, 4);
            return;
        }
        abstractC0422s.K0(i, u02.f6466b);
        switch (u02.ordinal()) {
            case 0:
                abstractC0422s.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC0422s.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC0422s.O0(((Long) obj).longValue());
                break;
            case 3:
                abstractC0422s.O0(((Long) obj).longValue());
                break;
            case 4:
                abstractC0422s.F0(((Integer) obj).intValue());
                break;
            case 5:
                abstractC0422s.D0(((Long) obj).longValue());
                break;
            case 6:
                abstractC0422s.B0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC0422s.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC0409l)) {
                    abstractC0422s.J0((String) obj);
                    break;
                } else {
                    abstractC0422s.z0((AbstractC0409l) obj);
                    break;
                }
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                ((AbstractC0388a) obj).e(abstractC0422s);
                break;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                abstractC0422s.H0((AbstractC0388a) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0409l)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0422s.x0(bArr, bArr.length);
                    break;
                } else {
                    abstractC0422s.z0((AbstractC0409l) obj);
                    break;
                }
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                abstractC0422s.M0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof I)) {
                    abstractC0422s.F0(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC0422s.F0(((I) obj).a());
                    break;
                }
            case 14:
                abstractC0422s.B0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0422s.D0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC0422s.M0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                abstractC0422s.O0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        C0427v0 c0427v0;
        if (this.f6601b) {
            return;
        }
        int i = 0;
        while (true) {
            c0427v0 = this.f6600a;
            if (i >= c0427v0.f6592b.size()) {
                break;
            }
            Map.Entry entryC = c0427v0.c(i);
            if (entryC.getValue() instanceof E) {
                E e5 = (E) entryC.getValue();
                e5.getClass();
                C0414n0 c0414n0 = C0414n0.f6548c;
                c0414n0.getClass();
                c0414n0.a(e5.getClass()).d(e5);
                e5.o();
            }
            i++;
        }
        if (!c0427v0.f6594d) {
            if (c0427v0.f6592b.size() > 0) {
                c0427v0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0427v0.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0427v0.f6594d) {
            c0427v0.f6593c = c0427v0.f6593c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0427v0.f6593c);
            c0427v0.f6596f = c0427v0.f6596f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0427v0.f6596f);
            c0427v0.f6594d = true;
        }
        this.f6601b = true;
    }

    public final Object clone() {
        C0430y c0430y = new C0430y();
        C0427v0 c0427v0 = this.f6600a;
        if (c0427v0.f6592b.size() > 0) {
            Map.Entry entryC = c0427v0.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = c0427v0.d().iterator();
        if (!it.hasNext()) {
            return c0430y;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0430y) {
            return this.f6600a.equals(((C0430y) obj).f6600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6600a.hashCode();
    }

    public C0430y(int i) {
        a();
        a();
    }
}
