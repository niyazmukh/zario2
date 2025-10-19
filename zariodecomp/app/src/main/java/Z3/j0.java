package z3;

import g2.AbstractC0579b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\j0.smali */
public enum j0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: a, reason: collision with root package name */
    public final int f11339a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11340b;

    j0(int i) {
        this.f11339a = i;
        this.f11340b = Integer.toString(i).getBytes(AbstractC0579b.f7598a);
    }

    public final k0 a() {
        return (k0) k0.f11347d.get(this.f11339a);
    }
}
