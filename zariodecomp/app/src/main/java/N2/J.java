package N2;

import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\J.smali */
public final class J extends com.google.protobuf.E {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final J DEFAULT_INSTANCE;
    private static volatile InterfaceC0410l0 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        J j5 = new J();
        DEFAULT_INSTANCE = j5;
        com.google.protobuf.E.t(J.class, j5);
    }

    public static void v(J j5, String str) {
        j5.getClass();
        str.getClass();
        j5.collectionId_ = str;
    }

    public static void w(J j5) {
        j5.allDescendants_ = true;
    }

    public static I z() {
        return (I) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 3:
                return new J();
            case 4:
                return new I(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (J.class) {
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

    public final boolean x() {
        return this.allDescendants_;
    }

    public final String y() {
        return this.collectionId_;
    }
}
