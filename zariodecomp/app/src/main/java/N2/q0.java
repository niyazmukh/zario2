package N2;

import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.InterfaceC0410l0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\q0.smali */
public final class q0 extends com.google.protobuf.E {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final q0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private G currentDocument_;
    private Object operation_;
    private C0151q updateMask_;
    private int operationCase_ = 0;
    private com.google.protobuf.K updateTransforms_ = C0416o0.f6559d;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.protobuf.E.t(q0.class, q0Var);
    }

    public static void A(q0 q0Var, String str) {
        q0Var.getClass();
        str.getClass();
        q0Var.operationCase_ = 5;
        q0Var.operation_ = str;
    }

    public static o0 N() {
        return (o0) DEFAULT_INSTANCE.i();
    }

    public static o0 O(q0 q0Var) {
        com.google.protobuf.C cI = DEFAULT_INSTANCE.i();
        if (!cI.f6409a.equals(q0Var)) {
            cI.d();
            com.google.protobuf.C.e(cI.f6410b, q0Var);
        }
        return (o0) cI;
    }

    public static q0 P(byte[] bArr) {
        return (q0) com.google.protobuf.E.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(q0 q0Var, C0151q c0151q) {
        q0Var.getClass();
        q0Var.updateMask_ = c0151q;
        q0Var.bitField0_ |= 1;
    }

    public static void w(q0 q0Var, C0154u c0154u) {
        q0Var.getClass();
        c0154u.getClass();
        com.google.protobuf.K k5 = q0Var.updateTransforms_;
        if (!((AbstractC0390b) k5).f6487a) {
            q0Var.updateTransforms_ = com.google.protobuf.E.p(k5);
        }
        q0Var.updateTransforms_.add(c0154u);
    }

    public static void x(q0 q0Var, C0148m c0148m) {
        q0Var.getClass();
        q0Var.operation_ = c0148m;
        q0Var.operationCase_ = 1;
    }

    public static void y(q0 q0Var, G g3) {
        q0Var.getClass();
        q0Var.currentDocument_ = g3;
        q0Var.bitField0_ |= 2;
    }

    public static void z(q0 q0Var, String str) {
        q0Var.getClass();
        str.getClass();
        q0Var.operationCase_ = 2;
        q0Var.operation_ = str;
    }

    public final G B() {
        G g3 = this.currentDocument_;
        return g3 == null ? G.y() : g3;
    }

    public final String C() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public final p0 D() {
        int i = this.operationCase_;
        if (i == 0) {
            return p0.f2600e;
        }
        if (i == 1) {
            return p0.f2596a;
        }
        if (i == 2) {
            return p0.f2597b;
        }
        if (i == 5) {
            return p0.f2598c;
        }
        if (i != 6) {
            return null;
        }
        return p0.f2599d;
    }

    public final v E() {
        return this.operationCase_ == 6 ? (v) this.operation_ : v.v();
    }

    public final C0148m F() {
        return this.operationCase_ == 1 ? (C0148m) this.operation_ : C0148m.y();
    }

    public final C0151q G() {
        C0151q c0151q = this.updateMask_;
        return c0151q == null ? C0151q.w() : c0151q;
    }

    public final com.google.protobuf.K H() {
        return this.updateTransforms_;
    }

    public final String I() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public final boolean J() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean K() {
        return this.operationCase_ == 6;
    }

    public final boolean L() {
        return this.operationCase_ == 1;
    }

    public final boolean M() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C0148m.class, "updateMask_", "currentDocument_", v.class, "updateTransforms_", C0154u.class});
            case 3:
                return new q0();
            case 4:
                return new o0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (q0.class) {
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
