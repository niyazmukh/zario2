package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\a.smali */
public final class EnumC0971a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0971a f10480a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0971a f10481b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0971a f10482c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0971a[] f10483d;

    static {
        EnumC0971a enumC0971a = new EnumC0971a("RESUMED", 0);
        f10480a = enumC0971a;
        EnumC0971a enumC0971a2 = new EnumC0971a("PAUSED", 1);
        f10481b = enumC0971a2;
        EnumC0971a enumC0971a3 = new EnumC0971a("STOPPED", 2);
        f10482c = enumC0971a3;
        EnumC0971a[] enumC0971aArr = {enumC0971a, enumC0971a2, enumC0971a3, new EnumC0971a("DESTROYED", 3)};
        f10483d = enumC0971aArr;
        S0.f.y(enumC0971aArr);
    }

    public static EnumC0971a valueOf(String str) {
        return (EnumC0971a) Enum.valueOf(EnumC0971a.class, str);
    }

    public static EnumC0971a[] values() {
        return (EnumC0971a[]) f10483d.clone();
    }
}
