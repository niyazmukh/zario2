package D2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D2\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1318a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f1319b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f1320c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f1321d;

    static {
        f fVar = new f("QUERY", 0);
        f1318a = fVar;
        f fVar2 = new f("DOCUMENTS", 1);
        f1319b = fVar2;
        f fVar3 = new f("TARGETTYPE_NOT_SET", 2);
        f1320c = fVar3;
        f1321d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1321d.clone();
    }
}
