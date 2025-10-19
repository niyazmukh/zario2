package E2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\F.smali */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f1406a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f1407b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f1408c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f1409d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f1410e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F[] f1411f;

    static {
        F f2 = new F("NoChange", 0);
        f1406a = f2;
        F f3 = new F("Added", 1);
        f1407b = f3;
        F f5 = new F("Removed", 2);
        f1408c = f5;
        F f6 = new F("Current", 3);
        f1409d = f6;
        F f7 = new F("Reset", 4);
        f1410e = f7;
        f1411f = new F[]{f2, f3, f5, f6, f7};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f1411f.clone();
    }
}
