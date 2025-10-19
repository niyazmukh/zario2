package F2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import r.AbstractC0854a;
import w2.A;
import w2.InterfaceC1026c;
import w2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\l.smali */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1712a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1713b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1714c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1715d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1716e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1717f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f1718g;

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0373, code lost:
    
        if (r18.f1713b.isEmpty() != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0375, code lost:
    
        r2 = r18.f1718g.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x037f, code lost:
    
        if (r2.hasNext() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0381, code lost:
    
        r3 = (java.lang.String) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x038d, code lost:
    
        if (r18.f1715d.containsKey(r3) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0395, code lost:
    
        if (r18.f1716e.containsKey(r3) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0398, code lost:
    
        r2 = B.a.o("@DocumentId is annotated on property ", r3, " of class ");
        r2.append(r19.getName());
        r2.append(" but no field or public setter was found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03b5, code lost:
    
        throw new java.lang.RuntimeException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03c6, code lost:
    
        throw new java.lang.RuntimeException("No properties to serialize found on class ".concat(r19.getName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(java.lang.Class r19) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.l.<init>(java.lang.Class):void");
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(w.class)) {
            return ((w) accessibleObject.getAnnotation(w.class)).value();
        }
        return null;
    }

    public static void d(String str, String str2, Class cls) {
        if (cls == String.class || cls == w2.g.class) {
            return;
        }
        throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + cls + " instead of String or DocumentReference.");
    }

    public static boolean e(Method method, Method method2) {
        n.a("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        n.a("Expected void return type", returnType.equals(cls));
        n.a("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        n.a("Expected exactly one parameter", parameterTypes.length == 1);
        n.a("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String f(Method method) {
        String strB = b(method);
        if (strB != null) {
            return strB;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException(AbstractC0854a.b("Unknown Bean prefix for method: ", name));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i5 = 0; i5 < charArray.length && Character.isUpperCase(charArray[i5]); i5++) {
            charArray[i5] = Character.toLowerCase(charArray[i5]);
        }
        return new String(charArray);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f1713b.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final void c(Field field) {
        if (field.isAnnotationPresent(A.class)) {
            Class<?> type = field.getType();
            if (type != Date.class && type != l2.o.class) {
                throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
            }
            String strB = b(field);
            if (strB == null) {
                strB = field.getName();
            }
            this.f1717f.add(strB);
        }
        if (field.isAnnotationPresent(InterfaceC1026c.class)) {
            d("Field", "is", field.getType());
            String strB2 = b(field);
            if (strB2 == null) {
                strB2 = field.getName();
            }
            this.f1718g.add(strB2);
        }
    }
}
