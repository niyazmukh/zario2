package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\q0.smali */
public class q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f4538c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f4539d;

    /* renamed from: e, reason: collision with root package name */
    public static final o0 f4540e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q0[] f4541f;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4543b;

    /* JADX INFO: Fake field, exist only in values array */
    q0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    q0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    q0 EF12;

    static {
        q0 q0Var = new q0("DOUBLE", 0, r0.DOUBLE, 1);
        q0 q0Var2 = new q0("FLOAT", 1, r0.FLOAT, 5);
        r0 r0Var = r0.LONG;
        q0 q0Var3 = new q0("INT64", 2, r0Var, 0);
        q0 q0Var4 = new q0("UINT64", 3, r0Var, 0);
        r0 r0Var2 = r0.INT;
        q0 q0Var5 = new q0("INT32", 4, r0Var2, 0);
        q0 q0Var6 = new q0("FIXED64", 5, r0Var, 1);
        q0 q0Var7 = new q0("FIXED32", 6, r0Var2, 5);
        q0 q0Var8 = new q0("BOOL", 7, r0.BOOLEAN, 0);
        m0 m0Var = new m0("STRING", 8, r0.STRING, 2);
        f4538c = m0Var;
        r0 r0Var3 = r0.MESSAGE;
        n0 n0Var = new n0("GROUP", 9, r0Var3, 3);
        f4539d = n0Var;
        o0 o0Var = new o0("MESSAGE", 10, r0Var3, 2);
        f4540e = o0Var;
        f4541f = new q0[]{q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, m0Var, n0Var, o0Var, new p0("BYTES", 11, r0.BYTE_STRING, 2), new q0("UINT32", 12, r0Var2, 0), new q0("ENUM", 13, r0.ENUM, 0), new q0("SFIXED32", 14, r0Var2, 5), new q0("SFIXED64", 15, r0Var, 1), new q0("SINT32", 16, r0Var2, 0), new q0("SINT64", 17, r0Var, 0)};
    }

    public q0(String str, int i, r0 r0Var, int i5) {
        this.f4542a = r0Var;
        this.f4543b = i5;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f4541f.clone();
    }
}
