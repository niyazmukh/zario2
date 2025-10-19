package P2;

import com.google.protobuf.C0394d;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;
import com.google.protobuf.K;
import t.h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P2\a.smali */
public final class a extends E {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private int code_;
    private String message_ = "";
    private K details_ = C0416o0.f6559d;

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        E.t(a.class, aVar);
    }

    public static a w() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C0394d.class});
            case 3:
                return new a();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (a.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String x() {
        return this.message_;
    }
}
