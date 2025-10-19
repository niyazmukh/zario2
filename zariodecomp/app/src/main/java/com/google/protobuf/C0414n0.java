package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\n0.1.smali */
public final class C0414n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0414n0 f6548c = new C0414n0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6550b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Y f6549a = new Y(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.protobuf.h0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.protobuf.h0] */
    public final InterfaceC0425t0 a(Class cls) {
        C0400g0 c0400g0B;
        C0400g0 c0400g0;
        C0400g0 c0402h0;
        Class cls2;
        L.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f6550b;
        InterfaceC0425t0 interfaceC0425t0 = (InterfaceC0425t0) concurrentHashMap.get(cls);
        if (interfaceC0425t0 != null) {
            return interfaceC0425t0;
        }
        Y y4 = this.f6549a;
        y4.getClass();
        Class cls3 = AbstractC0426u0.f6587a;
        if (!E.class.isAssignableFrom(cls) && (cls2 = AbstractC0426u0.f6587a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C0418p0 c0418p0B = ((X) y4.f6481a).b(cls);
        if ((c0418p0B.f6568d & 2) == 2) {
            boolean zIsAssignableFrom = E.class.isAssignableFrom(cls);
            AbstractC0388a abstractC0388a = c0418p0B.f6565a;
            if (zIsAssignableFrom) {
                c0402h0 = new C0402h0(AbstractC0426u0.f6589c, AbstractC0429x.f6597a, abstractC0388a);
            } else {
                E0 e02 = AbstractC0426u0.f6588b;
                C0428w c0428w = AbstractC0429x.f6598b;
                if (c0428w == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0402h0 = new C0402h0(e02, c0428w, abstractC0388a);
            }
            c0400g0 = c0402h0;
        } else {
            if (E.class.isAssignableFrom(cls)) {
                c0400g0B = t.h.c(c0418p0B.d()) != 1 ? C0400g0.B(c0418p0B, AbstractC0406j0.f6522b, V.f6468b, AbstractC0426u0.f6589c, AbstractC0429x.f6597a, AbstractC0395d0.f6493b) : C0400g0.B(c0418p0B, AbstractC0406j0.f6522b, V.f6468b, AbstractC0426u0.f6589c, null, AbstractC0395d0.f6493b);
            } else if (t.h.c(c0418p0B.d()) != 1) {
                C0404i0 c0404i0 = AbstractC0406j0.f6521a;
                T t4 = V.f6467a;
                E0 e03 = AbstractC0426u0.f6588b;
                C0428w c0428w2 = AbstractC0429x.f6598b;
                if (c0428w2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0400g0B = C0400g0.B(c0418p0B, c0404i0, t4, e03, c0428w2, AbstractC0395d0.f6492a);
            } else {
                c0400g0B = C0400g0.B(c0418p0B, AbstractC0406j0.f6521a, V.f6467a, AbstractC0426u0.f6588b, null, AbstractC0395d0.f6492a);
            }
            c0400g0 = c0400g0B;
        }
        InterfaceC0425t0 interfaceC0425t02 = (InterfaceC0425t0) concurrentHashMap.putIfAbsent(cls, c0400g0);
        return interfaceC0425t02 != null ? interfaceC0425t02 : c0400g0;
    }
}
