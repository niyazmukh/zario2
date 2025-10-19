package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\T.smali */
public final class T extends V {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f6460c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, long j5, int i) {
        Q q5;
        List list = (List) M0.f6430b.k(obj, j5);
        if (list.isEmpty()) {
            List q6 = list instanceof S ? new Q(i) : ((list instanceof InterfaceC0412m0) && (list instanceof K)) ? ((K) list).c(i) : new ArrayList(i);
            M0.s(obj, j5, q6);
            return q6;
        }
        if (f6460c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            M0.s(obj, j5, arrayList);
            q5 = arrayList;
        } else {
            if (!(list instanceof H0)) {
                if (!(list instanceof InterfaceC0412m0) || !(list instanceof K)) {
                    return list;
                }
                K k5 = (K) list;
                if (((AbstractC0390b) k5).f6487a) {
                    return list;
                }
                K kC = k5.c(list.size() + i);
                M0.s(obj, j5, kC);
                return kC;
            }
            Q q7 = new Q(list.size() + i);
            q7.addAll((H0) list);
            M0.s(obj, j5, q7);
            q5 = q7;
        }
        return q5;
    }

    @Override // com.google.protobuf.V
    public final void a(Object obj, long j5) {
        Object objUnmodifiableList;
        List list = (List) M0.f6430b.k(obj, j5);
        if (list instanceof S) {
            objUnmodifiableList = ((S) list).a();
        } else {
            if (f6460c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0412m0) && (list instanceof K)) {
                AbstractC0390b abstractC0390b = (AbstractC0390b) ((K) list);
                boolean z4 = abstractC0390b.f6487a;
                if (z4 && z4) {
                    abstractC0390b.f6487a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        M0.s(obj, j5, objUnmodifiableList);
    }

    @Override // com.google.protobuf.V
    public final void b(Object obj, long j5, Object obj2) {
        List list = (List) M0.f6430b.k(obj2, j5);
        List listD = d(obj, j5, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        M0.s(obj, j5, list);
    }

    @Override // com.google.protobuf.V
    public final List c(Object obj, long j5) {
        return d(obj, j5, 10);
    }
}
