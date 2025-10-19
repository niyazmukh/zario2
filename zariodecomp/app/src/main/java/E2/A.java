package E2;

import a.AbstractC0183a;
import com.google.protobuf.AbstractC0409l;
import java.util.HashMap;
import java.util.Map;
import s2.C0870e;
import y2.EnumC1056e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E2\A.smali */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public int f1391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1392b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1393c = true;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0409l f1394d = AbstractC0409l.f6528b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1395e = false;

    public final z a() {
        C0870e c0870e = B2.h.f314c;
        C0870e c0870eF = c0870e;
        C0870e c0870eF2 = c0870eF;
        C0870e c0870eF3 = c0870eF2;
        for (Map.Entry entry : this.f1392b.entrySet()) {
            B2.h hVar = (B2.h) entry.getKey();
            EnumC1056e enumC1056e = (EnumC1056e) entry.getValue();
            int iOrdinal = enumC1056e.ordinal();
            if (iOrdinal == 0) {
                c0870eF3 = c0870eF3.f(hVar);
            } else if (iOrdinal == 1) {
                c0870eF = c0870eF.f(hVar);
            } else {
                if (iOrdinal != 2) {
                    AbstractC0183a.z("Encountered invalid change type: %s", enumC1056e);
                    throw null;
                }
                c0870eF2 = c0870eF2.f(hVar);
            }
        }
        return new z(this.f1394d, this.f1395e, c0870eF, c0870eF2, c0870eF3);
    }
}
