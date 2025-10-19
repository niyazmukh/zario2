package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\a.1.smali */
public abstract class AbstractC0388a {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = L.f6425a;
        list.getClass();
        if (list instanceof S) {
            List listE = ((S) list).e();
            S s4 = (S) list2;
            int size = list2.size();
            for (Object obj : listE) {
                if (obj == null) {
                    String str = "Element at index " + (s4.size() - size) + " is null.";
                    for (int size2 = s4.size() - 1; size2 >= size; size2--) {
                        s4.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0409l) {
                    s4.d((AbstractC0409l) obj);
                } else {
                    s4.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC0412m0) {
            list2.addAll(list);
            return;
        }
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    public abstract int c(InterfaceC0425t0 interfaceC0425t0);

    public final byte[] d() {
        try {
            int iC = ((E) this).c(null);
            byte[] bArr = new byte[iC];
            Logger logger = AbstractC0422s.f6578d;
            C0419q c0419q = new C0419q(bArr, 0, iC);
            e(c0419q);
            if (c0419q.P0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }

    public abstract void e(AbstractC0422s abstractC0422s);
}
