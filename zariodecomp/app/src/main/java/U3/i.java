package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u3.1\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f10508a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f10509b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f10510c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f10511d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f10512e;

    static {
        i iVar = new i("APP_LIFECYCLE", 0);
        i iVar2 = new i("ACTIVITY_LIFECYCLE", 1);
        f10508a = iVar2;
        i iVar3 = new i("SCREEN", 2);
        f10509b = iVar3;
        i iVar4 = new i("USAGE_STATS", 3);
        f10510c = iVar4;
        i iVar5 = new i("ACCESSIBILITY", 4);
        f10511d = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        f10512e = iVarArr;
        S0.f.y(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10512e.clone();
    }
}
