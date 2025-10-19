package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\k.1.smali */
public final class EnumC1087k {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1087k f11341a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1087k f11342b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1087k f11343c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1087k f11344d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1087k f11345e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1087k[] f11346f;

    static {
        EnumC1087k enumC1087k = new EnumC1087k("CONNECTING", 0);
        f11341a = enumC1087k;
        EnumC1087k enumC1087k2 = new EnumC1087k("READY", 1);
        f11342b = enumC1087k2;
        EnumC1087k enumC1087k3 = new EnumC1087k("TRANSIENT_FAILURE", 2);
        f11343c = enumC1087k3;
        EnumC1087k enumC1087k4 = new EnumC1087k("IDLE", 3);
        f11344d = enumC1087k4;
        EnumC1087k enumC1087k5 = new EnumC1087k("SHUTDOWN", 4);
        f11345e = enumC1087k5;
        f11346f = new EnumC1087k[]{enumC1087k, enumC1087k2, enumC1087k3, enumC1087k4, enumC1087k5};
    }

    public static EnumC1087k valueOf(String str) {
        return (EnumC1087k) Enum.valueOf(EnumC1087k.class, str);
    }

    public static EnumC1087k[] values() {
        return (EnumC1087k[]) f11346f.clone();
    }
}
