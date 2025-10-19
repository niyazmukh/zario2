package N2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\N.smali */
public enum N implements com.google.protobuf.I {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2567a;

    N(int i) {
        this.f2567a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2567a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
