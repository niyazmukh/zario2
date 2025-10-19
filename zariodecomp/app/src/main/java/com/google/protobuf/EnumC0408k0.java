package com.google.protobuf;

/* renamed from: com.google.protobuf.k0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\k0.1.smali */
public enum EnumC0408k0 implements I {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f6527a;

    EnumC0408k0(int i) {
        this.f6527a = i;
    }

    @Override // com.google.protobuf.I
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6527a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
