package N2;

import com.google.protobuf.C0391b0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\A.smali */
public final class A extends com.google.protobuf.E {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final A DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C0391b0 labels_ = C0391b0.f6488b;
    private String database_ = "";

    static {
        A a5 = new A();
        DEFAULT_INSTANCE = a5;
        com.google.protobuf.E.t(A.class, a5);
    }

    public static C0157y A() {
        return (C0157y) DEFAULT_INSTANCE.i();
    }

    public static C0391b0 v(A a5) {
        C0391b0 c0391b0 = a5.labels_;
        if (!c0391b0.f6489a) {
            a5.labels_ = c0391b0.c();
        }
        return a5.labels_;
    }

    public static void w(A a5, String str) {
        a5.getClass();
        str.getClass();
        a5.database_ = str;
    }

    public static void x(A a5, j0 j0Var) {
        a5.getClass();
        a5.targetChange_ = j0Var;
        a5.targetChangeCase_ = 2;
    }

    public static void y(A a5, int i) {
        a5.targetChangeCase_ = 3;
        a5.targetChange_ = Integer.valueOf(i);
    }

    public static A z() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", j0.class, "labels_", AbstractC0158z.f2611a});
            case 3:
                return new A();
            case 4:
                return new C0157y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (A.class) {
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
