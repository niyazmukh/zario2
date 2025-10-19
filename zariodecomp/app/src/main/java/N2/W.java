package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\W.smali */
public final class W extends com.google.protobuf.E {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final W DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        W w4 = new W();
        DEFAULT_INSTANCE = w4;
        com.google.protobuf.E.t(W.class, w4);
    }

    public static U D() {
        return (U) DEFAULT_INSTANCE.i();
    }

    public static void v(W w4, Q q5) {
        w4.getClass();
        w4.filterType_ = q5;
        w4.filterTypeCase_ = 2;
    }

    public static void w(W w4, c0 c0Var) {
        w4.getClass();
        w4.filterType_ = c0Var;
        w4.filterTypeCase_ = 3;
    }

    public static void x(W w4, M m5) {
        w4.getClass();
        w4.filterType_ = m5;
        w4.filterTypeCase_ = 1;
    }

    public static W z() {
        return DEFAULT_INSTANCE;
    }

    public final Q A() {
        return this.filterTypeCase_ == 2 ? (Q) this.filterType_ : Q.y();
    }

    public final V B() {
        int i = this.filterTypeCase_;
        if (i == 0) {
            return V.f2585d;
        }
        if (i == 1) {
            return V.f2582a;
        }
        if (i == 2) {
            return V.f2583b;
        }
        if (i != 3) {
            return null;
        }
        return V.f2584c;
    }

    public final c0 C() {
        return this.filterTypeCase_ == 3 ? (c0) this.filterType_ : c0.x();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", M.class, Q.class, c0.class});
            case 3:
                return new W();
            case 4:
                return new U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (W.class) {
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

    public final M y() {
        return this.filterTypeCase_ == 1 ? (M) this.filterType_ : M.x();
    }
}
