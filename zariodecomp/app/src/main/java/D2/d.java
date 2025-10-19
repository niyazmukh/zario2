package D2;

import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D2\d.smali */
public final class d extends E {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private B0 readTime_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        E.t(d.class, dVar);
    }

    public static c A() {
        return (c) DEFAULT_INSTANCE.i();
    }

    public static void v(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.name_ = str;
    }

    public static void w(d dVar, B0 b02) {
        dVar.getClass();
        dVar.readTime_ = b02;
        dVar.bitField0_ |= 1;
    }

    public static d x() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 3:
                return new d();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (d.class) {
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

    public final String y() {
        return this.name_;
    }

    public final B0 z() {
        B0 b02 = this.readTime_;
        return b02 == null ? B0.x() : b02;
    }
}
