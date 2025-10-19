package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\u.1.smali */
public final class C0154u extends com.google.protobuf.E {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final C0154u DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        C0154u c0154u = new C0154u();
        DEFAULT_INSTANCE = c0154u;
        com.google.protobuf.E.t(C0154u.class, c0154u);
    }

    public static C0152s G() {
        return (C0152s) DEFAULT_INSTANCE.i();
    }

    public static void v(C0154u c0154u, b bVar) {
        c0154u.getClass();
        c0154u.transformType_ = bVar;
        c0154u.transformTypeCase_ = 6;
    }

    public static void w(C0154u c0154u, String str) {
        c0154u.getClass();
        str.getClass();
        c0154u.fieldPath_ = str;
    }

    public static void x(C0154u c0154u, b bVar) {
        c0154u.getClass();
        c0154u.transformType_ = bVar;
        c0154u.transformTypeCase_ = 7;
    }

    public static void y(C0154u c0154u) {
        EnumC0153t enumC0153t = EnumC0153t.REQUEST_TIME;
        c0154u.getClass();
        c0154u.transformType_ = Integer.valueOf(enumC0153t.a());
        c0154u.transformTypeCase_ = 2;
    }

    public static void z(C0154u c0154u, n0 n0Var) {
        c0154u.getClass();
        n0Var.getClass();
        c0154u.transformType_ = n0Var;
        c0154u.transformTypeCase_ = 3;
    }

    public final b A() {
        return this.transformTypeCase_ == 6 ? (b) this.transformType_ : b.y();
    }

    public final String B() {
        return this.fieldPath_;
    }

    public final n0 C() {
        return this.transformTypeCase_ == 3 ? (n0) this.transformType_ : n0.J();
    }

    public final b D() {
        return this.transformTypeCase_ == 7 ? (b) this.transformType_ : b.y();
    }

    public final EnumC0153t E() {
        int i = this.transformTypeCase_;
        EnumC0153t enumC0153t = EnumC0153t.SERVER_VALUE_UNSPECIFIED;
        if (i != 2) {
            return enumC0153t;
        }
        int iIntValue = ((Integer) this.transformType_).intValue();
        if (iIntValue != 0) {
            enumC0153t = iIntValue != 1 ? null : EnumC0153t.REQUEST_TIME;
        }
        return enumC0153t == null ? EnumC0153t.UNRECOGNIZED : enumC0153t;
    }

    public final int F() {
        int i = this.transformTypeCase_;
        if (i == 0) {
            return 7;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", n0.class, n0.class, n0.class, b.class, b.class});
            case 3:
                return new C0154u();
            case 4:
                return new C0152s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0154u.class) {
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
}
