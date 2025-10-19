package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\n.1.smali */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final C0234l Companion;
    public static final n ON_ANY;
    public static final n ON_CREATE;
    public static final n ON_DESTROY;
    public static final n ON_PAUSE;
    public static final n ON_RESUME;
    public static final n ON_START;
    public static final n ON_STOP;

    static {
        n nVar = new n("ON_CREATE", 0);
        ON_CREATE = nVar;
        n nVar2 = new n("ON_START", 1);
        ON_START = nVar2;
        n nVar3 = new n("ON_RESUME", 2);
        ON_RESUME = nVar3;
        n nVar4 = new n("ON_PAUSE", 3);
        ON_PAUSE = nVar4;
        n nVar5 = new n("ON_STOP", 4);
        ON_STOP = nVar5;
        n nVar6 = new n("ON_DESTROY", 5);
        ON_DESTROY = nVar6;
        n nVar7 = new n("ON_ANY", 6);
        ON_ANY = nVar7;
        $VALUES = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
        Companion = new C0234l();
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final EnumC0236o a() {
        switch (AbstractC0235m.f4656a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0236o.f4660c;
            case 3:
            case 4:
                return EnumC0236o.f4661d;
            case 5:
                return EnumC0236o.f4662e;
            case 6:
                return EnumC0236o.f4658a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
