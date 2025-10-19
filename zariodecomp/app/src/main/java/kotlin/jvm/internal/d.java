package kotlin.jvm.internal;

import L3.x;
import X3.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z0.C1062a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\kotlin\jvm\internal\d.smali */
public final class d implements c4.c, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f8422b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f8423c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f8424a;

    static {
        List listY = L3.k.Y(X3.a.class, X3.l.class, X3.p.class, X3.q.class, C1062a.class, X3.r.class, X3.s.class, X3.t.class, X3.u.class, v.class, X3.b.class, X3.c.class, X3.d.class, X3.e.class, X3.f.class, X3.g.class, X3.h.class, X3.i.class, X3.j.class, X3.k.class, X3.m.class, X3.n.class, X3.o.class);
        ArrayList arrayList = new ArrayList(L3.l.a0(listY));
        int i = 0;
        for (Object obj : listY) {
            int i5 = i + 1;
            if (i < 0) {
                L3.k.Z();
                throw null;
            }
            arrayList.add(new K3.e((Class) obj, Integer.valueOf(i)));
            i = i5;
        }
        f8422b = x.e0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(e4.m.z0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f8422b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.a0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, e4.m.z0(str2, str2));
        }
        f8423c = linkedHashMap;
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f8424a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f8424a;
    }

    public final String b() {
        String str;
        Class jClass = this.f8424a;
        i.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f8423c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return e4.m.y0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return e4.m.y0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iIndexOf = simpleName.indexOf(36, 0);
        if (iIndexOf == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iIndexOf + 1, simpleName.length());
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && p1.b.s(this).equals(p1.b.s((c4.c) obj));
    }

    public final int hashCode() {
        return p1.b.s(this).hashCode();
    }

    public final String toString() {
        return this.f8424a.toString() + " (Kotlin reflection is not available)";
    }
}
