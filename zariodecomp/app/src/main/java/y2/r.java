package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\r.smali */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f11132a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f11133b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f11134c;

    static {
        r rVar = new r("ADDED", 0);
        f11132a = rVar;
        r rVar2 = new r("REMOVED", 1);
        f11133b = rVar2;
        f11134c = new r[]{rVar, rVar2};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f11134c.clone();
    }
}
