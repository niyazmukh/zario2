package N2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\V.smali */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f2582a;

    /* renamed from: b, reason: collision with root package name */
    public static final V f2583b;

    /* renamed from: c, reason: collision with root package name */
    public static final V f2584c;

    /* renamed from: d, reason: collision with root package name */
    public static final V f2585d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ V[] f2586e;

    static {
        V v4 = new V("COMPOSITE_FILTER", 0);
        f2582a = v4;
        V v5 = new V("FIELD_FILTER", 1);
        f2583b = v5;
        V v6 = new V("UNARY_FILTER", 2);
        f2584c = v6;
        V v7 = new V("FILTERTYPE_NOT_SET", 3);
        f2585d = v7;
        f2586e = new V[]{v4, v5, v6, v7};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f2586e.clone();
    }
}
