package g0;

import java.lang.reflect.InvocationTargetException;
import q.C0834k;

/* renamed from: g0.D, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\D.smali */
public final class C0536D {

    /* renamed from: b, reason: collision with root package name */
    public static final C0834k f7305b = new C0834k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0542J f7306a;

    public C0536D(C0542J c0542j) {
        this.f7306a = c0542j;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0834k c0834k = f7305b;
        C0834k c0834k2 = (C0834k) c0834k.getOrDefault(classLoader, null);
        if (c0834k2 == null) {
            c0834k2 = new C0834k();
            c0834k.put(classLoader, c0834k2);
        }
        Class cls = (Class) c0834k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0834k2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e6) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }

    public final AbstractComponentCallbacksC0567t a(String str) {
        try {
            return (AbstractComponentCallbacksC0567t) c(this.f7306a.f7347u.f7552b.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e5) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e6) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e7) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e7);
        } catch (InvocationTargetException e8) {
            throw new B0.c(B.a.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e8);
        }
    }
}
