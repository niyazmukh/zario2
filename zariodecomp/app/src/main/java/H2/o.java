package h2;

import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\o.smali */
public final class o extends g {

    /* renamed from: m, reason: collision with root package name */
    public static final Object[] f7696m;

    /* renamed from: n, reason: collision with root package name */
    public static final o f7697n;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f7698d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f7699e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f7700f;

    /* renamed from: k, reason: collision with root package name */
    public final transient int f7701k;

    /* renamed from: l, reason: collision with root package name */
    public final transient int f7702l;

    static {
        Object[] objArr = new Object[0];
        f7696m = objArr;
        f7697n = new o(objArr, 0, objArr, 0, 0);
    }

    public o(Object[] objArr, int i, Object[] objArr2, int i5, int i6) {
        this.f7698d = objArr;
        this.f7699e = i;
        this.f7700f = objArr2;
        this.f7701k = i5;
        this.f7702l = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7700f;
            if (objArr.length != 0) {
                int iZ = S0.f.Z(obj.hashCode());
                while (true) {
                    int i = iZ & this.f7701k;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZ = i + 1;
                }
            }
        }
        return false;
    }

    @Override // h2.AbstractC0592a
    public final int g(int i, Object[] objArr) {
        Object[] objArr2 = this.f7698d;
        int i5 = this.f7702l;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // h2.AbstractC0592a
    public final Object[] h() {
        return this.f7698d;
    }

    @Override // h2.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7699e;
    }

    @Override // h2.AbstractC0592a
    public final int i() {
        return this.f7702l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // h2.AbstractC0592a
    public final int j() {
        return 0;
    }

    @Override // h2.AbstractC0592a
    public final boolean k() {
        return false;
    }

    @Override // h2.g
    public final e n() {
        return e.l(this.f7702l, this.f7698d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7702l;
    }
}
