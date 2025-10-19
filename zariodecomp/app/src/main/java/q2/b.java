package Q2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;
import t.h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q2\b.smali */
public final class b extends E {
    private static final b DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        E.t(b.class, bVar);
    }

    public static a A() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static void v(b bVar, double d5) {
        bVar.latitude_ = d5;
    }

    public static void w(b bVar, double d5) {
        bVar.longitude_ = d5;
    }

    public static b x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (b.class) {
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

    public final double y() {
        return this.latitude_;
    }

    public final double z() {
        return this.longitude_;
    }
}
