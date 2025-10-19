package Z;

import androidx.datastore.preferences.protobuf.AbstractC0199b;
import androidx.datastore.preferences.protobuf.AbstractC0216t;
import androidx.datastore.preferences.protobuf.AbstractC0218v;
import androidx.datastore.preferences.protobuf.AbstractC0220x;
import androidx.datastore.preferences.protobuf.C0217u;
import androidx.datastore.preferences.protobuf.InterfaceC0219w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z\g.smali */
public final class g extends AbstractC0218v {
    private static final g DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0219w strings_ = T.f4451d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0218v.l(g.class, gVar);
    }

    public static void n(g gVar, Set set) {
        InterfaceC0219w interfaceC0219w = gVar.strings_;
        if (!((AbstractC0199b) interfaceC0219w).f4477a) {
            T t4 = (T) interfaceC0219w;
            int i = t4.f4453c;
            gVar.strings_ = t4.h(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0220x.f4563a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f4453c);
        }
        T t5 = (T) randomAccess;
        int i5 = t5.f4453c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t5.f4453c - i5) + " is null.";
                for (int i6 = t5.f4453c - 1; i6 >= i5; i6--) {
                    t5.remove(i6);
                }
                throw new NullPointerException(str);
            }
            t5.add(obj);
        }
    }

    public static g o() {
        return DEFAULT_INSTANCE;
    }

    public static f q() {
        return (f) ((AbstractC0216t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0218v
    public final Object e(int i) {
        switch (t.h.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q c0217u = PARSER;
                if (c0217u == null) {
                    synchronized (g.class) {
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

    public final InterfaceC0219w p() {
        return this.strings_;
    }
}
