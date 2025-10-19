package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0391b0;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\t0.smali */
public final class t0 extends com.google.protobuf.E {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final t0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C0391b0 labels_ = C0391b0.f6488b;
    private String database_ = "";
    private String streamId_ = "";
    private com.google.protobuf.K writes_ = C0416o0.f6559d;
    private AbstractC0409l streamToken_ = AbstractC0409l.f6528b;

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        com.google.protobuf.E.t(t0.class, t0Var);
    }

    public static void v(t0 t0Var, String str) {
        t0Var.getClass();
        str.getClass();
        t0Var.database_ = str;
    }

    public static void w(t0 t0Var, AbstractC0409l abstractC0409l) {
        t0Var.getClass();
        abstractC0409l.getClass();
        t0Var.streamToken_ = abstractC0409l;
    }

    public static void x(t0 t0Var, q0 q0Var) {
        t0Var.getClass();
        com.google.protobuf.K k5 = t0Var.writes_;
        if (!((AbstractC0390b) k5).f6487a) {
            t0Var.writes_ = com.google.protobuf.E.p(k5);
        }
        t0Var.writes_.add(q0Var);
    }

    public static t0 y() {
        return DEFAULT_INSTANCE;
    }

    public static r0 z() {
        return (r0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", q0.class, "streamToken_", "labels_", s0.f2602a});
            case 3:
                return new t0();
            case 4:
                return new r0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (t0.class) {
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
