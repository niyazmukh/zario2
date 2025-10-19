package v1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\G.smali */
public enum G implements InterfaceC0978a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* renamed from: a, reason: collision with root package name */
    public final int f10577a;

    G(int i) {
        this.f10577a = i;
    }

    @Override // v1.InterfaceC0978a
    public final int a() {
        return this.f10577a;
    }
}
