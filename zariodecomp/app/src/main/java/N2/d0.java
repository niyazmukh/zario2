package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\d0.smali */
public final class d0 extends com.google.protobuf.E {
    private static final d0 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private j endAt_;
    private com.google.protobuf.K from_;
    private com.google.protobuf.G limit_;
    private int offset_;
    private com.google.protobuf.K orderBy_;
    private Z select_;
    private j startAt_;
    private W where_;

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.protobuf.E.t(d0.class, d0Var);
    }

    public d0() {
        C0416o0 c0416o0 = C0416o0.f6559d;
        this.from_ = c0416o0;
        this.orderBy_ = c0416o0;
    }

    public static void A(d0 d0Var, com.google.protobuf.G g3) {
        d0Var.getClass();
        d0Var.limit_ = g3;
        d0Var.bitField0_ |= 16;
    }

    public static d0 B() {
        return DEFAULT_INSTANCE;
    }

    public static H O() {
        return (H) DEFAULT_INSTANCE.i();
    }

    public static void v(d0 d0Var, J j5) {
        d0Var.getClass();
        com.google.protobuf.K k5 = d0Var.from_;
        if (!((AbstractC0390b) k5).f6487a) {
            d0Var.from_ = com.google.protobuf.E.p(k5);
        }
        d0Var.from_.add(j5);
    }

    public static void w(d0 d0Var, W w4) {
        d0Var.getClass();
        w4.getClass();
        d0Var.where_ = w4;
        d0Var.bitField0_ |= 2;
    }

    public static void x(d0 d0Var, Y y4) {
        d0Var.getClass();
        com.google.protobuf.K k5 = d0Var.orderBy_;
        if (!((AbstractC0390b) k5).f6487a) {
            d0Var.orderBy_ = com.google.protobuf.E.p(k5);
        }
        d0Var.orderBy_.add(y4);
    }

    public static void y(d0 d0Var, j jVar) {
        d0Var.getClass();
        d0Var.startAt_ = jVar;
        d0Var.bitField0_ |= 4;
    }

    public static void z(d0 d0Var, j jVar) {
        d0Var.getClass();
        d0Var.endAt_ = jVar;
        d0Var.bitField0_ |= 8;
    }

    public final j C() {
        j jVar = this.endAt_;
        return jVar == null ? j.y() : jVar;
    }

    public final J D() {
        return (J) this.from_.get(0);
    }

    public final int E() {
        return this.from_.size();
    }

    public final com.google.protobuf.G F() {
        com.google.protobuf.G g3 = this.limit_;
        return g3 == null ? com.google.protobuf.G.w() : g3;
    }

    public final Y G(int i) {
        return (Y) this.orderBy_.get(i);
    }

    public final int H() {
        return this.orderBy_.size();
    }

    public final j I() {
        j jVar = this.startAt_;
        return jVar == null ? j.y() : jVar;
    }

    public final W J() {
        W w4 = this.where_;
        return w4 == null ? W.z() : w4;
    }

    public final boolean K() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean N() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", J.class, "where_", "orderBy_", Y.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new d0();
            case 4:
                return new H(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (d0.class) {
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
