package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\g.1.smali */
public final class C0143g extends com.google.protobuf.E {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0143g DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private com.google.protobuf.K writes_ = C0416o0.f6559d;
    private AbstractC0409l transaction_ = AbstractC0409l.f6528b;

    static {
        C0143g c0143g = new C0143g();
        DEFAULT_INSTANCE = c0143g;
        com.google.protobuf.E.t(C0143g.class, c0143g);
    }

    public static void v(C0143g c0143g, String str) {
        c0143g.getClass();
        str.getClass();
        c0143g.database_ = str;
    }

    public static void w(C0143g c0143g, q0 q0Var) {
        c0143g.getClass();
        com.google.protobuf.K k5 = c0143g.writes_;
        if (!((AbstractC0390b) k5).f6487a) {
            c0143g.writes_ = com.google.protobuf.E.p(k5);
        }
        c0143g.writes_.add(q0Var);
    }

    public static C0143g x() {
        return DEFAULT_INSTANCE;
    }

    public static C0142f y() {
        return (C0142f) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", q0.class, "transaction_"});
            case 3:
                return new C0143g();
            case 4:
                return new C0142f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0143g.class) {
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
}
