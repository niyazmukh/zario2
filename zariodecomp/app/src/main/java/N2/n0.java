package N2;

import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.EnumC0408k0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\n0.smali */
public final class n0 extends com.google.protobuf.E {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final n0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        com.google.protobuf.E.t(n0.class, n0Var);
    }

    public static void A(b bVar, n0 n0Var) {
        n0Var.getClass();
        bVar.getClass();
        n0Var.valueType_ = bVar;
        n0Var.valueTypeCase_ = 9;
    }

    public static void B(n0 n0Var, E e5) {
        n0Var.getClass();
        e5.getClass();
        n0Var.valueType_ = e5;
        n0Var.valueTypeCase_ = 6;
    }

    public static void C(n0 n0Var) {
        EnumC0408k0 enumC0408k0 = EnumC0408k0.NULL_VALUE;
        n0Var.getClass();
        n0Var.valueType_ = Integer.valueOf(enumC0408k0.a());
        n0Var.valueTypeCase_ = 11;
    }

    public static void D(n0 n0Var, boolean z4) {
        n0Var.valueTypeCase_ = 1;
        n0Var.valueType_ = Boolean.valueOf(z4);
    }

    public static void E(n0 n0Var, long j5) {
        n0Var.valueTypeCase_ = 2;
        n0Var.valueType_ = Long.valueOf(j5);
    }

    public static void F(n0 n0Var, double d5) {
        n0Var.valueTypeCase_ = 3;
        n0Var.valueType_ = Double.valueOf(d5);
    }

    public static n0 J() {
        return DEFAULT_INSTANCE;
    }

    public static m0 T() {
        return (m0) DEFAULT_INSTANCE.i();
    }

    public static void v(n0 n0Var, B0 b02) {
        n0Var.getClass();
        n0Var.valueType_ = b02;
        n0Var.valueTypeCase_ = 10;
    }

    public static void w(n0 n0Var, String str) {
        n0Var.getClass();
        str.getClass();
        n0Var.valueTypeCase_ = 17;
        n0Var.valueType_ = str;
    }

    public static void x(n0 n0Var, AbstractC0409l abstractC0409l) {
        n0Var.getClass();
        abstractC0409l.getClass();
        n0Var.valueTypeCase_ = 18;
        n0Var.valueType_ = abstractC0409l;
    }

    public static void y(n0 n0Var, String str) {
        n0Var.getClass();
        str.getClass();
        n0Var.valueTypeCase_ = 5;
        n0Var.valueType_ = str;
    }

    public static void z(n0 n0Var, Q2.b bVar) {
        n0Var.getClass();
        n0Var.valueType_ = bVar;
        n0Var.valueTypeCase_ = 8;
    }

    public final b G() {
        return this.valueTypeCase_ == 9 ? (b) this.valueType_ : b.y();
    }

    public final boolean H() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final AbstractC0409l I() {
        return this.valueTypeCase_ == 18 ? (AbstractC0409l) this.valueType_ : AbstractC0409l.f6528b;
    }

    public final double K() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final Q2.b L() {
        return this.valueTypeCase_ == 8 ? (Q2.b) this.valueType_ : Q2.b.x();
    }

    public final long M() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final E N() {
        return this.valueTypeCase_ == 6 ? (E) this.valueType_ : E.w();
    }

    public final String O() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String P() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final B0 Q() {
        return this.valueTypeCase_ == 10 ? (B0) this.valueType_ : B0.x();
    }

    public final int R() {
        int i = this.valueTypeCase_;
        if (i == 0) {
            return 12;
        }
        if (i == 1) {
            return 2;
        }
        int i5 = 3;
        if (i != 2) {
            if (i == 3) {
                return 4;
            }
            if (i == 5) {
                return 8;
            }
            i5 = 6;
            if (i == 6) {
                return 11;
            }
            if (i != 17) {
                if (i == 18) {
                    return 7;
                }
                switch (i) {
                    case 8:
                        return 9;
                    case ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        return 10;
                    case TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        return 5;
                    case 11:
                        return 1;
                    default:
                        return 0;
                }
            }
        }
        return i5;
    }

    public final boolean S() {
        return this.valueTypeCase_ == 11;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", E.class, Q2.b.class, b.class, B0.class});
            case 3:
                return new n0();
            case 4:
                return new m0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (n0.class) {
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
