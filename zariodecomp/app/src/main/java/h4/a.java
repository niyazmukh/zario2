package h4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7766a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f7767b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f7768c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f7769d;

    static {
        a aVar = new a("SUSPEND", 0);
        f7766a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f7767b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f7768c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f7769d = aVarArr;
        S0.f.y(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7769d.clone();
    }
}
