package A2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\H.smali */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f89a;

    /* renamed from: b, reason: collision with root package name */
    public static final H f90b;

    /* renamed from: c, reason: collision with root package name */
    public static final H f91c;

    /* renamed from: d, reason: collision with root package name */
    public static final H f92d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ H[] f93e;

    static {
        H h = new H("LISTEN", 0);
        f89a = h;
        H h5 = new H("EXISTENCE_FILTER_MISMATCH", 1);
        f90b = h5;
        H h6 = new H("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        f91c = h6;
        H h7 = new H("LIMBO_RESOLUTION", 3);
        f92d = h7;
        f93e = new H[]{h, h5, h6, h7};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f93e.clone();
    }
}
