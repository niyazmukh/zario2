package N2;

import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\j0.smali */
public final class j0 extends com.google.protobuf.E {
    private static final j0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.google.protobuf.G expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        com.google.protobuf.E.t(j0.class, j0Var);
    }

    public static void A(j0 j0Var, com.google.protobuf.G g3) {
        j0Var.getClass();
        j0Var.expectedCount_ = g3;
        j0Var.bitField0_ |= 1;
    }

    public static e0 B() {
        return (e0) DEFAULT_INSTANCE.i();
    }

    public static void v(j0 j0Var, i0 i0Var) {
        j0Var.getClass();
        j0Var.targetType_ = i0Var;
        j0Var.targetTypeCase_ = 2;
    }

    public static void w(j0 j0Var, g0 g0Var) {
        j0Var.getClass();
        j0Var.targetType_ = g0Var;
        j0Var.targetTypeCase_ = 3;
    }

    public static void x(j0 j0Var, AbstractC0409l abstractC0409l) {
        j0Var.getClass();
        abstractC0409l.getClass();
        j0Var.resumeTypeCase_ = 4;
        j0Var.resumeType_ = abstractC0409l;
    }

    public static void y(j0 j0Var, B0 b02) {
        j0Var.getClass();
        j0Var.resumeType_ = b02;
        j0Var.resumeTypeCase_ = 11;
    }

    public static void z(j0 j0Var, int i) {
        j0Var.targetId_ = i;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", i0.class, g0.class, "targetId_", "once_", B0.class, "expectedCount_"});
            case 3:
                return new j0();
            case 4:
                return new e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (j0.class) {
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
