package N2;

import com.google.protobuf.C0391b0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;
import java.util.Collections;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\E.smali */
public final class E extends com.google.protobuf.E {
    private static final E DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER;
    private C0391b0 fields_ = C0391b0.f6488b;

    static {
        E e5 = new E();
        DEFAULT_INSTANCE = e5;
        com.google.protobuf.E.t(E.class, e5);
    }

    public static C B() {
        return (C) DEFAULT_INSTANCE.i();
    }

    public static C0391b0 v(E e5) {
        C0391b0 c0391b0 = e5.fields_;
        if (!c0391b0.f6489a) {
            e5.fields_ = c0391b0.c();
        }
        return e5.fields_;
    }

    public static E w() {
        return DEFAULT_INSTANCE;
    }

    public final n0 A(String str) {
        str.getClass();
        C0391b0 c0391b0 = this.fields_;
        if (c0391b0.containsKey(str)) {
            return (n0) c0391b0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", D.f2555a});
            case 3:
                return new E();
            case 4:
                return new C(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (E.class) {
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
        return this.fields_.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final n0 z(String str) {
        str.getClass();
        C0391b0 c0391b0 = this.fields_;
        if (c0391b0.containsKey(str)) {
            return (n0) c0391b0.get(str);
        }
        return null;
    }
}
