package com.google.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\X.smali */
public final class X implements InterfaceC0397e0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0397e0[] f6479a;

    @Override // com.google.protobuf.InterfaceC0397e0
    public final boolean a(Class cls) {
        for (InterfaceC0397e0 interfaceC0397e0 : this.f6479a) {
            if (interfaceC0397e0.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC0397e0
    public final C0418p0 b(Class cls) {
        for (InterfaceC0397e0 interfaceC0397e0 : this.f6479a) {
            if (interfaceC0397e0.a(cls)) {
                return interfaceC0397e0.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
