package N2;

import com.google.protobuf.AbstractC0388a;
import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\M.smali */
public final class M extends com.google.protobuf.E {
    private static final M DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER;
    private com.google.protobuf.K filters_ = C0416o0.f6559d;
    private int op_;

    static {
        M m5 = new M();
        DEFAULT_INSTANCE = m5;
        com.google.protobuf.E.t(M.class, m5);
    }

    public static K A() {
        return (K) DEFAULT_INSTANCE.i();
    }

    public static void v(M m5, L l4) {
        m5.getClass();
        m5.op_ = l4.a();
    }

    public static void w(M m5, ArrayList arrayList) {
        com.google.protobuf.K k5 = m5.filters_;
        if (!((AbstractC0390b) k5).f6487a) {
            m5.filters_ = com.google.protobuf.E.p(k5);
        }
        AbstractC0388a.b(arrayList, m5.filters_);
    }

    public static M x() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", W.class});
            case 3:
                return new M();
            case 4:
                return new K(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (M.class) {
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

    public final com.google.protobuf.K y() {
        return this.filters_;
    }

    public final L z() {
        int i = this.op_;
        L l4 = i != 0 ? i != 1 ? i != 2 ? null : L.OR : L.AND : L.OPERATOR_UNSPECIFIED;
        return l4 == null ? L.UNRECOGNIZED : l4;
    }
}
