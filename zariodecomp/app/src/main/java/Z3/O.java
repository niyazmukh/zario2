package z3;

import B3.C0096y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\O.smali */
public final class O {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11258c;

    /* renamed from: d, reason: collision with root package name */
    public static O f11259d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f11260e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11261a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11262b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(O.class.getName());
        f11258c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z4 = C0096y1.f1029a;
            arrayList.add(C0096y1.class);
        } catch (ClassNotFoundException e5) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e5);
        }
        try {
            arrayList.add(I3.x.class);
        } catch (ClassNotFoundException e6) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e6);
        }
        f11260e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized O a() {
        try {
            if (f11259d == null) {
                List<N> listK = AbstractC1080d.k(N.class, f11260e, N.class.getClassLoader(), new C1084h(6));
                f11259d = new O();
                for (N n5 : listK) {
                    f11258c.fine("Service loader found " + n5);
                    O o5 = f11259d;
                    synchronized (o5) {
                        S0.f.g("isAvailable() returned false", n5.c());
                        o5.f11261a.add(n5);
                    }
                }
                f11259d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11259d;
    }

    public final synchronized N b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f11262b;
        S0.f.l(str, "policy");
        return (N) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        try {
            this.f11262b.clear();
            Iterator it = this.f11261a.iterator();
            while (it.hasNext()) {
                N n5 = (N) it.next();
                String strA = n5.a();
                N n6 = (N) this.f11262b.get(strA);
                if (n6 == null || n6.b() < n5.b()) {
                    this.f11262b.put(strA, n5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
