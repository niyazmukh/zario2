package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\T.smali */
public final class T extends com.google.protobuf.E {
    private static final T DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private String fieldPath_ = "";

    static {
        T t4 = new T();
        DEFAULT_INSTANCE = t4;
        com.google.protobuf.E.t(T.class, t4);
    }

    public static void v(T t4, String str) {
        t4.getClass();
        str.getClass();
        t4.fieldPath_ = str;
    }

    public static T w() {
        return DEFAULT_INSTANCE;
    }

    public static S y() {
        return (S) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 3:
                return new T();
            case 4:
                return new S(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (T.class) {
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
        return this.fieldPath_;
    }
}
