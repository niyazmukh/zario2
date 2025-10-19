package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\o.1.smali */
public final class EnumC0236o {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0236o f4658a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0236o f4659b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0236o f4660c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0236o f4661d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0236o f4662e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0236o[] f4663f;

    static {
        EnumC0236o enumC0236o = new EnumC0236o("DESTROYED", 0);
        f4658a = enumC0236o;
        EnumC0236o enumC0236o2 = new EnumC0236o("INITIALIZED", 1);
        f4659b = enumC0236o2;
        EnumC0236o enumC0236o3 = new EnumC0236o("CREATED", 2);
        f4660c = enumC0236o3;
        EnumC0236o enumC0236o4 = new EnumC0236o("STARTED", 3);
        f4661d = enumC0236o4;
        EnumC0236o enumC0236o5 = new EnumC0236o("RESUMED", 4);
        f4662e = enumC0236o5;
        f4663f = new EnumC0236o[]{enumC0236o, enumC0236o2, enumC0236o3, enumC0236o4, enumC0236o5};
    }

    public static EnumC0236o valueOf(String str) {
        return (EnumC0236o) Enum.valueOf(EnumC0236o.class, str);
    }

    public static EnumC0236o[] values() {
        return (EnumC0236o[]) f4663f.clone();
    }
}
