package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\s.1.smali */
public final class C0215s implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final C0215s f4559b = new C0215s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4560a;

    public /* synthetic */ C0215s(int i) {
        this.f4560a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean a(Class cls) {
        switch (this.f4560a) {
            case 0:
                return AbstractC0218v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U b(Class cls) {
        switch (this.f4560a) {
            case 0:
                if (!AbstractC0218v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0218v.f(cls.asSubclass(AbstractC0218v.class)).e(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
