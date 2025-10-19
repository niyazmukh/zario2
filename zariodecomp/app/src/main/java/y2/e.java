package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y2\e.smali */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3910a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f3911b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f3912c;

    static {
        e eVar = new e("CYCLE", 0);
        f3910a = eVar;
        e eVar2 = new e("LIVE", 1);
        f3911b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f3912c = eVarArr;
        S0.f.y(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3912c.clone();
    }
}
