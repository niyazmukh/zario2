package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import k0.AbstractC0653c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\h0.smali */
public final class h0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static h0 f4650c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f4651b;

    public h0(Application application) {
        this.f4651b = application;
    }

    public final f0 a(Class cls, Application application) {
        if (!AbstractC0223a.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            f0 f0Var = (f0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.i.d(f0Var, "{\n                try {\n…          }\n            }");
            return f0Var;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    @Override // androidx.lifecycle.i0
    public final f0 create(Class modelClass, AbstractC0653c extras) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        kotlin.jvm.internal.i.e(extras, "extras");
        if (this.f4651b != null) {
            return create(modelClass);
        }
        Application application = (Application) extras.a(g0.f4648a);
        if (application != null) {
            return a(modelClass, application);
        }
        if (AbstractC0223a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.create(modelClass);
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.i0
    public final f0 create(Class modelClass) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        Application application = this.f4651b;
        if (application != null) {
            return a(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
