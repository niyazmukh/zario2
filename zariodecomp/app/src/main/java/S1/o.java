package S1;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\o.smali */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public Object f2998a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2999b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3000c;

    public o(x database) {
        kotlin.jvm.internal.i.e(database, "database");
        this.f2998a = database;
        this.f2999b = new AtomicBoolean(false);
        this.f3000c = S0.f.P(new O0.g(this, 22));
    }

    public static boolean n(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public z0.i a() {
        ((x) this.f2998a).a();
        return ((AtomicBoolean) this.f2999b).compareAndSet(false, true) ? (z0.i) ((K3.h) this.f3000c).getValue() : l();
    }

    public abstract void b();

    public abstract void c();

    public abstract Object d(int i, int i5);

    public abstract Map e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i);

    public abstract Object k(int i, Object obj);

    public z0.i l() {
        String strM = m();
        x xVar = (x) this.f2998a;
        xVar.getClass();
        xVar.a();
        xVar.b();
        return xVar.g().i().k(strM);
    }

    public abstract String m();

    public abstract void o();

    public abstract void p(c cVar);

    public void q(z0.i statement) {
        kotlin.jvm.internal.i.e(statement, "statement");
        if (statement == ((z0.i) ((K3.h) this.f3000c).getValue())) {
            ((AtomicBoolean) this.f2999b).set(false);
        }
    }

    public abstract void r();

    public abstract void s();

    public Object[] t(int i, Object[] objArr) {
        int iF = f();
        if (objArr.length < iF) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iF);
        }
        for (int i5 = 0; i5 < iF; i5++) {
            objArr[i5] = d(i5, i);
        }
        if (objArr.length > iF) {
            objArr[iF] = null;
        }
        return objArr;
    }

    public abstract void u();

    public o(int i) {
        this.f2999b = new float[i * 2];
        this.f3000c = new int[i];
    }
}
