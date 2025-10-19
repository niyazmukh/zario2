package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0208k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\E.smali */
public abstract class E extends AbstractC0388a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, E> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected D0 unknownFields;

    public E() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = D0.f6412f;
    }

    public static void f(E e5) throws N {
        if (!m(e5, true)) {
            throw new N(new C0().getMessage());
        }
    }

    public static E k(Class cls) throws ClassNotFoundException {
        E e5 = defaultInstanceMap.get(cls);
        if (e5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e5 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (e5 == null) {
            e5 = (E) ((E) M0.b(cls)).j(6);
            if (e5 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, e5);
        }
        return e5;
    }

    public static Object l(Method method, AbstractC0388a abstractC0388a, Object... objArr) {
        try {
            return method.invoke(abstractC0388a, objArr);
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

    public static final boolean m(E e5, boolean z4) {
        byte bByteValue = ((Byte) e5.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0414n0 c0414n0 = C0414n0.f6548c;
        c0414n0.getClass();
        boolean zA = c0414n0.a(e5.getClass()).a(e5);
        if (z4) {
            e5.j(2);
        }
        return zA;
    }

    public static K p(K k5) {
        int size = k5.size();
        return k5.c(size == 0 ? 10 : size * 2);
    }

    public static E r(E e5, byte[] bArr) throws N {
        int length = bArr.length;
        v vVarA = v.a();
        E eQ = e5.q();
        try {
            C0414n0 c0414n0 = C0414n0.f6548c;
            c0414n0.getClass();
            InterfaceC0425t0 interfaceC0425t0A = c0414n0.a(eQ.getClass());
            C0396e c0396e = new C0396e();
            vVarA.getClass();
            interfaceC0425t0A.h(eQ, bArr, 0, length, c0396e);
            interfaceC0425t0A.d(eQ);
            f(eQ);
            return eQ;
        } catch (C0 e6) {
            throw new N(e6.getMessage());
        } catch (N e7) {
            if (e7.f6436a) {
                throw new N(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof N) {
                throw ((N) e8.getCause());
            }
            throw new N(e8.getMessage(), e8);
        } catch (IndexOutOfBoundsException unused) {
            throw N.h();
        }
    }

    public static E s(E e5, AbstractC0417p abstractC0417p, v vVar) throws N {
        E eQ = e5.q();
        try {
            C0414n0 c0414n0 = C0414n0.f6548c;
            c0414n0.getClass();
            InterfaceC0425t0 interfaceC0425t0A = c0414n0.a(eQ.getClass());
            C0208k c0208k = (C0208k) abstractC0417p.f6564c;
            if (c0208k == null) {
                c0208k = new C0208k(abstractC0417p);
            }
            interfaceC0425t0A.j(eQ, c0208k, vVar);
            interfaceC0425t0A.d(eQ);
            return eQ;
        } catch (C0 e6) {
            throw new N(e6.getMessage());
        } catch (N e7) {
            if (e7.f6436a) {
                throw new N(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof N) {
                throw ((N) e8.getCause());
            }
            throw new N(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof N) {
                throw ((N) e9.getCause());
            }
            throw e9;
        }
    }

    public static void t(Class cls, E e5) {
        e5.o();
        defaultInstanceMap.put(cls, e5);
    }

    @Override // com.google.protobuf.AbstractC0388a
    public final int c(InterfaceC0425t0 interfaceC0425t0) {
        int iE;
        int iE2;
        if (n()) {
            if (interfaceC0425t0 == null) {
                C0414n0 c0414n0 = C0414n0.f6548c;
                c0414n0.getClass();
                iE2 = c0414n0.a(getClass()).e(this);
            } else {
                iE2 = interfaceC0425t0.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(B.a.g(iE2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (interfaceC0425t0 == null) {
            C0414n0 c0414n02 = C0414n0.f6548c;
            c0414n02.getClass();
            iE = c0414n02.a(getClass()).e(this);
        } else {
            iE = interfaceC0425t0.e(this);
        }
        u(iE);
        return iE;
    }

    @Override // com.google.protobuf.AbstractC0388a
    public final void e(AbstractC0422s abstractC0422s) {
        C0414n0 c0414n0 = C0414n0.f6548c;
        c0414n0.getClass();
        InterfaceC0425t0 interfaceC0425t0A = c0414n0.a(getClass());
        Y y4 = abstractC0422s.f6580c;
        if (y4 == null) {
            y4 = new Y(abstractC0422s);
        }
        interfaceC0425t0A.g(this, y4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0414n0 c0414n0 = C0414n0.f6548c;
        c0414n0.getClass();
        return c0414n0.a(getClass()).f(this, (E) obj);
    }

    public final void g() {
        this.memoizedHashCode = 0;
    }

    public final void h() {
        u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final int hashCode() {
        if (n()) {
            C0414n0 c0414n0 = C0414n0.f6548c;
            c0414n0.getClass();
            return c0414n0.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            C0414n0 c0414n02 = C0414n0.f6548c;
            c0414n02.getClass();
            this.memoizedHashCode = c0414n02.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final C i() {
        return (C) j(5);
    }

    public abstract Object j(int i);

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final E q() {
        return (E) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0398f0.f6498a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0398f0.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i) {
        if (i < 0) {
            throw new IllegalStateException(B.a.g(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }
}
