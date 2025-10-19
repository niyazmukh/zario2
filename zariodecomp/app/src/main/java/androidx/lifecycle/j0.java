package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\j0.smali */
public class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static j0 f4652a;

    @Override // androidx.lifecycle.i0
    public f0 create(Class modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (f0) objNewInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
        }
    }
}
