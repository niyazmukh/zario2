package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\q.1.smali */
public final class C0214q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4535c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X f4536a = X.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4537b;

    static {
        new C0214q(0);
    }

    public C0214q() {
    }

    public static void b(C0209l c0209l, q0 q0Var, int i, Object obj) {
        if (q0Var == q0.f4539d) {
            c0209l.m1(i, 3);
            ((AbstractC0198a) obj).b(c0209l);
            c0209l.m1(i, 4);
            return;
        }
        c0209l.m1(i, q0Var.f4543b);
        switch (q0Var.ordinal()) {
            case 0:
                c0209l.h1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0209l.f1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0209l.q1(((Long) obj).longValue());
                break;
            case 3:
                c0209l.q1(((Long) obj).longValue());
                break;
            case 4:
                c0209l.j1(((Integer) obj).intValue());
                break;
            case 5:
                c0209l.h1(((Long) obj).longValue());
                break;
            case 6:
                c0209l.f1(((Integer) obj).intValue());
                break;
            case 7:
                c0209l.Z0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0204g)) {
                    c0209l.l1((String) obj);
                    break;
                } else {
                    c0209l.d1((C0204g) obj);
                    break;
                }
            case N2.n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                ((AbstractC0198a) obj).b(c0209l);
                break;
            case N2.n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                AbstractC0198a abstractC0198a = (AbstractC0198a) obj;
                c0209l.getClass();
                c0209l.o1(((AbstractC0218v) abstractC0198a).a(null));
                abstractC0198a.b(c0209l);
                break;
            case 11:
                if (!(obj instanceof C0204g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0209l.o1(length);
                    c0209l.a1(bArr, 0, length);
                    break;
                } else {
                    c0209l.d1((C0204g) obj);
                    break;
                }
            case N2.j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                c0209l.o1(((Integer) obj).intValue());
                break;
            case 13:
                c0209l.j1(((Integer) obj).intValue());
                break;
            case 14:
                c0209l.f1(((Integer) obj).intValue());
                break;
            case 15:
                c0209l.h1(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0209l.o1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case N2.n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c0209l.q1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f4537b) {
            return;
        }
        X x3 = this.f4536a;
        int size = x3.f4462a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = x3.c(i);
            if (entryC.getValue() instanceof AbstractC0218v) {
                AbstractC0218v abstractC0218v = (AbstractC0218v) entryC.getValue();
                abstractC0218v.getClass();
                S s4 = S.f4448c;
                s4.getClass();
                s4.a(abstractC0218v.getClass()).d(abstractC0218v);
                abstractC0218v.j();
            }
        }
        if (!x3.f4464c) {
            if (x3.f4462a.size() > 0) {
                x3.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x3.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x3.f4464c) {
            x3.f4463b = x3.f4463b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x3.f4463b);
            x3.f4466e = x3.f4466e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x3.f4466e);
            x3.f4464c = true;
        }
        this.f4537b = true;
    }

    public final Object clone() {
        C0214q c0214q = new C0214q();
        X x3 = this.f4536a;
        if (x3.f4462a.size() > 0) {
            Map.Entry entryC = x3.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = x3.d().iterator();
        if (!it.hasNext()) {
            return c0214q;
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
        if (obj instanceof C0214q) {
            return this.f4536a.equals(((C0214q) obj).f4536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4536a.hashCode();
    }

    public C0214q(int i) {
        a();
        a();
    }
}
