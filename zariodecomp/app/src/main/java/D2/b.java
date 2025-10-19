package D2;

import N2.C0148m;
import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D2\b.smali */
public final class b extends E {
    private static final b DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        E.t(b.class, bVar);
    }

    public static a E() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static b F(byte[] bArr) {
        return (b) E.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(b bVar, boolean z4) {
        bVar.hasCommittedMutations_ = z4;
    }

    public static void w(b bVar, d dVar) {
        bVar.getClass();
        bVar.documentType_ = dVar;
        bVar.documentTypeCase_ = 1;
    }

    public static void x(b bVar, C0148m c0148m) {
        bVar.getClass();
        bVar.documentType_ = c0148m;
        bVar.documentTypeCase_ = 2;
    }

    public static void y(b bVar, i iVar) {
        bVar.getClass();
        bVar.documentType_ = iVar;
        bVar.documentTypeCase_ = 3;
    }

    public final int A() {
        int i = this.documentTypeCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public final boolean B() {
        return this.hasCommittedMutations_;
    }

    public final d C() {
        return this.documentTypeCase_ == 1 ? (d) this.documentType_ : d.x();
    }

    public final i D() {
        return this.documentTypeCase_ == 3 ? (i) this.documentType_ : i.x();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", d.class, C0148m.class, i.class, "hasCommittedMutations_"});
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

    public final C0148m z() {
        return this.documentTypeCase_ == 2 ? (C0148m) this.documentType_ : C0148m.y();
    }
}
