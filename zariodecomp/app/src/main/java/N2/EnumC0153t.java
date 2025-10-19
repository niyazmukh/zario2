package N2;

/* renamed from: N2.t, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\t.1.smali */
public enum EnumC0153t implements com.google.protobuf.I {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2607a;

    EnumC0153t(int i) {
        this.f2607a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2607a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
