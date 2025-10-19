package s2;

import A2.C0002b;
import S0.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s2.1\b.smali */
public final class C0868b extends AbstractC0869c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9676a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9677b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f9678c;

    public C0868b() {
        C0002b c0002b = B2.h.f313b;
        this.f9676a = new Object[0];
        this.f9677b = new Object[0];
        this.f9678c = c0002b;
    }

    @Override // s2.AbstractC0869c
    public final boolean f(Object obj) {
        return n(obj) != -1;
    }

    @Override // s2.AbstractC0869c
    public final Object g(B2.h hVar) {
        int iN = n(hVar);
        if (iN != -1) {
            return this.f9677b[iN];
        }
        return null;
    }

    @Override // s2.AbstractC0869c
    public final Comparator h() {
        return this.f9678c;
    }

    @Override // s2.AbstractC0869c
    public final Object i() {
        Object[] objArr = this.f9676a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // s2.AbstractC0869c
    public final boolean isEmpty() {
        return this.f9676a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0867a(this, 0);
    }

    @Override // s2.AbstractC0869c
    public final Object j() {
        Object[] objArr = this.f9676a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // s2.AbstractC0869c
    public final AbstractC0869c k(Object obj, Object obj2) {
        int iN = n(obj);
        Comparator comparator = this.f9678c;
        Object[] objArr = this.f9677b;
        Object[] objArr2 = this.f9676a;
        if (iN != -1) {
            if (objArr2[iN] == obj && objArr[iN] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iN] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iN] = obj2;
            return new C0868b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i = 0; i < objArr2.length; i++) {
                map.put(objArr2[i], objArr[i]);
            }
            map.put(obj, obj2);
            return i.j(new ArrayList(map.keySet()), map, comparator);
        }
        int i5 = 0;
        while (i5 < objArr2.length && comparator.compare(objArr2[i5], obj) < 0) {
            i5++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i5);
        objArr5[i5] = obj;
        int i6 = i5 + 1;
        System.arraycopy(objArr2, i5, objArr5, i6, (r0 - i5) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i5);
        objArr6[i5] = obj2;
        System.arraycopy(objArr, i5, objArr6, i6, (r0 - i5) - 1);
        return new C0868b(comparator, objArr5, objArr6);
    }

    @Override // s2.AbstractC0869c
    public final Iterator l(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f9676a;
            if (i >= objArr.length || this.f9678c.compare(objArr[i], obj) >= 0) {
                break;
            }
            i++;
        }
        return new C0867a(this, i);
    }

    @Override // s2.AbstractC0869c
    public final AbstractC0869c m(Object obj) {
        int iN = n(obj);
        if (iN == -1) {
            return this;
        }
        Object[] objArr = this.f9676a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iN);
        int i = iN + 1;
        System.arraycopy(objArr, i, objArr2, iN, length - iN);
        Object[] objArr3 = this.f9677b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iN);
        System.arraycopy(objArr3, i, objArr4, iN, length2 - iN);
        return new C0868b(this.f9678c, objArr2, objArr4);
    }

    public final int n(Object obj) {
        int i = 0;
        for (Object obj2 : this.f9676a) {
            if (this.f9678c.compare(obj, obj2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // s2.AbstractC0869c
    public final int size() {
        return this.f9676a.length;
    }

    public C0868b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f9676a = objArr;
        this.f9677b = objArr2;
        this.f9678c = comparator;
    }
}
