package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\z.1.smali */
public final class EnumC0431z {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0431z f6604b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0431z f6605c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0431z[] f6606d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0431z[] f6607e;

    /* renamed from: a, reason: collision with root package name */
    public final int f6608a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0431z EF0;

    static {
        P p5 = P.DOUBLE;
        EnumC0431z enumC0431z = new EnumC0431z("DOUBLE", 0, 0, 1, p5);
        P p6 = P.FLOAT;
        EnumC0431z enumC0431z2 = new EnumC0431z("FLOAT", 1, 1, 1, p6);
        P p7 = P.LONG;
        EnumC0431z enumC0431z3 = new EnumC0431z("INT64", 2, 2, 1, p7);
        EnumC0431z enumC0431z4 = new EnumC0431z("UINT64", 3, 3, 1, p7);
        P p8 = P.INT;
        EnumC0431z enumC0431z5 = new EnumC0431z("INT32", 4, 4, 1, p8);
        EnumC0431z enumC0431z6 = new EnumC0431z("FIXED64", 5, 5, 1, p7);
        EnumC0431z enumC0431z7 = new EnumC0431z("FIXED32", 6, 6, 1, p8);
        P p9 = P.BOOLEAN;
        EnumC0431z enumC0431z8 = new EnumC0431z("BOOL", 7, 7, 1, p9);
        P p10 = P.STRING;
        EnumC0431z enumC0431z9 = new EnumC0431z("STRING", 8, 8, 1, p10);
        P p11 = P.MESSAGE;
        EnumC0431z enumC0431z10 = new EnumC0431z("MESSAGE", 9, 9, 1, p11);
        P p12 = P.BYTE_STRING;
        EnumC0431z enumC0431z11 = new EnumC0431z("BYTES", 10, 10, 1, p12);
        EnumC0431z enumC0431z12 = new EnumC0431z("UINT32", 11, 11, 1, p8);
        P p13 = P.ENUM;
        EnumC0431z enumC0431z13 = new EnumC0431z("ENUM", 12, 12, 1, p13);
        EnumC0431z enumC0431z14 = new EnumC0431z("SFIXED32", 13, 13, 1, p8);
        EnumC0431z enumC0431z15 = new EnumC0431z("SFIXED64", 14, 14, 1, p7);
        EnumC0431z enumC0431z16 = new EnumC0431z("SINT32", 15, 15, 1, p8);
        EnumC0431z enumC0431z17 = new EnumC0431z("SINT64", 16, 16, 1, p7);
        EnumC0431z enumC0431z18 = new EnumC0431z("GROUP", 17, 17, 1, p11);
        EnumC0431z enumC0431z19 = new EnumC0431z("DOUBLE_LIST", 18, 18, 2, p5);
        EnumC0431z enumC0431z20 = new EnumC0431z("FLOAT_LIST", 19, 19, 2, p6);
        EnumC0431z enumC0431z21 = new EnumC0431z("INT64_LIST", 20, 20, 2, p7);
        EnumC0431z enumC0431z22 = new EnumC0431z("UINT64_LIST", 21, 21, 2, p7);
        EnumC0431z enumC0431z23 = new EnumC0431z("INT32_LIST", 22, 22, 2, p8);
        EnumC0431z enumC0431z24 = new EnumC0431z("FIXED64_LIST", 23, 23, 2, p7);
        EnumC0431z enumC0431z25 = new EnumC0431z("FIXED32_LIST", 24, 24, 2, p8);
        EnumC0431z enumC0431z26 = new EnumC0431z("BOOL_LIST", 25, 25, 2, p9);
        EnumC0431z enumC0431z27 = new EnumC0431z("STRING_LIST", 26, 26, 2, p10);
        EnumC0431z enumC0431z28 = new EnumC0431z("MESSAGE_LIST", 27, 27, 2, p11);
        EnumC0431z enumC0431z29 = new EnumC0431z("BYTES_LIST", 28, 28, 2, p12);
        EnumC0431z enumC0431z30 = new EnumC0431z("UINT32_LIST", 29, 29, 2, p8);
        EnumC0431z enumC0431z31 = new EnumC0431z("ENUM_LIST", 30, 30, 2, p13);
        EnumC0431z enumC0431z32 = new EnumC0431z("SFIXED32_LIST", 31, 31, 2, p8);
        EnumC0431z enumC0431z33 = new EnumC0431z("SFIXED64_LIST", 32, 32, 2, p7);
        EnumC0431z enumC0431z34 = new EnumC0431z("SINT32_LIST", 33, 33, 2, p8);
        EnumC0431z enumC0431z35 = new EnumC0431z("SINT64_LIST", 34, 34, 2, p7);
        EnumC0431z enumC0431z36 = new EnumC0431z("DOUBLE_LIST_PACKED", 35, 35, 3, p5);
        f6604b = enumC0431z36;
        EnumC0431z enumC0431z37 = new EnumC0431z("FLOAT_LIST_PACKED", 36, 36, 3, p6);
        EnumC0431z enumC0431z38 = new EnumC0431z("INT64_LIST_PACKED", 37, 37, 3, p7);
        EnumC0431z enumC0431z39 = new EnumC0431z("UINT64_LIST_PACKED", 38, 38, 3, p7);
        EnumC0431z enumC0431z40 = new EnumC0431z("INT32_LIST_PACKED", 39, 39, 3, p8);
        EnumC0431z enumC0431z41 = new EnumC0431z("FIXED64_LIST_PACKED", 40, 40, 3, p7);
        EnumC0431z enumC0431z42 = new EnumC0431z("FIXED32_LIST_PACKED", 41, 41, 3, p8);
        EnumC0431z enumC0431z43 = new EnumC0431z("BOOL_LIST_PACKED", 42, 42, 3, p9);
        EnumC0431z enumC0431z44 = new EnumC0431z("UINT32_LIST_PACKED", 43, 43, 3, p8);
        EnumC0431z enumC0431z45 = new EnumC0431z("ENUM_LIST_PACKED", 44, 44, 3, p13);
        EnumC0431z enumC0431z46 = new EnumC0431z("SFIXED32_LIST_PACKED", 45, 45, 3, p8);
        EnumC0431z enumC0431z47 = new EnumC0431z("SFIXED64_LIST_PACKED", 46, 46, 3, p7);
        EnumC0431z enumC0431z48 = new EnumC0431z("SINT32_LIST_PACKED", 47, 47, 3, p8);
        EnumC0431z enumC0431z49 = new EnumC0431z("SINT64_LIST_PACKED", 48, 48, 3, p7);
        f6605c = enumC0431z49;
        f6607e = new EnumC0431z[]{enumC0431z, enumC0431z2, enumC0431z3, enumC0431z4, enumC0431z5, enumC0431z6, enumC0431z7, enumC0431z8, enumC0431z9, enumC0431z10, enumC0431z11, enumC0431z12, enumC0431z13, enumC0431z14, enumC0431z15, enumC0431z16, enumC0431z17, enumC0431z18, enumC0431z19, enumC0431z20, enumC0431z21, enumC0431z22, enumC0431z23, enumC0431z24, enumC0431z25, enumC0431z26, enumC0431z27, enumC0431z28, enumC0431z29, enumC0431z30, enumC0431z31, enumC0431z32, enumC0431z33, enumC0431z34, enumC0431z35, enumC0431z36, enumC0431z37, enumC0431z38, enumC0431z39, enumC0431z40, enumC0431z41, enumC0431z42, enumC0431z43, enumC0431z44, enumC0431z45, enumC0431z46, enumC0431z47, enumC0431z48, enumC0431z49, new EnumC0431z("GROUP_LIST", 49, 49, 2, p11), new EnumC0431z("MAP", 50, 50, 4, P.VOID)};
        EnumC0431z[] enumC0431zArrValues = values();
        f6606d = new EnumC0431z[enumC0431zArrValues.length];
        for (EnumC0431z enumC0431z50 : enumC0431zArrValues) {
            f6606d[enumC0431z50.f6608a] = enumC0431z50;
        }
    }

    public EnumC0431z(String str, int i, int i5, int i6, P p5) {
        this.f6608a = i5;
        int iC = t.h.c(i6);
        if (iC == 1 || iC == 3) {
            p5.getClass();
        }
        if (i6 == 1) {
            p5.ordinal();
        }
    }

    public static EnumC0431z valueOf(String str) {
        return (EnumC0431z) Enum.valueOf(EnumC0431z.class, str);
    }

    public static EnumC0431z[] values() {
        return (EnumC0431z[]) f6607e.clone();
    }

    public final int a() {
        return this.f6608a;
    }
}
