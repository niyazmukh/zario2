package com.google.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\B.smali */
public final class B implements InterfaceC0397e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final B f6407b = new B(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6408a;

    public /* synthetic */ B(int i) {
        this.f6408a = i;
    }

    @Override // com.google.protobuf.InterfaceC0397e0
    public final boolean a(Class cls) {
        switch (this.f6408a) {
            case 0:
                return E.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.InterfaceC0397e0
    public final C0418p0 b(Class cls) {
        switch (this.f6408a) {
            case 0:
                if (!E.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0418p0) E.k(cls.asSubclass(E.class)).j(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
