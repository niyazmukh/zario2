package N2;

import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* renamed from: N2.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\d.1.smali */
public final class C0140d extends com.google.protobuf.E {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0140d DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER;
    private AbstractC0409l bitmap_ = AbstractC0409l.f6528b;
    private int padding_;

    static {
        C0140d c0140d = new C0140d();
        DEFAULT_INSTANCE = c0140d;
        com.google.protobuf.E.t(C0140d.class, c0140d);
    }

    public static C0140d w() {
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
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new C0140d();
            case 4:
                return new M2.a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (C0140d.class) {
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

    public final AbstractC0409l v() {
        return this.bitmap_;
    }

    public final int x() {
        return this.padding_;
    }
}
