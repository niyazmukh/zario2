package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\B.smali */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f9696a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f9697b;

    /* renamed from: c, reason: collision with root package name */
    public static final B f9698c;

    /* renamed from: d, reason: collision with root package name */
    public static final B f9699d;

    /* renamed from: e, reason: collision with root package name */
    public static final B f9700e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B[] f9701f;

    static {
        B b5 = new B("NULL_PACKAGE", 0);
        f9696a = b5;
        B b6 = new B("UNKNOWN_TYPE", 1);
        f9697b = b6;
        B b7 = new B("SUPPRESSED_TASK_ROOT_PACKAGE", 2);
        f9698c = b7;
        B b8 = new B("SUPPRESSED_TASK_ROOT_CLASS", 3);
        f9699d = b8;
        B b9 = new B("NOT_TRACKED_TYPE", 4);
        f9700e = b9;
        B[] bArr = {b5, b6, b7, b8, b9};
        f9701f = bArr;
        S0.f.y(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f9701f.clone();
    }
}
