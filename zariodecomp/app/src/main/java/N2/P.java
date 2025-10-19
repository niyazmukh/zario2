package N2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\P.smali */
public enum P implements com.google.protobuf.I {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2581a;

    P(int i) {
        this.f2581a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2581a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
