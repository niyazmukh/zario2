package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\n.1.smali */
public final class C0211n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0211n f4531a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0211n f4532b;

    static {
        C0211n c0211n = new C0211n();
        Collections.emptyMap();
        f4532b = c0211n;
    }

    public static C0211n a() {
        S s4 = S.f4448c;
        C0211n c0211n = f4531a;
        if (c0211n == null) {
            synchronized (C0211n.class) {
                try {
                    c0211n = f4531a;
                    if (c0211n == null) {
                        Class cls = AbstractC0210m.f4530a;
                        C0211n c0211n2 = null;
                        if (cls != null) {
                            try {
                                c0211n2 = (C0211n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0211n2 == null) {
                            c0211n2 = f4532b;
                        }
                        f4531a = c0211n2;
                        c0211n = c0211n2;
                    }
                } finally {
                }
            }
        }
        return c0211n;
    }
}
