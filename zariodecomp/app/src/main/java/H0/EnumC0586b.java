package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h0.1\b.smali */
public final class EnumC0586b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0586b f7612a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0586b f7613b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0586b f7614c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0586b f7615d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0586b[] f7616e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0586b EF0;

    static {
        EnumC0586b enumC0586b = new EnumC0586b("PENALTY_LOG", 0);
        EnumC0586b enumC0586b2 = new EnumC0586b("PENALTY_DEATH", 1);
        EnumC0586b enumC0586b3 = new EnumC0586b("DETECT_FRAGMENT_REUSE", 2);
        f7612a = enumC0586b3;
        EnumC0586b enumC0586b4 = new EnumC0586b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f7613b = enumC0586b4;
        EnumC0586b enumC0586b5 = new EnumC0586b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f7614c = enumC0586b5;
        EnumC0586b enumC0586b6 = new EnumC0586b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC0586b enumC0586b7 = new EnumC0586b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC0586b enumC0586b8 = new EnumC0586b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC0586b enumC0586b9 = new EnumC0586b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f7615d = enumC0586b9;
        f7616e = new EnumC0586b[]{enumC0586b, enumC0586b2, enumC0586b3, enumC0586b4, enumC0586b5, enumC0586b6, enumC0586b7, enumC0586b8, enumC0586b9};
    }

    public static EnumC0586b valueOf(String str) {
        return (EnumC0586b) Enum.valueOf(EnumC0586b.class, str);
    }

    public static EnumC0586b[] values() {
        return (EnumC0586b[]) f7616e.clone();
    }
}
