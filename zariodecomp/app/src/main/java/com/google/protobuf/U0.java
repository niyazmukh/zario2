package com.google.protobuf;

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
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\U0.smali */
public class U0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Q0 f6461c;

    /* renamed from: d, reason: collision with root package name */
    public static final R0 f6462d;

    /* renamed from: e, reason: collision with root package name */
    public static final S0 f6463e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ U0[] f6464f;

    /* renamed from: a, reason: collision with root package name */
    public final V0 f6465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6466b;

    /* JADX INFO: Fake field, exist only in values array */
    U0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    U0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    U0 EF12;

    static {
        U0 u02 = new U0("DOUBLE", 0, V0.DOUBLE, 1);
        U0 u03 = new U0("FLOAT", 1, V0.FLOAT, 5);
        V0 v02 = V0.LONG;
        U0 u04 = new U0("INT64", 2, v02, 0);
        U0 u05 = new U0("UINT64", 3, v02, 0);
        V0 v03 = V0.INT;
        U0 u06 = new U0("INT32", 4, v03, 0);
        U0 u07 = new U0("FIXED64", 5, v02, 1);
        U0 u08 = new U0("FIXED32", 6, v03, 5);
        U0 u09 = new U0("BOOL", 7, V0.BOOLEAN, 0);
        Q0 q02 = new Q0("STRING", 8, V0.STRING, 2);
        f6461c = q02;
        V0 v04 = V0.MESSAGE;
        R0 r02 = new R0("GROUP", 9, v04, 3);
        f6462d = r02;
        S0 s02 = new S0("MESSAGE", 10, v04, 2);
        f6463e = s02;
        f6464f = new U0[]{u02, u03, u04, u05, u06, u07, u08, u09, q02, r02, s02, new T0("BYTES", 11, V0.BYTE_STRING, 2), new U0("UINT32", 12, v03, 0), new U0("ENUM", 13, V0.ENUM, 0), new U0("SFIXED32", 14, v03, 5), new U0("SFIXED64", 15, v02, 1), new U0("SINT32", 16, v03, 0), new U0("SINT64", 17, v02, 0)};
    }

    public U0(String str, int i, V0 v02, int i5) {
        this.f6465a = v02;
        this.f6466b = i5;
    }

    public static U0 valueOf(String str) {
        return (U0) Enum.valueOf(U0.class, str);
    }

    public static U0[] values() {
        return (U0[]) f6464f.clone();
    }
}
