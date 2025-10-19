package Z;

import androidx.datastore.preferences.protobuf.AbstractC0216t;
import androidx.datastore.preferences.protobuf.AbstractC0218v;
import androidx.datastore.preferences.protobuf.C0206i;
import androidx.datastore.preferences.protobuf.C0208k;
import androidx.datastore.preferences.protobuf.C0211n;
import androidx.datastore.preferences.protobuf.C0217u;
import androidx.datastore.preferences.protobuf.C0222z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.b0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z\e.smali */
public final class e extends AbstractC0218v {
    private static final e DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f4425b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0218v.l(e.class, eVar);
    }

    public static H n(e eVar) {
        H h = eVar.preferences_;
        if (!h.f4426a) {
            eVar.preferences_ = h.b();
        }
        return eVar.preferences_;
    }

    public static c p() {
        return (c) ((AbstractC0216t) DEFAULT_INSTANCE.e(5));
    }

    public static e q(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0206i c0206i = new C0206i(fileInputStream);
        C0211n c0211nA = C0211n.a();
        AbstractC0218v abstractC0218vK = eVar.k();
        try {
            S s4 = S.f4448c;
            s4.getClass();
            V vA = s4.a(abstractC0218vK.getClass());
            C0208k c0208k = c0206i.f4516b;
            if (c0208k == null) {
                c0208k = new C0208k(c0206i);
            }
            vA.e(abstractC0218vK, c0208k, c0211nA);
            vA.d(abstractC0218vK);
            if (AbstractC0218v.h(abstractC0218vK, true)) {
                return (e) abstractC0218vK;
            }
            throw new C0222z(new b0().getMessage());
        } catch (b0 e5) {
            throw new C0222z(e5.getMessage());
        } catch (C0222z e6) {
            if (e6.f4565a) {
                throw new C0222z(e6.getMessage(), e6);
            }
            throw e6;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0222z) {
                throw ((C0222z) e7.getCause());
            }
            throw new C0222z(e7.getMessage(), e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0222z) {
                throw ((C0222z) e8.getCause());
            }
            throw e8;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218v
    public final Object e(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f3932a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q c0217u = PARSER;
                if (c0217u == null) {
                    synchronized (e.class) {
                        try {
                            c0217u = PARSER;
                            if (c0217u == null) {
                                c0217u = new C0217u();
                                PARSER = c0217u;
                            }
                        } finally {
                        }
                    }
                }
                return c0217u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
