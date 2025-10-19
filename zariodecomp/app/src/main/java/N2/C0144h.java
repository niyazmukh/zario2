package N2;

import com.google.protobuf.B0;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\h.1.smali */
public final class C0144h extends com.google.protobuf.E {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0144h DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private B0 commitTime_;
    private com.google.protobuf.K writeResults_ = C0416o0.f6559d;

    static {
        C0144h c0144h = new C0144h();
        DEFAULT_INSTANCE = c0144h;
        com.google.protobuf.E.t(C0144h.class, c0144h);
    }

    public static C0144h w() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", v0.class, "commitTime_"});
            case 3:
                return new C0144h();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0144h.class) {
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

    public final B0 v() {
        B0 b02 = this.commitTime_;
        return b02 == null ? B0.x() : b02;
    }

    public final v0 x(int i) {
        return (v0) this.writeResults_.get(i);
    }

    public final int y() {
        return this.writeResults_.size();
    }
}
