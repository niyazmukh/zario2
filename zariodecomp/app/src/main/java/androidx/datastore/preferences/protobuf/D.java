package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\D.smali */
public final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    public K[] f4418a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        for (K k5 : this.f4418a) {
            if (k5.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        for (K k5 : this.f4418a) {
            if (k5.a(cls)) {
                return k5.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
