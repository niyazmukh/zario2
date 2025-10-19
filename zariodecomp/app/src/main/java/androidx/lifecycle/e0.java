package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\e0.smali */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4642a = L3.k.Y(Application.class, X.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f4643b = p1.b.B(X.class);

    public static final Constructor a(Class modelClass, List signature) throws SecurityException {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        kotlin.jvm.internal.i.e(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "constructor.parameterTypes");
            List listZ0 = L3.i.z0(parameterTypes);
            if (signature.equals(listZ0)) {
                return constructor;
            }
            if (signature.size() == listZ0.size() && listZ0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final f0 b(Class modelClass, Constructor constructor, Object... objArr) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        try {
            return (f0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + modelClass, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e7.getCause());
        }
    }
}
