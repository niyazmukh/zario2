package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c4\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j[] f5451a;

    static {
        j[] jVarArr = {new j("PUBLIC", 0), new j("PROTECTED", 1), new j("INTERNAL", 2), new j("PRIVATE", 3)};
        f5451a = jVarArr;
        S0.f.y(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f5451a.clone();
    }
}
