package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\c0.smali */
public final class c0 extends com.google.protobuf.E {
    private static final c0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.protobuf.E.t(c0.class, c0Var);
    }

    public static a0 A() {
        return (a0) DEFAULT_INSTANCE.i();
    }

    public static void v(c0 c0Var, b0 b0Var) {
        c0Var.getClass();
        c0Var.op_ = b0Var.a();
    }

    public static void w(c0 c0Var, T t4) {
        c0Var.getClass();
        c0Var.operandType_ = t4;
        c0Var.operandTypeCase_ = 2;
    }

    public static c0 x() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", T.class});
            case 3:
                return new c0();
            case 4:
                return new a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (c0.class) {
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

    public final T y() {
        return this.operandTypeCase_ == 2 ? (T) this.operandType_ : T.w();
    }

    public final b0 z() {
        int i = this.op_;
        b0 b0Var = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : b0.f : b0.e : b0.d : b0.c : b0.b;
        return b0Var == null ? b0.k : b0Var;
    }
}
