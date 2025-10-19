package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\b0.smali */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f11281a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f11282b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f11283c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f11284d;

    static {
        b0 b0Var = new b0("UNARY", 0);
        f11281a = b0Var;
        b0 b0Var2 = new b0("CLIENT_STREAMING", 1);
        b0 b0Var3 = new b0("SERVER_STREAMING", 2);
        f11282b = b0Var3;
        b0 b0Var4 = new b0("BIDI_STREAMING", 3);
        f11283c = b0Var4;
        f11284d = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, new b0("UNKNOWN", 4)};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f11284d.clone();
    }
}
