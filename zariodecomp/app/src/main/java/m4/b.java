package m4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\b.smali */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8911a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f8912b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f8913c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f8914d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f8915e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f8916f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f8911a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f8912b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f8913c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f8914d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f8915e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f8916f = bVarArr;
        S0.f.y(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8916f.clone();
    }
}
