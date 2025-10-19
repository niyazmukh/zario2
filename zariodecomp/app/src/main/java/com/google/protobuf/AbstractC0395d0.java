package com.google.protobuf;

/* renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\d0.1.smali */
public abstract class AbstractC0395d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0393c0 f6492a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0393c0 f6493b;

    static {
        C0393c0 c0393c0 = null;
        try {
            c0393c0 = (C0393c0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6492a = c0393c0;
        f6493b = new C0393c0();
    }
}
