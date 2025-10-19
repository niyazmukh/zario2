package f4;

import S0.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\D.smali */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f7002a;

    /* renamed from: b, reason: collision with root package name */
    public static final D f7003b;

    /* renamed from: c, reason: collision with root package name */
    public static final D f7004c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f7005d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ D[] f7006e;

    static {
        D d5 = new D("DEFAULT", 0);
        f7002a = d5;
        D d6 = new D("LAZY", 1);
        f7003b = d6;
        D d7 = new D("ATOMIC", 2);
        f7004c = d7;
        D d8 = new D("UNDISPATCHED", 3);
        f7005d = d8;
        D[] dArr = {d5, d6, d7, d8};
        f7006e = dArr;
        f.y(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f7006e.clone();
    }
}
