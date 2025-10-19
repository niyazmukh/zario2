package N2;

import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\b.1.smali */
public final class b extends com.google.protobuf.E implements InterfaceC0139c {
    private static final b DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.K values_ = C0416o0.f6559d;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.protobuf.E.t(b.class, bVar);
    }

    public static C0138a B() {
        return (C0138a) DEFAULT_INSTANCE.i();
    }

    public static void v(b bVar, n0 n0Var) {
        bVar.getClass();
        n0Var.getClass();
        com.google.protobuf.K k5 = bVar.values_;
        if (!((AbstractC0390b) k5).f6487a) {
            bVar.values_ = com.google.protobuf.E.p(k5);
        }
        bVar.values_.add(n0Var);
    }

    public static void w(b bVar, List list) {
        com.google.protobuf.K k5 = bVar.values_;
        if (!((AbstractC0390b) k5).f6487a) {
            bVar.values_ = com.google.protobuf.E.p(k5);
        }
        AbstractC0388a.b(list, bVar.values_);
    }

    public static void x(b bVar, int i) {
        com.google.protobuf.K k5 = bVar.values_;
        if (!((AbstractC0390b) k5).f6487a) {
            bVar.values_ = com.google.protobuf.E.p(k5);
        }
        bVar.values_.remove(i);
    }

    public static b y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.values_.size();
    }

    @Override // N2.InterfaceC0139c
    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", n0.class});
            case 3:
                return new b();
            case 4:
                return new C0138a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (b.class) {
                        try {
                            d5 = PARSER;
                            if (d5 == null) {
                                d5 = new com.google.protobuf.D(DEFAULT_INSTANCE);
                                PARSER = d5;
                            }
                        } finally {
                        }
                    }
                }
                return d5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final n0 z(int i) {
        return (n0) this.values_.get(i);
    }
}
