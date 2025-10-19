package B3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\X.smali */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f593a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ X[] f594b;

    static {
        X x3 = new X("INSTANCE", 0);
        f593a = x3;
        f594b = new X[]{x3};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f594b.clone();
    }
}
