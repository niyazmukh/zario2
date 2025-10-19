package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\A.smali */
public enum A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0204g.class, C0204g.f4493c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    A(Class cls, Serializable serializable) {
    }
}
