package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\e.1.smali */
public final class C0141e extends com.google.protobuf.E {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C0141e DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private int bitField0_;
    private C0140d bits_;
    private int hashCount_;

    static {
        C0141e c0141e = new C0141e();
        DEFAULT_INSTANCE = c0141e;
        com.google.protobuf.E.t(C0141e.class, c0141e);
    }

    public static C0141e w() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 3:
                return new C0141e();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0141e.class) {
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

    public final C0140d v() {
        C0140d c0140d = this.bits_;
        return c0140d == null ? C0140d.w() : c0140d;
    }

    public final int x() {
        return this.hashCount_;
    }

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }
}
