package N2;

import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\l0.smali */
public final class l0 extends com.google.protobuf.E {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final l0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private P2.a cause_;
    private B0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private com.google.protobuf.J targetIds_ = com.google.protobuf.H.f6420d;
    private AbstractC0409l resumeToken_ = AbstractC0409l.f6528b;

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        com.google.protobuf.E.t(l0.class, l0Var);
    }

    public static l0 w() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return ((com.google.protobuf.H) this.targetIds_).size();
    }

    public final com.google.protobuf.J B() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new l0();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (l0.class) {
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

    public final P2.a v() {
        P2.a aVar = this.cause_;
        return aVar == null ? P2.a.w() : aVar;
    }

    public final B0 x() {
        B0 b02 = this.readTime_;
        return b02 == null ? B0.x() : b02;
    }

    public final AbstractC0409l y() {
        return this.resumeToken_;
    }

    public final k0 z() {
        int i = this.targetChangeType_;
        k0 k0Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : k0.RESET : k0.CURRENT : k0.REMOVE : k0.ADD : k0.NO_CHANGE;
        return k0Var == null ? k0.UNRECOGNIZED : k0Var;
    }
}
