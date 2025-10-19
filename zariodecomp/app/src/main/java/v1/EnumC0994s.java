package v1;

/* renamed from: v1.s, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\s.1.smali */
public enum EnumC0994s implements InterfaceC0978a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* renamed from: a, reason: collision with root package name */
    public final int f10645a;

    EnumC0994s(int i) {
        this.f10645a = i;
    }

    @Override // v1.InterfaceC0978a
    public final int a() {
        return this.f10645a;
    }
}
