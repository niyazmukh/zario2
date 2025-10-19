package w2;

import android.util.SparseArray;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\o.smali */
public enum o {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_ARGUMENT(3),
    /* JADX INFO: Fake field, exist only in values array */
    DEADLINE_EXCEEDED(4),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(7),
    /* JADX INFO: Fake field, exist only in values array */
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    /* JADX INFO: Fake field, exist only in values array */
    OUT_OF_RANGE(11),
    /* JADX INFO: Fake field, exist only in values array */
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* renamed from: o, reason: collision with root package name */
    public static final SparseArray f10947o;

    /* renamed from: a, reason: collision with root package name */
    public final int f10949a;

    static {
        SparseArray sparseArray = new SparseArray();
        for (o oVar : values()) {
            o oVar2 = (o) sparseArray.get(oVar.f10949a);
            if (oVar2 != null) {
                throw new IllegalStateException("Code value duplication between " + oVar2 + "&" + oVar.name());
            }
            sparseArray.put(oVar.f10949a, oVar);
        }
        f10947o = sparseArray;
    }

    o(int i) {
        this.f10949a = i;
    }
}
