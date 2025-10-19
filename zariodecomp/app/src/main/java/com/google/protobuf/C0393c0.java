package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\c0.1.smali */
public final class C0393c0 {
    public static Z a(Object obj) {
        return ((C0389a0) obj).f6485a;
    }

    public static C0391b0 b(Object obj) {
        return (C0391b0) obj;
    }

    public static int c(int i, Object obj, Object obj2) {
        C0391b0 c0391b0 = (C0391b0) obj;
        C0389a0 c0389a0 = (C0389a0) obj2;
        int iR0 = 0;
        if (!c0391b0.isEmpty()) {
            for (Map.Entry entry : c0391b0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0389a0.getClass();
                int iP0 = AbstractC0422s.p0(i);
                int iA = C0389a0.a(c0389a0.f6485a, key, value);
                iR0 += AbstractC0422s.r0(iA) + iA + iP0;
            }
        }
        return iR0;
    }

    public static boolean d(Object obj) {
        return !((C0391b0) obj).f6489a;
    }

    public static C0391b0 e(Object obj, Object obj2) {
        C0391b0 c0391b0C = (C0391b0) obj;
        C0391b0 c0391b0 = (C0391b0) obj2;
        if (!c0391b0.isEmpty()) {
            if (!c0391b0C.f6489a) {
                c0391b0C = c0391b0C.c();
            }
            c0391b0C.b();
            if (!c0391b0.isEmpty()) {
                c0391b0C.putAll(c0391b0);
            }
        }
        return c0391b0C;
    }

    public static C0391b0 f() {
        return C0391b0.f6488b.c();
    }

    public static void g(Object obj) {
        ((C0391b0) obj).f6489a = false;
    }
}
