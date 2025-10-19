package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\n.1.smali */
public final class C0149n extends com.google.protobuf.E {
    private static final C0149n DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0148m document_;
    private com.google.protobuf.J removedTargetIds_;
    private com.google.protobuf.J targetIds_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;

    static {
        C0149n c0149n = new C0149n();
        DEFAULT_INSTANCE = c0149n;
        com.google.protobuf.E.t(C0149n.class, c0149n);
    }

    public C0149n() {
        com.google.protobuf.H h = com.google.protobuf.H.f6420d;
        this.targetIds_ = h;
        this.removedTargetIds_ = h;
    }

    public static C0149n v() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new C0149n();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0149n.class) {
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

    public final C0148m w() {
        C0148m c0148m = this.document_;
        return c0148m == null ? C0148m.y() : c0148m;
    }

    public final com.google.protobuf.J x() {
        return this.removedTargetIds_;
    }

    public final com.google.protobuf.J y() {
        return this.targetIds_;
    }
}
