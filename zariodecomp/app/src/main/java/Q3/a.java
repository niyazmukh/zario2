package Q3;

import a.AbstractC0183a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\a.smali */
public abstract class a implements O3.d, d, Serializable {
    private final O3.d completion;

    public a(O3.d dVar) {
        this.completion = dVar;
    }

    public O3.d create(O3.d completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Q3.d
    public d getCallerFrame() {
        O3.d dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final O3.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f fVar = g.f2815b;
        f fVar2 = g.f2814a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f2815b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f2815b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2) {
            Method method = fVar.f2811a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = fVar.f2812b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = fVar.f2813c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.d
    public final void resumeWith(Object obj) {
        while (true) {
            a aVar = this;
            O3.d dVar = aVar.completion;
            kotlin.jvm.internal.i.b(dVar);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == P3.a.f2678a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0183a.v(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar instanceof a)) {
                dVar.resumeWith(obj);
                return;
            }
            this = dVar;
        }
    }

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public O3.d create(Object obj, O3.d completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
