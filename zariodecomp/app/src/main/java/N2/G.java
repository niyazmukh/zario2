package N2;

import com.google.protobuf.B0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\G.smali */
public final class G extends com.google.protobuf.E {
    private static final G DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        G g3 = new G();
        DEFAULT_INSTANCE = g3;
        com.google.protobuf.E.t(G.class, g3);
    }

    public static F B() {
        return (F) DEFAULT_INSTANCE.i();
    }

    public static void v(G g3, boolean z4) {
        g3.conditionTypeCase_ = 1;
        g3.conditionType_ = Boolean.valueOf(z4);
    }

    public static void w(G g3, B0 b02) {
        g3.getClass();
        g3.conditionType_ = b02;
        g3.conditionTypeCase_ = 2;
    }

    public static G y() {
        return DEFAULT_INSTANCE;
    }

    public final B0 A() {
        return this.conditionTypeCase_ == 2 ? (B0) this.conditionType_ : B0.x();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", B0.class});
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

    public final int x() {
        int i = this.conditionTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 1;
    }

    public final boolean z() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }
}
