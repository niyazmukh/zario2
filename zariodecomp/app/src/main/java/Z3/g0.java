package z3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\g0.smali */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f11308d = Logger.getLogger(g0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static g0 f11309e;

    /* renamed from: a, reason: collision with root package name */
    public String f11310a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f11311b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public h2.n f11312c = h2.n.f7689k;

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            Iterator it = this.f11311b.iterator();
            int iC = Integer.MIN_VALUE;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                f0Var.getClass();
                f0 f0Var2 = (f0) map.get("dns");
                if (f0Var2 == null || f0Var2.c() < f0Var.c()) {
                    map.put("dns", f0Var);
                }
                if (iC < f0Var.c()) {
                    iC = f0Var.c();
                    str = "dns";
                }
            }
            this.f11312c = h2.n.a(map);
            this.f11310a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
