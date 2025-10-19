package com.google.protobuf;

import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\P.smali */
public enum P {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC0409l.class, AbstractC0409l.f6528b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    P(Class cls, Serializable serializable) {
    }
}
