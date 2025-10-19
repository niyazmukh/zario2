package com.google.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\B0.smali */
public final class B0 extends E {
    private static final B0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        B0 b02 = new B0();
        DEFAULT_INSTANCE = b02;
        E.t(B0.class, b02);
    }

    public static A0 A() {
        return (A0) DEFAULT_INSTANCE.i();
    }

    public static void v(B0 b02, long j5) {
        b02.seconds_ = j5;
    }

    public static void w(B0 b02, int i) {
        b02.nanos_ = i;
    }

    public static B0 x() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new B0();
            case 4:
                return new A0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (B0.class) {
                        try {
                            d5 = PARSER;
                            if (d5 == null) {
                                d5 = new D(DEFAULT_INSTANCE);
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

    public final int y() {
        return this.nanos_;
    }

    public final long z() {
        return this.seconds_;
    }
}
