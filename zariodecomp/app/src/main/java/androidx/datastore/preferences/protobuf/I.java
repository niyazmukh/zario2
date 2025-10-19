package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\I.smali */
public final class I {
    public static int a(int i, Object obj, Object obj2) {
        H h = (H) obj;
        G g3 = (G) obj2;
        int iU0 = 0;
        if (!h.isEmpty()) {
            for (Map.Entry entry : h.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                g3.getClass();
                int iS0 = C0209l.S0(i);
                int iA = G.a(g3.f4424a, key, value);
                iU0 += C0209l.U0(iA) + iA + iS0;
            }
        }
        return iU0;
    }

    public static H b(Object obj, Object obj2) {
        H hB = (H) obj;
        H h = (H) obj2;
        if (!h.isEmpty()) {
            if (!hB.f4426a) {
                hB = hB.b();
            }
            hB.a();
            if (!h.isEmpty()) {
                hB.putAll(h);
            }
        }
        return hB;
    }

    public static void c(Object obj) {
        ((H) obj).f4426a = false;
    }
}
