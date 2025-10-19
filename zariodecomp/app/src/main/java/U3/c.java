package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10488a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f10489b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f10490c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f10491d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f10492e;

    static {
        c cVar = new c("SCREEN_ON", 0);
        f10488a = cVar;
        c cVar2 = new c("SCREEN_OFF", 1);
        f10489b = cVar2;
        c cVar3 = new c("USER_PRESENT", 2);
        f10490c = cVar3;
        c cVar4 = new c("INTERACTIVE", 3);
        c cVar5 = new c("NON_INTERACTIVE", 4);
        f10491d = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f10492e = cVarArr;
        S0.f.y(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10492e.clone();
    }
}
