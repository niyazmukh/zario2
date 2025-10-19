package M2;

import com.google.protobuf.I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M2\b.smali */
public enum b implements I {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f2490a;

    b(int i) {
        this.f2490a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2490a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
