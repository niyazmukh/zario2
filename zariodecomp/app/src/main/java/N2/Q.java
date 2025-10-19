package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\Q.smali */
public final class Q extends com.google.protobuf.E {
    private static final Q DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private T field_;
    private int op_;
    private n0 value_;

    static {
        Q q5 = new Q();
        DEFAULT_INSTANCE = q5;
        com.google.protobuf.E.t(Q.class, q5);
    }

    public static O C() {
        return (O) DEFAULT_INSTANCE.i();
    }

    public static void v(Q q5, T t4) {
        q5.getClass();
        q5.field_ = t4;
        q5.bitField0_ |= 1;
    }

    public static void w(Q q5, P p5) {
        q5.getClass();
        q5.op_ = p5.a();
    }

    public static void x(Q q5, n0 n0Var) {
        q5.getClass();
        n0Var.getClass();
        q5.value_ = n0Var;
        q5.bitField0_ |= 2;
    }

    public static Q y() {
        return DEFAULT_INSTANCE;
    }

    public final P A() {
        P p5;
        switch (this.op_) {
            case 0:
                p5 = P.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                p5 = P.LESS_THAN;
                break;
            case 2:
                p5 = P.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                p5 = P.GREATER_THAN;
                break;
            case 4:
                p5 = P.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                p5 = P.EQUAL;
                break;
            case 6:
                p5 = P.NOT_EQUAL;
                break;
            case 7:
                p5 = P.ARRAY_CONTAINS;
                break;
            case 8:
                p5 = P.IN;
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                p5 = P.ARRAY_CONTAINS_ANY;
                break;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                p5 = P.NOT_IN;
                break;
            default:
                p5 = null;
                break;
        }
        return p5 == null ? P.UNRECOGNIZED : p5;
    }

    public final n0 B() {
        n0 n0Var = this.value_;
        return n0Var == null ? n0.J() : n0Var;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 3:
                return new Q();
            case 4:
                return new O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (Q.class) {
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

    public final T z() {
        T t4 = this.field_;
        return t4 == null ? T.w() : t4;
    }
}
