package o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o3.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o3.1\f.smali */
public final class EnumC0812f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0812f f9244a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0812f f9245b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0812f[] f9246c;

    static {
        EnumC0812f enumC0812f = new EnumC0812f("MET", 0);
        f9244a = enumC0812f;
        EnumC0812f enumC0812f2 = new EnumC0812f("MISSED", 1);
        f9245b = enumC0812f2;
        EnumC0812f[] enumC0812fArr = {enumC0812f, enumC0812f2};
        f9246c = enumC0812fArr;
        S0.f.y(enumC0812fArr);
    }

    public static EnumC0812f valueOf(String str) {
        return (EnumC0812f) Enum.valueOf(EnumC0812f.class, str);
    }

    public static EnumC0812f[] values() {
        return (EnumC0812f[]) f9246c.clone();
    }
}
