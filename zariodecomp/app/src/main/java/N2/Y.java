package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\Y.smali */
public final class Y extends com.google.protobuf.E {
    private static final Y DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER;
    private int bitField0_;
    private int direction_;
    private T field_;

    static {
        Y y4 = new Y();
        DEFAULT_INSTANCE = y4;
        com.google.protobuf.E.t(Y.class, y4);
    }

    public static void v(Y y4, T t4) {
        y4.getClass();
        y4.field_ = t4;
        y4.bitField0_ |= 1;
    }

    public static void w(Y y4, N n5) {
        y4.getClass();
        y4.direction_ = n5.a();
    }

    public static X z() {
        return (X) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 3:
                return new Y();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (Y.class) {
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

    public final N x() {
        int i = this.direction_;
        N n5 = i != 0 ? i != 1 ? i != 2 ? null : N.DESCENDING : N.ASCENDING : N.DIRECTION_UNSPECIFIED;
        return n5 == null ? N.UNRECOGNIZED : n5;
    }

    public final T y() {
        T t4 = this.field_;
        return t4 == null ? T.w() : t4;
    }
}
