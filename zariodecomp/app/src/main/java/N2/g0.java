package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\g0.smali */
public final class g0 extends com.google.protobuf.E {
    private static final g0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private com.google.protobuf.K documents_ = C0416o0.f6559d;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.protobuf.E.t(g0.class, g0Var);
    }

    public static void v(g0 g0Var, String str) {
        g0Var.getClass();
        str.getClass();
        com.google.protobuf.K k5 = g0Var.documents_;
        if (!((AbstractC0390b) k5).f6487a) {
            g0Var.documents_ = com.google.protobuf.E.p(k5);
        }
        g0Var.documents_.add(str);
    }

    public static g0 w() {
        return DEFAULT_INSTANCE;
    }

    public static f0 z() {
        return (f0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 3:
                return new g0();
            case 4:
                return new f0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (g0.class) {
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

    public final String x() {
        return (String) this.documents_.get(0);
    }

    public final int y() {
        return this.documents_.size();
    }
}
