package y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\y2.1\e.smali */
public final class EnumC1056e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1056e f11086a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1056e f11087b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1056e f11088c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1056e f11089d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1056e[] f11090e;

    static {
        EnumC1056e enumC1056e = new EnumC1056e("REMOVED", 0);
        f11086a = enumC1056e;
        EnumC1056e enumC1056e2 = new EnumC1056e("ADDED", 1);
        f11087b = enumC1056e2;
        EnumC1056e enumC1056e3 = new EnumC1056e("MODIFIED", 2);
        f11088c = enumC1056e3;
        EnumC1056e enumC1056e4 = new EnumC1056e("METADATA", 3);
        f11089d = enumC1056e4;
        f11090e = new EnumC1056e[]{enumC1056e, enumC1056e2, enumC1056e3, enumC1056e4};
    }

    public static EnumC1056e valueOf(String str) {
        return (EnumC1056e) Enum.valueOf(EnumC1056e.class, str);
    }

    public static EnumC1056e[] values() {
        return (EnumC1056e[]) f11090e.clone();
    }
}
