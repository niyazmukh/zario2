package V2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\V2\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final J3.c f3430a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f3431b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f3432c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f3433d;

    static {
        f fVar = new f("CONTROL", 0);
        f3431b = fVar;
        f fVar2 = new f("FLEXIBLE", 1);
        f3432c = fVar2;
        f[] fVarArr = {fVar, fVar2, new f("DEPOSIT", 2)};
        f3433d = fVarArr;
        S0.f.y(fVarArr);
        f3430a = new J3.c();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3433d.clone();
    }
}
