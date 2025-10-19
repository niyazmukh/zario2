package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\q.1.smali */
public final class C0151q extends com.google.protobuf.E {
    private static final C0151q DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER;
    private com.google.protobuf.K fieldPaths_ = C0416o0.f6559d;

    static {
        C0151q c0151q = new C0151q();
        DEFAULT_INSTANCE = c0151q;
        com.google.protobuf.E.t(C0151q.class, c0151q);
    }

    public static void v(C0151q c0151q, String str) {
        c0151q.getClass();
        str.getClass();
        com.google.protobuf.K k5 = c0151q.fieldPaths_;
        if (!((AbstractC0390b) k5).f6487a) {
            c0151q.fieldPaths_ = com.google.protobuf.E.p(k5);
        }
        c0151q.fieldPaths_.add(str);
    }

    public static C0151q w() {
        return DEFAULT_INSTANCE;
    }

    public static p z() {
        return DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new C0151q();
            case 4:
                return new p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0151q.class) {
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

    public final String x(int i) {
        return (String) this.fieldPaths_.get(i);
    }

    public final int y() {
        return this.fieldPaths_.size();
    }
}
