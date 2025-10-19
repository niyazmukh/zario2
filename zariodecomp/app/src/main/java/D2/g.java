package D2;

import N2.g0;
import N2.i0;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D2\g.smali */
public final class g extends E {
    private static final g DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private B0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private B0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC0409l resumeToken_ = AbstractC0409l.f6528b;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        E.t(g.class, gVar);
    }

    public static void A(g gVar, B0 b02) {
        gVar.getClass();
        gVar.snapshotVersion_ = b02;
        gVar.bitField0_ |= 1;
    }

    public static void B(g gVar, AbstractC0409l abstractC0409l) {
        gVar.getClass();
        abstractC0409l.getClass();
        gVar.resumeToken_ = abstractC0409l;
    }

    public static void C(g gVar, long j5) {
        gVar.lastListenSequenceNumber_ = j5;
    }

    public static e L() {
        return (e) DEFAULT_INSTANCE.i();
    }

    public static g M(byte[] bArr) {
        return (g) E.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(g gVar, i0 i0Var) {
        gVar.getClass();
        gVar.targetType_ = i0Var;
        gVar.targetTypeCase_ = 5;
    }

    public static void w(g gVar, g0 g0Var) {
        gVar.getClass();
        gVar.targetType_ = g0Var;
        gVar.targetTypeCase_ = 6;
    }

    public static void x(g gVar, B0 b02) {
        gVar.getClass();
        gVar.lastLimboFreeSnapshotVersion_ = b02;
        gVar.bitField0_ |= 2;
    }

    public static void y(g gVar) {
        gVar.lastLimboFreeSnapshotVersion_ = null;
        gVar.bitField0_ &= -3;
    }

    public static void z(g gVar, int i) {
        gVar.targetId_ = i;
    }

    public final g0 D() {
        return this.targetTypeCase_ == 6 ? (g0) this.targetType_ : g0.w();
    }

    public final B0 E() {
        B0 b02 = this.lastLimboFreeSnapshotVersion_;
        return b02 == null ? B0.x() : b02;
    }

    public final long F() {
        return this.lastListenSequenceNumber_;
    }

    public final i0 G() {
        return this.targetTypeCase_ == 5 ? (i0) this.targetType_ : i0.x();
    }

    public final AbstractC0409l H() {
        return this.resumeToken_;
    }

    public final B0 I() {
        B0 b02 = this.snapshotVersion_;
        return b02 == null ? B0.x() : b02;
    }

    public final int J() {
        return this.targetId_;
    }

    public final f K() {
        int i = this.targetTypeCase_;
        if (i == 0) {
            return f.f1320c;
        }
        if (i == 5) {
            return f.f1318a;
        }
        if (i != 6) {
            return null;
        }
        return f.f1319b;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", i0.class, g0.class, "lastLimboFreeSnapshotVersion_"});
            case 3:
                return new g();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (g.class) {
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
}
