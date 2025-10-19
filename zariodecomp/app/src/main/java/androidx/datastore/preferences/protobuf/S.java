package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\S.smali */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f4448c = new S();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4450b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f4449a = new E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.datastore.preferences.protobuf.N] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.datastore.preferences.protobuf.N] */
    public final V a(Class cls) {
        C0212o c0212o;
        M mX;
        M m5;
        M n5;
        Class cls2;
        AbstractC0220x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4450b;
        V v4 = (V) concurrentHashMap.get(cls);
        if (v4 != null) {
            return v4;
        }
        E e5 = this.f4449a;
        e5.getClass();
        Class cls3 = W.f4458a;
        if (!AbstractC0218v.class.isAssignableFrom(cls) && (cls2 = W.f4458a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U uB = ((D) e5.f4420a).b(cls);
        if ((uB.f4457d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0218v.class.isAssignableFrom(cls);
            AbstractC0218v abstractC0218v = uB.f4454a;
            if (zIsAssignableFrom) {
                n5 = new N(W.f4460c, AbstractC0213p.f4533a, abstractC0218v);
            } else {
                d0 d0Var = W.f4459b;
                C0212o c0212o2 = AbstractC0213p.f4534b;
                if (c0212o2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n5 = new N(d0Var, c0212o2, abstractC0218v);
            }
            m5 = n5;
        } else {
            if (AbstractC0218v.class.isAssignableFrom(cls)) {
                O o5 = P.f4447b;
                B b5 = C.f4417b;
                d0 d0Var2 = W.f4460c;
                C0212o c0212o3 = t.h.c(uB.d()) != 1 ? AbstractC0213p.f4533a : null;
                I i = J.f4428b;
                int[] iArr = M.f4430n;
                if (!(uB instanceof U)) {
                    uB.getClass();
                    throw new ClassCastException();
                }
                mX = M.x(uB, o5, b5, d0Var2, c0212o3, i);
            } else {
                O o6 = P.f4446a;
                B b6 = C.f4416a;
                d0 d0Var3 = W.f4459b;
                if (t.h.c(uB.d()) != 1) {
                    c0212o = AbstractC0213p.f4534b;
                    if (c0212o == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    c0212o = null;
                }
                I i5 = J.f4427a;
                int[] iArr2 = M.f4430n;
                if (!(uB instanceof U)) {
                    uB.getClass();
                    throw new ClassCastException();
                }
                mX = M.x(uB, o6, b6, d0Var3, c0212o, i5);
            }
            m5 = mX;
        }
        V v5 = (V) concurrentHashMap.putIfAbsent(cls, m5);
        return v5 != null ? v5 : m5;
    }
}
