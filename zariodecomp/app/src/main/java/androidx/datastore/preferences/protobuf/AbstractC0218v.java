package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\v.1.smali */
public abstract class AbstractC0218v extends AbstractC0198a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0218v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0218v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f4480f;
    }

    public static AbstractC0218v f(Class cls) throws ClassNotFoundException {
        AbstractC0218v abstractC0218v = defaultInstanceMap.get(cls);
        if (abstractC0218v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0218v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (abstractC0218v == null) {
            abstractC0218v = (AbstractC0218v) ((AbstractC0218v) i0.d(cls)).e(6);
            if (abstractC0218v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0218v);
        }
        return abstractC0218v;
    }

    public static Object g(Method method, AbstractC0198a abstractC0198a, Object... objArr) {
        try {
            return method.invoke(abstractC0198a, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0218v abstractC0218v, boolean z4) {
        byte bByteValue = ((Byte) abstractC0218v.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        S s4 = S.f4448c;
        s4.getClass();
        boolean zA = s4.a(abstractC0218v.getClass()).a(abstractC0218v);
        if (z4) {
            abstractC0218v.e(2);
        }
        return zA;
    }

    public static void l(Class cls, AbstractC0218v abstractC0218v) {
        abstractC0218v.j();
        defaultInstanceMap.put(cls, abstractC0218v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0198a
    public final int a(V v4) {
        int iH;
        int iH2;
        if (i()) {
            if (v4 == null) {
                S s4 = S.f4448c;
                s4.getClass();
                iH2 = s4.a(getClass()).h(this);
            } else {
                iH2 = v4.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(B.a.g(iH2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (v4 == null) {
            S s5 = S.f4448c;
            s5.getClass();
            iH = s5.a(getClass()).h(this);
        } else {
            iH = v4.h(this);
        }
        m(iH);
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0198a
    public final void b(C0209l c0209l) {
        S s4 = S.f4448c;
        s4.getClass();
        V vA = s4.a(getClass());
        E e5 = c0209l.f4524b;
        if (e5 == null) {
            e5 = new E(c0209l);
        }
        vA.f(this, e5);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s4 = S.f4448c;
        s4.getClass();
        return s4.a(getClass()).i(this, (AbstractC0218v) obj);
    }

    public final int hashCode() {
        if (i()) {
            S s4 = S.f4448c;
            s4.getClass();
            return s4.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            S s5 = S.f4448c;
            s5.getClass();
            this.memoizedHashCode = s5.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final AbstractC0218v k() {
        return (AbstractC0218v) e(4);
    }

    public final void m(int i) {
        if (i < 0) {
            throw new IllegalStateException(B.a.g(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f4429a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
