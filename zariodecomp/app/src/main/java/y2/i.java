package y2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\i.smali */
public enum i {
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    ARRAY_CONTAINS("array_contains"),
    ARRAY_CONTAINS_ANY("array_contains_any"),
    IN("in"),
    NOT_IN("not_in");


    /* renamed from: a, reason: collision with root package name */
    public final String f11109a;

    i(String str) {
        this.f11109a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11109a;
    }
}
