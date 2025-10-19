package com.google.protobuf;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\x.1.smali */
public abstract class AbstractC0429x {

    /* renamed from: a, reason: collision with root package name */
    public static final C0428w f6597a = new C0428w();

    /* renamed from: b, reason: collision with root package name */
    public static final C0428w f6598b;

    static {
        C0428w c0428w = null;
        try {
            c0428w = (C0428w) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6598b = c0428w;
    }
}
