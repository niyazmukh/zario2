package E2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\x.smali */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f1508a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f1509b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f1510c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f1511d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f1512e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f1513f;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x[] f1514k;

    static {
        x xVar = new x("Initial", 0);
        f1508a = xVar;
        x xVar2 = new x("Starting", 1);
        f1509b = xVar2;
        x xVar3 = new x("Open", 2);
        f1510c = xVar3;
        x xVar4 = new x("Healthy", 3);
        f1511d = xVar4;
        x xVar5 = new x("Error", 4);
        f1512e = xVar5;
        x xVar6 = new x("Backoff", 5);
        f1513f = xVar6;
        f1514k = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f1514k.clone();
    }
}
