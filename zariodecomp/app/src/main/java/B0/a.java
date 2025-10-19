package B0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B0\a.smali */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f278d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f279e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f282c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f281b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f280a = new HashMap();

    public a(Context context) {
        this.f282c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f278d == null) {
            synchronized (f279e) {
                try {
                    if (f278d == null) {
                        f278d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f278d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f282c.getString(2131886123);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f281b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new c(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (p1.b.y()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f280a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f282c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
