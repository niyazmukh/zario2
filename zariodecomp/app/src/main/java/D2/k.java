package D2;

import N2.q0;
import com.google.protobuf.AbstractC0390b;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.AbstractC0417p;
import com.google.protobuf.B0;
import com.google.protobuf.C0416o0;
import com.google.protobuf.C0418p0;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.InterfaceC0410l0;
import com.google.protobuf.K;
import com.google.protobuf.N;
import com.google.protobuf.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D2\k.smali */
public final class k extends E {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC0410l0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private K baseWrites_;
    private int batchId_;
    private int bitField0_;
    private B0 localWriteTime_;
    private K writes_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        E.t(k.class, kVar);
    }

    public k() {
        C0416o0 c0416o0 = C0416o0.f6559d;
        this.writes_ = c0416o0;
        this.baseWrites_ = c0416o0;
    }

    public static j F() {
        return (j) DEFAULT_INSTANCE.i();
    }

    public static k G(AbstractC0409l abstractC0409l) throws N {
        k kVar = DEFAULT_INSTANCE;
        v vVarA = v.a();
        AbstractC0417p abstractC0417pQ = abstractC0409l.q();
        E eS = E.s(kVar, abstractC0417pQ, vVarA);
        abstractC0417pQ.e(0);
        E.f(eS);
        E.f(eS);
        return (k) eS;
    }

    public static k H(byte[] bArr) {
        return (k) E.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(k kVar, int i) {
        kVar.batchId_ = i;
    }

    public static void w(k kVar, q0 q0Var) {
        kVar.getClass();
        K k5 = kVar.baseWrites_;
        if (!((AbstractC0390b) k5).f6487a) {
            kVar.baseWrites_ = E.p(k5);
        }
        kVar.baseWrites_.add(q0Var);
    }

    public static void x(k kVar, q0 q0Var) {
        kVar.getClass();
        K k5 = kVar.writes_;
        if (!((AbstractC0390b) k5).f6487a) {
            kVar.writes_ = E.p(k5);
        }
        kVar.writes_.add(q0Var);
    }

    public static void y(k kVar, B0 b02) {
        kVar.getClass();
        kVar.localWriteTime_ = b02;
        kVar.bitField0_ |= 1;
    }

    public final int A() {
        return this.baseWrites_.size();
    }

    public final int B() {
        return this.batchId_;
    }

    public final B0 C() {
        B0 b02 = this.localWriteTime_;
        return b02 == null ? B0.x() : b02;
    }

    public final q0 D(int i) {
        return (q0) this.writes_.get(i);
    }

    public final int E() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.E
    public final Object j(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0418p0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", q0.class, "localWriteTime_", "baseWrites_", q0.class});
            case 3:
                return new k();
            case 4:
                return new j(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0410l0 d5 = PARSER;
                if (d5 == null) {
                    synchronized (k.class) {
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

    public final q0 z(int i) {
        return (q0) this.baseWrites_.get(i);
    }
}
