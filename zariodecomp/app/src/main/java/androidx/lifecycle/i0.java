package androidx.lifecycle;

import k0.AbstractC0653c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\i0.smali */
public interface i0 {
    default f0 create(Class modelClass) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default f0 create(Class modelClass, AbstractC0653c extras) {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        kotlin.jvm.internal.i.e(extras, "extras");
        return create(modelClass);
    }
}
