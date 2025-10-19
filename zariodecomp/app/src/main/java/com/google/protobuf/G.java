package com.google.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\G.smali */
public final class G extends E {
    private static final G DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        G g3 = new G();
        DEFAULT_INSTANCE = g3;
        E.t(G.class, g3);
    }

    public static void v(G g3, int i) {
        g3.value_ = i;
    }

    public static G w() {
        return DEFAULT_INSTANCE;
    }

    public static F y() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new G();
            case 4:
                return new F(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (G.class) {
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

    public final int x() {
        return this.value_;
    }
}
