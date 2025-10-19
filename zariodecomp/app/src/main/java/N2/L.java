package N2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\L.smali */
public enum L implements com.google.protobuf.I {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2561a;

    L(int i) {
        this.f2561a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2561a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
