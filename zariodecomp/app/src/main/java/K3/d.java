package K3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\K3\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f2276a;

    static {
        d[] dVarArr = {new d("SYNCHRONIZED", 0), new d("PUBLICATION", 1), new d("NONE", 2)};
        f2276a = dVarArr;
        S0.f.y(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2276a.clone();
    }
}
