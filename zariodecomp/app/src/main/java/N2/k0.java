package N2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\k0.smali */
public enum k0 implements com.google.protobuf.I {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2594a;

    k0(int i) {
        this.f2594a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2594a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
