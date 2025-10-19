package H3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\H3\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1909a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f1910b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("BLOCKING", 0);
        a aVar2 = new a("FUTURE", 1);
        a aVar3 = new a("ASYNC", 2);
        f1909a = aVar3;
        f1910b = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1910b.clone();
    }
}
