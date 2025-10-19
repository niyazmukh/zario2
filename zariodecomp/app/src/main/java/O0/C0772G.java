package o0;

/* renamed from: o0.G, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\G.smali */
public final class C0772G extends C0776K {

    /* renamed from: n, reason: collision with root package name */
    public final Class f9019n;

    public C0772G(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f9019n = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // o0.C0776K, o0.AbstractC0777L
    public final String b() {
        return this.f9019n.getName();
    }

    @Override // o0.C0776K
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String value) {
        Object obj;
        kotlin.jvm.internal.i.e(value, "value");
        Class cls = this.f9019n;
        Object[] enumConstants = cls.getEnumConstants();
        kotlin.jvm.internal.i.d(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            String strName = ((Enum) obj).name();
            if (strName == null ? value == null : strName.equalsIgnoreCase(value)) {
                break;
            }
            i++;
        }
        Enum r32 = (Enum) obj;
        if (r32 != null) {
            return r32;
        }
        StringBuilder sbO = B.a.o("Enum value ", value, " not found for type ");
        sbO.append(cls.getName());
        sbO.append('.');
        throw new IllegalArgumentException(sbO.toString());
    }
}
