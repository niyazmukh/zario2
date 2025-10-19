package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0208k;
import androidx.datastore.preferences.protobuf.C0221y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\E0.smali */
public final class E0 {
    public static D0 a(Object obj) {
        E e5 = (E) obj;
        D0 d02 = e5.unknownFields;
        if (d02 != D0.f6412f) {
            return d02;
        }
        D0 d0C = D0.c();
        e5.unknownFields = d0C;
        return d0C;
    }

    public static void b(Object obj) {
        D0 d02 = ((E) obj).unknownFields;
        if (d02.f6417e) {
            d02.f6417e = false;
        }
    }

    public static boolean c(int i, C0208k c0208k, Object obj) throws C0221y, N {
        int i5 = c0208k.f4519b;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        AbstractC0417p abstractC0417p = (AbstractC0417p) c0208k.f4522e;
        if (i7 == 0) {
            c0208k.S(0);
            ((D0) obj).d(i6 << 3, Long.valueOf(abstractC0417p.x()));
            return true;
        }
        if (i7 == 1) {
            c0208k.S(1);
            ((D0) obj).d((i6 << 3) | 1, Long.valueOf(abstractC0417p.u()));
            return true;
        }
        if (i7 == 2) {
            ((D0) obj).d((i6 << 3) | 2, c0208k.k());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw N.d();
            }
            c0208k.S(5);
            ((D0) obj).d(5 | (i6 << 3), Integer.valueOf(abstractC0417p.t()));
            return true;
        }
        D0 d0C = D0.c();
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i + 1;
        if (i10 >= 100) {
            throw new N("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0208k.c() != Integer.MAX_VALUE && c(i10, c0208k, d0C)) {
        }
        if (i9 != c0208k.f4519b) {
            throw N.a();
        }
        if (d0C.f6417e) {
            d0C.f6417e = false;
        }
        ((D0) obj).d(i8 | 3, d0C);
        return true;
    }
}
