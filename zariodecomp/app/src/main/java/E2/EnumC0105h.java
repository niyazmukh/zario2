package E2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: E2.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\h.1.smali */
public final class EnumC0105h {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0105h f1451a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0105h f1452b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0105h[] f1453c;

    static {
        EnumC0105h enumC0105h = new EnumC0105h("UNREACHABLE", 0);
        f1451a = enumC0105h;
        EnumC0105h enumC0105h2 = new EnumC0105h("REACHABLE", 1);
        f1452b = enumC0105h2;
        f1453c = new EnumC0105h[]{enumC0105h, enumC0105h2};
    }

    public static EnumC0105h valueOf(String str) {
        return (EnumC0105h) Enum.valueOf(EnumC0105h.class, str);
    }

    public static EnumC0105h[] values() {
        return (EnumC0105h[]) f1453c.clone();
    }
}
