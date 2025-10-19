package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\b.1.smali */
public final class C0224b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4629a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4630b;

    public C0224b(HashMap map) {
        this.f4630b = map;
        for (Map.Entry entry : map.entrySet()) {
            n nVar = (n) entry.getValue();
            List arrayList = (List) this.f4629a.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4629a.put(nVar, arrayList);
            }
            arrayList.add((C0225c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0241v interfaceC0241v, n nVar, InterfaceC0240u interfaceC0240u) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0225c c0225c = (C0225c) list.get(size);
                c0225c.getClass();
                try {
                    int i = c0225c.f4635a;
                    Method method = c0225c.f4636b;
                    if (i == 0) {
                        method.invoke(interfaceC0240u, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0240u, interfaceC0241v);
                    } else if (i == 2) {
                        method.invoke(interfaceC0240u, interfaceC0241v, nVar);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
