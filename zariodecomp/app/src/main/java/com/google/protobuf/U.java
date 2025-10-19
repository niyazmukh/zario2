package com.google.protobuf;

import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\U.smali */
public final class U extends V {
    @Override // com.google.protobuf.V
    public final void a(Object obj, long j5) {
        AbstractC0390b abstractC0390b = (AbstractC0390b) ((K) M0.f6430b.k(obj, j5));
        if (abstractC0390b.f6487a) {
            abstractC0390b.f6487a = false;
        }
    }

    @Override // com.google.protobuf.V
    public final void b(Object obj, long j5, Object obj2) {
        L0 l02 = M0.f6430b;
        K kC = (K) l02.k(obj, j5);
        K k5 = (K) l02.k(obj2, j5);
        int size = kC.size();
        int size2 = k5.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0390b) kC).f6487a) {
                kC = kC.c(size2 + size);
            }
            kC.addAll(k5);
        }
        if (size > 0) {
            k5 = kC;
        }
        M0.s(obj, j5, k5);
    }

    @Override // com.google.protobuf.V
    public final List c(Object obj, long j5) {
        K k5 = (K) M0.f6430b.k(obj, j5);
        if (((AbstractC0390b) k5).f6487a) {
            return k5;
        }
        int size = k5.size();
        K kC = k5.c(size == 0 ? 10 : size * 2);
        M0.s(obj, j5, kC);
        return kC;
    }
}
