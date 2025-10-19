package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\i0.smali */
public final class i0 extends com.google.protobuf.E {
    private static final i0 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        com.google.protobuf.E.t(i0.class, i0Var);
    }

    public static h0 A() {
        return (h0) DEFAULT_INSTANCE.i();
    }

    public static void v(i0 i0Var, d0 d0Var) {
        i0Var.getClass();
        i0Var.queryType_ = d0Var;
        i0Var.queryTypeCase_ = 2;
    }

    public static void w(i0 i0Var, String str) {
        i0Var.getClass();
        str.getClass();
        i0Var.parent_ = str;
    }

    public static i0 x() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", d0.class});
            case 3:
                return new i0();
            case 4:
                return new h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (i0.class) {
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

    public final String y() {
        return this.parent_;
    }

    public final d0 z() {
        return this.queryTypeCase_ == 2 ? (d0) this.queryType_ : d0.B();
    }
}
