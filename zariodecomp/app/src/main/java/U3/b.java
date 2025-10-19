package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10484a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f10485b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f10486c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f10487d;

    static {
        b bVar = new b("HIGH", 0);
        f10484a = bVar;
        b bVar2 = new b("MEDIUM", 1);
        f10485b = bVar2;
        b bVar3 = new b("LOW", 2);
        f10486c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f10487d = bVarArr;
        S0.f.y(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10487d.clone();
    }
}
