package N2;

import com.google.protobuf.B0;
import com.google.protobuf.C0391b0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;
import java.util.Collections;
import java.util.Map;

/* renamed from: N2.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\m.1.smali */
public final class C0148m extends com.google.protobuf.E {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C0148m DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private B0 createTime_;
    private C0391b0 fields_ = C0391b0.f6488b;
    private String name_ = "";
    private B0 updateTime_;

    static {
        C0148m c0148m = new C0148m();
        DEFAULT_INSTANCE = c0148m;
        com.google.protobuf.E.t(C0148m.class, c0148m);
    }

    public static C0146k C() {
        return (C0146k) DEFAULT_INSTANCE.i();
    }

    public static void v(C0148m c0148m, String str) {
        c0148m.getClass();
        str.getClass();
        c0148m.name_ = str;
    }

    public static C0391b0 w(C0148m c0148m) {
        C0391b0 c0391b0 = c0148m.fields_;
        if (!c0391b0.f6489a) {
            c0148m.fields_ = c0391b0.c();
        }
        return c0148m.fields_;
    }

    public static void x(C0148m c0148m, B0 b02) {
        c0148m.getClass();
        c0148m.updateTime_ = b02;
        c0148m.bitField0_ |= 2;
    }

    public static C0148m y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.name_;
    }

    public final B0 B() {
        B0 b02 = this.updateTime_;
        return b02 == null ? B0.x() : b02;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", AbstractC0147l.f2595a, "createTime_", "updateTime_"});
            case 3:
                return new C0148m();
            case 4:
                return new C0146k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0148m.class) {
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

    public final Map z() {
        return Collections.unmodifiableMap(this.fields_);
    }
}
