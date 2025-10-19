package B3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B3.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\y.1.smali */
public final class EnumC0094y {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0094y f1022a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0094y f1023b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0094y f1024c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0094y f1025d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0094y[] f1026e;

    static {
        EnumC0094y enumC0094y = new EnumC0094y("PROCESSED", 0);
        f1022a = enumC0094y;
        EnumC0094y enumC0094y2 = new EnumC0094y("REFUSED", 1);
        f1023b = enumC0094y2;
        EnumC0094y enumC0094y3 = new EnumC0094y("DROPPED", 2);
        f1024c = enumC0094y3;
        EnumC0094y enumC0094y4 = new EnumC0094y("MISCARRIED", 3);
        f1025d = enumC0094y4;
        f1026e = new EnumC0094y[]{enumC0094y, enumC0094y2, enumC0094y3, enumC0094y4};
    }

    public static EnumC0094y valueOf(String str) {
        return (EnumC0094y) Enum.valueOf(EnumC0094y.class, str);
    }

    public static EnumC0094y[] values() {
        return (EnumC0094y[]) f1026e.clone();
    }
}
