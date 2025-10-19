package M2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;
import t.h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M2\c.smali */
public final class c extends E {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        E.t(c.class, cVar);
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (c.class) {
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

    public final String v() {
        return this.fieldPath_;
    }

    public final b w() {
        int i = this.valueModeCase_;
        b bVar = b.ORDER_UNSPECIFIED;
        if (i != 2) {
            return bVar;
        }
        int iIntValue = ((Integer) this.valueMode_).intValue();
        if (iIntValue != 0) {
            bVar = iIntValue != 1 ? iIntValue != 2 ? null : b.DESCENDING : b.ASCENDING;
        }
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public final int x() {
        int i = this.valueModeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }
}
