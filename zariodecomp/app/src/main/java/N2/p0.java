package N2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\p0.smali */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f2596a;

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f2597b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f2598c;

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f2599d;

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f2600e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p0[] f2601f;

    static {
        p0 p0Var = new p0("UPDATE", 0);
        f2596a = p0Var;
        p0 p0Var2 = new p0("DELETE", 1);
        f2597b = p0Var2;
        p0 p0Var3 = new p0("VERIFY", 2);
        f2598c = p0Var3;
        p0 p0Var4 = new p0("TRANSFORM", 3);
        f2599d = p0Var4;
        p0 p0Var5 = new p0("OPERATION_NOT_SET", 4);
        f2600e = p0Var5;
        f2601f = new p0[]{p0Var, p0Var2, p0Var3, p0Var4, p0Var5};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f2601f.clone();
    }
}
