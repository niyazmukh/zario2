package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\w.1.smali */
public final class C0155w extends com.google.protobuf.E {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final C0155w DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private C0141e unchangedNames_;

    static {
        C0155w c0155w = new C0155w();
        DEFAULT_INSTANCE = c0155w;
        com.google.protobuf.E.t(C0155w.class, c0155w);
    }

    public static C0155w w() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 3:
                return new C0155w();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0155w.class) {
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

    public final int v() {
        return this.count_;
    }

    public final int x() {
        return this.targetId_;
    }

    public final C0141e y() {
        C0141e c0141e = this.unchangedNames_;
        return c0141e == null ? C0141e.w() : c0141e;
    }
}
