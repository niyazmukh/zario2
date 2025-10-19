package P3;

import S0.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P3\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2678a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f2679b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2678a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        f2679b = aVarArr;
        f.y(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2679b.clone();
    }
}
