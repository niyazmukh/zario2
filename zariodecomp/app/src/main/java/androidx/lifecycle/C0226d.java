package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\d.1.smali */
public final class C0226d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0226d f4638c = new C0226d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4639a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4640b = new HashMap();

    public static void b(HashMap map, C0225c c0225c, n nVar, Class cls) {
        n nVar2 = (n) map.get(c0225c);
        if (nVar2 == null || nVar == nVar2) {
            if (nVar2 == null) {
                map.put(c0225c, nVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0225c.f4636b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + nVar2 + ", new value " + nVar);
    }

    public final C0224b a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f4639a;
        if (superclass != null) {
            C0224b c0224bA = (C0224b) map2.get(superclass);
            if (c0224bA == null) {
                c0224bA = a(superclass, null);
            }
            map.putAll(c0224bA.f4630b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0224b c0224bA2 = (C0224b) map2.get(cls2);
            if (c0224bA2 == null) {
                c0224bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0224bA2.f4630b.entrySet()) {
                b(map, (C0225c) entry.getKey(), (n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            I i5 = (I) method.getAnnotation(I.class);
            if (i5 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0241v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                n nVarValue = i5.value();
                if (parameterTypes.length > 1) {
                    if (!n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (nVarValue != n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0225c(i, method), nVarValue, cls);
                z4 = true;
            }
        }
        C0224b c0224b = new C0224b(map);
        map2.put(cls, c0224b);
        this.f4640b.put(cls, Boolean.valueOf(z4));
        return c0224b;
    }
}
