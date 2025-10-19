package com.google.protobuf;

/* renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\c.1.smali */
public abstract class AbstractC0392c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f6490a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f6491b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6490a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f6491b = cls2 != null;
    }

    public static boolean a() {
        return (f6490a == null || f6491b) ? false : true;
    }
}
